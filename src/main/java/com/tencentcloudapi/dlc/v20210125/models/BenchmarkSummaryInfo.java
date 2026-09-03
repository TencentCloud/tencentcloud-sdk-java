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

public class BenchmarkSummaryInfo extends AbstractModel {

    /**
    * <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParameterSize")
    @Expose
    private String ParameterSize;

    /**
    * <p>评测所用的服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>评测任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>该模型的评测任务总数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BenchmarkCount")
    @Expose
    private Long BenchmarkCount;

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
    * <p>评测完成时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelName <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelName <p>模型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Provider <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Provider <p>模型提供方</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelType <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelType <p>模型类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParameterSize <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameterSize() {
        return this.ParameterSize;
    }

    /**
     * Set <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParameterSize <p>参数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameterSize(String ParameterSize) {
        this.ParameterSize = ParameterSize;
    }

    /**
     * Get <p>评测所用的服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName <p>评测所用的服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>评测所用的服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName <p>评测所用的服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>评测任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName <p>评测任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>评测任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName <p>评测任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>该模型的评测任务总数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BenchmarkCount <p>该模型的评测任务总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBenchmarkCount() {
        return this.BenchmarkCount;
    }

    /**
     * Set <p>该模型的评测任务总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BenchmarkCount <p>该模型的评测任务总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBenchmarkCount(Long BenchmarkCount) {
        this.BenchmarkCount = BenchmarkCount;
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
     * Get <p>评测完成时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>评测完成时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>评测完成时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>评测完成时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public BenchmarkSummaryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BenchmarkSummaryInfo(BenchmarkSummaryInfo source) {
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.ParameterSize != null) {
            this.ParameterSize = new String(source.ParameterSize);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.BenchmarkCount != null) {
            this.BenchmarkCount = new Long(source.BenchmarkCount);
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
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "ParameterSize", this.ParameterSize);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "BenchmarkCount", this.BenchmarkCount);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "RequestsPerSecond", this.RequestsPerSecond);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

