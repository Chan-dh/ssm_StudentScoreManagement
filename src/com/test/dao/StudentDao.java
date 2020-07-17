package com.test.dao;

import java.util.List;

import com.test.po.Student;

/**
 * 学生接口
 */

public interface StudentDao {
	
	// 查看学生信息
	public Student findStudentBysnoStu(String sno);
	// 修改密码
	public void updateStuPwd(Student student);
	
}
