/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OauthConfig extends AbstractModel{

    /**
    * 公钥，用于验证用户token。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * token传递位置。
    */
    @SerializedName("TokenLocation")
    @Expose
    private String TokenLocation;

    /**
    * 重定向地址，用于引导用户登录操作。
    */
    @SerializedName("LoginRedirectUrl")
    @Expose
    private String LoginRedirectUrl;

    /**
     * Get 公钥，用于验证用户token。 
     * @return PublicKey 公钥，用于验证用户token。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 公钥，用于验证用户token。
     * @param PublicKey 公钥，用于验证用户token。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get token传递位置。 
     * @return TokenLocation token传递位置。
     */
    public String getTokenLocation() {
        return this.TokenLocation;
    }

    /**
     * Set token传递位置。
     * @param TokenLocation token传递位置。
     */
    public void setTokenLocation(String TokenLocation) {
        this.TokenLocation = TokenLocation;
    }

    /**
     * Get 重定向地址，用于引导用户登录操作。 
     * @return LoginRedirectUrl 重定向地址，用于引导用户登录操作。
     */
    public String getLoginRedirectUrl() {
        return this.LoginRedirectUrl;
    }

    /**
     * Set 重定向地址，用于引导用户登录操作。
     * @param LoginRedirectUrl 重定向地址，用于引导用户登录操作。
     */
    public void setLoginRedirectUrl(String LoginRedirectUrl) {
        this.LoginRedirectUrl = LoginRedirectUrl;
    }

    public OauthConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OauthConfig(OauthConfig source) {
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.TokenLocation != null) {
            this.TokenLocation = new String(source.TokenLocation);
        }
        if (source.LoginRedirectUrl != null) {
            this.LoginRedirectUrl = new String(source.LoginRedirectUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "TokenLocation", this.TokenLocation);
        this.setParamSimple(map, prefix + "LoginRedirectUrl", this.LoginRedirectUrl);

    }
}

