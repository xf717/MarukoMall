package com.maruko.mall.user.server.client.facade;

import com.maruko.mall.user.server.client.facade.api.IUserThirdFacade;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 用户_第三方表
 *
 * @author xiaofeng
 * @date 2019-06-04 22:35:12
 */
@FeignClient(value = "${maruko-mall-user-server}")
public interface IUserThirdFeignClientFacade extends IUserThirdFacade {
}
