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

public class CreateSandboxACLRuleRequest extends AbstractModel {

    /**
    * 规则名称
入参限制：长度 1-128
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
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * 生效范围
入参限制：EffectScope.EffectType=INCLUDE 时 EffectAssets 必须非空
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * 初始状态
枚举值：
ON：启用
OFF：禁用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规则动作(RuleAction)
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 引用的系统规则 ID 列表
入参限制：最多 100 个；与 UserRuleContent 至少提供其一
    */
    @SerializedName("SystemRuleIDList")
    @Expose
    private Long [] SystemRuleIDList;

    /**
    * 用户自定义规则内容
入参限制：最多 100 条子规则；与 SystemRuleIDList 至少提供其一
    */
    @SerializedName("UserRuleContent")
    @Expose
    private TrafficSandboxACLRuleContentItem [] UserRuleContent;

    /**
     * Get 规则名称
入参限制：长度 1-128 
     * @return RuleName 规则名称
入参限制：长度 1-128
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
入参限制：长度 1-128
     * @param RuleName 规则名称
入参限制：长度 1-128
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
     * @return Level 规则级别
枚举值：
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
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
     * @param Level 规则级别
枚举值：
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器 
     * @return BelongAssetType 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
     * @param BelongAssetType 归属资产类型
枚举值：
HOST：主机
CONTAINER：容器
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get 生效范围
入参限制：EffectScope.EffectType=INCLUDE 时 EffectAssets 必须非空 
     * @return EffectScope 生效范围
入参限制：EffectScope.EffectType=INCLUDE 时 EffectAssets 必须非空
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set 生效范围
入参限制：EffectScope.EffectType=INCLUDE 时 EffectAssets 必须非空
     * @param EffectScope 生效范围
入参限制：EffectScope.EffectType=INCLUDE 时 EffectAssets 必须非空
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get 初始状态
枚举值：
ON：启用
OFF：禁用 
     * @return Status 初始状态
枚举值：
ON：启用
OFF：禁用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 初始状态
枚举值：
ON：启用
OFF：禁用
     * @param Status 初始状态
枚举值：
ON：启用
OFF：禁用
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 规则动作(RuleAction)
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警 
     * @return RuleAction 规则动作(RuleAction)
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
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
     * @param RuleAction 规则动作(RuleAction)
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 引用的系统规则 ID 列表
入参限制：最多 100 个；与 UserRuleContent 至少提供其一 
     * @return SystemRuleIDList 引用的系统规则 ID 列表
入参限制：最多 100 个；与 UserRuleContent 至少提供其一
     */
    public Long [] getSystemRuleIDList() {
        return this.SystemRuleIDList;
    }

    /**
     * Set 引用的系统规则 ID 列表
入参限制：最多 100 个；与 UserRuleContent 至少提供其一
     * @param SystemRuleIDList 引用的系统规则 ID 列表
入参限制：最多 100 个；与 UserRuleContent 至少提供其一
     */
    public void setSystemRuleIDList(Long [] SystemRuleIDList) {
        this.SystemRuleIDList = SystemRuleIDList;
    }

    /**
     * Get 用户自定义规则内容
入参限制：最多 100 条子规则；与 SystemRuleIDList 至少提供其一 
     * @return UserRuleContent 用户自定义规则内容
入参限制：最多 100 条子规则；与 SystemRuleIDList 至少提供其一
     */
    public TrafficSandboxACLRuleContentItem [] getUserRuleContent() {
        return this.UserRuleContent;
    }

    /**
     * Set 用户自定义规则内容
入参限制：最多 100 条子规则；与 SystemRuleIDList 至少提供其一
     * @param UserRuleContent 用户自定义规则内容
入参限制：最多 100 条子规则；与 SystemRuleIDList 至少提供其一
     */
    public void setUserRuleContent(TrafficSandboxACLRuleContentItem [] UserRuleContent) {
        this.UserRuleContent = UserRuleContent;
    }

    public CreateSandboxACLRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSandboxACLRuleRequest(CreateSandboxACLRuleRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.EffectScope != null) {
            this.EffectScope = new TrafficSandboxEffectScope(source.EffectScope);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamArraySimple(map, prefix + "SystemRuleIDList.", this.SystemRuleIDList);
        this.setParamArrayObj(map, prefix + "UserRuleContent.", this.UserRuleContent);

    }
}

