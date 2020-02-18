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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZonesInfo extends AbstractModel{

    /**
    * 可用区英文ID
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区数字ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 可用区中文名
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
     * Get 可用区英文ID 
     * @return Zone 可用区英文ID
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区英文ID
     * @param Zone 可用区英文ID
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区数字ID 
     * @return ZoneId 可用区数字ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区数字ID
     * @param ZoneId 可用区数字ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区中文名 
     * @return ZoneName 可用区中文名
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区中文名
     * @param ZoneName 可用区中文名
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

