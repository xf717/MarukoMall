package com.db.chaomaxs.userweb.controller.user.vo;

import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 *用户_黑名单
 * @author xiaofeng
 * @date 2021-03-29 12:47:48
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "UserBlacklistVO",description = "用户_黑名单")
public class UserBlacklistVO{

    	/**
	 * 
	 */
	@ApiModelProperty(name ="id", value = "")
	private Long id;
    
    	/**
	 * 用户id
	 */
	@ApiModelProperty(name ="userId" ,value = "用户id")
	private Long userId;
    
    	/**
	 * 企业用户
	 */
	@ApiModelProperty(name ="companyUserId" ,value = "企业用户")
	private Long companyUserId;
    
    	/**
	 * 状态0 - 否1 -是
	 */
	@ApiModelProperty(name ="status" ,value = "状态0 - 否1 -是")
	private Integer status;
    
    	/**
	 * 是否删除 1:是 0否  默认：0
	 */
	@ApiModelProperty(name ="isDeleted" ,value = "是否删除 1:是 0否  默认：0")
	private Integer isDeleted;
    
    	/**
	 * 创建人
	 */
	@ApiModelProperty(name ="createBy" ,value = "创建人")
	private Long createBy;
    
    	/**
	 * 创建时间
	 */
	@ApiModelProperty(name ="createTime" ,value = "创建时间")
	private Date createTime;
    
    	/**
	 * 修改人
	 */
	@ApiModelProperty(name ="updateBy" ,value = "修改人")
	private Long updateBy;
    
    	/**
	 * 修改时间
	 */
	@ApiModelProperty(name ="updateTime" ,value = "修改时间")
	private Date updateTime;
    

}
