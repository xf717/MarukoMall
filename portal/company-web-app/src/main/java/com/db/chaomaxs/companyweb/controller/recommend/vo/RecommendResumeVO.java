package com.db.chaomaxs.companyweb.controller.recommend.vo;

import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 *推荐人才简历
 * @author xiaofeng
 * @date 2021-03-29 17:09:31
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "RecommendResumeVO",description = "推荐人才简历")
public class RecommendResumeVO{

    	/**
	 * 系统id
	 */
	@ApiModelProperty(name ="id", value = "系统id")
	private Long id;
    
    	/**
	 * 用户简历id
	 */
	@ApiModelProperty(name ="userResumeId" ,value = "用户简历id")
	private Long userResumeId;
    
    	/**
	 * 是否删除 1:是 0否  默认：0
	 */
	@ApiModelProperty(name ="isDeleted" ,value = "是否删除 1:是 0否  默认：0")
	private Integer isDeleted;
    
    	/**
	 * 创建时间
	 */
	@ApiModelProperty(name ="createTime" ,value = "创建时间")
	private Date createTime;
    
    	/**
	 * 创建人
	 */
	@ApiModelProperty(name ="createBy" ,value = "创建人")
	private Long createBy;
    
    	/**
	 * 修改时间
	 */
	@ApiModelProperty(name ="updateTime" ,value = "修改时间")
	private Date updateTime;
    
    	/**
	 * 修改人
	 */
	@ApiModelProperty(name ="updateBy" ,value = "修改人")
	private Long updateBy;
    

}
