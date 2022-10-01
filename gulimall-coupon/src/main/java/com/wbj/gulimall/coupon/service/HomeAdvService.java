package com.wbj.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wbj.common.utils.PageUtils;
import com.wbj.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 *  @author wbj
 *  @email 1501354669@qq.com
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

