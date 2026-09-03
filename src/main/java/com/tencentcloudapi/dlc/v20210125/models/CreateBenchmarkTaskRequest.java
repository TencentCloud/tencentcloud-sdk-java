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

public class CreateBenchmarkTaskRequest extends AbstractModel {

    /**
    * <p>推理服务Id</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>任务名称（可选，不填则自动生成）</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>每个 Prompt 的平均输入 Token 数</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>模型输出的最大 Token 数</p>
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>每秒发送的请求数 (QPS)</p>
    */
    @SerializedName("RequestsPerSecond")
    @Expose
    private Float RequestsPerSecond;

    /**
    * <p>最大同时并发请求数</p>
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * <p>评测使用的 Prompt 总数</p>
    */
    @SerializedName("TotalPrompts")
    @Expose
    private Long TotalPrompts;

    /**
    * <p>是否经 Ingress 网关访问推理服务（默认 true；false 则集群内直连 SVC）</p>
    */
    @SerializedName("UseGateway")
    @Expose
    private Boolean UseGateway;

    /**
    * <p>ray部署集群Id</p>
    */
    @SerializedName("DeploymentId")
    @Expose
    private String DeploymentId;

    /**
    * <p>apiKey的Id</p>
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * <p>评测容器所在资源包 ID</p>
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>评测容器所在资源包下的资源组名称</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>评测容器计费项（规格）。仅允许 CPU 计费项。</p>
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
    * <p>评测容器计费项规格倍数</p>
    */
    @SerializedName("Spec")
    @Expose
    private Long Spec;

    /**
     * Get <p>推理服务Id</p> 
     * @return ServiceId <p>推理服务Id</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>推理服务Id</p>
     * @param ServiceId <p>推理服务Id</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>任务名称（可选，不填则自动生成）</p> 
     * @return TaskName <p>任务名称（可选，不填则自动生成）</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称（可选，不填则自动生成）</p>
     * @param TaskName <p>任务名称（可选，不填则自动生成）</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>每个 Prompt 的平均输入 Token 数</p> 
     * @return InputTokens <p>每个 Prompt 的平均输入 Token 数</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>每个 Prompt 的平均输入 Token 数</p>
     * @param InputTokens <p>每个 Prompt 的平均输入 Token 数</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>模型输出的最大 Token 数</p> 
     * @return OutputTokens <p>模型输出的最大 Token 数</p>
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>模型输出的最大 Token 数</p>
     * @param OutputTokens <p>模型输出的最大 Token 数</p>
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>每秒发送的请求数 (QPS)</p> 
     * @return RequestsPerSecond <p>每秒发送的请求数 (QPS)</p>
     */
    public Float getRequestsPerSecond() {
        return this.RequestsPerSecond;
    }

    /**
     * Set <p>每秒发送的请求数 (QPS)</p>
     * @param RequestsPerSecond <p>每秒发送的请求数 (QPS)</p>
     */
    public void setRequestsPerSecond(Float RequestsPerSecond) {
        this.RequestsPerSecond = RequestsPerSecond;
    }

    /**
     * Get <p>最大同时并发请求数</p> 
     * @return MaxConcurrency <p>最大同时并发请求数</p>
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set <p>最大同时并发请求数</p>
     * @param MaxConcurrency <p>最大同时并发请求数</p>
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get <p>评测使用的 Prompt 总数</p> 
     * @return TotalPrompts <p>评测使用的 Prompt 总数</p>
     */
    public Long getTotalPrompts() {
        return this.TotalPrompts;
    }

    /**
     * Set <p>评测使用的 Prompt 总数</p>
     * @param TotalPrompts <p>评测使用的 Prompt 总数</p>
     */
    public void setTotalPrompts(Long TotalPrompts) {
        this.TotalPrompts = TotalPrompts;
    }

    /**
     * Get <p>是否经 Ingress 网关访问推理服务（默认 true；false 则集群内直连 SVC）</p> 
     * @return UseGateway <p>是否经 Ingress 网关访问推理服务（默认 true；false 则集群内直连 SVC）</p>
     */
    public Boolean getUseGateway() {
        return this.UseGateway;
    }

    /**
     * Set <p>是否经 Ingress 网关访问推理服务（默认 true；false 则集群内直连 SVC）</p>
     * @param UseGateway <p>是否经 Ingress 网关访问推理服务（默认 true；false 则集群内直连 SVC）</p>
     */
    public void setUseGateway(Boolean UseGateway) {
        this.UseGateway = UseGateway;
    }

    /**
     * Get <p>ray部署集群Id</p> 
     * @return DeploymentId <p>ray部署集群Id</p>
     */
    public String getDeploymentId() {
        return this.DeploymentId;
    }

    /**
     * Set <p>ray部署集群Id</p>
     * @param DeploymentId <p>ray部署集群Id</p>
     */
    public void setDeploymentId(String DeploymentId) {
        this.DeploymentId = DeploymentId;
    }

    /**
     * Get <p>apiKey的Id</p> 
     * @return ApiKeyId <p>apiKey的Id</p>
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set <p>apiKey的Id</p>
     * @param ApiKeyId <p>apiKey的Id</p>
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get <p>评测容器所在资源包 ID</p> 
     * @return ResourcePartitionId <p>评测容器所在资源包 ID</p>
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>评测容器所在资源包 ID</p>
     * @param ResourcePartitionId <p>评测容器所在资源包 ID</p>
     */
    public void setResourcePartitionId(String ResourcePartitionId) {
        this.ResourcePartitionId = ResourcePartitionId;
    }

    /**
     * Get <p>评测容器所在资源包下的资源组名称</p> 
     * @return Queue <p>评测容器所在资源包下的资源组名称</p>
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>评测容器所在资源包下的资源组名称</p>
     * @param Queue <p>评测容器所在资源包下的资源组名称</p>
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>评测容器计费项（规格）。仅允许 CPU 计费项。</p> 
     * @return BillingItem <p>评测容器计费项（规格）。仅允许 CPU 计费项。</p>
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set <p>评测容器计费项（规格）。仅允许 CPU 计费项。</p>
     * @param BillingItem <p>评测容器计费项（规格）。仅允许 CPU 计费项。</p>
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    /**
     * Get <p>评测容器计费项规格倍数</p> 
     * @return Spec <p>评测容器计费项规格倍数</p>
     */
    public Long getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>评测容器计费项规格倍数</p>
     * @param Spec <p>评测容器计费项规格倍数</p>
     */
    public void setSpec(Long Spec) {
        this.Spec = Spec;
    }

    public CreateBenchmarkTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBenchmarkTaskRequest(CreateBenchmarkTaskRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
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
        if (source.DeploymentId != null) {
            this.DeploymentId = new String(source.DeploymentId);
        }
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
        if (source.Spec != null) {
            this.Spec = new Long(source.Spec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "RequestsPerSecond", this.RequestsPerSecond);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "TotalPrompts", this.TotalPrompts);
        this.setParamSimple(map, prefix + "UseGateway", this.UseGateway);
        this.setParamSimple(map, prefix + "DeploymentId", this.DeploymentId);
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);
        this.setParamSimple(map, prefix + "Spec", this.Spec);

    }
}

