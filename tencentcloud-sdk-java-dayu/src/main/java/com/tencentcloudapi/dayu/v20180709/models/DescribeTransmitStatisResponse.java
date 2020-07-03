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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTransmitStatisResponse extends AbstractModel{

    /**
    * 当MetricName=traffic时，表示入流量带宽，单位bps；
当MetricName=pkg时，表示入包速率，单位pps；
    */
    @SerializedName("InDataList")
    @Expose
    private Float [] InDataList;

    /**
    * 当MetricName=traffic时，表示出流量带宽，单位bps；
当MetricName=pkg时，表示出包速率，单位pps；
    */
    @SerializedName("OutDataList")
    @Expose
    private Float [] OutDataList;

    /**
    * 指标名：
traffic表示流量带宽；
pkg表示包速率；
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当MetricName=traffic时，表示入流量带宽，单位bps；
当MetricName=pkg时，表示入包速率，单位pps； 
     * @return InDataList 当MetricName=traffic时，表示入流量带宽，单位bps；
当MetricName=pkg时，表示入包速率，单位pps；
     */
    public Float [] getInDataList() {
        return this.InDataList;
    }

    /**
     * Set 当MetricName=traffic时，表示入流量带宽，单位bps；
当MetricName=pkg时，表示入包速率，单位pps；
     * @param InDataList 当MetricName=traffic时，表示入流量带宽，单位bps；
当MetricName=pkg时，表示入包速率，单位pps；
     */
    public void setInDataList(Float [] InDataList) {
        this.InDataList = InDataList;
    }

    /**
     * Get 当MetricName=traffic时，表示出流量带宽，单位bps；
当MetricName=pkg时，表示出包速率，单位pps； 
     * @return OutDataList 当MetricName=traffic时，表示出流量带宽，单位bps；
当MetricName=pkg时，表示出包速率，单位pps；
     */
    public Float [] getOutDataList() {
        return this.OutDataList;
    }

    /**
     * Set 当MetricName=traffic时，表示出流量带宽，单位bps；
当MetricName=pkg时，表示出包速率，单位pps；
     * @param OutDataList 当MetricName=traffic时，表示出流量带宽，单位bps；
当MetricName=pkg时，表示出包速率，单位pps；
     */
    public void setOutDataList(Float [] OutDataList) {
        this.OutDataList = OutDataList;
    }

    /**
     * Get 指标名：
traffic表示流量带宽；
pkg表示包速率； 
     * @return MetricName 指标名：
traffic表示流量带宽；
pkg表示包速率；
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名：
traffic表示流量带宽；
pkg表示包速率；
     * @param MetricName 指标名：
traffic表示流量带宽；
pkg表示包速率；
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InDataList.", this.InDataList);
        this.setParamArraySimple(map, prefix + "OutDataList.", this.OutDataList);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

