package com.github.xf717.logservice.rpc.login.dto;

import java.util.Date;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.experimental.Accessors;



/**
 * 用户_登录日志
 * @author xiaofeng
 * @date 2021-04-06 17:48:03
 */
@Data
@Accessors(chain = true)
public class UserLoginLogUpdateReqDTO implements Serializable {


    	/**
	 * 系统id
	 */
		@NotEmpty(message = "系统id")
	private Long id;
    
    	/**
	 * app应用市场信息id
	 */
	private Integer sysAppMarketId;
    
    	/**
	 * 终端类型(字典:1android手机、2android平板、3pc、4ios手机、5ios平板、6web)
	 */
	private Integer terminalType;
    
    	/**
	 * 终端唯一
	 */
	private String terminalSn;
    
    	/**
	 * 终端名称
	 */
	private String terminalName;
    
    	/**
	 * app版本号
	 */
	private Integer appVersionNo;
    
    	/**
	 * app版本名称
	 */
	private String appVersionName;
    
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
