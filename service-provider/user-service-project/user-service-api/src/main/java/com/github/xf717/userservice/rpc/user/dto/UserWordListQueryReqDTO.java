package com.github.xf717.userservice.rpc.user.dto;

import java.util.Date;

import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.experimental.Accessors;



/**
 * 不是所有的属性都需要，用于接收参数，在开发的时候可以自定义属性，这里默认显示所有的属性，
 * 比如：create_time、update_time、create_by、update_by 就可以去掉
 * 用户_常用语
 * @author xiaofeng
 * @date 2021-03-29 12:47:47
 */
@Data
@Accessors(chain = true)
public class UserWordListQueryReqDTO implements Serializable {


    	/**
	 * 
	 */
		@NotEmpty(message = "")
	private Long id;
    
    	/**
	 * 内容
	 */
	private String content;
    
    	/**
	 * 用户id
	 */
	private Long userId;
    
    	/**
	 * 排序
	 */
	private Integer sort;
    
    	/**
	 * 是否删除  0 - 否 1 - 是 
	 */
	private Integer isDeleted;
    
    	/**
	 * 创建人
	 */
	private Long createBy;
    
    	/**
	 * 创建时间
	 */
	private Date createTime;
    
    	/**
	 * 修改人
	 */
	private Long updateBy;
    
    	/**
	 * 修改时间
	 */
	private Date updateTime;
    

}
