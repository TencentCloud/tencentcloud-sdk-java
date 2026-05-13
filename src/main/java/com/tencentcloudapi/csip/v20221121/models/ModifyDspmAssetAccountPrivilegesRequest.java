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

public class ModifyDspmAssetAccountPrivilegesRequest extends AbstractModel {

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
    * 权限信息
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * 主机地址
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
     * Get 权限信息 
     * @return Privilege 权限信息
     */
    public DspmDbAccountPrivilege getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 权限信息
     * @param Privilege 权限信息
     */
    public void setPrivilege(DspmDbAccountPrivilege Privilege) {
        this.Privilege = Privilege;
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

    public ModifyDspmAssetAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAssetAccountPrivilegesRequest(ModifyDspmAssetAccountPrivilegesRequest source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Privilege != null) {
            this.Privilege = new DspmDbAccountPrivilege(source.Privilege);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
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
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);

    }
}

