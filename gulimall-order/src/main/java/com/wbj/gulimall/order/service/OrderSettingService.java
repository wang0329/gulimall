package com.wbj.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wbj.common.utils.PageUtils;
import com.wbj.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
*  @author wbj
 *  @email 1501354669@qq.com
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

