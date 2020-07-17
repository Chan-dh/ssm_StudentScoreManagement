package com.test.po;

/**
 * 学生持久化类
 *
 */

public class Student {
	
	private String sno; //学号
	private String ssex; //性别
	private String sname; //名字
	private String pwd; //密码
	private Integer score; //成绩
	
	
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPasswd() {
		return pwd;
	}
	public void setPasswd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
}
