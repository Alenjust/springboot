package com.Alenjust.studentmanager.service;

import com.Alenjust.studentmanager.domain.SelectedCourse;
import com.Alenjust.studentmanager.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Classname SelectedCourseService
 * @Description 选择课程服务层
 * @Date 2021/7/29 10:48
 * @Created Alenjust
 */
public interface SelectedCourseService {
    PageBean<SelectedCourse> queryPage(Map<String, Object> paramMap);

    int addSelectedCourse(SelectedCourse selectedCourse);

    int deleteSelectedCourse(Integer id);

    boolean isStudentId(int id);

    List<SelectedCourse> getAllBySid(int studentid);
}
