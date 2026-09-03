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

public class CreateBenchmarkTaskResponse extends AbstractModel {

    /**
    * <p>benchmark任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>benchmark任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>推理服务id</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>推理服务名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>Completed： 完成</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>输入token量</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>输出token量</p>
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>每秒请求量</p>
    */
    @SerializedName("RequestsPerSecond")
    @Expose
    private Float RequestsPerSecond;

    /**
    * <p>最大并发量</p>
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * <p>prompts总量</p>
    */
    @SerializedName("TotalPrompts")
    @Expose
    private Long TotalPrompts;

    /**
    * <p>是否使用Gateway</p>
    */
    @SerializedName("UseGateway")
    @Expose
    private Boolean UseGateway;

    /**
    * <p>部署集群名称</p>
    */
    @SerializedName("DeploymentName")
    @Expose
    private String DeploymentName;

    /**
    * <p>apikey的id</p>
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * <p>apikey名称</p>
    */
    @SerializedName("ApiKeyName")
    @Expose
    private String ApiKeyName;

    /**
    * <p>主账号uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>子账号uin</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>与本次评测关联的部署及其资源规格。</p>
    */
    @SerializedName("DeploymentResources")
    @Expose
    private DeploymentResourceInfo [] DeploymentResources;

    /**
    * <p>评测容器自身使用的资源规格</p>
    */
    @SerializedName("Resources")
    @Expose
    private BenchmarkResourceInfo Resources;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>benchmark任务id</p> 
     * @return TaskId <p>benchmark任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>benchmark任务id</p>
     * @param TaskId <p>benchmark任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>benchmark任务名称</p> 
     * @return TaskName <p>benchmark任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>benchmark任务名称</p>
     * @param TaskName <p>benchmark任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>推理服务id</p> 
     * @return ServiceId <p>推理服务id</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>推理服务id</p>
     * @param ServiceId <p>推理服务id</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>推理服务名称</p> 
     * @return ServiceName <p>推理服务名称</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>推理服务名称</p>
     * @param ServiceName <p>推理服务名称</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>Completed： 完成</li></ul> 
     * @return Status <p>任务状态</p><p>枚举值：</p><ul><li>Completed： 完成</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>Completed： 完成</li></ul>
     * @param Status <p>任务状态</p><p>枚举值：</p><ul><li>Completed： 完成</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>输入token量</p> 
     * @return InputTokens <p>输入token量</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>输入token量</p>
     * @param InputTokens <p>输入token量</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>输出token量</p> 
     * @return OutputTokens <p>输出token量</p>
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>输出token量</p>
     * @param OutputTokens <p>输出token量</p>
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>每秒请求量</p> 
     * @return RequestsPerSecond <p>每秒请求量</p>
     */
    public Float getRequestsPerSecond() {
        return this.RequestsPerSecond;
    }

    /**
     * Set <p>每秒请求量</p>
     * @param RequestsPerSecond <p>每秒请求量</p>
     */
    public void setRequestsPerSecond(Float RequestsPerSecond) {
        this.RequestsPerSecond = RequestsPerSecond;
    }

    /**
     * Get <p>最大并发量</p> 
     * @return MaxConcurrency <p>最大并发量</p>
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set <p>最大并发量</p>
     * @param MaxConcurrency <p>最大并发量</p>
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get <p>prompts总量</p> 
     * @return TotalPrompts <p>prompts总量</p>
     */
    public Long getTotalPrompts() {
        return this.TotalPrompts;
    }

    /**
     * Set <p>prompts总量</p>
     * @param TotalPrompts <p>prompts总量</p>
     */
    public void setTotalPrompts(Long TotalPrompts) {
        this.TotalPrompts = TotalPrompts;
    }

    /**
     * Get <p>是否使用Gateway</p> 
     * @return UseGateway <p>是否使用Gateway</p>
     */
    public Boolean getUseGateway() {
        return this.UseGateway;
    }

    /**
     * Set <p>是否使用Gateway</p>
     * @param UseGateway <p>是否使用Gateway</p>
     */
    public void setUseGateway(Boolean UseGateway) {
        this.UseGateway = UseGateway;
    }

    /**
     * Get <p>部署集群名称</p> 
     * @return DeploymentName <p>部署集群名称</p>
     */
    public String getDeploymentName() {
        return this.DeploymentName;
    }

    /**
     * Set <p>部署集群名称</p>
     * @param DeploymentName <p>部署集群名称</p>
     */
    public void setDeploymentName(String DeploymentName) {
        this.DeploymentName = DeploymentName;
    }

    /**
     * Get <p>apikey的id</p> 
     * @return ApiKeyId <p>apikey的id</p>
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set <p>apikey的id</p>
     * @param ApiKeyId <p>apikey的id</p>
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get <p>apikey名称</p> 
     * @return ApiKeyName <p>apikey名称</p>
     */
    public String getApiKeyName() {
        return this.ApiKeyName;
    }

    /**
     * Set <p>apikey名称</p>
     * @param ApiKeyName <p>apikey名称</p>
     */
    public void setApiKeyName(String ApiKeyName) {
        this.ApiKeyName = ApiKeyName;
    }

    /**
     * Get <p>主账号uin</p> 
     * @return Uin <p>主账号uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号uin</p>
     * @param Uin <p>主账号uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>子账号uin</p> 
     * @return SubAccountUin <p>子账号uin</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>子账号uin</p>
     * @param SubAccountUin <p>子账号uin</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>与本次评测关联的部署及其资源规格。</p> 
     * @return DeploymentResources <p>与本次评测关联的部署及其资源规格。</p>
     */
    public DeploymentResourceInfo [] getDeploymentResources() {
        return this.DeploymentResources;
    }

    /**
     * Set <p>与本次评测关联的部署及其资源规格。</p>
     * @param DeploymentResources <p>与本次评测关联的部署及其资源规格。</p>
     */
    public void setDeploymentResources(DeploymentResourceInfo [] DeploymentResources) {
        this.DeploymentResources = DeploymentResources;
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

    public CreateBenchmarkTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBenchmarkTaskResponse(CreateBenchmarkTaskResponse source) {
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
        if (source.DeploymentResources != null) {
            this.DeploymentResources = new DeploymentResourceInfo[source.DeploymentResources.length];
            for (int i = 0; i < source.DeploymentResources.length; i++) {
                this.DeploymentResources[i] = new DeploymentResourceInfo(source.DeploymentResources[i]);
            }
        }
        if (source.Resources != null) {
            this.Resources = new BenchmarkResourceInfo(source.Resources);
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
        this.setParamArrayObj(map, prefix + "DeploymentResources.", this.DeploymentResources);
        this.setParamObj(map, prefix + "Resources.", this.Resources);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

