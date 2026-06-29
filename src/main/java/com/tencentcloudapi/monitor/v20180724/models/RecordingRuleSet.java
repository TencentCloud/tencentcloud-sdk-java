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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordingRuleSet extends AbstractModel {

    /**
    * <p>规则 ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>规则状态码</p>
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
    * <p>分组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>规则内容组</p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>规则数量</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>规则创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>规则最近更新时间</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>规则名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get <p>规则 ID</p> 
     * @return RuleId <p>规则 ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则 ID</p>
     * @param RuleId <p>规则 ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>规则状态码</p> 
     * @return RuleState <p>规则状态码</p>
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set <p>规则状态码</p>
     * @param RuleState <p>规则状态码</p>
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    /**
     * Get <p>分组名称</p> 
     * @return Name <p>分组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分组名称</p>
     * @param Name <p>分组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>规则内容组</p> 
     * @return Group <p>规则内容组</p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>规则内容组</p>
     * @param Group <p>规则内容组</p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>规则数量</p> 
     * @return Total <p>规则数量</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>规则数量</p>
     * @param Total <p>规则数量</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>规则创建时间</p> 
     * @return CreatedAt <p>规则创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>规则创建时间</p>
     * @param CreatedAt <p>规则创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>规则最近更新时间</p> 
     * @return UpdatedAt <p>规则最近更新时间</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>规则最近更新时间</p>
     * @param UpdatedAt <p>规则最近更新时间</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
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

    public RecordingRuleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordingRuleSet(RecordingRuleSet source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

