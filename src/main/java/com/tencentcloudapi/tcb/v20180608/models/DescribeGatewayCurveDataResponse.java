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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayCurveDataResponse extends AbstractModel{

    /**
    * 监控类型
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 监控起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 监控结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 监控数据间隔
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 监控值
    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

    /**
    * 监控时间
    */
    @SerializedName("Time")
    @Expose
    private Long [] Time;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 监控类型 
     * @return MetricName 监控类型
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 监控类型
     * @param MetricName 监控类型
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 监控起始时间 
     * @return StartTime 监控起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 监控起始时间
     * @param StartTime 监控起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 监控结束时间 
     * @return EndTime 监控结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 监控结束时间
     * @param EndTime 监控结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 监控数据间隔 
     * @return Period 监控数据间隔
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 监控数据间隔
     * @param Period 监控数据间隔
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 监控值 
     * @return Values 监控值
     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set 监控值
     * @param Values 监控值
     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    /**
     * Get 监控时间 
     * @return Time 监控时间
     */
    public Long [] getTime() {
        return this.Time;
    }

    /**
     * Set 监控时间
     * @param Time 监控时间
     */
    public void setTime(Long [] Time) {
        this.Time = Time;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeGatewayCurveDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayCurveDataResponse(DescribeGatewayCurveDataResponse source) {
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
        if (source.Values != null) {
            this.Values = new Float[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Float(source.Values[i]);
            }
        }
        if (source.Time != null) {
            this.Time = new Long[source.Time.length];
            for (int i = 0; i < source.Time.length; i++) {
                this.Time[i] = new Long(source.Time[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamArraySimple(map, prefix + "Time.", this.Time);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

