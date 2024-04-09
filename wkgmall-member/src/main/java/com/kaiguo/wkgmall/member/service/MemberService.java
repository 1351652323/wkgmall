package com.kaiguo.wkgmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaiguo.wkgmall.common.utils.PageUtils;
import com.kaiguo.wkgmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wkg
 * @email 1351652323@qq.com
 * @date 2024-04-09 20:05:11
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

