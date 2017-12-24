package com.web.pay.controller.merchant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MerchantKeyUIController {
	
	
	
	/**
	 * 	操作员管理
	 * @return
	 */
	@RequestMapping("merchantKey_showMerchantKeyUI")
	public 	String showMerchantKeyUI(){
		
		return "page/merchant/merchantKey/MerchantKeyShow";
	}

}
