package com.xiaoyuhang;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月25日 下午3:38:18
 */
public class StaticDemo {
	static int a = 3;
	static int b;

	static void meth(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	}

	public static void main(String[] args) {
		meth(42);
	}

}
