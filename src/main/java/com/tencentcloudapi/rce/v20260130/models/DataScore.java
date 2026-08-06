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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataScore extends AbstractModel {

    /**
    * <p>风险等级</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>风险标签</p>
    */
    @SerializedName("RiskLabels")
    @Expose
    private RiskLabel [] RiskLabels;

    /**
    * <p>综合风险分数。</p><p>取值范围：[1, 1000]</p><p>数值越大，风险越大。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskScore")
    @Expose
    private Long RiskScore;

    /**
     * Get <p>风险等级</p> 
     * @return RiskLevel <p>风险等级</p>
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级</p>
     * @param RiskLevel <p>风险等级</p>
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>风险标签</p> 
     * @return RiskLabels <p>风险标签</p>
     */
    public RiskLabel [] getRiskLabels() {
        return this.RiskLabels;
    }

    /**
     * Set <p>风险标签</p>
     * @param RiskLabels <p>风险标签</p>
     */
    public void setRiskLabels(RiskLabel [] RiskLabels) {
        this.RiskLabels = RiskLabels;
    }

    /**
     * Get <p>综合风险分数。</p><p>取值范围：[1, 1000]</p><p>数值越大，风险越大。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskScore <p>综合风险分数。</p><p>取值范围：[1, 1000]</p><p>数值越大，风险越大。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskScore() {
        return this.RiskScore;
    }

    /**
     * Set <p>综合风险分数。</p><p>取值范围：[1, 1000]</p><p>数值越大，风险越大。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskScore <p>综合风险分数。</p><p>取值范围：[1, 1000]</p><p>数值越大，风险越大。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskScore(Long RiskScore) {
        this.RiskScore = RiskScore;
    }

    public DataScore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataScore(DataScore source) {
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.RiskLabels != null) {
            this.RiskLabels = new RiskLabel[source.RiskLabels.length];
            for (int i = 0; i < source.RiskLabels.length; i++) {
                this.RiskLabels[i] = new RiskLabel(source.RiskLabels[i]);
            }
        }
        if (source.RiskScore != null) {
            this.RiskScore = new Long(source.RiskScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArrayObj(map, prefix + "RiskLabels.", this.RiskLabels);
        this.setParamSimple(map, prefix + "RiskScore", this.RiskScore);

    }
}

