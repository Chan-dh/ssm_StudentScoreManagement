package com.test.dao;

import java.util.List;

import com.test.po.Student;
import com.test.po.Teacher;

/**
 * Teacher 的接口文件
 */

public interface TeacherDao {
	
	// 根据 职工号 修改老师信息
	public void updateTeacher(Teacher teacher);
	
	// 查询所有学生的信息
	public List<Student> findAllStudnet();	
	// 根据学号 查询学生信息
	public Student findStudentBysnoTea(String sno);	
	// 修改学生成绩
	public void updateStudent(Student student);	
	//删除学生信息
	public void deleteStudent(String sno);
	// 新增学生
	public void insertStudent(Student student);
}
