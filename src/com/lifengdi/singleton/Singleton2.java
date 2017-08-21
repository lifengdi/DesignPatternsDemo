/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	Singleton2.java   
 * @Package com.lifengdi.singleton    
 * @author  李锋镝
 * @date    2017年8月21日 下午3:44:56   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.singleton;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	Singleton2  
 * @Description 饿汉单例模式，特点：加载类时慢，但是运行时获取对象的速度比较快，不用synchronized关键字即可实现线程安全
 * @author  李锋镝
 * @date    2017年8月21日 下午3:44:56   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class Singleton2 {
	
	private final static Singleton2 instance = new Singleton2();//饿汉模式，直接创建实例
	
	private Singleton2() {}
	
	public static Singleton2 getInstance() {
		//由于实例已经创建，这里直接返回即可
		return instance;
	}
}

