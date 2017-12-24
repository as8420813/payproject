<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/page/include/taglib.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>商户账户管理</title>
<%@include file="/page/include/headScript.jsp"%>


<script type="text/javascript">

		    //根据用户状态是否可转账
				function accountStatus() {

					if ("${account.status}" != "100") {
						var message = "账户为冻结状态，不能转账";
						ChangeDiv(message);
					} else {

						window.location.href = "merchantReceiveTransfer_ransferPage.action";
					}
				}


			 //登录密码修改提示
			function logPwdEditHint() {
				window.location.href = 'merchantpwdedit_editLoginPwdUI.action';
			}
			 //弹出隐藏层
			function ChangeDiv(message) {
				var alertPwdDays = "${alertPwdDays}";
				var pwd_edit_limit_time = "${pwd_edit_limit_time}";
				if (alertPwdDays > pwd_edit_limit_time) {
					var text = "您已经有<font class='markRed'>"+alertPwdDays+"</font>天没有修改密码了，点击确定修改密码";
					myAlert(text,350,200,function(){
					logPwdEditHint();
					});
				}
				if (message != '' && message != null && message != undefined) {
					myAlert(message,350,250);
				}
			}

			$(document).ready(function () {
				
				var loginname=$("#log").val();
				$.ajax({
					url:"checkCertification.action",
					data:{"loginname":loginname},
					type: 'POST',
					success: function(json){
						if(json.iscertification=="0"){
							setTimeout(function (){
							ShowDiv('MyDiv','fade');},3000);
						}
						
					}

					
				});

				//联系客服动画
				var $this=$('.scrollBoxWrap');
				$this.hover(function(){
   		  	timer = setTimeout(function(){
        	$this.animate({'width':238},'500');
    			},500);
				},function(){
    			clearTimeout(timer);
    			$this.animate({'width':29},'300');
				});

			//页面分类
			setPageType('.mer-account', '.mer-account-info ');
				$('.ada-transfer').bind('click', function () {
					accountStatus();
				});

			//初始化弹出框。
			ChangeDiv();

			});
			
			function checkCertification(){
				CloseDiv('MyDiv','fade');
				window.location="merchantinfo_viewMerchantCheck.action";
				
				
			}
		</script>


</head>
<c:choose>
	<c:when test="${USE_SECURITYCENTER }">
		<body onload="getCurrentUserCA('${CURRENT_SN_LIST}')">
	</c:when>
	<c:otherwise>
		<body>
	</c:otherwise>
</c:choose>
<!-- 切删除改div,用于加载CA	控件 -->
<div id="FakeCryptoAgent"></div>
<jsp:include page="/page/include/TopMenuMerchant.jsp"></jsp:include>
<div class="shell">
	<label> 【公告】</label>
	<div id="scrollbox">
		<c:forEach items="${recordListNotice}" var="notice">
			<a href="article_viewArticle.action?id=${notice.id}">${notice.title}&nbsp;&nbsp;</a>
		</c:forEach>
	</div>
</div>
<div class='scrollBoxWrap'>
	<div class="mainbox">
		<div class='scrollBox'>
			<p>
				<i class="iconfont">&#xe601;</i>联系客服
			</p>
		</div>
		<div class='pWrap'>
			<img src="<%=path%>/statics/themes/default/images/conetionIMG1.png" />
			<div class="cont">
				<p>客服电话：${COMPANY_TEL }</p>
<p class="word-break">客服邮箱：${COMPANY_EMAIL }</p>
			</div>
		</div>
	</div>
</div>

