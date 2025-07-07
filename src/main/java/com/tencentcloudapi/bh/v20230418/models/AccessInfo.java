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

public class AccessInfo extends AbstractModel {

    /**
    * 地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 账号
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 唤起链接｜wss链接
    */
    @SerializedName("AccessURL")
    @Expose
    private String AccessURL;

    /**
     * Get 地址 
     * @return Ip 地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 地址
     * @param Ip 地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 账号 
     * @return User 账号
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 账号
     * @param User 账号
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 密码 
     * @return Password 密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
     * @param Password 密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 唤起链接｜wss链接 
     * @return AccessURL 唤起链接｜wss链接
     */
    public String getAccessURL() {
        return this.AccessURL;
    }

    /**
     * Set 唤起链接｜wss链接
     * @param AccessURL 唤起链接｜wss链接
     */
    public void setAccessURL(String AccessURL) {
        this.AccessURL = AccessURL;
    }

    public AccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessInfo(AccessInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.AccessURL != null) {
            this.AccessURL = new String(source.AccessURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "AccessURL", this.AccessURL);

    }
}

