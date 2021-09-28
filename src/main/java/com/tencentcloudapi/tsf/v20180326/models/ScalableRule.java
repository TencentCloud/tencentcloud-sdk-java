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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScalableRule extends AbstractModel{

    /**
    * RuleId值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Name值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * ExpandVmCountLimit值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpandVmCountLimit")
    @Expose
    private Long ExpandVmCountLimit;

    /**
    * ShrinkVmCountLimit值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShrinkVmCountLimit")
    @Expose
    private Long ShrinkVmCountLimit;

    /**
    * GroupCount值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupCount")
    @Expose
    private Long GroupCount;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get RuleId值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId RuleId值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set RuleId值
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId RuleId值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Name值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name Name值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name Name值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get ExpandVmCountLimit值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpandVmCountLimit ExpandVmCountLimit值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpandVmCountLimit() {
        return this.ExpandVmCountLimit;
    }

    /**
     * Set ExpandVmCountLimit值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpandVmCountLimit ExpandVmCountLimit值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpandVmCountLimit(Long ExpandVmCountLimit) {
        this.ExpandVmCountLimit = ExpandVmCountLimit;
    }

    /**
     * Get ShrinkVmCountLimit值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShrinkVmCountLimit ShrinkVmCountLimit值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShrinkVmCountLimit() {
        return this.ShrinkVmCountLimit;
    }

    /**
     * Set ShrinkVmCountLimit值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShrinkVmCountLimit ShrinkVmCountLimit值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShrinkVmCountLimit(Long ShrinkVmCountLimit) {
        this.ShrinkVmCountLimit = ShrinkVmCountLimit;
    }

    /**
     * Get GroupCount值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupCount GroupCount值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupCount() {
        return this.GroupCount;
    }

    /**
     * Set GroupCount值
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupCount GroupCount值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupCount(Long GroupCount) {
        this.GroupCount = GroupCount;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ScalableRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScalableRule(ScalableRule source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExpandVmCountLimit != null) {
            this.ExpandVmCountLimit = new Long(source.ExpandVmCountLimit);
        }
        if (source.ShrinkVmCountLimit != null) {
            this.ShrinkVmCountLimit = new Long(source.ShrinkVmCountLimit);
        }
        if (source.GroupCount != null) {
            this.GroupCount = new Long(source.GroupCount);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ExpandVmCountLimit", this.ExpandVmCountLimit);
        this.setParamSimple(map, prefix + "ShrinkVmCountLimit", this.ShrinkVmCountLimit);
        this.setParamSimple(map, prefix + "GroupCount", this.GroupCount);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

