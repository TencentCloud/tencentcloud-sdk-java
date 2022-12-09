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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityRule extends AbstractModel{

    /**
    * 规则id。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则类型名。
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * 等级描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleLevelDesc")
    @Expose
    private String RuleLevelDesc;

    /**
    * 规则类型id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTypeId")
    @Expose
    private Long RuleTypeId;

    /**
    * 规则类型描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTypeDesc")
    @Expose
    private String RuleTypeDesc;

    /**
    * 规则标签。部分类型的规则不存在该参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleTags")
    @Expose
    private String [] RuleTags;

    /**
    * 状态，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>为空时对应接口Status无意义，例如仅查询规则详情时。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 子域名/应用名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
     * Get 规则id。 
     * @return RuleId 规则id。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id。
     * @param RuleId 规则id。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则描述。 
     * @return Description 规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述。
     * @param Description 规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则类型名。 
     * @return RuleTypeName 规则类型名。
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set 规则类型名。
     * @param RuleTypeName 规则类型名。
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get 等级描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleLevelDesc 等级描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleLevelDesc() {
        return this.RuleLevelDesc;
    }

    /**
     * Set 等级描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleLevelDesc 等级描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleLevelDesc(String RuleLevelDesc) {
        this.RuleLevelDesc = RuleLevelDesc;
    }

    /**
     * Get 规则类型id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTypeId 规则类型id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleTypeId() {
        return this.RuleTypeId;
    }

    /**
     * Set 规则类型id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTypeId 规则类型id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTypeId(Long RuleTypeId) {
        this.RuleTypeId = RuleTypeId;
    }

    /**
     * Get 规则类型描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTypeDesc 规则类型描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleTypeDesc() {
        return this.RuleTypeDesc;
    }

    /**
     * Set 规则类型描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTypeDesc 规则类型描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTypeDesc(String RuleTypeDesc) {
        this.RuleTypeDesc = RuleTypeDesc;
    }

    /**
     * Get 规则标签。部分类型的规则不存在该参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleTags 规则标签。部分类型的规则不存在该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRuleTags() {
        return this.RuleTags;
    }

    /**
     * Set 规则标签。部分类型的规则不存在该参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleTags 规则标签。部分类型的规则不存在该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleTags(String [] RuleTags) {
        this.RuleTags = RuleTags;
    }

    /**
     * Get 状态，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>为空时对应接口Status无意义，例如仅查询规则详情时。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>为空时对应接口Status无意义，例如仅查询规则详情时。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>为空时对应接口Status无意义，例如仅查询规则详情时。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>为空时对应接口Status无意义，例如仅查询规则详情时。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 子域名/应用名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Entity 子域名/应用名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set 子域名/应用名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Entity 子域名/应用名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    public SecurityRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityRule(SecurityRule source) {
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
        if (source.RuleTypeId != null) {
            this.RuleTypeId = new Long(source.RuleTypeId);
        }
        if (source.RuleTypeDesc != null) {
            this.RuleTypeDesc = new String(source.RuleTypeDesc);
        }
        if (source.RuleTags != null) {
            this.RuleTags = new String[source.RuleTags.length];
            for (int i = 0; i < source.RuleTags.length; i++) {
                this.RuleTags[i] = new String(source.RuleTags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
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
        this.setParamSimple(map, prefix + "RuleTypeId", this.RuleTypeId);
        this.setParamSimple(map, prefix + "RuleTypeDesc", this.RuleTypeDesc);
        this.setParamArraySimple(map, prefix + "RuleTags.", this.RuleTags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Entity", this.Entity);

    }
}

