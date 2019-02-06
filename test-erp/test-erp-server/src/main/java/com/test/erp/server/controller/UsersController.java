package com.test.erp.server.controller;


import com.test.erp.rpc.api.BossPopedomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhuxufeng
 * @since 2019-01-18
 */
@Controller
@RequestMapping("/users")
public class UsersController {
    @Resource
    BossPopedomService bossPopedomService;

    @RequestMapping("/ctse")
    public String test(Model model){
        Method[] method = bossPopedomService.getClass().getMethods();
        bossPopedomService.test();
        bossPopedomService.del("1");
        System.out.println("热部署测试");
        return "";
    }
}
