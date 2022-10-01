package com.wbj.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wbj.common.utils.PageUtils;
import com.wbj.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 *  @author wbj
 *  @email 1501354669@qq.com
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

