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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityRuleCreateResult extends AbstractModel {

    /**
    * 操作结果文案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 操作结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * 规则名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 本地表id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupTableId")
    @Expose
    private Long RuleGroupTableId;

    /**
    * 规则id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
     * Get 操作结果文案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msg 操作结果文案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 操作结果文案
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msg 操作结果文案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 操作结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Success 操作结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set 操作结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Success 操作结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get 规则名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 规则名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 规则名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupId 规则组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupId 规则组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 本地表id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupTableId 本地表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupTableId() {
        return this.RuleGroupTableId;
    }

    /**
     * Set 本地表id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupTableId 本地表id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupTableId(Long RuleGroupTableId) {
        this.RuleGroupTableId = RuleGroupTableId;
    }

    /**
     * Get 规则id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    public QualityRuleCreateResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityRuleCreateResult(QualityRuleCreateResult source) {
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.RuleGroupTableId != null) {
            this.RuleGroupTableId = new Long(source.RuleGroupTableId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "RuleGroupTableId", this.RuleGroupTableId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

