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

public class DescribeLoginConfigResponse extends AbstractModel {

    /**
    * 是否开启邮箱登录方式。true 表示已开启，允许用户使用邮箱和密码进行登录；false 表示已关闭。
    */
    @SerializedName("EmailLogin")
    @Expose
    private Boolean EmailLogin;

    /**
    * 是否开启匿名登录方式。true 表示已开启，允许用户无需注册即可以匿名身份登录；false 表示已关闭。
    */
    @SerializedName("AnonymousLogin")
    @Expose
    private Boolean AnonymousLogin;

    /**
    * 是否开启用户名密码登录方式。true 表示已开启，允许用户使用用户名和密码进行登录；false 表示已关闭。
    */
    @SerializedName("UserNameLogin")
    @Expose
    private Boolean UserNameLogin;

    /**
    * 短信验证码发送配置，包含短信发送通道类型、自定义 APIs 数据源、调用方法及每日发送限额等信息。
    */
    @SerializedName("SmsVerificationConfig")
    @Expose
    private VerificationConfig SmsVerificationConfig;

    /**
    * 是否开启手机号短信登录方式。true 表示已开启，允许用户使用手机号和短信验证码进行登录和注册；false 表示已关闭。
    */
    @SerializedName("PhoneNumberLogin")
    @Expose
    private Boolean PhoneNumberLogin;

    /**
    * MFA 多因子认证登录配置，包含 MFA 开关及各验证方式（短信、邮箱、TOTP、强制绑定手机号）的启用状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MfaConfig")
    @Expose
    private MFALoginConfig MfaConfig;

    /**
    * 密码修改策略配置，包含首次登录强制修改密码开关及定期修改密码策略（周期和时间单位）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PwdUpdateStrategy")
    @Expose
    private PasswordUpdateLoginConfig PwdUpdateStrategy;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否开启邮箱登录方式。true 表示已开启，允许用户使用邮箱和密码进行登录；false 表示已关闭。 
     * @return EmailLogin 是否开启邮箱登录方式。true 表示已开启，允许用户使用邮箱和密码进行登录；false 表示已关闭。
     */
    public Boolean getEmailLogin() {
        return this.EmailLogin;
    }

    /**
     * Set 是否开启邮箱登录方式。true 表示已开启，允许用户使用邮箱和密码进行登录；false 表示已关闭。
     * @param EmailLogin 是否开启邮箱登录方式。true 表示已开启，允许用户使用邮箱和密码进行登录；false 表示已关闭。
     */
    public void setEmailLogin(Boolean EmailLogin) {
        this.EmailLogin = EmailLogin;
    }

    /**
     * Get 是否开启匿名登录方式。true 表示已开启，允许用户无需注册即可以匿名身份登录；false 表示已关闭。 
     * @return AnonymousLogin 是否开启匿名登录方式。true 表示已开启，允许用户无需注册即可以匿名身份登录；false 表示已关闭。
     */
    public Boolean getAnonymousLogin() {
        return this.AnonymousLogin;
    }

    /**
     * Set 是否开启匿名登录方式。true 表示已开启，允许用户无需注册即可以匿名身份登录；false 表示已关闭。
     * @param AnonymousLogin 是否开启匿名登录方式。true 表示已开启，允许用户无需注册即可以匿名身份登录；false 表示已关闭。
     */
    public void setAnonymousLogin(Boolean AnonymousLogin) {
        this.AnonymousLogin = AnonymousLogin;
    }

    /**
     * Get 是否开启用户名密码登录方式。true 表示已开启，允许用户使用用户名和密码进行登录；false 表示已关闭。 
     * @return UserNameLogin 是否开启用户名密码登录方式。true 表示已开启，允许用户使用用户名和密码进行登录；false 表示已关闭。
     */
    public Boolean getUserNameLogin() {
        return this.UserNameLogin;
    }

    /**
     * Set 是否开启用户名密码登录方式。true 表示已开启，允许用户使用用户名和密码进行登录；false 表示已关闭。
     * @param UserNameLogin 是否开启用户名密码登录方式。true 表示已开启，允许用户使用用户名和密码进行登录；false 表示已关闭。
     */
    public void setUserNameLogin(Boolean UserNameLogin) {
        this.UserNameLogin = UserNameLogin;
    }

    /**
     * Get 短信验证码发送配置，包含短信发送通道类型、自定义 APIs 数据源、调用方法及每日发送限额等信息。 
     * @return SmsVerificationConfig 短信验证码发送配置，包含短信发送通道类型、自定义 APIs 数据源、调用方法及每日发送限额等信息。
     */
    public VerificationConfig getSmsVerificationConfig() {
        return this.SmsVerificationConfig;
    }

