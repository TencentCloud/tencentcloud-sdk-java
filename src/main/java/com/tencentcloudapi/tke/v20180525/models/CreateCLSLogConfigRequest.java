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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCLSLogConfigRequest extends AbstractModel {

    /**
    * <p>日志采集配置的json表达</p>
    */
    @SerializedName("LogConfig")
    @Expose
    private String LogConfig;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>CLS日志集ID</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>当前集群类型支持tke（标准集群）、eks（serverless集群）</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get <p>日志采集配置的json表达</p> 
     * @return LogConfig <p>日志采集配置的json表达</p>
     */
    public String getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set <p>日志采集配置的json表达</p>
     * @param LogConfig <p>日志采集配置的json表达</p>
     */
    public void setLogConfig(String LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>CLS日志集ID</p> 
     * @return LogsetId <p>CLS日志集ID</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>CLS日志集ID</p>
     * @param LogsetId <p>CLS日志集ID</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>当前集群类型支持tke（标准集群）、eks（serverless集群）</p> 
     * @return ClusterType <p>当前集群类型支持tke（标准集群）、eks（serverless集群）</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>当前集群类型支持tke（标准集群）、eks（serverless集群）</p>
     * @param ClusterType <p>当前集群类型支持tke（标准集群）、eks（serverless集群）</p>
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

