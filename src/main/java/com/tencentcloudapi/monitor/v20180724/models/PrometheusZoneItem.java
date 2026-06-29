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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusZoneItem extends AbstractModel {

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>可用区 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>可用区状态( 0: 不可用；1: 可用)</p>
    */
    @SerializedName("ZoneState")
    @Expose
    private Long ZoneState;

    /**
    * <p>地域 ID</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>可用区名（目前为中文）</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>可用区资源状态(0:资源不足，不可使用；1:资源足够)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneResourceState")
    @Expose
    private Long ZoneResourceState;

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>可用区 ID</p> 
     * @return ZoneId <p>可用区 ID</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区 ID</p>
     * @param ZoneId <p>可用区 ID</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>可用区状态( 0: 不可用；1: 可用)</p> 
     * @return ZoneState <p>可用区状态( 0: 不可用；1: 可用)</p>
     */
    public Long getZoneState() {
        return this.ZoneState;
    }

    /**
     * Set <p>可用区状态( 0: 不可用；1: 可用)</p>
     * @param ZoneState <p>可用区状态( 0: 不可用；1: 可用)</p>
     */
    public void setZoneState(Long ZoneState) {
        this.ZoneState = ZoneState;
    }

    /**
     * Get <p>地域 ID</p> 
     * @return RegionId <p>地域 ID</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域 ID</p>
     * @param RegionId <p>地域 ID</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>可用区名（目前为中文）</p> 
     * @return ZoneName <p>可用区名（目前为中文）</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>可用区名（目前为中文）</p>
     * @param ZoneName <p>可用区名（目前为中文）</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>可用区资源状态(0:资源不足，不可使用；1:资源足够)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneResourceState <p>可用区资源状态(0:资源不足，不可使用；1:资源足够)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneResourceState() {
        return this.ZoneResourceState;
    }

    /**
     * Set <p>可用区资源状态(0:资源不足，不可使用；1:资源足够)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneResourceState <p>可用区资源状态(0:资源不足，不可使用；1:资源足够)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneResourceState(Long ZoneResourceState) {
        this.ZoneResourceState = ZoneResourceState;
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
        if (source.ZoneResourceState != null) {
            this.ZoneResourceState = new Long(source.ZoneResourceState);
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
        this.setParamSimple(map, prefix + "ZoneResourceState", this.ZoneResourceState);

    }
}

