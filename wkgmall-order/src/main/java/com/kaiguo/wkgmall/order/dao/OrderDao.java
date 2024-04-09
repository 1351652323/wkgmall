package com.kaiguo.wkgmall.order.dao;

import com.kaiguo.wkgmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wkg
 * @email 1351652323@qq.com
 * @date 2024-04-09 19:34:41
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
