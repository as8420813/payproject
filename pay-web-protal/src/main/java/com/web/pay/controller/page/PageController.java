package com.web.pay.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	// 跳转客户服务页面
	@RequestMapping("article_gwService")
	public String article_gwService() {
		return "page/merchant/article/gwService";

	}

	// 跳转产品页面
	@RequestMapping("article_listArticle")
	public String article_listArticle() {
		return "page/merchant/article/ArticleList";

	}

	// 跳转安全中心页面
	@RequestMapping("article_securityCenter")
	public String article_securityCenter() {
		return "page/merchant/article/securityCenter";

	}

	// 客服中心
	@RequestMapping("article_consultCenter")
	public String article_consultCenter() {
		return "page/merchant/article/consultCenter";

	}

	// 解绑邮箱
	@RequestMapping("merchantemailbind_bindingEmailUI")
	public String bindingEmailUI() {
		return "page/merchant/emailBind/BindingEmail";

	}

	// 解绑手机
	@RequestMapping("merchantmobilebind_bindingMobileUI")
	public String bindingMobileUI() {
		return "page/merchant/mobileBind/BindingMobile";

	}

	// 解绑手机
	@RequestMapping("merchantmobilebind_bindingMobile")
	public String bindingMobile() {
		return "page/merchant/mobileBind/BindingMobileSuccess";

	}

	// 解绑手机
	@RequestMapping("merchantmobilebind_unbundlingMobileUI")
	public String unbundlingMobileUI() {
		return "page/merchant/mobileBind/UnbundlingMobileUI";

	}

	// 解绑手机
	@RequestMapping("merchantmobilebind_unbundlingMobile")
	public String unbundlingMobile() {
		return "page/merchant/mobileBind/UnbundlingMobileSuccess";

	}

	/**
	 * 跳转至登陆页面
	 * 
	 * @return
	 */
	@RequestMapping("login_loginUI")
	public String login_loginPage() {
		return "page/login";
	}

	@RequestMapping("merchantRegister")
	public String merchantRegister() {
		return "page/merchant/register/LoginNameCheck";
	}

	@RequestMapping("memberRegister")
	public String memberRegister() {
		return "page/member/register/LoginNameCheck";
	}

	@RequestMapping("merchantLookForLoginPwd_loginPwdCheckLoginNameUI")
	public String loginPwdCheckLoginNameUI() {
		return "page/merchant/lookForLoginPwd/LoginPwdCheckLoginName";
	}

	@RequestMapping("merchantLookForLoginPwd_loginPwdCheckLoginName")
	public String loginPwdCheckLoginName() {
		return "page/merchant/lookForLoginPwd/LoginPwdListWay";
	}

	@RequestMapping("merchantLookForLoginPwd_loginPwdSendQuestionCheck")
	public String loginPwdSendQuestionCheck() {

		return "page/merchant/lookForLoginPwd/LoginPwdListQuestionWay";
	}

	@RequestMapping("merchantLookForLoginPwd_loginPwdSureQuestionCheck")
	public String loginPwdSureQuestionCheck() {

		return "page/merchant/lookForLoginPwd/LoginPwdEdit";
	}

	@RequestMapping("merchantLookForLoginPwd_editLoginPwd")
	public String editLoginPwd() {

		return "page/merchant/lookForLoginPwd/LoginPwdLookForSuccess";
	}
	
	@RequestMapping("posMerchant_agentMerchantList")
	public String listMerchant(){
	
	
	return "page/merchant/merchantList";
	}

}
