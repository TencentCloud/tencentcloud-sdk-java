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

public class StopBenchmarkTaskResponse extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>关联的推理服务ID</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>关联的推理服务名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>任务状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>输入 Token 数</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>输出 Token 数</p>
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>每秒请求数 (QPS)</p>
    */
    @SerializedName("RequestsPerSecond")
    @Expose
    private Float RequestsPerSecond;

    /**
    * <p>最大并发数</p>
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * <p>Prompts 总数</p>
    */
    @SerializedName("TotalPrompts")
    @Expose
    private Long TotalPrompts;

    /**
    * <p>是否经网关。true=通过网关访问；false=集群内直连 SVC</p>
    */
    @SerializedName("UseGateway")
    @Expose
    private Boolean UseGateway;

    /**
    * <p>直连模式下使用的部署名称（仅 UseGateway=false 时有值）</p>
    */
    @SerializedName("DeploymentName")
    @Expose
    private String DeploymentName;

    /**
    * <p>API Key ID（走网关时使用的 API Key 标识）</p>
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * <p>API Key 名称</p>
    */
    @SerializedName("ApiKeyName")
    @Expose
    private String ApiKeyName;

    /**
    * <p>主账号UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>创建时间（毫秒时间戳）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间（毫秒时间戳）</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>子账号UIN（实际操作者）</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>评测容器自身使用的资源规格</p>
    */
    @SerializedName("Resources")
    @Expose
    private BenchmarkResourceInfo Resources;

    /**
    * <p>与本次评测关联的部署及其资源规格。语义按模式区分： • 网关模式（UseGateway=true）：Service 下所有 Running 部署（长度可能 &gt; 1） • 直连模式（UseGateway=false）：仅绑定的那个部署（长度恒为 1）</p>
    */
    @SerializedName("DeploymentResources")
    @Expose
    private DeploymentResourceInfo [] DeploymentResources;

    /**
    * <p>发生错误时的错误信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>关联的推理服务ID</p> 
     * @return ServiceId <p>关联的推理服务ID</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>关联的推理服务ID</p>
     * @param ServiceId <p>关联的推理服务ID</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>关联的推理服务名称</p> 
     * @return ServiceName <p>关联的推理服务名称</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>关联的推理服务名称</p>
     * @param ServiceName <p>关联的推理服务名称</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>任务状态</p> 
     * @return Status <p>任务状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p>
     * @param Status <p>任务状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>输入 Token 数</p> 
     * @return InputTokens <p>输入 Token 数</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>输入 Token 数</p>
     * @param InputTokens <p>输入 Token 数</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>输出 Token 数</p> 
     * @return OutputTokens <p>输出 Token 数</p>
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>输出 Token 数</p>
     * @param OutputTokens <p>输出 Token 数</p>
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>每秒请求数 (QPS)</p> 
     * @return RequestsPerSecond <p>每秒请求数 (QPS)</p>
     */
    public Float getRequestsPerSecond() {
        return this.RequestsPerSecond;
    }

    /**
     * Set <p>每秒请求数 (QPS)</p>
     * @param RequestsPerSecond <p>每秒请求数 (QPS)</p>
     */
    public void setRequestsPerSecond(Float RequestsPerSecond) {
        this.RequestsPerSecond = RequestsPerSecond;
    }

    /**
     * Get <p>最大并发数</p> 
     * @return MaxConcurrency <p>最大并发数</p>
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set <p>最大并发数</p>
     * @param MaxConcurrency <p>最大并发数</p>
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get <p>Prompts 总数</p> 
     * @return TotalPrompts <p>Prompts 总数</p>
     */
    public Long getTotalPrompts() {
        return this.TotalPrompts;
    }

    /**
     * Set <p>Prompts 总数</p>
     * @param TotalPrompts <p>Prompts 总数</p>
     */
    public void setTotalPrompts(Long TotalPrompts) {
        this.TotalPrompts = TotalPrompts;
    }

    /**
     * Get <p>是否经网关。true=通过网关访问；false=集群内直连 SVC</p> 
     * @return UseGateway <p>是否经网关。true=通过网关访问；false=集群内直连 SVC</p>
     */
    public Boolean getUseGateway() {
        return this.UseGateway;
    }

    /**
     * Set <p>是否经网关。true=通过网关访问；false=集群内直连 SVC</p>
     * @param UseGateway <p>是否经网关。true=通过网关访问；false=集群内直连 SVC</p>
     */
    public void setUseGateway(Boolean UseGateway) {
        this.UseGateway = UseGateway;
    }

    /**
     * Get <p>直连模式下使用的部署名称（仅 UseGateway=false 时有值）</p> 
     * @return DeploymentName <p>直连模式下使用的部署名称（仅 UseGateway=false 时有值）</p>
     */
    public String getDeploymentName() {
        return this.DeploymentName;
    }

    /**
     * Set <p>直连模式下使用的部署名称（仅 UseGateway=false 时有值）</p>
     * @param DeploymentName <p>直连模式下使用的部署名称（仅 UseGateway=false 时有值）</p>
     */
    public void setDeploymentName(String DeploymentName) {
        this.DeploymentName = DeploymentName;
    }

    /**
     * Get <p>API Key ID（走网关时使用的 API Key 标识）</p> 
     * @return ApiKeyId <p>API Key ID（走网关时使用的 API Key 标识）</p>
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set <p>API Key ID（走网关时使用的 API Key 标识）</p>
     * @param ApiKeyId <p>API Key ID（走网关时使用的 API Key 标识）</p>
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get <p>API Key 名称</p> 
     * @return ApiKeyName <p>API Key 名称</p>
     */
    public String getApiKeyName() {
        return this.ApiKeyName;
    }

    /**
     * Set <p>API Key 名称</p>
     * @param ApiKeyName <p>API Key 名称</p>
     */
    public void setApiKeyName(String ApiKeyName) {
        this.ApiKeyName = ApiKeyName;
    }

    /**
     * Get <p>主账号UIN</p> 
     * @return Uin <p>主账号UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号UIN</p>
     * @param Uin <p>主账号UIN</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>创建时间（毫秒时间戳）</p> 
     * @return CreateTime <p>创建时间（毫秒时间戳）</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（毫秒时间戳）</p>
     * @param CreateTime <p>创建时间（毫秒时间戳）</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间（毫秒时间戳）</p> 
     * @return UpdateTime <p>更新时间（毫秒时间戳）</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（毫秒时间戳）</p>
     * @param UpdateTime <p>更新时间（毫秒时间戳）</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
     * Get <p>评测容器自身使用的资源规格</p> 
     * @return Resources <p>评测容器自身使用的资源规格</p>
     */
    public BenchmarkResourceInfo getResources() {
        return this.Resources;
    }

    /**
     * Set <p>评测容器自身使用的资源规格</p>
     * @param Resources <p>评测容器自身使用的资源规格</p>
     */
    public void setResources(BenchmarkResourceInfo Resources) {
        this.Resources = Resources;
    }

    /**
     * Get <p>与本次评测关联的部署及其资源规格。语义按模式区分： • 网关模式（UseGateway=true）：Service 下所有 Running 部署（长度可能 &gt; 1） • 直连模式（UseGateway=false）：仅绑定的那个部署（长度恒为 1）</p> 
     * @return DeploymentResources <p>与本次评测关联的部署及其资源规格。语义按模式区分： • 网关模式（UseGateway=true）：Service 下所有 Running 部署（长度可能 &gt; 1） • 直连模式（UseGateway=false）：仅绑定的那个部署（长度恒为 1）</p>
     */
    public DeploymentResourceInfo [] getDeploymentResources() {
        return this.DeploymentResources;
    }

    /**
     * Set <p>与本次评测关联的部署及其资源规格。语义按模式区分： • 网关模式（UseGateway=true）：Service 下所有 Running 部署（长度可能 &gt; 1） • 直连模式（UseGateway=false）：仅绑定的那个部署（长度恒为 1）</p>
     * @param DeploymentResources <p>与本次评测关联的部署及其资源规格。语义按模式区分： • 网关模式（UseGateway=true）：Service 下所有 Running 部署（长度可能 &gt; 1） • 直连模式（UseGateway=false）：仅绑定的那个部署（长度恒为 1）</p>
     */
    public void setDeploymentResources(DeploymentResourceInfo [] DeploymentResources) {
        this.DeploymentResources = DeploymentResources;
    }

    /**
     * Get <p>发生错误时的错误信息</p> 
     * @return ErrorMessage <p>发生错误时的错误信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>发生错误时的错误信息</p>
     * @param ErrorMessage <p>发生错误时的错误信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
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

    public StopBenchmarkTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopBenchmarkTaskResponse(StopBenchmarkTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.RequestsPerSecond != null) {
            this.RequestsPerSecond = new Float(source.RequestsPerSecond);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.TotalPrompts != null) {
            this.TotalPrompts = new Long(source.TotalPrompts);
        }
        if (source.UseGateway != null) {
            this.UseGateway = new Boolean(source.UseGateway);
        }
        if (source.DeploymentName != null) {
            this.DeploymentName = new String(source.DeploymentName);
        }
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.ApiKeyName != null) {
            this.ApiKeyName = new String(source.ApiKeyName);
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
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.Resources != null) {
            this.Resources = new BenchmarkResourceInfo(source.Resources);
        }
        if (source.DeploymentResources != null) {
            this.DeploymentResources = new DeploymentResourceInfo[source.DeploymentResources.length];
            for (int i = 0; i < source.DeploymentResources.length; i++) {
                this.DeploymentResources[i] = new DeploymentResourceInfo(source.DeploymentResources[i]);
            }
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "RequestsPerSecond", this.RequestsPerSecond);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "TotalPrompts", this.TotalPrompts);
        this.setParamSimple(map, prefix + "UseGateway", this.UseGateway);
        this.setParamSimple(map, prefix + "DeploymentName", this.DeploymentName);
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "ApiKeyName", this.ApiKeyName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamObj(map, prefix + "Resources.", this.Resources);
        this.setParamArrayObj(map, prefix + "DeploymentResources.", this.DeploymentResources);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

