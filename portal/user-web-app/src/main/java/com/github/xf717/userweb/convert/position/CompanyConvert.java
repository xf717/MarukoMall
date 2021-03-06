package com.github.xf717.userweb.convert.position;

import com.github.xf717.companyservice.rpc.company.dto.CompanyInfoDetailRespDTO;
import com.github.xf717.userweb.controller.position.vo.CompanyInfoDetailVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


/**
 * 公司转换
 *
 * @author xiaofeng
 * @date 2021-04-06 17:45:09
 */
@Mapper
public interface CompanyConvert {

  CompanyConvert INSTANCE = Mappers.getMapper(CompanyConvert.class);

  /**
   * 公司信息转换
   *
   * @param companyInfo
   * @return
   */
  @Mapping(source = "userId", target = "companyUserId")
  CompanyInfoDetailVO convert(CompanyInfoDetailRespDTO companyInfo);
}
