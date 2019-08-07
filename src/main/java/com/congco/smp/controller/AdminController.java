package com.congco.smp.controller;

import com.congco.smp.pojo.Admin;
import com.congco.smp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * created on 2019/8/7 下午4:19
 *
 * @author congco
 */
@RestController
@RequestMapping("admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    /**
     * 测试方法，所以使用get，方便测试
     * @return
     */
    @GetMapping
    public void addAdmin(){
        Admin admin = new Admin();
        admin.setUsername("congco");
        admin.setPassword("zc1234");
        admin.setCreateTime(new Date());
        admin.setUpdateTime(new Date());
        this.adminService.addAdmin(admin);
        System.out.println(admin.toString());
    }

}
