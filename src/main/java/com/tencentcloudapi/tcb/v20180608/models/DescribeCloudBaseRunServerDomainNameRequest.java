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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunServerDomainNameRequest extends AbstractModel{

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 环境Id
    */
    @SerializedName("UserEnvId")
    @Expose
    private String UserEnvId;

    /**
    * 用户Uin
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 外部Id
    */
    @SerializedName("ExternalId")
    @Expose
    private String ExternalId;

    /**
     * Get 服务名 
     * @return ServerName 服务名
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名
     * @param ServerName 服务名
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 环境Id 
     * @return UserEnvId 环境Id
     */
    public String getUserEnvId() {
        return this.UserEnvId;
    }

    /**
     * Set 环境Id
     * @param UserEnvId 环境Id
     */
    public void setUserEnvId(String UserEnvId) {
        this.UserEnvId = UserEnvId;
    }

    /**
     * Get 用户Uin 
     * @return UserUin 用户Uin
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户Uin
     * @param UserUin 用户Uin
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 外部Id 
     * @return ExternalId 外部Id
     */
    public String getExternalId() {
        return this.ExternalId;
    }

    /**
     * Set 外部Id
     * @param ExternalId 外部Id
     */
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    public DescribeCloudBaseRunServerDomainNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseRunServerDomainNameRequest(DescribeCloudBaseRunServerDomainNameRequest source) {
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.UserEnvId != null) {
            this.UserEnvId = new String(source.UserEnvId);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.ExternalId != null) {
            this.ExternalId = new String(source.ExternalId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "UserEnvId", this.UserEnvId);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "ExternalId", this.ExternalId);

    }
}

