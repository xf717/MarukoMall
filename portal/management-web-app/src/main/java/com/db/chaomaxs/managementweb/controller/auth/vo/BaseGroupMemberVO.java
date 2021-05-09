package com.db.chaomaxs.managementweb.controller.auth.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * @author ding
 * @date 2021-03-24 19:50:39
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "BaseGroupMemberVO", description = "")
public class BaseGroupMemberVO implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   *
   */
  @ApiModelProperty(name = "id", value = "")
  private Long id;

  /**
   *
   */
  @ApiModelProperty(name = "groupId", value = "")
  private Long groupId;

  /**
   *
   */
  @ApiModelProperty(name = "userId", value = "")
  private Long userId;

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
