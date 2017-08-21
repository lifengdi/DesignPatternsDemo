/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @Title 	Role.java   
 * @Package com.lifengdi.builder    
 * @author  李锋镝
 * @date    2017年8月21日 下午4:32:11   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
package com.lifengdi.builder;

/**  
 * All rights Reserved, Designed By www.lifengdi.com
 * @ClassName	Role  
 * @Description 角色
 * @author  李锋镝
 * @date    2017年8月21日 下午4:32:11   
 * @version v1.0.0 
 * @Copyright 2017 www.lifengdi.com  All rights reserved. 
 */
public class Role {

	private String type;
	private String sex;
	private String clothes;
	private String hairStyle;
	private String face;
	private String other;
	
	
	/**  
	 * @Title  getType <BR>  
	 * @Description please write your description <BR>  
	 * @return String <BR>  
	 */
	public String getType() {
		return type;
	}
	/**  
	* @Title setType <BR>  
	* @Description please write your description <BR>  
	* @param type the type to set
	*/
	public void setType(String type) {
		this.type = type;
	}
	/**  
	 * @Title  getSex <BR>  
	 * @Description please write your description <BR>  
	 * @return String <BR>  
	 */
	public String getSex() {
		return sex;
	}
	/**  
	* @Title setSex <BR>  
	* @Description please write your description <BR>  
	* @param sex the sex to set
	*/
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**  
	 * @Title  getClothes <BR>  
	 * @Description please write your description <BR>  
	 * @return String <BR>  
	 */
	public String getClothes() {
		return clothes;
	}
	/**  
	* @Title setClothes <BR>  
	* @Description please write your description <BR>  
	* @param clothes the clothes to set
	*/
	public void setClothes(String clothes) {
		this.clothes = clothes;
	}
	/**  
	 * @Title  getHairStyle <BR>  
	 * @Description please write your description <BR>  
	 * @return String <BR>  
	 */
	public String getHairStyle() {
		return hairStyle;
	}
	/**  
	* @Title setHairStyle <BR>  
	* @Description please write your description <BR>  
	* @param hairStyle the hairStyle to set
	*/
	public void setHairStyle(String hairStyle) {
		this.hairStyle = hairStyle;
	}
	/**  
	 * @Title  getFace <BR>  
	 * @Description please write your description <BR>  
	 * @return String <BR>  
	 */
	public String getFace() {
		return face;
	}
	/**  
	* @Title setFace <BR>  
	* @Description please write your description <BR>  
	* @param face the face to set
	*/
	public void setFace(String face) {
		this.face = face;
	}
	/**  
	 * @Title  getOther <BR>  
	 * @Description please write your description <BR>  
	 * @return String <BR>  
	 */
	public String getOther() {
		return other;
	}
	/**  
	* @Title setOther <BR>  
	* @Description please write your description <BR>  
	* @param other the other to set
	*/
	public void setOther(String other) {
		this.other = other;
	}
	/**   
	 * <p>Title: toString</p>   
	 * <p>Description: </p>   
	 * @return   
	 * @see java.lang.Object#toString()   
	 */  
	@Override
	public String toString() {
		return "Role [type=" + type + ", sex=" + sex + ", clothes=" + clothes + ", hairStyle=" + hairStyle + ", face="
				+ face + ", other=" + other + "]";
	}
	
}

