package com.pay.service.merchant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.pay.dao.merchant.MerchantMapper;
import com.web.pay.pojo.merchant.Merchant;
import com.web.pay.service.merchant.MerchantLoginService;

@Service
public class MerchantLoginServiceImpl implements MerchantLoginService {
    
	@Autowired
	private MerchantMapper merchantLoginMapper;
	
	@Override
	public Merchant findByLoginName(String loginname, String loginpwd) {
		return merchantLoginMapper.findByLoginName(loginname, loginpwd);
	}

	@Override
	public Merchant queryMerchantInfo(String loginname) {
		return merchantLoginMapper.queryMerchantInfo(loginname);
	}

}
