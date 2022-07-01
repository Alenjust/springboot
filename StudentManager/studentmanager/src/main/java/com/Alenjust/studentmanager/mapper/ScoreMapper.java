package com.Alenjust.studentmanager.mapper;

import java.util.List;
import java.util.Map;

import com.Alenjust.studentmanager.domain.Score;
import com.Alenjust.studentmanager.domain.ScoreStats;

/**
 * @Classname ScoreMapper
 * @Description 成绩Mapper
 * @Date 2021/7/31 11:47
 * @Created Alenjust
 */
public interface ScoreMapper {
    List<Score> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addScore(Score score);

    Score isScore(Score score);

    int editScore(Score score);

    int deleteScore(Integer id);

    List<Score> getAll(Score score);

    ScoreStats getAvgStats(Integer courseid);
}
