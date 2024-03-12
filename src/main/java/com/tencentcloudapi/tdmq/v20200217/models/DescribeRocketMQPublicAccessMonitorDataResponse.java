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

public class DescribeRocketMQPublicAccessMonitorDataResponse extends AbstractModel {

    /**
    * 指标名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 监控统计周期，如60。默认为取值为300，单位为s。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 起始时间，如2018-09-22T19:51:23+08:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，如2018-09-22T20:51:23+08:00，默认为当前时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 数据点数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataPoints")
    @Expose
    private RocketMQDataPoint [] DataPoints;

    /**
    * 返回信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 指标名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricName 指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricName 指标名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 监控统计周期，如60。默认为取值为300，单位为s。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period 监控统计周期，如60。默认为取值为300，单位为s。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 监控统计周期，如60。默认为取值为300，单位为s。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 监控统计周期，如60。默认为取值为300，单位为s。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 起始时间，如2018-09-22T19:51:23+08:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 起始时间，如2018-09-22T19:51:23+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，如2018-09-22T19:51:23+08:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 起始时间，如2018-09-22T19:51:23+08:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，如2018-09-22T20:51:23+08:00，默认为当前时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间，如2018-09-22T20:51:23+08:00，默认为当前时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，如2018-09-22T20:51:23+08:00，默认为当前时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间，如2018-09-22T20:51:23+08:00，默认为当前时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 数据点数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataPoints 数据点数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RocketMQDataPoint [] getDataPoints() {
        return this.DataPoints;
    }

    /**
     * Set 数据点数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataPoints 数据点数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataPoints(RocketMQDataPoint [] DataPoints) {
        this.DataPoints = DataPoints;
    }

    /**
     * Get 返回信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msg 返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 返回信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msg 返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
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

    public DescribeRocketMQPublicAccessMonitorDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQPublicAccessMonitorDataResponse(DescribeRocketMQPublicAccessMonitorDataResponse source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DataPoints != null) {
            this.DataPoints = new RocketMQDataPoint[source.DataPoints.length];
            for (int i = 0; i < source.DataPoints.length; i++) {
                this.DataPoints[i] = new RocketMQDataPoint(source.DataPoints[i]);
            }
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
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
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "DataPoints.", this.DataPoints);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

