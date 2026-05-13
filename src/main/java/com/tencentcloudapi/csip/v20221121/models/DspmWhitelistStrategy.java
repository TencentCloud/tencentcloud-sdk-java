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

public class DspmWhitelistStrategy extends AbstractModel {

    /**
    * 白名单策略id
    */
    @SerializedName("WhitelistStrategyId")
    @Expose
    private String WhitelistStrategyId;

    /**
    * 策略类型
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 白名单策略名
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
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 资产id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 主机
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 策略规则内容描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 白名单类型。risk-风险白名单；alarm-告警白名单。
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
     * Get 白名单策略id 
     * @return WhitelistStrategyId 白名单策略id
     */
    public String getWhitelistStrategyId() {
        return this.WhitelistStrategyId;
    }

    /**
     * Set 白名单策略id
     * @param WhitelistStrategyId 白名单策略id
     */
    public void setWhitelistStrategyId(String WhitelistStrategyId) {
        this.WhitelistStrategyId = WhitelistStrategyId;
    }

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
     * Get 白名单策略名 
     * @return Name 白名单策略名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 白名单策略名
     * @param Name 白名单策略名
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
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 资产id 
     * @return AssetId 资产id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产id
     * @param AssetId 资产id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 账号 
     * @return Account 账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号
     * @param Account 账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 主机 
     * @return Host 主机
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机
     * @param Host 主机
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 策略规则内容描述 
     * @return Description 策略规则内容描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略规则内容描述
     * @param Description 策略规则内容描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 白名单类型。risk-风险白名单；alarm-告警白名单。 
     * @return RiskType 白名单类型。risk-风险白名单；alarm-告警白名单。
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 白名单类型。risk-风险白名单；alarm-告警白名单。
     * @param RiskType 白名单类型。risk-风险白名单；alarm-告警白名单。
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

    public DspmWhitelistStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmWhitelistStrategy(DspmWhitelistStrategy source) {
        if (source.WhitelistStrategyId != null) {
            this.WhitelistStrategyId = new String(source.WhitelistStrategyId);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StrategyCategory != null) {
            this.StrategyCategory = new String(source.StrategyCategory);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhitelistStrategyId", this.WhitelistStrategyId);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StrategyCategory", this.StrategyCategory);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

