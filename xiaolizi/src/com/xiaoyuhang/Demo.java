package com.xiaoyuhang;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月15日 下午4:29:44
 */
public class Demo {

	public static void main(String[] args) {
		 List list = new ArrayList();
		// list.add("qqyumidi");
		// list.add("corn");
		// list.add(100);
		// for (int i = 0; i < list.size(); i++) {
		// String name = (String) list.get(i); // 1
		// System.out.println("name:" + name);
		// }

		Box<String> name = new Box<String>("corn");
		Box<Integer> age = new Box<Integer>(712);
		Box<Number> number = new Box<Number>(314);
		getData(name);
		getData(age);
		getData(number);

		// getUpperNumberData(name); // 1
		getUpperNumberData(age); // 2
		getUpperNumberData(number); // 3
	}

	public static void getData(Box<?> data) {
		System.out.println("data :" + data.getData());
	}

	public static void getUpperNumberData(Box<? extends Number> data) {
		System.out.println("data :" + data.getData());
	}

}

class Box<T> {
	private T data;

	public Box() {
	}

	public Box(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}