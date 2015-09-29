package com.xiaoyuhang;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月18日 下午3:24:09
 */
public class Reflect implements Serializable{
//	public h(){
//
//	}
	private static final long serialVersionUID = -5975534269316828845L;

	@SuppressWarnings("rawtypes")
	public Object getProperty(Object owner, String fieldName) throws Exception {
	     Class ownerClass = owner.getClass();
	     Field field = ownerClass.getDeclaredField(fieldName);
	     field.setAccessible(true);
	     Object property = field.get(owner);
	     return property;
	}

	public static void main(String[] args) throws Exception {
		ReflectDrmoClass cla = new ReflectDrmoClass();
		System.out.println(new Reflect().getProperty(cla, "name"));
	}
}
