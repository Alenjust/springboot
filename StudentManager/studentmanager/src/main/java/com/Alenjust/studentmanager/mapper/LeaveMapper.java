package com.Alenjust.studentmanager.mapper;

import java.util.List;
import java.util.Map;

import com.Alenjust.studentmanager.domain.Leave;

/**
 * @Classname LeaveMapper
 * @Description 请假Mapper
 * @Date 2021/7/31 15:55
 * @Created Alenjust
 */
public interface LeaveMapper {
    List<Leave> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addLeave(Leave leave);

    int editLeave(Leave leave);

    int checkLeave(Leave leave);

    int deleteLeave(Integer id);
}
