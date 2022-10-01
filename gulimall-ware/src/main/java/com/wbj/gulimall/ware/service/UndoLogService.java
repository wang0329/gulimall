package com.wbj.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wbj.common.utils.PageUtils;
import com.wbj.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
*  @author wbj
 *  @email 1501354669@qq.com
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

