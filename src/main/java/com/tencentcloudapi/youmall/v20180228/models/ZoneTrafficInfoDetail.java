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

public class ZoneTrafficInfoDetail  extends AbstractModel{

    /**
    * 区域ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Integer ZoneId;

    /**
    * 区域名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 客流量
    */
    @SerializedName("TrafficTotalCount")
    @Expose
    private Integer TrafficTotalCount;

    /**
    * 平均停留时间
    */
    @SerializedName("AvgStayTime")
    @Expose
    private Integer AvgStayTime;

    /**
     * 获取区域ID
     * @return ZoneId 区域ID
     */
    public Integer getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置区域ID
     * @param ZoneId 区域ID
     */
    public void setZoneId(Integer ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取区域名称
     * @return ZoneName 区域名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * 设置区域名称
     * @param ZoneName 区域名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * 获取客流量
     * @return TrafficTotalCount 客流量
     */
    public Integer getTrafficTotalCount() {
        return this.TrafficTotalCount;
    }

    /**
     * 设置客流量
     * @param TrafficTotalCount 客流量
     */
    public void setTrafficTotalCount(Integer TrafficTotalCount) {
        this.TrafficTotalCount = TrafficTotalCount;
    }

    /**
     * 获取平均停留时间
     * @return AvgStayTime 平均停留时间
     */
    public Integer getAvgStayTime() {
        return this.AvgStayTime;
    }

    /**
     * 设置平均停留时间
     * @param AvgStayTime 平均停留时间
     */
    public void setAvgStayTime(Integer AvgStayTime) {
        this.AvgStayTime = AvgStayTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "TrafficTotalCount", this.TrafficTotalCount);
        this.setParamSimple(map, prefix + "AvgStayTime", this.AvgStayTime);

    }
}

