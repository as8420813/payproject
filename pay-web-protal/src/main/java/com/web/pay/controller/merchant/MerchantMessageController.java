package com.web.pay.controller.merchant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MerchantMessageController {
	
	/**
	 * 商户信息
	 * @return
	 */
	@RequestMapping("merchantinfo_viewMerchant")
	public 	String viewMerchant(){
		return "page/merchant/merchantInfo/MerchantView";
	}
	@RequestMapping("merchantinfo_viewMerchantCheck")
	public 	String viewMerchantCheck(){
		return "page/merchant/merchantInfo/MerchantCheckView";
	}
	
	/**
	 * 修改商户账户信息
	 * @return
	 */
	@RequestMapping("merchantaccount_viewAccount")
	public 	String viewAccount(){
		
		return "page/merchant/account/AccountView";
	}
	
	/**
	 * 商户账户明细查询
	 * @return
	 */
	@RequestMapping("merchantaccount_listAccountHistory")
	public 	String listAccountHistory(){
		return "page/merchant/account/AccountHistoryList";
	}
	
	
	/**
	 * 修改商户账户信息
	 * @return
	 */
	@RequestMapping("merchantinfo_editMerchantUI")
	public 	String editMerchantUI(){
		
		return "page/merchant/merchantInfo/MerchantEdit";
	}
	
	/**
	 * 修改商户账户信息
	 * @return
	 */
	@RequestMapping("merreservationInfo_editMerchantGreetingUI")
	public 	String editMerchantGreetingUI(){
		
		return "page/merchant/greeting/MerchantGreetingEdit";
	}
	
	

}
