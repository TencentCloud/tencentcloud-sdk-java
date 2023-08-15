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

public class DescribeClusterSummaryResponse extends AbstractModel{

    /**
    * 集群总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 有风险的集群数量
    */
    @SerializedName("RiskClusterCount")
    @Expose
    private Long RiskClusterCount;

    /**
    * 未检查的集群数量
    */
    @SerializedName("UncheckClusterCount")
    @Expose
    private Long UncheckClusterCount;

    /**
    * 托管集群数量
    */
    @SerializedName("ManagedClusterCount")
    @Expose
    private Long ManagedClusterCount;

    /**
    * 独立集群数量
    */
    @SerializedName("IndependentClusterCount")
    @Expose
    private Long IndependentClusterCount;

    /**
    * 无风险的集群数量
    */
    @SerializedName("NoRiskClusterCount")
    @Expose
    private Long NoRiskClusterCount;

    /**
    * 已经检查集群数
    */
    @SerializedName("CheckedClusterCount")
    @Expose
    private Long CheckedClusterCount;

    /**
    * 自动检查集群数
    */
    @SerializedName("AutoCheckClusterCount")
    @Expose
    private Long AutoCheckClusterCount;

    /**
    * 手动检查集群数
    */
    @SerializedName("ManualCheckClusterCount")
    @Expose
    private Long ManualCheckClusterCount;

    /**
    * 检查失败集群数
    */
    @SerializedName("FailedClusterCount")
    @Expose
    private Long FailedClusterCount;

    /**
    * 未导入的集群数量
    */
    @SerializedName("NotImportedClusterCount")
    @Expose
    private Long NotImportedClusterCount;

    /**
    * eks集群数量
    */
    @SerializedName("ServerlessClusterCount")
    @Expose
    private Long ServerlessClusterCount;

    /**
    * TKE集群数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TkeClusterCount")
    @Expose
    private Long TkeClusterCount;

    /**
    * 用户自建腾讯云集群数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserCreateTencentClusterCount")
    @Expose
    private Long UserCreateTencentClusterCount;

    /**
    * 用户自建集群混合云数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserCreateHybridClusterCount")
    @Expose
    private Long UserCreateHybridClusterCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群总数 
     * @return TotalCount 集群总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 集群总数
     * @param TotalCount 集群总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 有风险的集群数量 
     * @return RiskClusterCount 有风险的集群数量
     */
    public Long getRiskClusterCount() {
        return this.RiskClusterCount;
    }

    /**
     * Set 有风险的集群数量
     * @param RiskClusterCount 有风险的集群数量
     */
    public void setRiskClusterCount(Long RiskClusterCount) {
        this.RiskClusterCount = RiskClusterCount;
    }

    /**
     * Get 未检查的集群数量 
     * @return UncheckClusterCount 未检查的集群数量
     */
    public Long getUncheckClusterCount() {
        return this.UncheckClusterCount;
    }

    /**
     * Set 未检查的集群数量
     * @param UncheckClusterCount 未检查的集群数量
     */
    public void setUncheckClusterCount(Long UncheckClusterCount) {
        this.UncheckClusterCount = UncheckClusterCount;
    }

    /**
     * Get 托管集群数量 
     * @return ManagedClusterCount 托管集群数量
     */
    public Long getManagedClusterCount() {
        return this.ManagedClusterCount;
    }

    /**
     * Set 托管集群数量
     * @param ManagedClusterCount 托管集群数量
     */
    public void setManagedClusterCount(Long ManagedClusterCount) {
        this.ManagedClusterCount = ManagedClusterCount;
    }

    /**
     * Get 独立集群数量 
     * @return IndependentClusterCount 独立集群数量
     */
    public Long getIndependentClusterCount() {
        return this.IndependentClusterCount;
    }

    /**
     * Set 独立集群数量
     * @param IndependentClusterCount 独立集群数量
     */
    public void setIndependentClusterCount(Long IndependentClusterCount) {
        this.IndependentClusterCount = IndependentClusterCount;
    }

