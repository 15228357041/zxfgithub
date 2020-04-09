package com.test.erp.server.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.test.erp.dao.model.Users;
import com.test.erp.rpc.api.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

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
    UsersService usersService;
    @RequestMapping("/ctse")
    public String test(Model model){
        EntityWrapper ew = new EntityWrapper(new Users());
        ew.eq("id", "1' OR '1'='1");
        ew.setSqlSelect("id,userkey");
        ew.orderBy("id", true).orderBy("id", true);
        usersService.selectOne(ew);
        System.out.println("hello world");
        return "";
    }
}
