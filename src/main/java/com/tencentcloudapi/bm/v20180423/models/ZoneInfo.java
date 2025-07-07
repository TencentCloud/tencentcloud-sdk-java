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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * 可用区ID
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区整型ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 可用区描述
    */
    @SerializedName("ZoneDescription")
    @Expose
    private String ZoneDescription;

    /**
     * Get 可用区ID 
     * @return Zone 可用区ID
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区ID
     * @param Zone 可用区ID
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区整型ID 
     * @return ZoneId 可用区整型ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区整型ID
     * @param ZoneId 可用区整型ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区描述 
     * @return ZoneDescription 可用区描述
     */
    public String getZoneDescription() {
        return this.ZoneDescription;
    }

    /**
     * Set 可用区描述
     * @param ZoneDescription 可用区描述
     */
    public void setZoneDescription(String ZoneDescription) {
        this.ZoneDescription = ZoneDescription;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneDescription != null) {
            this.ZoneDescription = new String(source.ZoneDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneDescription", this.ZoneDescription);

    }
}

