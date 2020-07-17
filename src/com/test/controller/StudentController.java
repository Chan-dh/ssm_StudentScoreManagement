package com.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.po.Student;
import com.test.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	/*
	@RequestMapping(value="/indexs", method = RequestMethod.POST)
	public String indexs() {
		return "indexs";
	}
	*/
	@RequestMapping(value="/indexs")
	public String indexs() {
		return "indexs";
	}
	
	@RequestMapping(value="/stupwd")
	public String tostupwd() {
		return "stupwd";
	}
	
	@RequestMapping(value="/stuinfo")
	public String tostuinfo() {
		return "stuinfo";
	}
	
	/**
	 * 更新学生密码
	 */
	@RequestMapping(value="/stupwdcg", method = RequestMethod.POST)
	public ModelAndView stupwdcg(String passwd, String pwd1, String pwd2,Model model,HttpSession session) {
		// passwd 原密码 ， pwd1 第一次密码， pwd2 第二次密码
		if(passwd!=null && !passwd.trim().equals("")&&pwd1!=null && !pwd1.trim().equals("")&&pwd2!=null && !pwd2.trim().equals("")) {
			Student student=(Student)session.getAttribute("Stu_SESSION");
			String tpsw=student.getPasswd();
			if(!tpsw.equals(passwd.trim())) {
				model.addAttribute("msg","原密码错误！");
				ModelAndView mav = new ModelAndView("/stupwd");
				return mav; 
			}
			if(!pwd1.trim().equals(pwd2)) {
				model.addAttribute("msg","两次密码不一致！");
				ModelAndView mav = new ModelAndView("/stupwd");
				return mav; 
			}
			student.setPasswd(pwd2);
			studentService.updateStuPwd(student);
			model.addAttribute("msg","密码修改成功！请重新登录！");
			session.invalidate();
			ModelAndView mav = new ModelAndView("/login");
			return mav;
		}
		model.addAttribute("msg", "不能为空！");
		ModelAndView mav = new ModelAndView("/stupwd");
		return mav; 
	}
	
	/* 查看个人成绩
	 
	@RequestMapping(value="/stuinfo", method = RequestMethod.POST)
	public ModelAndView stuinfocg(HttpSession session, Model model) {
		Student student_s = (Student)session.getAttribute("Stu_SESSION");
		String sno = student_s.getSno();
		Student student = studentService.findStudentBysnoStu(sno);
		model.addAttribute("student_info", student);
		ModelAndView mav = new ModelAndView("stuinfo");
		return mav;
	}
	*/
}
