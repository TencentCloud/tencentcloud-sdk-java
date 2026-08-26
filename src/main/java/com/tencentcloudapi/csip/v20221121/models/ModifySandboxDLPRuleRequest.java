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

public class ModifySandboxDLPRuleRequest extends AbstractModel {

    /**
    * <p>规则 ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>规则名称<br>入参限制：长度 1-128<br>默认值：不传则不修改</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>规则级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重<br>默认值：不传则不修改</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>规则动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警<br>默认值：不传则不修改</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>引用的系统规则 ID 列表<br>入参限制：最多 1000 个；传入时整体覆盖原有集合；不传表示不修改</p>
    */
    @SerializedName("SystemRuleIDList")
    @Expose
    private Long [] SystemRuleIDList;

    /**
    * <p>用户自定义规则内容<br>入参限制：传入时整体覆盖原有集合（允许传空数组以清空）；不传表示不修改</p>
    */
    @SerializedName("UserRuleContent")
    @Expose
    private TrafficSandboxDLPRuleContentItem [] UserRuleContent;

    /**
    * <p>结构化入参，支持 5 个检测维度（文件名称/文件大小/文件格式/外发域名/外发内容），各维度可选、至少命中一项。传入时整体覆盖原有集合；不传表示不修改。与 UserRuleContent 同时传入时优先生效</p>
    */
    @SerializedName("UserRuleInfo")
    @Expose
    private TrafficSandboxDLPUserRuleInfo UserRuleInfo;

    /**
    * <p>生效范围<br>默认值：不传则不修改</p>
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * <p>目标状态<br>枚举值：<br>ON：启用<br>OFF：禁用<br>默认值：不传则不修改</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>规则 ID</p> 
     * @return ID <p>规则 ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>规则 ID</p>
     * @param ID <p>规则 ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>规则名称<br>入参限制：长度 1-128<br>默认值：不传则不修改</p> 
     * @return RuleName <p>规则名称<br>入参限制：长度 1-128<br>默认值：不传则不修改</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称<br>入参限制：长度 1-128<br>默认值：不传则不修改</p>
     * @param RuleName <p>规则名称<br>入参限制：长度 1-128<br>默认值：不传则不修改</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>规则级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重<br>默认值：不传则不修改</p> 
     * @return Level <p>规则级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重<br>默认值：不传则不修改</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>规则级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重<br>默认值：不传则不修改</p>
     * @param Level <p>规则级别<br>枚举值：<br>INFO：提示<br>LOW：低危<br>MEDIUM：中危<br>HIGH：高危<br>CRITICAL：严重<br>默认值：不传则不修改</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>规则动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警<br>默认值：不传则不修改</p> 
     * @return RuleAction <p>规则动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警<br>默认值：不传则不修改</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>规则动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警<br>默认值：不传则不修改</p>
     * @param RuleAction <p>规则动作<br>枚举值：<br>PASS：加白<br>BLOCK：拦截并告警<br>MONITOR：告警<br>默认值：不传则不修改</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>引用的系统规则 ID 列表<br>入参限制：最多 1000 个；传入时整体覆盖原有集合；不传表示不修改</p> 
     * @return SystemRuleIDList <p>引用的系统规则 ID 列表<br>入参限制：最多 1000 个；传入时整体覆盖原有集合；不传表示不修改</p>
     */
    public Long [] getSystemRuleIDList() {
        return this.SystemRuleIDList;
    }

    /**
     * Set <p>引用的系统规则 ID 列表<br>入参限制：最多 1000 个；传入时整体覆盖原有集合；不传表示不修改</p>
     * @param SystemRuleIDList <p>引用的系统规则 ID 列表<br>入参限制：最多 1000 个；传入时整体覆盖原有集合；不传表示不修改</p>
     */
    public void setSystemRuleIDList(Long [] SystemRuleIDList) {
        this.SystemRuleIDList = SystemRuleIDList;
    }