    /**
     * Set 短信验证码发送配置，包含短信发送通道类型、自定义 APIs 数据源、调用方法及每日发送限额等信息。
     * @param SmsVerificationConfig 短信验证码发送配置，包含短信发送通道类型、自定义 APIs 数据源、调用方法及每日发送限额等信息。
     */
    public void setSmsVerificationConfig(VerificationConfig SmsVerificationConfig) {
        this.SmsVerificationConfig = SmsVerificationConfig;
    }

    /**
     * Get 是否开启手机号短信登录方式。true 表示已开启，允许用户使用手机号和短信验证码进行登录和注册；false 表示已关闭。 
     * @return PhoneNumberLogin 是否开启手机号短信登录方式。true 表示已开启，允许用户使用手机号和短信验证码进行登录和注册；false 表示已关闭。
     */
    public Boolean getPhoneNumberLogin() {
        return this.PhoneNumberLogin;
    }

    /**
     * Set 是否开启手机号短信登录方式。true 表示已开启，允许用户使用手机号和短信验证码进行登录和注册；false 表示已关闭。
     * @param PhoneNumberLogin 是否开启手机号短信登录方式。true 表示已开启，允许用户使用手机号和短信验证码进行登录和注册；false 表示已关闭。
     */
    public void setPhoneNumberLogin(Boolean PhoneNumberLogin) {
        this.PhoneNumberLogin = PhoneNumberLogin;
    }

    /**
     * Get MFA 多因子认证登录配置，包含 MFA 开关及各验证方式（短信、邮箱、TOTP、强制绑定手机号）的启用状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MfaConfig MFA 多因子认证登录配置，包含 MFA 开关及各验证方式（短信、邮箱、TOTP、强制绑定手机号）的启用状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MFALoginConfig getMfaConfig() {
        return this.MfaConfig;
    }

    /**
     * Set MFA 多因子认证登录配置，包含 MFA 开关及各验证方式（短信、邮箱、TOTP、强制绑定手机号）的启用状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MfaConfig MFA 多因子认证登录配置，包含 MFA 开关及各验证方式（短信、邮箱、TOTP、强制绑定手机号）的启用状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMfaConfig(MFALoginConfig MfaConfig) {
        this.MfaConfig = MfaConfig;
    }

    /**
     * Get 密码修改策略配置，包含首次登录强制修改密码开关及定期修改密码策略（周期和时间单位）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PwdUpdateStrategy 密码修改策略配置，包含首次登录强制修改密码开关及定期修改密码策略（周期和时间单位）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PasswordUpdateLoginConfig getPwdUpdateStrategy() {
        return this.PwdUpdateStrategy;
    }

    /**
     * Set 密码修改策略配置，包含首次登录强制修改密码开关及定期修改密码策略（周期和时间单位）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PwdUpdateStrategy 密码修改策略配置，包含首次登录强制修改密码开关及定期修改密码策略（周期和时间单位）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPwdUpdateStrategy(PasswordUpdateLoginConfig PwdUpdateStrategy) {
        this.PwdUpdateStrategy = PwdUpdateStrategy;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeLoginConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoginConfigResponse(DescribeLoginConfigResponse source) {
        if (source.EmailLogin != null) {
            this.EmailLogin = new Boolean(source.EmailLogin);
        }
        if (source.AnonymousLogin != null) {
            this.AnonymousLogin = new Boolean(source.AnonymousLogin);
        }
        if (source.UserNameLogin != null) {
            this.UserNameLogin = new Boolean(source.UserNameLogin);
        }
        if (source.SmsVerificationConfig != null) {
            this.SmsVerificationConfig = new VerificationConfig(source.SmsVerificationConfig);
        }
        if (source.PhoneNumberLogin != null) {
            this.PhoneNumberLogin = new Boolean(source.PhoneNumberLogin);
        }
        if (source.MfaConfig != null) {
            this.MfaConfig = new MFALoginConfig(source.MfaConfig);
        }
        if (source.PwdUpdateStrategy != null) {
            this.PwdUpdateStrategy = new PasswordUpdateLoginConfig(source.PwdUpdateStrategy);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmailLogin", this.EmailLogin);
        this.setParamSimple(map, prefix + "AnonymousLogin", this.AnonymousLogin);
        this.setParamSimple(map, prefix + "UserNameLogin", this.UserNameLogin);
        this.setParamObj(map, prefix + "SmsVerificationConfig.", this.SmsVerificationConfig);
        this.setParamSimple(map, prefix + "PhoneNumberLogin", this.PhoneNumberLogin);
        this.setParamObj(map, prefix + "MfaConfig.", this.MfaConfig);
        this.setParamObj(map, prefix + "PwdUpdateStrategy.", this.PwdUpdateStrategy);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

