package com.test.dao;

import com.test.po.Student;
import com.test.po.Teacher;

/**
 * 登录接口
 */
public interface LoginDao {
	
	// 学生登录
	public Student LoginToStudent(Student student);
	// 老师登录
	public Teacher LoginToTeacher(Teacher teacher);	
}
