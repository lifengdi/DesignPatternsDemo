/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	BreadImpl.java   
 * @Package com.lifengdi.factory.abstractfactory.impl    
 * @author  李锋镝
 * @date    2017年8月21日 下午3:22:13   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.factory.abstractfactory.impl;

import com.lifengdi.factory.abstractfactory.IFood;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	BreadImpl  
 * @Description 面包
 * @author  李锋镝
 * @date    2017年8月21日 下午3:22:13   
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
		System.out.println("面包做好了。。。");
	}

}

