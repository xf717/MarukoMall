package com.db.chaomaxs.passportweb.manager.passport.builder;

import com.db.chaomaxs.common.framework.msg.ObjectRestResponse;
import com.db.chaomaxs.passportweb.controller.passport.dto.PassportLoginByAccountPasswordReqDTO;
import com.db.chaomaxs.passportweb.manager.passport.handler.AbstractLoginHandler;
import com.db.chaomaxs.security.auth.client.rpc.oauth.facade.OAuth2RpcFacade;
import com.db.chaomaxs.userservice.rpc.user.dto.UserInfoRespDTO;
import com.db.chaomaxs.userservice.rpc.user.facade.UserInfoRpcFacade;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * 用户密码登录
 *
 * @author xiaofeng
 * @version 1.0
 * @date 2021/04/12 18:42
 */
public class LoginByAccountPasswordBuilder extends
    AbstractLoginHandler<UserInfoRespDTO, PassportLoginByAccountPasswordReqDTO> {

  private UserInfoRpcFacade userInfoRpcFacade;

  public LoginByAccountPasswordBuilder(OAuth2RpcFacade oAuth2RpcFacade,
      StringRedisTemplate stringRedisTemplate,
      PassportLoginByAccountPasswordReqDTO loginByAccountPasswordReqDTO) {
    super(oAuth2RpcFacade, stringRedisTemplate, loginByAccountPasswordReqDTO);
  }

  public LoginByAccountPasswordBuilder userInfoRpcFacade(UserInfoRpcFacade userInfoRpcFacade) {
    this.userInfoRpcFacade = userInfoRpcFacade;
    return this;
  }

  @Override
  public UserInfoRespDTO build(PassportLoginByAccountPasswordReqDTO loginByAccountPasswordReqDTO) {
    ObjectRestResponse<UserInfoRespDTO> objectRestResponse = userInfoRpcFacade
        .verifyPassword(loginByAccountPasswordReqDTO.getMobile(),
            loginByAccountPasswordReqDTO.getPassword());
    objectRestResponse.checkError();
    return objectRestResponse.getData();
  }
}
