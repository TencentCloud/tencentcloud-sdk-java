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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrZoneInfo extends AbstractModel {

    /**
    * 备机资源ID
    */
    @SerializedName("DrInstanceId")
    @Expose
    private String DrInstanceId;

    /**
    * 备机可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

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

    /**
     * Get 备机可用区 
     * @return Zone 备机可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 备机可用区
     * @param Zone 备机可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public DrZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrZoneInfo(DrZoneInfo source) {
        if (source.DrInstanceId != null) {
            this.DrInstanceId = new String(source.DrInstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrInstanceId", this.DrInstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

