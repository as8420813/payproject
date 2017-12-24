package com.web.pay.controller.check;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.pay.pojo.merchant.Merchant;
import com.web.pay.service.merchant.MerchantLoginService;

/**
 * 用于验证信息
 * @author Administrator
 *
 */
@Controller
public class MerchantCheckController {
	@Autowired
	private MerchantLoginService merchantLoginService;
	
	@ResponseBody
	@RequestMapping("checkCertification")
	public Merchant queryByLoginname(String loginname){
		
		Merchant merchant=new Merchant();
		merchant=merchantLoginService.queryMerchantInfo(loginname);
		return merchant;
		
	}
	

}
