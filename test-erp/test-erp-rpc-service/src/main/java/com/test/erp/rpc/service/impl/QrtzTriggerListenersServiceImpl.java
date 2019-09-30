package com.test.erp.rpc.service.impl;

import com.test.common.annotation.BaseService;
import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.QrtzTriggerListenersMapper;
import com.test.erp.dao.model.QrtzTriggerListeners;
import com.test.erp.rpc.api.QrtzTriggerListenersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* QrtzTriggerListenersService实现
* Created by u8 on 2019/9/30.
*/
@Service
@Transactional
@BaseService
public class QrtzTriggerListenersServiceImpl extends MpBaseServiceImpl<QrtzTriggerListenersMapper, QrtzTriggerListeners> implements QrtzTriggerListenersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QrtzTriggerListenersServiceImpl.class);

    @Autowired
    QrtzTriggerListenersMapper qrtzTriggerListenersMapper;

}