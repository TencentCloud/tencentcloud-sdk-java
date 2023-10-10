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

public class MachineFileTamperRule extends AbstractModel{

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则类型 0 ：系统规则  1：用户规则
    */
    @SerializedName("RuleCategory")
    @Expose
    private Long RuleCategory;

    /**
    * 规则
    */
    @SerializedName("Rule")
    @Expose
    private FileTamperRule [] Rule;

    /**
    * 唯一id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则类型 0 ：系统规则  1：用户规则 
     * @return RuleCategory 规则类型 0 ：系统规则  1：用户规则
     */
    public Long getRuleCategory() {
        return this.RuleCategory;
    }

    /**
     * Set 规则类型 0 ：系统规则  1：用户规则
     * @param RuleCategory 规则类型 0 ：系统规则  1：用户规则
     */
    public void setRuleCategory(Long RuleCategory) {
        this.RuleCategory = RuleCategory;
    }

    /**
     * Get 规则 
     * @return Rule 规则
     */
    public FileTamperRule [] getRule() {
        return this.Rule;
    }

    /**
     * Set 规则
     * @param Rule 规则
     */
    public void setRule(FileTamperRule [] Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 唯一id 
     * @return Id 唯一id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一id
     * @param Id 唯一id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public MachineFileTamperRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineFileTamperRule(MachineFileTamperRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RuleCategory != null) {
            this.RuleCategory = new Long(source.RuleCategory);
        }
        if (source.Rule != null) {
            this.Rule = new FileTamperRule[source.Rule.length];
            for (int i = 0; i < source.Rule.length; i++) {
                this.Rule[i] = new FileTamperRule(source.Rule[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RuleCategory", this.RuleCategory);
        this.setParamArrayObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

