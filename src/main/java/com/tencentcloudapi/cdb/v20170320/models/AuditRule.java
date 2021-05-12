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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditRule extends AbstractModel{

    /**
    * 审计规则 Id。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 审计规则创建时间。格式为 : "2019-03-20 17:09:13"。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 审计规则最后修改时间。格式为 : "2019-03-20 17:09:13"。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 审计规则名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 审计规则描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 审计规则过滤条件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleFilters")
    @Expose
    private AuditFilter [] RuleFilters;

    /**
    * 是否开启全审计。
    */
    @SerializedName("AuditAll")
    @Expose
    private Boolean AuditAll;

    /**
     * Get 审计规则 Id。 
     * @return RuleId 审计规则 Id。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 审计规则 Id。
     * @param RuleId 审计规则 Id。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 审计规则创建时间。格式为 : "2019-03-20 17:09:13"。 
     * @return CreateTime 审计规则创建时间。格式为 : "2019-03-20 17:09:13"。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 审计规则创建时间。格式为 : "2019-03-20 17:09:13"。
     * @param CreateTime 审计规则创建时间。格式为 : "2019-03-20 17:09:13"。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 审计规则最后修改时间。格式为 : "2019-03-20 17:09:13"。 
     * @return ModifyTime 审计规则最后修改时间。格式为 : "2019-03-20 17:09:13"。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 审计规则最后修改时间。格式为 : "2019-03-20 17:09:13"。
     * @param ModifyTime 审计规则最后修改时间。格式为 : "2019-03-20 17:09:13"。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 审计规则名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 审计规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 审计规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 审计规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 审计规则描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 审计规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 审计规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 审计规则描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 审计规则过滤条件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleFilters 审计规则过滤条件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuditFilter [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set 审计规则过滤条件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleFilters 审计规则过滤条件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleFilters(AuditFilter [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    /**
     * Get 是否开启全审计。 
     * @return AuditAll 是否开启全审计。
     */
    public Boolean getAuditAll() {
        return this.AuditAll;
    }

    /**
     * Set 是否开启全审计。
     * @param AuditAll 是否开启全审计。
     */
    public void setAuditAll(Boolean AuditAll) {
        this.AuditAll = AuditAll;
    }

    public AuditRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditRule(AuditRule source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleFilters != null) {
            this.RuleFilters = new AuditFilter[source.RuleFilters.length];
            for (int i = 0; i < source.RuleFilters.length; i++) {
                this.RuleFilters[i] = new AuditFilter(source.RuleFilters[i]);
            }
        }
        if (source.AuditAll != null) {
            this.AuditAll = new Boolean(source.AuditAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);
        this.setParamSimple(map, prefix + "AuditAll", this.AuditAll);

    }
}

