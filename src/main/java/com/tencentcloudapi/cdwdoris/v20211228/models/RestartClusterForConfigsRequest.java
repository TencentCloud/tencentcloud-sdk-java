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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartClusterForConfigsRequest extends AbstractModel {

    /**
    * 集群ID，例如cdwch-xxxx
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 配置文件名称
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * grace_restart为优雅滚动重启 不填默认立刻重启
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
     * Get 集群ID，例如cdwch-xxxx 
     * @return InstanceId 集群ID，例如cdwch-xxxx
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID，例如cdwch-xxxx
     * @param InstanceId 集群ID，例如cdwch-xxxx
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 配置文件名称 
     * @return ConfigName 配置文件名称
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置文件名称
     * @param ConfigName 配置文件名称
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get grace_restart为优雅滚动重启 不填默认立刻重启 
     * @return OperationType grace_restart为优雅滚动重启 不填默认立刻重启
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set grace_restart为优雅滚动重启 不填默认立刻重启
     * @param OperationType grace_restart为优雅滚动重启 不填默认立刻重启
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    public RestartClusterForConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartClusterForConfigsRequest(RestartClusterForConfigsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);

    }
}

