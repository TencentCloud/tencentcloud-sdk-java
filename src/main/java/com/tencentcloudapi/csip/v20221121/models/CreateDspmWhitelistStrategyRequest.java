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

public class CreateDspmWhitelistStrategyRequest extends AbstractModel {

    /**
    * 策略类型
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 白名单
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

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
    * 风险id
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

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
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 白名单 
     * @return Name 白名单
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 白名单
     * @param Name 白名单
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则 
     * @return Rule 规则
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 规则
     * @param Rule 规则
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
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
     * Get 风险id 
     * @return RiskId 风险id
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险id
     * @param RiskId 风险id
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
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

    public CreateDspmWhitelistStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmWhitelistStrategyRequest(CreateDspmWhitelistStrategyRequest source) {
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
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
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

