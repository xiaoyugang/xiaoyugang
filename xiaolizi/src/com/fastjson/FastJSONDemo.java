package com.fastjson;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月28日 下午2:11:04
 */
public class FastJSONDemo {
	public static String jsonStr() {
		List<Student> students = new ArrayList<Student>();
		for (int i = 0; i < 5; i++) {
			List<String> lists = new ArrayList<String>();
			Map<Object, List<String>> maps = new HashMap<Object, List<String>>();
			Object objects = new Object();
			lists.add("1list");
			lists.add("2list");
			maps.put((Object) "1", lists);
			objects = (Object) "1Object";
			Student stu = new Student(i, "Student" + i, 18 + i, new Date(), 123l, 'a', 1.12d, 1.13f, (short) 2, (byte) 4, true, lists, maps, objects);
			students.add(stu);
		}
		System.out.println(JSON.toJSONString(students));
		return JSON.toJSONString(students);
	}

	public static void main(String[] args) {
		String jsonStr = jsonStr();
		//new TypeReference<List<Student>>(){}
		List<Student> students = JSON.parseObject(jsonStr, new TypeReference<List<Student>>(){});
		System.out.println(students);

	}
}
