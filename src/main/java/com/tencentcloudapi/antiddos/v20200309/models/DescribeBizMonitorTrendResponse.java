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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBizMonitorTrendResponse extends AbstractModel {

    /**
    * 曲线图各个时间点的值
    */
    @SerializedName("DataList")
    @Expose
    private Float [] DataList;

    /**
    * 统计纬度
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 返回DataList中的最大值
    */
    @SerializedName("MaxData")
    @Expose
    private Long MaxData;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 曲线图各个时间点的值 
     * @return DataList 曲线图各个时间点的值
     */
    public Float [] getDataList() {
        return this.DataList;
    }

    /**
     * Set 曲线图各个时间点的值
     * @param DataList 曲线图各个时间点的值
     */
    public void setDataList(Float [] DataList) {
        this.DataList = DataList;
    }

    /**
     * Get 统计纬度 
     * @return MetricName 统计纬度
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 统计纬度
     * @param MetricName 统计纬度
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 返回DataList中的最大值 
     * @return MaxData 返回DataList中的最大值
     */
    public Long getMaxData() {
        return this.MaxData;
    }

    /**
     * Set 返回DataList中的最大值
     * @param MaxData 返回DataList中的最大值
     */
    public void setMaxData(Long MaxData) {
        this.MaxData = MaxData;
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

    public DescribeBizMonitorTrendResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBizMonitorTrendResponse(DescribeBizMonitorTrendResponse source) {
        if (source.DataList != null) {
            this.DataList = new Float[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new Float(source.DataList[i]);
            }
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MaxData != null) {
            this.MaxData = new Long(source.MaxData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DataList.", this.DataList);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MaxData", this.MaxData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

