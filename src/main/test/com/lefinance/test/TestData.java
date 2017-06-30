package com.lefinance.test;

import com.lefinance.Application;
import com.lefinance.common.constant.TransEnum;
import com.lefinance.regulation.dao.RegCqContractInfoMapper;
import com.lefinance.regulation.service.PTLN102Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author: jingyan
 * @Time: 2017/6/27 16:10
 * @Describe:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= Application.class)
public class TestData {
    @Resource
    private RegCqContractInfoMapper regCqContractInfoMapper;

    @Resource
    @Qualifier("ptln102Service")
    private PTLN102Service ptln102Service;

    @Test
    public void createContractData(){
        ptln102Service.reportSupervise(TransEnum.PTLN102);
    }
}