package com.Alenjust.studentmanager.mapper;

import java.util.List;
import java.util.Map;

import com.Alenjust.studentmanager.domain.Clazz;

/**
 * @Classname ClazzMapper
 * @Description 班级Mapper
 * @Date 2021/7/31 20:09
 * @Created Alenjust
 */
public interface ClazzMapper {
    List<Clazz> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addClazz(Clazz clazz);

    int deleteClazz(List<Integer> ids);

    int editClazz(Clazz clazz);

    Clazz findByName(String clazzName);
}
