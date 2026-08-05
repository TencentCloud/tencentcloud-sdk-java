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

public class StopInferenceServiceResponse extends AbstractModel {

    /**
    * <p>推理服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>关联的模型UID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelUid")
    @Expose
    private String ModelUid;

    /**
    * <p>关联的模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>关联的模型版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>模型标识符（OpenAI 兼容 API 中的 model 字段）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelIdentifier")
    @Expose
    private String ModelIdentifier;

    /**
    * <p>关联模型的类型（LLM / VLM / Embedding / Reranker / TTS / ASR / CV / NLP / ML）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * <p>服务状态（Running/Stopped/Deploying/Failed）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>服务端点URL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndpointUrl")
    @Expose
    private String EndpointUrl;

    /**
    * <p>OpenAI 兼容统一入口 URL（通过 API-Key 路由，适用于 LLM/Embedding/Reranker）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnifiedEndpointUrl")
    @Expose
    private String UnifiedEndpointUrl;

    /**
    * <p>KServe V2 协议统一入口 URL（通过 API-Key + model name 路由，适用于 XGBoost 等传统 ML 模型）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnifiedV2EndpointUrl")
    @Expose
    private String UnifiedV2EndpointUrl;

    /**
    * <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>主账号UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>创建时间（Unix 时间戳，毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间（Unix 时间戳，毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>部署数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeploymentCount")
    @Expose
    private Long DeploymentCount;

    /**
    * <p>是否存在至少一个运行中的部署</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasRunningDeployment")
    @Expose
    private Boolean HasRunningDeployment;

    /**
    * <p>是否启用 API-Key 鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiKeyAuthEnabled")
    @Expose
    private Boolean ApiKeyAuthEnabled;

    /**
    * <p>是否强制开启 API-Key 鉴权（生产环境为 true，不允许关闭）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiKeyAuthForceEnabled")
    @Expose
    private Boolean ApiKeyAuthForceEnabled;

    /**
    * <p>是否跳过 TLS 证书验证（自签证书场景，前端 curl 命令需加 -k 参数）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkipTlsVerify")
    @Expose
    private Boolean SkipTlsVerify;

    /**
    * <p>子账号UIN（实际操作者）</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>运行中部署的 CPU 资源汇总</p>
    */
    @SerializedName("CpuResourceSummary")
    @Expose
    private CpuSummaryItem CpuResourceSummary;

