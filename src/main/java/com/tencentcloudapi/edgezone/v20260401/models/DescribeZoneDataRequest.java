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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZoneDataRequest extends AbstractModel {

    /**
    * 区id
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 指标名(inbw:入带宽，outbw:出带宽)
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 开始时间（UTC时间:0时区）
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间（UTC时间:0时区）,最多查询2天时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 区id 
     * @return Zone 区id
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 区id
     * @param Zone 区id
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 指标名(inbw:入带宽，outbw:出带宽) 
     * @return MetricName 指标名(inbw:入带宽，outbw:出带宽)
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名(inbw:入带宽，outbw:出带宽)
     * @param MetricName 指标名(inbw:入带宽，outbw:出带宽)
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 开始时间（UTC时间:0时区） 
     * @return StartTime 开始时间（UTC时间:0时区）
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间（UTC时间:0时区）
     * @param StartTime 开始时间（UTC时间:0时区）
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间（UTC时间:0时区）,最多查询2天时间 
     * @return EndTime 结束时间（UTC时间:0时区）,最多查询2天时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（UTC时间:0时区）,最多查询2天时间
     * @param EndTime 结束时间（UTC时间:0时区）,最多查询2天时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeZoneDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZoneDataRequest(DescribeZoneDataRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

