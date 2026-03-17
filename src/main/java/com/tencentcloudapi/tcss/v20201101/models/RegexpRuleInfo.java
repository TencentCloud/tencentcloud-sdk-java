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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegexpRuleInfo extends AbstractModel {

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 启用状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 正则表达式列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpressionList")
    @Expose
    private WhiteListRegexpExpressionInfo [] ExpressionList;

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 最近操作账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorUIN")
    @Expose
    private String OperatorUIN;

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 启用状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 启用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 启用状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 启用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 正则表达式列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpressionList 正则表达式列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WhiteListRegexpExpressionInfo [] getExpressionList() {
        return this.ExpressionList;
    }

    /**
     * Set 正则表达式列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpressionList 正则表达式列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpressionList(WhiteListRegexpExpressionInfo [] ExpressionList) {
        this.ExpressionList = ExpressionList;
    }

    /**
     * Get 规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleID 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleID 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 最近更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 最近操作账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorUIN 最近操作账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorUIN() {
        return this.OperatorUIN;
    }

    /**
     * Set 最近操作账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorUIN 最近操作账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorUIN(String OperatorUIN) {
        this.OperatorUIN = OperatorUIN;
    }

    public RegexpRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegexpRuleInfo(RegexpRuleInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.ExpressionList != null) {
            this.ExpressionList = new WhiteListRegexpExpressionInfo[source.ExpressionList.length];
            for (int i = 0; i < source.ExpressionList.length; i++) {
                this.ExpressionList[i] = new WhiteListRegexpExpressionInfo(source.ExpressionList[i]);
            }
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OperatorUIN != null) {
            this.OperatorUIN = new String(source.OperatorUIN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ExpressionList.", this.ExpressionList);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OperatorUIN", this.OperatorUIN);

    }
}

