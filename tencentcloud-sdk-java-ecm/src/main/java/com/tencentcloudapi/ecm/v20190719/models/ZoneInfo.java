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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel{

    /**
    * ZoneId
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * ZoneName
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get ZoneId 
     * @return ZoneId ZoneId
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ZoneId
     * @param ZoneId ZoneId
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get ZoneName 
     * @return ZoneName ZoneName
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set ZoneName
     * @param ZoneName ZoneName
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Zone 
     * @return Zone Zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Zone
     * @param Zone Zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

