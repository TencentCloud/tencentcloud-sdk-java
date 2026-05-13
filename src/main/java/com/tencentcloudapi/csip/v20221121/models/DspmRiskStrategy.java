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
    * 策略类型
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 策略名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略类型
    */
    @SerializedName("StrategyCategory")
    @Expose
    private String StrategyCategory;

    /**
    * 是否启用。0-禁用 1-启用
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * 风险等级。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 策略规则
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 策略内容
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 命中次数
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
    * 风险类型。risk-风险；alarm-告警。
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 资产所属账号app id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 账号昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 资产所属账号uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 策略id
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
     * Get 策略类型 
     * @return StrategyType 策略类型
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 策略类型
     * @param StrategyType 策略类型
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 策略名 
     * @return Name 策略名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名
     * @param Name 策略名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 策略类型 
     * @return StrategyCategory 策略类型
     */
    public String getStrategyCategory() {
        return this.StrategyCategory;
    }

    /**
     * Set 策略类型
     * @param StrategyCategory 策略类型
     */
    public void setStrategyCategory(String StrategyCategory) {
        this.StrategyCategory = StrategyCategory;
    }

    /**
     * Get 是否启用。0-禁用 1-启用 
     * @return IsEnabled 是否启用。0-禁用 1-启用
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 是否启用。0-禁用 1-启用
     * @param IsEnabled 是否启用。0-禁用 1-启用
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 风险等级。 
     * @return RiskLevel 风险等级。
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级。
     * @param RiskLevel 风险等级。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 策略规则 
     * @return Rule 策略规则
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 策略规则
     * @param Rule 策略规则
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 策略内容 
     * @return Description 策略内容
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略内容
     * @param Description 策略内容
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 命中次数 
     * @return HitCount 命中次数
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set 命中次数
     * @param HitCount 命中次数
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    /**
     * Get 风险类型。risk-风险；alarm-告警。 
     * @return RiskType 风险类型。risk-风险；alarm-告警。
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型。risk-风险；alarm-告警。
     * @param RiskType 风险类型。risk-风险；alarm-告警。
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 资产所属账号app id 
     * @return AppId 资产所属账号app id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 资产所属账号app id
     * @param AppId 资产所属账号app id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 账号昵称 
     * @return NickName 账号昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 账号昵称
     * @param NickName 账号昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 资产所属账号uin 
     * @return Uin 资产所属账号uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 资产所属账号uin
     * @param Uin 资产所属账号uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 策略id 
     * @return StrategyId 策略id
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略id
     * @param StrategyId 策略id
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
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

    }
}

