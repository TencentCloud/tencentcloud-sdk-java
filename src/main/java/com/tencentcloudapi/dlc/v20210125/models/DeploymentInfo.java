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

public class DeploymentInfo extends AbstractModel {

    /**
    * <p>部署 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeploymentId")
    @Expose
    private String DeploymentId;

    /**
    * <p>部署名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>关联的服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>部署使用的模型版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>部署状态（Running/Stopped/Deploying/Failed）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>推理引擎（vLLM/SGLang 等）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * <p>期望副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * <p>可用副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableReplicas")
    @Expose
    private Long AvailableReplicas;

    /**
    * <p>资源配置（JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * <p>ray head 是否开启高可用</p>
    */
    @SerializedName("HeadHighAvailabilityEnabled")
    @Expose
    private Boolean HeadHighAvailabilityEnabled;

    /**
    * <p>高级参数（JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedParams")
    @Expose
    private String AdvancedParams;

    /**
    * <p>是否开启自动伸缩</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoscalingEnabled")
    @Expose
    private Boolean AutoscalingEnabled;

    /**
    * <p>模型存储配置（Catalog JSON，记录模型 COS 挂载信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelStorageConfig")
    @Expose
    private String ModelStorageConfig;

    /**
    * <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>Neutrino Serve ID (RayService CR name)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeutrinoServeId")
    @Expose
    private String NeutrinoServeId;

    /**
    * <p>Ray Dashboard 访问地址（通过 Ingress 代理，仅 Running 状态的部署有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RayDashboardUrl")
    @Expose
    private String RayDashboardUrl;

    /**
    * <p>资源分区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>资源队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>App id</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>SubAccountUin</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>AdvancedOptions 高级参数（JSON 字符串，扁平 KV 结构，key 形如 spec.rayClusterConfig.headGroupSpec.serviceType）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

    /**
    * <p>自定义镜像地址（为空则使用引擎默认镜像）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>资源分区名称（后端按 ResourcePartitionId 反查 ResourceService 填充；分区不存在或 ResourceManager 未启用时可能为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePartitionName")
    @Expose
    private String ResourcePartitionName;

    /**
     * Get <p>部署 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeploymentId <p>部署 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeploymentId() {
        return this.DeploymentId;
    }

    /**
     * Set <p>部署 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeploymentId <p>部署 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeploymentId(String DeploymentId) {
        this.DeploymentId = DeploymentId;
    }

    /**
     * Get <p>部署名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>部署名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>部署名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>部署名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>关联的服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId <p>关联的服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>关联的服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId <p>关联的服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>部署使用的模型版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelVersion <p>部署使用的模型版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>部署使用的模型版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelVersion <p>部署使用的模型版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>部署状态（Running/Stopped/Deploying/Failed）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>部署状态（Running/Stopped/Deploying/Failed）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>部署状态（Running/Stopped/Deploying/Failed）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>部署状态（Running/Stopped/Deploying/Failed）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>推理引擎（vLLM/SGLang 等）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Engine <p>推理引擎（vLLM/SGLang 等）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>推理引擎（vLLM/SGLang 等）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Engine <p>推理引擎（vLLM/SGLang 等）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>期望副本数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replicas <p>期望副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>期望副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas <p>期望副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get <p>可用副本数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableReplicas <p>可用副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailableReplicas() {
        return this.AvailableReplicas;
    }

    /**
     * Set <p>可用副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableReplicas <p>可用副本数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableReplicas(Long AvailableReplicas) {
        this.AvailableReplicas = AvailableReplicas;
    }

    /**
     * Get <p>资源配置（JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceConfig <p>资源配置（JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>资源配置（JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceConfig <p>资源配置（JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>ray head 是否开启高可用</p> 
     * @return HeadHighAvailabilityEnabled <p>ray head 是否开启高可用</p>
     */
    public Boolean getHeadHighAvailabilityEnabled() {
        return this.HeadHighAvailabilityEnabled;
    }

    /**
     * Set <p>ray head 是否开启高可用</p>
     * @param HeadHighAvailabilityEnabled <p>ray head 是否开启高可用</p>
     */
    public void setHeadHighAvailabilityEnabled(Boolean HeadHighAvailabilityEnabled) {
        this.HeadHighAvailabilityEnabled = HeadHighAvailabilityEnabled;
    }

