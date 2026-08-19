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

public class CreateInferenceServiceRequest extends AbstractModel {

    /**
    * <p>推理服务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>模型 UID（业务级唯一标识）</p>
    */
    @SerializedName("ModelUid")
    @Expose
    private String ModelUid;

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
    * <p>Ray Serve 部署镜像</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>模型标识符（OpenAI 兼容 API 中的 model 字段）</p>
    */
    @SerializedName("ModelIdentifier")
    @Expose
    private String ModelIdentifier;

    /**
    * <p>队列名（K8s namespace）</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>部署名称（可选，未提供时自动生成）</p>
    */
    @SerializedName("DeploymentName")
    @Expose
    private String DeploymentName;

    /**
    * <p>模型版本（如 v1, v2），未提供时使用最新版本</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>ray head 是否开始高可用（是否申请 redis 实例用于 head 连接）</p>
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
    * <p>镜像拉取策略（默认 IfNotPresent）</p>
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
    * <p>是否启用弹性伸缩</p>
    */
    @SerializedName("AutoscalingEnabled")
    @Expose
    private Boolean AutoscalingEnabled;

    /**
    * <p>最小副本数（启用弹性伸缩时生效，0 表示缩容到 0）</p>
    */
    @SerializedName("MinReplicas")
    @Expose
    private Long MinReplicas;

    /**
    * <p>最大副本数（启用弹性伸缩时生效）</p>
    */
    @SerializedName("MaxReplicas")
    @Expose
    private Long MaxReplicas;

    /**
    * <p>Autoscaler 配置（JSON 字符串）</p>
    */
    @SerializedName("AutoscalerOptions")
    @Expose
    private String AutoscalerOptions;

    /**
    * <p>ApiKeyIds</p>
    */
    @SerializedName("ApiKeyIds")
    @Expose
    private String [] ApiKeyIds;

    /**
    * <p>AdvancedOptions 高级参数 JSON 字符串（可选），扁平 KV 结构，作用于 K8s RayService CR YAML 字段级</p>
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

    /**
    * <p>系统标签列表（TagKey-TagValue）</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>自定义RayServe提交</p>
    */
    @SerializedName("IsCustom")
    @Expose
    private Boolean IsCustom;

    /**
    * <p>python runtime env</p>
    */
    @SerializedName("RuntimeEnv")
    @Expose
    private String RuntimeEnv;

    /**
     * Get <p>推理服务名称</p> 
     * @return Name <p>推理服务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>推理服务名称</p>
     * @param Name <p>推理服务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>模型 UID（业务级唯一标识）</p> 
     * @return ModelUid <p>模型 UID（业务级唯一标识）</p>
     */
    public String getModelUid() {
        return this.ModelUid;
    }

