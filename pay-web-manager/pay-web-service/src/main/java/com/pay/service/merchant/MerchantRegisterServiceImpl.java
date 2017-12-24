package com.pay.service.merchant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.pay.dao.merchant.MerchantMapper;
import com.web.pay.pojo.merchant.Merchant;
import com.web.pay.service.merchant.MerchantRegisterService;

@Service
public class MerchantRegisterServiceImpl implements MerchantRegisterService{
    @Autowired
    private MerchantMapper merchantMapper;
	@Override
	public int merchantRegister(Merchant merchant) {
		
		return merchantMapper.merchantRegister(merchant);
	}

}
