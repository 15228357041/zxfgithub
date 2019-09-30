package com.test.erp.rpc.service.impl;


import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.UsersMapper;
import com.test.erp.dao.model.Users;
import com.test.erp.rpc.api.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UsersService实现
* Created by test on 2019/2/8.
*/
@Service
@Transactional
public class UsersServiceImpl extends MpBaseServiceImpl<UsersMapper, Users> implements UsersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsersServiceImpl.class);

    @Autowired
    UsersMapper usersMapper;

}