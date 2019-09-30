package com.test.erp.rpc.service.impl;

import com.test.common.annotation.BaseService;
import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.QrtzSchedulerStateMapper;
import com.test.erp.dao.model.QrtzSchedulerState;
import com.test.erp.rpc.api.QrtzSchedulerStateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* QrtzSchedulerStateService实现
* Created by u8 on 2019/9/30.
*/
@Service
@Transactional
@BaseService
public class QrtzSchedulerStateServiceImpl extends MpBaseServiceImpl<QrtzSchedulerStateMapper, QrtzSchedulerState> implements QrtzSchedulerStateService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QrtzSchedulerStateServiceImpl.class);

    @Autowired
    QrtzSchedulerStateMapper qrtzSchedulerStateMapper;

}