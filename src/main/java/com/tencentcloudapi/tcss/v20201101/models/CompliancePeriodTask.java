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

public class CompliancePeriodTask extends AbstractModel{

    /**
    * 周期任务的ID
    */
    @SerializedName("PeriodTaskId")
    @Expose
    private Long PeriodTaskId;

    /**
    * 资产类型。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 最近一次触发的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTriggerTime")
    @Expose
    private String LastTriggerTime;

    /**
    * 总的检查项数目
    */
    @SerializedName("TotalPolicyItemCount")
    @Expose
    private Long TotalPolicyItemCount;

    /**
    * 周期设置
    */
    @SerializedName("PeriodRule")
    @Expose
    private CompliancePeriodTaskRule PeriodRule;

    /**
    * 合规标准列表
    */
    @SerializedName("BenchmarkStandardSet")
    @Expose
    private ComplianceBenchmarkStandard [] BenchmarkStandardSet;

    /**
     * Get 周期任务的ID 
     * @return PeriodTaskId 周期任务的ID
     */
    public Long getPeriodTaskId() {
        return this.PeriodTaskId;
    }

    /**
     * Set 周期任务的ID
     * @param PeriodTaskId 周期任务的ID
     */
    public void setPeriodTaskId(Long PeriodTaskId) {
        this.PeriodTaskId = PeriodTaskId;
    }

    /**
     * Get 资产类型。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产 
     * @return AssetType 资产类型。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
     * @param AssetType 资产类型。
ASSET_CONTAINER, 容器
ASSET_IMAGE, 镜像
ASSET_HOST, 主机
ASSET_K8S, K8S资产
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 最近一次触发的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTriggerTime 最近一次触发的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTriggerTime() {
        return this.LastTriggerTime;
    }

    /**
     * Set 最近一次触发的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTriggerTime 最近一次触发的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTriggerTime(String LastTriggerTime) {
        this.LastTriggerTime = LastTriggerTime;
    }

    /**
     * Get 总的检查项数目 
     * @return TotalPolicyItemCount 总的检查项数目
     */
    public Long getTotalPolicyItemCount() {
        return this.TotalPolicyItemCount;
    }

    /**
     * Set 总的检查项数目
     * @param TotalPolicyItemCount 总的检查项数目
     */
    public void setTotalPolicyItemCount(Long TotalPolicyItemCount) {
        this.TotalPolicyItemCount = TotalPolicyItemCount;
    }

    /**
     * Get 周期设置 
     * @return PeriodRule 周期设置
     */
    public CompliancePeriodTaskRule getPeriodRule() {
        return this.PeriodRule;
    }

    /**
     * Set 周期设置
     * @param PeriodRule 周期设置
     */
    public void setPeriodRule(CompliancePeriodTaskRule PeriodRule) {
        this.PeriodRule = PeriodRule;
    }

    /**
     * Get 合规标准列表 
     * @return BenchmarkStandardSet 合规标准列表
     */
    public ComplianceBenchmarkStandard [] getBenchmarkStandardSet() {
        return this.BenchmarkStandardSet;
    }

    /**
     * Set 合规标准列表
     * @param BenchmarkStandardSet 合规标准列表
     */
    public void setBenchmarkStandardSet(ComplianceBenchmarkStandard [] BenchmarkStandardSet) {
        this.BenchmarkStandardSet = BenchmarkStandardSet;
    }

    public CompliancePeriodTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompliancePeriodTask(CompliancePeriodTask source) {
        if (source.PeriodTaskId != null) {
            this.PeriodTaskId = new Long(source.PeriodTaskId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.LastTriggerTime != null) {
            this.LastTriggerTime = new String(source.LastTriggerTime);
        }
        if (source.TotalPolicyItemCount != null) {
            this.TotalPolicyItemCount = new Long(source.TotalPolicyItemCount);
        }
        if (source.PeriodRule != null) {
            this.PeriodRule = new CompliancePeriodTaskRule(source.PeriodRule);
        }
        if (source.BenchmarkStandardSet != null) {
            this.BenchmarkStandardSet = new ComplianceBenchmarkStandard[source.BenchmarkStandardSet.length];
            for (int i = 0; i < source.BenchmarkStandardSet.length; i++) {
                this.BenchmarkStandardSet[i] = new ComplianceBenchmarkStandard(source.BenchmarkStandardSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeriodTaskId", this.PeriodTaskId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "LastTriggerTime", this.LastTriggerTime);
        this.setParamSimple(map, prefix + "TotalPolicyItemCount", this.TotalPolicyItemCount);
        this.setParamObj(map, prefix + "PeriodRule.", this.PeriodRule);
        this.setParamArrayObj(map, prefix + "BenchmarkStandardSet.", this.BenchmarkStandardSet);

    }
}

