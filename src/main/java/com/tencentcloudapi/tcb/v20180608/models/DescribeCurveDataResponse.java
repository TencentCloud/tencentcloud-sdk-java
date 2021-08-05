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

public class DescribeCurveDataResponse extends AbstractModel{

    /**
    * 开始时间, 会根据数据的统计周期进行取整.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间, 会根据数据的统计周期进行取整.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 指标名.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 统计周期(单位秒), 当时间区间为1天内, 统计周期为5分钟; 当时间区间选择为1天以上, 15天以下, 统计周期为1小时; 当时间区间选择为15天以上, 180天以下, 统计周期为1天.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到.
    */
    @SerializedName("Values")
    @Expose
    private Long [] Values;

    /**
    * 时间数据, 标识监控数据Values中的点是哪个时间段上报的.
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
     * Get 开始时间, 会根据数据的统计周期进行取整. 
     * @return StartTime 开始时间, 会根据数据的统计周期进行取整.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间, 会根据数据的统计周期进行取整.
     * @param StartTime 开始时间, 会根据数据的统计周期进行取整.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间, 会根据数据的统计周期进行取整. 
     * @return EndTime 结束时间, 会根据数据的统计周期进行取整.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间, 会根据数据的统计周期进行取整.
     * @param EndTime 结束时间, 会根据数据的统计周期进行取整.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指标名. 
     * @return MetricName 指标名.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名.
     * @param MetricName 指标名.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 统计周期(单位秒), 当时间区间为1天内, 统计周期为5分钟; 当时间区间选择为1天以上, 15天以下, 统计周期为1小时; 当时间区间选择为15天以上, 180天以下, 统计周期为1天. 
     * @return Period 统计周期(单位秒), 当时间区间为1天内, 统计周期为5分钟; 当时间区间选择为1天以上, 15天以下, 统计周期为1小时; 当时间区间选择为15天以上, 180天以下, 统计周期为1天.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 统计周期(单位秒), 当时间区间为1天内, 统计周期为5分钟; 当时间区间选择为1天以上, 15天以下, 统计周期为1小时; 当时间区间选择为15天以上, 180天以下, 统计周期为1天.
     * @param Period 统计周期(单位秒), 当时间区间为1天内, 统计周期为5分钟; 当时间区间选择为1天以上, 15天以下, 统计周期为1小时; 当时间区间选择为15天以上, 180天以下, 统计周期为1天.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到. 
     * @return Values 有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到.
     */
    public Long [] getValues() {
        return this.Values;
    }

    /**
     * Set 有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到.
     * @param Values 有效的监控数据, 每个有效监控数据的上报时间可以从时间数组中的对应位置上获取到.
     */
    public void setValues(Long [] Values) {
        this.Values = Values;
    }

    /**
     * Get 时间数据, 标识监控数据Values中的点是哪个时间段上报的. 
     * @return Time 时间数据, 标识监控数据Values中的点是哪个时间段上报的.
     */
    public Long [] getTime() {
        return this.Time;
    }

    /**
     * Set 时间数据, 标识监控数据Values中的点是哪个时间段上报的.
     * @param Time 时间数据, 标识监控数据Values中的点是哪个时间段上报的.
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

