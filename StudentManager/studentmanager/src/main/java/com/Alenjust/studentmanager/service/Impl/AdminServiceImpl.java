package com.Alenjust.studentmanager.service.Impl;

import com.Alenjust.studentmanager.domain.Admin;
import com.Alenjust.studentmanager.domain.Teacher;
import com.Alenjust.studentmanager.mapper.AdminMapper;
import com.Alenjust.studentmanager.mapper.RegisterMapper;
import com.Alenjust.studentmanager.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname adminServiceImpl
 * @Description 管理员服务接口实现
 * @Date 2021/7/29 11:08
 * @Created Alenjust
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;
    
    @Autowired
    private RegisterMapper registermapper;

    @Override
    public Admin findByAdmin(Admin admin) {
        return adminMapper.findByAdmin(admin);
    }

    @Override
    public int editPswdByAdmin(Admin admin) {
        return adminMapper.editPswdByAdmin(admin);
    }
    //管理员注册
//    @Override
//	public void insert(Admin admin) {
//		// TODO Auto-generated method stub
//		Integer rows = registermapper.adminregister(admin);
//		System.err.println("rows="+rows);
//		return ;
//	}

}
