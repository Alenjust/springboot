package com.Alenjust.studentmanager.service;

import com.Alenjust.studentmanager.domain.Attendance;
import com.Alenjust.studentmanager.util.PageBean;

import java.util.Map;

/**
 * @Classname AttendanceService
 * @Description 出勤率
 * @Date 2021/7/29 15:47
 * @Created Alenjust
 */
public interface AttendanceService {
    PageBean<Attendance> queryPage(Map<String, Object> paramMap);

    boolean isAttendance(Attendance attendance);

    int addAtendance(Attendance attendance);

    int deleteAttendance(Integer id);
}
