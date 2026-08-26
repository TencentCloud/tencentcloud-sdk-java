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

public class CreateSandboxDLPRuleRequest extends AbstractModel {

    /**
    * <p>规则名称<br>入参限制：长度 1-128</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>规则级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>规则动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * <p>生效范围</p>
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * <p>初始状态<br>枚举值：<br>ON：启用<br>OFF：禁用</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>引用的系统规则 ID 列表<br>入参限制：最多 1000 个；与 UserRuleContent 至少提供其一</p>
    */
    @SerializedName("SystemRuleIDList")
    @Expose
    private Long [] SystemRuleIDList;

    /**
    * <p>用户自定义规则内容<br>入参限制：最多 100 条子规则；与 UserRuleInfo 二选一传入即可，二者同时传入时以 UserRuleInfo 为准</p>
    */
    @SerializedName("UserRuleContent")
    @Expose
    private TrafficSandboxDLPRuleContentItem [] UserRuleContent;

    /**
    * <p>新增可选的结构化入参，支持 5 个检测维度（文件名称/文件大小/文件格式/外发域名/外发内容），各维度可选、至少命中一项。与 UserRuleContent 同时传入时优先生效</p>
    */
    @SerializedName("UserRuleInfo")
    @Expose
    private TrafficSandboxDLPUserRuleInfo UserRuleInfo;

    /**
     * Get <p>规则名称<br>入参限制：长度 1-128</p> 
     * @return RuleName <p>规则名称<br>入参限制：长度 1-128</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称<br>入参限制：长度 1-128</p>
     * @param RuleName <p>规则名称<br>入参限制：长度 1-128</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>规则级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p> 
     * @return Level <p>规则级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>规则级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     * @param Level <p>规则级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>规则动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p> 
     * @return RuleAction <p>规则动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>规则动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
     * @param RuleAction <p>规则动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p> 
     * @return BelongAssetType <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     * @param BelongAssetType <p>归属资产类型<br>枚举值：<br>HOST：主机<br>CONTAINER：容器</p>
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get <p>生效范围</p> 
     * @return EffectScope <p>生效范围</p>
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set <p>生效范围</p>
     * @param EffectScope <p>生效范围</p>
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get <p>初始状态<br>枚举值：<br>ON：启用<br>OFF：禁用</p> 
     * @return Status <p>初始状态<br>枚举值：<br>ON：启用<br>OFF：禁用</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>初始状态<br>枚举值：<br>ON：启用<br>OFF：禁用</p>
     * @param Status <p>初始状态<br>枚举值：<br>ON：启用<br>OFF：禁用</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>引用的系统规则 ID 列表<br>入参限制：最多 1000 个；与 UserRuleContent 至少提供其一</p> 
     * @return SystemRuleIDList <p>引用的系统规则 ID 列表<br>入参限制：最多 1000 个；与 UserRuleContent 至少提供其一</p>
     */
    public Long [] getSystemRuleIDList() {
        return this.SystemRuleIDList;
    }

    /**
     * Set <p>引用的系统规则 ID 列表<br>入参限制：最多 1000 个；与 UserRuleContent 至少提供其一</p>
     * @param SystemRuleIDList <p>引用的系统规则 ID 列表<br>入参限制：最多 1000 个；与 UserRuleContent 至少提供其一</p>
     */
    public void setSystemRuleIDList(Long [] SystemRuleIDList) {
        this.SystemRuleIDList = SystemRuleIDList;
    }

    /**
     * Get <p>用户自定义规则内容<br>入参限制：最多 100 条子规则；与 UserRuleInfo 二选一传入即可，二者同时传入时以 UserRuleInfo 为准</p> 
     * @return UserRuleContent <p>用户自定义规则内容<br>入参限制：最多 100 条子规则；与 UserRuleInfo 二选一传入即可，二者同时传入时以 UserRuleInfo 为准</p>
     */
    public TrafficSandboxDLPRuleContentItem [] getUserRuleContent() {
        return this.UserRuleContent;
    }

    /**
     * Set <p>用户自定义规则内容<br>入参限制：最多 100 条子规则；与 UserRuleInfo 二选一传入即可，二者同时传入时以 UserRuleInfo 为准</p>
     * @param UserRuleContent <p>用户自定义规则内容<br>入参限制：最多 100 条子规则；与 UserRuleInfo 二选一传入即可，二者同时传入时以 UserRuleInfo 为准</p>
     */
    public void setUserRuleContent(TrafficSandboxDLPRuleContentItem [] UserRuleContent) {
        this.UserRuleContent = UserRuleContent;
    }

    /**
     * Get <p>新增可选的结构化入参，支持 5 个检测维度（文件名称/文件大小/文件格式/外发域名/外发内容），各维度可选、至少命中一项。与 UserRuleContent 同时传入时优先生效</p> 
     * @return UserRuleInfo <p>新增可选的结构化入参，支持 5 个检测维度（文件名称/文件大小/文件格式/外发域名/外发内容），各维度可选、至少命中一项。与 UserRuleContent 同时传入时优先生效</p>
     */
    public TrafficSandboxDLPUserRuleInfo getUserRuleInfo() {
        return this.UserRuleInfo;
    }

    /**
     * Set <p>新增可选的结构化入参，支持 5 个检测维度（文件名称/文件大小/文件格式/外发域名/外发内容），各维度可选、至少命中一项。与 UserRuleContent 同时传入时优先生效</p>
     * @param UserRuleInfo <p>新增可选的结构化入参，支持 5 个检测维度（文件名称/文件大小/文件格式/外发域名/外发内容），各维度可选、至少命中一项。与 UserRuleContent 同时传入时优先生效</p>
     */
    public void setUserRuleInfo(TrafficSandboxDLPUserRuleInfo UserRuleInfo) {
        this.UserRuleInfo = UserRuleInfo;
    }

    public CreateSandboxDLPRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSandboxDLPRuleRequest(CreateSandboxDLPRuleRequest source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
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
        if (source.SystemRuleIDList != null) {
            this.SystemRuleIDList = new Long[source.SystemRuleIDList.length];
            for (int i = 0; i < source.SystemRuleIDList.length; i++) {
                this.SystemRuleIDList[i] = new Long(source.SystemRuleIDList[i]);
            }
        }
        if (source.UserRuleContent != null) {
            this.UserRuleContent = new TrafficSandboxDLPRuleContentItem[source.UserRuleContent.length];
            for (int i = 0; i < source.UserRuleContent.length; i++) {
                this.UserRuleContent[i] = new TrafficSandboxDLPRuleContentItem(source.UserRuleContent[i]);
            }
        }
        if (source.UserRuleInfo != null) {
            this.UserRuleInfo = new TrafficSandboxDLPUserRuleInfo(source.UserRuleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SystemRuleIDList.", this.SystemRuleIDList);
        this.setParamArrayObj(map, prefix + "UserRuleContent.", this.UserRuleContent);
        this.setParamObj(map, prefix + "UserRuleInfo.", this.UserRuleInfo);

    }
}

