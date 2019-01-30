package com.test.erp.server.controller;


import com.test.erp.dao.model.Users;
import com.test.erp.rpc.api.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @Autowired
    UsersService usersService;

    @RequestMapping("/ctse")
    public String test(Model model){
        Users users = usersService.selectById(1);
        System.out.println("users======" + users);
        return "";
    }
}