    /**
     * Get 无风险的集群数量 
     * @return NoRiskClusterCount 无风险的集群数量
     */
    public Long getNoRiskClusterCount() {
        return this.NoRiskClusterCount;
    }

    /**
     * Set 无风险的集群数量
     * @param NoRiskClusterCount 无风险的集群数量
     */
    public void setNoRiskClusterCount(Long NoRiskClusterCount) {
        this.NoRiskClusterCount = NoRiskClusterCount;
    }

    /**
     * Get 已经检查集群数 
     * @return CheckedClusterCount 已经检查集群数
     */
    public Long getCheckedClusterCount() {
        return this.CheckedClusterCount;
    }

    /**
     * Set 已经检查集群数
     * @param CheckedClusterCount 已经检查集群数
     */
    public void setCheckedClusterCount(Long CheckedClusterCount) {
        this.CheckedClusterCount = CheckedClusterCount;
    }

    /**
     * Get 自动检查集群数 
     * @return AutoCheckClusterCount 自动检查集群数
     */
    public Long getAutoCheckClusterCount() {
        return this.AutoCheckClusterCount;
    }

    /**
     * Set 自动检查集群数
     * @param AutoCheckClusterCount 自动检查集群数
     */
    public void setAutoCheckClusterCount(Long AutoCheckClusterCount) {
        this.AutoCheckClusterCount = AutoCheckClusterCount;
    }

    /**
     * Get 手动检查集群数 
     * @return ManualCheckClusterCount 手动检查集群数
     */
    public Long getManualCheckClusterCount() {
        return this.ManualCheckClusterCount;
    }

    /**
     * Set 手动检查集群数
     * @param ManualCheckClusterCount 手动检查集群数
     */
    public void setManualCheckClusterCount(Long ManualCheckClusterCount) {
        this.ManualCheckClusterCount = ManualCheckClusterCount;
    }

    /**
     * Get 检查失败集群数 
     * @return FailedClusterCount 检查失败集群数
     */
    public Long getFailedClusterCount() {
        return this.FailedClusterCount;
    }

    /**
     * Set 检查失败集群数
     * @param FailedClusterCount 检查失败集群数
     */
    public void setFailedClusterCount(Long FailedClusterCount) {
        this.FailedClusterCount = FailedClusterCount;
    }

    /**
     * Get 未导入的集群数量 
     * @return NotImportedClusterCount 未导入的集群数量
     */
    public Long getNotImportedClusterCount() {
        return this.NotImportedClusterCount;
    }

    /**
     * Set 未导入的集群数量
     * @param NotImportedClusterCount 未导入的集群数量
     */
    public void setNotImportedClusterCount(Long NotImportedClusterCount) {
        this.NotImportedClusterCount = NotImportedClusterCount;
    }

    /**
     * Get eks集群数量 
     * @return ServerlessClusterCount eks集群数量
     */
    public Long getServerlessClusterCount() {
        return this.ServerlessClusterCount;
    }

    /**
     * Set eks集群数量
     * @param ServerlessClusterCount eks集群数量
     */
    public void setServerlessClusterCount(Long ServerlessClusterCount) {
        this.ServerlessClusterCount = ServerlessClusterCount;
    }