    /**
     * Set <p>模型 UID（业务级唯一标识）</p>
     * @param ModelUid <p>模型 UID（业务级唯一标识）</p>
     */
    public void setModelUid(String ModelUid) {
        this.ModelUid = ModelUid;
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
     * Get <p>Ray Serve 部署镜像</p> 
     * @return Image <p>Ray Serve 部署镜像</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>Ray Serve 部署镜像</p>
     * @param Image <p>Ray Serve 部署镜像</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>模型标识符（OpenAI 兼容 API 中的 model 字段）</p> 
     * @return ModelIdentifier <p>模型标识符（OpenAI 兼容 API 中的 model 字段）</p>
     */
    public String getModelIdentifier() {
        return this.ModelIdentifier;
    }

    /**
     * Set <p>模型标识符（OpenAI 兼容 API 中的 model 字段）</p>
     * @param ModelIdentifier <p>模型标识符（OpenAI 兼容 API 中的 model 字段）</p>
     */
    public void setModelIdentifier(String ModelIdentifier) {
        this.ModelIdentifier = ModelIdentifier;
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
     * Get <p>部署名称（可选，未提供时自动生成）</p> 
     * @return DeploymentName <p>部署名称（可选，未提供时自动生成）</p>
     */
    public String getDeploymentName() {
        return this.DeploymentName;
    }

    /**
     * Set <p>部署名称（可选，未提供时自动生成）</p>
     * @param DeploymentName <p>部署名称（可选，未提供时自动生成）</p>
     */
    public void setDeploymentName(String DeploymentName) {
        this.DeploymentName = DeploymentName;
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
     * Get <p>ray head 是否开始高可用（是否申请 redis 实例用于 head 连接）</p> 
     * @return HeadHighAvailabilityEnabled <p>ray head 是否开始高可用（是否申请 redis 实例用于 head 连接）</p>
     */
    public Boolean getHeadHighAvailabilityEnabled() {
        return this.HeadHighAvailabilityEnabled;
    }

    /**
     * Set <p>ray head 是否开始高可用（是否申请 redis 实例用于 head 连接）</p>
     * @param HeadHighAvailabilityEnabled <p>ray head 是否开始高可用（是否申请 redis 实例用于 head 连接）</p>
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
     * Get <p>镜像拉取策略（默认 IfNotPresent）</p> 
     * @return ImagePullPolicy <p>镜像拉取策略（默认 IfNotPresent）</p>
     */
    public String getImagePullPolicy() {
        return this.ImagePullPolicy;
    }

    /**
     * Set <p>镜像拉取策略（默认 IfNotPresent）</p>
     * @param ImagePullPolicy <p>镜像拉取策略（默认 IfNotPresent）</p>
     */
    public void setImagePullPolicy(String ImagePullPolicy) {
        this.ImagePullPolicy = ImagePullPolicy;
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
     * Get <p>最小副本数（启用弹性伸缩时生效，0 表示缩容到 0）</p> 
     * @return MinReplicas <p>最小副本数（启用弹性伸缩时生效，0 表示缩容到 0）</p>
     */
    public Long getMinReplicas() {
        return this.MinReplicas;
    }

    /**
     * Set <p>最小副本数（启用弹性伸缩时生效，0 表示缩容到 0）</p>
     * @param MinReplicas <p>最小副本数（启用弹性伸缩时生效，0 表示缩容到 0）</p>
     */
    public void setMinReplicas(Long MinReplicas) {
        this.MinReplicas = MinReplicas;
    }

    /**
     * Get <p>最大副本数（启用弹性伸缩时生效）</p> 
     * @return MaxReplicas <p>最大副本数（启用弹性伸缩时生效）</p>
     */
    public Long getMaxReplicas() {
        return this.MaxReplicas;
    }

    /**
     * Set <p>最大副本数（启用弹性伸缩时生效）</p>
     * @param MaxReplicas <p>最大副本数（启用弹性伸缩时生效）</p>
     */
    public void setMaxReplicas(Long MaxReplicas) {
        this.MaxReplicas = MaxReplicas;
    }

    /**
     * Get <p>Autoscaler 配置（JSON 字符串）</p> 
     * @return AutoscalerOptions <p>Autoscaler 配置（JSON 字符串）</p>
     */
    public String getAutoscalerOptions() {
        return this.AutoscalerOptions;
    }

    /**
     * Set <p>Autoscaler 配置（JSON 字符串）</p>
     * @param AutoscalerOptions <p>Autoscaler 配置（JSON 字符串）</p>
     */
    public void setAutoscalerOptions(String AutoscalerOptions) {
        this.AutoscalerOptions = AutoscalerOptions;
    }

    /**
     * Get <p>ApiKeyIds</p> 
     * @return ApiKeyIds <p>ApiKeyIds</p>
     */
    public String [] getApiKeyIds() {
        return this.ApiKeyIds;
    }

    /**
     * Set <p>ApiKeyIds</p>
     * @param ApiKeyIds <p>ApiKeyIds</p>
     */
    public void setApiKeyIds(String [] ApiKeyIds) {
        this.ApiKeyIds = ApiKeyIds;
    }

    /**
     * Get <p>AdvancedOptions 高级参数 JSON 字符串（可选），扁平 KV 结构，作用于 K8s RayService CR YAML 字段级</p> 
     * @return AdvancedOptions <p>AdvancedOptions 高级参数 JSON 字符串（可选），扁平 KV 结构，作用于 K8s RayService CR YAML 字段级</p>
     */
    public String getAdvancedOptions() {
        return this.AdvancedOptions;
    }

    /**
     * Set <p>AdvancedOptions 高级参数 JSON 字符串（可选），扁平 KV 结构，作用于 K8s RayService CR YAML 字段级</p>
     * @param AdvancedOptions <p>AdvancedOptions 高级参数 JSON 字符串（可选），扁平 KV 结构，作用于 K8s RayService CR YAML 字段级</p>
     */
    public void setAdvancedOptions(String AdvancedOptions) {
        this.AdvancedOptions = AdvancedOptions;
    }

    /**
     * Get <p>系统标签列表（TagKey-TagValue）</p> 
     * @return ResourceTags <p>系统标签列表（TagKey-TagValue）</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>系统标签列表（TagKey-TagValue）</p>
     * @param ResourceTags <p>系统标签列表（TagKey-TagValue）</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>自定义RayServe提交</p> 
     * @return IsCustom <p>自定义RayServe提交</p>
     */
    public Boolean getIsCustom() {
        return this.IsCustom;
    }

    /**
     * Set <p>自定义RayServe提交</p>
     * @param IsCustom <p>自定义RayServe提交</p>
     */
    public void setIsCustom(Boolean IsCustom) {
        this.IsCustom = IsCustom;
    }

    /**
     * Get <p>python runtime env</p> 
     * @return RuntimeEnv <p>python runtime env</p>
     */
    public String getRuntimeEnv() {
        return this.RuntimeEnv;
    }

    /**
     * Set <p>python runtime env</p>
     * @param RuntimeEnv <p>python runtime env</p>
     */
    public void setRuntimeEnv(String RuntimeEnv) {
        this.RuntimeEnv = RuntimeEnv;
    }

    public CreateInferenceServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInferenceServiceRequest(CreateInferenceServiceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ModelUid != null) {
            this.ModelUid = new String(source.ModelUid);
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
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ModelIdentifier != null) {
            this.ModelIdentifier = new String(source.ModelIdentifier);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.DeploymentName != null) {
            this.DeploymentName = new String(source.DeploymentName);
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
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
        if (source.AutoscalingEnabled != null) {
            this.AutoscalingEnabled = new Boolean(source.AutoscalingEnabled);
        }
        if (source.MinReplicas != null) {
            this.MinReplicas = new Long(source.MinReplicas);
        }
        if (source.MaxReplicas != null) {
            this.MaxReplicas = new Long(source.MaxReplicas);
        }
        if (source.AutoscalerOptions != null) {
            this.AutoscalerOptions = new String(source.AutoscalerOptions);
        }
        if (source.ApiKeyIds != null) {
            this.ApiKeyIds = new String[source.ApiKeyIds.length];
            for (int i = 0; i < source.ApiKeyIds.length; i++) {
                this.ApiKeyIds[i] = new String(source.ApiKeyIds[i]);
            }
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.IsCustom != null) {
            this.IsCustom = new Boolean(source.IsCustom);
        }
        if (source.RuntimeEnv != null) {
            this.RuntimeEnv = new String(source.RuntimeEnv);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ModelUid", this.ModelUid);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ModelIdentifier", this.ModelIdentifier);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "DeploymentName", this.DeploymentName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "HeadHighAvailabilityEnabled", this.HeadHighAvailabilityEnabled);
        this.setParamSimple(map, prefix + "AdvancedParams", this.AdvancedParams);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "AutoscalingEnabled", this.AutoscalingEnabled);
        this.setParamSimple(map, prefix + "MinReplicas", this.MinReplicas);
        this.setParamSimple(map, prefix + "MaxReplicas", this.MaxReplicas);
        this.setParamSimple(map, prefix + "AutoscalerOptions", this.AutoscalerOptions);
        this.setParamArraySimple(map, prefix + "ApiKeyIds.", this.ApiKeyIds);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "IsCustom", this.IsCustom);
        this.setParamSimple(map, prefix + "RuntimeEnv", this.RuntimeEnv);

    }
}

