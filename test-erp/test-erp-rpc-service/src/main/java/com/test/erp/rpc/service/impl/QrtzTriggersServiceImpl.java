package com.test.erp.rpc.service.impl;

import com.test.common.annotation.BaseService;
import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.QrtzTriggersMapper;
import com.test.erp.dao.model.QrtzTriggers;
import com.test.erp.rpc.api.QrtzTriggersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* QrtzTriggersService实现
* Created by u8 on 2019/9/30.
*/
@Service
@Transactional
@BaseService
public class QrtzTriggersServiceImpl extends MpBaseServiceImpl<QrtzTriggersMapper, QrtzTriggers> implements QrtzTriggersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QrtzTriggersServiceImpl.class);

    @Autowired
    QrtzTriggersMapper qrtzTriggersMapper;

}