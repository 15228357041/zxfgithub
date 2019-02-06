package com.test.erp.rpc.service.impl;


import com.github.pagehelper.PageHelper;
import com.test.common.annotation.BaseService;
import com.test.common.base.BaseServiceImpl;
import com.test.common.db.DataSourceEnum;
import com.test.common.db.DynamicDataSource;
import com.test.erp.dao.mapper.BossPopedomMapper;
import com.test.erp.dao.model.BossPopedom;
import com.test.erp.dao.model.BossPopedomExample;
import com.test.erp.rpc.api.BossPopedomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
* BossPopedomService实现
* Created by u8 on 2018/5/4.
*/
@Service
@Transactional
@BaseService
public class BossPopedomServiceImpl extends BaseServiceImpl<BossPopedomMapper, BossPopedom, BossPopedomExample> implements BossPopedomService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BossPopedomServiceImpl.class);

    @Autowired
    BossPopedomMapper bossPopedomMapper;

    @Override
    public int menuConfig(String[] id, String roleId) {
        return 0;
    }

    @Override
    public List<String> selectType() {
        return null;
    }

    @Override
    public int add(BossPopedom bossPopedom) {
        return 0;
    }

    @Override
    public int del(String id) {
        return 0;
    }

    @Override
    public int editBoss(BossPopedom bossPopedom) {
        return 0;
    }

    @Override
    public void test() {
        DynamicDataSource.setDataSource(DataSourceEnum.SLAVE.getName());
        System.out.println("测试成功");
    }
}