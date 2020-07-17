package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.LoginDao;
import com.test.po.Student;
import com.test.po.Teacher;
import com.test.service.LoginService;

@Service
@Transactional
public class LoginServiceImpl implements LoginService{
	//注入 LoginDao
	@Autowired
	private LoginDao loginDao;
	
	@Override
	public Student LoginToStudent(Student student) { //学生登录
		
		return this.loginDao.LoginToStudent(student);
	}

	@Override
	public Teacher LoginToTeacher(Teacher teacher) { //老师登录
		
		return this.loginDao.LoginToTeacher(teacher);
	}

}
