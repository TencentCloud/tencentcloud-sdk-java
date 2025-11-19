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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputReference extends AbstractModel {

    /**
    * 合同审查风险结果ID
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * 风险名称
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * 风险描述
    */
    @SerializedName("RiskDescription")
    @Expose
    private String RiskDescription;

    /**
    * 风险要点分类名称
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 审查依据
    */
    @SerializedName("RiskBasis")
    @Expose
    private String RiskBasis;

    /**
    * 引文内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Excerpts")
    @Expose
    private ReferenceExcerpt [] Excerpts;

    /**
     * Get 合同审查风险结果ID 
     * @return RiskId 合同审查风险结果ID
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 合同审查风险结果ID
     * @param RiskId 合同审查风险结果ID
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 风险名称 
     * @return RiskName 风险名称
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set 风险名称
     * @param RiskName 风险名称
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get 风险描述 
     * @return RiskDescription 风险描述
     */
    public String getRiskDescription() {
        return this.RiskDescription;
    }

    /**
     * Set 风险描述
     * @param RiskDescription 风险描述
     */
    public void setRiskDescription(String RiskDescription) {
        this.RiskDescription = RiskDescription;
    }

    /**
     * Get 风险要点分类名称 
     * @return CategoryName 风险要点分类名称
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 风险要点分类名称
     * @param CategoryName 风险要点分类名称
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 审查依据 
     * @return RiskBasis 审查依据
     */
    public String getRiskBasis() {
        return this.RiskBasis;
    }

    /**
     * Set 审查依据
     * @param RiskBasis 审查依据
     */
    public void setRiskBasis(String RiskBasis) {
        this.RiskBasis = RiskBasis;
    }

    /**
     * Get 引文内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Excerpts 引文内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ReferenceExcerpt [] getExcerpts() {
        return this.Excerpts;
    }

    /**
     * Set 引文内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Excerpts 引文内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcerpts(ReferenceExcerpt [] Excerpts) {
        this.Excerpts = Excerpts;
    }

    public OutputReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputReference(OutputReference source) {
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskDescription != null) {
            this.RiskDescription = new String(source.RiskDescription);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.RiskBasis != null) {
            this.RiskBasis = new String(source.RiskBasis);
        }
        if (source.Excerpts != null) {
            this.Excerpts = new ReferenceExcerpt[source.Excerpts.length];
            for (int i = 0; i < source.Excerpts.length; i++) {
                this.Excerpts[i] = new ReferenceExcerpt(source.Excerpts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskDescription", this.RiskDescription);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "RiskBasis", this.RiskBasis);
        this.setParamArrayObj(map, prefix + "Excerpts.", this.Excerpts);

    }
}

