package com.web.pay.controller.merchant;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.pay.pojo.merchant.Merchant;
import com.web.pay.service.merchant.MerchantLoginService;
import com.web.pay.service.merchant.MerchantRegisterService;

/**
 * 前台系统登陆
 * 
 * @author feiyu
 * 
 */
@Controller
public class MerchantLoginController {

	public static final String MEMBERLOGON_SUCESS = "page/merchant/account/AccountView";
	public static final String MERCHANTLOGON_SUCESS = "page/merchant/account/AccountHistoryList";
	public static final String LOGON_ERROR = "page/login";

	@Autowired
	private MerchantLoginService merchantLoginService;

	@Autowired
	private MerchantRegisterService merchantRegisterService;

	/**
	 * 登陆验证
	 * 
	 * @param loginName
	 * @param loginPwd
	 * @param model
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("login_operatorLogin")
	public String login_operatorLogin(String loginname, String loginpwd,
			String logintype, Model model, HttpSession session) {

		String returnview = null;
		if (loginname != null && loginpwd != null) {

			Merchant merchant = merchantLoginService.findByLoginName(loginname,loginpwd);
			if (merchant != null) {

				model.addAttribute("merchant", merchant);
				// 将用户存如session中
				session.setAttribute("user", loginname);

				if (logintype.equals("member")) {
					returnview = MEMBERLOGON_SUCESS;
				} else {
					returnview = MERCHANTLOGON_SUCESS;
				}

			}

		} else {
			returnview = LOGON_ERROR;

		}

		return returnview;

	}

	@Autowired
	private JmsTemplate jmsTemplate;

	// 注册 发送邮箱
	@RequestMapping("validateRegister")
	public String register(String loginName, String loginPwd) {

		Merchant merchant = new Merchant();
		merchant.setLoginname(loginName);
		merchant.setLoginPwd(loginPwd);
		merchantRegisterService.merchantRegister(merchant);
		final String em = loginName;
		// //发送消息
		// jmsTemplate.send(new MessageCreator() {
		// public Message createMessage(Session session) throws JMSException {
		// return session.createTextMessage(em);
		// }
		// });

		return "page/member/register/CheckedMailSent";
	}

}
