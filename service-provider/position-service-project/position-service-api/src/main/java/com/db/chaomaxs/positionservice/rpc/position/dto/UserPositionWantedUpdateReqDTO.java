package com.db.chaomaxs.positionservice.rpc.position.dto;

import java.util.Date;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.experimental.Accessors;



/**
 * 用户求职
 * @author xiaofeng
 * @date 2021-03-29 16:36:57
 */
@Data
@Accessors(chain = true)
public class UserPositionWantedUpdateReqDTO implements Serializable {


    	/**
	 * 系统id
	 */
		@NotEmpty(message = "系统id")
	private Long id;
    
    	/**
	 * 企业ID
	 */
	private Long companyId;
    
    	/**
	 * 职位id,关键企业发布职位表
	 */
	private Long positionId;
    
    	/**
	 * 职位名称：冗余字段
	 */
	private String positionName;
    
    	/**
	 * 经验要求：关联经验要求表主键id
	 */
	private Long userResumeId;
    
    	/**
	 * 是否删除:1 是  0 否  默认：0
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
