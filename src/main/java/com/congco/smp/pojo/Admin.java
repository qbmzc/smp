package com.congco.smp.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 2019年08月07日16:05:01
 * @author congco
 */
@Setter
@Getter
@ToString
public class Admin implements Serializable {


    private static final long serialVersionUID = 5192999592371832697L;
    private Long id;
    private String username;
    private String password;
    private Date createTime;
    private Date updateTime;
}
