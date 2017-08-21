/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	Singleton.java   
 * @Package com.lifengdi.singleton    
 * @author  李锋镝
 * @date    2017年8月21日 下午3:35:30   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.singleton;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	Singleton  
 * @Description 单例模式-懒汉（延迟加载），特点：类加载时比较快，但在运行时获取实例的速度比较慢，需要synchronized关键字来实现线程安全
 * @author  李锋镝
 * @date    2017年8月21日 下午3:35:30   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class Singleton {
	private static Singleton instance = null;//懒汉的延迟加载
	
	/**
	 * 
	 * @Title  Singleton   
	 * @Description 单例模式需要私有化构造方法
	 * @author 李锋镝
	 * @date   2017年8月21日 下午3:41:46  
	 * @param    
	 * @throws
	 */
	private Singleton(){}
	
	/**
	 * 
	 * @Title 	init   
	 * @Description 初始化实例-延迟加载
	 * @author 李锋镝
	 * @date   2017年8月21日 下午3:41:10
	 */
	private static synchronized void init() {
		if (instance == null) {
			instance = new Singleton();
		}
	}
	
	public static Singleton getInstance() {
		//判断实例是否存在，存在则直接返回，不存在则新建
		if (instance == null) {
			init();
		}
		return instance;
	}
}

