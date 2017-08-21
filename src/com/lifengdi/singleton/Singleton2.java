/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	Singleton2.java   
 * @Package com.lifengdi.singleton    
 * @author  �����
 * @date    2017��8��21�� ����3:44:56   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.singleton;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	Singleton2  
 * @Description ��������ģʽ���ص㣺������ʱ������������ʱ��ȡ������ٶȱȽϿ죬����synchronized�ؼ��ּ���ʵ���̰߳�ȫ
 * @author  �����
 * @date    2017��8��21�� ����3:44:56   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class Singleton2 {
	
	private final static Singleton2 instance = new Singleton2();//����ģʽ��ֱ�Ӵ���ʵ��
	
	private Singleton2() {}
	
	public static Singleton2 getInstance() {
		//����ʵ���Ѿ�����������ֱ�ӷ��ؼ���
		return instance;
	}
}

