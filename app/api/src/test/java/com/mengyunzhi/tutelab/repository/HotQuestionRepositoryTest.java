package com.mengyunzhi.tutelab.repository;

import com.mengyunzhi.tutelab.entity.HotQuestion;
import com.mengyunzhi.tutelab.service.HotQuestionService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class HotQuestionRepositoryTest {
    private final static Logger logger = LoggerFactory.getLogger(HotQuestionRepositoryTest.class);
    @Autowired HotQuestionRepository hotQuestionRepository;
    @Autowired
    HotQuestionService hotQuestionService;
    @Test
    public void findAll() {
        hotQuestionRepository.findAll();
    }

    @Test
    public void findAllByOrderByWeightDescCreateTimeDesc() throws InterruptedException {
        logger.debug("创建数据");
        Integer weight = 10;
        Calendar calendar = Calendar.getInstance();
        for (int i = 1; i<= 10 ; i++) {
            Thread.sleep(100L);
            HotQuestion hotQuestion= new HotQuestion();
            hotQuestion.setWeight(weight - i);
            hotQuestionRepository.save(hotQuestion);
        }

        logger.debug("返回按顺序排列的数据");
        List<HotQuestion> hotQuestionList = (List<HotQuestion>) hotQuestionRepository.findAllByOrderByWeightDescCreateTimeDesc();
        for (HotQuestion hotQuestion : hotQuestionList) {
            Assertions.assertThat(hotQuestion.getWeight()).isLessThan(weight);
            weight = hotQuestion.getWeight();
            Assertions.assertThat(hotQuestion.getCreateTime()).isGreaterThanOrEqualTo(calendar);
            calendar = hotQuestion.getCreateTime();
        }

    }
}