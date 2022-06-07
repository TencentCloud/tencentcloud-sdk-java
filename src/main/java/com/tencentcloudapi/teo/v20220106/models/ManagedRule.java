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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagedRule extends AbstractModel{

    /**
    * 规则id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则类型名
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * 策略规则防护等级
    */
    @SerializedName("RuleLevelDesc")
    @Expose
    private String RuleLevelDesc;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 规则当前状态  block, allow
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规则标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTags")
    @Expose
    private String [] RuleTags;

    /**
    * 规则类型详细描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTypeDesc")
    @Expose
    private String RuleTypeDesc;

    /**
    * 规则类型id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTypeId")
    @Expose
    private Long RuleTypeId;

    /**
     * Get 规则id 
     * @return RuleId 规则id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
     * @param RuleId 规则id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则描述 
     * @return Description 规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
     * @param Description 规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则类型名 
     * @return RuleTypeName 规则类型名
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set 规则类型名
     * @param RuleTypeName 规则类型名
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get 策略规则防护等级 
     * @return RuleLevelDesc 策略规则防护等级
     */
    public String getRuleLevelDesc() {
        return this.RuleLevelDesc;
    }

    /**
     * Set 策略规则防护等级
     * @param RuleLevelDesc 策略规则防护等级
     */
    public void setRuleLevelDesc(String RuleLevelDesc) {
        this.RuleLevelDesc = RuleLevelDesc;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 规则当前状态  block, allow 
     * @return Status 规则当前状态  block, allow
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则当前状态  block, allow
     * @param Status 规则当前状态  block, allow
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 规则标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTags 规则标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRuleTags() {
        return this.RuleTags;
    }

    /**
     * Set 规则标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTags 规则标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTags(String [] RuleTags) {
        this.RuleTags = RuleTags;
    }

    /**
     * Get 规则类型详细描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTypeDesc 规则类型详细描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleTypeDesc() {
        return this.RuleTypeDesc;
    }

    /**
     * Set 规则类型详细描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTypeDesc 规则类型详细描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTypeDesc(String RuleTypeDesc) {
        this.RuleTypeDesc = RuleTypeDesc;
    }

    /**
     * Get 规则类型id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTypeId 规则类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleTypeId() {
        return this.RuleTypeId;
    }

    /**
     * Set 规则类型id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTypeId 规则类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTypeId(Long RuleTypeId) {
        this.RuleTypeId = RuleTypeId;
    }

    public ManagedRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRule(ManagedRule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.RuleLevelDesc != null) {
            this.RuleLevelDesc = new String(source.RuleLevelDesc);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleTags != null) {
            this.RuleTags = new String[source.RuleTags.length];
            for (int i = 0; i < source.RuleTags.length; i++) {
                this.RuleTags[i] = new String(source.RuleTags[i]);
            }
        }
        if (source.RuleTypeDesc != null) {
            this.RuleTypeDesc = new String(source.RuleTypeDesc);
        }
        if (source.RuleTypeId != null) {
            this.RuleTypeId = new Long(source.RuleTypeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "RuleLevelDesc", this.RuleLevelDesc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "RuleTags.", this.RuleTags);
        this.setParamSimple(map, prefix + "RuleTypeDesc", this.RuleTypeDesc);
        this.setParamSimple(map, prefix + "RuleTypeId", this.RuleTypeId);

    }
}

