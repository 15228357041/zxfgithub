package com.test.erp.rpc.api;


import com.test.common.base.MpBaseService;
import com.test.erp.dao.model.ScheduleJob;

/**
* ScheduleJobService接口
* Created by shuzheng on 2018/5/4.
*/
public interface ScheduleJobService extends MpBaseService<ScheduleJob> {

    void schedulerRun(String id);

    void createScheduleJob(ScheduleJob scheduleJob);

    void updateScheduleJob(ScheduleJob scheduleJob);

    void deleteScheduleJob(String id);
}