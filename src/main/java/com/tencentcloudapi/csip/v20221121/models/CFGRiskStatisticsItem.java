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

public class CFGRiskStatisticsItem extends AbstractModel {

    /**
    * <p>风险总数</p>
    */
    @SerializedName("TotalRiskCount")
    @Expose
    private Long TotalRiskCount;

    /**
    * <p>近7天新增风险数量</p>
    */
    @SerializedName("RiskAddCount")
    @Expose
    private Long RiskAddCount;

    /**
    * <p>全部云资源配置风险的待修复项</p>
    */
    @SerializedName("CheckViewCount")
    @Expose
    private Long CheckViewCount;

    /**
    * <p>高优待修复风险</p>
    */
    @SerializedName("HighPriorityRiskCount")
    @Expose
    private Long HighPriorityRiskCount;

    /**
    * <p>近7天新增的待修复项</p>
    */
    @SerializedName("CheckViewAddCount")
    @Expose
    private Long CheckViewAddCount;

    /**
    * <p>全部云资源配置风险的待修复项，高优待修复</p>
    */
    @SerializedName("HighPriorityCheckViewCount")
    @Expose
    private Long HighPriorityCheckViewCount;

    /**
    * <p>资产视角下的展示条数</p>
    */
    @SerializedName("AssetViewCount")
    @Expose
    private Long AssetViewCount;

    /**
    * <p>近7天新增的待修复资产条数</p>
    */
    @SerializedName("AssetViewAddCount")
    @Expose
    private Long AssetViewAddCount;

    /**
    * <p>资产视角下的展示条数，高优待修复量</p>
    */
    @SerializedName("HighPriorityAssetViewCount")
    @Expose
    private Long HighPriorityAssetViewCount;

    /**
     * Get <p>风险总数</p> 
     * @return TotalRiskCount <p>风险总数</p>
     */
    public Long getTotalRiskCount() {
        return this.TotalRiskCount;
    }

    /**
     * Set <p>风险总数</p>
     * @param TotalRiskCount <p>风险总数</p>
     */
    public void setTotalRiskCount(Long TotalRiskCount) {
        this.TotalRiskCount = TotalRiskCount;
    }

    /**
     * Get <p>近7天新增风险数量</p> 
     * @return RiskAddCount <p>近7天新增风险数量</p>
     */
    public Long getRiskAddCount() {
        return this.RiskAddCount;
    }

    /**
     * Set <p>近7天新增风险数量</p>
     * @param RiskAddCount <p>近7天新增风险数量</p>
     */
    public void setRiskAddCount(Long RiskAddCount) {
        this.RiskAddCount = RiskAddCount;
    }

    /**
     * Get <p>全部云资源配置风险的待修复项</p> 
     * @return CheckViewCount <p>全部云资源配置风险的待修复项</p>
     */
    public Long getCheckViewCount() {
        return this.CheckViewCount;
    }

    /**
     * Set <p>全部云资源配置风险的待修复项</p>
     * @param CheckViewCount <p>全部云资源配置风险的待修复项</p>
     */
    public void setCheckViewCount(Long CheckViewCount) {
        this.CheckViewCount = CheckViewCount;
    }

    /**
     * Get <p>高优待修复风险</p> 
     * @return HighPriorityRiskCount <p>高优待修复风险</p>
     */
    public Long getHighPriorityRiskCount() {
        return this.HighPriorityRiskCount;
    }

    /**
     * Set <p>高优待修复风险</p>
     * @param HighPriorityRiskCount <p>高优待修复风险</p>
     */
    public void setHighPriorityRiskCount(Long HighPriorityRiskCount) {
        this.HighPriorityRiskCount = HighPriorityRiskCount;
    }

    /**
     * Get <p>近7天新增的待修复项</p> 
     * @return CheckViewAddCount <p>近7天新增的待修复项</p>
     */
    public Long getCheckViewAddCount() {
        return this.CheckViewAddCount;
    }

    /**
     * Set <p>近7天新增的待修复项</p>
     * @param CheckViewAddCount <p>近7天新增的待修复项</p>
     */
    public void setCheckViewAddCount(Long CheckViewAddCount) {
        this.CheckViewAddCount = CheckViewAddCount;
    }

    /**
     * Get <p>全部云资源配置风险的待修复项，高优待修复</p> 
     * @return HighPriorityCheckViewCount <p>全部云资源配置风险的待修复项，高优待修复</p>
     */
    public Long getHighPriorityCheckViewCount() {
        return this.HighPriorityCheckViewCount;
    }

