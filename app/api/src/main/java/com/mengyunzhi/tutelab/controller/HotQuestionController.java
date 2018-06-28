package com.mengyunzhi.tutelab.controller;

import com.mengyunzhi.tutelab.entity.HotQuestion;
import com.mengyunzhi.tutelab.service.HotQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 热点问题
 */
@RestController
@RequestMapping("HotQuestion")
public class HotQuestionController {
    @Autowired
    HotQuestionService hotQuestionService;
    @GetMapping
    public List<HotQuestion> all() {
        return hotQuestionService.findAll();
    }
}
