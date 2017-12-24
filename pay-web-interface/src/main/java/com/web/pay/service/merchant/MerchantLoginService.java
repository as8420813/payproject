package com.web.pay.service.merchant;

import com.web.pay.pojo.merchant.Merchant;

public interface MerchantLoginService {	
	public Merchant findByLoginName(String loginname,String loginpwd);
	
	public Merchant queryMerchantInfo(String loginname);

}
