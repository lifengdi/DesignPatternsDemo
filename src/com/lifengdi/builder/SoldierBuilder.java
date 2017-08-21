/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	SoldierBuilder.java   
 * @Package com.lifengdi.builder    
 * @author  李锋镝
 * @date    2017年8月21日 下午4:47:15   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.builder;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	SoldierBuilder  
 * @Description 创建士兵
 * @author  李锋镝
 * @date    2017年8月21日 下午4:47:15   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class SoldierBuilder extends RoleBuilder {

	/**   
	 * <p>Title: setSex</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.builder.RoleBuilder#setSex()   
	 */  
	@Override
	void setSex() {
		role.setSex("男");
	}

	/**   
	 * <p>Title: setClothes</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.builder.RoleBuilder#setClothes()   
	 */  
	@Override
	void setClothes() {
		role.setClothes("军装");
	}

	/**   
	 * <p>Title: setHairStyle</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.builder.RoleBuilder#setHairStyle()   
	 */  
	@Override
	void setHairStyle() {
		role.setHairStyle("寸头");
	}

	/**   
	 * <p>Title: setFace</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.builder.RoleBuilder#setFace()   
	 */  
	@Override
	void setFace() {
		role.setFace("油彩脸");
	}

	/**   
	 * <p>Title: setOther</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.builder.RoleBuilder#setOther()   
	 */  
	@Override
	void setOther() {
		role.setOther("装备AK-47，训练有素，适合人海战术");
	}

	/**   
	 * <p>Title: setType</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.builder.RoleBuilder#setType()   
	 */  
	@Override
	void setType() {
		role.setType("士兵");
	}
	
}

