package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.po.Student;
import com.test.po.Teacher;
import com.test.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@RequestMapping(value = "/indext")
	public String indext() {
		return "indext";
	}

	@RequestMapping(value = "/teapwd")
	public String teapwd() {
		return "teapwd";
	}


	@RequestMapping(value = "/teaUpstu")
	public String teaUpstu() {
		
		return "teaUpstu";
	}

	/*
	 * 修改老师密码
	 */
	@RequestMapping(value = "/teapwdcg", method = RequestMethod.POST)
	public ModelAndView teapwdcg(String passwd, String pwd1, String pwd2, Model model, HttpSession session) {

		if (passwd != null && !passwd.trim().equals("") && pwd1 != null && !pwd1.trim().equals("") && pwd2 != null
				&& !pwd2.trim().equals("")) {
			Teacher teacher = (Teacher) session.getAttribute("Tea_SESSION");
			String tpsw = teacher.getPasswd();
			if (!tpsw.equals(passwd.trim())) {
				model.addAttribute("msg", "原密码错误！");
				ModelAndView mav = new ModelAndView("/teapwd");
				return mav;
			}
			if (!pwd1.trim().equals(pwd2)) {
				model.addAttribute("msg", "两次密码不一致！");
				ModelAndView mav = new ModelAndView("/teapwd");
				return mav;
			}
			teacher.setPasswd(pwd2);
			teacherService.updateTeacher(teacher);
			model.addAttribute("msg", "密码修改成功！请重新登录！");
			session.invalidate();
			ModelAndView mav = new ModelAndView("/login");
			return mav;
		}
		model.addAttribute("msg", "不能为空！");
		ModelAndView mav = new ModelAndView("/teapwd");
		return mav;
	}

	/*
	 * 删除学生
	 */
	@RequestMapping(value = "/delstu")
	public ModelAndView delstu(String sno) {
		teacherService.deleteStudent(sno);
		
		ModelAndView mav = new ModelAndView("indext");
		return mav;
	}
	
	/*
	 * 所有学生的信息
	 */
	@RequestMapping(value = "/teaTostu")
	public String toteaTostu(Model model) {
		List<Student> lists = teacherService.findAllStudnet();
		model.addAttribute("lists", lists);
		//ModelAndView mav = new ModelAndView("teaTostu");
		return "teaTostu";
	}

	/*
	 * 添加
	 */
	@RequestMapping(value = "/teaUpstucg", method = RequestMethod.POST)
	public ModelAndView teaUpstucg(String sno, String ssex, String sname, String score1, String pwd, Model model) {
		if(sno!=null&&ssex!=null&&sname!=null&&score1!=null&&pwd!=null) {
			
		
			Student student = new Student();
			Integer score = Integer.valueOf(score1);
			student.setSno(sno);
			student.setSsex(ssex);
			student.setSname(sname);
			student.setScore(score);
			student.setPasswd(pwd);
			
			teacherService.insertStudent(student);
			ModelAndView mav = new ModelAndView("teaUpstu");
			model.addAttribute("msg", "成功添加！");
			return mav;
		}else {
			model.addAttribute("msg", "填入信息不完整");
			ModelAndView mav = new ModelAndView("teaUpstu");
			return mav;
		}
		
	}
	/*
	 * 修改成绩
	 */
	@RequestMapping(value="/teaUpdate")
	public ModelAndView teaUpdate(String sno, Model model) {
		
		Student student = teacherService.findStudentBysnoTea(sno);
		model.addAttribute("updstu", student);
		ModelAndView mav = new ModelAndView("teaUpdate");
		return mav;
	}
	
	@RequestMapping(value="/teaUpdatecg", method = RequestMethod.POST)
	public ModelAndView teaUpdatecg(String sno,String sname, String score1, Model model) {
		
		Integer score = Integer.valueOf(score1);
		Student student = new Student();
		student.setSno(sno);
		student.setSname(sname);
		student.setScore(score);
		teacherService.updateStudent(student);
		model.addAttribute("msg", "修改成功！");
		ModelAndView mav = new ModelAndView("indext");
		return mav;
	}
}
