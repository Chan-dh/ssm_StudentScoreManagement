package com.test.po;

/**
 * 老师持久化类
 */

public class Teacher {
	
	private String tno; //职工号
	private String tsex; //性别
	private String tname; //老师姓名
	private String pwd; //密码
	
	public String getTsex() {
		return tsex;
	}
	public void setTsex(String tsex) {
		this.tsex = tsex;
	}

	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getPasswd() {
		return pwd;
	}
	public void setPasswd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
