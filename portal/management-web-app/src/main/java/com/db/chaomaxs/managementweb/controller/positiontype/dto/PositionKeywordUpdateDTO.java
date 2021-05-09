package com.db.chaomaxs.managementweb.controller.positiontype.dto;

import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * 不是所有的属性都需要，用于接收参数，在开发的时候可以自定义属性，这里默认显示所有的属性，
 * 添加了swagger API 配置
 * 比如：create_time、update_time、create_by、update_by 就可以去掉
 * 内容管理-职位关键词信息表
 * @author xiaofeng
 * @date 2021-03-29 17:02:00
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "PositionKeywordUpdateDTO",description = "更新内容管理-职位关键词信息表")
public class PositionKeywordUpdateDTO {

    	/**
	 * 系统id
	 */
	@ApiModelProperty(name ="id",value = "系统id")
	private Long id;
    
    	/**
	 * 关键词标题
	 */
	@ApiModelProperty(name ="keywordTitle", value = "关键词标题")
	private String keywordTitle;
    
    	/**
	 * 职位分类一级ID,冗余字段
	 */
	@ApiModelProperty(name ="onePositionTypeId", value = "职位分类一级ID,冗余字段")
	private Long onePositionTypeId;
    
    	/**
	 * 职位分类二级ID 冗余字段
	 */
	@ApiModelProperty(name ="twoPositionTypeId", value = "职位分类二级ID 冗余字段")
	private Long twoPositionTypeId;
    
    	/**
	 * 职位分类三级ID 冗余字段
	 */
	@ApiModelProperty(name ="threePositionTypeId", value = "职位分类三级ID 冗余字段")
	private Long threePositionTypeId;
    
    	/**
	 * 发布状态  1发布 0未发布
	 */
	@ApiModelProperty(name ="releaseStatus", value = "发布状态  1发布 0未发布")
	private Integer releaseStatus;
    
    	/**
	 * 排序
	 */
	@ApiModelProperty(name ="sort", value = "排序")
	private Integer sort;
    
    	/**
	 * 是否删除 1:是 0否  默认：0
	 */
	@ApiModelProperty(name ="isDeleted", value = "是否删除 1:是 0否  默认：0")
	private Integer isDeleted;
    
    	/**
	 * 创建时间
	 */
	@ApiModelProperty(name ="createTime", value = "创建时间")
	private Date createTime;
    
    	/**
	 * 创建人
	 */
	@ApiModelProperty(name ="createBy", value = "创建人")
	private Long createBy;
    
    	/**
	 * 修改时间
	 */
	@ApiModelProperty(name ="updateTime", value = "修改时间")
	private Date updateTime;
    
    	/**
	 * 修改人
	 */
	@ApiModelProperty(name ="updateBy", value = "修改人")
	private Long updateBy;
    

}
