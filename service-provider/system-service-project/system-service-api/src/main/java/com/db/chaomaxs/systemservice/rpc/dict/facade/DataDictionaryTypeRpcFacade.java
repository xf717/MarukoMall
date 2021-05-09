package com.db.chaomaxs.systemservice.rpc.dict.facade;

import com.db.chaomaxs.systemservice.rpc.dict.facade.api.DataDictionaryTypeApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 字典分类信息表
 *
 * @author xiaofeng
 * @date 2021-03-29 17:42:11
 */
@FeignClient(value = "${chaomax.system.serviceId}",configuration = {})
public interface DataDictionaryTypeRpcFacade extends DataDictionaryTypeApi {
}
