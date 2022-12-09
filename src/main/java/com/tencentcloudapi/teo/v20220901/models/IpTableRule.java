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

public class IpTableRule extends AbstractModel{

    /**
    * 动作，取值有：
<li> drop：拦截；</li>
<li> trans：放行；</li>
<li> monitor：观察。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 根据类型匹配，取值有：
<li>ip：对ip进行匹配；</li>
<li>area：对ip所属地区匹配。</li>
    */
    @SerializedName("MatchFrom")
    @Expose
    private String MatchFrom;

    /**
    * 规则的匹配方式，默认为空代表等于。
取值有：
<li> is_emty：配置为空；</li>
<li> not_exists：配置为不存在；</li>
<li> include：包含；</li>
<li> not_include：不包含；</li>
<li> equal：等于；</li>
<li> not_equal：不等于。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 规则id。仅出参使用。
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 更新时间。仅出参使用。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 规则启用状态，当返回为null时，为启用。取值有：
<li> on：启用；</li>
<li> off：未启用。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规则名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 匹配内容。当 Operator为is_emty 或not_exists时，此值允许为空。
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
     * Get 动作，取值有：
<li> drop：拦截；</li>
<li> trans：放行；</li>
<li> monitor：观察。</li> 
     * @return Action 动作，取值有：
<li> drop：拦截；</li>
<li> trans：放行；</li>
<li> monitor：观察。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作，取值有：
<li> drop：拦截；</li>
<li> trans：放行；</li>
<li> monitor：观察。</li>
     * @param Action 动作，取值有：
<li> drop：拦截；</li>
<li> trans：放行；</li>
<li> monitor：观察。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 根据类型匹配，取值有：
<li>ip：对ip进行匹配；</li>
<li>area：对ip所属地区匹配。</li> 
     * @return MatchFrom 根据类型匹配，取值有：
<li>ip：对ip进行匹配；</li>
<li>area：对ip所属地区匹配。</li>
     */
    public String getMatchFrom() {
        return this.MatchFrom;
    }

    /**
     * Set 根据类型匹配，取值有：
<li>ip：对ip进行匹配；</li>
<li>area：对ip所属地区匹配。</li>
     * @param MatchFrom 根据类型匹配，取值有：
<li>ip：对ip进行匹配；</li>
<li>area：对ip所属地区匹配。</li>
     */
    public void setMatchFrom(String MatchFrom) {
        this.MatchFrom = MatchFrom;
    }

    /**
     * Get 规则的匹配方式，默认为空代表等于。
取值有：
<li> is_emty：配置为空；</li>
<li> not_exists：配置为不存在；</li>
<li> include：包含；</li>
<li> not_include：不包含；</li>
<li> equal：等于；</li>
<li> not_equal：不等于。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 规则的匹配方式，默认为空代表等于。
取值有：
<li> is_emty：配置为空；</li>
<li> not_exists：配置为不存在；</li>
<li> include：包含；</li>
<li> not_include：不包含；</li>
<li> equal：等于；</li>
<li> not_equal：不等于。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 规则的匹配方式，默认为空代表等于。
取值有：
<li> is_emty：配置为空；</li>
<li> not_exists：配置为不存在；</li>
<li> include：包含；</li>
<li> not_include：不包含；</li>
<li> equal：等于；</li>
<li> not_equal：不等于。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 规则的匹配方式，默认为空代表等于。
取值有：
<li> is_emty：配置为空；</li>
<li> not_exists：配置为不存在；</li>
<li> include：包含；</li>
<li> not_include：不包含；</li>
<li> equal：等于；</li>
<li> not_equal：不等于。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 规则id。仅出参使用。 
     * @return RuleID 规则id。仅出参使用。
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则id。仅出参使用。
     * @param RuleID 规则id。仅出参使用。
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 更新时间。仅出参使用。 
     * @return UpdateTime 更新时间。仅出参使用。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。仅出参使用。
     * @param UpdateTime 更新时间。仅出参使用。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 规则启用状态，当返回为null时，为启用。取值有：
<li> on：启用；</li>
<li> off：未启用。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 规则启用状态，当返回为null时，为启用。取值有：
<li> on：启用；</li>
<li> off：未启用。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则启用状态，当返回为null时，为启用。取值有：
<li> on：启用；</li>
<li> off：未启用。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 规则启用状态，当返回为null时，为启用。取值有：
<li> on：启用；</li>
<li> off：未启用。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 规则名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 匹配内容。当 Operator为is_emty 或not_exists时，此值允许为空。 
     * @return MatchContent 匹配内容。当 Operator为is_emty 或not_exists时，此值允许为空。
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set 匹配内容。当 Operator为is_emty 或not_exists时，此值允许为空。
     * @param MatchContent 匹配内容。当 Operator为is_emty 或not_exists时，此值允许为空。
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
    }

    public IpTableRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpTableRule(IpTableRule source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.MatchFrom != null) {
            this.MatchFrom = new String(source.MatchFrom);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "MatchFrom", this.MatchFrom);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);

    }
}

