/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	SmsSenderImpl.java   
 * @Package com.lifengdi.factory.factorymethod.impl    
 * @author  �����
 * @date    2017��8��21�� ����11:29:58   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.factory.factorymethod.impl;

import com.lifengdi.factory.factorymethod.ISender;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	SmsSenderImpl  
 * @Description ���Ͷ���
 * @author  �����
 * @date    2017��8��21�� ����11:29:58   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class SmsSenderImpl implements ISender {

	/**   
	 * <p>Title: send</p>   
	 * <p>Description: ���Ͷ���</p>      
	 * @see com.lifengdi.factory.factorymethod.ISender#send()   
	 */
	@Override
	public void send() {
		System.out.println("���Ͷ���");
	}

}

