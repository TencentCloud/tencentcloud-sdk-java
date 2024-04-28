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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralWarnInfo extends AbstractModel {

    /**
    * 是否存在该告警
    */
    @SerializedName("IsWarn")
    @Expose
    private Boolean IsWarn;

    /**
    * 告警位置四点坐标
    */
    @SerializedName("Polygon")
    @Expose
    private Polygon [] Polygon;

    /**
    * 特殊判定，支持包括

Finger：由手指导致的不完整，仅在不完整告警中返回
    */
    @SerializedName("SpecificMatter")
    @Expose
    private String SpecificMatter;

    /**
     * Get 是否存在该告警 
     * @return IsWarn 是否存在该告警
     */
    public Boolean getIsWarn() {
        return this.IsWarn;
    }

    /**
     * Set 是否存在该告警
     * @param IsWarn 是否存在该告警
     */
    public void setIsWarn(Boolean IsWarn) {
        this.IsWarn = IsWarn;
    }

    /**
     * Get 告警位置四点坐标 
     * @return Polygon 告警位置四点坐标
     */
    public Polygon [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set 告警位置四点坐标
     * @param Polygon 告警位置四点坐标
     */
    public void setPolygon(Polygon [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get 特殊判定，支持包括

Finger：由手指导致的不完整，仅在不完整告警中返回 
     * @return SpecificMatter 特殊判定，支持包括

Finger：由手指导致的不完整，仅在不完整告警中返回
     */
    public String getSpecificMatter() {
        return this.SpecificMatter;
    }

    /**
     * Set 特殊判定，支持包括

Finger：由手指导致的不完整，仅在不完整告警中返回
     * @param SpecificMatter 特殊判定，支持包括

Finger：由手指导致的不完整，仅在不完整告警中返回
     */
    public void setSpecificMatter(String SpecificMatter) {
        this.SpecificMatter = SpecificMatter;
    }

    public GeneralWarnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralWarnInfo(GeneralWarnInfo source) {
        if (source.IsWarn != null) {
            this.IsWarn = new Boolean(source.IsWarn);
        }
        if (source.Polygon != null) {
            this.Polygon = new Polygon[source.Polygon.length];
            for (int i = 0; i < source.Polygon.length; i++) {
                this.Polygon[i] = new Polygon(source.Polygon[i]);
            }
        }
        if (source.SpecificMatter != null) {
            this.SpecificMatter = new String(source.SpecificMatter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsWarn", this.IsWarn);
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "SpecificMatter", this.SpecificMatter);

    }
}

