package com.github.xf717.managementweb.convert.auth;

import com.github.xf717.common.framework.msg.TableResultResponse;
import com.github.xf717.managementweb.controller.auth.dto.BaseGroupLeaderAddDTO;
import com.github.xf717.managementweb.controller.auth.dto.BaseGroupLeaderDTO;
import com.github.xf717.managementweb.controller.auth.dto.BaseGroupLeaderPageDTO;
import com.github.xf717.managementweb.controller.auth.dto.BaseGroupLeaderUpdateDTO;
import com.github.xf717.managementweb.controller.auth.vo.BaseGroupLeaderVO;
import com.github.xf717.systemservice.rpc.auth.dto.BaseGroupLeaderCreateReqDTO;
import com.github.xf717.systemservice.rpc.auth.dto.BaseGroupLeaderListQueryReqDTO;
import com.github.xf717.systemservice.rpc.auth.dto.BaseGroupLeaderPageReqDTO;
import com.github.xf717.systemservice.rpc.auth.dto.BaseGroupLeaderRespDTO;
import com.github.xf717.systemservice.rpc.auth.dto.BaseGroupLeaderUpdateReqDTO;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * 应用层实体对象转换
 *
 * @author ding
 * @date 2021-03-24 19:50:39
 */
@Mapper
public interface BaseGroupLeaderConvert {

  BaseGroupLeaderConvert INSTANCE = Mappers.getMapper(
      BaseGroupLeaderConvert.class);

  /**
   * AddDTO convert AddBO
   *
   * @param addDTO 转换对象
   * @return
   */
  @Mappings({})
  BaseGroupLeaderCreateReqDTO convert(BaseGroupLeaderAddDTO addDTO);

  /**
   * UpdateDTO convert UpdateBO
   *
   * @param updateDTO 转换对象
   * @return
   */
  @Mappings({})
  BaseGroupLeaderUpdateReqDTO convert(BaseGroupLeaderUpdateDTO updateDTO);

  @Mappings({})
  BaseGroupLeaderListQueryReqDTO convert(BaseGroupLeaderDTO baseGroupLeaderDTO);

  /**
   * BO convert VO
   *
   * @param baseGroupLeaderRespDTO 转换对象
   * @return
   */
  @Mappings({})
  BaseGroupLeaderVO convert(BaseGroupLeaderRespDTO baseGroupLeaderRespDTO);

  @Mappings({})
  List<BaseGroupLeaderVO> convertList(List<BaseGroupLeaderRespDTO> listResp);

  /**
   * 分页转换
   *
   * @param tableResultResponse 转换对象
   * @return
   */
  @Mappings({})
  TableResultResponse<BaseGroupLeaderVO> convert(
      TableResultResponse<BaseGroupLeaderRespDTO> tableResultResponse);

  @Mappings({})
  BaseGroupLeaderPageReqDTO convert(BaseGroupLeaderPageDTO baseGroupLeaderPageDTO);

}
