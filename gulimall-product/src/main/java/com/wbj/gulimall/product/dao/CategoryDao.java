package com.wbj.gulimall.product.dao;

import com.wbj.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
*  @author wbj
 *  @email 1501354669@qq.com
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
