package com.github.xf717.managementweb.controller.auth.dto;

import com.github.xf717.common.framework.vo.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * 不是所有的属性都需要，用于接收参数，在开发的时候可以自定义属性，这里默认显示所有的属性， 添加了swagger API 配置 比如：create_time、update_time、create_by、update_by
 * 就可以去掉
 *
 * @author ding
 * @date 2021-03-24 19:50:39
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "BaseElementPageDTO", description = "分页:")
public class BaseElementPageDTO extends PageParam {


  private static final long serialVersionUID = -1699117258317683918L;
  /**
   * 资源名称
   */
  @ApiModelProperty(name = "name", value = "资源名称")
  private String name;


  /**
   * 资源关联菜单
   */
  @ApiModelProperty(name = "menuId", value = "资源关联菜单id")
  private Long menuId;


}
