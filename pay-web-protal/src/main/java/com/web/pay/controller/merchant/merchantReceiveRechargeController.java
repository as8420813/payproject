package com.web.pay.controller.merchant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户充值
 * @author Administrator
 *
 */
@Controller
public class merchantReceiveRechargeController {
	
	
	
	/**
	 * 充值
	 * @return
	 */
	@RequestMapping("merchantReceiveRecharge_rechargePage")
	public 	String rechargePage(){
		
		
		return "page/merchant/receiveRecharge/Recharge";
	}

}
