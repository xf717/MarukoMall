package com.db.chaomaxs.systemservice.rpc.dict.dto;

import com.db.chaomaxs.common.framework.vo.PageParam;
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
public class DataDictionaryItemPageReqDTO extends PageParam implements Serializable {


  /**
   * 查询关键字
   */
  private String key;

  /**
   * 字典分类ID
   */
  private Long dictionaryTypeId;


  /**
   * 启用状态
   */
  private Integer enabled;


}
