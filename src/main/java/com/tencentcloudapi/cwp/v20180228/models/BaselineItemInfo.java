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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineItemInfo extends AbstractModel{

    /**
    * 基线检测项ID
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * 检测项名字
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * 检测项所属规则的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 检测项描述
    */
    @SerializedName("ItemDesc")
    @Expose
    private String ItemDesc;

    /**
    * 检测项的修复方法
    */
    @SerializedName("FixMethod")
    @Expose
    private String FixMethod;

    /**
    * 检测项所属规则名字
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 危险等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 系统规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SysRuleId")
    @Expose
    private Long SysRuleId;

    /**
    * 被引自定义规则信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedCustomRuleInfo")
    @Expose
    private BaselineCustomRuleIdName [] RelatedCustomRuleInfo;

    /**
     * Get 基线检测项ID 
     * @return ItemId 基线检测项ID
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set 基线检测项ID
     * @param ItemId 基线检测项ID
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 检测项名字 
     * @return ItemName 检测项名字
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set 检测项名字
     * @param ItemName 检测项名字
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get 检测项所属规则的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 检测项所属规则的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 检测项所属规则的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 检测项所属规则的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 检测项描述 
     * @return ItemDesc 检测项描述
     */
    public String getItemDesc() {
        return this.ItemDesc;
    }

    /**
     * Set 检测项描述
     * @param ItemDesc 检测项描述
     */
    public void setItemDesc(String ItemDesc) {
        this.ItemDesc = ItemDesc;
    }

    /**
     * Get 检测项的修复方法 
     * @return FixMethod 检测项的修复方法
     */
    public String getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set 检测项的修复方法
     * @param FixMethod 检测项的修复方法
     */
    public void setFixMethod(String FixMethod) {
        this.FixMethod = FixMethod;
    }

    /**
     * Get 检测项所属规则名字 
     * @return RuleName 检测项所属规则名字
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 检测项所属规则名字
     * @param RuleName 检测项所属规则名字
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 危险等级 
     * @return Level 危险等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危险等级
     * @param Level 危险等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 系统规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SysRuleId 系统规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSysRuleId() {
        return this.SysRuleId;
    }

    /**
     * Set 系统规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SysRuleId 系统规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSysRuleId(Long SysRuleId) {
        this.SysRuleId = SysRuleId;
    }

    /**
     * Get 被引自定义规则信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedCustomRuleInfo 被引自定义规则信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaselineCustomRuleIdName [] getRelatedCustomRuleInfo() {
        return this.RelatedCustomRuleInfo;
    }

    /**
     * Set 被引自定义规则信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedCustomRuleInfo 被引自定义规则信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedCustomRuleInfo(BaselineCustomRuleIdName [] RelatedCustomRuleInfo) {
        this.RelatedCustomRuleInfo = RelatedCustomRuleInfo;
    }

    public BaselineItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItemInfo(BaselineItemInfo source) {
        if (source.ItemId != null) {
            this.ItemId = new Long(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.ItemDesc != null) {
            this.ItemDesc = new String(source.ItemDesc);
        }
        if (source.FixMethod != null) {
            this.FixMethod = new String(source.FixMethod);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.SysRuleId != null) {
            this.SysRuleId = new Long(source.SysRuleId);
        }
        if (source.RelatedCustomRuleInfo != null) {
            this.RelatedCustomRuleInfo = new BaselineCustomRuleIdName[source.RelatedCustomRuleInfo.length];
            for (int i = 0; i < source.RelatedCustomRuleInfo.length; i++) {
                this.RelatedCustomRuleInfo[i] = new BaselineCustomRuleIdName(source.RelatedCustomRuleInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ItemDesc", this.ItemDesc);
        this.setParamSimple(map, prefix + "FixMethod", this.FixMethod);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "SysRuleId", this.SysRuleId);
        this.setParamArrayObj(map, prefix + "RelatedCustomRuleInfo.", this.RelatedCustomRuleInfo);

    }
}

