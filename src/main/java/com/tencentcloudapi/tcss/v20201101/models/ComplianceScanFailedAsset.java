/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceScanFailedAsset extends AbstractModel{

    /**
    * 客户资产的ID。
    */
    @SerializedName("CustomerAssetId")
    @Expose
    private Long CustomerAssetId;

    /**
    * 资产类别。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 检测状态
CHECK_INIT, 待检测
CHECK_RUNNING, 检测中
CHECK_FINISHED, 检测完成
CHECK_FAILED, 检测失败
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * 资产的名称。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 资产检测失败的原因。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * 检测失败的处理建议。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 检测的时间。
    */
    @SerializedName("CheckTime")
    @Expose
    private String CheckTime;

    /**
     * Get 客户资产的ID。 
     * @return CustomerAssetId 客户资产的ID。
     */
    public Long getCustomerAssetId() {
        return this.CustomerAssetId;
    }

    /**
     * Set 客户资产的ID。
     * @param CustomerAssetId 客户资产的ID。
     */
    public void setCustomerAssetId(Long CustomerAssetId) {
        this.CustomerAssetId = CustomerAssetId;
    }

    /**
     * Get 资产类别。 
     * @return AssetType 资产类别。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类别。
     * @param AssetType 资产类别。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 检测状态
CHECK_INIT, 待检测
CHECK_RUNNING, 检测中
CHECK_FINISHED, 检测完成
CHECK_FAILED, 检测失败 
     * @return CheckStatus 检测状态
CHECK_INIT, 待检测
CHECK_RUNNING, 检测中
CHECK_FINISHED, 检测完成
CHECK_FAILED, 检测失败
     */
    public String getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 检测状态
CHECK_INIT, 待检测
CHECK_RUNNING, 检测中
CHECK_FINISHED, 检测完成
CHECK_FAILED, 检测失败
     * @param CheckStatus 检测状态
CHECK_INIT, 待检测
CHECK_RUNNING, 检测中
CHECK_FINISHED, 检测完成
CHECK_FAILED, 检测失败
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 资产的名称。 
     * @return AssetName 资产的名称。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产的名称。
     * @param AssetName 资产的名称。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 资产检测失败的原因。 
     * @return FailureReason 资产检测失败的原因。
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set 资产检测失败的原因。
     * @param FailureReason 资产检测失败的原因。
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get 检测失败的处理建议。 
     * @return Suggestion 检测失败的处理建议。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 检测失败的处理建议。
     * @param Suggestion 检测失败的处理建议。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 检测的时间。 
     * @return CheckTime 检测的时间。
     */
    public String getCheckTime() {
        return this.CheckTime;
    }

    /**
     * Set 检测的时间。
     * @param CheckTime 检测的时间。
     */
    public void setCheckTime(String CheckTime) {
        this.CheckTime = CheckTime;
    }

    public ComplianceScanFailedAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceScanFailedAsset(ComplianceScanFailedAsset source) {
        if (source.CustomerAssetId != null) {
            this.CustomerAssetId = new Long(source.CustomerAssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.CheckTime != null) {
            this.CheckTime = new String(source.CheckTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerAssetId", this.CustomerAssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "CheckTime", this.CheckTime);

    }
}

