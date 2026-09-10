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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwAIServiceSourceAuth extends AbstractModel {

    /**
    * <p>账号</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>接入Token</p>
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
     * Get <p>账号</p> 
     * @return Username <p>账号</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>账号</p>
     * @param Username <p>账号</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>密码</p> 
     * @return Password <p>密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>密码</p>
     * @param Password <p>密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>接入Token</p> 
     * @return AccessToken <p>接入Token</p>
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set <p>接入Token</p>
     * @param AccessToken <p>接入Token</p>
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    public CNAPIGwAIServiceSourceAuth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwAIServiceSourceAuth(CNAPIGwAIServiceSourceAuth source) {
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

