package com.mengyunzhi.tutelab.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.transaction.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
@AutoConfigureMockMvc
public class HotQuestionControllerTest {
    private final static Logger logger = LoggerFactory.getLogger(HotQuestionControllerTest.class);
    protected MockMvc mockMvc;
    @Autowired
    protected WebApplicationContext context; // 上下文

    @Before
    public void setUp() {
        logger.debug("将上下文设置到mockMvc中，实现模拟用户进行登录等操作");
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
                .build();
    }

    @Test
    public void all() throws Exception {
        String url = "/HotQuestion";
        this.mockMvc
                .perform(MockMvcRequestBuilders.get(url))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}