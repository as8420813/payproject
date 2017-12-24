package com.web.pay.dao.merchant;

import com.web.pay.pojo.merchant.Merchant;

public interface MerchantMapper {
	
	public Merchant findByLoginName(String loginname,String loginpwd);
	
	public int merchantRegister(Merchant merchant);
	
	public Merchant queryMerchantInfo(String loginname);
	
	

}
