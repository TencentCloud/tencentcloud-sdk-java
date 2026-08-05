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

public class MetricsData extends AbstractModel {

    /**
    * <p>每秒请求数（QPS）</p>
    */
    @SerializedName("RequestsPerSecond")
    @Expose
    private Float RequestsPerSecond;

    /**
    * <p>错误率（0~1）</p>
    */
    @SerializedName("ErrorRate")
    @Expose
    private Float ErrorRate;

    /**
    * <p>P95 延迟（毫秒）</p>
    */
    @SerializedName("P95LatencyMs")
    @Expose
    private Float P95LatencyMs;

    /**
    * <p>P99 延迟（毫秒）</p>
    */
    @SerializedName("P99LatencyMs")
    @Expose
    private Float P99LatencyMs;

    /**
    * <p>队列深度（排队中的请求数）</p>
    */
    @SerializedName("QueueDepth")
    @Expose
    private Float QueueDepth;

    /**
    * <p>TTFT P99 延迟（毫秒，仅 vLLM）</p>
    */
    @SerializedName("TimeToFirstTokenP99Ms")
    @Expose
    private Float TimeToFirstTokenP99Ms;

    /**
    * <p>TPOT P99 延迟（毫秒，仅 vLLM）</p>
    */
    @SerializedName("TimePerOutputTokenP99Ms")
    @Expose
    private Float TimePerOutputTokenP99Ms;

    /**
    * <p>Token 吞吐量（tokens/s，仅 vLLM）</p>
    */
    @SerializedName("TokenThroughput")
    @Expose
    private Float TokenThroughput;

    /**
    * <p>GPU 利用率（0~100，百分比）</p>
    */
    @SerializedName("GpuUtilization")
    @Expose
    private Float GpuUtilization;

    /**
    * <p>GPU 显存已用（MB）</p>
    */
    @SerializedName("GpuMemoryUsedMB")
    @Expose
    private Float GpuMemoryUsedMB;

    /**
    * <p>GPU 显存总量（MB）</p>
    */
    @SerializedName("GpuMemoryTotalMB")
    @Expose
    private Float GpuMemoryTotalMB;

    /**
    * <p>CPU 利用率（0~100，百分比）</p>
    */
    @SerializedName("CpuUtilization")
    @Expose
    private Float CpuUtilization;

    /**
    * <p>内存已用（字节）</p>
    */
    @SerializedName("MemoryUsedBytes")
    @Expose
    private Float MemoryUsedBytes;

    /**
    * <p>内存总量（字节）</p>
    */
    @SerializedName("MemoryTotalBytes")
    @Expose
    private Float MemoryTotalBytes;

    /**
    * <p>网络接收速度（MB/s）</p>
    */
    @SerializedName("NetworkReceiveMBPerSecond")
    @Expose
    private Float NetworkReceiveMBPerSecond;

    /**
    * <p>网络发送速度（MB/s）</p>
    */
    @SerializedName("NetworkSendMBPerSecond")
    @Expose
    private Float NetworkSendMBPerSecond;

    /**
     * Get <p>每秒请求数（QPS）</p> 
     * @return RequestsPerSecond <p>每秒请求数（QPS）</p>
     */
    public Float getRequestsPerSecond() {
        return this.RequestsPerSecond;
    }

    /**
     * Set <p>每秒请求数（QPS）</p>
     * @param RequestsPerSecond <p>每秒请求数（QPS）</p>
     */
    public void setRequestsPerSecond(Float RequestsPerSecond) {
        this.RequestsPerSecond = RequestsPerSecond;
    }

    /**
     * Get <p>错误率（0~1）</p> 
     * @return ErrorRate <p>错误率（0~1）</p>
     */
    public Float getErrorRate() {
        return this.ErrorRate;
    }

    /**
     * Set <p>错误率（0~1）</p>
     * @param ErrorRate <p>错误率（0~1）</p>
     */
    public void setErrorRate(Float ErrorRate) {
        this.ErrorRate = ErrorRate;
    }

