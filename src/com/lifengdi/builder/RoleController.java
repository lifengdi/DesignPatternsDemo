/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	RoleController.java   
 * @Package com.lifengdi.builder    
 * @author  �����
 * @date    2017��8��21�� ����4:50:51   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.builder;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	RoleController  
 * @Description ��ɫ������
 * @author  �����
 * @date    2017��8��21�� ����4:50:51   
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

