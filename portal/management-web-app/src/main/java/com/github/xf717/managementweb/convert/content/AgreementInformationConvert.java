package com.github.xf717.managementweb.convert.content;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import java.util.List;

import com.github.xf717.common.framework.msg.TableResultResponse;
import com.github.xf717.systemservice.rpc.content.dto.AgreementInformationCreateReqDTO;
import com.github.xf717.systemservice.rpc.content.dto.AgreementInformationListQueryReqDTO;
import com.github.xf717.systemservice.rpc.content.dto.AgreementInformationPageReqDTO;
import com.github.xf717.systemservice.rpc.content.dto.AgreementInformationRespDTO;
import com.github.xf717.systemservice.rpc.content.dto.AgreementInformationUpdateReqDTO;
import com.github.xf717.managementweb.controller.content.dto.AgreementInformationAddDTO;
import com.github.xf717.managementweb.controller.content.dto.AgreementInformationDTO;
import com.github.xf717.managementweb.controller.content.dto.AgreementInformationPageDTO;
import com.github.xf717.managementweb.controller.content.dto.AgreementInformationUpdateDTO;
import com.github.xf717.managementweb.controller.content.vo.AgreementInformationVO;


/**
 * 应用层实体对象转换内容管理-协议信息表
 * @author xiaofeng
 * @date 2021-03-29 18:03:04
 */
@Mapper
public interface AgreementInformationConvert {

        AgreementInformationConvert INSTANCE = Mappers.getMapper(AgreementInformationConvert.class);

  /**
* AddDTO convert AddBO
*
* @param addDTO 转换对象
* @return
*/
  @Mappings({})
      AgreementInformationCreateReqDTO convert(AgreementInformationAddDTO addDTO);

  /**
* UpdateDTO convert UpdateBO
*
* @param updateDTO 转换对象
* @return
*/
  @Mappings({})
      AgreementInformationUpdateReqDTO convert(AgreementInformationUpdateDTO updateDTO);

  /**
   *  对象转换
   * @param agreementInformationDTO 查询参数对象
   * @return
   */
  @Mappings({})
      AgreementInformationListQueryReqDTO convert(AgreementInformationDTO agreementInformationDTO);

  /**
   *  对象转成VO
   *
   * @param respDTO 转换对象
   * @return
   */
  @Mappings({})
      AgreementInformationVO convert(AgreementInformationRespDTO respDTO);

  /**
  * list 转换成 VO list
* @param listResp
* @return
*/
  @Mappings({})
  List<AgreementInformationVO> convertList(List<AgreementInformationRespDTO> listResp);

  /**
* 分页转换
*
* @param tableResultResponse 转换对象
* @return
*/
  @Mappings({})
  TableResultResponse<AgreementInformationVO> convert(
      TableResultResponse<AgreementInformationRespDTO> tableResultResponse);

  /**
  *  分页对象转换
* @param pageDTO
* @return
*/
  @Mappings({})
      AgreementInformationPageReqDTO convert(AgreementInformationPageDTO pageDTO);

}
