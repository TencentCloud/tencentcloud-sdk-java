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

public class SceneWarnInfo extends AbstractModel {

    /**
    * <p>是否存在该提示</p>
    */
    @SerializedName("IsWarn")
    @Expose
    private Boolean IsWarn;

    /**
    * <p>风险程度（0-1）</p>
    */
    @SerializedName("RiskConfidence")
    @Expose
    private Float RiskConfidence;

    /**
    * <p>提示位置四点坐标，仅部分提示类型支持返回提示位置坐标</p>
    */
    @SerializedName("Polygon")
    @Expose
    private Polygon [] Polygon;

    /**
     * Get <p>是否存在该提示</p> 
     * @return IsWarn <p>是否存在该提示</p>
     */
    public Boolean getIsWarn() {
        return this.IsWarn;
    }

    /**
     * Set <p>是否存在该提示</p>
     * @param IsWarn <p>是否存在该提示</p>
     */
    public void setIsWarn(Boolean IsWarn) {
        this.IsWarn = IsWarn;
    }

    /**
     * Get <p>风险程度（0-1）</p> 
     * @return RiskConfidence <p>风险程度（0-1）</p>
     */
    public Float getRiskConfidence() {
        return this.RiskConfidence;
    }

    /**
     * Set <p>风险程度（0-1）</p>
     * @param RiskConfidence <p>风险程度（0-1）</p>
     */
    public void setRiskConfidence(Float RiskConfidence) {
        this.RiskConfidence = RiskConfidence;
    }

    /**
     * Get <p>提示位置四点坐标，仅部分提示类型支持返回提示位置坐标</p> 
     * @return Polygon <p>提示位置四点坐标，仅部分提示类型支持返回提示位置坐标</p>
     */
    public Polygon [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set <p>提示位置四点坐标，仅部分提示类型支持返回提示位置坐标</p>
     * @param Polygon <p>提示位置四点坐标，仅部分提示类型支持返回提示位置坐标</p>
     */
    public void setPolygon(Polygon [] Polygon) {
        this.Polygon = Polygon;
    }

    public SceneWarnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneWarnInfo(SceneWarnInfo source) {
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

