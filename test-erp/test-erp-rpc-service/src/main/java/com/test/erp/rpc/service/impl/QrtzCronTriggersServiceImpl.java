package com.test.erp.rpc.service.impl;

import com.test.common.annotation.BaseService;
import com.test.common.base.BaseServiceImpl;
import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.QrtzCronTriggersMapper;
import com.test.erp.dao.model.QrtzCronTriggers;
import com.test.erp.rpc.api.QrtzCronTriggersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* QrtzCronTriggersService实现
* Created by u8 on 2019/9/30.
*/
@Service
@Transactional
@BaseService
public class QrtzCronTriggersServiceImpl extends MpBaseServiceImpl<QrtzCronTriggersMapper, QrtzCronTriggers> implements QrtzCronTriggersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QrtzCronTriggersServiceImpl.class);

    @Autowired
    QrtzCronTriggersMapper qrtzCronTriggersMapper;

}