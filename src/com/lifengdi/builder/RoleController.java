/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	RoleController.java   
 * @Package com.lifengdi.builder    
 * @author  李锋镝
 * @date    2017年8月21日 下午4:50:51   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.builder;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	RoleController  
 * @Description 角色控制器
 * @author  李锋镝
 * @date    2017年8月21日 下午4:50:51   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class RoleController {
	
	public Role construct(RoleBuilder builder) {
		builder.setSex();
		builder.setClothes();
		builder.setFace();
		builder.setHairStyle();
		builder.setOther();
		builder.setType();
		return builder.createRole();
	}
}

