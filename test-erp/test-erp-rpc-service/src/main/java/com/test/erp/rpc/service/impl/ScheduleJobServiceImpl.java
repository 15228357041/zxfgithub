package com.test.erp.rpc.service.impl;


import com.test.common.base.MpBaseServiceImpl;
import com.test.erp.dao.mapper.ScheduleJobMapper;
import com.test.erp.dao.model.ScheduleJob;
import com.test.erp.rpc.api.ScheduleJobService;
import com.test.erp.util.ScheduleUtils;
import org.quartz.Scheduler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* ScheduleJobService实现
* Created by u8 on 2018/5/4.
*/
@Service
@Transactional
public class ScheduleJobServiceImpl extends MpBaseServiceImpl<ScheduleJobMapper, ScheduleJob> implements ScheduleJobService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleJobServiceImpl.class);

    @Autowired
    ScheduleJobMapper scheduleJobMapper;
    @Autowired
    private Scheduler scheduler;

    @Override
    public void schedulerRun(String id) {
        ScheduleJob scheduleJob = scheduleJobMapper.selectById(id);
        ScheduleUtils.run(scheduler, scheduleJob);
    }

    @Override
    public void createScheduleJob(ScheduleJob scheduleJob) {
        scheduleJobMapper.insert(scheduleJob);
        ScheduleUtils.createScheduleJob(scheduler, scheduleJob);
    }

    @Override
    public void updateScheduleJob(ScheduleJob scheduleJob) {
        scheduleJobMapper.updateById(scheduleJob);
        ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);
    }

    @Override
    public void deleteScheduleJob(String id) {
        scheduleJobMapper.deleteById(id);
        ScheduleUtils.deleteScheduleJob(scheduler, id);
    }
}