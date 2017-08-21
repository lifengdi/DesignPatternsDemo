/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	Test.java   
 * @Package com.lifengdi.factory.abstractfactory    
 * @author  李锋镝
 * @date    2017年8月21日 下午3:27:10   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.factory.abstractfactory;

import com.lifengdi.factory.abstractfactory.factory.NoodleFactory;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	Test  
 * @Description 测试类
 * @author  李锋镝
 * @date    2017年8月21日 下午3:27:10   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class Test {

	public static void main(String[] args) {
		IFoodFactory factory = new NoodleFactory();
		IFood food = factory.produce();
		food.make();
	}
}

