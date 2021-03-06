package com.github.xf717.userweb.controller.resume.dto;

import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;



/**
 * 用户_专业技能表
 * @author xiaofeng
 * @date 2021-03-29 13:08:14
 */
@Data
@Accessors(chain = true)
public class UserProfessionalSkillDTO {

    	/**
	 * 用户消息id
	 */
	private Long id;
    
    	/**
	 * 用户id
	 */
	private Long userResumeId;
    
    	/**
	 * 阅读时长
	 */
	private String skillName;
    
    	/**
	 * 读完多少本
	 */
	private Integer durationNum;
    
    	/**
	 * 掌握程度，关联字典表id
	 */
	private Long masteryDictionaryId;
    
    	/**
	 * 公司id,做为数据隔离
	 */
	private Long companyId;
    
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