    /**
    * <p>资源配置（JSON 字符串，取自第一个部署）</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>推理服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId <p>推理服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>推理服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId <p>推理服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>关联的模型UID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelUid <p>关联的模型UID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelUid() {
        return this.ModelUid;
    }

    /**
     * Set <p>关联的模型UID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelUid <p>关联的模型UID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelUid(String ModelUid) {
        this.ModelUid = ModelUid;
    }

    /**
     * Get <p>关联的模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelName <p>关联的模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>关联的模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelName <p>关联的模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>关联的模型版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelVersion <p>关联的模型版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>关联的模型版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelVersion <p>关联的模型版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>模型标识符（OpenAI 兼容 API 中的 model 字段）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelIdentifier <p>模型标识符（OpenAI 兼容 API 中的 model 字段）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelIdentifier() {
        return this.ModelIdentifier;
    }

    /**
     * Set <p>模型标识符（OpenAI 兼容 API 中的 model 字段）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelIdentifier <p>模型标识符（OpenAI 兼容 API 中的 model 字段）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelIdentifier(String ModelIdentifier) {
        this.ModelIdentifier = ModelIdentifier;
    }

    /**
     * Get <p>关联模型的类型（LLM / VLM / Embedding / Reranker / TTS / ASR / CV / NLP / ML）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelType <p>关联模型的类型（LLM / VLM / Embedding / Reranker / TTS / ASR / CV / NLP / ML）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>关联模型的类型（LLM / VLM / Embedding / Reranker / TTS / ASR / CV / NLP / ML）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelType <p>关联模型的类型（LLM / VLM / Embedding / Reranker / TTS / ASR / CV / NLP / ML）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>服务状态（Running/Stopped/Deploying/Failed）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>服务状态（Running/Stopped/Deploying/Failed）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>服务状态（Running/Stopped/Deploying/Failed）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>服务状态（Running/Stopped/Deploying/Failed）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>服务端点URL</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndpointUrl <p>服务端点URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpointUrl() {
        return this.EndpointUrl;
    }

    /**
     * Set <p>服务端点URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndpointUrl <p>服务端点URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpointUrl(String EndpointUrl) {
        this.EndpointUrl = EndpointUrl;
    }

    /**
     * Get <p>OpenAI 兼容统一入口 URL（通过 API-Key 路由，适用于 LLM/Embedding/Reranker）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnifiedEndpointUrl <p>OpenAI 兼容统一入口 URL（通过 API-Key 路由，适用于 LLM/Embedding/Reranker）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnifiedEndpointUrl() {
        return this.UnifiedEndpointUrl;
    }

    /**
     * Set <p>OpenAI 兼容统一入口 URL（通过 API-Key 路由，适用于 LLM/Embedding/Reranker）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnifiedEndpointUrl <p>OpenAI 兼容统一入口 URL（通过 API-Key 路由，适用于 LLM/Embedding/Reranker）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnifiedEndpointUrl(String UnifiedEndpointUrl) {
        this.UnifiedEndpointUrl = UnifiedEndpointUrl;
    }

    /**
     * Get <p>KServe V2 协议统一入口 URL（通过 API-Key + model name 路由，适用于 XGBoost 等传统 ML 模型）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnifiedV2EndpointUrl <p>KServe V2 协议统一入口 URL（通过 API-Key + model name 路由，适用于 XGBoost 等传统 ML 模型）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnifiedV2EndpointUrl() {
        return this.UnifiedV2EndpointUrl;
    }

    /**
     * Set <p>KServe V2 协议统一入口 URL（通过 API-Key + model name 路由，适用于 XGBoost 等传统 ML 模型）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnifiedV2EndpointUrl <p>KServe V2 协议统一入口 URL（通过 API-Key + model name 路由，适用于 XGBoost 等传统 ML 模型）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnifiedV2EndpointUrl(String UnifiedV2EndpointUrl) {
        this.UnifiedV2EndpointUrl = UnifiedV2EndpointUrl;
    }

    /**
     * Get <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>应用ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>主账号UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin <p>主账号UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin <p>主账号UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>创建时间（Unix 时间戳，毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间（Unix 时间戳，毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（Unix 时间戳，毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间（Unix 时间戳，毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间（Unix 时间戳，毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间（Unix 时间戳，毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（Unix 时间戳，毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间（Unix 时间戳，毫秒）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>部署数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeploymentCount <p>部署数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeploymentCount() {
        return this.DeploymentCount;
    }

    /**
     * Set <p>部署数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeploymentCount <p>部署数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeploymentCount(Long DeploymentCount) {
        this.DeploymentCount = DeploymentCount;
    }

    /**
     * Get <p>是否存在至少一个运行中的部署</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasRunningDeployment <p>是否存在至少一个运行中的部署</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasRunningDeployment() {
        return this.HasRunningDeployment;
    }

    /**
     * Set <p>是否存在至少一个运行中的部署</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasRunningDeployment <p>是否存在至少一个运行中的部署</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasRunningDeployment(Boolean HasRunningDeployment) {
        this.HasRunningDeployment = HasRunningDeployment;
    }

    /**
     * Get <p>是否启用 API-Key 鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiKeyAuthEnabled <p>是否启用 API-Key 鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getApiKeyAuthEnabled() {
        return this.ApiKeyAuthEnabled;
    }

    /**
     * Set <p>是否启用 API-Key 鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiKeyAuthEnabled <p>是否启用 API-Key 鉴权</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiKeyAuthEnabled(Boolean ApiKeyAuthEnabled) {
        this.ApiKeyAuthEnabled = ApiKeyAuthEnabled;
    }

    /**
     * Get <p>是否强制开启 API-Key 鉴权（生产环境为 true，不允许关闭）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiKeyAuthForceEnabled <p>是否强制开启 API-Key 鉴权（生产环境为 true，不允许关闭）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getApiKeyAuthForceEnabled() {
        return this.ApiKeyAuthForceEnabled;
    }

    /**
     * Set <p>是否强制开启 API-Key 鉴权（生产环境为 true，不允许关闭）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiKeyAuthForceEnabled <p>是否强制开启 API-Key 鉴权（生产环境为 true，不允许关闭）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiKeyAuthForceEnabled(Boolean ApiKeyAuthForceEnabled) {
        this.ApiKeyAuthForceEnabled = ApiKeyAuthForceEnabled;
    }

    /**
     * Get <p>是否跳过 TLS 证书验证（自签证书场景，前端 curl 命令需加 -k 参数）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkipTlsVerify <p>是否跳过 TLS 证书验证（自签证书场景，前端 curl 命令需加 -k 参数）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSkipTlsVerify() {
        return this.SkipTlsVerify;
    }

    /**
     * Set <p>是否跳过 TLS 证书验证（自签证书场景，前端 curl 命令需加 -k 参数）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkipTlsVerify <p>是否跳过 TLS 证书验证（自签证书场景，前端 curl 命令需加 -k 参数）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkipTlsVerify(Boolean SkipTlsVerify) {
        this.SkipTlsVerify = SkipTlsVerify;
    }

    /**
     * Get <p>子账号UIN（实际操作者）</p> 
     * @return SubAccountUin <p>子账号UIN（实际操作者）</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>子账号UIN（实际操作者）</p>
     * @param SubAccountUin <p>子账号UIN（实际操作者）</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>运行中部署的 CPU 资源汇总</p> 
     * @return CpuResourceSummary <p>运行中部署的 CPU 资源汇总</p>
     */
    public CpuSummaryItem getCpuResourceSummary() {
        return this.CpuResourceSummary;
    }

