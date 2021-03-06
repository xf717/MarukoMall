package com.github.xf717.userweb.controller.resume.dto;

import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;



/**
 * 用户_工作经历
 * @author xiaofeng
 * @date 2021-03-29 13:08:14
 */
@Data
@Accessors(chain = true)
public class UserWorkExperienceDTO {

    	/**
	 * 系统id
	 */
	private Long id;
    
    	/**
	 * 用户简历id,关联user_resume 主键id
	 */
	private Long userResumeId;
    
    	/**
	 * 公司名称
	 */
	private String companyName;
    
    	/**
	 * 公司id,做为数据隔离
	 */
	private Long companyId;
    
    	/**
	 * 职位分类id：关键职位字典表id
	 */
	private Long positionTypeId;
    
    	/**
	 * 职位分类名称
	 */
	private String positionTypeName;
    
    	/**
	 * 职位名称,冗余字段
	 */
	private String positionName;
    
    	/**
	 * 所属行业id,关联行业字典表id
	 */
	private Long industryId;
    
    	/**
	 * 所属行业名称,冗余字段
	 */
	private String industryName;
    
    	/**
	 * 工作内容
	 */
	private String content;
    
    	/**
	 * 入职时间
	 */
	private Integer startJobTime;
    
    	/**
	 * 离职时间：-1值代表至今
	 */
	private Integer quitJobTime;
    
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
