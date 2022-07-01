package com.Alenjust.studentmanager.mapper;

import org.springframework.stereotype.Repository;

import com.Alenjust.studentmanager.domain.Admin;

/**
 * @Classname UserMapper
 * @Description adminMapper
 * @Date 2021/7/24 20:09
 * @Created Alenjust
 */
@Repository
public interface AdminMapper {

    Admin findByAdmin(Admin admin);


    int editPswdByAdmin(Admin admin);
}
