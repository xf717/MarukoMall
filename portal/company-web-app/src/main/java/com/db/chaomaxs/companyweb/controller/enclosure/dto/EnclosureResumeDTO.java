package com.db.chaomaxs.companyweb.controller.enclosure.dto;

import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * 企业附件简历
 *
 * @author xiaofeng
 * @date 2021-03-26 10:18:33
 */
@Data
@Accessors(chain = true)
public class EnclosureResumeDTO {

  /**
   *
   */
  private Long id;

  /**
   * 企业投递表主键id
   */
  private Long companyDeliveryrId;

  /**
   * 对应资源库id
   */
  private Long resourceId;

  /**
   * 是否删除
   */
  private Integer isDeleted;

  /**
   * 创建人
   */
  private Long createBy;

  /**
   * 创建时间
   */
  private Date createTime;

  /**
   * 修改人
   */
  private Long updateBy;

  /**
   * 修改时间
   */
  private Date updateTime;


}