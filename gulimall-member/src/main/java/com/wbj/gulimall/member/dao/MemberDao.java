package com.wbj.gulimall.member.dao;

import com.wbj.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 *  @author wbj
 *  @email 1501354669@qq.com
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
