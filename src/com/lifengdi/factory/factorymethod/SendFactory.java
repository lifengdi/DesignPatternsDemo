/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	SendFactory.java   
 * @Package com.lifengdi.factory.factorymethod    
 * @author  �����
 * @date    2017��8��21�� ����11:30:57   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.factory.factorymethod;

import com.lifengdi.factory.factorymethod.impl.MailSenderImpl;
import com.lifengdi.factory.factorymethod.impl.SmsSenderImpl;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	SendFactory  
 * @Description ���͹�����
 * @author  �����
 * @date    2017��8��21�� ����11:30:57   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class SendFactory {
	
	/**
	 * 
	 * @Title 	produce   
	 * @Description ����������Ʒ������һ����ˮ�����������в�Ʒ
	 * @author �����
	 * @date   2017��8��21�� ����11:37:09 
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
			throw new Exception("���ʹ���:" + type);
		}
		return iSender;
	}
	
	/**
	 * 
	 * @Title 	produceSms   
	 * @Description ���Ͷ��ŵ���ˮ��
	 * @author �����
	 * @date   2017��8��21�� ����11:39:22 
	 * @return
	 */
	public ISender produceSms() {
		return new SmsSenderImpl();
	}
	
	/**
	 * 
	 * @Title 	produceMail   
	 * @Description �����ʼ�����ˮ��
	 * @author �����
	 * @date   2017��8��21�� ����11:39:27 
	 * @return
	 */
	public ISender produceMail() {
		return new MailSenderImpl();
	}
	
	/**
	 * 
	 * @Title 	sProduceSms   
	 * @Description ���Ͷ��ŵ���ˮ�� ��������� ֱ��ң��
	 * @author �����
	 * @date   2017��8��21�� ����11:41:01 
	 * @return
	 */
	public static ISender sProduceSms() {
		return new SmsSenderImpl();
	}
	
	/**
	 * 
	 * @Title 	sProduceMail   
	 * @Description �����ʼ�����ˮ�ߣ�ң�أ�
	 * @author �����
	 * @date   2017��8��21�� ����11:41:29 
	 * @return
	 */
	public static ISender sProduceMail() {
		return new MailSenderImpl();
	}
}

