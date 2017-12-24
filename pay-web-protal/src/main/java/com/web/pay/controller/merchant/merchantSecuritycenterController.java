package com.web.pay.controller.merchant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class merchantSecuritycenterController {
	
	/**
	 * 安全中心
	 * @return
	 */
	@RequestMapping("merchantsecuritycenter_securityCenter")
	public 	String securityCenter(){
		
		return "page/merchant/securityCenter/SecurityCenter";
	}

}
