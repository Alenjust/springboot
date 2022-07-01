package com.Alenjust.studentmanager.mapper;

import java.util.List;
import java.util.Map;

import com.Alenjust.studentmanager.domain.SelectedCourse;

/**
 * @Classname SelectedCourseMapper
 * @Description 选择课程Mapper
 * @Date 2021/7/31 10:56
 * @Created Alenjust
 */
public interface SelectedCourseMapper {
    List<SelectedCourse> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addSelectedCourse(SelectedCourse selectedCourse);

    SelectedCourse findBySelectedCourse(SelectedCourse selectedCourse);

    SelectedCourse findById(Integer id);

    int deleteSelectedCourse(Integer id);

    List<SelectedCourse> isStudentId(int id);

    List<SelectedCourse> getAllBySid(int studentid);
}
