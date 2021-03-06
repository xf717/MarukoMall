package com.github.xf717.searchservice.rpc.position.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 搜索职位 Response DTO
 *
 * @author xiaofeng
 */
@Data
@Accessors(chain = true)
public class SearchPositionRespDTO implements Serializable {


  private static final long serialVersionUID = -9002955927499818637L;

  /**
   * 职位id
   */
  private Long id;

  /**
   * 职位名称
   */
  private String positionName;


  /**
   * 职位类别名
   */
  private Long positionTypeId;


  /**
   * 经验要求：冗余字段
   */
  private String experience;

  /**
   * 学历ID，字典表主键ID
   */
  private Long educationId;

  /**
   * 学历
   */

  private String education;

  /**
   * 最低薪资
   */
  private Integer startSalary;

  /**
   * 最高薪资
   */
  private Integer endSalary;

  /**
   * 职位描述
   */
  private String content;

  /**
   * 省份
   */
  private String provinceCode;

  /**
   * 城市
   */
  private String cityCode;

  /**
   * 区
   */
  private String areaCode;
}
