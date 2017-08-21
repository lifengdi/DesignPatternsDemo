/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	RoleBuilder.java   
 * @Package com.lifengdi.builder    
 * @author  �����
 * @date    2017��8��21�� ����4:36:36   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.builder;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	RoleBuilder  
 * @Description ��ɫ�����߳�����
 * @author  �����
 * @date    2017��8��21�� ����4:36:36   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public abstract class RoleBuilder {
	
	protected Role role = new Role();
	
	abstract void setSex();
	abstract void setClothes();
	abstract void setHairStyle();
	abstract void setFace();
	abstract void setOther();
	abstract void setType();
	
	public Role createRole() {
		return role;
	}
	
}

