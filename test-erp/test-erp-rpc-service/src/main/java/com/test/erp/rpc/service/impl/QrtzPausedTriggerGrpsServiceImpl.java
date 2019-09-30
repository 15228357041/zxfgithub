package com.test.erp.rpc.service.impl;

import com.test.common.annotation.BaseService;
import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.QrtzPausedTriggerGrpsMapper;
import com.test.erp.dao.model.QrtzPausedTriggerGrps;
import com.test.erp.rpc.api.QrtzPausedTriggerGrpsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* QrtzPausedTriggerGrpsService实现
* Created by u8 on 2019/9/30.
*/
@Service
@Transactional
@BaseService
public class QrtzPausedTriggerGrpsServiceImpl extends MpBaseServiceImpl<QrtzPausedTriggerGrpsMapper, QrtzPausedTriggerGrps> implements QrtzPausedTriggerGrpsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QrtzPausedTriggerGrpsServiceImpl.class);

    @Autowired
    QrtzPausedTriggerGrpsMapper qrtzPausedTriggerGrpsMapper;

}