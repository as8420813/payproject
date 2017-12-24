package com.web.pay.controller.merchant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MerchantOperatorController {
	
	
	/**
	 * 	操作员管理
	 * @return
	 */
	@RequestMapping("permission_listMerchantOperator")
	public 	String listMerchantOperator(){
		
		return "page/merchant/permissionManager/MerchantOperatorList";
	}


}
