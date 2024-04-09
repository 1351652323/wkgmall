package com.kaiguo.wkgmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaiguo.wkgmall.common.utils.PageUtils;
import com.kaiguo.wkgmall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author wkg
 * @email 1351652323@qq.com
 * @date 2024-04-09 19:34:41
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

