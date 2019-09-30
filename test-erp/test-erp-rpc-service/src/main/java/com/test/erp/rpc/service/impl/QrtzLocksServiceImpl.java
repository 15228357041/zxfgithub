package com.test.erp.rpc.service.impl;

import com.test.common.annotation.BaseService;
import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.QrtzLocksMapper;
import com.test.erp.dao.model.QrtzLocks;
import com.test.erp.rpc.api.QrtzLocksService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* QrtzLocksService实现
* Created by u8 on 2019/9/30.
*/
@Service
@Transactional
@BaseService
public class QrtzLocksServiceImpl extends MpBaseServiceImpl<QrtzLocksMapper, QrtzLocks> implements QrtzLocksService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QrtzLocksServiceImpl.class);

    @Autowired
    QrtzLocksMapper qrtzLocksMapper;

}