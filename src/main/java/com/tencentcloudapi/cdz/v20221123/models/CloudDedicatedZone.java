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
package com.tencentcloudapi.cdz.v20221123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudDedicatedZone extends AbstractModel {

    /**
    * 专属可用区所属的可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 地域系统中的可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 专属可用区名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 是否为轻量专属可用区
    */
    @SerializedName("IsLiteMode")
    @Expose
    private Boolean IsLiteMode;

    /**
    * 可用区所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 专属可用区所属的可用区 
     * @return Zone 专属可用区所属的可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 专属可用区所属的可用区
     * @param Zone 专属可用区所属的可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 地域系统中的可用区ID 
     * @return ZoneId 地域系统中的可用区ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 地域系统中的可用区ID
     * @param ZoneId 地域系统中的可用区ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 专属可用区名称 
     * @return ZoneName 专属可用区名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 专属可用区名称
     * @param ZoneName 专属可用区名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 是否为轻量专属可用区 
     * @return IsLiteMode 是否为轻量专属可用区
     */
    public Boolean getIsLiteMode() {
        return this.IsLiteMode;
    }

    /**
     * Set 是否为轻量专属可用区
     * @param IsLiteMode 是否为轻量专属可用区
     */
    public void setIsLiteMode(Boolean IsLiteMode) {
        this.IsLiteMode = IsLiteMode;
    }

    /**
     * Get 可用区所在地域 
     * @return Region 可用区所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 可用区所在地域
     * @param Region 可用区所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public CloudDedicatedZone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudDedicatedZone(CloudDedicatedZone source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.IsLiteMode != null) {
            this.IsLiteMode = new Boolean(source.IsLiteMode);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "IsLiteMode", this.IsLiteMode);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

