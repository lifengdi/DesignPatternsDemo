package com.lifengdi.prototype;

/**
 * 原型模式
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	PrototypeDemo  
 * @Description TODO(用一句话描述该文件做什么)   
 * @author  李锋镝
 * @date    2017年9月28日 下午10:20:37   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved.
 */
public class PrototypeDemo {

	/**
	 * 原型模式主要的点就是clone方法，有浅克隆和深克隆之分，
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

