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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClusterHostStatisticsRequest extends AbstractModel {

    /**
    * 查询的专用集群id
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * 宿主机id
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 时间范围精度，1分钟(ONE_MINUTE)/5分钟(FIVE_MINUTE)
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
     * Get 查询的专用集群id 
     * @return DedicatedClusterId 查询的专用集群id
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set 查询的专用集群id
     * @param DedicatedClusterId 查询的专用集群id
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get 宿主机id 
     * @return HostId 宿主机id
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 宿主机id
     * @param HostId 宿主机id
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 时间范围精度，1分钟(ONE_MINUTE)/5分钟(FIVE_MINUTE) 
     * @return Period 时间范围精度，1分钟(ONE_MINUTE)/5分钟(FIVE_MINUTE)
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set 时间范围精度，1分钟(ONE_MINUTE)/5分钟(FIVE_MINUTE)
     * @param Period 时间范围精度，1分钟(ONE_MINUTE)/5分钟(FIVE_MINUTE)
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    public DescribeDedicatedClusterHostStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClusterHostStatisticsRequest(DescribeDedicatedClusterHostStatisticsRequest source) {
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

