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
    * <p>资产总数</p>
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * <p>需要立即处理的资产数</p>
    */
    @SerializedName("AlarmAssetCount")
    @Expose
    private Long AlarmAssetCount;

    /**
    * <p>需要加固的资产数</p>
    */
    @SerializedName("RiskAssetCount")
    @Expose
    private Long RiskAssetCount;

    /**
    * <p>告警总数</p>
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * <p>当日新增告警总数</p>
    */
    @SerializedName("IncrementAlarmCount")
    @Expose
    private Long IncrementAlarmCount;

    /**
    * <p>风险总数</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>当日新增告警总数</p>
    */
    @SerializedName("IncrementRiskCount")
    @Expose
    private Long IncrementRiskCount;

    /**
    * <p>风险top详情</p>
    */
    @SerializedName("RiskTop")
    @Expose
    private CosRiskInfo [] RiskTop;

    /**
    * <p>告警风险top</p>
    */
    @SerializedName("AlarmTop")
    @Expose
    private CosRiskInfo [] AlarmTop;

    /**
    * <p>高等级敏感文件数</p>
    */
    @SerializedName("HighLevelSensitiveFileCount")
    @Expose
    private Long HighLevelSensitiveFileCount;

    /**
     * Get <p>资产总数</p> 
     * @return AssetCount <p>资产总数</p>
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set <p>资产总数</p>
     * @param AssetCount <p>资产总数</p>
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get <p>需要立即处理的资产数</p> 
     * @return AlarmAssetCount <p>需要立即处理的资产数</p>
     */
    public Long getAlarmAssetCount() {
        return this.AlarmAssetCount;
    }

    /**
     * Set <p>需要立即处理的资产数</p>
     * @param AlarmAssetCount <p>需要立即处理的资产数</p>
     */
    public void setAlarmAssetCount(Long AlarmAssetCount) {
        this.AlarmAssetCount = AlarmAssetCount;
    }

    /**
     * Get <p>需要加固的资产数</p> 
     * @return RiskAssetCount <p>需要加固的资产数</p>
     */
    public Long getRiskAssetCount() {
        return this.RiskAssetCount;
    }

    /**
     * Set <p>需要加固的资产数</p>
     * @param RiskAssetCount <p>需要加固的资产数</p>
     */
    public void setRiskAssetCount(Long RiskAssetCount) {
        this.RiskAssetCount = RiskAssetCount;
    }

    /**
     * Get <p>告警总数</p> 
     * @return AlarmCount <p>告警总数</p>
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set <p>告警总数</p>
     * @param AlarmCount <p>告警总数</p>
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get <p>当日新增告警总数</p> 
     * @return IncrementAlarmCount <p>当日新增告警总数</p>
     */
    public Long getIncrementAlarmCount() {
        return this.IncrementAlarmCount;
    }

    /**
     * Set <p>当日新增告警总数</p>
     * @param IncrementAlarmCount <p>当日新增告警总数</p>
     */
    public void setIncrementAlarmCount(Long IncrementAlarmCount) {
        this.IncrementAlarmCount = IncrementAlarmCount;
    }

    /**
     * Get <p>风险总数</p> 
     * @return RiskCount <p>风险总数</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>风险总数</p>
     * @param RiskCount <p>风险总数</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>当日新增告警总数</p> 
     * @return IncrementRiskCount <p>当日新增告警总数</p>
     */
    public Long getIncrementRiskCount() {
        return this.IncrementRiskCount;
    }

    /**
     * Set <p>当日新增告警总数</p>
     * @param IncrementRiskCount <p>当日新增告警总数</p>
     */
    public void setIncrementRiskCount(Long IncrementRiskCount) {
        this.IncrementRiskCount = IncrementRiskCount;
    }

    /**
     * Get <p>风险top详情</p> 
     * @return RiskTop <p>风险top详情</p>
     */
    public CosRiskInfo [] getRiskTop() {
        return this.RiskTop;
    }

    /**
     * Set <p>风险top详情</p>
     * @param RiskTop <p>风险top详情</p>
     */
    public void setRiskTop(CosRiskInfo [] RiskTop) {
        this.RiskTop = RiskTop;
    }

    /**
     * Get <p>告警风险top</p> 
     * @return AlarmTop <p>告警风险top</p>
     */
    public CosRiskInfo [] getAlarmTop() {
        return this.AlarmTop;
    }

    /**
     * Set <p>告警风险top</p>
     * @param AlarmTop <p>告警风险top</p>
     */
    public void setAlarmTop(CosRiskInfo [] AlarmTop) {
        this.AlarmTop = AlarmTop;
    }

    /**
     * Get <p>高等级敏感文件数</p> 
     * @return HighLevelSensitiveFileCount <p>高等级敏感文件数</p>
     */
    public Long getHighLevelSensitiveFileCount() {
        return this.HighLevelSensitiveFileCount;
    }

    /**
     * Set <p>高等级敏感文件数</p>
     * @param HighLevelSensitiveFileCount <p>高等级敏感文件数</p>
     */
    public void setHighLevelSensitiveFileCount(Long HighLevelSensitiveFileCount) {
        this.HighLevelSensitiveFileCount = HighLevelSensitiveFileCount;
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
        if (source.HighLevelSensitiveFileCount != null) {
            this.HighLevelSensitiveFileCount = new Long(source.HighLevelSensitiveFileCount);
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
        this.setParamSimple(map, prefix + "HighLevelSensitiveFileCount", this.HighLevelSensitiveFileCount);

    }
}

