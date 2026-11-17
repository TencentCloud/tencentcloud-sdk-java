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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLoginConfigRequest extends AbstractModel {

    /**
    * <p>环境 ID，用于指定需要修改登录策略的云开发环境。</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>手机号短信登录开关。设置为 true 开启手机号短信登录，允许用户使用手机号和短信验证码进行登录和注册；设置为 false 关闭手机号短信登录。</p>
    */
    @SerializedName("PhoneNumberLogin")
    @Expose
    private Boolean PhoneNumberLogin;

    /**
    * <p>邮箱登录开关。设置为 true 开启邮箱登录，允许用户使用邮箱和密码进行登录和注册；设置为 false 关闭邮箱登录。</p>
    */
    @SerializedName("EmailLogin")
    @Expose
    private Boolean EmailLogin;

    /**
    * <p>用户名密码登录开关。设置为 true 开启用户名密码登录，允许用户使用用户名和密码进行登录和注册；设置为 false 关闭用户名密码登录。</p>
    */
    @SerializedName("UserNameLogin")
    @Expose
    private Boolean UserNameLogin;

    /**
    * <p>匿名登录开关。设置为 true 开启匿名登录，允许用户无需注册即可以匿名身份访问应用；设置为 false 关闭匿名登录。</p>
    */
    @SerializedName("AnonymousLogin")
    @Expose
    private Boolean AnonymousLogin;

    /**
    * <p>短信验证码发送配置，用于设置短信验证码的发送通道类型和日发送限额。不传则不修改当前配置。</p>
    */
    @SerializedName("SmsVerificationConfig")
    @Expose
    private VerificationConfig SmsVerificationConfig;

    /**
    * <p>MFA 多因子认证登录配置，用于设置多因子认证开关及验证方式（短信、邮箱、TOTP、强制绑定手机号）。不传则不修改当前配置。</p>
    */
    @SerializedName("MfaConfig")
    @Expose
    private MFALoginConfig MfaConfig;

    /**
    * <p>密码更新策略配置，用于设置首次登录强制修改密码和定期强制修改密码策略。不传则不修改当前配置。</p>
    */
    @SerializedName("PwdUpdateStrategy")
    @Expose
    private PasswordUpdateLoginConfig PwdUpdateStrategy;

    /**
     * Get <p>环境 ID，用于指定需要修改登录策略的云开发环境。</p> 
     * @return EnvId <p>环境 ID，用于指定需要修改登录策略的云开发环境。</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境 ID，用于指定需要修改登录策略的云开发环境。</p>
     * @param EnvId <p>环境 ID，用于指定需要修改登录策略的云开发环境。</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>手机号短信登录开关。设置为 true 开启手机号短信登录，允许用户使用手机号和短信验证码进行登录和注册；设置为 false 关闭手机号短信登录。</p> 
     * @return PhoneNumberLogin <p>手机号短信登录开关。设置为 true 开启手机号短信登录，允许用户使用手机号和短信验证码进行登录和注册；设置为 false 关闭手机号短信登录。</p>
     */
    public Boolean getPhoneNumberLogin() {
        return this.PhoneNumberLogin;
    }

    /**
     * Set <p>手机号短信登录开关。设置为 true 开启手机号短信登录，允许用户使用手机号和短信验证码进行登录和注册；设置为 false 关闭手机号短信登录。</p>
     * @param PhoneNumberLogin <p>手机号短信登录开关。设置为 true 开启手机号短信登录，允许用户使用手机号和短信验证码进行登录和注册；设置为 false 关闭手机号短信登录。</p>
     */
    public void setPhoneNumberLogin(Boolean PhoneNumberLogin) {
        this.PhoneNumberLogin = PhoneNumberLogin;
    }

    /**
     * Get <p>邮箱登录开关。设置为 true 开启邮箱登录，允许用户使用邮箱和密码进行登录和注册；设置为 false 关闭邮箱登录。</p> 
     * @return EmailLogin <p>邮箱登录开关。设置为 true 开启邮箱登录，允许用户使用邮箱和密码进行登录和注册；设置为 false 关闭邮箱登录。</p>
     */
    public Boolean getEmailLogin() {
        return this.EmailLogin;
    }

    /**
     * Set <p>邮箱登录开关。设置为 true 开启邮箱登录，允许用户使用邮箱和密码进行登录和注册；设置为 false 关闭邮箱登录。</p>
     * @param EmailLogin <p>邮箱登录开关。设置为 true 开启邮箱登录，允许用户使用邮箱和密码进行登录和注册；设置为 false 关闭邮箱登录。</p>
     */
    public void setEmailLogin(Boolean EmailLogin) {
        this.EmailLogin = EmailLogin;
    }

    /**
     * Get <p>用户名密码登录开关。设置为 true 开启用户名密码登录，允许用户使用用户名和密码进行登录和注册；设置为 false 关闭用户名密码登录。</p> 
     * @return UserNameLogin <p>用户名密码登录开关。设置为 true 开启用户名密码登录，允许用户使用用户名和密码进行登录和注册；设置为 false 关闭用户名密码登录。</p>
     */
    public Boolean getUserNameLogin() {
        return this.UserNameLogin;
    }

    /**
     * Set <p>用户名密码登录开关。设置为 true 开启用户名密码登录，允许用户使用用户名和密码进行登录和注册；设置为 false 关闭用户名密码登录。</p>
     * @param UserNameLogin <p>用户名密码登录开关。设置为 true 开启用户名密码登录，允许用户使用用户名和密码进行登录和注册；设置为 false 关闭用户名密码登录。</p>
     */
    public void setUserNameLogin(Boolean UserNameLogin) {
        this.UserNameLogin = UserNameLogin;
    }

    /**
     * Get <p>匿名登录开关。设置为 true 开启匿名登录，允许用户无需注册即可以匿名身份访问应用；设置为 false 关闭匿名登录。</p> 
     * @return AnonymousLogin <p>匿名登录开关。设置为 true 开启匿名登录，允许用户无需注册即可以匿名身份访问应用；设置为 false 关闭匿名登录。</p>
     */
    public Boolean getAnonymousLogin() {
        return this.AnonymousLogin;
    }

    /**
     * Set <p>匿名登录开关。设置为 true 开启匿名登录，允许用户无需注册即可以匿名身份访问应用；设置为 false 关闭匿名登录。</p>
     * @param AnonymousLogin <p>匿名登录开关。设置为 true 开启匿名登录，允许用户无需注册即可以匿名身份访问应用；设置为 false 关闭匿名登录。</p>
     */
    public void setAnonymousLogin(Boolean AnonymousLogin) {
        this.AnonymousLogin = AnonymousLogin;
    }

    /**
     * Get <p>短信验证码发送配置，用于设置短信验证码的发送通道类型和日发送限额。不传则不修改当前配置。</p> 
     * @return SmsVerificationConfig <p>短信验证码发送配置，用于设置短信验证码的发送通道类型和日发送限额。不传则不修改当前配置。</p>
     */
    public VerificationConfig getSmsVerificationConfig() {
        return this.SmsVerificationConfig;
    }

    /**
     * Set <p>短信验证码发送配置，用于设置短信验证码的发送通道类型和日发送限额。不传则不修改当前配置。</p>
     * @param SmsVerificationConfig <p>短信验证码发送配置，用于设置短信验证码的发送通道类型和日发送限额。不传则不修改当前配置。</p>
     */
    public void setSmsVerificationConfig(VerificationConfig SmsVerificationConfig) {
        this.SmsVerificationConfig = SmsVerificationConfig;
    }

    /**
     * Get <p>MFA 多因子认证登录配置，用于设置多因子认证开关及验证方式（短信、邮箱、TOTP、强制绑定手机号）。不传则不修改当前配置。</p> 
     * @return MfaConfig <p>MFA 多因子认证登录配置，用于设置多因子认证开关及验证方式（短信、邮箱、TOTP、强制绑定手机号）。不传则不修改当前配置。</p>
     */
    public MFALoginConfig getMfaConfig() {
        return this.MfaConfig;
    }

    /**
     * Set <p>MFA 多因子认证登录配置，用于设置多因子认证开关及验证方式（短信、邮箱、TOTP、强制绑定手机号）。不传则不修改当前配置。</p>
     * @param MfaConfig <p>MFA 多因子认证登录配置，用于设置多因子认证开关及验证方式（短信、邮箱、TOTP、强制绑定手机号）。不传则不修改当前配置。</p>
     */
    public void setMfaConfig(MFALoginConfig MfaConfig) {
        this.MfaConfig = MfaConfig;
    }

    /**
     * Get <p>密码更新策略配置，用于设置首次登录强制修改密码和定期强制修改密码策略。不传则不修改当前配置。</p> 
     * @return PwdUpdateStrategy <p>密码更新策略配置，用于设置首次登录强制修改密码和定期强制修改密码策略。不传则不修改当前配置。</p>
     */
    public PasswordUpdateLoginConfig getPwdUpdateStrategy() {
        return this.PwdUpdateStrategy;
    }

    /**
     * Set <p>密码更新策略配置，用于设置首次登录强制修改密码和定期强制修改密码策略。不传则不修改当前配置。</p>
     * @param PwdUpdateStrategy <p>密码更新策略配置，用于设置首次登录强制修改密码和定期强制修改密码策略。不传则不修改当前配置。</p>
     */
    public void setPwdUpdateStrategy(PasswordUpdateLoginConfig PwdUpdateStrategy) {
        this.PwdUpdateStrategy = PwdUpdateStrategy;
    }

    public ModifyLoginConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoginConfigRequest(ModifyLoginConfigRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.PhoneNumberLogin != null) {
            this.PhoneNumberLogin = new Boolean(source.PhoneNumberLogin);
        }
        if (source.EmailLogin != null) {
            this.EmailLogin = new Boolean(source.EmailLogin);
        }
        if (source.UserNameLogin != null) {
            this.UserNameLogin = new Boolean(source.UserNameLogin);
        }
        if (source.AnonymousLogin != null) {
            this.AnonymousLogin = new Boolean(source.AnonymousLogin);
        }
        if (source.SmsVerificationConfig != null) {
            this.SmsVerificationConfig = new VerificationConfig(source.SmsVerificationConfig);
        }
        if (source.MfaConfig != null) {
            this.MfaConfig = new MFALoginConfig(source.MfaConfig);
        }
        if (source.PwdUpdateStrategy != null) {
            this.PwdUpdateStrategy = new PasswordUpdateLoginConfig(source.PwdUpdateStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "PhoneNumberLogin", this.PhoneNumberLogin);
        this.setParamSimple(map, prefix + "EmailLogin", this.EmailLogin);
        this.setParamSimple(map, prefix + "UserNameLogin", this.UserNameLogin);
        this.setParamSimple(map, prefix + "AnonymousLogin", this.AnonymousLogin);
        this.setParamObj(map, prefix + "SmsVerificationConfig.", this.SmsVerificationConfig);
        this.setParamObj(map, prefix + "MfaConfig.", this.MfaConfig);
        this.setParamObj(map, prefix + "PwdUpdateStrategy.", this.PwdUpdateStrategy);

    }
}

