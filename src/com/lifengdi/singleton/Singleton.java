/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	Singleton.java   
 * @Package com.lifengdi.singleton    
 * @author  �����
 * @date    2017��8��21�� ����3:35:30   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.singleton;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	Singleton  
 * @Description ����ģʽ-�������ӳټ��أ����ص㣺�����ʱ�ȽϿ죬��������ʱ��ȡʵ�����ٶȱȽ�������Ҫsynchronized�ؼ�����ʵ���̰߳�ȫ
 * @author  �����
 * @date    2017��8��21�� ����3:35:30   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class Singleton {
	private static Singleton instance = null;//�������ӳټ���
	
	/**
	 * 
	 * @Title  Singleton   
	 * @Description ����ģʽ��Ҫ˽�л����췽��
	 * @author �����
	 * @date   2017��8��21�� ����3:41:46  
	 * @param    
	 * @throws
	 */
	private Singleton(){}
	
	/**
	 * 
	 * @Title 	init   
	 * @Description ��ʼ��ʵ��-�ӳټ���
	 * @author �����
	 * @date   2017��8��21�� ����3:41:10
	 */
	private static synchronized void init() {
		if (instance == null) {
			instance = new Singleton();
		}
	}
	
	public static Singleton getInstance() {
		//�ж�ʵ���Ƿ���ڣ�������ֱ�ӷ��أ����������½�
		if (instance == null) {
			init();
		}
		return instance;
	}
}

