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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Zone extends AbstractModel {

    /**
    * 可用区名称
    */
    @SerializedName("LocalName")
    @Expose
    private String LocalName;

    /**
    * 可用区 ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 可用区状态
    */
    @SerializedName("ZoneStatus")
    @Expose
    private String ZoneStatus;

    /**
     * Get 可用区名称 
     * @return LocalName 可用区名称
     */
    public String getLocalName() {
        return this.LocalName;
    }

    /**
     * Set 可用区名称
     * @param LocalName 可用区名称
     */
    public void setLocalName(String LocalName) {
        this.LocalName = LocalName;
    }

    /**
     * Get 可用区 ID 
     * @return ZoneId 可用区 ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区 ID
     * @param ZoneId 可用区 ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区状态 
     * @return ZoneStatus 可用区状态
     */
    public String getZoneStatus() {
        return this.ZoneStatus;
    }

    /**
     * Set 可用区状态
     * @param ZoneStatus 可用区状态
     */
    public void setZoneStatus(String ZoneStatus) {
        this.ZoneStatus = ZoneStatus;
    }

    public Zone() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Zone(Zone source) {
        if (source.LocalName != null) {
            this.LocalName = new String(source.LocalName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneStatus != null) {
            this.ZoneStatus = new String(source.ZoneStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalName", this.LocalName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneStatus", this.ZoneStatus);

    }
}

