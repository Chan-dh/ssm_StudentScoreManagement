package com.test.service;

import com.test.po.Student;

public interface StudentService {
	
	// 查看学生信息
	public Student findStudentBysnoStu(String sno);
	// 修改密码
	public void updateStuPwd(Student student);
	
}
