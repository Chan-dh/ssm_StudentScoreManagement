package com.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.po.Student;
import com.test.po.Teacher;
import com.test.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String tologin() {
		return "login";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String findCustomerById(String username, String passwd, String people, Model model,
			HttpSession session) {
		
		if("Stu".equals(people)) {
			Student student = new Student();
			student.setSno(username);
			student.setPasswd(passwd);
			Student student_2 = loginService.LoginToStudent(student);
			
			if(student_2 != null) {
				session.setAttribute("Stu_SESSION", student_2);
				//ModelAndView mav = new ModelAndView("/indexs");
				return "redirect:indexs";
			}else {
				//ModelAndView mav = new ModelAndView("error");
				return "error";
				
			}
		} else if("Tea".equals(people)){
			Teacher teacher = new Teacher();
			teacher.setTno(username);
			teacher.setPasswd(passwd);
			Teacher teacher_2 = loginService.LoginToTeacher(teacher);
			if(teacher_2 != null) {
				session.setAttribute("Tea_SESSION", teacher_2);
				//ModelAndView mav = new ModelAndView("indext");
				return "redirect:indext";
			}else {
				//ModelAndView mav = new ModelAndView("error");
				return "error";
			}
		}
		//ModelAndView mav = new ModelAndView("error");
		return "error";
	}
	
	//退出登录
	@RequestMapping("/loginout")
	public ModelAndView out(HttpSession session) {
		// 清楚session
		session.invalidate();
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
}
