package com.github.xf717.systemservice.rpc.content.dto;

import com.github.xf717.common.framework.vo.PageParam;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * 不是所有的属性都需要，用于接收参数，在开发的时候可以自定义属性，这里默认显示所有的属性， 比如：create_time、update_time、create_by、update_by
 * 就可以去掉, 验证添加要自行调整@NotEmpty 自行配置 内容管理-问题信息表
 *
 * @author xiaofeng
 * @date 2021-03-29 18:03:04
 */
@Data
@Accessors(chain = true)
public class ProblemInformationPageReqDTO extends PageParam implements Serializable {


  /**
   * 问题标题
   */
  private String title;

  /**
   * 问题类型,关联字典表id
   */
  private Long typeDictionaryId;

  /**
   * 发布状态  是否发布  1:是 0否
   */
  private Integer releaseStatus;

  /**
   * 开始时间
   */

  private Date startTime;

  /**
   * 结束时间
   */

  private Date endTime;

  /**
   * 创建人
   */

  private Long createBy;

  /**
   * 平台
   */

  private Integer platform;


}
