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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneFlowAndAvrStayTime extends AbstractModel{

    /**
    * 区域id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 区域名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 人流量
    */
    @SerializedName("FlowCount")
    @Expose
    private Long FlowCount;

    /**
    * 平均停留时长
    */
    @SerializedName("AvrStayTime")
    @Expose
    private Long AvrStayTime;

    /**
     * Get 区域id 
     * @return ZoneId 区域id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域id
     * @param ZoneId 区域id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 区域名称 
     * @return ZoneName 区域名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 区域名称
     * @param ZoneName 区域名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 人流量 
     * @return FlowCount 人流量
     */
    public Long getFlowCount() {
        return this.FlowCount;
    }

    /**
     * Set 人流量
     * @param FlowCount 人流量
     */
    public void setFlowCount(Long FlowCount) {
        this.FlowCount = FlowCount;
    }

    /**
     * Get 平均停留时长 
     * @return AvrStayTime 平均停留时长
     */
    public Long getAvrStayTime() {
        return this.AvrStayTime;
    }

    /**
     * Set 平均停留时长
     * @param AvrStayTime 平均停留时长
     */
    public void setAvrStayTime(Long AvrStayTime) {
        this.AvrStayTime = AvrStayTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "FlowCount", this.FlowCount);
        this.setParamSimple(map, prefix + "AvrStayTime", this.AvrStayTime);

    }
}

