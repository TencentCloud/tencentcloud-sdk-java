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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvocationMetricScatterPlot extends AbstractModel{

    /**
    * 时间轴截止时间，GMT，精确到毫秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 时间粒度
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 时间轴开始时间，GMT，精确到毫秒
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 多值数据点集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataPoints")
    @Expose
    private MultiValueDataPoints [] DataPoints;

    /**
     * Get 时间轴截止时间，GMT，精确到毫秒 
     * @return EndTime 时间轴截止时间，GMT，精确到毫秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 时间轴截止时间，GMT，精确到毫秒
     * @param EndTime 时间轴截止时间，GMT，精确到毫秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 时间粒度 
     * @return StartTime 时间粒度
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 时间粒度
     * @param StartTime 时间粒度
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 时间轴开始时间，GMT，精确到毫秒 
     * @return Period 时间轴开始时间，GMT，精确到毫秒
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 时间轴开始时间，GMT，精确到毫秒
     * @param Period 时间轴开始时间，GMT，精确到毫秒
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 多值数据点集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataPoints 多值数据点集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiValueDataPoints [] getDataPoints() {
        return this.DataPoints;
    }

    /**
     * Set 多值数据点集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataPoints 多值数据点集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataPoints(MultiValueDataPoints [] DataPoints) {
        this.DataPoints = DataPoints;
    }

    public InvocationMetricScatterPlot() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvocationMetricScatterPlot(InvocationMetricScatterPlot source) {
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.DataPoints != null) {
            this.DataPoints = new MultiValueDataPoints[source.DataPoints.length];
            for (int i = 0; i < source.DataPoints.length; i++) {
                this.DataPoints[i] = new MultiValueDataPoints(source.DataPoints[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArrayObj(map, prefix + "DataPoints.", this.DataPoints);

    }
}

