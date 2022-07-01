package com.Alenjust.studentmanager.service.Impl;

import com.Alenjust.studentmanager.domain.Teacher;
import com.Alenjust.studentmanager.mapper.RegisterMapper;
import com.Alenjust.studentmanager.mapper.TeacherMapper;
import com.Alenjust.studentmanager.service.TeacherService;
import com.Alenjust.studentmanager.util.PageBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Classname TeacherServiceImpl
 * @Description 教师服务接口实现
 * @Date 2021/7/29 11:08
 * @Created Alenjust
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private RegisterMapper registerMapper;

    @Override
    public PageBean<Teacher> queryPage(Map<String, Object> paramMap) {
        PageBean<Teacher> pageBean = new PageBean<>((Integer) paramMap.get("pageno"),(Integer) paramMap.get("pagesize"));

        Integer startIndex = pageBean.getStartIndex();
        paramMap.put("startIndex",startIndex);
        List<Teacher> datas = teacherMapper.queryList(paramMap);
        pageBean.setDatas(datas);

        Integer totalsize = teacherMapper.queryCount(paramMap);
        pageBean.setTotalsize(totalsize);
        return pageBean;
    }

    @Override
    public int deleteTeacher(List<Integer> ids) {
        return teacherMapper.deleteTeacher(ids);
    }

    @Override
    public int addTeacher(Teacher teacher) {
        return teacherMapper.addTeacher(teacher);
    }

    @Override
    public Teacher findById(Integer tid) {
        return teacherMapper.findById(tid);
    }

    @Override
    public int editTeacher(Teacher teacher) {
        return teacherMapper.editTeacher(teacher);
    }

    @Override
    public Teacher findByTeacher(Teacher teacher) {
        return teacherMapper.findByTeacher(teacher);
    }

    @Override
    public int editPswdByTeacher(Teacher teacher) {
        return teacherMapper.editPswdByTeacher(teacher);
    }
    
    //教师注册功能
	@Override
	public void insert(Teacher teacher) {
		// TODO Auto-generated method stub
		Integer rows = registerMapper.teacherregister(teacher);
		System.err.println("rows="+rows);
	}
	
}
