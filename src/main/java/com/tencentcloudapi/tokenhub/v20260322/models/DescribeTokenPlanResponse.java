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

public class DescribeTokenPlanResponse extends AbstractModel {

    /**
    * 套餐 ID。
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * 套餐名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 主账号 APP ID。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 主账号 UIN。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 状态。取值：enable（启用）、disable（停用）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 关停原因。取值：取值：NORMAL（套餐正常）、ISOLATED（隔离/欠费）、FROZEN（冻结）、EXHAUSTED（额度耗尽）、DESTROYED（已销毁）。
    */
    @SerializedName("StopReason")
    @Expose
    private String StopReason;

    /**
    * 可创建APIKey 上限。
    */
    @SerializedName("ApiKeyMax")
    @Expose
    private Long ApiKeyMax;

    /**
    * 云计费预付费资源包 ID。
    */
    @SerializedName("PrepayResourceID")
    @Expose
    private String PrepayResourceID;

    /**
    * 创建人，子账号创建的套餐将展示子账号UIN。
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
    * 套餐包基本信息
    */
    @SerializedName("PackageInfo")
    @Expose
    private TokenPlanPackageInfo PackageInfo;

    /**
    * 自动续费标识。取值：0（手动续费）、1（自动续费）、2（明确不自动续费）。未绑定预付费资源时不返回。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 当前已创建的 API Key 数量
    */
    @SerializedName("ApiKeyCount")
    @Expose
    private Long ApiKeyCount;

    /**
    * 当前周期 Token 用量明细
    */
    @SerializedName("TokenSummary")
    @Expose
    private TokenSummary TokenSummary;

    /**
    * 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 套餐 ID。 
     * @return TeamId 套餐 ID。
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set 套餐 ID。
     * @param TeamId 套餐 ID。
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get 套餐名称。 
     * @return Name 套餐名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 套餐名称。
     * @param Name 套餐名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 主账号 APP ID。 
     * @return AppId 主账号 APP ID。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 主账号 APP ID。
     * @param AppId 主账号 APP ID。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号 UIN。 
     * @return Uin 主账号 UIN。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号 UIN。
     * @param Uin 主账号 UIN。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 状态。取值：enable（启用）、disable（停用）。 
     * @return Status 状态。取值：enable（启用）、disable（停用）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。取值：enable（启用）、disable（停用）。
     * @param Status 状态。取值：enable（启用）、disable（停用）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 关停原因。取值：取值：NORMAL（套餐正常）、ISOLATED（隔离/欠费）、FROZEN（冻结）、EXHAUSTED（额度耗尽）、DESTROYED（已销毁）。 
     * @return StopReason 关停原因。取值：取值：NORMAL（套餐正常）、ISOLATED（隔离/欠费）、FROZEN（冻结）、EXHAUSTED（额度耗尽）、DESTROYED（已销毁）。
     */
    public String getStopReason() {
        return this.StopReason;
    }

    /**
     * Set 关停原因。取值：取值：NORMAL（套餐正常）、ISOLATED（隔离/欠费）、FROZEN（冻结）、EXHAUSTED（额度耗尽）、DESTROYED（已销毁）。
     * @param StopReason 关停原因。取值：取值：NORMAL（套餐正常）、ISOLATED（隔离/欠费）、FROZEN（冻结）、EXHAUSTED（额度耗尽）、DESTROYED（已销毁）。
     */
    public void setStopReason(String StopReason) {
        this.StopReason = StopReason;
    }

    /**
     * Get 可创建APIKey 上限。 
     * @return ApiKeyMax 可创建APIKey 上限。
     */
    public Long getApiKeyMax() {
        return this.ApiKeyMax;
    }

    /**
     * Set 可创建APIKey 上限。
     * @param ApiKeyMax 可创建APIKey 上限。
     */
    public void setApiKeyMax(Long ApiKeyMax) {
        this.ApiKeyMax = ApiKeyMax;
    }

    /**
     * Get 云计费预付费资源包 ID。 
     * @return PrepayResourceID 云计费预付费资源包 ID。
     */
    public String getPrepayResourceID() {
        return this.PrepayResourceID;
    }

    /**
     * Set 云计费预付费资源包 ID。
     * @param PrepayResourceID 云计费预付费资源包 ID。
     */
    public void setPrepayResourceID(String PrepayResourceID) {
        this.PrepayResourceID = PrepayResourceID;
    }

    /**
     * Get 创建人，子账号创建的套餐将展示子账号UIN。 
     * @return Creator 创建人，子账号创建的套餐将展示子账号UIN。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人，子账号创建的套餐将展示子账号UIN。
     * @param Creator 创建人，子账号创建的套餐将展示子账号UIN。
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
     * Get 套餐包基本信息 
     * @return PackageInfo 套餐包基本信息
     */
    public TokenPlanPackageInfo getPackageInfo() {
        return this.PackageInfo;
    }

    /**
     * Set 套餐包基本信息
     * @param PackageInfo 套餐包基本信息
     */
    public void setPackageInfo(TokenPlanPackageInfo PackageInfo) {
        this.PackageInfo = PackageInfo;
    }

    /**
     * Get 自动续费标识。取值：0（手动续费）、1（自动续费）、2（明确不自动续费）。未绑定预付费资源时不返回。 
     * @return AutoRenewFlag 自动续费标识。取值：0（手动续费）、1（自动续费）、2（明确不自动续费）。未绑定预付费资源时不返回。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标识。取值：0（手动续费）、1（自动续费）、2（明确不自动续费）。未绑定预付费资源时不返回。
     * @param AutoRenewFlag 自动续费标识。取值：0（手动续费）、1（自动续费）、2（明确不自动续费）。未绑定预付费资源时不返回。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 当前已创建的 API Key 数量 
     * @return ApiKeyCount 当前已创建的 API Key 数量
     */
    public Long getApiKeyCount() {
        return this.ApiKeyCount;
    }

    /**
     * Set 当前已创建的 API Key 数量
     * @param ApiKeyCount 当前已创建的 API Key 数量
     */
    public void setApiKeyCount(Long ApiKeyCount) {
        this.ApiKeyCount = ApiKeyCount;
    }

    /**
     * Get 当前周期 Token 用量明细 
     * @return TokenSummary 当前周期 Token 用量明细
     */
    public TokenSummary getTokenSummary() {
        return this.TokenSummary;
    }

    /**
     * Set 当前周期 Token 用量明细
     * @param TokenSummary 当前周期 Token 用量明细
     */
    public void setTokenSummary(TokenSummary TokenSummary) {
        this.TokenSummary = TokenSummary;
    }

    /**
     * Get 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐） 
     * @return ProductType 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）
     * @param ProductType 套餐类型。取值：enterprise（企业版专业套餐）、enterprise-auto（企业版轻享套餐）
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTokenPlanResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenPlanResponse(DescribeTokenPlanResponse source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
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
        if (source.ApiKeyCount != null) {
            this.ApiKeyCount = new Long(source.ApiKeyCount);
        }
        if (source.TokenSummary != null) {
            this.TokenSummary = new TokenSummary(source.TokenSummary);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StopReason", this.StopReason);
        this.setParamSimple(map, prefix + "ApiKeyMax", this.ApiKeyMax);
        this.setParamSimple(map, prefix + "PrepayResourceID", this.PrepayResourceID);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamObj(map, prefix + "PackageInfo.", this.PackageInfo);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ApiKeyCount", this.ApiKeyCount);
        this.setParamObj(map, prefix + "TokenSummary.", this.TokenSummary);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

