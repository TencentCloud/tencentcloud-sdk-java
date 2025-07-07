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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableZone extends AbstractModel {

    /**
    * 可用区名称
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 可用区中文名称
    */
    @SerializedName("ZoneCnName")
    @Expose
    private String ZoneCnName;

    /**
    * Type数组
    */
    @SerializedName("Types")
    @Expose
    private AvailableType [] Types;

    /**
    * 可用区中英文名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
     * Get 可用区名称 
     * @return Zone 可用区名称
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区名称
     * @param Zone 可用区名称
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区ID 
     * @return ZoneId 可用区ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID
     * @param ZoneId 可用区ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区中文名称 
     * @return ZoneCnName 可用区中文名称
     */
    public String getZoneCnName() {
        return this.ZoneCnName;
    }

    /**
     * Set 可用区中文名称
     * @param ZoneCnName 可用区中文名称
     */
    public void setZoneCnName(String ZoneCnName) {
        this.ZoneCnName = ZoneCnName;
    }

    /**
     * Get Type数组 
     * @return Types Type数组
     */
    public AvailableType [] getTypes() {
        return this.Types;
    }

    /**
     * Set Type数组
     * @param Types Type数组
     */
    public void setTypes(AvailableType [] Types) {
        this.Types = Types;
    }

    /**
     * Get 可用区中英文名称 
     * @return ZoneName 可用区中英文名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区中英文名称
     * @param ZoneName 可用区中英文名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    public AvailableZone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableZone(AvailableZone source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneCnName != null) {
            this.ZoneCnName = new String(source.ZoneCnName);
        }
        if (source.Types != null) {
            this.Types = new AvailableType[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new AvailableType(source.Types[i]);
            }
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
        this.setParamSimple(map, prefix + "ZoneCnName", this.ZoneCnName);
        this.setParamArrayObj(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

