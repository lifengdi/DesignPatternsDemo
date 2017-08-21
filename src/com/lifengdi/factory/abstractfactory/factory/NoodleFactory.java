/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	NoodleFactory.java   
 * @Package com.lifengdi.factory.abstractfactory.factory    
 * @author  李锋镝
 * @date    2017年8月21日 下午3:24:38   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.factory.abstractfactory.factory;

import com.lifengdi.factory.abstractfactory.IFood;
import com.lifengdi.factory.abstractfactory.IFoodFactory;
import com.lifengdi.factory.abstractfactory.impl.NoodleImpl;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	NoodleFactory  
 * @Description 面条工厂
 * @author  李锋镝
 * @date    2017年8月21日 下午3:24:38   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class NoodleFactory implements IFoodFactory{

	/**   
	 * <p>Title: produce</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see com.lifengdi.factory.abstractfactory.IFoodFactory#produce()   
	 */  
	@Override
	public IFood produce() {
		return new NoodleImpl();
	}
	
}

