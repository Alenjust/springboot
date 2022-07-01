package com.Alenjust.studentmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname UserController
 * @Description 管理员控制层
 * @Date 2021/7/29 17:51
 * @Created Alenjust
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/list")
    public String list(){
        return "/admin/admin_list";
    }
}
