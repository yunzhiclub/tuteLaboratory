package com.mengyunzhi.tutelab.service;

import com.mengyunzhi.tutelab.entity.HotQuestion;
import com.mengyunzhi.tutelab.repository.HotQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotQuestionServiceImpl implements HotQuestionService {
    @Autowired
    HotQuestionRepository hotQuestionRepository;
    @Override
    public List<HotQuestion> findAll() {
        return (List<HotQuestion>) hotQuestionRepository.findAllByOrderByWeightDescCreateTimeDesc();

    }
}
