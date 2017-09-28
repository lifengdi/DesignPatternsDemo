package com.lifengdi.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���¡ All rights Reserved, Designed By www.lifengdi.com
 * 
 * @ClassName DeepCloneDemo
 * @Description TODO(��һ�仰�������ļ���ʲô)
 * @author �����
 * @date 2017��9��28�� ����10:30:24
 * @version v1.0.0
 * @Copyright 2017 www.lifengdi.com All rights reserved.
 */
public class DeepCloneDemo implements Cloneable {

	private String name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		DeepCloneDemo cloneDemo = (DeepCloneDemo) super.clone();
		cloneDemo.setName(name);//��������Ƕ��� ��ô�������Ҳ��Ҫ��дclone����
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
