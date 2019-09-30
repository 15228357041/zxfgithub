package com.test.erp.rpc.service.impl;

import com.test.common.annotation.BaseService;
import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.QrtzSimpleTriggersMapper;
import com.test.erp.dao.model.QrtzSimpleTriggers;
import com.test.erp.rpc.api.QrtzSimpleTriggersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* QrtzSimpleTriggersService实现
* Created by u8 on 2019/9/30.
*/
@Service
@Transactional
@BaseService
public class QrtzSimpleTriggersServiceImpl extends MpBaseServiceImpl<QrtzSimpleTriggersMapper, QrtzSimpleTriggers> implements QrtzSimpleTriggersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QrtzSimpleTriggersServiceImpl.class);

    @Autowired
    QrtzSimpleTriggersMapper qrtzSimpleTriggersMapper;

}