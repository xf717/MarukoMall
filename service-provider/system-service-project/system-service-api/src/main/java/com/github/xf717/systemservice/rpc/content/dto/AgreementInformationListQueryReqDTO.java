package com.github.xf717.systemservice.rpc.content.dto;

import java.io.Serializable;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.experimental.Accessors;



/**
 * 不是所有的属性都需要，用于接收参数，在开发的时候可以自定义属性，这里默认显示所有的属性，
 * 比如：create_time、update_time、create_by、update_by 就可以去掉
 * 内容管理-协议信息表
 * @author xiaofeng
 * @date 2021-03-29 18:03:04
 */
@Data
@Accessors(chain = true)
public class AgreementInformationListQueryReqDTO implements Serializable {


    	/**
	 * 系统id
	 */
		@NotEmpty(message = "系统id")
	private Long id;
    
    	/**
	 * 标题
	 */
	private String keywordTitle;

	/**
	 * 编码
	 */
	private String code;

    
    	/**
	 * 发布状态（1 发布 0未发布）
	 */
	private Integer releaseStatus;
    


}
