package com.test.erp.rpc.service.impl;



import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.ScheduleJobLogMapper;
import com.test.erp.dao.model.ScheduleJobLog;
import com.test.erp.rpc.api.ScheduleJobLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ScheduleJobLogService实现
* Created by u8 on 2018/5/4.
*/
@Service
@Transactional
public class ScheduleJobLogServiceImpl extends MpBaseServiceImpl<ScheduleJobLogMapper, ScheduleJobLog> implements ScheduleJobLogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleJobLogServiceImpl.class);

    @Autowired
    ScheduleJobLogMapper scheduleJobLogMapper;

}