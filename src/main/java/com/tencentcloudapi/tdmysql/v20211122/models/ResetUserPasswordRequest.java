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

public class ResetUserPasswordRequest extends AbstractModel {

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主机IP，IP段以%结尾，表示允许该IP段的所有IP
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 新密码，要求长度8-32，至少包含英文、数字和符号中的两种
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 加密密码
    */
    @SerializedName("EncryptedPassword")
    @Expose
    private String EncryptedPassword;

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
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 主机IP，IP段以%结尾，表示允许该IP段的所有IP 
     * @return Host 主机IP，IP段以%结尾，表示允许该IP段的所有IP
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机IP，IP段以%结尾，表示允许该IP段的所有IP
     * @param Host 主机IP，IP段以%结尾，表示允许该IP段的所有IP
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 新密码，要求长度8-32，至少包含英文、数字和符号中的两种 
     * @return Password 新密码，要求长度8-32，至少包含英文、数字和符号中的两种
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 新密码，要求长度8-32，至少包含英文、数字和符号中的两种
     * @param Password 新密码，要求长度8-32，至少包含英文、数字和符号中的两种
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 加密密码 
     * @return EncryptedPassword 加密密码
     */
    public String getEncryptedPassword() {
        return this.EncryptedPassword;
    }

    /**
     * Set 加密密码
     * @param EncryptedPassword 加密密码
     */
    public void setEncryptedPassword(String EncryptedPassword) {
        this.EncryptedPassword = EncryptedPassword;
    }

    public ResetUserPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetUserPasswordRequest(ResetUserPasswordRequest source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EncryptedPassword", this.EncryptedPassword);

    }
}

