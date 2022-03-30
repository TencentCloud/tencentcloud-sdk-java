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

public class ComplianceAssetSummary extends AbstractModel{

    /**
    * 资产类别。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 是否为客户的首次检测。与CheckStatus配合使用。
    */
    @SerializedName("IsCustomerFirstCheck")
    @Expose
    private Boolean IsCustomerFirstCheck;

    /**
    * 检测状态

CHECK_UNINIT, 用户未启用此功能

CHECK_INIT, 待检测

CHECK_RUNNING, 检测中

CHECK_FINISHED, 检测完成

CHECK_FAILED, 检测失败
    */
    @SerializedName("CheckStatus")
    @Expose
    private String CheckStatus;

    /**
    * 此类别的检测进度，为 0~100 的数。若未在检测中，无此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckProgress")
    @Expose
    private Float CheckProgress;

    /**
    * 此类资产通过的检测项的数目。
    */
    @SerializedName("PassedPolicyItemCount")
    @Expose
    private Long PassedPolicyItemCount;

    /**
    * 此类资产未通过的检测的数目。
    */
    @SerializedName("FailedPolicyItemCount")
    @Expose
    private Long FailedPolicyItemCount;

    /**
    * 此类资产下未通过的严重级别的检测项的数目。
    */
    @SerializedName("FailedCriticalPolicyItemCount")
    @Expose
    private Long FailedCriticalPolicyItemCount;

    /**
    * 此类资产下未通过的高危检测项的数目。
    */
    @SerializedName("FailedHighRiskPolicyItemCount")
    @Expose
    private Long FailedHighRiskPolicyItemCount;

    /**
    * 此类资产下未通过的中危检测项的数目。
    */
    @SerializedName("FailedMediumRiskPolicyItemCount")
    @Expose
    private Long FailedMediumRiskPolicyItemCount;

    /**
    * 此类资产下未通过的低危检测项的数目。
    */
    @SerializedName("FailedLowRiskPolicyItemCount")
    @Expose
    private Long FailedLowRiskPolicyItemCount;

    /**
    * 此类资产下提示级别的检测项的数目。
    */
    @SerializedName("NoticePolicyItemCount")
    @Expose
    private Long NoticePolicyItemCount;

    /**
    * 通过检测的资产的数目。
    */
    @SerializedName("PassedAssetCount")
    @Expose
    private Long PassedAssetCount;

    /**
    * 未通过检测的资产的数目。
    */
    @SerializedName("FailedAssetCount")
    @Expose
    private Long FailedAssetCount;

    /**
    * 此类资产的合规率，0~100的数。
    */
    @SerializedName("AssetPassedRate")
    @Expose
    private Float AssetPassedRate;

    /**
    * 检测失败的资产的数目。
    */
    @SerializedName("ScanFailedAssetCount")
    @Expose
    private Long ScanFailedAssetCount;

    /**
    * 上次检测的耗时，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckCostTime")
    @Expose
    private Float CheckCostTime;

    /**
    * 上次检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * 定时检测规则。
    */
    @SerializedName("PeriodRule")
    @Expose
    private CompliancePeriodTaskRule PeriodRule;

    /**
    * 已开启的检查项总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenPolicyItemCount")
    @Expose
    private Long OpenPolicyItemCount;

    /**
    * 已忽略的检查项总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoredPolicyItemCount")
    @Expose
    private Long IgnoredPolicyItemCount;

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
     * Get 是否为客户的首次检测。与CheckStatus配合使用。 
     * @return IsCustomerFirstCheck 是否为客户的首次检测。与CheckStatus配合使用。
     */
    public Boolean getIsCustomerFirstCheck() {
        return this.IsCustomerFirstCheck;
    }

    /**
     * Set 是否为客户的首次检测。与CheckStatus配合使用。
     * @param IsCustomerFirstCheck 是否为客户的首次检测。与CheckStatus配合使用。
     */
    public void setIsCustomerFirstCheck(Boolean IsCustomerFirstCheck) {
        this.IsCustomerFirstCheck = IsCustomerFirstCheck;
    }

