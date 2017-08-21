package com.lifengdi.factory.factorymethod.impl;

import com.lifengdi.factory.factorymethod.ISender;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	MailSenderImpl  
 * @Description 发送邮件
 * @author  李锋镝
 * @date    2017年8月21日 上午11:27:46   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class MailSenderImpl implements ISender {

	/**   
	 * <p>Title: send</p>   
	 * <p>Description: 发送邮件</p>      
	 * @see com.lifengdi.factory.factorymethod.ISender#send()   
	 */
	@Override
	public void send() {
		System.out.println("发送邮件");
	}

}

