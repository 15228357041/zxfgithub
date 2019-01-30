package com.test.erp.server.controller;

import com.test.common.base.BaseController;
import com.test.erp.dao.model.UpmsUser;
import com.test.erp.dao.model.UpmsUserExample;
import com.test.erp.rpc.api.UpmsUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @classname: test
 * @description:
 * @author: zhuxufeng
 * @date: 2018/4/24 15:42
 * @version: 1.0
 **/
@Controller
@RequestMapping(value="")
public class test extends BaseController{
    @Autowired
    private UpmsUserService upmsUserService;

    private final static Logger LOGGER = LoggerFactory.getLogger(test.class);

    @RequestMapping(value="test")
    public void test(){
        UpmsUserExample ex = new UpmsUserExample();
        UpmsUser upmsUser = upmsUserService.selectFirstByExample(ex);
        System.out.print("upmsUser======="+upmsUser.toString());
        LOGGER.debug("upmsUser======="+upmsUser.toString());
    }
}
