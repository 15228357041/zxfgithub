package com.test.erp.rpc.service.impl;

import com.test.common.annotation.BaseService;
import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.QrtzJobListenersMapper;
import com.test.erp.dao.model.QrtzJobListeners;
import com.test.erp.rpc.api.QrtzJobListenersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* QrtzJobListenersService实现
* Created by u8 on 2019/9/30.
*/
@Service
@Transactional
@BaseService
public class QrtzJobListenersServiceImpl extends MpBaseServiceImpl<QrtzJobListenersMapper, QrtzJobListeners> implements QrtzJobListenersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QrtzJobListenersServiceImpl.class);

    @Autowired
    QrtzJobListenersMapper qrtzJobListenersMapper;

}