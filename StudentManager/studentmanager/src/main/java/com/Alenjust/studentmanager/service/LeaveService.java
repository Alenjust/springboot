package com.Alenjust.studentmanager.service;

import com.Alenjust.studentmanager.domain.Leave;
import com.Alenjust.studentmanager.util.PageBean;

import java.util.Map;

/**
 * @Classname LeaveService
 * @Description 请假
 * @Date 2021/7/29 15:54
 * @Created Alenjust
 */
public interface LeaveService {
    PageBean<Leave> queryPage(Map<String, Object> paramMap);

    int addLeave(Leave leave);

    int editLeave(Leave leave);

    int checkLeave(Leave leave);

    int deleteLeave(Integer id);
}
