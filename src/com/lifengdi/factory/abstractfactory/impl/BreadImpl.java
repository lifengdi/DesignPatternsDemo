/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	BreadImpl.java   
 * @Package com.lifengdi.factory.abstractfactory.impl    
 * @author  �����
 * @date    2017��8��21�� ����3:22:13   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.factory.abstractfactory.impl;

import com.lifengdi.factory.abstractfactory.IFood;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	BreadImpl  
 * @Description ���
 * @author  �����
 * @date    2017��8��21�� ����3:22:13   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class BreadImpl implements IFood {

	/**   
	 * <p>Title: make</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.factory.abstractfactory.IFood#make()   
	 */
	@Override
	public void make() {
		System.out.println("��������ˡ�����");
	}

}

