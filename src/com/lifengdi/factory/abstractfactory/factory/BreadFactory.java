/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	BreadFactory.java   
 * @Package com.lifengdi.factory.abstractfactory.factory    
 * @author  �����
 * @date    2017��8��21�� ����3:26:41   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.factory.abstractfactory.factory;

import com.lifengdi.factory.abstractfactory.IFood;
import com.lifengdi.factory.abstractfactory.IFoodFactory;
import com.lifengdi.factory.abstractfactory.impl.BreadImpl;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	BreadFactory  
 * @Description �������
 * @author  �����
 * @date    2017��8��21�� ����3:26:41   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class BreadFactory implements IFoodFactory {

	/**   
	 * <p>Title: produce</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see com.lifengdi.factory.abstractfactory.IFoodFactory#produce()   
	 */
	@Override
	public IFood produce() {
		return new BreadImpl();
	}

}

