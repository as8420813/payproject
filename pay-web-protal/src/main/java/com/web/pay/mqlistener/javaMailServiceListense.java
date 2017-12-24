package com.web.pay.mqlistener;


import javax.annotation.Resource;  
import javax.jms.JMSException;  
import javax.jms.Message;  
import javax.jms.MessageListener;  
  
import org.apache.activemq.command.ActiveMQTextMessage;  
import org.springframework.mail.SimpleMailMessage;  
import org.springframework.mail.javamail.JavaMailSenderImpl;   
 
  
public class javaMailServiceListense implements MessageListener{  
      
    //注入邮件发送相关的对象  
    @Resource  
    private SimpleMailMessage mailMessage;//邮件  
      
    @Resource  
    private JavaMailSenderImpl mailSender;//邮件发送对象，专用于发送邮件  
  
    public void onMessage(Message message) {  
          
//       // System.out.println("mq 消费服务了");  
//        ActiveMQTextMessage amt = (ActiveMQTextMessage)message;
//       
//        try {  
//            String email = amt.getText();  
//            System.out.println("已发送验证至您的邮箱"+amt.getText()+"请注意查收！");  
////            mailMessage.setTo(email);//接收者的设置   
////            mailMessage.setSubject("新员工入职账户信息提醒1");//设置主题  
////            mailMessage.setText("您好，欢迎您加入本集团，您在公司的用户名1:");  
////            mailSender.send(mailMessage);//发送邮件  
//        } catch (JMSException e) {  
//            e.printStackTrace();  
//        }  
//    }  
}  }