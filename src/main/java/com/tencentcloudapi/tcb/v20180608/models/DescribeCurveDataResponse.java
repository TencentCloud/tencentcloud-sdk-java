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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCurveDataResponse extends AbstractModel {

    /**
    * <p>开始时间, 会根据数据的统计周期进行取整</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间, 会根据数据的统计周期进行取整</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>指标名</p>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>统计周期(单位秒), 当时间区间为1天内, 统计周期为5分钟; 当时间区间选择为1天以上, 15天以下, 统计周期为1小时; 当时间区间选择为15天以上, 180天以下, 统计周期为1天</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到</p>
    */
    @SerializedName("Values")
    @Expose
    private Long [] Values;

    /**
    * <p>各数据点的时间戳数组（Unix 时间戳，秒级），与  ⁠Values⁠  一一对应</p>
    */
    @SerializedName("Time")
    @Expose
    private Long [] Time;

    /**
    * <p>有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到</p>
    */
    @SerializedName("NewValues")
    @Expose
    private Float [] NewValues;

    /**
    * <p>聚合方式， ⁠&quot;last&quot;⁠  表示取时间段内最后一个值，“max”表示取时间段内最大值，“avg”表示取时间段内的平均值</p>
    */
    @SerializedName("Statistics")
    @Expose
    private String Statistics;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>开始时间, 会根据数据的统计周期进行取整</p> 
     * @return StartTime <p>开始时间, 会根据数据的统计周期进行取整</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间, 会根据数据的统计周期进行取整</p>
     * @param StartTime <p>开始时间, 会根据数据的统计周期进行取整</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间, 会根据数据的统计周期进行取整</p> 
     * @return EndTime <p>结束时间, 会根据数据的统计周期进行取整</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间, 会根据数据的统计周期进行取整</p>
     * @param EndTime <p>结束时间, 会根据数据的统计周期进行取整</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>指标名</p> 
     * @return MetricName <p>指标名</p>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>指标名</p>
     * @param MetricName <p>指标名</p>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>统计周期(单位秒), 当时间区间为1天内, 统计周期为5分钟; 当时间区间选择为1天以上, 15天以下, 统计周期为1小时; 当时间区间选择为15天以上, 180天以下, 统计周期为1天</p> 
     * @return Period <p>统计周期(单位秒), 当时间区间为1天内, 统计周期为5分钟; 当时间区间选择为1天以上, 15天以下, 统计周期为1小时; 当时间区间选择为15天以上, 180天以下, 统计周期为1天</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>统计周期(单位秒), 当时间区间为1天内, 统计周期为5分钟; 当时间区间选择为1天以上, 15天以下, 统计周期为1小时; 当时间区间选择为15天以上, 180天以下, 统计周期为1天</p>
     * @param Period <p>统计周期(单位秒), 当时间区间为1天内, 统计周期为5分钟; 当时间区间选择为1天以上, 15天以下, 统计周期为1小时; 当时间区间选择为15天以上, 180天以下, 统计周期为1天</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到</p> 
     * @return Values <p>有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到</p>
     */
    public Long [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到</p>
     * @param Values <p>有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到</p>
     */
    public void setValues(Long [] Values) {
        this.Values = Values;
    }

    /**
     * Get <p>各数据点的时间戳数组（Unix 时间戳，秒级），与  ⁠Values⁠  一一对应</p> 
     * @return Time <p>各数据点的时间戳数组（Unix 时间戳，秒级），与  ⁠Values⁠  一一对应</p>
     */
    public Long [] getTime() {
        return this.Time;
    }

    /**
     * Set <p>各数据点的时间戳数组（Unix 时间戳，秒级），与  ⁠Values⁠  一一对应</p>
     * @param Time <p>各数据点的时间戳数组（Unix 时间戳，秒级），与  ⁠Values⁠  一一对应</p>
     */
    public void setTime(Long [] Time) {
        this.Time = Time;
    }

    /**
     * Get <p>有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到</p> 
     * @return NewValues <p>有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到</p>
     */
    public Float [] getNewValues() {
        return this.NewValues;
    }

    /**
     * Set <p>有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到</p>
     * @param NewValues <p>有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到</p>
     */
    public void setNewValues(Float [] NewValues) {
        this.NewValues = NewValues;
    }

    /**
     * Get <p>聚合方式， ⁠&quot;last&quot;⁠  表示取时间段内最后一个值，“max”表示取时间段内最大值，“avg”表示取时间段内的平均值</p> 
     * @return Statistics <p>聚合方式， ⁠&quot;last&quot;⁠  表示取时间段内最后一个值，“max”表示取时间段内最大值，“avg”表示取时间段内的平均值</p>
     */
    public String getStatistics() {
        return this.Statistics;
    }

    /**
     * Set <p>聚合方式， ⁠&quot;last&quot;⁠  表示取时间段内最后一个值，“max”表示取时间段内最大值，“avg”表示取时间段内的平均值</p>
     * @param Statistics <p>聚合方式， ⁠&quot;last&quot;⁠  表示取时间段内最后一个值，“max”表示取时间段内最大值，“avg”表示取时间段内的平均值</p>
     */
    public void setStatistics(String Statistics) {
        this.Statistics = Statistics;
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

    public DescribeCurveDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCurveDataResponse(DescribeCurveDataResponse source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Values != null) {
            this.Values = new Long[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Long(source.Values[i]);
            }
        }
        if (source.Time != null) {
            this.Time = new Long[source.Time.length];
            for (int i = 0; i < source.Time.length; i++) {
                this.Time[i] = new Long(source.Time[i]);
            }
        }
        if (source.NewValues != null) {
            this.NewValues = new Float[source.NewValues.length];
            for (int i = 0; i < source.NewValues.length; i++) {
                this.NewValues[i] = new Float(source.NewValues[i]);
            }
        }
        if (source.Statistics != null) {
            this.Statistics = new String(source.Statistics);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamArraySimple(map, prefix + "Time.", this.Time);
        this.setParamArraySimple(map, prefix + "NewValues.", this.NewValues);
        this.setParamSimple(map, prefix + "Statistics", this.Statistics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