    /**
     * Get 检测状态

CHECK_UNINIT, 用户未启用此功能

CHECK_INIT, 待检测

CHECK_RUNNING, 检测中

CHECK_FINISHED, 检测完成

CHECK_FAILED, 检测失败 
     * @return CheckStatus 检测状态

CHECK_UNINIT, 用户未启用此功能

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

CHECK_UNINIT, 用户未启用此功能

CHECK_INIT, 待检测

CHECK_RUNNING, 检测中

CHECK_FINISHED, 检测完成

CHECK_FAILED, 检测失败
     * @param CheckStatus 检测状态

CHECK_UNINIT, 用户未启用此功能

CHECK_INIT, 待检测

CHECK_RUNNING, 检测中

CHECK_FINISHED, 检测完成

CHECK_FAILED, 检测失败
     */
    public void setCheckStatus(String CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 此类别的检测进度，为 0~100 的数。若未在检测中，无此字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckProgress 此类别的检测进度，为 0~100 的数。若未在检测中，无此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCheckProgress() {
        return this.CheckProgress;
    }

    /**
     * Set 此类别的检测进度，为 0~100 的数。若未在检测中，无此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckProgress 此类别的检测进度，为 0~100 的数。若未在检测中，无此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckProgress(Float CheckProgress) {
        this.CheckProgress = CheckProgress;
    }

    /**
     * Get 此类资产通过的检测项的数目。 
     * @return PassedPolicyItemCount 此类资产通过的检测项的数目。
     */
    public Long getPassedPolicyItemCount() {
        return this.PassedPolicyItemCount;
    }

    /**
     * Set 此类资产通过的检测项的数目。
     * @param PassedPolicyItemCount 此类资产通过的检测项的数目。
     */
    public void setPassedPolicyItemCount(Long PassedPolicyItemCount) {
        this.PassedPolicyItemCount = PassedPolicyItemCount;
    }

    /**
     * Get 此类资产未通过的检测的数目。 
     * @return FailedPolicyItemCount 此类资产未通过的检测的数目。
     */
    public Long getFailedPolicyItemCount() {
        return this.FailedPolicyItemCount;
    }

    /**
     * Set 此类资产未通过的检测的数目。
     * @param FailedPolicyItemCount 此类资产未通过的检测的数目。
     */
    public void setFailedPolicyItemCount(Long FailedPolicyItemCount) {
        this.FailedPolicyItemCount = FailedPolicyItemCount;
    }

    /**
     * Get 此类资产下未通过的严重级别的检测项的数目。 
     * @return FailedCriticalPolicyItemCount 此类资产下未通过的严重级别的检测项的数目。
     */
    public Long getFailedCriticalPolicyItemCount() {
        return this.FailedCriticalPolicyItemCount;
    }

    /**
     * Set 此类资产下未通过的严重级别的检测项的数目。
     * @param FailedCriticalPolicyItemCount 此类资产下未通过的严重级别的检测项的数目。
     */
    public void setFailedCriticalPolicyItemCount(Long FailedCriticalPolicyItemCount) {
        this.FailedCriticalPolicyItemCount = FailedCriticalPolicyItemCount;
    }

    /**
     * Get 此类资产下未通过的高危检测项的数目。 
     * @return FailedHighRiskPolicyItemCount 此类资产下未通过的高危检测项的数目。
     */
    public Long getFailedHighRiskPolicyItemCount() {
        return this.FailedHighRiskPolicyItemCount;
    }

    /**
     * Set 此类资产下未通过的高危检测项的数目。
     * @param FailedHighRiskPolicyItemCount 此类资产下未通过的高危检测项的数目。
     */
    public void setFailedHighRiskPolicyItemCount(Long FailedHighRiskPolicyItemCount) {
        this.FailedHighRiskPolicyItemCount = FailedHighRiskPolicyItemCount;
    }

    /**
     * Get 此类资产下未通过的中危检测项的数目。 
     * @return FailedMediumRiskPolicyItemCount 此类资产下未通过的中危检测项的数目。
     */
    public Long getFailedMediumRiskPolicyItemCount() {
        return this.FailedMediumRiskPolicyItemCount;
    }

    /**
     * Set 此类资产下未通过的中危检测项的数目。
     * @param FailedMediumRiskPolicyItemCount 此类资产下未通过的中危检测项的数目。
     */
    public void setFailedMediumRiskPolicyItemCount(Long FailedMediumRiskPolicyItemCount) {
        this.FailedMediumRiskPolicyItemCount = FailedMediumRiskPolicyItemCount;
    }

    /**
     * Get 此类资产下未通过的低危检测项的数目。 
     * @return FailedLowRiskPolicyItemCount 此类资产下未通过的低危检测项的数目。
     */
    public Long getFailedLowRiskPolicyItemCount() {
        return this.FailedLowRiskPolicyItemCount;
    }

    /**
     * Set 此类资产下未通过的低危检测项的数目。
     * @param FailedLowRiskPolicyItemCount 此类资产下未通过的低危检测项的数目。
     */
    public void setFailedLowRiskPolicyItemCount(Long FailedLowRiskPolicyItemCount) {
        this.FailedLowRiskPolicyItemCount = FailedLowRiskPolicyItemCount;
    }

    /**
     * Get 此类资产下提示级别的检测项的数目。 
     * @return NoticePolicyItemCount 此类资产下提示级别的检测项的数目。
     */
    public Long getNoticePolicyItemCount() {
        return this.NoticePolicyItemCount;
    }

    /**
     * Set 此类资产下提示级别的检测项的数目。
     * @param NoticePolicyItemCount 此类资产下提示级别的检测项的数目。
     */
    public void setNoticePolicyItemCount(Long NoticePolicyItemCount) {
        this.NoticePolicyItemCount = NoticePolicyItemCount;
    }

    /**
     * Get 通过检测的资产的数目。 
     * @return PassedAssetCount 通过检测的资产的数目。
     */
    public Long getPassedAssetCount() {
        return this.PassedAssetCount;
    }

    /**
     * Set 通过检测的资产的数目。
     * @param PassedAssetCount 通过检测的资产的数目。
     */
    public void setPassedAssetCount(Long PassedAssetCount) {
        this.PassedAssetCount = PassedAssetCount;
    }

    /**
     * Get 未通过检测的资产的数目。 
     * @return FailedAssetCount 未通过检测的资产的数目。
     */
    public Long getFailedAssetCount() {
        return this.FailedAssetCount;
    }

    /**
     * Set 未通过检测的资产的数目。
     * @param FailedAssetCount 未通过检测的资产的数目。
     */
    public void setFailedAssetCount(Long FailedAssetCount) {
        this.FailedAssetCount = FailedAssetCount;
    }

    /**
     * Get 此类资产的合规率，0~100的数。 
     * @return AssetPassedRate 此类资产的合规率，0~100的数。
     */
    public Float getAssetPassedRate() {
        return this.AssetPassedRate;
    }

    /**
     * Set 此类资产的合规率，0~100的数。
     * @param AssetPassedRate 此类资产的合规率，0~100的数。
     */
    public void setAssetPassedRate(Float AssetPassedRate) {
        this.AssetPassedRate = AssetPassedRate;
    }

    /**
     * Get 检测失败的资产的数目。 
     * @return ScanFailedAssetCount 检测失败的资产的数目。
     */
    public Long getScanFailedAssetCount() {
        return this.ScanFailedAssetCount;
    }

    /**
     * Set 检测失败的资产的数目。
     * @param ScanFailedAssetCount 检测失败的资产的数目。
     */
    public void setScanFailedAssetCount(Long ScanFailedAssetCount) {
        this.ScanFailedAssetCount = ScanFailedAssetCount;
    }

    /**
     * Get 上次检测的耗时，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckCostTime 上次检测的耗时，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCheckCostTime() {
        return this.CheckCostTime;
    }

    /**
     * Set 上次检测的耗时，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckCostTime 上次检测的耗时，单位为秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckCostTime(Float CheckCostTime) {
        this.CheckCostTime = CheckCostTime;
    }

    /**
     * Get 上次检测的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastCheckTime 上次检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set 上次检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastCheckTime 上次检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get 定时检测规则。 
     * @return PeriodRule 定时检测规则。
     */
    public CompliancePeriodTaskRule getPeriodRule() {
        return this.PeriodRule;
    }

    /**
     * Set 定时检测规则。
     * @param PeriodRule 定时检测规则。
     */
    public void setPeriodRule(CompliancePeriodTaskRule PeriodRule) {
        this.PeriodRule = PeriodRule;
    }

    /**
     * Get 已开启的检查项总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenPolicyItemCount 已开启的检查项总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOpenPolicyItemCount() {
        return this.OpenPolicyItemCount;
    }

    /**
     * Set 已开启的检查项总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenPolicyItemCount 已开启的检查项总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenPolicyItemCount(Long OpenPolicyItemCount) {
        this.OpenPolicyItemCount = OpenPolicyItemCount;
    }

    /**
     * Get 已忽略的检查项总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoredPolicyItemCount 已忽略的检查项总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIgnoredPolicyItemCount() {
        return this.IgnoredPolicyItemCount;
    }

    /**
     * Set 已忽略的检查项总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoredPolicyItemCount 已忽略的检查项总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoredPolicyItemCount(Long IgnoredPolicyItemCount) {
        this.IgnoredPolicyItemCount = IgnoredPolicyItemCount;
    }

    public ComplianceAssetSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceAssetSummary(ComplianceAssetSummary source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.IsCustomerFirstCheck != null) {
            this.IsCustomerFirstCheck = new Boolean(source.IsCustomerFirstCheck);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.CheckProgress != null) {
            this.CheckProgress = new Float(source.CheckProgress);
        }
        if (source.PassedPolicyItemCount != null) {
            this.PassedPolicyItemCount = new Long(source.PassedPolicyItemCount);
        }
        if (source.FailedPolicyItemCount != null) {
            this.FailedPolicyItemCount = new Long(source.FailedPolicyItemCount);
        }
        if (source.FailedCriticalPolicyItemCount != null) {
            this.FailedCriticalPolicyItemCount = new Long(source.FailedCriticalPolicyItemCount);
        }
        if (source.FailedHighRiskPolicyItemCount != null) {
            this.FailedHighRiskPolicyItemCount = new Long(source.FailedHighRiskPolicyItemCount);
        }
        if (source.FailedMediumRiskPolicyItemCount != null) {
            this.FailedMediumRiskPolicyItemCount = new Long(source.FailedMediumRiskPolicyItemCount);
        }
        if (source.FailedLowRiskPolicyItemCount != null) {
            this.FailedLowRiskPolicyItemCount = new Long(source.FailedLowRiskPolicyItemCount);
        }
        if (source.NoticePolicyItemCount != null) {
            this.NoticePolicyItemCount = new Long(source.NoticePolicyItemCount);
        }
        if (source.PassedAssetCount != null) {
            this.PassedAssetCount = new Long(source.PassedAssetCount);
        }
        if (source.FailedAssetCount != null) {
            this.FailedAssetCount = new Long(source.FailedAssetCount);
        }
        if (source.AssetPassedRate != null) {
            this.AssetPassedRate = new Float(source.AssetPassedRate);
        }
        if (source.ScanFailedAssetCount != null) {
            this.ScanFailedAssetCount = new Long(source.ScanFailedAssetCount);
        }
        if (source.CheckCostTime != null) {
            this.CheckCostTime = new Float(source.CheckCostTime);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.PeriodRule != null) {
            this.PeriodRule = new CompliancePeriodTaskRule(source.PeriodRule);
        }
        if (source.OpenPolicyItemCount != null) {
            this.OpenPolicyItemCount = new Long(source.OpenPolicyItemCount);
        }
        if (source.IgnoredPolicyItemCount != null) {
            this.IgnoredPolicyItemCount = new Long(source.IgnoredPolicyItemCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "IsCustomerFirstCheck", this.IsCustomerFirstCheck);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "CheckProgress", this.CheckProgress);
        this.setParamSimple(map, prefix + "PassedPolicyItemCount", this.PassedPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedPolicyItemCount", this.FailedPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedCriticalPolicyItemCount", this.FailedCriticalPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedHighRiskPolicyItemCount", this.FailedHighRiskPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedMediumRiskPolicyItemCount", this.FailedMediumRiskPolicyItemCount);
        this.setParamSimple(map, prefix + "FailedLowRiskPolicyItemCount", this.FailedLowRiskPolicyItemCount);
        this.setParamSimple(map, prefix + "NoticePolicyItemCount", this.NoticePolicyItemCount);
        this.setParamSimple(map, prefix + "PassedAssetCount", this.PassedAssetCount);
        this.setParamSimple(map, prefix + "FailedAssetCount", this.FailedAssetCount);
        this.setParamSimple(map, prefix + "AssetPassedRate", this.AssetPassedRate);
        this.setParamSimple(map, prefix + "ScanFailedAssetCount", this.ScanFailedAssetCount);
        this.setParamSimple(map, prefix + "CheckCostTime", this.CheckCostTime);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamObj(map, prefix + "PeriodRule.", this.PeriodRule);
        this.setParamSimple(map, prefix + "OpenPolicyItemCount", this.OpenPolicyItemCount);
        this.setParamSimple(map, prefix + "IgnoredPolicyItemCount", this.IgnoredPolicyItemCount);

    }
}

