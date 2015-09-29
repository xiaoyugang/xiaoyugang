package com.sbtool;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * TODO 全局唯一stringBuffer,用于解决字符连接使用+造成的低效问题。 StringBuffer虽然线程安全，但该类的 线程安全问题待解决
 *
 * @author Pro.Bu
 *
 */
public class SBTool {
	public static Random random;
	public static StringBuffer sbTool;
	public static List<StringBuffer> sbSynList;
	public static List<StringBuffer> sbList;

	private SBTool() {
	}

	private static SBTool instance;
	static {
		sbTool = new StringBuffer();
		List<StringBuffer> sbList = new ArrayList<StringBuffer>();
		List<StringBuffer> sbSynList = Collections.synchronizedList(sbList);
		instance = new SBTool();
		random = new Random();
		sbSynList.add(sbTool);
	}

	/**
	 * 即append方法
	 *
	 * @param t
	 * @return
	 */
	public static <T> SBTool ad(T t) {
		if (t == null) {
			sbTool.append("");
			return instance;
		}
		sbTool.append(t);
		return instance;
	}

	/**
	 * 每次调用该方法会先返回字符串然后清空StringBuffer中的信息
	 *
	 * @return
	 */
	public static String toStr() {
		String str = sbTool.toString();
		clearSB();
		return str;
	}

	public static void clearSB() {
		// sbTool.setLength(0);
		sbTool.delete(0, sbTool.length());
	}

	public static String inputStream2String(InputStream in) {
		byte[] b = new byte[4096];
		try {
			for (int n; (n = in.read(b)) != -1;) {
				ad(new String(b, 0, n));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return toStr();
	}

	/**
	 * 关于线程安全解决的方案（待测试）
	 *
	 * @param t
	 * @return
	 */
	protected static <T> SBTool add(T t) {
		if (t == null) {
			sbSynList.get(0).append("");
			return instance;
		}
		sbTool.append(t);
		return instance;
	}

	protected static String toSStr() {
		String str = sbSynList.get(0).toString();
		clearSSB();
		return str;
	}

	protected static void clearSSB() {
		// sbTool.setLength(0);
		sbSynList.get(0).delete(0, sbTool.length());
	}
}