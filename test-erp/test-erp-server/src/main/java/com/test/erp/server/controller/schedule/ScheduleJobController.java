package com.test.erp.server.controller.schedule;


import com.test.common.base.BaseController;
import com.test.common.util.Result;
import com.test.common.util.ResultUtil;
import com.test.erp.dao.model.ScheduleJob;
import com.test.erp.rpc.api.ScheduleJobService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @classname: ScheduleJobController
 * @description: TODO
 * @author: zhuxufeng
 * @date: 2018/5/4 19:00
 * @version: 1.0
 **/

@Controller
@RequestMapping(value = "/scheduleJob")
public class ScheduleJobController extends BaseController {

    @Autowired
    private ScheduleJobService scheduleJobService;


    private final static Logger LOGGER = LoggerFactory.getLogger(BaseController.class);


    @RequestMapping(value = "/run")
    public Result run(String id){
        try {
            id = "9f188fae3f3243819b2bfa76f27c2119";
            ScheduleJob scheduleJob = scheduleJobService.selectById(id);
            scheduleJobService.schedulerRun(id);
            return ResultUtil.success();
        }catch (Exception e){
            return ResultUtil.error(10002,"执行定时器失败");
        }
    }
    /***
     * 添加、更新定时任务的接口
     */

    @RequestMapping(value = "save")
    @ResponseBody
    public Result save(ScheduleJob scheduleJob, Model model, RedirectAttributes redirectAttributes) {
       try {
           if(StringUtils.isNotEmpty(scheduleJob.getId())) {
               scheduleJobService.updateScheduleJob(scheduleJob);
               return ResultUtil.success();
           }else{
               scheduleJobService.createScheduleJob(scheduleJob);
               return ResultUtil.success();
           }
       }catch (Exception e){
           LOGGER.debug("异常信息"+e.getMessage());
           return ResultUtil.error(10002, "创建定时任务失败");
       }
    }

    /***
     * 删除定时任务接口
     *
     */
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ResponseBody
    public Result delete(String id) {
        scheduleJobService.deleteScheduleJob(id);
        return ResultUtil.success();
    }


    @ModelAttribute
    public ScheduleJob get(@RequestParam(required=false) String id) {

        ScheduleJob entity = null;
        if (id != null){
            entity = scheduleJobService.selectById(id);
        }
        if (entity == null){
            entity = new ScheduleJob();
        }
        return entity;
    }


}
