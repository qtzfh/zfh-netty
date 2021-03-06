package com.api.gateway.base;

import com.api.gateway.manager.service.verify.ApiBlackListService;
import com.api.gateway.manager.service.verify.ApiVerifySystemService;
import com.api.gateway.manager.service.verify.impl.ApiBlackListServiceImpl;
import com.api.gateway.manager.service.verify.impl.ApiVerifySystemServiceImpl;

/**
 * BaseService
 *
 * @author zhangfuhao
 * @Desc
 * @date 2018年11月24日
 * @Version V1.0
 */
public class BaseService {
    /**
     * api校验服务
     */
    public static final ApiVerifySystemService API_VERIFY_SYSTEM_SERVICE = new ApiVerifySystemServiceImpl();
    /**
     * api黑名单服务
     */
    public static final ApiBlackListService API_BLACK_LIST_SERVICE = new ApiBlackListServiceImpl();
}
