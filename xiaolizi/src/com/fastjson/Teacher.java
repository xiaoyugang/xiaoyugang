package com.fastjson;

import java.util.List;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月28日 下午2:09:53
 */
public class Teacher {
	private int id;
	private String name;

	private List<Student> students;

	public Teacher() {

	}

	public Teacher(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
