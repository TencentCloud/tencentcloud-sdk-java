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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralCardWarnInfo extends AbstractModel {

    /**
    * 是否存在该告警
    */
    @SerializedName("IsWarn")
    @Expose
    private Boolean IsWarn;

    /**
    * 风险程度
    */
    @SerializedName("RiskConfidence")
    @Expose
    private Float RiskConfidence;

    /**
    * 告警位置四点坐标
    */
    @SerializedName("Polygon")
    @Expose
    private Polygon [] Polygon;

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
     * Get 风险程度 
     * @return RiskConfidence 风险程度
     */
    public Float getRiskConfidence() {
        return this.RiskConfidence;
    }

    /**
     * Set 风险程度
     * @param RiskConfidence 风险程度
     */
    public void setRiskConfidence(Float RiskConfidence) {
        this.RiskConfidence = RiskConfidence;
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

    public GeneralCardWarnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralCardWarnInfo(GeneralCardWarnInfo source) {
        if (source.IsWarn != null) {
            this.IsWarn = new Boolean(source.IsWarn);
        }
        if (source.RiskConfidence != null) {
            this.RiskConfidence = new Float(source.RiskConfidence);
        }
        if (source.Polygon != null) {
            this.Polygon = new Polygon[source.Polygon.length];
            for (int i = 0; i < source.Polygon.length; i++) {
                this.Polygon[i] = new Polygon(source.Polygon[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsWarn", this.IsWarn);
        this.setParamSimple(map, prefix + "RiskConfidence", this.RiskConfidence);
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);

    }
}

