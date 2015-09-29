package com.xiaoyuhang;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月28日 下午3:46:13
 */
public class PropertiesDemo {

	public void print() throws IOException {
		Properties properties = new Properties();
		InputStream ins = this.getClass().getResourceAsStream("../fastjson/dataSource.properties");
		properties.load(ins);
		String param1 = properties.getProperty("jdbc.type").trim();
		System.out.println(param1);
	}

	public static void main(String[] args) throws IOException {
		PropertiesDemo pd = new PropertiesDemo();
		pd.print();
	}

}
