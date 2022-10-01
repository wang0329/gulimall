package com.wbj.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wbj.common.utils.PageUtils;
import com.wbj.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
*  @author wbj
 *  @email 1501354669@qq.com
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

