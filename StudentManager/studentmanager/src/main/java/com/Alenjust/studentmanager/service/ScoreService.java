package com.Alenjust.studentmanager.service;

import com.Alenjust.studentmanager.domain.Score;
import com.Alenjust.studentmanager.domain.ScoreStats;
import com.Alenjust.studentmanager.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * @Classname ScoreService
 * @Description 成绩服务层
 * @Date 2021/7/29 11:45
 * @Created Alenjust
 */
public interface ScoreService {
    PageBean<Score> queryPage(Map<String, Object> paramMap);

    boolean isScore(Score score);

    int addScore(Score score);

    int editScore(Score score);

    int deleteScore(Integer id);

    List<Score> getAll(Score score);

    ScoreStats getAvgStats(Integer courseid);
}
