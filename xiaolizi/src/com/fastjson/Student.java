package com.fastjson;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月28日 下午2:08:04
 */
/**
 * @author Administrator
 *
 */
public class Student {
	private int id;
	private String name;
	private int age;
	private Date dates;
	private long longs;
	private char chars;
	private double doublds;
	private float floats;
	private short shorts;
	private byte bytes;
	private boolean booleans;
	private List<String> lists;
	private Map<Object, List<String>> maps;
	private Object objects;

	public Student() {

	}

	public Student(int id, String name, int age, Date dates, long longs, char chars, double doublds, float floats, short shorts, byte bytes, boolean booleans, List<String> lists, Map<Object, List<String>> maps, Object objects) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dates = dates;
		this.longs = longs;
		this.chars = chars;
		this.doublds = doublds;
		this.floats = floats;
		this.shorts = shorts;
		this.bytes = bytes;
		this.booleans = booleans;
		this.lists = lists;
		this.maps = maps;
		this.objects = objects;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDates() {
		return dates;
	}

	public void setDates(Date dates) {
		this.dates = dates;
	}

	public long getLongs() {
		return longs;
	}

	public void setLongs(long longs) {
		this.longs = longs;
	}

	public char getChars() {
		return chars;
	}

	public void setChars(char chars) {
		this.chars = chars;
	}

	public double getDoublds() {
		return doublds;
	}

	public void setDoublds(double doublds) {
		this.doublds = doublds;
	}

	public float getFloats() {
		return floats;
	}

	public void setFloats(float floats) {
		this.floats = floats;
	}

	public short getShorts() {
		return shorts;
	}

	public void setShorts(short shorts) {
		this.shorts = shorts;
	}

	public byte getBytes() {
		return bytes;
	}

	public void setBytes(byte bytes) {
		this.bytes = bytes;
	}

	public boolean isBooleans() {
		return booleans;
	}

	public void setBooleans(boolean booleans) {
		this.booleans = booleans;
	}

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public Map<Object, List<String>> getMaps() {
		return maps;
	}

	public void setMaps(Map<Object, List<String>> maps) {
		this.maps = maps;
	}

	public Object getObjects() {
		return objects;
	}

	public void setObjects(Object objects) {
		this.objects = objects;
	}

}
