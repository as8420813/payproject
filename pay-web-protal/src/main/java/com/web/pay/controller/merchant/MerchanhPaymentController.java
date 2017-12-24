package com.web.pay.controller.merchant;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商户收款有关
 * @author Administrator
 *
 */
@Controller
public class MerchanhPaymentController {
	
	
	/**
	 * 商户付款支付记录查询
	 * @return
	 */
	@RequestMapping("merchantPayPaymentOrder_listPaymentOrder")
	public 	String listPaymentOrder(){
		
		
		return "page/merchant/payPayment/PaymentOrderList";
	}
	
	/**
	 * 商户转账支付记录查询
	 * @return
	 */
	@RequestMapping("merchantTransferRecord_listTransfer")
	public 	String listTransfer(){
		
		
		return "page/merchant/payPayment/TransferList";
	}
	
	

}
