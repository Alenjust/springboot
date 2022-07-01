package com.Alenjust.studentmanager.service;

import com.Alenjust.studentmanager.domain.Clazz;
import com.Alenjust.studentmanager.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Classname ClazzService
 * @Description 班级服务层
 * @Date 2021/7/29 10:14
 * @Created Alenjust
 */
public interface ClazzService {
    PageBean<Clazz> queryPage(Map<String, Object> paramMap);

    int addClazz(Clazz clazz);

    int deleteClazz(List<Integer> ids);

    int editClazz(Clazz clazz);

    Clazz findByName(String clazzName);

}
