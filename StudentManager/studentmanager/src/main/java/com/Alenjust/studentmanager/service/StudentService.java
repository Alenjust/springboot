package com.Alenjust.studentmanager.service;

import com.Alenjust.studentmanager.domain.Student;
import com.Alenjust.studentmanager.domain.Teacher;
import com.Alenjust.studentmanager.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Classname StudentService
 * @Description 学生服务层
 * @Date 2021/7/29 14:11
 * @Created Alenjust
 */
public interface StudentService {
    PageBean<Student> queryPage(Map<String, Object> paramMap);

    int deleteStudent(List<Integer> ids);

    int addStudent(Student student);

    Student findById(Integer sid);

    int editStudent(Student student);

    Student findByStudent(Student student);

    boolean isStudentByClazzId(Integer next);

    int editPswdByStudent(Student student);

    int findByName(String username);

    //学生注册
    void insert(Student student);

    void insert(Teacher teacher);
}
