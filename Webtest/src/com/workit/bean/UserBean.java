package com.workit.bean;

public class UserBean {
	private int userid;
	private String username;
	private String loginname;
	private String password;
	private String memo;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public UserBean(int userid, String username, String loginname,
			String password, String memo) {
		super();
		this.userid = userid;
		this.username = username;
		this.loginname = loginname;
		this.password = password;
		this.memo = memo;
	}
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
