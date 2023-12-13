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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCLSLogConfigRequest extends AbstractModel {

    /**
    * 日志采集配置的json表达
    */
    @SerializedName("LogConfig")
    @Expose
    private String LogConfig;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * CLS日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 当前集群类型支持tke、eks
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get 日志采集配置的json表达 
     * @return LogConfig 日志采集配置的json表达
     */
    public String getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set 日志采集配置的json表达
     * @param LogConfig 日志采集配置的json表达
     */
    public void setLogConfig(String LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get CLS日志集ID 
     * @return LogsetId CLS日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set CLS日志集ID
     * @param LogsetId CLS日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 当前集群类型支持tke、eks 
     * @return ClusterType 当前集群类型支持tke、eks
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 当前集群类型支持tke、eks
     * @param ClusterType 当前集群类型支持tke、eks
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public CreateCLSLogConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCLSLogConfigRequest(CreateCLSLogConfigRequest source) {
        if (source.LogConfig != null) {
            this.LogConfig = new String(source.LogConfig);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogConfig", this.LogConfig);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

