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

public class RevertDspmAssetAccountRequest extends AbstractModel {

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
    * 主机地址
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 是否回退权限
    */
    @SerializedName("PrivilegeFlag")
    @Expose
    private Long PrivilegeFlag;

    /**
    * 是否回退密码
    */
    @SerializedName("PasswordFlag")
    @Expose
    private Long PasswordFlag;

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
     * Get 是否回退权限 
     * @return PrivilegeFlag 是否回退权限
     */
    public Long getPrivilegeFlag() {
        return this.PrivilegeFlag;
    }

    /**
     * Set 是否回退权限
     * @param PrivilegeFlag 是否回退权限
     */
    public void setPrivilegeFlag(Long PrivilegeFlag) {
        this.PrivilegeFlag = PrivilegeFlag;
    }

    /**
     * Get 是否回退密码 
     * @return PasswordFlag 是否回退密码
     */
    public Long getPasswordFlag() {
        return this.PasswordFlag;
    }

    /**
     * Set 是否回退密码
     * @param PasswordFlag 是否回退密码
     */
    public void setPasswordFlag(Long PasswordFlag) {
        this.PasswordFlag = PasswordFlag;
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

    public RevertDspmAssetAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevertDspmAssetAccountRequest(RevertDspmAssetAccountRequest source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.PrivilegeFlag != null) {
            this.PrivilegeFlag = new Long(source.PrivilegeFlag);
        }
        if (source.PasswordFlag != null) {
            this.PasswordFlag = new Long(source.PasswordFlag);
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
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "PrivilegeFlag", this.PrivilegeFlag);
        this.setParamSimple(map, prefix + "PasswordFlag", this.PasswordFlag);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);

    }
}

