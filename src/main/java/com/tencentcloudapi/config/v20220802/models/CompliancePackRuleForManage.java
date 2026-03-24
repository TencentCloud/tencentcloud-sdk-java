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

public class CompliancePackRuleForManage extends AbstractModel {

    /**
    * <p>规则唯一身份标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>风险等级</p><p>1：高风险 2：中风险  3：低风险</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>合规包规则</p>
    */
    @SerializedName("CompliancePackRules")
    @Expose
    private CompliancePackRules [] CompliancePackRules;

    /**
    * <p>规则编号信息</p>
    */
    @SerializedName("Control")
    @Expose
    private Control [] Control;

    /**
    * <p>资源类型</p>
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
     * Get <p>规则唯一身份标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Identifier <p>规则唯一身份标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>规则唯一身份标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Identifier <p>规则唯一身份标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>风险等级</p><p>1：高风险 2：中风险  3：低风险</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel <p>风险等级</p><p>1：高风险 2：中风险  3：低风险</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级</p><p>1：高风险 2：中风险  3：低风险</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel <p>风险等级</p><p>1：高风险 2：中风险  3：低风险</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>合规包规则</p> 
     * @return CompliancePackRules <p>合规包规则</p>
     */
    public CompliancePackRules [] getCompliancePackRules() {
        return this.CompliancePackRules;
    }

    /**
     * Set <p>合规包规则</p>
     * @param CompliancePackRules <p>合规包规则</p>
     */
    public void setCompliancePackRules(CompliancePackRules [] CompliancePackRules) {
        this.CompliancePackRules = CompliancePackRules;
    }

    /**
     * Get <p>规则编号信息</p> 
     * @return Control <p>规则编号信息</p>
     */
    public Control [] getControl() {
        return this.Control;
    }

    /**
     * Set <p>规则编号信息</p>
     * @param Control <p>规则编号信息</p>
     */
    public void setControl(Control [] Control) {
        this.Control = Control;
    }

    /**
     * Get <p>资源类型</p> 
     * @return ResourceTypes <p>资源类型</p>
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set <p>资源类型</p>
     * @param ResourceTypes <p>资源类型</p>
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    public CompliancePackRuleForManage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompliancePackRuleForManage(CompliancePackRuleForManage source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CompliancePackRules != null) {
            this.CompliancePackRules = new CompliancePackRules[source.CompliancePackRules.length];
            for (int i = 0; i < source.CompliancePackRules.length; i++) {
                this.CompliancePackRules[i] = new CompliancePackRules(source.CompliancePackRules[i]);
            }
        }
        if (source.Control != null) {
            this.Control = new Control[source.Control.length];
            for (int i = 0; i < source.Control.length; i++) {
                this.Control[i] = new Control(source.Control[i]);
            }
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "CompliancePackRules.", this.CompliancePackRules);
        this.setParamArrayObj(map, prefix + "Control.", this.Control);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);

    }
}

