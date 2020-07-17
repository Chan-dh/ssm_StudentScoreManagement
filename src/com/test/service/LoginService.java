package com.test.service;

import com.test.po.Student;
import com.test.po.Teacher;

public interface LoginService {
	
	// 学生登录
	public Student LoginToStudent(Student student);
	// 老师登录
	public Teacher LoginToTeacher(Teacher teacher);
	
}
