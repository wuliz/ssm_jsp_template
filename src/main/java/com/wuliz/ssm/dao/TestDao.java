package com.wuliz.ssm.dao;


import com.wuliz.ssm.pojo.Test;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author wuliz
 * @Date Created on 2022/8/7
 */
@Repository
public interface TestDao {

    @Select({"select * from test"})
    public ArrayList<Test> getTest();

    public List<Test> selectAll();
}
