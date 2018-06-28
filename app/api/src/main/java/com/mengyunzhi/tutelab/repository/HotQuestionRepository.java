package com.mengyunzhi.tutelab.repository;

import com.mengyunzhi.tutelab.entity.HotQuestion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 热点问题
 */
public interface HotQuestionRepository extends CrudRepository<HotQuestion, Long> {
    Iterable<HotQuestion> findAllByOrderByWeightDescCreateTimeDesc();
}
