package com.Alenjust.studentmanager.mapper;

import java.util.List;
import java.util.Map;

import com.Alenjust.studentmanager.domain.Student;

/**
 * @Classname StudenetMapper
 * @Description 学生Mapper
 * @Date 2021/7/31 20:09
 * @Created Alenjust
 */
public interface StudenetMapper {
    List<Student> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int deleteStudent(List<Integer> ids);

    int addStudent(Student student);

    Student findById(Integer sid);

    int editStudent(Student student);

    Student findByStudent(Student student);

    List<Student> isStudentByClazzId(Integer id);

    int editPswdByStudent(Student student);

    int findByName(String name);
}
