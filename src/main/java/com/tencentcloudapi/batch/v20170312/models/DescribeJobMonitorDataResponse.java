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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobMonitorDataResponse extends AbstractModel {

    /**
    * 监控数据粒度，单位:秒；时间粒度随着查询的时间范围变化，查询时间范围越小，时间粒度越小。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 监控采集的数据。时间戳和对应的值一一对应；如果查询的任务重试，采集时间段涉及多个实例的话，某些时间段内的值为null, 表示对应时间点没有实例存在，也不存在对应的监控数据；相邻监控时间段之间的空值数量最多为10。
    */
    @SerializedName("DataPoints")
    @Expose
    private DataPointView DataPoints;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 监控数据粒度，单位:秒；时间粒度随着查询的时间范围变化，查询时间范围越小，时间粒度越小。 
     * @return Period 监控数据粒度，单位:秒；时间粒度随着查询的时间范围变化，查询时间范围越小，时间粒度越小。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 监控数据粒度，单位:秒；时间粒度随着查询的时间范围变化，查询时间范围越小，时间粒度越小。
     * @param Period 监控数据粒度，单位:秒；时间粒度随着查询的时间范围变化，查询时间范围越小，时间粒度越小。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 监控采集的数据。时间戳和对应的值一一对应；如果查询的任务重试，采集时间段涉及多个实例的话，某些时间段内的值为null, 表示对应时间点没有实例存在，也不存在对应的监控数据；相邻监控时间段之间的空值数量最多为10。 
     * @return DataPoints 监控采集的数据。时间戳和对应的值一一对应；如果查询的任务重试，采集时间段涉及多个实例的话，某些时间段内的值为null, 表示对应时间点没有实例存在，也不存在对应的监控数据；相邻监控时间段之间的空值数量最多为10。
     */
    public DataPointView getDataPoints() {
        return this.DataPoints;
    }

    /**
     * Set 监控采集的数据。时间戳和对应的值一一对应；如果查询的任务重试，采集时间段涉及多个实例的话，某些时间段内的值为null, 表示对应时间点没有实例存在，也不存在对应的监控数据；相邻监控时间段之间的空值数量最多为10。
     * @param DataPoints 监控采集的数据。时间戳和对应的值一一对应；如果查询的任务重试，采集时间段涉及多个实例的话，某些时间段内的值为null, 表示对应时间点没有实例存在，也不存在对应的监控数据；相邻监控时间段之间的空值数量最多为10。
     */
    public void setDataPoints(DataPointView DataPoints) {
        this.DataPoints = DataPoints;
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

    public DescribeJobMonitorDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobMonitorDataResponse(DescribeJobMonitorDataResponse source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.DataPoints != null) {
            this.DataPoints = new DataPointView(source.DataPoints);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamObj(map, prefix + "DataPoints.", this.DataPoints);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

