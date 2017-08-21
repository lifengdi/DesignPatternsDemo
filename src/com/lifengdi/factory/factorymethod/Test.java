/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	Test.java   
 * @Package com.lifengdi.factory.factorymethod    
 * @author  李锋镝
 * @date    2017年8月21日 上午11:34:59   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.factory.factorymethod;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	Test  
 * @Description 测试类
 * @author  李锋镝
 * @date    2017年8月21日 上午11:34:59   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class Test {

	public static void main(String[] args) {
		SendFactory sendFactory = new SendFactory();
		try {
			ISender iSender = sendFactory.produce("sms");
			iSender.send();
			sendFactory.produceMail().send();
			SendFactory.sProduceSms().send();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

