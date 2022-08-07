package com.wuliz.ssm.controller;

import com.wuliz.ssm.pojo.Test;
import com.wuliz.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Description:
 *
 * @author wuliz
 * @Date Created on 2022/8/7
 */
@Controller
@RequestMapping("/test")
public class TestController {

    //测试bean注入正常
    @Autowired
    TestService testService;

    //测试springmvc
    @RequestMapping("/returnBody")
    @ResponseBody
    public String returnBody(){
        return testService.test()+"Body";
    }

    //测试跳转
    @RequestMapping("/toLogin")
    @ResponseBody
    public String toLogin(){
        return "login";
    }

    //测试数据库连接
    @RequestMapping("/getDbTest")
    @ResponseBody
    public List<Test> getDbTest(){
        return testService.getDbTest();
    }

    //测试数据库连接xml方式
    @RequestMapping("/getDbXmlTest")
    @ResponseBody
    public List<Test> getDbXmlTest(){
        return testService.getDbXmlTest();
    }
}
