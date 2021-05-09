package com.db.chaomaxs.positionservice.rpc.recommend.dto;

import com.db.chaomaxs.common.framework.vo.PageParam;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.Date;





/**
 * 不是所有的属性都需要，用于接收参数，在开发的时候可以自定义属性，这里默认显示所有的属性，
 * 比如：create_time、update_time、create_by、update_by 就可以去掉,
 * 验证添加要自行调整@NotEmpty 自行配置
 * 推荐人才简历
 * @author xiaofeng
 * @date 2021-03-29 17:09:31
 */
@Data
@Accessors(chain = true)
public class RecommendResumePageReqDTO extends PageParam implements Serializable {

                      /**
           * 系统id
           */
          @NotEmpty(message = "系统id")
          private Long id;
        
                      /**
           * 用户简历id
           */
          private Long userResumeId;
        
                      /**
           * 是否删除 1:是 0否  默认：0
           */
          private Integer isDeleted;
        
                      /**
           * 创建时间
           */
          private Date createTime;
        
                      /**
           * 创建人
           */
          private Long createBy;
        
                      /**
           * 修改时间
           */
          private Date updateTime;
        
                      /**
           * 修改人
           */
          private Long updateBy;
        
    
}
