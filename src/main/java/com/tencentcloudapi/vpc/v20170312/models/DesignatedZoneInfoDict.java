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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DesignatedZoneInfoDict extends AbstractModel {

    /**
    * 可用区Id
    */
    @SerializedName("DesignatedZone")
    @Expose
    private String DesignatedZone;

    /**
    * 可用区名称
    */
    @SerializedName("DesignatedZoneName")
    @Expose
    private String DesignatedZoneName;

    /**
    * 可用区类型
    */
    @SerializedName("DesignatedZoneType")
    @Expose
    private String DesignatedZoneType;

    /**
     * Get 可用区Id 
     * @return DesignatedZone 可用区Id
     */
    public String getDesignatedZone() {
        return this.DesignatedZone;
    }

    /**
     * Set 可用区Id
     * @param DesignatedZone 可用区Id
     */
    public void setDesignatedZone(String DesignatedZone) {
        this.DesignatedZone = DesignatedZone;
    }

    /**
     * Get 可用区名称 
     * @return DesignatedZoneName 可用区名称
     */
    public String getDesignatedZoneName() {
        return this.DesignatedZoneName;
    }

    /**
     * Set 可用区名称
     * @param DesignatedZoneName 可用区名称
     */
    public void setDesignatedZoneName(String DesignatedZoneName) {
        this.DesignatedZoneName = DesignatedZoneName;
    }

    /**
     * Get 可用区类型 
     * @return DesignatedZoneType 可用区类型
     */
    public String getDesignatedZoneType() {
        return this.DesignatedZoneType;
    }

    /**
     * Set 可用区类型
     * @param DesignatedZoneType 可用区类型
     */
    public void setDesignatedZoneType(String DesignatedZoneType) {
        this.DesignatedZoneType = DesignatedZoneType;
    }

    public DesignatedZoneInfoDict() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DesignatedZoneInfoDict(DesignatedZoneInfoDict source) {
        if (source.DesignatedZone != null) {
            this.DesignatedZone = new String(source.DesignatedZone);
        }
        if (source.DesignatedZoneName != null) {
            this.DesignatedZoneName = new String(source.DesignatedZoneName);
        }
        if (source.DesignatedZoneType != null) {
            this.DesignatedZoneType = new String(source.DesignatedZoneType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DesignatedZone", this.DesignatedZone);
        this.setParamSimple(map, prefix + "DesignatedZoneName", this.DesignatedZoneName);
        this.setParamSimple(map, prefix + "DesignatedZoneType", this.DesignatedZoneType);

    }
}

