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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppGetTokenRequest extends AbstractModel{

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * TTL
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
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
     * Get TTL 
     * @return Expire TTL
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set TTL
     * @param Expire TTL
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Expire", this.Expire);

    }
}

