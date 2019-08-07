package com.congco.smp.service;

import com.congco.smp.mapper.AdminMapper;
import com.congco.smp.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created on 2019年08月07日16:14:48
 * @author congco
 */
@Service
public class AdminService {


    private final AdminMapper adminMapper;

    public AdminService(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    /**
     * 保存
     * @param admin
     * @return
     */
    public Integer addAdmin(Admin admin){
        return this.adminMapper.addAdmin(admin);
    }
}
