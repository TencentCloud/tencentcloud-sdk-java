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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SuggestRiskLevelMatrixItem extends AbstractModel {

    /**
    * 分类分级等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveLevel")
    @Expose
    private RiskMatrixLevel SensitiveLevel;

    /**
    * 脆弱项等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulnerabilityLevel")
    @Expose
    private RiskMatrixLevel VulnerabilityLevel;

    /**
    * 风险名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * 分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskScore")
    @Expose
    private Float RiskScore;

    /**
     * Get 分类分级等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveLevel 分类分级等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskMatrixLevel getSensitiveLevel() {
        return this.SensitiveLevel;
    }

    /**
     * Set 分类分级等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveLevel 分类分级等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveLevel(RiskMatrixLevel SensitiveLevel) {
        this.SensitiveLevel = SensitiveLevel;
    }

    /**
     * Get 脆弱项等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulnerabilityLevel 脆弱项等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RiskMatrixLevel getVulnerabilityLevel() {
        return this.VulnerabilityLevel;
    }

    /**
     * Set 脆弱项等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulnerabilityLevel 脆弱项等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulnerabilityLevel(RiskMatrixLevel VulnerabilityLevel) {
        this.VulnerabilityLevel = VulnerabilityLevel;
    }

    /**
     * Get 风险名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskName 风险名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set 风险名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskName 风险名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get 分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskScore 分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRiskScore() {
        return this.RiskScore;
    }

    /**
     * Set 分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskScore 分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskScore(Float RiskScore) {
        this.RiskScore = RiskScore;
    }

    public SuggestRiskLevelMatrixItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuggestRiskLevelMatrixItem(SuggestRiskLevelMatrixItem source) {
        if (source.SensitiveLevel != null) {
            this.SensitiveLevel = new RiskMatrixLevel(source.SensitiveLevel);
        }
        if (source.VulnerabilityLevel != null) {
            this.VulnerabilityLevel = new RiskMatrixLevel(source.VulnerabilityLevel);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskScore != null) {
            this.RiskScore = new Float(source.RiskScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SensitiveLevel.", this.SensitiveLevel);
        this.setParamObj(map, prefix + "VulnerabilityLevel.", this.VulnerabilityLevel);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskScore", this.RiskScore);

    }
}

