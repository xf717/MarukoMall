package com.github.xf717.systemservice.rpc.content.facade;

import com.github.xf717.systemservice.rpc.content.facade.api.ProblemInformationApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 内容管理-问题信息表
 *
 * @author xiaofeng
 * @date 2021-03-29 18:03:04
 */
@FeignClient(value = "${chaomax.system.serviceId}",configuration = {})
public interface ProblemInformationRpcFacade extends ProblemInformationApi {
}
