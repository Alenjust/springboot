package com.Alenjust.studentmanager.mapper;

import com.Alenjust.studentmanager.domain.Admin;
import com.Alenjust.studentmanager.domain.Student;
import com.Alenjust.studentmanager.domain.Teacher;

/**
 * @Classname RegisterMapper
 * @Description 注册Mapper
 * @Date 2021/7/31 15:55
 * @Created Alenjust
 */
public interface RegisterMapper {
	//admin注册
//	Integer adminregister(Admin admin);
	
	//学生注册方法
	Integer studentregister(Student student);
	
	//教师注册方法
	Integer teacherregister(Teacher teacher);
	
}