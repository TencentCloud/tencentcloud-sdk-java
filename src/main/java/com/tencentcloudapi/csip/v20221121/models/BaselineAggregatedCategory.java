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

public class BaselineAggregatedCategory extends AbstractModel {

    /**
    * <p>基线子分类基础信息（含分类 ID、名称、描述）。</p>
    */
    @SerializedName("Category")
    @Expose
    private BaselineCategory Category;

    /**
    * <p>该子分类下未通过检测项按风险等级的分布统计。</p>
    */
    @SerializedName("NotPassItemRiskLevelStatistic")
    @Expose
    private BaselineRiskLevelStatistic [] NotPassItemRiskLevelStatistic;

    /**
    * <p>该子分类下结果为 PASS 的检测项数量。</p>
    */
    @SerializedName("PassItemCount")
    @Expose
    private Long PassItemCount;

    /**
    * <p>该子分类下结果为 NOT_PASS 的检测项数量。</p>
    */
    @SerializedName("NotPassItemCount")
    @Expose
    private Long NotPassItemCount;

    /**
    * <p>该子分类下检测项通过率，单位为百分比（0~100），保留两位小数。</p>
    */
    @SerializedName("PassRate")
    @Expose
    private Float PassRate;

    /**
    * <p>该基线类别是否被扫描过</p>
    */
    @SerializedName("Scanned")
    @Expose
    private Boolean Scanned;

    /**
     * Get <p>基线子分类基础信息（含分类 ID、名称、描述）。</p> 
     * @return Category <p>基线子分类基础信息（含分类 ID、名称、描述）。</p>
     */
    public BaselineCategory getCategory() {
        return this.Category;
    }

    /**
     * Set <p>基线子分类基础信息（含分类 ID、名称、描述）。</p>
     * @param Category <p>基线子分类基础信息（含分类 ID、名称、描述）。</p>
     */
    public void setCategory(BaselineCategory Category) {
        this.Category = Category;
    }

    /**
     * Get <p>该子分类下未通过检测项按风险等级的分布统计。</p> 
     * @return NotPassItemRiskLevelStatistic <p>该子分类下未通过检测项按风险等级的分布统计。</p>
     */
    public BaselineRiskLevelStatistic [] getNotPassItemRiskLevelStatistic() {
        return this.NotPassItemRiskLevelStatistic;
    }

    /**
     * Set <p>该子分类下未通过检测项按风险等级的分布统计。</p>
     * @param NotPassItemRiskLevelStatistic <p>该子分类下未通过检测项按风险等级的分布统计。</p>
     */
    public void setNotPassItemRiskLevelStatistic(BaselineRiskLevelStatistic [] NotPassItemRiskLevelStatistic) {
        this.NotPassItemRiskLevelStatistic = NotPassItemRiskLevelStatistic;
    }

    /**
     * Get <p>该子分类下结果为 PASS 的检测项数量。</p> 
     * @return PassItemCount <p>该子分类下结果为 PASS 的检测项数量。</p>
     */
    public Long getPassItemCount() {
        return this.PassItemCount;
    }

    /**
     * Set <p>该子分类下结果为 PASS 的检测项数量。</p>
     * @param PassItemCount <p>该子分类下结果为 PASS 的检测项数量。</p>
     */
    public void setPassItemCount(Long PassItemCount) {
        this.PassItemCount = PassItemCount;
    }

    /**
     * Get <p>该子分类下结果为 NOT_PASS 的检测项数量。</p> 
     * @return NotPassItemCount <p>该子分类下结果为 NOT_PASS 的检测项数量。</p>
     */
    public Long getNotPassItemCount() {
        return this.NotPassItemCount;
    }

    /**
     * Set <p>该子分类下结果为 NOT_PASS 的检测项数量。</p>
     * @param NotPassItemCount <p>该子分类下结果为 NOT_PASS 的检测项数量。</p>
     */
    public void setNotPassItemCount(Long NotPassItemCount) {
        this.NotPassItemCount = NotPassItemCount;
    }

    /**
     * Get <p>该子分类下检测项通过率，单位为百分比（0~100），保留两位小数。</p> 
     * @return PassRate <p>该子分类下检测项通过率，单位为百分比（0~100），保留两位小数。</p>
     */
    public Float getPassRate() {
        return this.PassRate;
    }

    /**
     * Set <p>该子分类下检测项通过率，单位为百分比（0~100），保留两位小数。</p>
     * @param PassRate <p>该子分类下检测项通过率，单位为百分比（0~100），保留两位小数。</p>
     */
    public void setPassRate(Float PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get <p>该基线类别是否被扫描过</p> 
     * @return Scanned <p>该基线类别是否被扫描过</p>
     */
    public Boolean getScanned() {
        return this.Scanned;
    }

    /**
     * Set <p>该基线类别是否被扫描过</p>
     * @param Scanned <p>该基线类别是否被扫描过</p>
     */
    public void setScanned(Boolean Scanned) {
        this.Scanned = Scanned;
    }

    public BaselineAggregatedCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineAggregatedCategory(BaselineAggregatedCategory source) {
        if (source.Category != null) {
            this.Category = new BaselineCategory(source.Category);
        }
        if (source.NotPassItemRiskLevelStatistic != null) {
            this.NotPassItemRiskLevelStatistic = new BaselineRiskLevelStatistic[source.NotPassItemRiskLevelStatistic.length];
            for (int i = 0; i < source.NotPassItemRiskLevelStatistic.length; i++) {
                this.NotPassItemRiskLevelStatistic[i] = new BaselineRiskLevelStatistic(source.NotPassItemRiskLevelStatistic[i]);
            }
        }
        if (source.PassItemCount != null) {
            this.PassItemCount = new Long(source.PassItemCount);
        }
        if (source.NotPassItemCount != null) {
            this.NotPassItemCount = new Long(source.NotPassItemCount);
        }
        if (source.PassRate != null) {
            this.PassRate = new Float(source.PassRate);
        }
        if (source.Scanned != null) {
            this.Scanned = new Boolean(source.Scanned);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Category.", this.Category);
        this.setParamArrayObj(map, prefix + "NotPassItemRiskLevelStatistic.", this.NotPassItemRiskLevelStatistic);
        this.setParamSimple(map, prefix + "PassItemCount", this.PassItemCount);
        this.setParamSimple(map, prefix + "NotPassItemCount", this.NotPassItemCount);
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamSimple(map, prefix + "Scanned", this.Scanned);

    }
}

