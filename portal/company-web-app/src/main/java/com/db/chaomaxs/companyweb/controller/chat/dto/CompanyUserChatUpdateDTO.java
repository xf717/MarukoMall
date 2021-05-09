package com.db.chaomaxs.companyweb.controller.chat.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * 不是所有的属性都需要，用于接收参数，在开发的时候可以自定义属性，这里默认显示所有的属性， 添加了swagger API 配置 比如：create_time、update_time、create_by、update_by
 * 就可以去掉 企业我的沟通
 *
 * @author xiaofeng
 * @date 2021-03-26 10:18:33
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "CompanyUserChatUpdateDTO", description = "更新企业我的沟通")
public class CompanyUserChatUpdateDTO {

  private static final long serialVersionUID = 1L;

  /**
   * 主键id
   */
  @ApiModelProperty(name = "id", value = "主键id")
  private Long id;

  /**
   * 企业用户id
   */
  @ApiModelProperty(name = "companyUserId", value = "企业用户id")
  private Long companyUserId;

  /**
   * 企业id
   */
  @ApiModelProperty(name = "companyId", value = "企业id")
  private Long companyId;

  /**
   * 用户id
   */
  @ApiModelProperty(name = "userId", value = "用户id")
  private Long userId;

  /**
   * 职位id
   */
  @ApiModelProperty(name = "positionId", value = "职位id")
  private Long positionId;

  /**
   * 沟通状态:0-未沟通 1-已沟通  2-其它
   */
  @ApiModelProperty(name = "status", value = "沟通状态:0-未沟通 1-已沟通  2-其它")
  private Integer status;

  /**
   * 排序
   */
  @ApiModelProperty(name = "sort", value = "排序")
  private Integer sort;

  /**
   * 是否删除 0 - 否 1- 是
   */
  @ApiModelProperty(name = "isDeleted", value = "是否删除 0 - 否 1- 是")
  private Integer isDeleted;

  /**
   * 创建人
   */
  @ApiModelProperty(name = "createBy", value = "创建人")
  private Long createBy;

  /**
   * 创建时间
   */
  @ApiModelProperty(name = "createTime", value = "创建时间")
  private Date createTime;

  /**
   * 修改时间
   */
  @ApiModelProperty(name = "updateBy", value = "修改时间")
  private Long updateBy;

  /**
   * 修改时间
   */
  @ApiModelProperty(name = "updateTime", value = "修改时间")
  private Date updateTime;


}