    /**
     * Get <p>高级参数（JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedParams <p>高级参数（JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdvancedParams() {
        return this.AdvancedParams;
    }

    /**
     * Set <p>高级参数（JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedParams <p>高级参数（JSON 字符串）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedParams(String AdvancedParams) {
        this.AdvancedParams = AdvancedParams;
    }

    /**
     * Get <p>是否开启自动伸缩</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoscalingEnabled <p>是否开启自动伸缩</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoscalingEnabled() {
        return this.AutoscalingEnabled;
    }

    /**
     * Set <p>是否开启自动伸缩</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoscalingEnabled <p>是否开启自动伸缩</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoscalingEnabled(Boolean AutoscalingEnabled) {
        this.AutoscalingEnabled = AutoscalingEnabled;
    }

    /**
     * Get <p>模型存储配置（Catalog JSON，记录模型 COS 挂载信息）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelStorageConfig <p>模型存储配置（Catalog JSON，记录模型 COS 挂载信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelStorageConfig() {
        return this.ModelStorageConfig;
    }

    /**
     * Set <p>模型存储配置（Catalog JSON，记录模型 COS 挂载信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelStorageConfig <p>模型存储配置（Catalog JSON，记录模型 COS 挂载信息）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelStorageConfig(String ModelStorageConfig) {
        this.ModelStorageConfig = ModelStorageConfig;
    }

    /**
     * Get <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Neutrino Serve ID (RayService CR name)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeutrinoServeId <p>Neutrino Serve ID (RayService CR name)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNeutrinoServeId() {
        return this.NeutrinoServeId;
    }

    /**
     * Set <p>Neutrino Serve ID (RayService CR name)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeutrinoServeId <p>Neutrino Serve ID (RayService CR name)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeutrinoServeId(String NeutrinoServeId) {
        this.NeutrinoServeId = NeutrinoServeId;
    }

    /**
     * Get <p>Ray Dashboard 访问地址（通过 Ingress 代理，仅 Running 状态的部署有值）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RayDashboardUrl <p>Ray Dashboard 访问地址（通过 Ingress 代理，仅 Running 状态的部署有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRayDashboardUrl() {
        return this.RayDashboardUrl;
    }

    /**
     * Set <p>Ray Dashboard 访问地址（通过 Ingress 代理，仅 Running 状态的部署有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RayDashboardUrl <p>Ray Dashboard 访问地址（通过 Ingress 代理，仅 Running 状态的部署有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRayDashboardUrl(String RayDashboardUrl) {
        this.RayDashboardUrl = RayDashboardUrl;
    }

    /**
     * Get <p>资源分区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePartitionId <p>资源分区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>资源分区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePartitionId <p>资源分区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePartitionId(String ResourcePartitionId) {
        this.ResourcePartitionId = ResourcePartitionId;
    }

    /**
     * Get <p>资源队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Queue <p>资源队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>资源队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Queue <p>资源队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>App id</p> 
     * @return AppId <p>App id</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>App id</p>
     * @param AppId <p>App id</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Uin</p> 
     * @return Uin <p>Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Uin</p>
     * @param Uin <p>Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>SubAccountUin</p> 
     * @return SubAccountUin <p>SubAccountUin</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>SubAccountUin</p>
     * @param SubAccountUin <p>SubAccountUin</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>AdvancedOptions 高级参数（JSON 字符串，扁平 KV 结构，key 形如 spec.rayClusterConfig.headGroupSpec.serviceType）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedOptions <p>AdvancedOptions 高级参数（JSON 字符串，扁平 KV 结构，key 形如 spec.rayClusterConfig.headGroupSpec.serviceType）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdvancedOptions() {
        return this.AdvancedOptions;
    }

    /**
     * Set <p>AdvancedOptions 高级参数（JSON 字符串，扁平 KV 结构，key 形如 spec.rayClusterConfig.headGroupSpec.serviceType）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedOptions <p>AdvancedOptions 高级参数（JSON 字符串，扁平 KV 结构，key 形如 spec.rayClusterConfig.headGroupSpec.serviceType）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedOptions(String AdvancedOptions) {
        this.AdvancedOptions = AdvancedOptions;
    }

    /**
     * Get <p>自定义镜像地址（为空则使用引擎默认镜像）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image <p>自定义镜像地址（为空则使用引擎默认镜像）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>自定义镜像地址（为空则使用引擎默认镜像）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image <p>自定义镜像地址（为空则使用引擎默认镜像）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>资源分区名称（后端按 ResourcePartitionId 反查 ResourceService 填充；分区不存在或 ResourceManager 未启用时可能为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePartitionName <p>资源分区名称（后端按 ResourcePartitionId 反查 ResourceService 填充；分区不存在或 ResourceManager 未启用时可能为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourcePartitionName() {
        return this.ResourcePartitionName;
    }

    /**
     * Set <p>资源分区名称（后端按 ResourcePartitionId 反查 ResourceService 填充；分区不存在或 ResourceManager 未启用时可能为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePartitionName <p>资源分区名称（后端按 ResourcePartitionId 反查 ResourceService 填充；分区不存在或 ResourceManager 未启用时可能为 null）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePartitionName(String ResourcePartitionName) {
        this.ResourcePartitionName = ResourcePartitionName;
    }

    public DeploymentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeploymentInfo(DeploymentInfo source) {
        if (source.DeploymentId != null) {
            this.DeploymentId = new String(source.DeploymentId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.AvailableReplicas != null) {
            this.AvailableReplicas = new Long(source.AvailableReplicas);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
        if (source.HeadHighAvailabilityEnabled != null) {
            this.HeadHighAvailabilityEnabled = new Boolean(source.HeadHighAvailabilityEnabled);
        }
        if (source.AdvancedParams != null) {
            this.AdvancedParams = new String(source.AdvancedParams);
        }
        if (source.AutoscalingEnabled != null) {
            this.AutoscalingEnabled = new Boolean(source.AutoscalingEnabled);
        }
        if (source.ModelStorageConfig != null) {
            this.ModelStorageConfig = new String(source.ModelStorageConfig);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.NeutrinoServeId != null) {
            this.NeutrinoServeId = new String(source.NeutrinoServeId);
        }
        if (source.RayDashboardUrl != null) {
            this.RayDashboardUrl = new String(source.RayDashboardUrl);
        }
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ResourcePartitionName != null) {
            this.ResourcePartitionName = new String(source.ResourcePartitionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeploymentId", this.DeploymentId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "AvailableReplicas", this.AvailableReplicas);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "HeadHighAvailabilityEnabled", this.HeadHighAvailabilityEnabled);
        this.setParamSimple(map, prefix + "AdvancedParams", this.AdvancedParams);
        this.setParamSimple(map, prefix + "AutoscalingEnabled", this.AutoscalingEnabled);
        this.setParamSimple(map, prefix + "ModelStorageConfig", this.ModelStorageConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "NeutrinoServeId", this.NeutrinoServeId);
        this.setParamSimple(map, prefix + "RayDashboardUrl", this.RayDashboardUrl);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ResourcePartitionName", this.ResourcePartitionName);

    }
}

