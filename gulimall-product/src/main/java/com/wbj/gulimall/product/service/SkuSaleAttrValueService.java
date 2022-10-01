package com.wbj.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wbj.common.utils.PageUtils;
import com.wbj.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
*  @author wbj
 *  @email 1501354669@qq.com
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

