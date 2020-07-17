package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.TeacherDao;
import com.test.po.Student;
import com.test.po.Teacher;
import com.test.service.TeacherService;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
	
	// 注入TeacherDao
	@Autowired
	private TeacherDao teacherDao;
	@Override
	public void updateTeacher(Teacher teacher) { // 修改个人信息
		// TODO Auto-generated method stub
		this.teacherDao.updateTeacher(teacher);
	}

	@Override
	public List<Student> findAllStudnet() { // 查询所有学生的信息
		// TODO Auto-generated method stub
		return this.teacherDao.findAllStudnet();
	}

	@Override
	public Student findStudentBysnoTea(String sno) { // 根据学号查询学生信息
		// TODO Auto-generated method stub
		return this.teacherDao.findStudentBysnoTea(sno);
	}

	@Override
	public void updateStudent(Student student) { // 修改学生成绩
		// TODO Auto-generated method stub
		this.teacherDao.updateStudent(student);
	}

	@Override
	public void deleteStudent(String sno) { // 删除学生信息
		// TODO Auto-generated method stub
		this.teacherDao.deleteStudent(sno);
	}

	@Override
	public void insertStudent(Student student) { // 新增学生
		// TODO Auto-generated method stub
		this.teacherDao.insertStudent(student);
	}

}
