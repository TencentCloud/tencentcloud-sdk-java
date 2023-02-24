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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetMultiFlowStatisticRequest extends AbstractModel{

    /**
    * 设备id列表，单次最多请求10个设备
    */
    @SerializedName("DeviceIds")
    @Expose
    private String [] DeviceIds;

    /**
    * 1659514436
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 1659515000
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 统计流量类型（1：上行流量，2：下行流量）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 统计时间粒度（1：按小时统计，2：按天统计）
    */
    @SerializedName("TimeGranularity")
    @Expose
    private Long TimeGranularity;

    /**
     * Get 设备id列表，单次最多请求10个设备 
     * @return DeviceIds 设备id列表，单次最多请求10个设备
     */
    public String [] getDeviceIds() {
        return this.DeviceIds;
    }

    /**
     * Set 设备id列表，单次最多请求10个设备
     * @param DeviceIds 设备id列表，单次最多请求10个设备
     */
    public void setDeviceIds(String [] DeviceIds) {
        this.DeviceIds = DeviceIds;
    }

    /**
     * Get 1659514436 
     * @return BeginTime 1659514436
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 1659514436
     * @param BeginTime 1659514436
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 1659515000 
     * @return EndTime 1659515000
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 1659515000
     * @param EndTime 1659515000
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 统计流量类型（1：上行流量，2：下行流量） 
     * @return Type 统计流量类型（1：上行流量，2：下行流量）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 统计流量类型（1：上行流量，2：下行流量）
     * @param Type 统计流量类型（1：上行流量，2：下行流量）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 统计时间粒度（1：按小时统计，2：按天统计） 
     * @return TimeGranularity 统计时间粒度（1：按小时统计，2：按天统计）
     */
    public Long getTimeGranularity() {
        return this.TimeGranularity;
    }

    /**
     * Set 统计时间粒度（1：按小时统计，2：按天统计）
     * @param TimeGranularity 统计时间粒度（1：按小时统计，2：按天统计）
     */
    public void setTimeGranularity(Long TimeGranularity) {
        this.TimeGranularity = TimeGranularity;
    }

    public GetMultiFlowStatisticRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMultiFlowStatisticRequest(GetMultiFlowStatisticRequest source) {
        if (source.DeviceIds != null) {
            this.DeviceIds = new String[source.DeviceIds.length];
            for (int i = 0; i < source.DeviceIds.length; i++) {
                this.DeviceIds[i] = new String(source.DeviceIds[i]);
            }
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.TimeGranularity != null) {
            this.TimeGranularity = new Long(source.TimeGranularity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeviceIds.", this.DeviceIds);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TimeGranularity", this.TimeGranularity);

    }
}

