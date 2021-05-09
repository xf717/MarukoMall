package com.db.chaomaxs.security.auth.client.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * 服务鉴权配置
 *
 * @author xiaofeng
 * @date 2017/9/15
 */

public class ServiceAuthConfig {

  private byte[] pubKeyByte;
  @Value("${auth.client.id:null}")
  private String clientId;
  @Value("${auth.client.secret}")
  private String clientSecret;
  @Value("${spring.application.name}")
  private String applicationName;

  public String getClientId() {
    return "null".equals(clientId) ? applicationName : clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public byte[] getPubKeyByte() {
    return pubKeyByte;
  }

  public void setPubKeyByte(byte[] pubKeyByte) {
    this.pubKeyByte = pubKeyByte;
  }
}
