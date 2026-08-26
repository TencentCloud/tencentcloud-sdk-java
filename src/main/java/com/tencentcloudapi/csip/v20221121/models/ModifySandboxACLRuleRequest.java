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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySandboxACLRuleRequest extends AbstractModel {

    /**
    * 规则 ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 规则名称
入参限制：长度 1-128
默认值：不传则不修改
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则级别
枚举值：
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
默认值：不传则不修改
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 引用的系统规则 ID 列表
入参限制：传空数组表示清空；不传表示不修改
    */
    @SerializedName("SystemRuleIDList")
    @Expose
    private Long [] SystemRuleIDList;

    /**
    * 用户自定义规则内容
入参限制：传空数组表示清空；不传表示不修改
    */
    @SerializedName("UserRuleContent")
    @Expose
    private TrafficSandboxACLRuleContentItem [] UserRuleContent;

    /**
    * 生效范围
默认值：不传则不修改
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * 规则动作(RuleAction)
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
默认值：不传则不修改
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 目标状态
枚举值：
ON：启用
OFF：禁用
默认值：不传则不修改
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 规则 ID 
     * @return ID 规则 ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 规则 ID
     * @param ID 规则 ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 规则名称
入参限制：长度 1-128
默认值：不传则不修改 
     * @return RuleName 规则名称
入参限制：长度 1-128
默认值：不传则不修改
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
入参限制：长度 1-128
默认值：不传则不修改
     * @param RuleName 规则名称
入参限制：长度 1-128
默认值：不传则不修改
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则级别
枚举值：
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
默认值：不传则不修改 
     * @return Level 规则级别
枚举值：
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
默认值：不传则不修改
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 规则级别
枚举值：
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
默认值：不传则不修改
     * @param Level 规则级别
枚举值：
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
默认值：不传则不修改
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 引用的系统规则 ID 列表
入参限制：传空数组表示清空；不传表示不修改 
     * @return SystemRuleIDList 引用的系统规则 ID 列表
入参限制：传空数组表示清空；不传表示不修改
     */
    public Long [] getSystemRuleIDList() {
        return this.SystemRuleIDList;
    }

    /**
     * Set 引用的系统规则 ID 列表
入参限制：传空数组表示清空；不传表示不修改
     * @param SystemRuleIDList 引用的系统规则 ID 列表
入参限制：传空数组表示清空；不传表示不修改
     */
    public void setSystemRuleIDList(Long [] SystemRuleIDList) {
        this.SystemRuleIDList = SystemRuleIDList;
    }

    /**
     * Get 用户自定义规则内容
入参限制：传空数组表示清空；不传表示不修改 
     * @return UserRuleContent 用户自定义规则内容
入参限制：传空数组表示清空；不传表示不修改
     */
    public TrafficSandboxACLRuleContentItem [] getUserRuleContent() {
        return this.UserRuleContent;
    }

    /**
     * Set 用户自定义规则内容
入参限制：传空数组表示清空；不传表示不修改
     * @param UserRuleContent 用户自定义规则内容
入参限制：传空数组表示清空；不传表示不修改
     */
    public void setUserRuleContent(TrafficSandboxACLRuleContentItem [] UserRuleContent) {
        this.UserRuleContent = UserRuleContent;
    }

    /**
     * Get 生效范围
默认值：不传则不修改 
     * @return EffectScope 生效范围
默认值：不传则不修改
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set 生效范围
默认值：不传则不修改
     * @param EffectScope 生效范围
默认值：不传则不修改
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get 规则动作(RuleAction)
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
默认值：不传则不修改 
     * @return RuleAction 规则动作(RuleAction)
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
默认值：不传则不修改
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 规则动作(RuleAction)
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
默认值：不传则不修改
     * @param RuleAction 规则动作(RuleAction)
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
默认值：不传则不修改
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 目标状态
枚举值：
ON：启用
OFF：禁用
默认值：不传则不修改 
     * @return Status 目标状态
枚举值：
ON：启用
OFF：禁用
默认值：不传则不修改
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 目标状态
枚举值：
ON：启用
OFF：禁用
默认值：不传则不修改
     * @param Status 目标状态
枚举值：
ON：启用
OFF：禁用
默认值：不传则不修改
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifySandboxACLRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySandboxACLRuleRequest(ModifySandboxACLRuleRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.SystemRuleIDList != null) {
            this.SystemRuleIDList = new Long[source.SystemRuleIDList.length];
            for (int i = 0; i < source.SystemRuleIDList.length; i++) {
                this.SystemRuleIDList[i] = new Long(source.SystemRuleIDList[i]);
            }
        }
        if (source.UserRuleContent != null) {
            this.UserRuleContent = new TrafficSandboxACLRuleContentItem[source.UserRuleContent.length];
            for (int i = 0; i < source.UserRuleContent.length; i++) {
                this.UserRuleContent[i] = new TrafficSandboxACLRuleContentItem(source.UserRuleContent[i]);
            }
        }
        if (source.EffectScope != null) {
            this.EffectScope = new TrafficSandboxEffectScope(source.EffectScope);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "SystemRuleIDList.", this.SystemRuleIDList);
        this.setParamArrayObj(map, prefix + "UserRuleContent.", this.UserRuleContent);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

