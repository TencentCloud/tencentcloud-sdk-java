/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.eis.v20210601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRuntimeResourceMonitorMetricMCRequest extends AbstractModel{

    /**
    * 运行时id
    */
    @SerializedName("RuntimeId")
    @Expose
    private Long RuntimeId;

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 指标类型：0:CPU, 1:MemUsageBytes, 2:K8sWorkloadNetworkReceiveBytesBw, 3:K8sWorkloadNetworkTransmitBytesBw
    */
    @SerializedName("MetricType")
    @Expose
    private Long MetricType;

    /**
    * 是否返回百分比数值，仅支持CPU，Memory
    */
    @SerializedName("RateType")
    @Expose
    private Boolean RateType;

    /**
    * 采样粒度：60(s), 300(s), 3600(s), 86400(s)
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
     * Get 运行时id 
     * @return RuntimeId 运行时id
     */
    public Long getRuntimeId() {
        return this.RuntimeId;
    }

    /**
     * Set 运行时id
     * @param RuntimeId 运行时id
     */
    public void setRuntimeId(Long RuntimeId) {
        this.RuntimeId = RuntimeId;
    }

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指标类型：0:CPU, 1:MemUsageBytes, 2:K8sWorkloadNetworkReceiveBytesBw, 3:K8sWorkloadNetworkTransmitBytesBw 
     * @return MetricType 指标类型：0:CPU, 1:MemUsageBytes, 2:K8sWorkloadNetworkReceiveBytesBw, 3:K8sWorkloadNetworkTransmitBytesBw
     */
    public Long getMetricType() {
        return this.MetricType;
    }

    /**
     * Set 指标类型：0:CPU, 1:MemUsageBytes, 2:K8sWorkloadNetworkReceiveBytesBw, 3:K8sWorkloadNetworkTransmitBytesBw
     * @param MetricType 指标类型：0:CPU, 1:MemUsageBytes, 2:K8sWorkloadNetworkReceiveBytesBw, 3:K8sWorkloadNetworkTransmitBytesBw
     */
    public void setMetricType(Long MetricType) {
        this.MetricType = MetricType;
    }

    /**
     * Get 是否返回百分比数值，仅支持CPU，Memory 
     * @return RateType 是否返回百分比数值，仅支持CPU，Memory
     */
    public Boolean getRateType() {
        return this.RateType;
    }

    /**
     * Set 是否返回百分比数值，仅支持CPU，Memory
     * @param RateType 是否返回百分比数值，仅支持CPU，Memory
     */
    public void setRateType(Boolean RateType) {
        this.RateType = RateType;
    }

    /**
     * Get 采样粒度：60(s), 300(s), 3600(s), 86400(s) 
     * @return Interval 采样粒度：60(s), 300(s), 3600(s), 86400(s)
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 采样粒度：60(s), 300(s), 3600(s), 86400(s)
     * @param Interval 采样粒度：60(s), 300(s), 3600(s), 86400(s)
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    public GetRuntimeResourceMonitorMetricMCRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRuntimeResourceMonitorMetricMCRequest(GetRuntimeResourceMonitorMetricMCRequest source) {
        if (source.RuntimeId != null) {
            this.RuntimeId = new Long(source.RuntimeId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.MetricType != null) {
            this.MetricType = new Long(source.MetricType);
        }
        if (source.RateType != null) {
            this.RateType = new Boolean(source.RateType);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuntimeId", this.RuntimeId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricType", this.MetricType);
        this.setParamSimple(map, prefix + "RateType", this.RateType);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

