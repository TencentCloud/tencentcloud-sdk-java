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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAntiInfoLeakRulesRuleItem extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规则动作类型
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 规则创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 详细的规则
    */
    @SerializedName("Strategies")
    @Expose
    private DescribeAntiInfoLeakRulesStrategyItem [] Strategies;

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则状态 
     * @return Status 规则状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态
     * @param Status 规则状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 规则动作类型 
     * @return ActionType 规则动作类型
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 规则动作类型
     * @param ActionType 规则动作类型
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 规则创建时间 
     * @return CreateTime 规则创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 规则创建时间
     * @param CreateTime 规则创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 详细的规则 
     * @return Strategies 详细的规则
     */
    public DescribeAntiInfoLeakRulesStrategyItem [] getStrategies() {
        return this.Strategies;
    }

    /**
     * Set 详细的规则
     * @param Strategies 详细的规则
     */
    public void setStrategies(DescribeAntiInfoLeakRulesStrategyItem [] Strategies) {
        this.Strategies = Strategies;
    }

    public DescribeAntiInfoLeakRulesRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAntiInfoLeakRulesRuleItem(DescribeAntiInfoLeakRulesRuleItem source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Strategies != null) {
            this.Strategies = new DescribeAntiInfoLeakRulesStrategyItem[source.Strategies.length];
            for (int i = 0; i < source.Strategies.length; i++) {
                this.Strategies[i] = new DescribeAntiInfoLeakRulesStrategyItem(source.Strategies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Strategies.", this.Strategies);

    }
}

