/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	RoleBuilder.java   
 * @Package com.lifengdi.builder    
 * @author  李锋镝
 * @date    2017年8月21日 下午4:36:36   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.builder;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	RoleBuilder  
 * @Description 角色建造者抽象类
 * @author  李锋镝
 * @date    2017年8月21日 下午4:36:36   
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

