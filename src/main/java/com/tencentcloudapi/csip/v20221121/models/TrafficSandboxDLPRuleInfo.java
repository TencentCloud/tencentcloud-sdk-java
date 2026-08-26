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

public class TrafficSandboxDLPRuleInfo extends AbstractModel {

    /**
    * 规则 ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 规则名称
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
    * 规则状态
枚举值：
ON：启用
OFF：禁用
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
    * 引用的系统规则内容快照
    */
    @SerializedName("SystemRuleContent")
    @Expose
    private TrafficSandboxDLPRuleContentItem [] SystemRuleContent;

    /**
    * 用户自定义规则内容
    */
    @SerializedName("UserRuleContent")
    @Expose
    private TrafficSandboxDLPRuleContentItem [] UserRuleContent;

    /**
    * 用户规则的结构化视图，按检测维度返回规则内容，便于前端按「文件名称/文件大小/文件格式/外发域名/外发内容」分区渲染。只读输出字段，不影响 Create/Modify 入参
    */
    @SerializedName("UserRuleInfo")
    @Expose
    private TrafficSandboxDLPUserRuleInfo UserRuleInfo;

    /**
    * 规则的生效范围
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * 未生效资产列表：策略目标生效资产中流量沙箱插件未已安装（TrafficPluginState.InstallStatus 不为 INSTALLED）的 AI Agent 资产，返回机器的 InstanceId / ContainerId 及 TrafficPluginState。无未生效资产时返回空数组
    */
    @SerializedName("InactiveAssets")
    @Expose
    private TrafficSandboxInactiveAsset [] InactiveAssets;

    /**
    * 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 规则动作
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

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
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
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
     * Get 规则状态
枚举值：
ON：启用
OFF：禁用 
     * @return Status 规则状态
枚举值：
ON：启用
OFF：禁用
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态
枚举值：
ON：启用
OFF：禁用
     * @param Status 规则状态
枚举值：
ON：启用
OFF：禁用
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get 引用的系统规则内容快照 
     * @return SystemRuleContent 引用的系统规则内容快照
     */
    public TrafficSandboxDLPRuleContentItem [] getSystemRuleContent() {
        return this.SystemRuleContent;
    }

    /**
     * Set 引用的系统规则内容快照
     * @param SystemRuleContent 引用的系统规则内容快照
     */
    public void setSystemRuleContent(TrafficSandboxDLPRuleContentItem [] SystemRuleContent) {
        this.SystemRuleContent = SystemRuleContent;
    }

    /**
     * Get 用户自定义规则内容 
     * @return UserRuleContent 用户自定义规则内容
     */
    public TrafficSandboxDLPRuleContentItem [] getUserRuleContent() {
        return this.UserRuleContent;
    }

    /**
     * Set 用户自定义规则内容
     * @param UserRuleContent 用户自定义规则内容
     */
    public void setUserRuleContent(TrafficSandboxDLPRuleContentItem [] UserRuleContent) {
        this.UserRuleContent = UserRuleContent;
    }

    /**
     * Get 用户规则的结构化视图，按检测维度返回规则内容，便于前端按「文件名称/文件大小/文件格式/外发域名/外发内容」分区渲染。只读输出字段，不影响 Create/Modify 入参 
     * @return UserRuleInfo 用户规则的结构化视图，按检测维度返回规则内容，便于前端按「文件名称/文件大小/文件格式/外发域名/外发内容」分区渲染。只读输出字段，不影响 Create/Modify 入参
     */
    public TrafficSandboxDLPUserRuleInfo getUserRuleInfo() {
        return this.UserRuleInfo;
    }

    /**
     * Set 用户规则的结构化视图，按检测维度返回规则内容，便于前端按「文件名称/文件大小/文件格式/外发域名/外发内容」分区渲染。只读输出字段，不影响 Create/Modify 入参
     * @param UserRuleInfo 用户规则的结构化视图，按检测维度返回规则内容，便于前端按「文件名称/文件大小/文件格式/外发域名/外发内容」分区渲染。只读输出字段，不影响 Create/Modify 入参
     */
    public void setUserRuleInfo(TrafficSandboxDLPUserRuleInfo UserRuleInfo) {
        this.UserRuleInfo = UserRuleInfo;
    }

    /**
     * Get 规则的生效范围 
     * @return EffectScope 规则的生效范围
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set 规则的生效范围
     * @param EffectScope 规则的生效范围
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get 未生效资产列表：策略目标生效资产中流量沙箱插件未已安装（TrafficPluginState.InstallStatus 不为 INSTALLED）的 AI Agent 资产，返回机器的 InstanceId / ContainerId 及 TrafficPluginState。无未生效资产时返回空数组 
     * @return InactiveAssets 未生效资产列表：策略目标生效资产中流量沙箱插件未已安装（TrafficPluginState.InstallStatus 不为 INSTALLED）的 AI Agent 资产，返回机器的 InstanceId / ContainerId 及 TrafficPluginState。无未生效资产时返回空数组
     */
    public TrafficSandboxInactiveAsset [] getInactiveAssets() {
        return this.InactiveAssets;
    }

    /**
     * Set 未生效资产列表：策略目标生效资产中流量沙箱插件未已安装（TrafficPluginState.InstallStatus 不为 INSTALLED）的 AI Agent 资产，返回机器的 InstanceId / ContainerId 及 TrafficPluginState。无未生效资产时返回空数组
     * @param InactiveAssets 未生效资产列表：策略目标生效资产中流量沙箱插件未已安装（TrafficPluginState.InstallStatus 不为 INSTALLED）的 AI Agent 资产，返回机器的 InstanceId / ContainerId 及 TrafficPluginState。无未生效资产时返回空数组
     */
    public void setInactiveAssets(TrafficSandboxInactiveAsset [] InactiveAssets) {
        this.InactiveAssets = InactiveAssets;
    }

    /**
     * Get 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return InsertTime 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param InsertTime 创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return UpdateTime 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param UpdateTime 更新时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 规则动作
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警 
     * @return RuleAction 规则动作
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 规则动作
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
     * @param RuleAction 规则动作
枚举值：
PASS：加白
BLOCK：拦截并告警
MONITOR：告警
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    public TrafficSandboxDLPRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxDLPRuleInfo(TrafficSandboxDLPRuleInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.SystemRuleContent != null) {
            this.SystemRuleContent = new TrafficSandboxDLPRuleContentItem[source.SystemRuleContent.length];
            for (int i = 0; i < source.SystemRuleContent.length; i++) {
                this.SystemRuleContent[i] = new TrafficSandboxDLPRuleContentItem(source.SystemRuleContent[i]);
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
        if (source.InactiveAssets != null) {
            this.InactiveAssets = new TrafficSandboxInactiveAsset[source.InactiveAssets.length];
            for (int i = 0; i < source.InactiveAssets.length; i++) {
                this.InactiveAssets[i] = new TrafficSandboxInactiveAsset(source.InactiveAssets[i]);
            }
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamArrayObj(map, prefix + "SystemRuleContent.", this.SystemRuleContent);
        this.setParamArrayObj(map, prefix + "UserRuleContent.", this.UserRuleContent);
        this.setParamObj(map, prefix + "UserRuleInfo.", this.UserRuleInfo);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamArrayObj(map, prefix + "InactiveAssets.", this.InactiveAssets);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);

    }
}

