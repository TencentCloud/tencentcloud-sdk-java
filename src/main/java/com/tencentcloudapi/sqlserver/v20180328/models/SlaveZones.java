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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlaveZones extends AbstractModel {

    /**
    * 备可用区地域码
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * 备可用区
    */
    @SerializedName("SlaveZoneName")
    @Expose
    private String SlaveZoneName;

    /**
    * 备机资源ID
    */
    @SerializedName("DrInstanceId")
    @Expose
    private String DrInstanceId;

    /**
     * Get 备可用区地域码 
     * @return SlaveZone 备可用区地域码
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set 备可用区地域码
     * @param SlaveZone 备可用区地域码
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get 备可用区 
     * @return SlaveZoneName 备可用区
     */
    public String getSlaveZoneName() {
        return this.SlaveZoneName;
    }

    /**
     * Set 备可用区
     * @param SlaveZoneName 备可用区
     */
    public void setSlaveZoneName(String SlaveZoneName) {
        this.SlaveZoneName = SlaveZoneName;
    }

    /**
     * Get 备机资源ID 
     * @return DrInstanceId 备机资源ID
     */
    public String getDrInstanceId() {
        return this.DrInstanceId;
    }

    /**
     * Set 备机资源ID
     * @param DrInstanceId 备机资源ID
     */
    public void setDrInstanceId(String DrInstanceId) {
        this.DrInstanceId = DrInstanceId;
    }

    public SlaveZones() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlaveZones(SlaveZones source) {
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.SlaveZoneName != null) {
            this.SlaveZoneName = new String(source.SlaveZoneName);
        }
        if (source.DrInstanceId != null) {
            this.DrInstanceId = new String(source.DrInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "SlaveZoneName", this.SlaveZoneName);
        this.setParamSimple(map, prefix + "DrInstanceId", this.DrInstanceId);

    }
}

