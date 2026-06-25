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

public class AIGWLLMTokenUsageItem extends AbstractModel {

    /**
    * <p>消费者Id</p>
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * <p>消费者名称</p>
    */
    @SerializedName("ConsumerName")
    @Expose
    private String ConsumerName;

    /**
    * <p>消费者组信息列表</p>
    */
    @SerializedName("ConsumerGroups")
    @Expose
    private AIGWConsumerGroupBrief [] ConsumerGroups;

    /**
    * <p>模型服务Id</p>
    */
    @SerializedName("ModelServiceId")
    @Expose
    private String ModelServiceId;

    /**
    * <p>模型服务名称</p>
    */
    @SerializedName("ModelServiceName")
    @Expose
    private String ModelServiceName;

    /**
    * <p>输入Token数（包含缓存命中Token数）</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>命中缓存输入Token数</p>
    */
    @SerializedName("CacheReadInputTokens")
    @Expose
    private Long CacheReadInputTokens;

    /**
    * <p>输出Token数</p>
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>消耗总Token数</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * <p>请求总数</p>
    */
    @SerializedName("RequestCount")
    @Expose
    private Long RequestCount;

    /**
    * <p>花费成本</p>
    */
    @SerializedName("Cost")
    @Expose
    private String Cost;

    /**
    * <p>成本货币单位</p><p>枚举值：</p><ul><li>CNY： 人民币</li></ul><p>当前仅支持CNY</p>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * Get <p>消费者Id</p> 
     * @return ConsumerId <p>消费者Id</p>
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set <p>消费者Id</p>
     * @param ConsumerId <p>消费者Id</p>
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get <p>消费者名称</p> 
     * @return ConsumerName <p>消费者名称</p>
     */
    public String getConsumerName() {
        return this.ConsumerName;
    }

    /**
     * Set <p>消费者名称</p>
     * @param ConsumerName <p>消费者名称</p>
     */
    public void setConsumerName(String ConsumerName) {
        this.ConsumerName = ConsumerName;
    }

    /**
     * Get <p>消费者组信息列表</p> 
     * @return ConsumerGroups <p>消费者组信息列表</p>
     */
    public AIGWConsumerGroupBrief [] getConsumerGroups() {
        return this.ConsumerGroups;
    }

    /**
     * Set <p>消费者组信息列表</p>
     * @param ConsumerGroups <p>消费者组信息列表</p>
     */
    public void setConsumerGroups(AIGWConsumerGroupBrief [] ConsumerGroups) {
        this.ConsumerGroups = ConsumerGroups;
    }

    /**
     * Get <p>模型服务Id</p> 
     * @return ModelServiceId <p>模型服务Id</p>
     */
    public String getModelServiceId() {
        return this.ModelServiceId;
    }

    /**
     * Set <p>模型服务Id</p>
     * @param ModelServiceId <p>模型服务Id</p>
     */
    public void setModelServiceId(String ModelServiceId) {
        this.ModelServiceId = ModelServiceId;
    }

    /**
     * Get <p>模型服务名称</p> 
     * @return ModelServiceName <p>模型服务名称</p>
     */
    public String getModelServiceName() {
        return this.ModelServiceName;
    }

    /**
     * Set <p>模型服务名称</p>
     * @param ModelServiceName <p>模型服务名称</p>
     */
    public void setModelServiceName(String ModelServiceName) {
        this.ModelServiceName = ModelServiceName;
    }

    /**
     * Get <p>输入Token数（包含缓存命中Token数）</p> 
     * @return InputTokens <p>输入Token数（包含缓存命中Token数）</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>输入Token数（包含缓存命中Token数）</p>
     * @param InputTokens <p>输入Token数（包含缓存命中Token数）</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>命中缓存输入Token数</p> 
     * @return CacheReadInputTokens <p>命中缓存输入Token数</p>
     */
    public Long getCacheReadInputTokens() {
        return this.CacheReadInputTokens;
    }

    /**
     * Set <p>命中缓存输入Token数</p>
     * @param CacheReadInputTokens <p>命中缓存输入Token数</p>
     */
    public void setCacheReadInputTokens(Long CacheReadInputTokens) {
        this.CacheReadInputTokens = CacheReadInputTokens;
    }

    /**
     * Get <p>输出Token数</p> 
     * @return OutputTokens <p>输出Token数</p>
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>输出Token数</p>
     * @param OutputTokens <p>输出Token数</p>
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>消耗总Token数</p> 
     * @return TotalTokens <p>消耗总Token数</p>
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>消耗总Token数</p>
     * @param TotalTokens <p>消耗总Token数</p>
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get <p>请求总数</p> 
     * @return RequestCount <p>请求总数</p>
     */
    public Long getRequestCount() {
        return this.RequestCount;
    }

    /**
     * Set <p>请求总数</p>
     * @param RequestCount <p>请求总数</p>
     */
    public void setRequestCount(Long RequestCount) {
        this.RequestCount = RequestCount;
    }

    /**
     * Get <p>花费成本</p> 
     * @return Cost <p>花费成本</p>
     */
    public String getCost() {
        return this.Cost;
    }

    /**
     * Set <p>花费成本</p>
     * @param Cost <p>花费成本</p>
     */
    public void setCost(String Cost) {
        this.Cost = Cost;
    }

    /**
     * Get <p>成本货币单位</p><p>枚举值：</p><ul><li>CNY： 人民币</li></ul><p>当前仅支持CNY</p> 
     * @return Currency <p>成本货币单位</p><p>枚举值：</p><ul><li>CNY： 人民币</li></ul><p>当前仅支持CNY</p>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set <p>成本货币单位</p><p>枚举值：</p><ul><li>CNY： 人民币</li></ul><p>当前仅支持CNY</p>
     * @param Currency <p>成本货币单位</p><p>枚举值：</p><ul><li>CNY： 人民币</li></ul><p>当前仅支持CNY</p>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public AIGWLLMTokenUsageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLLMTokenUsageItem(AIGWLLMTokenUsageItem source) {
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.ConsumerName != null) {
            this.ConsumerName = new String(source.ConsumerName);
        }
        if (source.ConsumerGroups != null) {
            this.ConsumerGroups = new AIGWConsumerGroupBrief[source.ConsumerGroups.length];
            for (int i = 0; i < source.ConsumerGroups.length; i++) {
                this.ConsumerGroups[i] = new AIGWConsumerGroupBrief(source.ConsumerGroups[i]);
            }
        }
        if (source.ModelServiceId != null) {
            this.ModelServiceId = new String(source.ModelServiceId);
        }
        if (source.ModelServiceName != null) {
            this.ModelServiceName = new String(source.ModelServiceName);
        }
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.CacheReadInputTokens != null) {
            this.CacheReadInputTokens = new Long(source.CacheReadInputTokens);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.RequestCount != null) {
            this.RequestCount = new Long(source.RequestCount);
        }
        if (source.Cost != null) {
            this.Cost = new String(source.Cost);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "ConsumerName", this.ConsumerName);
        this.setParamArrayObj(map, prefix + "ConsumerGroups.", this.ConsumerGroups);
        this.setParamSimple(map, prefix + "ModelServiceId", this.ModelServiceId);
        this.setParamSimple(map, prefix + "ModelServiceName", this.ModelServiceName);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "CacheReadInputTokens", this.CacheReadInputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "RequestCount", this.RequestCount);
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}

