package com.db.chaomaxs.systemservice.rpc.dict;

import com.db.chaomaxs.common.framework.exception.enums.GlobalErrorCodeConstants;
import com.db.chaomaxs.common.framework.msg.TableResultResponse;
import com.db.chaomaxs.common.framework.vo.PageResult;
import com.db.chaomaxs.systemservice.manager.dict.DataDictionaryTypeManager;
import com.db.chaomaxs.systemservice.rpc.dict.dto.DataDictionaryTypePageReqDTO;
import com.db.chaomaxs.systemservice.rpc.dict.dto.DataDictionaryTypeRespDTO;
import com.db.chaomaxs.systemservice.rpc.dict.facade.DataDictionaryTypeRpcFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RPC 服务实现类
 *
 * @author xiaofeng
 * @date 2021-03-29 17:42:11
 */
@Slf4j
@Service
public class DataDictionaryTypeRpcImpl implements DataDictionaryTypeRpcFacade {

  @Autowired
  private DataDictionaryTypeManager dataDictionaryTypeManager;

  @Override
  public TableResultResponse<DataDictionaryTypeRespDTO> page(DataDictionaryTypePageReqDTO pageReqDTO) {
    PageResult<DataDictionaryTypeRespDTO> pageResult = dataDictionaryTypeManager.pageDataDictionaryType(pageReqDTO);
    TableResultResponse<DataDictionaryTypeRespDTO> tableResultResponse = new TableResultResponse(pageResult.getTotal(),pageResult.getList());
    tableResultResponse.setCode(GlobalErrorCodeConstants.SUCCESS.getCode());
    return tableResultResponse;
  }

}
