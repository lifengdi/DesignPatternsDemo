package com.lifengdi.prototype;

/**
 * ԭ��ģʽ
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	PrototypeDemo  
 * @Description TODO(��һ�仰�������ļ���ʲô)   
 * @author  �����
 * @date    2017��9��28�� ����10:20:37   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved.
 */
public class PrototypeDemo {

	/**
	 * ԭ��ģʽ��Ҫ�ĵ����clone��������ǳ��¡�����¡֮�֣�
	 * <p>Title: clone</p>   
	 * <p>Description: </p>   
	 * @return
	 * @throws CloneNotSupportedException   
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new PrototypeDemo();
	}
	
	
}

