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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQPublicAccessMonitorDataRequest extends AbstractModel {

    /**
    * 专享集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指标名称，仅支持单指标拉取。目前仅支持：ClientIntraffic; ClientOuttraffic
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，默认为当前时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 监控统计周期，如60。默认为取值为300，单位为s。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get 专享集群ID 
     * @return InstanceId 专享集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 专享集群ID
     * @param InstanceId 专享集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 指标名称，仅支持单指标拉取。目前仅支持：ClientIntraffic; ClientOuttraffic 
     * @return MetricName 指标名称，仅支持单指标拉取。目前仅支持：ClientIntraffic; ClientOuttraffic
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称，仅支持单指标拉取。目前仅支持：ClientIntraffic; ClientOuttraffic
     * @param MetricName 指标名称，仅支持单指标拉取。目前仅支持：ClientIntraffic; ClientOuttraffic
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，默认为当前时间 
     * @return EndTime 结束时间，默认为当前时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，默认为当前时间
     * @param EndTime 结束时间，默认为当前时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 监控统计周期，如60。默认为取值为300，单位为s。 
     * @return Period 监控统计周期，如60。默认为取值为300，单位为s。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 监控统计周期，如60。默认为取值为300，单位为s。
     * @param Period 监控统计周期，如60。默认为取值为300，单位为s。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public DescribeRocketMQPublicAccessMonitorDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQPublicAccessMonitorDataRequest(DescribeRocketMQPublicAccessMonitorDataRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

