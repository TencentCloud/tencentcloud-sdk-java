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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceMetricsItem extends AbstractModel {

    /**
    * <p>服务 UID，服务唯一标识</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>服务显示名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>服务状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>推理引擎</p>
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>模型名称</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>OpenAI 兼容的模型标识符</p>
    */
    @SerializedName("ModelIdentifier")
    @Expose
    private String ModelIdentifier;

    /**
    * <p>副本信息</p>
    */
    @SerializedName("Replicas")
    @Expose
    private ReplicaInfo Replicas;

    /**
    * <p>监控指标数据</p>
    */
    @SerializedName("Metrics")
    @Expose
    private MetricsData Metrics;

    /**
     * Get <p>服务 UID，服务唯一标识</p> 
     * @return ServiceId <p>服务 UID，服务唯一标识</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务 UID，服务唯一标识</p>
     * @param ServiceId <p>服务 UID，服务唯一标识</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>服务显示名称</p> 
     * @return ServiceName <p>服务显示名称</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务显示名称</p>
     * @param ServiceName <p>服务显示名称</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>服务状态</p> 
     * @return Status <p>服务状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>服务状态</p>
     * @param Status <p>服务状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>推理引擎</p> 
     * @return Engine <p>推理引擎</p>
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>推理引擎</p>
     * @param Engine <p>推理引擎</p>
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>模型名称</p> 
     * @return ModelName <p>模型名称</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
     * @param ModelName <p>模型名称</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>OpenAI 兼容的模型标识符</p> 
     * @return ModelIdentifier <p>OpenAI 兼容的模型标识符</p>
     */
    public String getModelIdentifier() {
        return this.ModelIdentifier;
    }

    /**
     * Set <p>OpenAI 兼容的模型标识符</p>
     * @param ModelIdentifier <p>OpenAI 兼容的模型标识符</p>
     */
    public void setModelIdentifier(String ModelIdentifier) {
        this.ModelIdentifier = ModelIdentifier;
    }

    /**
     * Get <p>副本信息</p> 
     * @return Replicas <p>副本信息</p>
     */
    public ReplicaInfo getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>副本信息</p>
     * @param Replicas <p>副本信息</p>
     */
    public void setReplicas(ReplicaInfo Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get <p>监控指标数据</p> 
     * @return Metrics <p>监控指标数据</p>
     */
    public MetricsData getMetrics() {
        return this.Metrics;
    }

    /**
     * Set <p>监控指标数据</p>
     * @param Metrics <p>监控指标数据</p>
     */
    public void setMetrics(MetricsData Metrics) {
        this.Metrics = Metrics;
    }

    public ServiceMetricsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceMetricsItem(ServiceMetricsItem source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelIdentifier != null) {
            this.ModelIdentifier = new String(source.ModelIdentifier);
        }
        if (source.Replicas != null) {
            this.Replicas = new ReplicaInfo(source.Replicas);
        }
        if (source.Metrics != null) {
            this.Metrics = new MetricsData(source.Metrics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelIdentifier", this.ModelIdentifier);
        this.setParamObj(map, prefix + "Replicas.", this.Replicas);
        this.setParamObj(map, prefix + "Metrics.", this.Metrics);

    }
}

