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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimpleVersion extends AbstractModel {

    /**
    * 要删除版本的环境 Id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 要删除版本的服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 要删除版本的版本名
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
     * Get 要删除版本的环境 Id 
     * @return EnvId 要删除版本的环境 Id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 要删除版本的环境 Id
     * @param EnvId 要删除版本的环境 Id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 要删除版本的服务名 
     * @return ServerName 要删除版本的服务名
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 要删除版本的服务名
     * @param ServerName 要删除版本的服务名
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 要删除版本的版本名 
     * @return VersionName 要删除版本的版本名
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 要删除版本的版本名
     * @param VersionName 要删除版本的版本名
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    public SimpleVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimpleVersion(SimpleVersion source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);

    }
}

