package com.kaiguo.wkgmall.coupon.dao;

import com.kaiguo.wkgmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author wkg
 * @email 1351652323@qq.com
 * @date 2024-04-09 19:59:59
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
