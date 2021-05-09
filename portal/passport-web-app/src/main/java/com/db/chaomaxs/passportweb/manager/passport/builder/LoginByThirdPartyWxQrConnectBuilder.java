package com.db.chaomaxs.passportweb.manager.passport.builder;

import com.db.chaomaxs.common.framework.msg.ObjectRestResponse;
import com.db.chaomaxs.passportweb.convert.passport.PassportConvert;
import com.db.chaomaxs.passportweb.manager.passport.handler.AbstractLoginHandler;
import com.db.chaomaxs.security.auth.client.rpc.oauth.facade.OAuth2RpcFacade;
import com.db.chaomaxs.userservice.enums.user.GenderEnum;
import com.db.chaomaxs.userservice.rpc.user.dto.UserInfoCreateReqDTO;
import com.db.chaomaxs.userservice.rpc.user.dto.UserInfoRespDTO;
import com.db.chaomaxs.userservice.rpc.user.facade.UserInfoRpcFacade;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * 微信扫码登录
 *
 * @author xiaofeng
 * @version 1.0
 * @date 2021/04/16 9:14
 */
@Deprecated
public class LoginByThirdPartyWxQrConnectBuilder extends
    AbstractLoginHandler<UserInfoRespDTO, WxMpUser> {

  private UserInfoRpcFacade userInfoRpcFacade;

  private String ip;


  public LoginByThirdPartyWxQrConnectBuilder(OAuth2RpcFacade oAuth2RpcFacade,
      StringRedisTemplate stringRedisTemplate,
      WxMpUser wxMpUser) {
    super(oAuth2RpcFacade, stringRedisTemplate, wxMpUser);
  }

  public LoginByThirdPartyWxQrConnectBuilder userInfoRpcFacade(
      UserInfoRpcFacade userInfoRpcFacade) {
    this.userInfoRpcFacade = this.userInfoRpcFacade;
    return this;
  }

  public LoginByThirdPartyWxQrConnectBuilder ip(String ip) {
    this.ip = ip;
    return this;
  }

  @Override
  public UserInfoRespDTO build(WxMpUser wxMpUser) {
    UserInfoCreateReqDTO userInfoCreateReq = PassportConvert.INSTANCE.convert(wxMpUser);
    if (wxMpUser.getSex() == null) {
      // 没有性别，就设置未知的值
      userInfoCreateReq.setGender(GenderEnum.UNKNOWN.getValue());
    }
    userInfoCreateReq.setRegisterIp(ip);
    // 第三方用户如果不存在则进行创建
    ObjectRestResponse<UserInfoRespDTO> objectRestResponse = userInfoRpcFacade
        .createUserIfAbsent(userInfoCreateReq);
    objectRestResponse.checkError();
    return objectRestResponse.getData();
  }
}
