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

public class ComplianceAssetPolicyItem extends AbstractModel{

    /**
    * 为客户分配的唯一的检测项的ID。
    */
    @SerializedName("CustomerPolicyItemId")
    @Expose
    private Long CustomerPolicyItemId;

    /**
    * 检测项的原始ID
    */
    @SerializedName("BasePolicyItemId")
    @Expose
    private Long BasePolicyItemId;

    /**
    * 检测项的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 检测项所属的类型的名称
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 所属的合规标准的ID
    */
    @SerializedName("BenchmarkStandardId")
    @Expose
    private Long BenchmarkStandardId;

    /**
    * 所属的合规标准的名称
    */
    @SerializedName("BenchmarkStandardName")
    @Expose
    private String BenchmarkStandardName;

    /**
    * 威胁等级
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

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
    * 检测结果
RESULT_PASSED: 通过
RESULT_FAILED: 未通过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckResult")
    @Expose
    private String CheckResult;

    /**
    * 检测项对应的白名单项的ID。如果存在且非0，表示检测项被用户忽略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WhitelistId")
    @Expose
    private Long WhitelistId;

    /**
    * 处理建议。
    */
    @SerializedName("FixSuggestion")
    @Expose
    private String FixSuggestion;

    /**
    * 最近检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
     * Get 为客户分配的唯一的检测项的ID。 
     * @return CustomerPolicyItemId 为客户分配的唯一的检测项的ID。
     */
    public Long getCustomerPolicyItemId() {
        return this.CustomerPolicyItemId;
    }

    /**
     * Set 为客户分配的唯一的检测项的ID。
     * @param CustomerPolicyItemId 为客户分配的唯一的检测项的ID。
     */
    public void setCustomerPolicyItemId(Long CustomerPolicyItemId) {
        this.CustomerPolicyItemId = CustomerPolicyItemId;
    }

    /**
     * Get 检测项的原始ID 
     * @return BasePolicyItemId 检测项的原始ID
     */
    public Long getBasePolicyItemId() {
        return this.BasePolicyItemId;
    }

    /**
     * Set 检测项的原始ID
     * @param BasePolicyItemId 检测项的原始ID
     */
    public void setBasePolicyItemId(Long BasePolicyItemId) {
        this.BasePolicyItemId = BasePolicyItemId;
    }

    /**
     * Get 检测项的名称。 
     * @return Name 检测项的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 检测项的名称。
     * @param Name 检测项的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 检测项所属的类型的名称 
     * @return Category 检测项所属的类型的名称
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 检测项所属的类型的名称
     * @param Category 检测项所属的类型的名称
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 所属的合规标准的ID 
     * @return BenchmarkStandardId 所属的合规标准的ID
     */
    public Long getBenchmarkStandardId() {
        return this.BenchmarkStandardId;
    }

    /**
     * Set 所属的合规标准的ID
     * @param BenchmarkStandardId 所属的合规标准的ID
     */
    public void setBenchmarkStandardId(Long BenchmarkStandardId) {
        this.BenchmarkStandardId = BenchmarkStandardId;
    }

    /**
     * Get 所属的合规标准的名称 
     * @return BenchmarkStandardName 所属的合规标准的名称
     */
    public String getBenchmarkStandardName() {
        return this.BenchmarkStandardName;
    }

    /**
     * Set 所属的合规标准的名称
     * @param BenchmarkStandardName 所属的合规标准的名称
     */
    public void setBenchmarkStandardName(String BenchmarkStandardName) {
        this.BenchmarkStandardName = BenchmarkStandardName;
    }

    /**
     * Get 威胁等级 
     * @return RiskLevel 威胁等级
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 威胁等级
     * @param RiskLevel 威胁等级
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
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
     * Get 检测结果
RESULT_PASSED: 通过
RESULT_FAILED: 未通过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckResult 检测结果
RESULT_PASSED: 通过
RESULT_FAILED: 未通过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckResult() {
        return this.CheckResult;
    }

    /**
     * Set 检测结果
RESULT_PASSED: 通过
RESULT_FAILED: 未通过
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckResult 检测结果
RESULT_PASSED: 通过
RESULT_FAILED: 未通过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckResult(String CheckResult) {
        this.CheckResult = CheckResult;
    }

    /**
     * Get 检测项对应的白名单项的ID。如果存在且非0，表示检测项被用户忽略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WhitelistId 检测项对应的白名单项的ID。如果存在且非0，表示检测项被用户忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWhitelistId() {
        return this.WhitelistId;
    }

    /**
     * Set 检测项对应的白名单项的ID。如果存在且非0，表示检测项被用户忽略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WhitelistId 检测项对应的白名单项的ID。如果存在且非0，表示检测项被用户忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWhitelistId(Long WhitelistId) {
        this.WhitelistId = WhitelistId;
    }

    /**
     * Get 处理建议。 
     * @return FixSuggestion 处理建议。
     */
    public String getFixSuggestion() {
        return this.FixSuggestion;
    }

    /**
     * Set 处理建议。
     * @param FixSuggestion 处理建议。
     */
    public void setFixSuggestion(String FixSuggestion) {
        this.FixSuggestion = FixSuggestion;
    }

    /**
     * Get 最近检测的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastCheckTime 最近检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set 最近检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastCheckTime 最近检测的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    public ComplianceAssetPolicyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceAssetPolicyItem(ComplianceAssetPolicyItem source) {
        if (source.CustomerPolicyItemId != null) {
            this.CustomerPolicyItemId = new Long(source.CustomerPolicyItemId);
        }
        if (source.BasePolicyItemId != null) {
            this.BasePolicyItemId = new Long(source.BasePolicyItemId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.BenchmarkStandardId != null) {
            this.BenchmarkStandardId = new Long(source.BenchmarkStandardId);
        }
        if (source.BenchmarkStandardName != null) {
            this.BenchmarkStandardName = new String(source.BenchmarkStandardName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new String(source.CheckStatus);
        }
        if (source.CheckResult != null) {
            this.CheckResult = new String(source.CheckResult);
        }
        if (source.WhitelistId != null) {
            this.WhitelistId = new Long(source.WhitelistId);
        }
        if (source.FixSuggestion != null) {
            this.FixSuggestion = new String(source.FixSuggestion);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerPolicyItemId", this.CustomerPolicyItemId);
        this.setParamSimple(map, prefix + "BasePolicyItemId", this.BasePolicyItemId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "BenchmarkStandardId", this.BenchmarkStandardId);
        this.setParamSimple(map, prefix + "BenchmarkStandardName", this.BenchmarkStandardName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "CheckResult", this.CheckResult);
        this.setParamSimple(map, prefix + "WhitelistId", this.WhitelistId);
        this.setParamSimple(map, prefix + "FixSuggestion", this.FixSuggestion);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);

    }
}

