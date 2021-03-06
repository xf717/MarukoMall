package com.github.xf717.userservice.rpc.user.facade;

import com.github.xf717.userservice.rpc.user.facade.api.UserPositionCollectApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 用户_职位_收藏
 *
 * @author xiaofeng
 * @date 2021-03-29 12:47:47
 */
@FeignClient(value = "${chaomax.user.serviceId}",configuration = {})
public interface UserPositionCollectRpcFacade extends UserPositionCollectApi {
}
