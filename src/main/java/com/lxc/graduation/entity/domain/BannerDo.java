package com.lxc.graduation.entity.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: ck
 * @Description:
 * @Date: Create in 17:17 2021/1/20
 */
@Data
@TableName("banner")//表名映射
public class BannerDo {

    private Integer id;
    private String img;
    private String url;
    private Integer weight;
}
