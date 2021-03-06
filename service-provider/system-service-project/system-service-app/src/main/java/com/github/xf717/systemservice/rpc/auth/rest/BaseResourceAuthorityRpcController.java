package com.github.xf717.systemservice.rpc.auth.rest;

import com.github.xf717.common.framework.msg.BaseResponse;
import com.github.xf717.common.framework.msg.ObjectRestResponse;
import com.github.xf717.common.framework.msg.TableResultResponse;
import com.github.xf717.systemservice.rpc.auth.BaseResourceAuthorityRpcImpl;
import com.github.xf717.systemservice.rpc.auth.dto.BaseResourceAuthorityCreateReqDTO;
import com.github.xf717.systemservice.rpc.auth.dto.BaseResourceAuthorityListQueryReqDTO;
import com.github.xf717.systemservice.rpc.auth.dto.BaseResourceAuthorityPageReqDTO;
import com.github.xf717.systemservice.rpc.auth.dto.BaseResourceAuthorityRespDTO;
import com.github.xf717.systemservice.rpc.auth.dto.BaseResourceAuthorityUpdateReqDTO;
import com.github.xf717.systemservice.rpc.auth.facade.api.BaseResourceAuthorityApi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ding
 * @date 2021-03-24 19:50:39
 */
@RestController
public class BaseResourceAuthorityRpcController implements BaseResourceAuthorityApi {

  @Autowired
  private BaseResourceAuthorityRpcImpl baseResourceAuthorityRpc;

  @Override
  public BaseResponse save(
      @RequestBody BaseResourceAuthorityCreateReqDTO baseResourceAuthorityCreateReqDTO) {
    return baseResourceAuthorityRpc.save(baseResourceAuthorityCreateReqDTO);
  }

  @Override
  public BaseResponse update(
      @RequestBody BaseResourceAuthorityUpdateReqDTO baseResourceAuthorityUpdateReqDTO) {
    return baseResourceAuthorityRpc.update(baseResourceAuthorityUpdateReqDTO);
  }

  @Override
  public BaseResponse remove(@PathVariable("id") Long id) {
    return baseResourceAuthorityRpc.remove(id);
  }

  @Override
  public ObjectRestResponse<BaseResourceAuthorityRespDTO> getBaseResourceAuthorityById(
      @PathVariable("id") Long id) {
    return baseResourceAuthorityRpc.getBaseResourceAuthorityById(id);
  }

  @Override
  public ObjectRestResponse<List<BaseResourceAuthorityRespDTO>> listBaseResourceAuthoritys(
      @RequestBody BaseResourceAuthorityListQueryReqDTO listQuery) {
    return baseResourceAuthorityRpc.listBaseResourceAuthoritys(listQuery);
  }

  @Override
  public TableResultResponse<BaseResourceAuthorityRespDTO> page(
      @RequestBody BaseResourceAuthorityPageReqDTO page) {
    return baseResourceAuthorityRpc.page(page);
  }
}
