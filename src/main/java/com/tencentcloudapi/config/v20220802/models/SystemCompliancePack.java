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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemCompliancePack extends AbstractModel {

    /**
    * 合规包ID
    */
    @SerializedName("CompliancePackId")
    @Expose
    private String CompliancePackId;

    /**
    * 名称
    */
    @SerializedName("CompliancePackName")
    @Expose
    private String CompliancePackName;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 合规包风险等级1：高风险。
2：中风险。
3：低风险。
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 合规包规则信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigRules")
    @Expose
    private CompliancePackRuleForManage [] ConfigRules;

    /**
     * Get 合规包ID 
     * @return CompliancePackId 合规包ID
     */
    public String getCompliancePackId() {
        return this.CompliancePackId;
    }

    /**
     * Set 合规包ID
     * @param CompliancePackId 合规包ID
     */
    public void setCompliancePackId(String CompliancePackId) {
        this.CompliancePackId = CompliancePackId;
    }

    /**
     * Get 名称 
     * @return CompliancePackName 名称
     */
    public String getCompliancePackName() {
        return this.CompliancePackName;
    }

    /**
     * Set 名称
     * @param CompliancePackName 名称
     */
    public void setCompliancePackName(String CompliancePackName) {
        this.CompliancePackName = CompliancePackName;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 合规包风险等级1：高风险。
2：中风险。
3：低风险。 
     * @return RiskLevel 合规包风险等级1：高风险。
2：中风险。
3：低风险。
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 合规包风险等级1：高风险。
2：中风险。
3：低风险。
     * @param RiskLevel 合规包风险等级1：高风险。
2：中风险。
3：低风险。
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 合规包规则信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigRules 合规包规则信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompliancePackRuleForManage [] getConfigRules() {
        return this.ConfigRules;
    }

    /**
     * Set 合规包规则信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigRules 合规包规则信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigRules(CompliancePackRuleForManage [] ConfigRules) {
        this.ConfigRules = ConfigRules;
    }

    public SystemCompliancePack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemCompliancePack(SystemCompliancePack source) {
        if (source.CompliancePackId != null) {
            this.CompliancePackId = new String(source.CompliancePackId);
        }
        if (source.CompliancePackName != null) {
            this.CompliancePackName = new String(source.CompliancePackName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.ConfigRules != null) {
            this.ConfigRules = new CompliancePackRuleForManage[source.ConfigRules.length];
            for (int i = 0; i < source.ConfigRules.length; i++) {
                this.ConfigRules[i] = new CompliancePackRuleForManage(source.ConfigRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompliancePackId", this.CompliancePackId);
        this.setParamSimple(map, prefix + "CompliancePackName", this.CompliancePackName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArrayObj(map, prefix + "ConfigRules.", this.ConfigRules);

    }
}

