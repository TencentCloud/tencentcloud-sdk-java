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

public class DescribeReleaseOrderRequest extends AbstractModel {

    /**
    * 环境 Id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 发布单状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 环境 Id 
     * @return EnvId 环境 Id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境 Id
     * @param EnvId 环境 Id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

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
     * Get 发布单状态 
     * @return Status 发布单状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 发布单状态
     * @param Status 发布单状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DescribeReleaseOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReleaseOrderRequest(DescribeReleaseOrderRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

