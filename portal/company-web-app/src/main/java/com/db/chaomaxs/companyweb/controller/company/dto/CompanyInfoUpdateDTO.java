package com.db.chaomaxs.companyweb.controller.company.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * 不是所有的属性都需要，用于接收参数，在开发的时候可以自定义属性，这里默认显示所有的属性， 添加了swagger API 配置 比如：create_time、update_time、create_by、update_by
 * 就可以去掉 企业_基础信息
 *
 * @author xiaofeng
 * @date 2021-03-26 10:18:33
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "CompanyInfoUpdateDTO", description = "更新企业_基础信息")
public class CompanyInfoUpdateDTO {

  /**
   * 系统id
   */
  @ApiModelProperty(name = "id", value = "系统id")
  private Long id;

  /**
   * 用户id
   */
  @ApiModelProperty(name = "userId", value = "用户id")
  private Long userId;

  /**
   * 企业LOGO图片地址
   */
  @ApiModelProperty(name = "logoUrl", value = "企业LOGO图片地址")
  private String logoUrl;

  /**
   * 所属行业id,关联行业字典表id
   */
  @ApiModelProperty(name = "industryId", value = "所属行业id,关联行业字典表id")
  private Long industryId;

  /**
   * 所属行业名称,冗余字段
   */
  @ApiModelProperty(name = "industryName", value = "所属行业名称,冗余字段")
  private String industryName;

  /**
   * 省名称
   */
  @ApiModelProperty(name = "provinceName", value = "省名称")
  private String provinceName;

  /**
   * 省编号
   */
  @ApiModelProperty(name = "provinceCode", value = "省编号")
  private String provinceCode;

  /**
   * 市名称
   */
  @ApiModelProperty(name = "cityName", value = "市名称")
  private String cityName;

  /**
   * 市编号
   */
  @ApiModelProperty(name = "cityCode", value = "市编号")
  private String cityCode;

  /**
   * 区名称
   */
  @ApiModelProperty(name = "areaName", value = "区名称")
  private String areaName;

  /**
   * 区编号
   */
  @ApiModelProperty(name = "areaCode", value = "区编号")
  private String areaCode;

  /**
   * 详细地址
   */
  @ApiModelProperty(name = "address", value = "详细地址")
  private String address;

  /**
   * 公司全称
   */
  @ApiModelProperty(name = "fullName", value = "公司全称")
  private String fullName;

  /**
   * 公司简称
   */
  @ApiModelProperty(name = "shortName", value = "公司简称")
  private String shortName;

  /**
   * 公司规模,关联数据字典表id
   */
  @ApiModelProperty(name = "scopeDictionaryId", value = "公司规模,关联数据字典表id")
  private Long scopeDictionaryId;

  /**
   * 发展阶段
   */
  @ApiModelProperty(name = "developmentStageDictionaryId", value = "发展阶段")
  private Long developmentStageDictionaryId;

  /**
   * 营业执照图片地址
   */
  @ApiModelProperty(name = "licenseUrl", value = "营业执照图片地址")
  private String licenseUrl;

  /**
   * 开始工作时间
   */
  @ApiModelProperty(name = "startWorkTime", value = "开始工作时间")
  private String startWorkTime;

  /**
   * 结束工作时间
   */
  @ApiModelProperty(name = "endWorkTime", value = "结束工作时间")
  private String endWorkTime;

  /**
   * 休息时间
   */
  @ApiModelProperty(name = "restTimeDictionaryId", value = "休息时间")
  private Long restTimeDictionaryId;

  /**
   * 加班情况,字典表id
   */
  @ApiModelProperty(name = "workOvertimeDictionaryId", value = "加班情况,字典表id")
  private Long workOvertimeDictionaryId;

  /**
   * 公司简介
   */
  @ApiModelProperty(name = "intro", value = "公司简介")
  private String intro;

  /**
   * 启用状态(1启用 0未启用) 默认-0
   */
  @ApiModelProperty(name = "enabled", value = "启用状态(1启用 0未启用) 默认-0")
  private Integer enabled;

  /**
   * 状态：0：未审核  1.审核通过  默认：0
   */
  @ApiModelProperty(name = "status", value = "状态：0：未审核  1.审核通过  默认：0")
  private Integer status;

  /**
   * 经度
   */
  @ApiModelProperty(name = "longitude", value = "经度")
  private BigDecimal longitude;

  /**
   * 纬度
   */
  @ApiModelProperty(name = "latitude", value = "纬度")
  private BigDecimal latitude;

  /**
   * 商圈
   */
  @ApiModelProperty(name = "businessDistrict", value = "商圈")
  private String businessDistrict;


}
