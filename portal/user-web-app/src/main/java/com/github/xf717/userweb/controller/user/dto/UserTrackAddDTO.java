package com.github.xf717.userweb.controller.user.dto;

import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 不是所有的属性都需要，用于接收参数，在开发的时候可以自定义属性，这里默认显示所有的属性，
 * 添加了swagger API 配置
 * 比如：create_time、update_time、create_by、update_by 就可以去掉
 * 我的足迹
 *
 * @author xiaofeng
 * @date 2021-03-29 12:47:47
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "UserTrackCreateDTO", description = "添加我的足迹")
public class UserTrackAddDTO {


    /**
     * 用户发布的职位id
     */
    @ApiModelProperty(name = "positionId", value = "用户发布的职位id")
    private Long positionId;

    /**
     * 企业用户id
     */
    @ApiModelProperty(name = "companyUserId", value = "企业用户id")
    private Long companyUserId;


}
