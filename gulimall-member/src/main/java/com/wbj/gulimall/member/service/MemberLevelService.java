package com.wbj.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wbj.common.utils.PageUtils;
import com.wbj.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *  @author wbj
 *  @email 1501354669@qq.com
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

