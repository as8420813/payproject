package com.web.pay.controller.operator;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OperatorLoginController {
	
	@RequestMapping("login_loginPage")
	public String login_loginPage(){
		return "page/login";
	}
	
	@RequestMapping("login_operatorLogin")
	public String login_operatorLogin(String loginName,
			String loginPwd,
			Model model,
			HttpSession session){
				return "page/index";

}
	
	@RequestMapping("posMerchant_agentMerchantList")
	public String listMerchant(){
	
	
	return "page/merchant/merchantList";
	}
}