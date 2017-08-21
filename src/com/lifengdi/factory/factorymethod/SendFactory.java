/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	SendFactory.java   
 * @Package com.lifengdi.factory.factorymethod    
 * @author  李锋镝
 * @date    2017年8月21日 上午11:30:57   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.factory.factorymethod;

import com.lifengdi.factory.factorymethod.impl.MailSenderImpl;
import com.lifengdi.factory.factorymethod.impl.SmsSenderImpl;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	SendFactory  
 * @Description 发送工厂类
 * @author  李锋镝
 * @date    2017年8月21日 上午11:30:57   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class SendFactory {
	
	/**
	 * 
	 * @Title 	produce   
	 * @Description 工厂生产产品。。。一条流水线生产了所有产品
	 * @author 李锋镝
	 * @date   2017年8月21日 上午11:37:09 
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public ISender produce(String type) throws Exception {
		ISender iSender = null;
		if ("sms".equals(type)) {
			iSender = new SmsSenderImpl();
		} else if ("mail".equals(type)) {
			iSender = new MailSenderImpl();
		} else {
			throw new Exception("类型错误:" + type);
		}
		return iSender;
	}
	
	/**
	 * 
	 * @Title 	produceSms   
	 * @Description 发送短信的流水线
	 * @author 李锋镝
	 * @date   2017年8月21日 上午11:39:22 
	 * @return
	 */
	public ISender produceSms() {
		return new SmsSenderImpl();
	}
	
	/**
	 * 
	 * @Title 	produceMail   
	 * @Description 发送邮件的流水线
	 * @author 李锋镝
	 * @date   2017年8月21日 上午11:39:27 
	 * @return
	 */
	public ISender produceMail() {
		return new MailSenderImpl();
	}
	
	/**
	 * 
	 * @Title 	sProduceSms   
	 * @Description 发送短信的流水线 这个厉害了 直接遥控
	 * @author 李锋镝
	 * @date   2017年8月21日 上午11:41:01 
	 * @return
	 */
	public static ISender sProduceSms() {
		return new SmsSenderImpl();
	}
	
	/**
	 * 
	 * @Title 	sProduceMail   
	 * @Description 发送邮件的流水线（遥控）
	 * @author 李锋镝
	 * @date   2017年8月21日 上午11:41:29 
	 * @return
	 */
	public static ISender sProduceMail() {
		return new MailSenderImpl();
	}
}

