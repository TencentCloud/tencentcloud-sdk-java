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
    * <p>白名单策略id</p>
    */
    @SerializedName("WhitelistStrategyId")
    @Expose
    private String WhitelistStrategyId;

    /**
    * <p>策略类型</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>白名单策略名</p>
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
    * <p>修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>资产id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>账号</p>
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * <p>主机</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>策略规则内容描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>白名单类型。risk-风险白名单；alarm-告警白名单。</p>
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
    * <p>白名单类型</p>
    */
    @SerializedName("WhitelistType")
    @Expose
    private String WhitelistType;

    /**
     * Get <p>白名单策略id</p> 
     * @return WhitelistStrategyId <p>白名单策略id</p>
     */
    public String getWhitelistStrategyId() {
        return this.WhitelistStrategyId;
    }

    /**
     * Set <p>白名单策略id</p>
     * @param WhitelistStrategyId <p>白名单策略id</p>
     */
    public void setWhitelistStrategyId(String WhitelistStrategyId) {
        this.WhitelistStrategyId = WhitelistStrategyId;
    }

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
     * Get <p>白名单策略名</p> 
     * @return Name <p>白名单策略名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>白名单策略名</p>
     * @param Name <p>白名单策略名</p>
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
     * Get <p>修改时间</p> 
     * @return ModifyTime <p>修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModifyTime <p>修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>资产id</p> 
     * @return AssetId <p>资产id</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>资产id</p>
     * @param AssetId <p>资产id</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>账号</p> 
     * @return Account <p>账号</p>
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set <p>账号</p>
     * @param Account <p>账号</p>
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get <p>主机</p> 
     * @return Host <p>主机</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>主机</p>
     * @param Host <p>主机</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>策略规则内容描述</p> 
     * @return Description <p>策略规则内容描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略规则内容描述</p>
     * @param Description <p>策略规则内容描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>白名单类型。risk-风险白名单；alarm-告警白名单。</p> 
     * @return RiskType <p>白名单类型。risk-风险白名单；alarm-告警白名单。</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>白名单类型。risk-风险白名单；alarm-告警白名单。</p>
     * @param RiskType <p>白名单类型。risk-风险白名单；alarm-告警白名单。</p>
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
     * Get <p>白名单类型</p> 
     * @return WhitelistType <p>白名单类型</p>
     */
    public String getWhitelistType() {
        return this.WhitelistType;
    }

    /**
     * Set <p>白名单类型</p>
     * @param WhitelistType <p>白名单类型</p>
     */
    public void setWhitelistType(String WhitelistType) {
        this.WhitelistType = WhitelistType;
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
        if (source.WhitelistType != null) {
            this.WhitelistType = new String(source.WhitelistType);
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
        this.setParamSimple(map, prefix + "WhitelistType", this.WhitelistType);

    }
}

