/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	Test.java   
 * @Package com.lifengdi.builder    
 * @author  李锋镝
 * @date    2017年8月21日 下午4:53:46   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.builder;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	Test  
 * @Description 测试类
 * @author  李锋镝
 * @date    2017年8月21日 下午4:53:46   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class Test {
	public static void main(String[] args) {
		RoleBuilder builder = new SoldierBuilder();
		RoleController controller = new RoleController();
		Role role = controller.construct(builder);
		System.out.println(role);
	}
}