    /**
     * Get TKE集群数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TkeClusterCount TKE集群数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTkeClusterCount() {
        return this.TkeClusterCount;
    }

    /**
     * Set TKE集群数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TkeClusterCount TKE集群数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTkeClusterCount(Long TkeClusterCount) {
        this.TkeClusterCount = TkeClusterCount;
    }

    /**
     * Get 用户自建腾讯云集群数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserCreateTencentClusterCount 用户自建腾讯云集群数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserCreateTencentClusterCount() {
        return this.UserCreateTencentClusterCount;
    }

    /**
     * Set 用户自建腾讯云集群数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserCreateTencentClusterCount 用户自建腾讯云集群数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserCreateTencentClusterCount(Long UserCreateTencentClusterCount) {
        this.UserCreateTencentClusterCount = UserCreateTencentClusterCount;
    }

    /**
     * Get 用户自建集群混合云数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserCreateHybridClusterCount 用户自建集群混合云数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserCreateHybridClusterCount() {
        return this.UserCreateHybridClusterCount;
    }

    /**
     * Set 用户自建集群混合云数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserCreateHybridClusterCount 用户自建集群混合云数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserCreateHybridClusterCount(Long UserCreateHybridClusterCount) {
        this.UserCreateHybridClusterCount = UserCreateHybridClusterCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterSummaryResponse(DescribeClusterSummaryResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RiskClusterCount != null) {
            this.RiskClusterCount = new Long(source.RiskClusterCount);
        }
        if (source.UncheckClusterCount != null) {
            this.UncheckClusterCount = new Long(source.UncheckClusterCount);
        }
        if (source.ManagedClusterCount != null) {
            this.ManagedClusterCount = new Long(source.ManagedClusterCount);
        }
        if (source.IndependentClusterCount != null) {
            this.IndependentClusterCount = new Long(source.IndependentClusterCount);
        }
        if (source.NoRiskClusterCount != null) {
            this.NoRiskClusterCount = new Long(source.NoRiskClusterCount);
        }
        if (source.CheckedClusterCount != null) {
            this.CheckedClusterCount = new Long(source.CheckedClusterCount);
        }
        if (source.AutoCheckClusterCount != null) {
            this.AutoCheckClusterCount = new Long(source.AutoCheckClusterCount);
        }
        if (source.ManualCheckClusterCount != null) {
            this.ManualCheckClusterCount = new Long(source.ManualCheckClusterCount);
        }
        if (source.FailedClusterCount != null) {
            this.FailedClusterCount = new Long(source.FailedClusterCount);
        }
        if (source.NotImportedClusterCount != null) {
            this.NotImportedClusterCount = new Long(source.NotImportedClusterCount);
        }
        if (source.ServerlessClusterCount != null) {
            this.ServerlessClusterCount = new Long(source.ServerlessClusterCount);
        }
        if (source.TkeClusterCount != null) {
            this.TkeClusterCount = new Long(source.TkeClusterCount);
        }
        if (source.UserCreateTencentClusterCount != null) {
            this.UserCreateTencentClusterCount = new Long(source.UserCreateTencentClusterCount);
        }
        if (source.UserCreateHybridClusterCount != null) {
            this.UserCreateHybridClusterCount = new Long(source.UserCreateHybridClusterCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RiskClusterCount", this.RiskClusterCount);
        this.setParamSimple(map, prefix + "UncheckClusterCount", this.UncheckClusterCount);
        this.setParamSimple(map, prefix + "ManagedClusterCount", this.ManagedClusterCount);
        this.setParamSimple(map, prefix + "IndependentClusterCount", this.IndependentClusterCount);
        this.setParamSimple(map, prefix + "NoRiskClusterCount", this.NoRiskClusterCount);
        this.setParamSimple(map, prefix + "CheckedClusterCount", this.CheckedClusterCount);
        this.setParamSimple(map, prefix + "AutoCheckClusterCount", this.AutoCheckClusterCount);
        this.setParamSimple(map, prefix + "ManualCheckClusterCount", this.ManualCheckClusterCount);
        this.setParamSimple(map, prefix + "FailedClusterCount", this.FailedClusterCount);
        this.setParamSimple(map, prefix + "NotImportedClusterCount", this.NotImportedClusterCount);
        this.setParamSimple(map, prefix + "ServerlessClusterCount", this.ServerlessClusterCount);
        this.setParamSimple(map, prefix + "TkeClusterCount", this.TkeClusterCount);
        this.setParamSimple(map, prefix + "UserCreateTencentClusterCount", this.UserCreateTencentClusterCount);
        this.setParamSimple(map, prefix + "UserCreateHybridClusterCount", this.UserCreateHybridClusterCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