    /**
     * Get <p>P95 延迟（毫秒）</p> 
     * @return P95LatencyMs <p>P95 延迟（毫秒）</p>
     */
    public Float getP95LatencyMs() {
        return this.P95LatencyMs;
    }

    /**
     * Set <p>P95 延迟（毫秒）</p>
     * @param P95LatencyMs <p>P95 延迟（毫秒）</p>
     */
    public void setP95LatencyMs(Float P95LatencyMs) {
        this.P95LatencyMs = P95LatencyMs;
    }

    /**
     * Get <p>P99 延迟（毫秒）</p> 
     * @return P99LatencyMs <p>P99 延迟（毫秒）</p>
     */
    public Float getP99LatencyMs() {
        return this.P99LatencyMs;
    }

    /**
     * Set <p>P99 延迟（毫秒）</p>
     * @param P99LatencyMs <p>P99 延迟（毫秒）</p>
     */
    public void setP99LatencyMs(Float P99LatencyMs) {
        this.P99LatencyMs = P99LatencyMs;
    }

    /**
     * Get <p>队列深度（排队中的请求数）</p> 
     * @return QueueDepth <p>队列深度（排队中的请求数）</p>
     */
    public Float getQueueDepth() {
        return this.QueueDepth;
    }

    /**
     * Set <p>队列深度（排队中的请求数）</p>
     * @param QueueDepth <p>队列深度（排队中的请求数）</p>
     */
    public void setQueueDepth(Float QueueDepth) {
        this.QueueDepth = QueueDepth;
    }

    /**
     * Get <p>TTFT P99 延迟（毫秒，仅 vLLM）</p> 
     * @return TimeToFirstTokenP99Ms <p>TTFT P99 延迟（毫秒，仅 vLLM）</p>
     */
    public Float getTimeToFirstTokenP99Ms() {
        return this.TimeToFirstTokenP99Ms;
    }

    /**
     * Set <p>TTFT P99 延迟（毫秒，仅 vLLM）</p>
     * @param TimeToFirstTokenP99Ms <p>TTFT P99 延迟（毫秒，仅 vLLM）</p>
     */
    public void setTimeToFirstTokenP99Ms(Float TimeToFirstTokenP99Ms) {
        this.TimeToFirstTokenP99Ms = TimeToFirstTokenP99Ms;
    }

    /**
     * Get <p>TPOT P99 延迟（毫秒，仅 vLLM）</p> 
     * @return TimePerOutputTokenP99Ms <p>TPOT P99 延迟（毫秒，仅 vLLM）</p>
     */
    public Float getTimePerOutputTokenP99Ms() {
        return this.TimePerOutputTokenP99Ms;
    }

    /**
     * Set <p>TPOT P99 延迟（毫秒，仅 vLLM）</p>
     * @param TimePerOutputTokenP99Ms <p>TPOT P99 延迟（毫秒，仅 vLLM）</p>
     */
    public void setTimePerOutputTokenP99Ms(Float TimePerOutputTokenP99Ms) {
        this.TimePerOutputTokenP99Ms = TimePerOutputTokenP99Ms;
    }

    /**
     * Get <p>Token 吞吐量（tokens/s，仅 vLLM）</p> 
     * @return TokenThroughput <p>Token 吞吐量（tokens/s，仅 vLLM）</p>
     */
    public Float getTokenThroughput() {
        return this.TokenThroughput;
    }

    /**
     * Set <p>Token 吞吐量（tokens/s，仅 vLLM）</p>
     * @param TokenThroughput <p>Token 吞吐量（tokens/s，仅 vLLM）</p>
     */
    public void setTokenThroughput(Float TokenThroughput) {
        this.TokenThroughput = TokenThroughput;
    }

    /**
     * Get <p>GPU 利用率（0~100，百分比）</p> 
     * @return GpuUtilization <p>GPU 利用率（0~100，百分比）</p>
     */
    public Float getGpuUtilization() {
        return this.GpuUtilization;
    }

    /**
     * Set <p>GPU 利用率（0~100，百分比）</p>
     * @param GpuUtilization <p>GPU 利用率（0~100，百分比）</p>
     */
    public void setGpuUtilization(Float GpuUtilization) {
        this.GpuUtilization = GpuUtilization;
    }

