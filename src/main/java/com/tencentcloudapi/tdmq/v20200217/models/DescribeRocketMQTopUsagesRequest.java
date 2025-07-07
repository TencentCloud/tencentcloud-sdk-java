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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQTopUsagesRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 指标名称，支持以下：
consumeLag，消费组堆积数量
deadLetterCount，死信数量
topicRateIn,   Topic生产速率
topicRateOut，Topic消费速率
topicStorageSize，Topic存储空间
topicApiCalls，Topic API调用次数
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 排序数量，最大20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 指标名称，支持以下：
consumeLag，消费组堆积数量
deadLetterCount，死信数量
topicRateIn,   Topic生产速率
topicRateOut，Topic消费速率
topicStorageSize，Topic存储空间
topicApiCalls，Topic API调用次数 
     * @return MetricName 指标名称，支持以下：
consumeLag，消费组堆积数量
deadLetterCount，死信数量
topicRateIn,   Topic生产速率
topicRateOut，Topic消费速率
topicStorageSize，Topic存储空间
topicApiCalls，Topic API调用次数
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称，支持以下：
consumeLag，消费组堆积数量
deadLetterCount，死信数量
topicRateIn,   Topic生产速率
topicRateOut，Topic消费速率
topicStorageSize，Topic存储空间
topicApiCalls，Topic API调用次数
     * @param MetricName 指标名称，支持以下：
consumeLag，消费组堆积数量
deadLetterCount，死信数量
topicRateIn,   Topic生产速率
topicRateOut，Topic消费速率
topicStorageSize，Topic存储空间
topicApiCalls，Topic API调用次数
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 排序数量，最大20 
     * @return Limit 排序数量，最大20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 排序数量，最大20
     * @param Limit 排序数量，最大20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRocketMQTopUsagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQTopUsagesRequest(DescribeRocketMQTopUsagesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

