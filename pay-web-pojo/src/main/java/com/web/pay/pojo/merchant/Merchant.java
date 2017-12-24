package com.web.pay.pojo.merchant;

import java.io.Serializable;

/**
 * �̻�
 * @author Administrator
 *
 */

public class Merchant implements Serializable{
	
	private static final long serialVersionUID = -8354418621454693473L;
	//商户ID
	private Long merchantId;
	//登陆名称
	private String loginname;
	//登陆密码
	private String loginpwd;
	//商户类型
	private String merchantType;
	//商户全称
	private String merchantName;
	//商户状态 
	private String merchantStatus;
	//是否会员
	private String isMember;
	//创建时间
	private String createTime;
	//是否实名认证
	private String iscertification;
	
	public long getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}
	
	public String getLoginPwd() {
		return loginpwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginpwd = loginPwd;
	}
	public String getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantStatus() {
		return merchantStatus;
	}
	public void setMerchantStatus(String merchantStatus) {
		this.merchantStatus = merchantStatus;
	}
	public String getIsMember() {
		return isMember;
	}
	public void setIsMember(String isMember) {
		this.isMember = isMember;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getIscertification() {
		return iscertification;
	}
	public void setIscertification(String iscertification) {
		this.iscertification = iscertification;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

}
