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

public class DspmRiskStrategy extends AbstractModel {

    /**
    * <p>策略类型</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>策略名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略类型</p>
    */
    @SerializedName("StrategyCategory")
    @Expose
    private String StrategyCategory;

    /**
    * <p>是否启用。0-禁用 1-启用</p>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>风险等级。</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>策略规则</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>策略内容</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>命中次数</p>
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
    * <p>风险类型。risk-风险；alarm-告警。</p>
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * <p>资产所属账号app id</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>账号昵称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>资产所属账号uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>策略id</p>
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * <p>规则来源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleSource")
    @Expose
    private String RuleSource;

    /**
    * <p>支持的资产类型</p>
    */
    @SerializedName("AssetTypes")
    @Expose
    private String [] AssetTypes;

    /**
    * <p>风险描述</p>
    */
    @SerializedName("RiskDescription")
    @Expose
    private String RiskDescription;

    /**
     * Get <p>策略类型</p> 
     * @return StrategyType <p>策略类型</p>
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>策略类型</p>
     * @param StrategyType <p>策略类型</p>
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>策略名</p> 
     * @return Name <p>策略名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名</p>
     * @param Name <p>策略名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>策略类型</p> 
     * @return StrategyCategory <p>策略类型</p>
     */
    public String getStrategyCategory() {
        return this.StrategyCategory;
    }

    /**
     * Set <p>策略类型</p>
     * @param StrategyCategory <p>策略类型</p>
     */
    public void setStrategyCategory(String StrategyCategory) {
        this.StrategyCategory = StrategyCategory;
    }

    /**
     * Get <p>是否启用。0-禁用 1-启用</p> 
     * @return IsEnabled <p>是否启用。0-禁用 1-启用</p>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>是否启用。0-禁用 1-启用</p>
     * @param IsEnabled <p>是否启用。0-禁用 1-启用</p>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>风险等级。</p> 
     * @return RiskLevel <p>风险等级。</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级。</p>
     * @param RiskLevel <p>风险等级。</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>策略规则</p> 
     * @return Rule <p>策略规则</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>策略规则</p>
     * @param Rule <p>策略规则</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>策略内容</p> 
     * @return Description <p>策略内容</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略内容</p>
     * @param Description <p>策略内容</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>命中次数</p> 
     * @return HitCount <p>命中次数</p>
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set <p>命中次数</p>
     * @param HitCount <p>命中次数</p>
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    /**
     * Get <p>风险类型。risk-风险；alarm-告警。</p> 
     * @return RiskType <p>风险类型。risk-风险；alarm-告警。</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>风险类型。risk-风险；alarm-告警。</p>
     * @param RiskType <p>风险类型。risk-风险；alarm-告警。</p>
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>资产所属账号app id</p> 
     * @return AppId <p>资产所属账号app id</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>资产所属账号app id</p>
     * @param AppId <p>资产所属账号app id</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>账号昵称</p> 
     * @return NickName <p>账号昵称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>账号昵称</p>
     * @param NickName <p>账号昵称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>资产所属账号uin</p> 
     * @return Uin <p>资产所属账号uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>资产所属账号uin</p>
     * @param Uin <p>资产所属账号uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>策略id</p> 
     * @return StrategyId <p>策略id</p>
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set <p>策略id</p>
     * @param StrategyId <p>策略id</p>
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get <p>规则来源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleSource <p>规则来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleSource() {
        return this.RuleSource;
    }

    /**
     * Set <p>规则来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleSource <p>规则来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleSource(String RuleSource) {
        this.RuleSource = RuleSource;
    }

    /**
     * Get <p>支持的资产类型</p> 
     * @return AssetTypes <p>支持的资产类型</p>
     */
    public String [] getAssetTypes() {
        return this.AssetTypes;
    }

    /**
     * Set <p>支持的资产类型</p>
     * @param AssetTypes <p>支持的资产类型</p>
     */
    public void setAssetTypes(String [] AssetTypes) {
        this.AssetTypes = AssetTypes;
    }

    /**
     * Get <p>风险描述</p> 
     * @return RiskDescription <p>风险描述</p>
     */
    public String getRiskDescription() {
        return this.RiskDescription;
    }

    /**
     * Set <p>风险描述</p>
     * @param RiskDescription <p>风险描述</p>
     */
    public void setRiskDescription(String RiskDescription) {
        this.RiskDescription = RiskDescription;
    }

    public DspmRiskStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmRiskStrategy(DspmRiskStrategy source) {
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StrategyCategory != null) {
            this.StrategyCategory = new String(source.StrategyCategory);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.HitCount != null) {
            this.HitCount = new Long(source.HitCount);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.RuleSource != null) {
            this.RuleSource = new String(source.RuleSource);
        }
        if (source.AssetTypes != null) {
            this.AssetTypes = new String[source.AssetTypes.length];
            for (int i = 0; i < source.AssetTypes.length; i++) {
                this.AssetTypes[i] = new String(source.AssetTypes[i]);
            }
        }
        if (source.RiskDescription != null) {
            this.RiskDescription = new String(source.RiskDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StrategyCategory", this.StrategyCategory);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "HitCount", this.HitCount);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "RuleSource", this.RuleSource);
        this.setParamArraySimple(map, prefix + "AssetTypes.", this.AssetTypes);
        this.setParamSimple(map, prefix + "RiskDescription", this.RiskDescription);

    }
}

