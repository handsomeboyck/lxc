package com.lxc.graduation.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lxc.graduation.dao.BannerMapper;
import com.lxc.graduation.entity.domain.BannerDo;
import com.lxc.graduation.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: ck
 * @Description:
 * @Date: Create in 20:02 2021/1/19
 */
@RestController
@RequestMapping("/pub/v1/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private BannerMapper bannerMapper;
    @RequestMapping("/test")
    public void test()
    {
//        log.info("controller");
//        System.out.println("test");
//        userService.print();

        log.info("result"+bannerMapper.selectList(new QueryWrapper<BannerDo>()));
        log.info("result"+bannerMapper.selectById(1));
        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        log.info("result"+bannerMapper.selectByMap(map));

        List<Integer> idList = new ArrayList<>();
        idList.add(1);
        idList.add(2);
        bannerMapper.deleteBatchIds(idList);

//        Wrapper<BannerDo> wrapper = new QueryWrapper<BannerDo>().eq("id",1).like("url","xxx").orderByAsc("id");



    }



}
