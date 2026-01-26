/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecuritySetting extends AbstractModel {

    /**
    * 认证方式设置
    */
    @SerializedName("AuthMode")
    @Expose
    private AuthModeSetting AuthMode;

    /**
    * 密码安全设置
    */
    @SerializedName("Password")
    @Expose
    private PasswordSetting Password;

    /**
    * 登录安全设置
    */
    @SerializedName("Login")
    @Expose
    private LoginSetting Login;

    /**
    * LDAP配置信息
    */
    @SerializedName("LDAP")
    @Expose
    private LDAPSetting LDAP;

    /**
    * OAuth配置信息
    */
    @SerializedName("OAuth")
    @Expose
    private OAuthSetting OAuth;

    /**
    * 国密认证方式设置
    */
    @SerializedName("AuthModeGM")
    @Expose
    private AuthModeSetting AuthModeGM;

    /**
    * 资产重连次数
    */
    @SerializedName("Reconnection")
    @Expose
    private ReconnectionSetting Reconnection;

    /**
    * 大区环境网络设置
    */
    @SerializedName("EnvInternetAccess")
    @Expose
    private EnvInternetAccessSetting EnvInternetAccess;

    /**
     * Get 认证方式设置 
     * @return AuthMode 认证方式设置
     */
    public AuthModeSetting getAuthMode() {
        return this.AuthMode;
    }

    /**
     * Set 认证方式设置
     * @param AuthMode 认证方式设置
     */
    public void setAuthMode(AuthModeSetting AuthMode) {
        this.AuthMode = AuthMode;
    }

    /**
     * Get 密码安全设置 
     * @return Password 密码安全设置
     */
    public PasswordSetting getPassword() {
        return this.Password;
    }

    /**
     * Set 密码安全设置
     * @param Password 密码安全设置
     */
    public void setPassword(PasswordSetting Password) {
        this.Password = Password;
    }

    /**
     * Get 登录安全设置 
     * @return Login 登录安全设置
     */
    public LoginSetting getLogin() {
        return this.Login;
    }

    /**
     * Set 登录安全设置
     * @param Login 登录安全设置
     */
    public void setLogin(LoginSetting Login) {
        this.Login = Login;
    }

    /**
     * Get LDAP配置信息 
     * @return LDAP LDAP配置信息
     */
    public LDAPSetting getLDAP() {
        return this.LDAP;
    }

    /**
     * Set LDAP配置信息
     * @param LDAP LDAP配置信息
     */
    public void setLDAP(LDAPSetting LDAP) {
        this.LDAP = LDAP;
    }

    /**
     * Get OAuth配置信息 
     * @return OAuth OAuth配置信息
     */
    public OAuthSetting getOAuth() {
        return this.OAuth;
    }

    /**
     * Set OAuth配置信息
     * @param OAuth OAuth配置信息
     */
    public void setOAuth(OAuthSetting OAuth) {
        this.OAuth = OAuth;
    }

    /**
     * Get 国密认证方式设置 
     * @return AuthModeGM 国密认证方式设置
     */
    public AuthModeSetting getAuthModeGM() {
        return this.AuthModeGM;
    }

    /**
     * Set 国密认证方式设置
     * @param AuthModeGM 国密认证方式设置
     */
    public void setAuthModeGM(AuthModeSetting AuthModeGM) {
        this.AuthModeGM = AuthModeGM;
    }

    /**
     * Get 资产重连次数 
     * @return Reconnection 资产重连次数
     */
    public ReconnectionSetting getReconnection() {
        return this.Reconnection;
    }

    /**
     * Set 资产重连次数
     * @param Reconnection 资产重连次数
     */
    public void setReconnection(ReconnectionSetting Reconnection) {
        this.Reconnection = Reconnection;
    }

    /**
     * Get 大区环境网络设置 
     * @return EnvInternetAccess 大区环境网络设置
     */
    public EnvInternetAccessSetting getEnvInternetAccess() {
        return this.EnvInternetAccess;
    }

    /**
     * Set 大区环境网络设置
     * @param EnvInternetAccess 大区环境网络设置
     */
    public void setEnvInternetAccess(EnvInternetAccessSetting EnvInternetAccess) {
        this.EnvInternetAccess = EnvInternetAccess;
    }

    public SecuritySetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecuritySetting(SecuritySetting source) {
        if (source.AuthMode != null) {
            this.AuthMode = new AuthModeSetting(source.AuthMode);
        }
        if (source.Password != null) {
            this.Password = new PasswordSetting(source.Password);
        }
        if (source.Login != null) {
            this.Login = new LoginSetting(source.Login);
        }
        if (source.LDAP != null) {
            this.LDAP = new LDAPSetting(source.LDAP);
        }
        if (source.OAuth != null) {
            this.OAuth = new OAuthSetting(source.OAuth);
        }
        if (source.AuthModeGM != null) {
            this.AuthModeGM = new AuthModeSetting(source.AuthModeGM);
        }
        if (source.Reconnection != null) {
            this.Reconnection = new ReconnectionSetting(source.Reconnection);
        }
        if (source.EnvInternetAccess != null) {
            this.EnvInternetAccess = new EnvInternetAccessSetting(source.EnvInternetAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AuthMode.", this.AuthMode);
        this.setParamObj(map, prefix + "Password.", this.Password);
        this.setParamObj(map, prefix + "Login.", this.Login);
        this.setParamObj(map, prefix + "LDAP.", this.LDAP);
        this.setParamObj(map, prefix + "OAuth.", this.OAuth);
        this.setParamObj(map, prefix + "AuthModeGM.", this.AuthModeGM);
        this.setParamObj(map, prefix + "Reconnection.", this.Reconnection);
        this.setParamObj(map, prefix + "EnvInternetAccess.", this.EnvInternetAccess);

    }
}

