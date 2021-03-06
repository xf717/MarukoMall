package com.github.xf717.managementweb.controller.dict;

import com.github.xf717.common.framework.msg.TableResultResponse;
import com.github.xf717.managementweb.controller.dict.dto.DataDictionaryTypePageDTO;
import com.github.xf717.managementweb.controller.dict.vo.DataDictionaryTypeVO;
import com.github.xf717.managementweb.manager.dict.DataDictionaryTypeManager;
import com.github.xf717.security.auth.client.annotation.IgnoreUserToken;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 字典分类信息表
 *
 * @author xiaofeng
 * @date 2021-03-29 17:42:11
 */
@Api(value = "字典分类信息表", description = "字典分类信息表", tags = "DataDictionaryType")
@RestController
@RequestMapping("/rest/dataDictionaryType")
public class DataDictionaryTypeController {

  @Autowired
  private DataDictionaryTypeManager dataDictionaryTypeManager;


  @ApiOperation(value = "根据参数查询字典分类信息,分页", nickname = "page")
  @PostMapping("/page")
  @IgnoreUserToken
  public TableResultResponse<DataDictionaryTypeVO> page(
      @RequestBody DataDictionaryTypePageDTO pageReqDTO) {
    return dataDictionaryTypeManager.pageDataDictionaryType(pageReqDTO);
  }

}
