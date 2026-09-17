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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * 可用区ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 可用区代码。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区中文名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 可用区英文名称。
    */
    @SerializedName("ZoneNameEn")
    @Expose
    private String ZoneNameEn;

    /**
    * 地域代码。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 区域代码。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 区域名称。
    */
    @SerializedName("LocationName")
    @Expose
    private String LocationName;

    /**
     * Get 可用区ID。 
     * @return ZoneId 可用区ID。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID。
     * @param ZoneId 可用区ID。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区代码。 
     * @return Zone 可用区代码。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区代码。
     * @param Zone 可用区代码。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区中文名称。 
     * @return ZoneName 可用区中文名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区中文名称。
     * @param ZoneName 可用区中文名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 可用区英文名称。 
     * @return ZoneNameEn 可用区英文名称。
     */
    public String getZoneNameEn() {
        return this.ZoneNameEn;
    }

    /**
     * Set 可用区英文名称。
     * @param ZoneNameEn 可用区英文名称。
     */
    public void setZoneNameEn(String ZoneNameEn) {
        this.ZoneNameEn = ZoneNameEn;
    }

    /**
     * Get 地域代码。 
     * @return Region 地域代码。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域代码。
     * @param Region 地域代码。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 区域代码。 
     * @return Location 区域代码。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 区域代码。
     * @param Location 区域代码。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 区域名称。 
     * @return LocationName 区域名称。
     */
    public String getLocationName() {
        return this.LocationName;
    }

    /**
     * Set 区域名称。
     * @param LocationName 区域名称。
     */
    public void setLocationName(String LocationName) {
        this.LocationName = LocationName;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.ZoneNameEn != null) {
            this.ZoneNameEn = new String(source.ZoneNameEn);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.LocationName != null) {
            this.LocationName = new String(source.LocationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneNameEn", this.ZoneNameEn);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "LocationName", this.LocationName);

    }
}

