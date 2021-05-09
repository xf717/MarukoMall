package com.db.chaomaxs.managementweb.controller.auth.dto;

import com.db.chaomaxs.common.framework.vo.PageParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
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
@ApiModel(value = "BaseUserPageDTO", description = "分页:")
public class BaseUserPageDTO extends PageParam {

  private static final long serialVersionUID = 2692727674533552633L;
  /**
   *
   */
  @ApiModelProperty(name = "id", value = "")
  private Long id;

  /**
   *
   */
  @ApiModelProperty(name = "username", value = "")
  private String username;

  /**
   *
   */
  @ApiModelProperty(name = "password", value = "")
  private String password;

  /**
   *
   */
  @ApiModelProperty(name = "name", value = "")
  private String name;

  /**
   *
   */
  @ApiModelProperty(name = "birthday", value = "")
  private String birthday;

  /**
   *
   */
  @ApiModelProperty(name = "address", value = "")
  private String address;

  /**
   *
   */
  @ApiModelProperty(name = "mobilePhone", value = "")
  private String mobilePhone;

  /**
   *
   */
  @ApiModelProperty(name = "telPhone", value = "")
  private String telPhone;

  /**
   *
   */
  @ApiModelProperty(name = "email", value = "")
  private String email;

  /**
   *
   */
  @ApiModelProperty(name = "sex", value = "")
  private String sex;

  /**
   *
   */
  @ApiModelProperty(name = "type", value = "")
  private String type;

  /**
   *
   */
  @ApiModelProperty(name = "status", value = "")
  private String status;

  /**
   *
   */
  @ApiModelProperty(name = "description", value = "")
  private String description;

  /**
   *
   */
  @ApiModelProperty(name = "crtHost", value = "")
  private String crtHost;

  /**
   * 是否删除:1 是  0 否  默认：0
   */
  @ApiModelProperty(name = "isDeleted", value = "是否删除:1 是  0 否  默认：0")
  private Integer isDeleted;

  /**
   * 创建时间
   */
  @ApiModelProperty(name = "createTime", value = "创建时间")
  private Date createTime;

  /**
   * 创建人
   */
  @ApiModelProperty(name = "createBy", value = "创建人")
  private Long createBy;

  /**
   * 修改时间
   */
  @ApiModelProperty(name = "updateTime", value = "修改时间")
  private Date updateTime;

  /**
   * 修改人
   */
  @ApiModelProperty(name = "updateBy", value = "修改人")
  private Long updateBy;


}
