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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBgpBizTrendResponse extends AbstractModel{

    /**
    * 曲线图各个时间点的值
    */
    @SerializedName("DataList")
    @Expose
    private Long [] DataList;

    /**
    * 曲线图取值个数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 统计纬度
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 返回数组最大值
    */
    @SerializedName("MaxData")
    @Expose
    private Long MaxData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 曲线图各个时间点的值 
     * @return DataList 曲线图各个时间点的值
     */
    public Long [] getDataList() {
        return this.DataList;
    }

    /**
     * Set 曲线图各个时间点的值
     * @param DataList 曲线图各个时间点的值
     */
    public void setDataList(Long [] DataList) {
        this.DataList = DataList;
    }

    /**
     * Get 曲线图取值个数 
     * @return Total 曲线图取值个数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 曲线图取值个数
     * @param Total 曲线图取值个数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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
     * Get 返回数组最大值 
     * @return MaxData 返回数组最大值
     */
    public Long getMaxData() {
        return this.MaxData;
    }

    /**
     * Set 返回数组最大值
     * @param MaxData 返回数组最大值
     */
    public void setMaxData(Long MaxData) {
        this.MaxData = MaxData;
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

    public DescribeBgpBizTrendResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBgpBizTrendResponse(DescribeBgpBizTrendResponse source) {
        if (source.DataList != null) {
            this.DataList = new Long[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new Long(source.DataList[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MaxData", this.MaxData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

