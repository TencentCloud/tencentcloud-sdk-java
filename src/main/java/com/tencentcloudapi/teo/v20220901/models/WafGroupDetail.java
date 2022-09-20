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

public class WafGroupDetail extends AbstractModel{

    /**
    * 规则类型ID。
    */
    @SerializedName("RuleTypeId")
    @Expose
    private Long RuleTypeId;

    /**
    * 规则类型名称。
    */
    @SerializedName("RuleTypeName")
    @Expose
    private String RuleTypeName;

    /**
    * 规则类型描述。
    */
    @SerializedName("RuleTypeDesc")
    @Expose
    private String RuleTypeDesc;

    /**
    * 规则列表。
    */
    @SerializedName("WafGroupRules")
    @Expose
    private WafGroupRule [] WafGroupRules;

    /**
    * 规则等级。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 动作。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get 规则类型ID。 
     * @return RuleTypeId 规则类型ID。
     */
    public Long getRuleTypeId() {
        return this.RuleTypeId;
    }

    /**
     * Set 规则类型ID。
     * @param RuleTypeId 规则类型ID。
     */
    public void setRuleTypeId(Long RuleTypeId) {
        this.RuleTypeId = RuleTypeId;
    }

    /**
     * Get 规则类型名称。 
     * @return RuleTypeName 规则类型名称。
     */
    public String getRuleTypeName() {
        return this.RuleTypeName;
    }

    /**
     * Set 规则类型名称。
     * @param RuleTypeName 规则类型名称。
     */
    public void setRuleTypeName(String RuleTypeName) {
        this.RuleTypeName = RuleTypeName;
    }

    /**
     * Get 规则类型描述。 
     * @return RuleTypeDesc 规则类型描述。
     */
    public String getRuleTypeDesc() {
        return this.RuleTypeDesc;
    }

    /**
     * Set 规则类型描述。
     * @param RuleTypeDesc 规则类型描述。
     */
    public void setRuleTypeDesc(String RuleTypeDesc) {
        this.RuleTypeDesc = RuleTypeDesc;
    }

    /**
     * Get 规则列表。 
     * @return WafGroupRules 规则列表。
     */
    public WafGroupRule [] getWafGroupRules() {
        return this.WafGroupRules;
    }

    /**
     * Set 规则列表。
     * @param WafGroupRules 规则列表。
     */
    public void setWafGroupRules(WafGroupRule [] WafGroupRules) {
        this.WafGroupRules = WafGroupRules;
    }

    /**
     * Get 规则等级。 
     * @return Level 规则等级。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 规则等级。
     * @param Level 规则等级。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 动作。 
     * @return Action 动作。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作。
     * @param Action 动作。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public WafGroupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafGroupDetail(WafGroupDetail source) {
        if (source.RuleTypeId != null) {
            this.RuleTypeId = new Long(source.RuleTypeId);
        }
        if (source.RuleTypeName != null) {
            this.RuleTypeName = new String(source.RuleTypeName);
        }
        if (source.RuleTypeDesc != null) {
            this.RuleTypeDesc = new String(source.RuleTypeDesc);
        }
        if (source.WafGroupRules != null) {
            this.WafGroupRules = new WafGroupRule[source.WafGroupRules.length];
            for (int i = 0; i < source.WafGroupRules.length; i++) {
                this.WafGroupRules[i] = new WafGroupRule(source.WafGroupRules[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTypeId", this.RuleTypeId);
        this.setParamSimple(map, prefix + "RuleTypeName", this.RuleTypeName);
        this.setParamSimple(map, prefix + "RuleTypeDesc", this.RuleTypeDesc);
        this.setParamArrayObj(map, prefix + "WafGroupRules.", this.WafGroupRules);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

