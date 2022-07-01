package com.Alenjust.studentmanager.service;

import com.Alenjust.studentmanager.domain.Admin;
import com.Alenjust.studentmanager.domain.Student;
import com.Alenjust.studentmanager.domain.Teacher;

/**
 * @Classname AdminService
 * @Description 管理员服务层
 * @Date 2021/7/29 11:07
 * @Created Alenjust
 */
public interface AdminService {

    Admin findByAdmin(Admin admin);


    int editPswdByAdmin(Admin admin);
    
//    //教师注册
//    void insert(Teacher teacher);

    //admin注册
//	void insert(Admin admin);
}
