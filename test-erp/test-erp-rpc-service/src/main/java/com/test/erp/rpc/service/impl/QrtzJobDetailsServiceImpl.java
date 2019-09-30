package com.test.erp.rpc.service.impl;

import com.test.common.annotation.BaseService;
import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.QrtzJobDetailsMapper;
import com.test.erp.dao.model.QrtzJobDetails;
import com.test.erp.rpc.api.QrtzJobDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* QrtzJobDetailsService实现
* Created by u8 on 2019/9/30.
*/
@Service
@Transactional
@BaseService
public class QrtzJobDetailsServiceImpl extends MpBaseServiceImpl<QrtzJobDetailsMapper, QrtzJobDetails> implements QrtzJobDetailsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QrtzJobDetailsServiceImpl.class);

    @Autowired
    QrtzJobDetailsMapper qrtzJobDetailsMapper;

}