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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceInstanceAuth extends AbstractModel {

    /**
    * 用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 账户密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 访问凭据 token
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
     * Get 用户名 
     * @return Username 用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
     * @param Username 用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 账户密码 
     * @return Password 账户密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 账户密码
     * @param Password 账户密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 访问凭据 token 
     * @return AccessToken 访问凭据 token
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set 访问凭据 token
     * @param AccessToken 访问凭据 token
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    public SourceInstanceAuth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceInstanceAuth(SourceInstanceAuth source) {
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.AccessToken != null) {
            this.AccessToken = new String(source.AccessToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);

    }
}

