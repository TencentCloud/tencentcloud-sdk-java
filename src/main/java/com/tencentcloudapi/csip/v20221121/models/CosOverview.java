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

public class CosOverview extends AbstractModel {

    /**
    * 资产总数
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 需要立即处理的资产数
    */
    @SerializedName("AlarmAssetCount")
    @Expose
    private Long AlarmAssetCount;

    /**
    * 需要加固的资产数
    */
    @SerializedName("RiskAssetCount")
    @Expose
    private Long RiskAssetCount;

    /**
    * 告警总数
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * 当日新增告警总数
    */
    @SerializedName("IncrementAlarmCount")
    @Expose
    private Long IncrementAlarmCount;

    /**
    * 风险总数
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 当日新增告警总数
    */
    @SerializedName("IncrementRiskCount")
    @Expose
    private Long IncrementRiskCount;

    /**
    * 风险top详情
    */
    @SerializedName("RiskTop")
    @Expose
    private CosRiskInfo [] RiskTop;

    /**
    * 告警风险top
    */
    @SerializedName("AlarmTop")
    @Expose
    private CosRiskInfo [] AlarmTop;

    /**
     * Get 资产总数 
     * @return AssetCount 资产总数
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 资产总数
     * @param AssetCount 资产总数
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get 需要立即处理的资产数 
     * @return AlarmAssetCount 需要立即处理的资产数
     */
    public Long getAlarmAssetCount() {
        return this.AlarmAssetCount;
    }

    /**
     * Set 需要立即处理的资产数
     * @param AlarmAssetCount 需要立即处理的资产数
     */
    public void setAlarmAssetCount(Long AlarmAssetCount) {
        this.AlarmAssetCount = AlarmAssetCount;
    }

    /**
     * Get 需要加固的资产数 
     * @return RiskAssetCount 需要加固的资产数
     */
    public Long getRiskAssetCount() {
        return this.RiskAssetCount;
    }

    /**
     * Set 需要加固的资产数
     * @param RiskAssetCount 需要加固的资产数
     */
    public void setRiskAssetCount(Long RiskAssetCount) {
        this.RiskAssetCount = RiskAssetCount;
    }

    /**
     * Get 告警总数 
     * @return AlarmCount 告警总数
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set 告警总数
     * @param AlarmCount 告警总数
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get 当日新增告警总数 
     * @return IncrementAlarmCount 当日新增告警总数
     */
    public Long getIncrementAlarmCount() {
        return this.IncrementAlarmCount;
    }

    /**
     * Set 当日新增告警总数
     * @param IncrementAlarmCount 当日新增告警总数
     */
    public void setIncrementAlarmCount(Long IncrementAlarmCount) {
        this.IncrementAlarmCount = IncrementAlarmCount;
    }

    /**
     * Get 风险总数 
     * @return RiskCount 风险总数
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险总数
     * @param RiskCount 风险总数
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 当日新增告警总数 
     * @return IncrementRiskCount 当日新增告警总数
     */
    public Long getIncrementRiskCount() {
        return this.IncrementRiskCount;
    }

    /**
     * Set 当日新增告警总数
     * @param IncrementRiskCount 当日新增告警总数
     */
    public void setIncrementRiskCount(Long IncrementRiskCount) {
        this.IncrementRiskCount = IncrementRiskCount;
    }

    /**
     * Get 风险top详情 
     * @return RiskTop 风险top详情
     */
    public CosRiskInfo [] getRiskTop() {
        return this.RiskTop;
    }

    /**
     * Set 风险top详情
     * @param RiskTop 风险top详情
     */
    public void setRiskTop(CosRiskInfo [] RiskTop) {
        this.RiskTop = RiskTop;
    }

    /**
     * Get 告警风险top 
     * @return AlarmTop 告警风险top
     */
    public CosRiskInfo [] getAlarmTop() {
        return this.AlarmTop;
    }

    /**
     * Set 告警风险top
     * @param AlarmTop 告警风险top
     */
    public void setAlarmTop(CosRiskInfo [] AlarmTop) {
        this.AlarmTop = AlarmTop;
    }

    public CosOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosOverview(CosOverview source) {
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.AlarmAssetCount != null) {
            this.AlarmAssetCount = new Long(source.AlarmAssetCount);
        }
        if (source.RiskAssetCount != null) {
            this.RiskAssetCount = new Long(source.RiskAssetCount);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.IncrementAlarmCount != null) {
            this.IncrementAlarmCount = new Long(source.IncrementAlarmCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.IncrementRiskCount != null) {
            this.IncrementRiskCount = new Long(source.IncrementRiskCount);
        }
        if (source.RiskTop != null) {
            this.RiskTop = new CosRiskInfo[source.RiskTop.length];
            for (int i = 0; i < source.RiskTop.length; i++) {
                this.RiskTop[i] = new CosRiskInfo(source.RiskTop[i]);
            }
        }
        if (source.AlarmTop != null) {
            this.AlarmTop = new CosRiskInfo[source.AlarmTop.length];
            for (int i = 0; i < source.AlarmTop.length; i++) {
                this.AlarmTop[i] = new CosRiskInfo(source.AlarmTop[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "AlarmAssetCount", this.AlarmAssetCount);
        this.setParamSimple(map, prefix + "RiskAssetCount", this.RiskAssetCount);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "IncrementAlarmCount", this.IncrementAlarmCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "IncrementRiskCount", this.IncrementRiskCount);
        this.setParamArrayObj(map, prefix + "RiskTop.", this.RiskTop);
        this.setParamArrayObj(map, prefix + "AlarmTop.", this.AlarmTop);

    }
}

