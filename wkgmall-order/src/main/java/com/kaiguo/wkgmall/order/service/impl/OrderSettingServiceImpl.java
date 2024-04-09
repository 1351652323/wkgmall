package com.kaiguo.wkgmall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaiguo.wkgmall.common.utils.PageUtils;
import com.kaiguo.wkgmall.common.utils.Query;

import com.kaiguo.wkgmall.order.dao.OrderSettingDao;
import com.kaiguo.wkgmall.order.entity.OrderSettingEntity;
import com.kaiguo.wkgmall.order.service.OrderSettingService;


@Service("orderSettingService")
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingDao, OrderSettingEntity> implements OrderSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderSettingEntity> page = this.page(
                new Query<OrderSettingEntity>().getPage(params),
                new QueryWrapper<OrderSettingEntity>()
        );

        return new PageUtils(page);
    }

}