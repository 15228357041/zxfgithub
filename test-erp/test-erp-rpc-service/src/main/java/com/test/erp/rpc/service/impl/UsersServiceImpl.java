package com.test.erp.rpc.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.test.common.annotation.BaseService;
import com.test.common.base.BaseServiceImpl;
import com.test.erp.dao.mapper.UsersMapper;
import com.test.erp.dao.model.Users;
import com.test.erp.dao.model.UsersExample;
import com.test.erp.rpc.api.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UsersService实现
* Created by u8 on 2019/1/30.
*/
@Service
@Transactional
@BaseService
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsersServiceImpl.class);

    @Autowired
    UsersMapper usersMapper;

}