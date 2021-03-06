package com.github.xf717.userweb.controller.resume.vo;

import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 *用户_项目经历
 * @author xiaofeng
 * @date 2021-03-29 13:08:13
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "UserProjectExperienceVO",description = "用户_项目经历")
public class UserProjectExperienceVO{

    	/**
	 * 系统id
	 */
	@ApiModelProperty(name ="id", value = "系统id")
	private Long id;
    
    	/**
	 * 用户简历id,关联user_resume表id
	 */
	@ApiModelProperty(name ="userResumeId" ,value = "用户简历id,关联user_resume表id")
	private Long userResumeId;
    
    	/**
	 * 项目名称
	 */
	@ApiModelProperty(name ="projectName" ,value = "项目名称")
	private String projectName;
    
    	/**
	 * 项目开始时间
	 */
	@ApiModelProperty(name ="startTime" ,value = "项目开始时间")
	private Date startTime;
    
    	/**
	 * 项目结束时间
	 */
	@ApiModelProperty(name ="endTime" ,value = "项目结束时间")
	private Date endTime;
    
    	/**
	 * 项目描述
	 */
	@ApiModelProperty(name ="description" ,value = "项目描述")
	private String description;

}
