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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenPlanApiKeyListItem extends AbstractModel {

    /**
    * <p>API Key ID。</p>
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * <p>API Key 密钥值（脱敏）。</p>
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * <p>API Key 名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>所属套餐 ID。</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>账号APP ID。</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>主账号 UIN。最大 128 字符。</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>API Key 可用模型列表（JSON 数组字符串）。</p>
    */
    @SerializedName("AllowedModels")
    @Expose
    private String AllowedModels;

    /**
    * <p>API Key 是否可用。取值：enable（启用）、disable（停用）。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>API Key 停用原因。取值：NORMAL（正常，默认值），QUOTA_EXHAUSTED（API Key额度包耗尽），ABNORMAL（异常，需人工介入）</p>
    */
    @SerializedName("StopReason")
    @Expose
    private String StopReason;

    /**
    * <p>用户侧开关。取值：enable（启用）、disable（停用）。</p>
    */
    @SerializedName("UseStatus")
    @Expose
    private String UseStatus;

    /**
    * <p>密钥版本号。</p>
    */
    @SerializedName("KeyVersion")
    @Expose
    private Long KeyVersion;

    /**
    * <p>最近一次重置时间。（ISO 8601）</p>
    */
    @SerializedName("LastRotatedAt")
    @Expose
    private String LastRotatedAt;

    /**
    * <p>创建人，如果是子账号创建，则该值为子账号UIN。</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>创建时间。</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>更新时间。</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>API Key 额度用量信息</p>
    */
    @SerializedName("Balance")
    @Expose
    private SubPackageBalance Balance;

    /**
    * <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。</p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>IP 白名单列表。支持 IPv4 单地址与 IPv4 CIDR 格式，空数组表示不限制。</p>
    */
    @SerializedName("IpWhitelist")
    @Expose
    private String [] IpWhitelist;

    /**
    * <p>是否开启超额按量计费。开启后，若 APIKey 用量达到总额度上限，并且使用的模型已开启按量计费，将自动切换至按量计费模式；未开启时用量达上限后调用报错。</p>
    */
    @SerializedName("OverageEnabled")
    @Expose
    private Boolean OverageEnabled;

    /**
     * Get <p>API Key ID。</p> 
     * @return ApiKeyId <p>API Key ID。</p>
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set <p>API Key ID。</p>
     * @param ApiKeyId <p>API Key ID。</p>
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get <p>API Key 密钥值（脱敏）。</p> 
     * @return ApiKey <p>API Key 密钥值（脱敏）。</p>
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set <p>API Key 密钥值（脱敏）。</p>
     * @param ApiKey <p>API Key 密钥值（脱敏）。</p>
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get <p>API Key 名称。</p> 
     * @return Name <p>API Key 名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>API Key 名称。</p>
     * @param Name <p>API Key 名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>所属套餐 ID。</p> 
     * @return TeamId <p>所属套餐 ID。</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>所属套餐 ID。</p>
     * @param TeamId <p>所属套餐 ID。</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get <p>账号APP ID。</p> 
     * @return AppId <p>账号APP ID。</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>账号APP ID。</p>
     * @param AppId <p>账号APP ID。</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>主账号 UIN。最大 128 字符。</p> 
     * @return Uin <p>主账号 UIN。最大 128 字符。</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号 UIN。最大 128 字符。</p>
     * @param Uin <p>主账号 UIN。最大 128 字符。</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>API Key 可用模型列表（JSON 数组字符串）。</p> 
     * @return AllowedModels <p>API Key 可用模型列表（JSON 数组字符串）。</p>
     */
    public String getAllowedModels() {
        return this.AllowedModels;
    }

    /**
     * Set <p>API Key 可用模型列表（JSON 数组字符串）。</p>
     * @param AllowedModels <p>API Key 可用模型列表（JSON 数组字符串）。</p>
     */
    public void setAllowedModels(String AllowedModels) {
        this.AllowedModels = AllowedModels;
    }

    /**
     * Get <p>API Key 是否可用。取值：enable（启用）、disable（停用）。</p> 
     * @return Status <p>API Key 是否可用。取值：enable（启用）、disable（停用）。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>API Key 是否可用。取值：enable（启用）、disable（停用）。</p>
     * @param Status <p>API Key 是否可用。取值：enable（启用）、disable（停用）。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>API Key 停用原因。取值：NORMAL（正常，默认值），QUOTA_EXHAUSTED（API Key额度包耗尽），ABNORMAL（异常，需人工介入）</p> 
     * @return StopReason <p>API Key 停用原因。取值：NORMAL（正常，默认值），QUOTA_EXHAUSTED（API Key额度包耗尽），ABNORMAL（异常，需人工介入）</p>
     */
    public String getStopReason() {
        return this.StopReason;
    }

    /**
     * Set <p>API Key 停用原因。取值：NORMAL（正常，默认值），QUOTA_EXHAUSTED（API Key额度包耗尽），ABNORMAL（异常，需人工介入）</p>
     * @param StopReason <p>API Key 停用原因。取值：NORMAL（正常，默认值），QUOTA_EXHAUSTED（API Key额度包耗尽），ABNORMAL（异常，需人工介入）</p>
     */
    public void setStopReason(String StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get <p>用户侧开关。取值：enable（启用）、disable（停用）。</p> 
     * @return UseStatus <p>用户侧开关。取值：enable（启用）、disable（停用）。</p>
     */
    public String getUseStatus() {
        return this.UseStatus;
    }

    /**
     * Set <p>用户侧开关。取值：enable（启用）、disable（停用）。</p>
     * @param UseStatus <p>用户侧开关。取值：enable（启用）、disable（停用）。</p>
     */
    public void setUseStatus(String UseStatus) {
        this.UseStatus = UseStatus;
    }

    /**
     * Get <p>密钥版本号。</p> 
     * @return KeyVersion <p>密钥版本号。</p>
     */
    public Long getKeyVersion() {
        return this.KeyVersion;
    }

    /**
     * Set <p>密钥版本号。</p>
     * @param KeyVersion <p>密钥版本号。</p>
     */
    public void setKeyVersion(Long KeyVersion) {
        this.KeyVersion = KeyVersion;
    }

    /**
     * Get <p>最近一次重置时间。（ISO 8601）</p> 
     * @return LastRotatedAt <p>最近一次重置时间。（ISO 8601）</p>
     */
    public String getLastRotatedAt() {
        return this.LastRotatedAt;
    }

    /**
     * Set <p>最近一次重置时间。（ISO 8601）</p>
     * @param LastRotatedAt <p>最近一次重置时间。（ISO 8601）</p>
     */
    public void setLastRotatedAt(String LastRotatedAt) {
        this.LastRotatedAt = LastRotatedAt;
    }

    /**
     * Get <p>创建人，如果是子账号创建，则该值为子账号UIN。</p> 
     * @return Creator <p>创建人，如果是子账号创建，则该值为子账号UIN。</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建人，如果是子账号创建，则该值为子账号UIN。</p>
     * @param Creator <p>创建人，如果是子账号创建，则该值为子账号UIN。</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>创建时间。</p> 
     * @return CreatedAt <p>创建时间。</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间。</p>
     * @param CreatedAt <p>创建时间。</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>更新时间。</p> 
     * @return UpdatedAt <p>更新时间。</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>更新时间。</p>
     * @param UpdatedAt <p>更新时间。</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>API Key 额度用量信息</p> 
     * @return Balance <p>API Key 额度用量信息</p>
     */
    public SubPackageBalance getBalance() {
        return this.Balance;
    }

    /**
     * Set <p>API Key 额度用量信息</p>
     * @param Balance <p>API Key 额度用量信息</p>
     */
    public void setBalance(SubPackageBalance Balance) {
        this.Balance = Balance;
    }

    /**
     * Get <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。</p> 
     * @return ProductType <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。</p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。</p>
     * @param ProductType <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。</p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>IP 白名单列表。支持 IPv4 单地址与 IPv4 CIDR 格式，空数组表示不限制。</p> 
     * @return IpWhitelist <p>IP 白名单列表。支持 IPv4 单地址与 IPv4 CIDR 格式，空数组表示不限制。</p>
     */
    public String [] getIpWhitelist() {
        return this.IpWhitelist;
    }

    /**
     * Set <p>IP 白名单列表。支持 IPv4 单地址与 IPv4 CIDR 格式，空数组表示不限制。</p>
     * @param IpWhitelist <p>IP 白名单列表。支持 IPv4 单地址与 IPv4 CIDR 格式，空数组表示不限制。</p>
     */
    public void setIpWhitelist(String [] IpWhitelist) {
        this.IpWhitelist = IpWhitelist;
    }

    /**
     * Get <p>是否开启超额按量计费。开启后，若 APIKey 用量达到总额度上限，并且使用的模型已开启按量计费，将自动切换至按量计费模式；未开启时用量达上限后调用报错。</p> 
     * @return OverageEnabled <p>是否开启超额按量计费。开启后，若 APIKey 用量达到总额度上限，并且使用的模型已开启按量计费，将自动切换至按量计费模式；未开启时用量达上限后调用报错。</p>
     */
    public Boolean getOverageEnabled() {
        return this.OverageEnabled;
    }

    /**
     * Set <p>是否开启超额按量计费。开启后，若 APIKey 用量达到总额度上限，并且使用的模型已开启按量计费，将自动切换至按量计费模式；未开启时用量达上限后调用报错。</p>
     * @param OverageEnabled <p>是否开启超额按量计费。开启后，若 APIKey 用量达到总额度上限，并且使用的模型已开启按量计费，将自动切换至按量计费模式；未开启时用量达上限后调用报错。</p>
     */
    public void setOverageEnabled(Boolean OverageEnabled) {
        this.OverageEnabled = OverageEnabled;
    }

    public TokenPlanApiKeyListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenPlanApiKeyListItem(TokenPlanApiKeyListItem source) {
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AllowedModels != null) {
            this.AllowedModels = new String(source.AllowedModels);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StopReason != null) {
            this.StopReason = new String(source.StopReason);
        }
        if (source.UseStatus != null) {
            this.UseStatus = new String(source.UseStatus);
        }
        if (source.KeyVersion != null) {
            this.KeyVersion = new Long(source.KeyVersion);
        }
        if (source.LastRotatedAt != null) {
            this.LastRotatedAt = new String(source.LastRotatedAt);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Balance != null) {
            this.Balance = new SubPackageBalance(source.Balance);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.IpWhitelist != null) {
            this.IpWhitelist = new String[source.IpWhitelist.length];
            for (int i = 0; i < source.IpWhitelist.length; i++) {
                this.IpWhitelist[i] = new String(source.IpWhitelist[i]);
            }
        }
        if (source.OverageEnabled != null) {
            this.OverageEnabled = new Boolean(source.OverageEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AllowedModels", this.AllowedModels);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
        this.setParamSimple(map, prefix + "UseStatus", this.UseStatus);
        this.setParamSimple(map, prefix + "KeyVersion", this.KeyVersion);
        this.setParamSimple(map, prefix + "LastRotatedAt", this.LastRotatedAt);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamObj(map, prefix + "Balance.", this.Balance);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamArraySimple(map, prefix + "IpWhitelist.", this.IpWhitelist);
        this.setParamSimple(map, prefix + "OverageEnabled", this.OverageEnabled);

    }
}