    /**
     * Get <p>用户自定义规则内容<br>入参限制：传入时整体覆盖原有集合（允许传空数组以清空）；不传表示不修改</p> 
     * @return UserRuleContent <p>用户自定义规则内容<br>入参限制：传入时整体覆盖原有集合（允许传空数组以清空）；不传表示不修改</p>
     */
    public TrafficSandboxDLPRuleContentItem [] getUserRuleContent() {
        return this.UserRuleContent;
    }

    /**
     * Set <p>用户自定义规则内容<br>入参限制：传入时整体覆盖原有集合（允许传空数组以清空）；不传表示不修改</p>
     * @param UserRuleContent <p>用户自定义规则内容<br>入参限制：传入时整体覆盖原有集合（允许传空数组以清空）；不传表示不修改</p>
     */
    public void setUserRuleContent(TrafficSandboxDLPRuleContentItem [] UserRuleContent) {
        this.UserRuleContent = UserRuleContent;
    }

    /**
     * Get <p>结构化入参，支持 5 个检测维度（文件名称/文件大小/文件格式/外发域名/外发内容），各维度可选、至少命中一项。传入时整体覆盖原有集合；不传表示不修改。与 UserRuleContent 同时传入时优先生效</p> 
     * @return UserRuleInfo <p>结构化入参，支持 5 个检测维度（文件名称/文件大小/文件格式/外发域名/外发内容），各维度可选、至少命中一项。传入时整体覆盖原有集合；不传表示不修改。与 UserRuleContent 同时传入时优先生效</p>
     */
    public TrafficSandboxDLPUserRuleInfo getUserRuleInfo() {
        return this.UserRuleInfo;
    }

    /**
     * Set <p>结构化入参，支持 5 个检测维度（文件名称/文件大小/文件格式/外发域名/外发内容），各维度可选、至少命中一项。传入时整体覆盖原有集合；不传表示不修改。与 UserRuleContent 同时传入时优先生效</p>
     * @param UserRuleInfo <p>结构化入参，支持 5 个检测维度（文件名称/文件大小/文件格式/外发域名/外发内容），各维度可选、至少命中一项。传入时整体覆盖原有集合；不传表示不修改。与 UserRuleContent 同时传入时优先生效</p>
     */
    public void setUserRuleInfo(TrafficSandboxDLPUserRuleInfo UserRuleInfo) {
        this.UserRuleInfo = UserRuleInfo;
    }

    /**
     * Get <p>生效范围<br>默认值：不传则不修改</p> 
     * @return EffectScope <p>生效范围<br>默认值：不传则不修改</p>
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set <p>生效范围<br>默认值：不传则不修改</p>
     * @param EffectScope <p>生效范围<br>默认值：不传则不修改</p>
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get <p>目标状态<br>枚举值：<br>ON：启用<br>OFF：禁用<br>默认值：不传则不修改</p> 
     * @return Status <p>目标状态<br>枚举值：<br>ON：启用<br>OFF：禁用<br>默认值：不传则不修改</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>目标状态<br>枚举值：<br>ON：启用<br>OFF：禁用<br>默认值：不传则不修改</p>
     * @param Status <p>目标状态<br>枚举值：<br>ON：启用<br>OFF：禁用<br>默认值：不传则不修改</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifySandboxDLPRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySandboxDLPRuleRequest(ModifySandboxDLPRuleRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
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
            this.UserRuleContent = new TrafficSandboxDLPRuleContentItem[source.UserRuleContent.length];
            for (int i = 0; i < source.UserRuleContent.length; i++) {
                this.UserRuleContent[i] = new TrafficSandboxDLPRuleContentItem(source.UserRuleContent[i]);
            }
        }
        if (source.UserRuleInfo != null) {
            this.UserRuleInfo = new TrafficSandboxDLPUserRuleInfo(source.UserRuleInfo);
        }
        if (source.EffectScope != null) {
            this.EffectScope = new TrafficSandboxEffectScope(source.EffectScope);
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
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamArraySimple(map, prefix + "SystemRuleIDList.", this.SystemRuleIDList);
        this.setParamArrayObj(map, prefix + "UserRuleContent.", this.UserRuleContent);
        this.setParamObj(map, prefix + "UserRuleInfo.", this.UserRuleInfo);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

