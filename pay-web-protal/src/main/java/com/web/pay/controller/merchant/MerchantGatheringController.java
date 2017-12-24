package com.web.pay.controller.merchant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MerchantGatheringController {
	
	/**
	 * 商户支付记录查询
	 * @return
	 */
	@RequestMapping("merchantReceivePaymentOrder_listReceivePaymentOrder")
	public 	String listReceivePaymentOrder(){
		
		
		return "page/merchant/receivePayment/PaymentRecordList";
	}
	
	
	/**
	 * 商户转账记录查询
	 * @return
	 */
	@RequestMapping("merchantReceiveTransfer_listReceiveTransfer")
	public 	String listReceiveTransfer(){
		
		
		return "page/merchant/receiveTransfer/TransferList";
	}
	
	
	/**
	 * 商户支充值录查询
	 * @return
	 */
	@RequestMapping("merchantReceiveRecharge_listReceiveRechargeRecord")
	public 	String listReceiveRechargeRecord(){
		
		
		return "page/merchant/receiveRecharge/RechargeRecordList";
	}
}
