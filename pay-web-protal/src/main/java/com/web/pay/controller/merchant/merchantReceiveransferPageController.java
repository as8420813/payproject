package com.web.pay.controller.merchant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class merchantReceiveransferPageController {
	
	/**
	 * 充值
	 * @return
	 */
	@RequestMapping("merchantReceiveRecharge_ransferPage")
	public 	String ransferPage(){
		
		
		return "page/merchant/receiveTransfer/TransferPage";
	}


}
