package com.Alenjust.studentmanager.service.Impl;

import com.Alenjust.studentmanager.domain.Clazz;
import com.Alenjust.studentmanager.domain.Student;
import com.Alenjust.studentmanager.mapper.ClazzMapper;
import com.Alenjust.studentmanager.service.ClazzService;
import com.Alenjust.studentmanager.util.PageBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @Classname ClazzServiceImpl
 * @Description 班级服务接口实现
 * @Date 2021/7/29 11:08
 * @Created Alenjust
 */
@Service
public class ClazzServiceImpl implements ClazzService {

    @Autowired
    private ClazzMapper clazzMapper;

    @Override
    public PageBean<Clazz> queryPage(Map<String, Object> paramMap) {
        PageBean<Clazz> pageBean = new PageBean<>((Integer) paramMap.get("pageno"),(Integer) paramMap.get("pagesize"));

        Integer startIndex = pageBean.getStartIndex();
        paramMap.put("startIndex",startIndex);
        List<Clazz> datas = clazzMapper.queryList(paramMap);
        pageBean.setDatas(datas);

        Integer totalsize = clazzMapper.queryCount(paramMap);
        pageBean.setTotalsize(totalsize);
        return pageBean;
    }

    @Override
    public int addClazz(Clazz clazz) {
        return clazzMapper.addClazz(clazz);
    }

    @Override
    @Transactional
    public int deleteClazz(List<Integer> ids) {
        return clazzMapper.deleteClazz(ids);
    }

    @Override
    public int editClazz(Clazz clazz) {
        return clazzMapper.editClazz(clazz);
    }

    @Override
    public Clazz findByName(String clazzName) {
        return clazzMapper.findByName(clazzName);
    }

}
