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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckLogKafkaConnectionStateRequest extends AbstractModel {

    /**
    * 接入方式,1公网域名接入，2支撑环境接入
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 接入地址，域名或ip，带端口
    */
    @SerializedName("AccessAddr")
    @Expose
    private String AccessAddr;

    /**
    * 用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 0不用密码，1有密码
    */
    @SerializedName("HasPwd")
    @Expose
    private Long HasPwd;

    /**
    * 密码，使用aes加密
    */
    @SerializedName("Pwd")
    @Expose
    private String Pwd;

    /**
    * kafka实例id
    */
    @SerializedName("KafkaId")
    @Expose
    private String KafkaId;

    /**
    * kafka版本
    */
    @SerializedName("InsVersion")
    @Expose
    private String InsVersion;

    /**
     * Get 接入方式,1公网域名接入，2支撑环境接入 
     * @return AccessType 接入方式,1公网域名接入，2支撑环境接入
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 接入方式,1公网域名接入，2支撑环境接入
     * @param AccessType 接入方式,1公网域名接入，2支撑环境接入
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 接入地址，域名或ip，带端口 
     * @return AccessAddr 接入地址，域名或ip，带端口
     */
    public String getAccessAddr() {
        return this.AccessAddr;
    }

    /**
     * Set 接入地址，域名或ip，带端口
     * @param AccessAddr 接入地址，域名或ip，带端口
     */
    public void setAccessAddr(String AccessAddr) {
        this.AccessAddr = AccessAddr;
    }

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
     * Get 0不用密码，1有密码 
     * @return HasPwd 0不用密码，1有密码
     */
    public Long getHasPwd() {
        return this.HasPwd;
    }

    /**
     * Set 0不用密码，1有密码
     * @param HasPwd 0不用密码，1有密码
     */
    public void setHasPwd(Long HasPwd) {
        this.HasPwd = HasPwd;
    }

    /**
     * Get 密码，使用aes加密 
     * @return Pwd 密码，使用aes加密
     */
    public String getPwd() {
        return this.Pwd;
    }

    /**
     * Set 密码，使用aes加密
     * @param Pwd 密码，使用aes加密
     */
    public void setPwd(String Pwd) {
        this.Pwd = Pwd;
    }

    /**
     * Get kafka实例id 
     * @return KafkaId kafka实例id
     */
    public String getKafkaId() {
        return this.KafkaId;
    }

    /**
     * Set kafka实例id
     * @param KafkaId kafka实例id
     */
    public void setKafkaId(String KafkaId) {
        this.KafkaId = KafkaId;
    }

    /**
     * Get kafka版本 
     * @return InsVersion kafka版本
     */
    public String getInsVersion() {
        return this.InsVersion;
    }

    /**
     * Set kafka版本
     * @param InsVersion kafka版本
     */
    public void setInsVersion(String InsVersion) {
        this.InsVersion = InsVersion;
    }

    public CheckLogKafkaConnectionStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckLogKafkaConnectionStateRequest(CheckLogKafkaConnectionStateRequest source) {
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.AccessAddr != null) {
            this.AccessAddr = new String(source.AccessAddr);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.HasPwd != null) {
            this.HasPwd = new Long(source.HasPwd);
        }
        if (source.Pwd != null) {
            this.Pwd = new String(source.Pwd);
        }
        if (source.KafkaId != null) {
            this.KafkaId = new String(source.KafkaId);
        }
        if (source.InsVersion != null) {
            this.InsVersion = new String(source.InsVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "AccessAddr", this.AccessAddr);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "HasPwd", this.HasPwd);
        this.setParamSimple(map, prefix + "Pwd", this.Pwd);
        this.setParamSimple(map, prefix + "KafkaId", this.KafkaId);
        this.setParamSimple(map, prefix + "InsVersion", this.InsVersion);

    }
}

