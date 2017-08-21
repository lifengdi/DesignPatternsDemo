/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	SmsSenderImpl.java   
 * @Package com.lifengdi.factory.factorymethod.impl    
 * @author  李锋镝
 * @date    2017年8月21日 上午11:29:58   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.factory.factorymethod.impl;

import com.lifengdi.factory.factorymethod.ISender;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	SmsSenderImpl  
 * @Description 发送短信
 * @author  李锋镝
 * @date    2017年8月21日 上午11:29:58   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class SmsSenderImpl implements ISender {

	/**   
	 * <p>Title: send</p>   
	 * <p>Description: 发送短信</p>      
	 * @see com.lifengdi.factory.factorymethod.ISender#send()   
	 */
	@Override
	public void send() {
		System.out.println("发送短信");
	}

}