    /**
     * Set <p>全部云资源配置风险的待修复项，高优待修复</p>
     * @param HighPriorityCheckViewCount <p>全部云资源配置风险的待修复项，高优待修复</p>
     */
    public void setHighPriorityCheckViewCount(Long HighPriorityCheckViewCount) {
        this.HighPriorityCheckViewCount = HighPriorityCheckViewCount;
    }

    /**
     * Get <p>资产视角下的展示条数</p> 
     * @return AssetViewCount <p>资产视角下的展示条数</p>
     */
    public Long getAssetViewCount() {
        return this.AssetViewCount;
    }

    /**
     * Set <p>资产视角下的展示条数</p>
     * @param AssetViewCount <p>资产视角下的展示条数</p>
     */
    public void setAssetViewCount(Long AssetViewCount) {
        this.AssetViewCount = AssetViewCount;
    }

    /**
     * Get <p>近7天新增的待修复资产条数</p> 
     * @return AssetViewAddCount <p>近7天新增的待修复资产条数</p>
     */
    public Long getAssetViewAddCount() {
        return this.AssetViewAddCount;
    }

    /**
     * Set <p>近7天新增的待修复资产条数</p>
     * @param AssetViewAddCount <p>近7天新增的待修复资产条数</p>
     */
    public void setAssetViewAddCount(Long AssetViewAddCount) {
        this.AssetViewAddCount = AssetViewAddCount;
    }

    /**
     * Get <p>资产视角下的展示条数，高优待修复量</p> 
     * @return HighPriorityAssetViewCount <p>资产视角下的展示条数，高优待修复量</p>
     */
    public Long getHighPriorityAssetViewCount() {
        return this.HighPriorityAssetViewCount;
    }

    /**
     * Set <p>资产视角下的展示条数，高优待修复量</p>
     * @param HighPriorityAssetViewCount <p>资产视角下的展示条数，高优待修复量</p>
     */
    public void setHighPriorityAssetViewCount(Long HighPriorityAssetViewCount) {
        this.HighPriorityAssetViewCount = HighPriorityAssetViewCount;
    }

    public CFGRiskStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CFGRiskStatisticsItem(CFGRiskStatisticsItem source) {
        if (source.TotalRiskCount != null) {
            this.TotalRiskCount = new Long(source.TotalRiskCount);
        }
        if (source.RiskAddCount != null) {
            this.RiskAddCount = new Long(source.RiskAddCount);
        }
        if (source.CheckViewCount != null) {
            this.CheckViewCount = new Long(source.CheckViewCount);
        }
        if (source.HighPriorityRiskCount != null) {
            this.HighPriorityRiskCount = new Long(source.HighPriorityRiskCount);
        }
        if (source.CheckViewAddCount != null) {
            this.CheckViewAddCount = new Long(source.CheckViewAddCount);
        }
        if (source.HighPriorityCheckViewCount != null) {
            this.HighPriorityCheckViewCount = new Long(source.HighPriorityCheckViewCount);
        }
        if (source.AssetViewCount != null) {
            this.AssetViewCount = new Long(source.AssetViewCount);
        }
        if (source.AssetViewAddCount != null) {
            this.AssetViewAddCount = new Long(source.AssetViewAddCount);
        }
        if (source.HighPriorityAssetViewCount != null) {
            this.HighPriorityAssetViewCount = new Long(source.HighPriorityAssetViewCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalRiskCount", this.TotalRiskCount);
        this.setParamSimple(map, prefix + "RiskAddCount", this.RiskAddCount);
        this.setParamSimple(map, prefix + "CheckViewCount", this.CheckViewCount);
        this.setParamSimple(map, prefix + "HighPriorityRiskCount", this.HighPriorityRiskCount);
        this.setParamSimple(map, prefix + "CheckViewAddCount", this.CheckViewAddCount);
        this.setParamSimple(map, prefix + "HighPriorityCheckViewCount", this.HighPriorityCheckViewCount);
        this.setParamSimple(map, prefix + "AssetViewCount", this.AssetViewCount);
        this.setParamSimple(map, prefix + "AssetViewAddCount", this.AssetViewAddCount);
        this.setParamSimple(map, prefix + "HighPriorityAssetViewCount", this.HighPriorityAssetViewCount);

    }
}

