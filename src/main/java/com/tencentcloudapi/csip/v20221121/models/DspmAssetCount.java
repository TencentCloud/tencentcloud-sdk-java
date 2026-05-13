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

public class DspmAssetCount extends AbstractModel {

    /**
    * 资产个数
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 资产有危险风险的个数
    */
    @SerializedName("DangerRiskCount")
    @Expose
    private Long DangerRiskCount;

    /**
    * 资产有低风险的个数
    */
    @SerializedName("LowRiskCount")
    @Expose
    private Long LowRiskCount;

    /**
    * 有待处理风险的实例数
    */
    @SerializedName("RiskAssetCount")
    @Expose
    private Long RiskAssetCount;

    /**
    * 有待处理告警的实例数
    */
    @SerializedName("AlarmAssetCount")
    @Expose
    private Long AlarmAssetCount;

    /**
     * Get 资产个数 
     * @return AssetCount 资产个数
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 资产个数
     * @param AssetCount 资产个数
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get 资产有危险风险的个数 
     * @return DangerRiskCount 资产有危险风险的个数
     */
    public Long getDangerRiskCount() {
        return this.DangerRiskCount;
    }

    /**
     * Set 资产有危险风险的个数
     * @param DangerRiskCount 资产有危险风险的个数
     */
    public void setDangerRiskCount(Long DangerRiskCount) {
        this.DangerRiskCount = DangerRiskCount;
    }

    /**
     * Get 资产有低风险的个数 
     * @return LowRiskCount 资产有低风险的个数
     */
    public Long getLowRiskCount() {
        return this.LowRiskCount;
    }

    /**
     * Set 资产有低风险的个数
     * @param LowRiskCount 资产有低风险的个数
     */
    public void setLowRiskCount(Long LowRiskCount) {
        this.LowRiskCount = LowRiskCount;
    }

    /**
     * Get 有待处理风险的实例数 
     * @return RiskAssetCount 有待处理风险的实例数
     */
    public Long getRiskAssetCount() {
        return this.RiskAssetCount;
    }

    /**
     * Set 有待处理风险的实例数
     * @param RiskAssetCount 有待处理风险的实例数
     */
    public void setRiskAssetCount(Long RiskAssetCount) {
        this.RiskAssetCount = RiskAssetCount;
    }

    /**
     * Get 有待处理告警的实例数 
     * @return AlarmAssetCount 有待处理告警的实例数
     */
    public Long getAlarmAssetCount() {
        return this.AlarmAssetCount;
    }

    /**
     * Set 有待处理告警的实例数
     * @param AlarmAssetCount 有待处理告警的实例数
     */
    public void setAlarmAssetCount(Long AlarmAssetCount) {
        this.AlarmAssetCount = AlarmAssetCount;
    }

    public DspmAssetCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetCount(DspmAssetCount source) {
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.DangerRiskCount != null) {
            this.DangerRiskCount = new Long(source.DangerRiskCount);
        }
        if (source.LowRiskCount != null) {
            this.LowRiskCount = new Long(source.LowRiskCount);
        }
        if (source.RiskAssetCount != null) {
            this.RiskAssetCount = new Long(source.RiskAssetCount);
        }
        if (source.AlarmAssetCount != null) {
            this.AlarmAssetCount = new Long(source.AlarmAssetCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "DangerRiskCount", this.DangerRiskCount);
        this.setParamSimple(map, prefix + "LowRiskCount", this.LowRiskCount);
        this.setParamSimple(map, prefix + "RiskAssetCount", this.RiskAssetCount);
        this.setParamSimple(map, prefix + "AlarmAssetCount", this.AlarmAssetCount);

    }
}

