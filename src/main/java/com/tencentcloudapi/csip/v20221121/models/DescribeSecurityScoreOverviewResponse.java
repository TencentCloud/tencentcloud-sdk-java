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

public class DescribeSecurityScoreOverviewResponse extends AbstractModel {

    /**
    * <p>安全评分<br>取值范围：[0, 100]</p>
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * <p>安全等级<br>枚举值：<br>safe：安全(90-100分)<br>good：良好(70-89分)<br>medium：一般(40-69分)<br>danger：危险(0-39分)</p>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * <p>评分状态<br>枚举值：<br>success：全部数据源正常<br>partial_error：部分数据源使用了缓存<br>stale：使用上次完整快照<br>error：无法计算</p>
    */
    @SerializedName("ScoreStatus")
    @Expose
    private String ScoreStatus;

    /**
    * <p>初始分<br>默认值：100</p>
    */
    @SerializedName("InitialScore")
    @Expose
    private Long InitialScore;

    /**
    * <p>存在风险的分类数量（X类风险建议尽快处理）</p>
    */
    @SerializedName("RiskCategoryCount")
    @Expose
    private Long RiskCategoryCount;

    /**
    * <p>总扣分</p>
    */
    @SerializedName("DeductScore")
    @Expose
    private Long DeductScore;

    /**
    * <p>计算时间<br>参数格式：YYYY-MM-DDTHH:mm:ss+08:00</p>
    */
    @SerializedName("CalculatedAt")
    @Expose
    private String CalculatedAt;

    /**
    * <p>维度明细，含子项扣分和待办</p>
    */
    @SerializedName("Dimensions")
    @Expose
    private DimensionItem [] Dimensions;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>安全评分<br>取值范围：[0, 100]</p> 
     * @return Score <p>安全评分<br>取值范围：[0, 100]</p>
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set <p>安全评分<br>取值范围：[0, 100]</p>
     * @param Score <p>安全评分<br>取值范围：[0, 100]</p>
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get <p>安全等级<br>枚举值：<br>safe：安全(90-100分)<br>good：良好(70-89分)<br>medium：一般(40-69分)<br>danger：危险(0-39分)</p> 
     * @return Level <p>安全等级<br>枚举值：<br>safe：安全(90-100分)<br>good：良好(70-89分)<br>medium：一般(40-69分)<br>danger：危险(0-39分)</p>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set <p>安全等级<br>枚举值：<br>safe：安全(90-100分)<br>good：良好(70-89分)<br>medium：一般(40-69分)<br>danger：危险(0-39分)</p>
     * @param Level <p>安全等级<br>枚举值：<br>safe：安全(90-100分)<br>good：良好(70-89分)<br>medium：一般(40-69分)<br>danger：危险(0-39分)</p>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get <p>评分状态<br>枚举值：<br>success：全部数据源正常<br>partial_error：部分数据源使用了缓存<br>stale：使用上次完整快照<br>error：无法计算</p> 
     * @return ScoreStatus <p>评分状态<br>枚举值：<br>success：全部数据源正常<br>partial_error：部分数据源使用了缓存<br>stale：使用上次完整快照<br>error：无法计算</p>
     */
    public String getScoreStatus() {
        return this.ScoreStatus;
    }

    /**
     * Set <p>评分状态<br>枚举值：<br>success：全部数据源正常<br>partial_error：部分数据源使用了缓存<br>stale：使用上次完整快照<br>error：无法计算</p>
     * @param ScoreStatus <p>评分状态<br>枚举值：<br>success：全部数据源正常<br>partial_error：部分数据源使用了缓存<br>stale：使用上次完整快照<br>error：无法计算</p>
     */
    public void setScoreStatus(String ScoreStatus) {
        this.ScoreStatus = ScoreStatus;
    }

    /**
     * Get <p>初始分<br>默认值：100</p> 
     * @return InitialScore <p>初始分<br>默认值：100</p>
     */
    public Long getInitialScore() {
        return this.InitialScore;
    }

    /**
     * Set <p>初始分<br>默认值：100</p>
     * @param InitialScore <p>初始分<br>默认值：100</p>
     */
    public void setInitialScore(Long InitialScore) {
        this.InitialScore = InitialScore;
    }

    /**
     * Get <p>存在风险的分类数量（X类风险建议尽快处理）</p> 
     * @return RiskCategoryCount <p>存在风险的分类数量（X类风险建议尽快处理）</p>
     */
    public Long getRiskCategoryCount() {
        return this.RiskCategoryCount;
    }

    /**
     * Set <p>存在风险的分类数量（X类风险建议尽快处理）</p>
     * @param RiskCategoryCount <p>存在风险的分类数量（X类风险建议尽快处理）</p>
     */
    public void setRiskCategoryCount(Long RiskCategoryCount) {
        this.RiskCategoryCount = RiskCategoryCount;
    }

    /**
     * Get <p>总扣分</p> 
     * @return DeductScore <p>总扣分</p>
     */
    public Long getDeductScore() {
        return this.DeductScore;
    }

    /**
     * Set <p>总扣分</p>
     * @param DeductScore <p>总扣分</p>
     */
    public void setDeductScore(Long DeductScore) {
        this.DeductScore = DeductScore;
    }

    /**
     * Get <p>计算时间<br>参数格式：YYYY-MM-DDTHH:mm:ss+08:00</p> 
     * @return CalculatedAt <p>计算时间<br>参数格式：YYYY-MM-DDTHH:mm:ss+08:00</p>
     */
    public String getCalculatedAt() {
        return this.CalculatedAt;
    }

    /**
     * Set <p>计算时间<br>参数格式：YYYY-MM-DDTHH:mm:ss+08:00</p>
     * @param CalculatedAt <p>计算时间<br>参数格式：YYYY-MM-DDTHH:mm:ss+08:00</p>
     */
    public void setCalculatedAt(String CalculatedAt) {
        this.CalculatedAt = CalculatedAt;
    }

    /**
     * Get <p>维度明细，含子项扣分和待办</p> 
     * @return Dimensions <p>维度明细，含子项扣分和待办</p>
     */
    public DimensionItem [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set <p>维度明细，含子项扣分和待办</p>
     * @param Dimensions <p>维度明细，含子项扣分和待办</p>
     */
    public void setDimensions(DimensionItem [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSecurityScoreOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityScoreOverviewResponse(DescribeSecurityScoreOverviewResponse source) {
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.ScoreStatus != null) {
            this.ScoreStatus = new String(source.ScoreStatus);
        }
        if (source.InitialScore != null) {
            this.InitialScore = new Long(source.InitialScore);
        }
        if (source.RiskCategoryCount != null) {
            this.RiskCategoryCount = new Long(source.RiskCategoryCount);
        }
        if (source.DeductScore != null) {
            this.DeductScore = new Long(source.DeductScore);
        }
        if (source.CalculatedAt != null) {
            this.CalculatedAt = new String(source.CalculatedAt);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new DimensionItem[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new DimensionItem(source.Dimensions[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ScoreStatus", this.ScoreStatus);
        this.setParamSimple(map, prefix + "InitialScore", this.InitialScore);
        this.setParamSimple(map, prefix + "RiskCategoryCount", this.RiskCategoryCount);
        this.setParamSimple(map, prefix + "DeductScore", this.DeductScore);
        this.setParamSimple(map, prefix + "CalculatedAt", this.CalculatedAt);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

