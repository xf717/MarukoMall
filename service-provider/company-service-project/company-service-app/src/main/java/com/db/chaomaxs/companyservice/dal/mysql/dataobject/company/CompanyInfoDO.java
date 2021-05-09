package com.db.chaomaxs.companyservice.dal.mysql.dataobject.company;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.db.chaomaxs.mybatis.core.dataobject.DeletableDO;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * 企业_基础信息
 *
 * @author xiaofeng
 * @date 2021-03-26 10:18:33
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("company_info")
public class CompanyInfoDO extends DeletableDO {

  /**
   * 系统id
   */
  private Long id;

  /**
   * 用户id
   */
  private Long userId;

  /**
   * 企业LOGO图片地址
   */
  private String logoUrl;

  /**
   * 所属行业id,关联行业字典表id
   */
  private Long industryId;

  /**
   * 所属行业名称,冗余字段
   */
  private String industryName;

  /**
   * 省名称
   */
  private String provinceName;

  /**
   * 省编号
   */
  private String provinceCode;

  /**
   * 市名称
   */
  private String cityName;

  /**
   * 市编号
   */
  private String cityCode;

  /**
   * 区名称
   */
  private String areaName;

  /**
   * 区编号
   */
  private String areaCode;

  /**
   * 详细地址
   */
  private String address;

  /**
   * 公司全称
   */
  private String fullName;

  /**
   * 公司简称
   */
  private String shortName;

  /**
   * 公司规模,关联数据字典表id
   */
  private Long scopeDictionaryId;

  /**
   * 发展阶段
   */
  private Long developmentStageDictionaryId;

  /**
   * 营业执照图片url
   */
  private String licenseUrl;

  /**
   * 开始工作时间
   */
  private String startWorkTime;

  /**
   * 工作结束时间
   */
  private String endWorkTime;

  /**
   * 休息时间
   */
  private Long restTimeDictionaryId;

  /**
   * 加班情况,字典表id
   */
  private Long workOvertimeDictionaryId;

  /**
   * 公司简介
   */
  private String intro;

  /**
   * 启用状态(1启用 0未启用) 默认-0
   */
  @TableField("is_enabled")
  private Integer enabled;

  /**
   * 状态：0：未审核  1.审核通过  默认：0
   */
  private Integer status;

  /**
   * 经度
   */
  private BigDecimal longitude;

  /**
   * 纬度
   */
  private BigDecimal latitude;

  /**
   * 商圈
   */
  private String businessDistrict;


}