    /**
     * Get <p>GPU 显存已用（MB）</p> 
     * @return GpuMemoryUsedMB <p>GPU 显存已用（MB）</p>
     */
    public Float getGpuMemoryUsedMB() {
        return this.GpuMemoryUsedMB;
    }

    /**
     * Set <p>GPU 显存已用（MB）</p>
     * @param GpuMemoryUsedMB <p>GPU 显存已用（MB）</p>
     */
    public void setGpuMemoryUsedMB(Float GpuMemoryUsedMB) {
        this.GpuMemoryUsedMB = GpuMemoryUsedMB;
    }

    /**
     * Get <p>GPU 显存总量（MB）</p> 
     * @return GpuMemoryTotalMB <p>GPU 显存总量（MB）</p>
     */
    public Float getGpuMemoryTotalMB() {
        return this.GpuMemoryTotalMB;
    }

    /**
     * Set <p>GPU 显存总量（MB）</p>
     * @param GpuMemoryTotalMB <p>GPU 显存总量（MB）</p>
     */
    public void setGpuMemoryTotalMB(Float GpuMemoryTotalMB) {
        this.GpuMemoryTotalMB = GpuMemoryTotalMB;
    }

    /**
     * Get <p>CPU 利用率（0~100，百分比）</p> 
     * @return CpuUtilization <p>CPU 利用率（0~100，百分比）</p>
     */
    public Float getCpuUtilization() {
        return this.CpuUtilization;
    }

    /**
     * Set <p>CPU 利用率（0~100，百分比）</p>
     * @param CpuUtilization <p>CPU 利用率（0~100，百分比）</p>
     */
    public void setCpuUtilization(Float CpuUtilization) {
        this.CpuUtilization = CpuUtilization;
    }

    /**
     * Get <p>内存已用（字节）</p> 
     * @return MemoryUsedBytes <p>内存已用（字节）</p>
     */
    public Float getMemoryUsedBytes() {
        return this.MemoryUsedBytes;
    }

    /**
     * Set <p>内存已用（字节）</p>
     * @param MemoryUsedBytes <p>内存已用（字节）</p>
     */
    public void setMemoryUsedBytes(Float MemoryUsedBytes) {
        this.MemoryUsedBytes = MemoryUsedBytes;
    }

    /**
     * Get <p>内存总量（字节）</p> 
     * @return MemoryTotalBytes <p>内存总量（字节）</p>
     */
    public Float getMemoryTotalBytes() {
        return this.MemoryTotalBytes;
    }

    /**
     * Set <p>内存总量（字节）</p>
     * @param MemoryTotalBytes <p>内存总量（字节）</p>
     */
    public void setMemoryTotalBytes(Float MemoryTotalBytes) {
        this.MemoryTotalBytes = MemoryTotalBytes;
    }

    /**
     * Get <p>网络接收速度（MB/s）</p> 
     * @return NetworkReceiveMBPerSecond <p>网络接收速度（MB/s）</p>
     */
    public Float getNetworkReceiveMBPerSecond() {
        return this.NetworkReceiveMBPerSecond;
    }

    /**
     * Set <p>网络接收速度（MB/s）</p>
     * @param NetworkReceiveMBPerSecond <p>网络接收速度（MB/s）</p>
     */
    public void setNetworkReceiveMBPerSecond(Float NetworkReceiveMBPerSecond) {
        this.NetworkReceiveMBPerSecond = NetworkReceiveMBPerSecond;
    }

    /**
     * Get <p>网络发送速度（MB/s）</p> 
     * @return NetworkSendMBPerSecond <p>网络发送速度（MB/s）</p>
     */
    public Float getNetworkSendMBPerSecond() {
        return this.NetworkSendMBPerSecond;
    }

    /**
     * Set <p>网络发送速度（MB/s）</p>
     * @param NetworkSendMBPerSecond <p>网络发送速度（MB/s）</p>
     */
    public void setNetworkSendMBPerSecond(Float NetworkSendMBPerSecond) {
        this.NetworkSendMBPerSecond = NetworkSendMBPerSecond;
    }

