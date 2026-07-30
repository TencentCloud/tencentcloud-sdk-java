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

public class TokenPlanListItem extends AbstractModel {

    /**
    * <p>套餐 ID。</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）</p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * <p>套餐名称。最大 128 字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>账号 APP ID。</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>主账号 UIN。</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>套餐状态。取值：enable（启用）、disable（停用）。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>套餐关停原因。取值：NORMAL（正常）、ISOLATED（隔离/欠费）、FROZEN（冻结）、EXHAUSTED（额度耗尽）、DESTROYED（已销毁）</p>
    */
    @SerializedName("StopReason")
    @Expose
    private String StopReason;

    /**
    * <p>可创建 API Key 上限。</p>
    */
    @SerializedName("ApiKeyMax")
    @Expose
    private Long ApiKeyMax;

    /**
    * <p>当前已创建的 APIKey 数量</p>
    */
    @SerializedName("ApiKeyCount")
    @Expose
    private Long ApiKeyCount;

    /**
    * <p>云计费预付费资源包 ID。</p>
    */
    @SerializedName("PrepayResourceID")
    @Expose
    private String PrepayResourceID;

    /**
    * <p>创建人。若为子账号创建的套餐，则该值为子账号UIN。</p>
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
    * <p>套餐包基本信息。</p>
    */
    @SerializedName("PackageInfo")
    @Expose
    private TokenPlanPackageInfo PackageInfo;

    /**
    * <p>是否开启自动续费。取值：0（未开启），1（开启）</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get <p>套餐 ID。</p> 
     * @return TeamId <p>套餐 ID。</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>套餐 ID。</p>
     * @param TeamId <p>套餐 ID。</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）</p> 
     * @return ProductType <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）</p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）</p>
     * @param ProductType <p>套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）</p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get <p>套餐名称。最大 128 字符。</p> 
     * @return Name <p>套餐名称。最大 128 字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>套餐名称。最大 128 字符。</p>
     * @param Name <p>套餐名称。最大 128 字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>账号 APP ID。</p> 
     * @return AppId <p>账号 APP ID。</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>账号 APP ID。</p>
     * @param AppId <p>账号 APP ID。</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>主账号 UIN。</p> 
     * @return Uin <p>主账号 UIN。</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号 UIN。</p>
     * @param Uin <p>主账号 UIN。</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>套餐状态。取值：enable（启用）、disable（停用）。</p> 
     * @return Status <p>套餐状态。取值：enable（启用）、disable（停用）。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>套餐状态。取值：enable（启用）、disable（停用）。</p>
     * @param Status <p>套餐状态。取值：enable（启用）、disable（停用）。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>套餐关停原因。取值：NORMAL（正常）、ISOLATED（隔离/欠费）、FROZEN（冻结）、EXHAUSTED（额度耗尽）、DESTROYED（已销毁）</p> 
     * @return StopReason <p>套餐关停原因。取值：NORMAL（正常）、ISOLATED（隔离/欠费）、FROZEN（冻结）、EXHAUSTED（额度耗尽）、DESTROYED（已销毁）</p>
     */
    public String getStopReason() {
        return this.StopReason;
    }

    /**
     * Set <p>套餐关停原因。取值：NORMAL（正常）、ISOLATED（隔离/欠费）、FROZEN（冻结）、EXHAUSTED（额度耗尽）、DESTROYED（已销毁）</p>
     * @param StopReason <p>套餐关停原因。取值：NORMAL（正常）、ISOLATED（隔离/欠费）、FROZEN（冻结）、EXHAUSTED（额度耗尽）、DESTROYED（已销毁）</p>
     */
    public void setStopReason(String StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get <p>可创建 API Key 上限。</p> 
     * @return ApiKeyMax <p>可创建 API Key 上限。</p>
     */
    public Long getApiKeyMax() {
        return this.ApiKeyMax;
    }

    /**
     * Set <p>可创建 API Key 上限。</p>
     * @param ApiKeyMax <p>可创建 API Key 上限。</p>
     */
    public void setApiKeyMax(Long ApiKeyMax) {
        this.ApiKeyMax = ApiKeyMax;
    }

    /**
     * Get <p>当前已创建的 APIKey 数量</p> 
     * @return ApiKeyCount <p>当前已创建的 APIKey 数量</p>
     */
    public Long getApiKeyCount() {
        return this.ApiKeyCount;
    }

    /**
     * Set <p>当前已创建的 APIKey 数量</p>
     * @param ApiKeyCount <p>当前已创建的 APIKey 数量</p>
     */
    public void setApiKeyCount(Long ApiKeyCount) {
        this.ApiKeyCount = ApiKeyCount;
    }

    /**
     * Get <p>云计费预付费资源包 ID。</p> 
     * @return PrepayResourceID <p>云计费预付费资源包 ID。</p>
     */
    public String getPrepayResourceID() {
        return this.PrepayResourceID;
    }

    /**
     * Set <p>云计费预付费资源包 ID。</p>
     * @param PrepayResourceID <p>云计费预付费资源包 ID。</p>
     */
    public void setPrepayResourceID(String PrepayResourceID) {
        this.PrepayResourceID = PrepayResourceID;
    }

    /**
     * Get <p>创建人。若为子账号创建的套餐，则该值为子账号UIN。</p> 
     * @return Creator <p>创建人。若为子账号创建的套餐，则该值为子账号UIN。</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建人。若为子账号创建的套餐，则该值为子账号UIN。</p>
     * @param Creator <p>创建人。若为子账号创建的套餐，则该值为子账号UIN。</p>
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
     * Get <p>套餐包基本信息。</p> 
     * @return PackageInfo <p>套餐包基本信息。</p>
     */
    public TokenPlanPackageInfo getPackageInfo() {
        return this.PackageInfo;
    }

    /**
     * Set <p>套餐包基本信息。</p>
     * @param PackageInfo <p>套餐包基本信息。</p>
     */
    public void setPackageInfo(TokenPlanPackageInfo PackageInfo) {
        this.PackageInfo = PackageInfo;
    }

    /**
     * Get <p>是否开启自动续费。取值：0（未开启），1（开启）</p> 
     * @return AutoRenewFlag <p>是否开启自动续费。取值：0（未开启），1（开启）</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>是否开启自动续费。取值：0（未开启），1（开启）</p>
     * @param AutoRenewFlag <p>是否开启自动续费。取值：0（未开启），1（开启）</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public TokenPlanListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenPlanListItem(TokenPlanListItem source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StopReason != null) {
            this.StopReason = new String(source.StopReason);
        }
        if (source.ApiKeyMax != null) {
            this.ApiKeyMax = new Long(source.ApiKeyMax);
        }
        if (source.ApiKeyCount != null) {
            this.ApiKeyCount = new Long(source.ApiKeyCount);
        }
        if (source.PrepayResourceID != null) {
            this.PrepayResourceID = new String(source.PrepayResourceID);
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
        if (source.PackageInfo != null) {
            this.PackageInfo = new TokenPlanPackageInfo(source.PackageInfo);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
        this.setParamSimple(map, prefix + "ApiKeyMax", this.ApiKeyMax);
        this.setParamSimple(map, prefix + "ApiKeyCount", this.ApiKeyCount);
        this.setParamSimple(map, prefix + "PrepayResourceID", this.PrepayResourceID);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamObj(map, prefix + "PackageInfo.", this.PackageInfo);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

