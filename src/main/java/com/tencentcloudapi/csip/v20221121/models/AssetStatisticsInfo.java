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

public class AssetStatisticsInfo extends AbstractModel {

    /**
    * <p>资产总数</p>
    */
    @SerializedName("AssetTotalCount")
    @Expose
    private Long AssetTotalCount;

    /**
    * <p>近7天新增资产数量</p>
    */
    @SerializedName("AssetAddCount")
    @Expose
    private Long AssetAddCount;

    /**
    * <p>有风险资产数量</p>
    */
    @SerializedName("RiskAssetCount")
    @Expose
    private Long RiskAssetCount;

    /**
    * <p>有告警资产数量</p>
    */
    @SerializedName("AlarmAssetCount")
    @Expose
    private Long AlarmAssetCount;

    /**
    * <p>公网资产数量</p>
    */
    @SerializedName("PublicAssetCount")
    @Expose
    private Long PublicAssetCount;

    /**
    * <p>暴露资产数量</p>
    */
    @SerializedName("ExposeAssetCount")
    @Expose
    private Long ExposeAssetCount;

    /**
    * <p>主机资产数量</p>
    */
    @SerializedName("CloudHostAssetCount")
    @Expose
    private Long CloudHostAssetCount;

    /**
     * Get <p>资产总数</p> 
     * @return AssetTotalCount <p>资产总数</p>
     */
    public Long getAssetTotalCount() {
        return this.AssetTotalCount;
    }

    /**
     * Set <p>资产总数</p>
     * @param AssetTotalCount <p>资产总数</p>
     */
    public void setAssetTotalCount(Long AssetTotalCount) {
        this.AssetTotalCount = AssetTotalCount;
    }

    /**
     * Get <p>近7天新增资产数量</p> 
     * @return AssetAddCount <p>近7天新增资产数量</p>
     */
    public Long getAssetAddCount() {
        return this.AssetAddCount;
    }

    /**
     * Set <p>近7天新增资产数量</p>
     * @param AssetAddCount <p>近7天新增资产数量</p>
     */
    public void setAssetAddCount(Long AssetAddCount) {
        this.AssetAddCount = AssetAddCount;
    }

    /**
     * Get <p>有风险资产数量</p> 
     * @return RiskAssetCount <p>有风险资产数量</p>
     */
    public Long getRiskAssetCount() {
        return this.RiskAssetCount;
    }

    /**
     * Set <p>有风险资产数量</p>
     * @param RiskAssetCount <p>有风险资产数量</p>
     */
    public void setRiskAssetCount(Long RiskAssetCount) {
        this.RiskAssetCount = RiskAssetCount;
    }

    /**
     * Get <p>有告警资产数量</p> 
     * @return AlarmAssetCount <p>有告警资产数量</p>
     */
    public Long getAlarmAssetCount() {
        return this.AlarmAssetCount;
    }

    /**
     * Set <p>有告警资产数量</p>
     * @param AlarmAssetCount <p>有告警资产数量</p>
     */
    public void setAlarmAssetCount(Long AlarmAssetCount) {
        this.AlarmAssetCount = AlarmAssetCount;
    }

    /**
     * Get <p>公网资产数量</p> 
     * @return PublicAssetCount <p>公网资产数量</p>
     */
    public Long getPublicAssetCount() {
        return this.PublicAssetCount;
    }

    /**
     * Set <p>公网资产数量</p>
     * @param PublicAssetCount <p>公网资产数量</p>
     */
    public void setPublicAssetCount(Long PublicAssetCount) {
        this.PublicAssetCount = PublicAssetCount;
    }

    /**
     * Get <p>暴露资产数量</p> 
     * @return ExposeAssetCount <p>暴露资产数量</p>
     */
    public Long getExposeAssetCount() {
        return this.ExposeAssetCount;
    }

    /**
     * Set <p>暴露资产数量</p>
     * @param ExposeAssetCount <p>暴露资产数量</p>
     */
    public void setExposeAssetCount(Long ExposeAssetCount) {
        this.ExposeAssetCount = ExposeAssetCount;
    }

    /**
     * Get <p>主机资产数量</p> 
     * @return CloudHostAssetCount <p>主机资产数量</p>
     */
    public Long getCloudHostAssetCount() {
        return this.CloudHostAssetCount;
    }

    /**
     * Set <p>主机资产数量</p>
     * @param CloudHostAssetCount <p>主机资产数量</p>
     */
    public void setCloudHostAssetCount(Long CloudHostAssetCount) {
        this.CloudHostAssetCount = CloudHostAssetCount;
    }

    public AssetStatisticsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetStatisticsInfo(AssetStatisticsInfo source) {
        if (source.AssetTotalCount != null) {
            this.AssetTotalCount = new Long(source.AssetTotalCount);
        }
        if (source.AssetAddCount != null) {
            this.AssetAddCount = new Long(source.AssetAddCount);
        }
        if (source.RiskAssetCount != null) {
            this.RiskAssetCount = new Long(source.RiskAssetCount);
        }
        if (source.AlarmAssetCount != null) {
            this.AlarmAssetCount = new Long(source.AlarmAssetCount);
        }
        if (source.PublicAssetCount != null) {
            this.PublicAssetCount = new Long(source.PublicAssetCount);
        }
        if (source.ExposeAssetCount != null) {
            this.ExposeAssetCount = new Long(source.ExposeAssetCount);
        }
        if (source.CloudHostAssetCount != null) {
            this.CloudHostAssetCount = new Long(source.CloudHostAssetCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetTotalCount", this.AssetTotalCount);
        this.setParamSimple(map, prefix + "AssetAddCount", this.AssetAddCount);
        this.setParamSimple(map, prefix + "RiskAssetCount", this.RiskAssetCount);
        this.setParamSimple(map, prefix + "AlarmAssetCount", this.AlarmAssetCount);
        this.setParamSimple(map, prefix + "PublicAssetCount", this.PublicAssetCount);
        this.setParamSimple(map, prefix + "ExposeAssetCount", this.ExposeAssetCount);
        this.setParamSimple(map, prefix + "CloudHostAssetCount", this.CloudHostAssetCount);

    }
}