    /**
     * Set <p>运行中部署的 CPU 资源汇总</p>
     * @param CpuResourceSummary <p>运行中部署的 CPU 资源汇总</p>
     */
    public void setCpuResourceSummary(CpuSummaryItem CpuResourceSummary) {
        this.CpuResourceSummary = CpuResourceSummary;
    }

    /**
     * Get <p>资源配置（JSON 字符串，取自第一个部署）</p> 
     * @return ResourceConfig <p>资源配置（JSON 字符串，取自第一个部署）</p>
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>资源配置（JSON 字符串，取自第一个部署）</p>
     * @param ResourceConfig <p>资源配置（JSON 字符串，取自第一个部署）</p>
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public StopInferenceServiceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopInferenceServiceResponse(StopInferenceServiceResponse source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ModelUid != null) {
            this.ModelUid = new String(source.ModelUid);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.ModelIdentifier != null) {
            this.ModelIdentifier = new String(source.ModelIdentifier);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EndpointUrl != null) {
            this.EndpointUrl = new String(source.EndpointUrl);
        }
        if (source.UnifiedEndpointUrl != null) {
            this.UnifiedEndpointUrl = new String(source.UnifiedEndpointUrl);
        }
        if (source.UnifiedV2EndpointUrl != null) {
            this.UnifiedV2EndpointUrl = new String(source.UnifiedV2EndpointUrl);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.DeploymentCount != null) {
            this.DeploymentCount = new Long(source.DeploymentCount);
        }
        if (source.HasRunningDeployment != null) {
            this.HasRunningDeployment = new Boolean(source.HasRunningDeployment);
        }
        if (source.ApiKeyAuthEnabled != null) {
            this.ApiKeyAuthEnabled = new Boolean(source.ApiKeyAuthEnabled);
        }
        if (source.ApiKeyAuthForceEnabled != null) {
            this.ApiKeyAuthForceEnabled = new Boolean(source.ApiKeyAuthForceEnabled);
        }
        if (source.SkipTlsVerify != null) {
            this.SkipTlsVerify = new Boolean(source.SkipTlsVerify);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.CpuResourceSummary != null) {
            this.CpuResourceSummary = new CpuSummaryItem(source.CpuResourceSummary);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ModelUid", this.ModelUid);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "ModelIdentifier", this.ModelIdentifier);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EndpointUrl", this.EndpointUrl);
        this.setParamSimple(map, prefix + "UnifiedEndpointUrl", this.UnifiedEndpointUrl);
        this.setParamSimple(map, prefix + "UnifiedV2EndpointUrl", this.UnifiedV2EndpointUrl);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DeploymentCount", this.DeploymentCount);
        this.setParamSimple(map, prefix + "HasRunningDeployment", this.HasRunningDeployment);
        this.setParamSimple(map, prefix + "ApiKeyAuthEnabled", this.ApiKeyAuthEnabled);
        this.setParamSimple(map, prefix + "ApiKeyAuthForceEnabled", this.ApiKeyAuthForceEnabled);
        this.setParamSimple(map, prefix + "SkipTlsVerify", this.SkipTlsVerify);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamObj(map, prefix + "CpuResourceSummary.", this.CpuResourceSummary);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

