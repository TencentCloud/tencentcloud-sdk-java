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

public class EditAuthConfigRequest extends AbstractModel {

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 手机号登录配置 "TRUE",  "FALSE", "LOGIN_ONLY"
    */
    @SerializedName("PhoneNumberLogin")
    @Expose
    private String PhoneNumberLogin;

    /**
    * 匿名登录配置 "TRUE",  "FALSE"
    */
    @SerializedName("AnonymousLogin")
    @Expose
    private String AnonymousLogin;

    /**
    * 用户名密码登录配置 "TRUE",  "FALSE"
    */
    @SerializedName("UsernameLogin")
    @Expose
    private String UsernameLogin;

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 手机号登录配置 "TRUE",  "FALSE", "LOGIN_ONLY" 
     * @return PhoneNumberLogin 手机号登录配置 "TRUE",  "FALSE", "LOGIN_ONLY"
     */
    public String getPhoneNumberLogin() {
        return this.PhoneNumberLogin;
    }

    /**
     * Set 手机号登录配置 "TRUE",  "FALSE", "LOGIN_ONLY"
     * @param PhoneNumberLogin 手机号登录配置 "TRUE",  "FALSE", "LOGIN_ONLY"
     */
    public void setPhoneNumberLogin(String PhoneNumberLogin) {
        this.PhoneNumberLogin = PhoneNumberLogin;
    }

    /**
     * Get 匿名登录配置 "TRUE",  "FALSE" 
     * @return AnonymousLogin 匿名登录配置 "TRUE",  "FALSE"
     */
    public String getAnonymousLogin() {
        return this.AnonymousLogin;
    }

    /**
     * Set 匿名登录配置 "TRUE",  "FALSE"
     * @param AnonymousLogin 匿名登录配置 "TRUE",  "FALSE"
     */
    public void setAnonymousLogin(String AnonymousLogin) {
        this.AnonymousLogin = AnonymousLogin;
    }

    /**
     * Get 用户名密码登录配置 "TRUE",  "FALSE" 
     * @return UsernameLogin 用户名密码登录配置 "TRUE",  "FALSE"
     */
    public String getUsernameLogin() {
        return this.UsernameLogin;
    }

    /**
     * Set 用户名密码登录配置 "TRUE",  "FALSE"
     * @param UsernameLogin 用户名密码登录配置 "TRUE",  "FALSE"
     */
    public void setUsernameLogin(String UsernameLogin) {
        this.UsernameLogin = UsernameLogin;
    }

    public EditAuthConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditAuthConfigRequest(EditAuthConfigRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.PhoneNumberLogin != null) {
            this.PhoneNumberLogin = new String(source.PhoneNumberLogin);
        }
        if (source.AnonymousLogin != null) {
            this.AnonymousLogin = new String(source.AnonymousLogin);
        }
        if (source.UsernameLogin != null) {
            this.UsernameLogin = new String(source.UsernameLogin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "PhoneNumberLogin", this.PhoneNumberLogin);
        this.setParamSimple(map, prefix + "AnonymousLogin", this.AnonymousLogin);
        this.setParamSimple(map, prefix + "UsernameLogin", this.UsernameLogin);

    }
}

