/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	SoldierBuilder.java   
 * @Package com.lifengdi.builder    
 * @author  �����
 * @date    2017��8��21�� ����4:47:15   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.builder;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	SoldierBuilder  
 * @Description ����ʿ��
 * @author  �����
 * @date    2017��8��21�� ����4:47:15   
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
		role.setSex("��");
	}

	/**   
	 * <p>Title: setClothes</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.builder.RoleBuilder#setClothes()   
	 */  
	@Override
	void setClothes() {
		role.setClothes("��װ");
	}

	/**   
	 * <p>Title: setHairStyle</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.builder.RoleBuilder#setHairStyle()   
	 */  
	@Override
	void setHairStyle() {
		role.setHairStyle("��ͷ");
	}

	/**   
	 * <p>Title: setFace</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.builder.RoleBuilder#setFace()   
	 */  
	@Override
	void setFace() {
		role.setFace("�Ͳ���");
	}

	/**   
	 * <p>Title: setOther</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.builder.RoleBuilder#setOther()   
	 */  
	@Override
	void setOther() {
		role.setOther("װ��AK-47��ѵ�����أ��ʺ��˺�ս��");
	}

	/**   
	 * <p>Title: setType</p>   
	 * <p>Description: </p>      
	 * @see com.lifengdi.builder.RoleBuilder#setType()   
	 */  
	@Override
	void setType() {
		role.setType("ʿ��");
	}
	
}

