package com.Alenjust.studentmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Alenjust.studentmanager.domain.Admin;
import com.Alenjust.studentmanager.domain.Student;
import com.Alenjust.studentmanager.domain.Teacher;
import com.Alenjust.studentmanager.service.AdminService;
import com.Alenjust.studentmanager.service.StudentService;
import com.Alenjust.studentmanager.service.TeacherService;

/**
 * @Classname registercontrller
 * @Description 注册控制
 * @Date 2021/7/26
 * @Created Alenjust
 */
@Controller
//@EnableWebSecurity
public class RegisterController {
    /**
     * 学生注册界面
     *
     * @return
     */
    @Autowired
    StudentService studentService;

    @RequestMapping("/tostudent")
    public String tostudent() {
        return "register/studentregister";
    }

    @RequestMapping("/studentregister")
    public String studentregist(Student student) {
        // 注册对密码进行加密
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		student.setPassword(passwordEncoder.encode(student.getPassword()));
        studentService.insert(student);
        return "/login";
    }

    /**
     * 教师注册界面
     *
     * @return
     */
    @Autowired
    TeacherService teacherService;

    @RequestMapping("/toteacher")
    public String toteacher() {
        return "register/teacherregister";
    }

    @RequestMapping("/teacherregister")
    public String teacherregister(Teacher teacher) {
        // 注册对密码进行加密
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		teacher.setPassword(passwordEncoder.encode(teacher.getPassword()));
        teacherService.insert(teacher);
        return "注册成功！";
    }

    /**
     * 管理员注册界面
     *
     * @return
     */
//	@Autowired
//	AdminService adminService;
//
//	@RequestMapping("/toadmin")
//	public String toadmin() {
//		return "register/adminregister";
//	}
//
//	@RequestMapping("/adminregister")
//	public String adminregister(Admin admin) {
//		// 注册对密码进行加密
////		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
////		admin.setPassword(passwordEncoder.encode(admin.getPassword()));
//		adminService.insert(admin);
//		return "注册成功！";
//	}
}
