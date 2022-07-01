package com.Alenjust.studentmanager.service.Impl;

import com.Alenjust.studentmanager.domain.Score;
import com.Alenjust.studentmanager.domain.ScoreStats;
import com.Alenjust.studentmanager.mapper.ScoreMapper;
import com.Alenjust.studentmanager.service.ScoreService;
import com.Alenjust.studentmanager.util.PageBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Classname ScoreServiceImpl
 * @Description 成绩服务接口实现
 * @Date 2021/7/29 11:08
 * @Created Alenjust
 */
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public PageBean<Score> queryPage(Map<String, Object> paramMap) {
        PageBean<Score> pageBean = new PageBean<>((Integer) paramMap.get("pageno"),(Integer) paramMap.get("pagesize"));

        Integer startIndex = pageBean.getStartIndex();
        paramMap.put("startIndex",startIndex);
        List<Score> datas = scoreMapper.queryList(paramMap);
        pageBean.setDatas(datas);

        Integer totalsize = scoreMapper.queryCount(paramMap);
        pageBean.setTotalsize(totalsize);
        return pageBean;
    }

    @Override
    public boolean isScore(Score score) {
        Score sc = scoreMapper.isScore(score);
        if(sc != null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int addScore(Score score) {
        return scoreMapper.addScore(score);
    }

    @Override
    public int editScore(Score score) {
        return scoreMapper.editScore(score);
    }

    @Override
    public int deleteScore(Integer id) {
        return scoreMapper.deleteScore(id);
    }

    @Override
    public List<Score> getAll(Score score) {
        return scoreMapper.getAll(score);
    }

    @Override
    public ScoreStats getAvgStats(Integer courseid) {
        return scoreMapper.getAvgStats(courseid);
    }
}
