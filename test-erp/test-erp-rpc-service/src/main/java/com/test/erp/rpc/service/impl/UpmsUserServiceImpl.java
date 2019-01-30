package com.test.erp.rpc.service.impl;

import com.test.common.annotation.BaseService;
import com.test.common.base.BaseServiceImpl;
import com.test.erp.dao.mapper.UpmsUserMapper;
import com.test.erp.dao.model.UpmsUser;
import com.test.erp.dao.model.UpmsUserExample;
import com.test.erp.rpc.api.UpmsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsUserService实现
* Created by u8 on 2018/6/11.
*/
@Service
@Transactional
@BaseService
public class UpmsUserServiceImpl extends BaseServiceImpl<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserServiceImpl.class);

    @Autowired
    UpmsUserMapper upmsUserMapper;

}