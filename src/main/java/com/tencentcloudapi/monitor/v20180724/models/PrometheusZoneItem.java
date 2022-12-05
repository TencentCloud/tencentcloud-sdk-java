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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusZoneItem extends AbstractModel{

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区 ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 可用区状态( 0: 不可用；1: 可用)
    */
    @SerializedName("ZoneState")
    @Expose
    private Long ZoneState;

    /**
    * 地域 ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 可用区名（目前为中文）
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区 ID 
     * @return ZoneId 可用区 ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区 ID
     * @param ZoneId 可用区 ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区状态( 0: 不可用；1: 可用) 
     * @return ZoneState 可用区状态( 0: 不可用；1: 可用)
     */
    public Long getZoneState() {
        return this.ZoneState;
    }

    /**
     * Set 可用区状态( 0: 不可用；1: 可用)
     * @param ZoneState 可用区状态( 0: 不可用；1: 可用)
     */
    public void setZoneState(Long ZoneState) {
        this.ZoneState = ZoneState;
    }

    /**
     * Get 地域 ID 
     * @return RegionId 地域 ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域 ID
     * @param RegionId 地域 ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 可用区名（目前为中文） 
     * @return ZoneName 可用区名（目前为中文）
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区名（目前为中文）
     * @param ZoneName 可用区名（目前为中文）
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    public PrometheusZoneItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusZoneItem(PrometheusZoneItem source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneState != null) {
            this.ZoneState = new Long(source.ZoneState);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

