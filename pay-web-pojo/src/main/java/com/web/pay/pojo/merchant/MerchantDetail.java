package com.web.pay.pojo.merchant;

/**
 * 商户明细
 * 
 * @author Administrator
 * 
 */
public class MerchantDetail {
	//商户ID
	private Long merchantid;
	//邮箱
	private String email;
	//是否绑定邮箱
	private String isbindemailisbindemail;
	//地址
	private String adress;
	//电话
	private String telephone;
	//银行卡号
	private String bankcardnumber;
	//账户余额
	private String accountmoney;
	//身份证号码
	private String idcardno;
	//上次登陆时间
	private String lastlogintime;
	//支付密码
	private String paypassword;
	//账户积分
	private int integration;

	public Long getMerchantid() {
		return merchantid;
	}

	public void setMerchantid(Long merchantid) {
		this.merchantid = merchantid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsbindemailisbindemail() {
		return isbindemailisbindemail;
	}

	public void setIsbindemailisbindemail(String isbindemailisbindemail) {
		this.isbindemailisbindemail = isbindemailisbindemail;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getBankcardnumber() {
		return bankcardnumber;
	}

	public void setBankcardnumber(String bankcardnumber) {
		this.bankcardnumber = bankcardnumber;
	}

	public String getAccountmoney() {
		return accountmoney;
	}

	public void setAccountmoney(String accountmoney) {
		this.accountmoney = accountmoney;
	}

	public String getIdcardno() {
		return idcardno;
	}

	public void setIdcardno(String idcardno) {
		this.idcardno = idcardno;
	}

	public String getLastlogintime() {
		return lastlogintime;
	}

	public void setLastlogintime(String lastlogintime) {
		this.lastlogintime = lastlogintime;
	}

	public String getPaypassword() {
		return paypassword;
	}

	public void setPaypassword(String paypassword) {
		this.paypassword = paypassword;
	}

	public int getIntegration() {
		return integration;
	}

	public void setIntegration(int integration) {
		this.integration = integration;
	}

}
