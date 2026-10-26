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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWLLMTokenUsageStatisticsResult extends AbstractModel {

    /**
    * <p>查询时间范围内请求总数</p>
    */
    @SerializedName("TotalRequestCount")
    @Expose
    private Long TotalRequestCount;

    /**
    * <p>查询时间范围内总输入Token数（包含命中缓存的Token数）</p>
    */
    @SerializedName("TotalInputTokens")
    @Expose
    private Long TotalInputTokens;

    /**
    * <p>查询时间范围内总输出Token数</p>
    */
    @SerializedName("TotalOutputTokens")
    @Expose
    private Long TotalOutputTokens;

    /**
    * <p>查询时间范围内总命中缓存输入Token数</p>
    */
    @SerializedName("TotalCachedReadInputTokens")
    @Expose
    private Long TotalCachedReadInputTokens;

    /**
    * <p>查询时间范围内总成本</p>
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * <p>成本货币单位</p>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * <p>未传 Dimension 时返回原消费者排行；传入 Dimension 时为 []。ConsumerGroup 汇总不逐组拆分。</p>
    */
    @SerializedName("TopConsumers")
    @Expose
    private AIGWTopConsumersItem [] TopConsumers;

    /**
    * <p>查询时间范围内原始 total_tokens 累计</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * <p>组织归属是否不完整。网关版本不低于 3.9.8，使用 ConsumerGroup 维度或 ConsumerGroupId / ConsumerGroupName 筛选时返回，其余请求省略。true 表示时间及业务筛选范围内存在组归属未知的日志；检查不受组筛选条件遮蔽，空结果也执行检查。组范围统计仅计入可归因日志。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgAttributionIncomplete")
    @Expose
    private Boolean OrgAttributionIncomplete;

    /**
     * Get <p>查询时间范围内请求总数</p> 
     * @return TotalRequestCount <p>查询时间范围内请求总数</p>
     */
    public Long getTotalRequestCount() {
        return this.TotalRequestCount;
    }

    /**
     * Set <p>查询时间范围内请求总数</p>
     * @param TotalRequestCount <p>查询时间范围内请求总数</p>
     */
    public void setTotalRequestCount(Long TotalRequestCount) {
        this.TotalRequestCount = TotalRequestCount;
    }

    /**
     * Get <p>查询时间范围内总输入Token数（包含命中缓存的Token数）</p> 
     * @return TotalInputTokens <p>查询时间范围内总输入Token数（包含命中缓存的Token数）</p>
     */
    public Long getTotalInputTokens() {
        return this.TotalInputTokens;
    }

    /**
     * Set <p>查询时间范围内总输入Token数（包含命中缓存的Token数）</p>
     * @param TotalInputTokens <p>查询时间范围内总输入Token数（包含命中缓存的Token数）</p>
     */
    public void setTotalInputTokens(Long TotalInputTokens) {
        this.TotalInputTokens = TotalInputTokens;
    }

    /**
     * Get <p>查询时间范围内总输出Token数</p> 
     * @return TotalOutputTokens <p>查询时间范围内总输出Token数</p>
     */
    public Long getTotalOutputTokens() {
        return this.TotalOutputTokens;
    }

    /**
     * Set <p>查询时间范围内总输出Token数</p>
     * @param TotalOutputTokens <p>查询时间范围内总输出Token数</p>
     */
    public void setTotalOutputTokens(Long TotalOutputTokens) {
        this.TotalOutputTokens = TotalOutputTokens;
    }

    /**
     * Get <p>查询时间范围内总命中缓存输入Token数</p> 
     * @return TotalCachedReadInputTokens <p>查询时间范围内总命中缓存输入Token数</p>
     */
    public Long getTotalCachedReadInputTokens() {
        return this.TotalCachedReadInputTokens;
    }

    /**
     * Set <p>查询时间范围内总命中缓存输入Token数</p>
     * @param TotalCachedReadInputTokens <p>查询时间范围内总命中缓存输入Token数</p>
     */
    public void setTotalCachedReadInputTokens(Long TotalCachedReadInputTokens) {
        this.TotalCachedReadInputTokens = TotalCachedReadInputTokens;
    }

    /**
     * Get <p>查询时间范围内总成本</p> 
     * @return TotalCost <p>查询时间范围内总成本</p>
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set <p>查询时间范围内总成本</p>
     * @param TotalCost <p>查询时间范围内总成本</p>
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get <p>成本货币单位</p> 
     * @return Currency <p>成本货币单位</p>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set <p>成本货币单位</p>
     * @param Currency <p>成本货币单位</p>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get <p>未传 Dimension 时返回原消费者排行；传入 Dimension 时为 []。ConsumerGroup 汇总不逐组拆分。</p> 
     * @return TopConsumers <p>未传 Dimension 时返回原消费者排行；传入 Dimension 时为 []。ConsumerGroup 汇总不逐组拆分。</p>
     */
    public AIGWTopConsumersItem [] getTopConsumers() {
        return this.TopConsumers;
    }

    /**
     * Set <p>未传 Dimension 时返回原消费者排行；传入 Dimension 时为 []。ConsumerGroup 汇总不逐组拆分。</p>
     * @param TopConsumers <p>未传 Dimension 时返回原消费者排行；传入 Dimension 时为 []。ConsumerGroup 汇总不逐组拆分。</p>
     */
    public void setTopConsumers(AIGWTopConsumersItem [] TopConsumers) {
        this.TopConsumers = TopConsumers;
    }

    /**
     * Get <p>查询时间范围内原始 total_tokens 累计</p> 
     * @return TotalTokens <p>查询时间范围内原始 total_tokens 累计</p>
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>查询时间范围内原始 total_tokens 累计</p>
     * @param TotalTokens <p>查询时间范围内原始 total_tokens 累计</p>
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get <p>组织归属是否不完整。网关版本不低于 3.9.8，使用 ConsumerGroup 维度或 ConsumerGroupId / ConsumerGroupName 筛选时返回，其余请求省略。true 表示时间及业务筛选范围内存在组归属未知的日志；检查不受组筛选条件遮蔽，空结果也执行检查。组范围统计仅计入可归因日志。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgAttributionIncomplete <p>组织归属是否不完整。网关版本不低于 3.9.8，使用 ConsumerGroup 维度或 ConsumerGroupId / ConsumerGroupName 筛选时返回，其余请求省略。true 表示时间及业务筛选范围内存在组归属未知的日志；检查不受组筛选条件遮蔽，空结果也执行检查。组范围统计仅计入可归因日志。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOrgAttributionIncomplete() {
        return this.OrgAttributionIncomplete;
    }

    /**
     * Set <p>组织归属是否不完整。网关版本不低于 3.9.8，使用 ConsumerGroup 维度或 ConsumerGroupId / ConsumerGroupName 筛选时返回，其余请求省略。true 表示时间及业务筛选范围内存在组归属未知的日志；检查不受组筛选条件遮蔽，空结果也执行检查。组范围统计仅计入可归因日志。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgAttributionIncomplete <p>组织归属是否不完整。网关版本不低于 3.9.8，使用 ConsumerGroup 维度或 ConsumerGroupId / ConsumerGroupName 筛选时返回，其余请求省略。true 表示时间及业务筛选范围内存在组归属未知的日志；检查不受组筛选条件遮蔽，空结果也执行检查。组范围统计仅计入可归因日志。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgAttributionIncomplete(Boolean OrgAttributionIncomplete) {
        this.OrgAttributionIncomplete = OrgAttributionIncomplete;
    }

    public AIGWLLMTokenUsageStatisticsResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLLMTokenUsageStatisticsResult(AIGWLLMTokenUsageStatisticsResult source) {
        if (source.TotalRequestCount != null) {
            this.TotalRequestCount = new Long(source.TotalRequestCount);
        }
        if (source.TotalInputTokens != null) {
            this.TotalInputTokens = new Long(source.TotalInputTokens);
        }
        if (source.TotalOutputTokens != null) {
            this.TotalOutputTokens = new Long(source.TotalOutputTokens);
        }
        if (source.TotalCachedReadInputTokens != null) {
            this.TotalCachedReadInputTokens = new Long(source.TotalCachedReadInputTokens);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.TopConsumers != null) {
            this.TopConsumers = new AIGWTopConsumersItem[source.TopConsumers.length];
            for (int i = 0; i < source.TopConsumers.length; i++) {
                this.TopConsumers[i] = new AIGWTopConsumersItem(source.TopConsumers[i]);
            }
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.OrgAttributionIncomplete != null) {
            this.OrgAttributionIncomplete = new Boolean(source.OrgAttributionIncomplete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalRequestCount", this.TotalRequestCount);
        this.setParamSimple(map, prefix + "TotalInputTokens", this.TotalInputTokens);
        this.setParamSimple(map, prefix + "TotalOutputTokens", this.TotalOutputTokens);
        this.setParamSimple(map, prefix + "TotalCachedReadInputTokens", this.TotalCachedReadInputTokens);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamArrayObj(map, prefix + "TopConsumers.", this.TopConsumers);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "OrgAttributionIncomplete", this.OrgAttributionIncomplete);

    }
}

