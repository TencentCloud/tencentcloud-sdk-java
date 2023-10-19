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

public class DspaDiscoveryComplianceGroupRule extends AbstractModel {

    /**
    * 敏感数据识别规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 敏感数据识别规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 敏感数据分类ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 敏感数据分级ID, 目前只支持高、中、低三级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 合规组对应的分类信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 分级名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelRiskName")
    @Expose
    private String LevelRiskName;

    /**
     * Get 敏感数据识别规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 敏感数据识别规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 敏感数据识别规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 敏感数据识别规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 敏感数据识别规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 敏感数据识别规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 敏感数据识别规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 敏感数据识别规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 敏感数据分类ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryId 敏感数据分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 敏感数据分类ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryId 敏感数据分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 敏感数据分级ID, 目前只支持高、中、低三级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelId 敏感数据分级ID, 目前只支持高、中、低三级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 敏感数据分级ID, 目前只支持高、中、低三级
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelId 敏感数据分级ID, 目前只支持高、中、低三级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 合规组对应的分类信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryName 合规组对应的分类信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 合规组对应的分类信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryName 合规组对应的分类信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 分级名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelRiskName 分级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevelRiskName() {
        return this.LevelRiskName;
    }

    /**
     * Set 分级名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelRiskName 分级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelRiskName(String LevelRiskName) {
        this.LevelRiskName = LevelRiskName;
    }

    public DspaDiscoveryComplianceGroupRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryComplianceGroupRule(DspaDiscoveryComplianceGroupRule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.LevelRiskName != null) {
            this.LevelRiskName = new String(source.LevelRiskName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "LevelRiskName", this.LevelRiskName);

    }
}

