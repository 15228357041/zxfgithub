package com.test.erp.rpc.api;



import com.test.common.base.BaseService;
import com.test.erp.dao.model.BossPopedom;
import com.test.erp.dao.model.BossPopedomExample;

import java.util.HashMap;
import java.util.List;

/**
* BossPopedomService接口
* Created by shuzheng on 2018/5/4.
*/
public interface BossPopedomService extends BaseService<BossPopedom, BossPopedomExample> {


    int menuConfig(String[] id, String roleId);

    List<String> selectType();

    int add(BossPopedom bossPopedom);

    int del(String id);

    int editBoss(BossPopedom bossPopedom);

    void test();
}