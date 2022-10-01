package com.wbj.gulimall.order.dao;

import com.wbj.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
*  @author wbj
 *  @email 1501354669@qq.com
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
