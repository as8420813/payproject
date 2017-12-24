package com.web.pay.service.merchantdetail;

import com.web.pay.dao.merchant.MerchantDetailMapper;

public interface MerchantDetailService {
	public MerchantDetailMapper findByLoginname(String loginname);

}
