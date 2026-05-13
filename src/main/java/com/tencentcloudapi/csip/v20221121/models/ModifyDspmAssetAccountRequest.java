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

public class ModifyDspmAssetAccountRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 账号名
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 主机地址
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 账号类型
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 风险id
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
     * Get 实例id 
     * @return AssetId 实例id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 实例id
     * @param AssetId 实例id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 账号名 
     * @return Account 账号名
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 账号名
     * @param Account 账号名
     */
    public void setAccount(String Account) {
        this.Account = Account;
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
     * Get 主机地址 
     * @return Host 主机地址
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机地址
     * @param Host 主机地址
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 账号类型 
     * @return AccountType 账号类型
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账号类型
     * @param AccountType 账号类型
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
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

    public ModifyDspmAssetAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAssetAccountRequest(ModifyDspmAssetAccountRequest source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);

    }
}

