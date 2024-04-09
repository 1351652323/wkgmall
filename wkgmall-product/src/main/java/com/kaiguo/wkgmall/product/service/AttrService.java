package com.kaiguo.wkgmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaiguo.wkgmall.common.utils.PageUtils;
import com.kaiguo.wkgmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wkg
 * @email 1351652323@qq.com
 * @date 2024-04-09 17:12:07
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