    public MetricsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricsData(MetricsData source) {
        if (source.RequestsPerSecond != null) {
            this.RequestsPerSecond = new Float(source.RequestsPerSecond);
        }
        if (source.ErrorRate != null) {
            this.ErrorRate = new Float(source.ErrorRate);
        }
        if (source.P95LatencyMs != null) {
            this.P95LatencyMs = new Float(source.P95LatencyMs);
        }
        if (source.P99LatencyMs != null) {
            this.P99LatencyMs = new Float(source.P99LatencyMs);
        }
        if (source.QueueDepth != null) {
            this.QueueDepth = new Float(source.QueueDepth);
        }
        if (source.TimeToFirstTokenP99Ms != null) {
            this.TimeToFirstTokenP99Ms = new Float(source.TimeToFirstTokenP99Ms);
        }
        if (source.TimePerOutputTokenP99Ms != null) {
            this.TimePerOutputTokenP99Ms = new Float(source.TimePerOutputTokenP99Ms);
        }
        if (source.TokenThroughput != null) {
            this.TokenThroughput = new Float(source.TokenThroughput);
        }
        if (source.GpuUtilization != null) {
            this.GpuUtilization = new Float(source.GpuUtilization);
        }
        if (source.GpuMemoryUsedMB != null) {
            this.GpuMemoryUsedMB = new Float(source.GpuMemoryUsedMB);
        }
        if (source.GpuMemoryTotalMB != null) {
            this.GpuMemoryTotalMB = new Float(source.GpuMemoryTotalMB);
        }
        if (source.CpuUtilization != null) {
            this.CpuUtilization = new Float(source.CpuUtilization);
        }
        if (source.MemoryUsedBytes != null) {
            this.MemoryUsedBytes = new Float(source.MemoryUsedBytes);
        }
        if (source.MemoryTotalBytes != null) {
            this.MemoryTotalBytes = new Float(source.MemoryTotalBytes);
        }
        if (source.NetworkReceiveMBPerSecond != null) {
            this.NetworkReceiveMBPerSecond = new Float(source.NetworkReceiveMBPerSecond);
        }
        if (source.NetworkSendMBPerSecond != null) {
            this.NetworkSendMBPerSecond = new Float(source.NetworkSendMBPerSecond);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestsPerSecond", this.RequestsPerSecond);
        this.setParamSimple(map, prefix + "ErrorRate", this.ErrorRate);
        this.setParamSimple(map, prefix + "P95LatencyMs", this.P95LatencyMs);
        this.setParamSimple(map, prefix + "P99LatencyMs", this.P99LatencyMs);
        this.setParamSimple(map, prefix + "QueueDepth", this.QueueDepth);
        this.setParamSimple(map, prefix + "TimeToFirstTokenP99Ms", this.TimeToFirstTokenP99Ms);
        this.setParamSimple(map, prefix + "TimePerOutputTokenP99Ms", this.TimePerOutputTokenP99Ms);
        this.setParamSimple(map, prefix + "TokenThroughput", this.TokenThroughput);
        this.setParamSimple(map, prefix + "GpuUtilization", this.GpuUtilization);
        this.setParamSimple(map, prefix + "GpuMemoryUsedMB", this.GpuMemoryUsedMB);
        this.setParamSimple(map, prefix + "GpuMemoryTotalMB", this.GpuMemoryTotalMB);
        this.setParamSimple(map, prefix + "CpuUtilization", this.CpuUtilization);
        this.setParamSimple(map, prefix + "MemoryUsedBytes", this.MemoryUsedBytes);
        this.setParamSimple(map, prefix + "MemoryTotalBytes", this.MemoryTotalBytes);
        this.setParamSimple(map, prefix + "NetworkReceiveMBPerSecond", this.NetworkReceiveMBPerSecond);
        this.setParamSimple(map, prefix + "NetworkSendMBPerSecond", this.NetworkSendMBPerSecond);

    }
}

