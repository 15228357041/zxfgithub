package com.test.erp.rpc.service.impl;

import com.test.common.annotation.BaseService;
import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.QrtzBlobTriggersMapper;
import com.test.erp.dao.model.QrtzBlobTriggers;

import com.test.erp.rpc.api.QrtzBlobTriggersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* QrtzBlobTriggersService实现
* Created by u8 on 2019/9/30.
*/
@Service
@Transactional
@BaseService
public class QrtzBlobTriggersServiceImpl extends MpBaseServiceImpl<QrtzBlobTriggersMapper, QrtzBlobTriggers> implements QrtzBlobTriggersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QrtzBlobTriggersServiceImpl.class);

    @Autowired
    QrtzBlobTriggersMapper qrtzBlobTriggersMapper;

}