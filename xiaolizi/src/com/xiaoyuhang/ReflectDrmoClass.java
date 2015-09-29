package com.xiaoyuhang;

import java.io.Serializable;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月18日 下午3:25:38
 */
public class ReflectDrmoClass implements Serializable{
	private static final long serialVersionUID = -4775034652046239862L;
	private Integer id;
	private String name;
	private String mail;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