<div class="bd-container ">
	<div class="greetview">
		<div class="panelbox clearfix">
			<div class="panelbox-sm panel-special panel-special-blue">
				<div class="title">
					<span class="png">预</span> 留信息
				</div>
				<input type="hidden" id="log"  value="${user}"/>
				
				<input type="hidden" id="loginname"  value="${merchant}"/>
				<div class="txt">
					${currentUser.greeting}
					<c:if test="${empty currentUser.greeting }">
						<font color="red"> 您还未设置预留信息哦！</font>
						<a style="color: blue;" href="merreservationInfo_editMerchantGreetingUI.action">进行设置</a>
					</c:if>
				</div>
			</div>
			<div class="panelbox-sm  panel-special panel-special-org mleft15">
				<div class="title">
					<span class="png">账</span> 户余额
				</div>
				<div class="txt">
					<p>
						<label> 可用余额：</label> <span class="num"><fmt:formatNumber
								value="${availableBalance}" pattern="#0.00" /> </span>元
					</p>
					<p>
						<label> 不可用余额：</label><span class="minor"><fmt:formatNumber
								value="${account.unBalance}" pattern="#0.00" /> </span>元
					</p>
				</div>
			</div>
			<div class="panelbox-mid">
				<div class=" account-fn panel-special panel-special-gray">
					<div class="title">
						<span class="png">账</span> 户功能
					</div>
					<div class="txt txtreset">
						<a class="search "
							href="merchantaccount_listAccountHistory.action">账户明细查询</a>
					</div>
					<div class="txt">
						<ul>
							<z:permission value="Account:Account:Recharge">
								<li><c:if
										test="${rechargeStatus==PublicStatusEnum.ACTIVE.value }">
										<a class="png rechage"
											href="merchantReceiveRecharge_rechargePage.action">充值</a>
									</c:if></li>
							</z:permission>
							<z:permission value="Account:Account:Transfer">
								<c:if test="${transferStatus==PublicStatusEnum.ACTIVE.value }">
									<li class="mleft15 png"><a class="transfers ada-transfer"
										href="merchantReceiveRecharge_ransferPage.action">转账</a></li>
								</c:if>
							</z:permission>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="h15"></div>
			<div class="panelbox-sm minheight panel-special panel-special-red">
				<div class="title">
					<span class="png">积</span>分
				</div>
				<div class="txt">
					<p>
						<span class="minor">${loginScore}</span>分
					</p>
				</div>
			</div>
			<div class="panelbox-big minheight panel-special panel-special-green">
				<div class="title">
					<span class="png">账</span>户安全
				</div>
				<div class="txt">
					<div style='width:260px;float:left;'>
						<p>
							<strong>最后登录时间：</strong>
							<fmt:formatDate value="${userOperator.lastLoginTime}"
								pattern="yyyy-MM-dd HH:mm:ss" />
						</p>
						<p>
							<strong>账户状态：</strong> <span> <c:forEach
									items="${AccountStatusEnumList }" var="accountStatusEnum">
									<c:if test="${accountStatusEnum.value== account.status}">${accountStatusEnum.desc}</c:if>
								</c:forEach> </span>
						</p>
					</div>
					<ul class="authen" style='float:left;'>
						<c:choose>
							<c:when
								test="${userInfo.isRealNameAuth == PublicStatusEnum.ACTIVE.value}">
								<li class=" png IMG_link1B"></li>
							</c:when>
							<c:otherwise>
								<li class=" png IMG_link1A"></li>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when
								test="${userInfo.isMobileAuth == PublicStatusEnum.ACTIVE.value}">
								<li class="png IMG_link2B mleft15"></li>
							</c:when>
							<c:otherwise>
								<li class="png IMG_link2A mleft15"></li>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when
								test="${userInfo.isEmailAuth == PublicStatusEnum.ACTIVE.value}">
								<li class="png IMG_link3B mleft15"></li>
							</c:when>
							<c:otherwise>
								<li class="png IMG_link3A mleft15"></li>
							</c:otherwise>
						</c:choose>


					</ul>
					<div class="fixedbtn fr mtop15">
						<a class="btn btn-suc"
							href="merchantsecuritycenter_securityCenter.action">进入安全中心</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div id="fade" class="black_overlay"></div>
		<div id="MyDiv" class="skipTS">
			<div class="top">
				<div class="skipTit">提 示 信 息</div>
				<div class="closebtn">
					<img src="<%=path%>/statics/themes/default/images/closebtn2.png" onclick="CloseDiv('MyDiv','fade')" />
				</div>
			</div>
			<div class="maincont">
				<div class="content1">
					<div class="tit2">商户实名认证信息</div>
					<p style="padding: top">
						您尚未进行实名认证,无法进行转账付款等业务操作
					</p>
				</div>
			</div>
      <div class='btn-position'>
        <input class="btn btn-primary agreenBtn" id="Button5" type="button" onclick="CloseDiv('MyDiv','fade')" value="以后提醒我" />
      </div>
      
      <div class='btn-position'>
        <input class="btn btn-primary agreenBtn" id="Button5" type="button" onclick="checkCertification()" value="现在去认证" />
      </div>
		</div>
<jsp:include page="../../foot.jsp" />
</body>
</html>

<script type="text/javascript">

    $(document).ready(function() {
        setPageType('.men-account', '.men-account-info ');
    })


    $('.panel-special').hover(function() {
        var color = $(this).css("border-top-color");
        $(this).css('border-color', color);
        $(this).addClass('panel-special-shadow');
        $(this).animate({
            left: '-5px',
            top: '-5px'
        });

    }, function() {
        var color = $(this).css("border-top-color");
        $(this).css('border-color', '#ddd');
        $(this).css('border-top-color', color);
        $(this).removeClass('panel-special-shadow');
        $(this).animate({
            left: '0px',
            top: '0'
        });

    })


    var c, _ = Function;
    with (o = document.getElementById("scrollbox")) { innerHTML += innerHTML; onmouseover = _("c=1"); onmouseout = _("c=0"); }
    (F = _("if(#%30||!c)#++,#%=o.scrollHeight>>1;setTimeout(F,#%30?10:1500);".replace(/#/g, "o.scrollTop")))();



</script>
