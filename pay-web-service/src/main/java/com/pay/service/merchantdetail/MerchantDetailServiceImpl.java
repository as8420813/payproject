package com.pay.service.merchantdetail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.pay.dao.merchant.MerchantDetailMapper;
import com.web.pay.service.merchantdetail.MerchantDetailService;

@Service
public class MerchantDetailServiceImpl implements MerchantDetailService {
    
	@Autowired
	private MerchantDetailMapper merchantDetailMapper;
	@Override
	public MerchantDetailMapper findByLoginname(String loginname) {
		return merchantDetailMapper.findByLoginname(loginname);
	}

}
