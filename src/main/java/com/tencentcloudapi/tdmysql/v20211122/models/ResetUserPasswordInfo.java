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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetUserPasswordInfo extends AbstractModel {

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>host</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>明文密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>加密密码</p>
    */
    @SerializedName("EncryptedPassword")
    @Expose
    private String EncryptedPassword;

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>host</p> 
     * @return Host <p>host</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>host</p>
     * @param Host <p>host</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>明文密码</p> 
     * @return Password <p>明文密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>明文密码</p>
     * @param Password <p>明文密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>加密密码</p> 
     * @return EncryptedPassword <p>加密密码</p>
     */
    public String getEncryptedPassword() {
        return this.EncryptedPassword;
    }

    /**
     * Set <p>加密密码</p>
     * @param EncryptedPassword <p>加密密码</p>
     */
    public void setEncryptedPassword(String EncryptedPassword) {
        this.EncryptedPassword = EncryptedPassword;
    }

    public ResetUserPasswordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetUserPasswordInfo(ResetUserPasswordInfo source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EncryptedPassword != null) {
            this.EncryptedPassword = new String(source.EncryptedPassword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EncryptedPassword", this.EncryptedPassword);

    }
}

