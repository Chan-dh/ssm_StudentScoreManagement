package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.StudentDao;
import com.test.po.Student;
import com.test.service.StudentService;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	// 注入StudentDao
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Student findStudentBysnoStu(String sno) { // 学生个人信息
		return this.studentDao.findStudentBysnoStu(sno);
	}

	@Override
	public void updateStuPwd(Student student) { // 修改密码
		this.studentDao.updateStuPwd(student);
	}

}
