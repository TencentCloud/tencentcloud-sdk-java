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
    * <p>策略类型</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>白名单</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>规则</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

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
    * <p>风险id</p>
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>白名单的类型</p><p>枚举值：</p><ul><li>static_risk： 静态配置扫描的白名单规则</li><li>audit： 审计白名单规则</li><li>ueba： ueba相关的白名单规则</li></ul>
    */
    @SerializedName("WhitelistType")
    @Expose
    private String WhitelistType;

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
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>白名单</p> 
     * @return Name <p>白名单</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>白名单</p>
     * @param Name <p>白名单</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>规则</p> 
     * @return Rule <p>规则</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>规则</p>
     * @param Rule <p>规则</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
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
     * Get <p>风险id</p> 
     * @return RiskId <p>风险id</p>
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set <p>风险id</p>
     * @param RiskId <p>风险id</p>
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
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
     * Get <p>白名单的类型</p><p>枚举值：</p><ul><li>static_risk： 静态配置扫描的白名单规则</li><li>audit： 审计白名单规则</li><li>ueba： ueba相关的白名单规则</li></ul> 
     * @return WhitelistType <p>白名单的类型</p><p>枚举值：</p><ul><li>static_risk： 静态配置扫描的白名单规则</li><li>audit： 审计白名单规则</li><li>ueba： ueba相关的白名单规则</li></ul>
     */
    public String getWhitelistType() {
        return this.WhitelistType;
    }

    /**
     * Set <p>白名单的类型</p><p>枚举值：</p><ul><li>static_risk： 静态配置扫描的白名单规则</li><li>audit： 审计白名单规则</li><li>ueba： ueba相关的白名单规则</li></ul>
     * @param WhitelistType <p>白名单的类型</p><p>枚举值：</p><ul><li>static_risk： 静态配置扫描的白名单规则</li><li>audit： 审计白名单规则</li><li>ueba： ueba相关的白名单规则</li></ul>
     */
    public void setWhitelistType(String WhitelistType) {
        this.WhitelistType = WhitelistType;
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
        if (source.WhitelistType != null) {
            this.WhitelistType = new String(source.WhitelistType);
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
        this.setParamSimple(map, prefix + "WhitelistType", this.WhitelistType);

    }
}

