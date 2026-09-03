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

public class AddDeploymentRequest extends AbstractModel {

    /**
    * <p>ServiceId</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>部署名称</p>
    */
    @SerializedName("DeploymentName")
    @Expose
    private String DeploymentName;

    /**
    * <p>推理引擎（vllm / xgboost）</p>
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>副本数</p>
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * <p>资源分区 ID（目标 K8s 集群分区）</p>
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>模型版本（如 v1, v2），未提供时使用最新版本</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>是否开启 ray head 高可用</p>
    */
    @SerializedName("HeadHighAvailabilityEnabled")
    @Expose
    private Boolean HeadHighAvailabilityEnabled;

    /**
    * <p>高级参数（JSON 字符串，可选）</p>
    */
    @SerializedName("AdvancedParams")
    @Expose
    private String AdvancedParams;

    /**
    * <p>队列名（K8s namespace）</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>是否启用弹性伸缩</p>
    */
    @SerializedName("AutoscalingEnabled")
    @Expose
    private Boolean AutoscalingEnabled;

    /**
    * <p>镜像名称</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>高级参数</p>
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

    /**
     * Get <p>ServiceId</p> 
     * @return ServiceId <p>ServiceId</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>ServiceId</p>
     * @param ServiceId <p>ServiceId</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>部署名称</p> 
     * @return DeploymentName <p>部署名称</p>
     */
    public String getDeploymentName() {
        return this.DeploymentName;
    }

    /**
     * Set <p>部署名称</p>
     * @param DeploymentName <p>部署名称</p>
     */
    public void setDeploymentName(String DeploymentName) {
        this.DeploymentName = DeploymentName;
    }

    /**
     * Get <p>推理引擎（vllm / xgboost）</p> 
     * @return Engine <p>推理引擎（vllm / xgboost）</p>
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>推理引擎（vllm / xgboost）</p>
     * @param Engine <p>推理引擎（vllm / xgboost）</p>
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>副本数</p> 
     * @return Replicas <p>副本数</p>
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>副本数</p>
     * @param Replicas <p>副本数</p>
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get <p>资源分区 ID（目标 K8s 集群分区）</p> 
     * @return ResourcePartitionId <p>资源分区 ID（目标 K8s 集群分区）</p>
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>资源分区 ID（目标 K8s 集群分区）</p>
     * @param ResourcePartitionId <p>资源分区 ID（目标 K8s 集群分区）</p>
     */
    public void setResourcePartitionId(String ResourcePartitionId) {
        this.ResourcePartitionId = ResourcePartitionId;
    }

    /**
     * Get <p>模型版本（如 v1, v2），未提供时使用最新版本</p> 
     * @return ModelVersion <p>模型版本（如 v1, v2），未提供时使用最新版本</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>模型版本（如 v1, v2），未提供时使用最新版本</p>
     * @param ModelVersion <p>模型版本（如 v1, v2），未提供时使用最新版本</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>是否开启 ray head 高可用</p> 
     * @return HeadHighAvailabilityEnabled <p>是否开启 ray head 高可用</p>
     */
    public Boolean getHeadHighAvailabilityEnabled() {
        return this.HeadHighAvailabilityEnabled;
    }

    /**
     * Set <p>是否开启 ray head 高可用</p>
     * @param HeadHighAvailabilityEnabled <p>是否开启 ray head 高可用</p>
     */
    public void setHeadHighAvailabilityEnabled(Boolean HeadHighAvailabilityEnabled) {
        this.HeadHighAvailabilityEnabled = HeadHighAvailabilityEnabled;
    }

    /**
     * Get <p>高级参数（JSON 字符串，可选）</p> 
     * @return AdvancedParams <p>高级参数（JSON 字符串，可选）</p>
     */
    public String getAdvancedParams() {
        return this.AdvancedParams;
    }

    /**
     * Set <p>高级参数（JSON 字符串，可选）</p>
     * @param AdvancedParams <p>高级参数（JSON 字符串，可选）</p>
     */
    public void setAdvancedParams(String AdvancedParams) {
        this.AdvancedParams = AdvancedParams;
    }

    /**
     * Get <p>队列名（K8s namespace）</p> 
     * @return Queue <p>队列名（K8s namespace）</p>
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>队列名（K8s namespace）</p>
     * @param Queue <p>队列名（K8s namespace）</p>
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>是否启用弹性伸缩</p> 
     * @return AutoscalingEnabled <p>是否启用弹性伸缩</p>
     */
    public Boolean getAutoscalingEnabled() {
        return this.AutoscalingEnabled;
    }

    /**
     * Set <p>是否启用弹性伸缩</p>
     * @param AutoscalingEnabled <p>是否启用弹性伸缩</p>
     */
    public void setAutoscalingEnabled(Boolean AutoscalingEnabled) {
        this.AutoscalingEnabled = AutoscalingEnabled;
    }

    /**
     * Get <p>镜像名称</p> 
     * @return Image <p>镜像名称</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>镜像名称</p>
     * @param Image <p>镜像名称</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>高级参数</p> 
     * @return AdvancedOptions <p>高级参数</p>
     */
    public String getAdvancedOptions() {
        return this.AdvancedOptions;
    }

    /**
     * Set <p>高级参数</p>
     * @param AdvancedOptions <p>高级参数</p>
     */
    public void setAdvancedOptions(String AdvancedOptions) {
        this.AdvancedOptions = AdvancedOptions;
    }

    public AddDeploymentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddDeploymentRequest(AddDeploymentRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.DeploymentName != null) {
            this.DeploymentName = new String(source.DeploymentName);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.HeadHighAvailabilityEnabled != null) {
            this.HeadHighAvailabilityEnabled = new Boolean(source.HeadHighAvailabilityEnabled);
        }
        if (source.AdvancedParams != null) {
            this.AdvancedParams = new String(source.AdvancedParams);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.AutoscalingEnabled != null) {
            this.AutoscalingEnabled = new Boolean(source.AutoscalingEnabled);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "DeploymentName", this.DeploymentName);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "HeadHighAvailabilityEnabled", this.HeadHighAvailabilityEnabled);
        this.setParamSimple(map, prefix + "AdvancedParams", this.AdvancedParams);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "AutoscalingEnabled", this.AutoscalingEnabled);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);

    }
}

