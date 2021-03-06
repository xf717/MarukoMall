package com.github.xf717.systemservice.rpc.dict.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * 不是所有的属性都需要，用于接收参数，在开发的时候可以自定义属性，这里默认显示所有的属性， 比如：create_time、update_time、create_by、update_by
 * 就可以去掉, 验证添加要自行调整@NotEmpty 自行配置 数据字典项信息表
 *
 * @author xiaofeng
 * @date 2021-03-29 17:42:11
 */
@Data
@Accessors(chain = true)
public class DataDictionaryItemCreateReqDTO implements Serializable {


  /**
   * 字典分类ID
   */
  private Long dictionaryTypeId;

  /**
   * 字典项名称
   */
  private String dictText;

  /**
   * 字典类型编号
   */
  private String dictValue;

  /**
   * 排序
   */
  private Integer sort;

  /**
   * 启用状态
   */
  private Integer enabled;
  /**
   * 字典类型唯一编码
   */
  private String code;

}
