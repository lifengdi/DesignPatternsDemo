package com.lifengdi.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 深克隆 All rights Reserved, Designed By www.lifengdi.com
 * 
 * @ClassName DeepCloneDemo
 * @Description TODO(用一句话描述该文件做什么)
 * @author 李锋镝
 * @date 2017年9月28日 下午10:30:24
 * @version v1.0.0
 * @Copyright 2017 www.lifengdi.com All rights reserved.
 */
public class DeepCloneDemo implements Cloneable {

	private String name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		DeepCloneDemo cloneDemo = (DeepCloneDemo) super.clone();
		cloneDemo.setName(name);//如果属性是对象 那么这个对象也需要重写clone方法
		return cloneDemo;
	}

	public Object deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(this);

		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		return ois.readObject();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
