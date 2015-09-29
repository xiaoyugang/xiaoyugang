
package com.xiaoyuhang;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月28日 下午12:40:00
 */
public class DebugClass {
	private static boolean DEBUG = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}

	public static void print(String arg0) {
		if (DEBUG)
			System.out.print(arg0);
	}

	public static void println(String arg0) {
		if (DEBUG)
			System.out.println(arg0);
	}
}
