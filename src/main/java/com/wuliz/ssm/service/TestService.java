package com.wuliz.ssm.service;

import com.wuliz.ssm.dao.TestDao;
import com.wuliz.ssm.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author wuliz
 * @Date Created on 2022/8/7
 */
@Service
public class TestService {

    @Autowired
    TestDao testDao;

    public String test(){
        return "test";
    }

    public List<Test> getDbTest(){
        return testDao.getTest();
    }

    public List<Test> getDbXmlTest(){
        return testDao.selectAll();
    }
}
