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
    * API Key ID。
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * API Key 密钥值（脱敏）。
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * API Key 名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 所属套餐 ID。
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * 账号APP ID。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 主账号 UIN。最大 128 字符。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * API Key 可用模型列表（JSON 数组字符串）。
    */
    @SerializedName("AllowedModels")
    @Expose
    private String AllowedModels;

    /**
    * API Key 是否可用。取值：enable（启用）、disable（停用）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * API Key 停用原因。取值：NORMAL（正常，默认值），QUOTA_EXHAUSTED（API Key额度包耗尽），ABNORMAL（异常，需人工介入）
    */
    @SerializedName("StopReason")
    @Expose
    private String StopReason;

    /**
    * 用户侧开关。取值：enable（启用）、disable（停用）。
    */
    @SerializedName("UseStatus")
    @Expose
    private String UseStatus;

    /**
    * 密钥版本号。
    */
    @SerializedName("KeyVersion")
    @Expose
    private Long KeyVersion;

    /**
    * 最近一次重置时间。（ISO 8601）
    */
    @SerializedName("LastRotatedAt")
    @Expose
    private String LastRotatedAt;

    /**
    * 创建人，如果是子账号创建，则该值为子账号UIN。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * API Key 额度用量信息
    */
    @SerializedName("Balance")
    @Expose
    private SubPackageBalance Balance;

    /**
    * 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
     * Get API Key ID。 
     * @return ApiKeyId API Key ID。
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set API Key ID。
     * @param ApiKeyId API Key ID。
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get API Key 密钥值（脱敏）。 
     * @return ApiKey API Key 密钥值（脱敏）。
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set API Key 密钥值（脱敏）。
     * @param ApiKey API Key 密钥值（脱敏）。
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get API Key 名称。 
     * @return Name API Key 名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API Key 名称。
     * @param Name API Key 名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 所属套餐 ID。 
     * @return TeamId 所属套餐 ID。
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set 所属套餐 ID。
     * @param TeamId 所属套餐 ID。
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get 账号APP ID。 
     * @return AppId 账号APP ID。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 账号APP ID。
     * @param AppId 账号APP ID。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号 UIN。最大 128 字符。 
     * @return Uin 主账号 UIN。最大 128 字符。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号 UIN。最大 128 字符。
     * @param Uin 主账号 UIN。最大 128 字符。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get API Key 可用模型列表（JSON 数组字符串）。 
     * @return AllowedModels API Key 可用模型列表（JSON 数组字符串）。
     */
    public String getAllowedModels() {
        return this.AllowedModels;
    }

    /**
     * Set API Key 可用模型列表（JSON 数组字符串）。
     * @param AllowedModels API Key 可用模型列表（JSON 数组字符串）。
     */
    public void setAllowedModels(String AllowedModels) {
        this.AllowedModels = AllowedModels;
    }

    /**
     * Get API Key 是否可用。取值：enable（启用）、disable（停用）。 
     * @return Status API Key 是否可用。取值：enable（启用）、disable（停用）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set API Key 是否可用。取值：enable（启用）、disable（停用）。
     * @param Status API Key 是否可用。取值：enable（启用）、disable（停用）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get API Key 停用原因。取值：NORMAL（正常，默认值），QUOTA_EXHAUSTED（API Key额度包耗尽），ABNORMAL（异常，需人工介入） 
     * @return StopReason API Key 停用原因。取值：NORMAL（正常，默认值），QUOTA_EXHAUSTED（API Key额度包耗尽），ABNORMAL（异常，需人工介入）
     */
    public String getStopReason() {
        return this.StopReason;
    }

    /**
     * Set API Key 停用原因。取值：NORMAL（正常，默认值），QUOTA_EXHAUSTED（API Key额度包耗尽），ABNORMAL（异常，需人工介入）
     * @param StopReason API Key 停用原因。取值：NORMAL（正常，默认值），QUOTA_EXHAUSTED（API Key额度包耗尽），ABNORMAL（异常，需人工介入）
     */
    public void setStopReason(String StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get 用户侧开关。取值：enable（启用）、disable（停用）。 
     * @return UseStatus 用户侧开关。取值：enable（启用）、disable（停用）。
     */
    public String getUseStatus() {
        return this.UseStatus;
    }

    /**
     * Set 用户侧开关。取值：enable（启用）、disable（停用）。
     * @param UseStatus 用户侧开关。取值：enable（启用）、disable（停用）。
     */
    public void setUseStatus(String UseStatus) {
        this.UseStatus = UseStatus;
    }

    /**
     * Get 密钥版本号。 
     * @return KeyVersion 密钥版本号。
     */
    public Long getKeyVersion() {
        return this.KeyVersion;
    }

    /**
     * Set 密钥版本号。
     * @param KeyVersion 密钥版本号。
     */
    public void setKeyVersion(Long KeyVersion) {
        this.KeyVersion = KeyVersion;
    }

    /**
     * Get 最近一次重置时间。（ISO 8601） 
     * @return LastRotatedAt 最近一次重置时间。（ISO 8601）
     */
    public String getLastRotatedAt() {
        return this.LastRotatedAt;
    }

    /**
     * Set 最近一次重置时间。（ISO 8601）
     * @param LastRotatedAt 最近一次重置时间。（ISO 8601）
     */
    public void setLastRotatedAt(String LastRotatedAt) {
        this.LastRotatedAt = LastRotatedAt;
    }

    /**
     * Get 创建人，如果是子账号创建，则该值为子账号UIN。 
     * @return Creator 创建人，如果是子账号创建，则该值为子账号UIN。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人，如果是子账号创建，则该值为子账号UIN。
     * @param Creator 创建人，如果是子账号创建，则该值为子账号UIN。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 创建时间。 
     * @return CreatedAt 创建时间。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间。
     * @param CreatedAt 创建时间。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间。 
     * @return UpdatedAt 更新时间。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间。
     * @param UpdatedAt 更新时间。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get API Key 额度用量信息 
     * @return Balance API Key 额度用量信息
     */
    public SubPackageBalance getBalance() {
        return this.Balance;
    }

    /**
     * Set API Key 额度用量信息
     * @param Balance API Key 额度用量信息
     */
    public void setBalance(SubPackageBalance Balance) {
        this.Balance = Balance;
    }

    /**
     * Get 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。 
     * @return ProductType 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。
     * @param ProductType 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）。
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
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

    }
}

