package com.wbj.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wbj.common.utils.PageUtils;
import com.wbj.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
*  @author wbj
 *  @email 1501354669@qq.com
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

