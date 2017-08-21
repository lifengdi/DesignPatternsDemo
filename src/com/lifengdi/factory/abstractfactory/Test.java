/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	Test.java   
 * @Package com.lifengdi.factory.abstractfactory    
 * @author  �����
 * @date    2017��8��21�� ����3:27:10   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.factory.abstractfactory;

import com.lifengdi.factory.abstractfactory.factory.NoodleFactory;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	Test  
 * @Description ������
 * @author  �����
 * @date    2017��8��21�� ����3:27:10   
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

