package com.wbj.gulimall.order.dao;

import com.wbj.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
*  @author wbj
 *  @email 1501354669@qq.com
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
