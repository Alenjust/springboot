package com.Alenjust.studentmanager.service;

import com.Alenjust.studentmanager.domain.Teacher;
import com.Alenjust.studentmanager.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Classname TeacherService
 * @Description 教师服务层
 * @Date 2021/7/29 18:56
 * @Created Alenjust
 */
public interface TeacherService {
    PageBean<Teacher> queryPage(Map<String, Object> paramMap);

    int deleteTeacher(List<Integer> ids);

    int addTeacher(Teacher teacher);

    Teacher findById(Integer tid);

    int editTeacher(Teacher teacher);

    Teacher findByTeacher(Teacher teacher);

    int editPswdByTeacher(Teacher teacher);

    //教师注册
    void insert(Teacher teacher);
}
