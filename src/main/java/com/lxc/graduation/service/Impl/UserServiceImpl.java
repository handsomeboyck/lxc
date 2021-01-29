package com.lxc.graduation.service.Impl;

import com.lxc.graduation.service.UserService;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: ck
 * @Description:
 * @Date: Create in 20:07 2021/1/19
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public void print() {
        log.info("print");


    }
}
