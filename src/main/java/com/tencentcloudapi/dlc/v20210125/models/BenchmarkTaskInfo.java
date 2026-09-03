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

public class BenchmarkTaskInfo extends AbstractModel {

    /**
    * <p>benchmark任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>关联的推理服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>关联的推理服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>任务状态（Running/Completed/Failed/Pending/Stopped）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>输入 Token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>输出 Token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>每秒请求数 (QPS)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestsPerSecond")
    @Expose
    private Float RequestsPerSecond;

    /**
    * <p>最大并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * <p>Prompts 总数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalPrompts")
    @Expose
    private Long TotalPrompts;

    /**
    * <p>是否经 Ingress 网关（true=网关, false=集群内直连 SVC）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseGateway")
    @Expose
    private Boolean UseGateway;

    /**
    * <p>直连模式下使用的部署名称（仅 UseGateway=false 时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
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
    * <p>TTFT 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeToFirstTokenAvg")
    @Expose
    private Float TimeToFirstTokenAvg;

    /**
    * <p>TTFT 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeToFirstTokenMedian")
    @Expose
    private Float TimeToFirstTokenMedian;

    /**
    * <p>TTFT P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeToFirstTokenP99")
    @Expose
    private Float TimeToFirstTokenP99;

    /**
    * <p>TPOT 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimePerOutputTokenAvg")
    @Expose
    private Float TimePerOutputTokenAvg;

    /**
    * <p>TPOT 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimePerOutputTokenMedian")
    @Expose
    private Float TimePerOutputTokenMedian;

    /**
    * <p>TPOT P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimePerOutputTokenP99")
    @Expose
    private Float TimePerOutputTokenP99;

    /**
    * <p>ITL 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InterTokenLatencyAvg")
    @Expose
    private Float InterTokenLatencyAvg;

    /**
    * <p>ITL 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InterTokenLatencyMedian")
    @Expose
    private Float InterTokenLatencyMedian;

    /**
    * <p>ITL P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InterTokenLatencyP99")
    @Expose
    private Float InterTokenLatencyP99;

    /**
    * <p>E2E 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndToEndAvg")
    @Expose
    private Float EndToEndAvg;

    /**
    * <p>E2E 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndToEndMedian")
    @Expose
    private Float EndToEndMedian;

    /**
    * <p>E2E P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndToEndP99")
    @Expose
    private Float EndToEndP99;

    /**
    * <p>Token 吞吐量 (output tokens/s)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenThroughput")
    @Expose
    private Float TokenThroughput;

    /**
    * <p>请求吞吐量 (requests/s)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestThroughput")
    @Expose
    private Float RequestThroughput;

    /**
    * <p>错误信息（失败时）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>appid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

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
    * <p>主账号uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>子账号uin</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
     * Get <p>benchmark任务id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>benchmark任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>benchmark任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>benchmark任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>关联的推理服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceId <p>关联的推理服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>关联的推理服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceId <p>关联的推理服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>关联的推理服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName <p>关联的推理服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>关联的推理服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName <p>关联的推理服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>任务状态（Running/Completed/Failed/Pending/Stopped）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>任务状态（Running/Completed/Failed/Pending/Stopped）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态（Running/Completed/Failed/Pending/Stopped）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>任务状态（Running/Completed/Failed/Pending/Stopped）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>输入 Token 数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputTokens <p>输入 Token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>输入 Token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputTokens <p>输入 Token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>输出 Token 数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputTokens <p>输出 Token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>输出 Token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputTokens <p>输出 Token 数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>每秒请求数 (QPS)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestsPerSecond <p>每秒请求数 (QPS)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRequestsPerSecond() {
        return this.RequestsPerSecond;
    }

    /**
     * Set <p>每秒请求数 (QPS)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestsPerSecond <p>每秒请求数 (QPS)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestsPerSecond(Float RequestsPerSecond) {
        this.RequestsPerSecond = RequestsPerSecond;
    }

    /**
     * Get <p>最大并发数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxConcurrency <p>最大并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set <p>最大并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxConcurrency <p>最大并发数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get <p>Prompts 总数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalPrompts <p>Prompts 总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalPrompts() {
        return this.TotalPrompts;
    }

    /**
     * Set <p>Prompts 总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalPrompts <p>Prompts 总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalPrompts(Long TotalPrompts) {
        this.TotalPrompts = TotalPrompts;
    }

    /**
     * Get <p>是否经 Ingress 网关（true=网关, false=集群内直连 SVC）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseGateway <p>是否经 Ingress 网关（true=网关, false=集群内直连 SVC）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUseGateway() {
        return this.UseGateway;
    }

    /**
     * Set <p>是否经 Ingress 网关（true=网关, false=集群内直连 SVC）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseGateway <p>是否经 Ingress 网关（true=网关, false=集群内直连 SVC）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseGateway(Boolean UseGateway) {
        this.UseGateway = UseGateway;
    }

    /**
     * Get <p>直连模式下使用的部署名称（仅 UseGateway=false 时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeploymentName <p>直连模式下使用的部署名称（仅 UseGateway=false 时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeploymentName() {
        return this.DeploymentName;
    }

    /**
     * Set <p>直连模式下使用的部署名称（仅 UseGateway=false 时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeploymentName <p>直连模式下使用的部署名称（仅 UseGateway=false 时有值）</p>
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get <p>TTFT 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeToFirstTokenAvg <p>TTFT 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTimeToFirstTokenAvg() {
        return this.TimeToFirstTokenAvg;
    }

    /**
     * Set <p>TTFT 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeToFirstTokenAvg <p>TTFT 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeToFirstTokenAvg(Float TimeToFirstTokenAvg) {
        this.TimeToFirstTokenAvg = TimeToFirstTokenAvg;
    }

    /**
     * Get <p>TTFT 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeToFirstTokenMedian <p>TTFT 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTimeToFirstTokenMedian() {
        return this.TimeToFirstTokenMedian;
    }

    /**
     * Set <p>TTFT 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeToFirstTokenMedian <p>TTFT 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeToFirstTokenMedian(Float TimeToFirstTokenMedian) {
        this.TimeToFirstTokenMedian = TimeToFirstTokenMedian;
    }

    /**
     * Get <p>TTFT P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeToFirstTokenP99 <p>TTFT P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTimeToFirstTokenP99() {
        return this.TimeToFirstTokenP99;
    }

    /**
     * Set <p>TTFT P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeToFirstTokenP99 <p>TTFT P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeToFirstTokenP99(Float TimeToFirstTokenP99) {
        this.TimeToFirstTokenP99 = TimeToFirstTokenP99;
    }

    /**
     * Get <p>TPOT 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimePerOutputTokenAvg <p>TPOT 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTimePerOutputTokenAvg() {
        return this.TimePerOutputTokenAvg;
    }

    /**
     * Set <p>TPOT 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimePerOutputTokenAvg <p>TPOT 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimePerOutputTokenAvg(Float TimePerOutputTokenAvg) {
        this.TimePerOutputTokenAvg = TimePerOutputTokenAvg;
    }

    /**
     * Get <p>TPOT 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimePerOutputTokenMedian <p>TPOT 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTimePerOutputTokenMedian() {
        return this.TimePerOutputTokenMedian;
    }

    /**
     * Set <p>TPOT 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimePerOutputTokenMedian <p>TPOT 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimePerOutputTokenMedian(Float TimePerOutputTokenMedian) {
        this.TimePerOutputTokenMedian = TimePerOutputTokenMedian;
    }

    /**
     * Get <p>TPOT P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimePerOutputTokenP99 <p>TPOT P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTimePerOutputTokenP99() {
        return this.TimePerOutputTokenP99;
    }

    /**
     * Set <p>TPOT P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimePerOutputTokenP99 <p>TPOT P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimePerOutputTokenP99(Float TimePerOutputTokenP99) {
        this.TimePerOutputTokenP99 = TimePerOutputTokenP99;
    }

    /**
     * Get <p>ITL 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InterTokenLatencyAvg <p>ITL 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInterTokenLatencyAvg() {
        return this.InterTokenLatencyAvg;
    }

    /**
     * Set <p>ITL 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InterTokenLatencyAvg <p>ITL 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterTokenLatencyAvg(Float InterTokenLatencyAvg) {
        this.InterTokenLatencyAvg = InterTokenLatencyAvg;
    }

    /**
     * Get <p>ITL 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InterTokenLatencyMedian <p>ITL 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInterTokenLatencyMedian() {
        return this.InterTokenLatencyMedian;
    }

    /**
     * Set <p>ITL 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InterTokenLatencyMedian <p>ITL 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterTokenLatencyMedian(Float InterTokenLatencyMedian) {
        this.InterTokenLatencyMedian = InterTokenLatencyMedian;
    }

    /**
     * Get <p>ITL P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InterTokenLatencyP99 <p>ITL P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInterTokenLatencyP99() {
        return this.InterTokenLatencyP99;
    }

    /**
     * Set <p>ITL P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InterTokenLatencyP99 <p>ITL P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterTokenLatencyP99(Float InterTokenLatencyP99) {
        this.InterTokenLatencyP99 = InterTokenLatencyP99;
    }

    /**
     * Get <p>E2E 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndToEndAvg <p>E2E 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEndToEndAvg() {
        return this.EndToEndAvg;
    }

    /**
     * Set <p>E2E 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndToEndAvg <p>E2E 平均值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndToEndAvg(Float EndToEndAvg) {
        this.EndToEndAvg = EndToEndAvg;
    }

    /**
     * Get <p>E2E 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndToEndMedian <p>E2E 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEndToEndMedian() {
        return this.EndToEndMedian;
    }

    /**
     * Set <p>E2E 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndToEndMedian <p>E2E 中间值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndToEndMedian(Float EndToEndMedian) {
        this.EndToEndMedian = EndToEndMedian;
    }

    /**
     * Get <p>E2E P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndToEndP99 <p>E2E P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEndToEndP99() {
        return this.EndToEndP99;
    }

    /**
     * Set <p>E2E P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndToEndP99 <p>E2E P99 值(ms)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndToEndP99(Float EndToEndP99) {
        this.EndToEndP99 = EndToEndP99;
    }

    /**
     * Get <p>Token 吞吐量 (output tokens/s)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenThroughput <p>Token 吞吐量 (output tokens/s)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTokenThroughput() {
        return this.TokenThroughput;
    }

    /**
     * Set <p>Token 吞吐量 (output tokens/s)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenThroughput <p>Token 吞吐量 (output tokens/s)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenThroughput(Float TokenThroughput) {
        this.TokenThroughput = TokenThroughput;
    }

    /**
     * Get <p>请求吞吐量 (requests/s)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestThroughput <p>请求吞吐量 (requests/s)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRequestThroughput() {
        return this.RequestThroughput;
    }

    /**
     * Set <p>请求吞吐量 (requests/s)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestThroughput <p>请求吞吐量 (requests/s)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestThroughput(Float RequestThroughput) {
        this.RequestThroughput = RequestThroughput;
    }

    /**
     * Get <p>错误信息（失败时）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage <p>错误信息（失败时）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>错误信息（失败时）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage <p>错误信息（失败时）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>appid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>appid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>appid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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

    public BenchmarkTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BenchmarkTaskInfo(BenchmarkTaskInfo source) {
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
        if (source.TimeToFirstTokenAvg != null) {
            this.TimeToFirstTokenAvg = new Float(source.TimeToFirstTokenAvg);
        }
        if (source.TimeToFirstTokenMedian != null) {
            this.TimeToFirstTokenMedian = new Float(source.TimeToFirstTokenMedian);
        }
        if (source.TimeToFirstTokenP99 != null) {
            this.TimeToFirstTokenP99 = new Float(source.TimeToFirstTokenP99);
        }
        if (source.TimePerOutputTokenAvg != null) {
            this.TimePerOutputTokenAvg = new Float(source.TimePerOutputTokenAvg);
        }
        if (source.TimePerOutputTokenMedian != null) {
            this.TimePerOutputTokenMedian = new Float(source.TimePerOutputTokenMedian);
        }
        if (source.TimePerOutputTokenP99 != null) {
            this.TimePerOutputTokenP99 = new Float(source.TimePerOutputTokenP99);
        }
        if (source.InterTokenLatencyAvg != null) {
            this.InterTokenLatencyAvg = new Float(source.InterTokenLatencyAvg);
        }
        if (source.InterTokenLatencyMedian != null) {
            this.InterTokenLatencyMedian = new Float(source.InterTokenLatencyMedian);
        }
        if (source.InterTokenLatencyP99 != null) {
            this.InterTokenLatencyP99 = new Float(source.InterTokenLatencyP99);
        }
        if (source.EndToEndAvg != null) {
            this.EndToEndAvg = new Float(source.EndToEndAvg);
        }
        if (source.EndToEndMedian != null) {
            this.EndToEndMedian = new Float(source.EndToEndMedian);
        }
        if (source.EndToEndP99 != null) {
            this.EndToEndP99 = new Float(source.EndToEndP99);
        }
        if (source.TokenThroughput != null) {
            this.TokenThroughput = new Float(source.TokenThroughput);
        }
        if (source.RequestThroughput != null) {
            this.RequestThroughput = new Float(source.RequestThroughput);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
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
        this.setParamSimple(map, prefix + "TimeToFirstTokenAvg", this.TimeToFirstTokenAvg);
        this.setParamSimple(map, prefix + "TimeToFirstTokenMedian", this.TimeToFirstTokenMedian);
        this.setParamSimple(map, prefix + "TimeToFirstTokenP99", this.TimeToFirstTokenP99);
        this.setParamSimple(map, prefix + "TimePerOutputTokenAvg", this.TimePerOutputTokenAvg);
        this.setParamSimple(map, prefix + "TimePerOutputTokenMedian", this.TimePerOutputTokenMedian);
        this.setParamSimple(map, prefix + "TimePerOutputTokenP99", this.TimePerOutputTokenP99);
        this.setParamSimple(map, prefix + "InterTokenLatencyAvg", this.InterTokenLatencyAvg);
        this.setParamSimple(map, prefix + "InterTokenLatencyMedian", this.InterTokenLatencyMedian);
        this.setParamSimple(map, prefix + "InterTokenLatencyP99", this.InterTokenLatencyP99);
        this.setParamSimple(map, prefix + "EndToEndAvg", this.EndToEndAvg);
        this.setParamSimple(map, prefix + "EndToEndMedian", this.EndToEndMedian);
        this.setParamSimple(map, prefix + "EndToEndP99", this.EndToEndP99);
        this.setParamSimple(map, prefix + "TokenThroughput", this.TokenThroughput);
        this.setParamSimple(map, prefix + "RequestThroughput", this.RequestThroughput);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);

    }
}

