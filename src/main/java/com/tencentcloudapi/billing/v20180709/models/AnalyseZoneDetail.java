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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseZoneDetail extends AbstractModel {

    /**
    * 可用区id
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 可用区Name
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
     * Get 可用区id 
     * @return ZoneId 可用区id
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区id
     * @param ZoneId 可用区id
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区Name 
     * @return ZoneName 可用区Name
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区Name
     * @param ZoneName 可用区Name
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    public AnalyseZoneDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseZoneDetail(AnalyseZoneDetail source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

