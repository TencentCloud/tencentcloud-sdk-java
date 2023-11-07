/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DescribeRabbitMQQueuesRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost参数
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键词
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 队列类型筛选，不填或 "all"：classic 和 quorum 队列；"classic"：筛选 classic 队列；"quorum"：筛选 quorum 队列
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * 排序依据的字段：
MessageHeapCount - 消息堆积数；
MessageRateInOut - 生产消费速率之和；
MessageRateIn - 生产速率；
MessageRateOut - 消费速率；
    */
    @SerializedName("SortElement")
    @Expose
    private String SortElement;

    /**
    * 排序顺序，ascend 或 descend
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost参数 
     * @return VirtualHost Vhost参数
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost参数
     * @param VirtualHost Vhost参数
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页Limit 
     * @return Limit 分页Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页Limit
     * @param Limit 分页Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索关键词 
     * @return SearchWord 搜索关键词
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键词
     * @param SearchWord 搜索关键词
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 队列类型筛选，不填或 "all"：classic 和 quorum 队列；"classic"：筛选 classic 队列；"quorum"：筛选 quorum 队列 
     * @return QueueType 队列类型筛选，不填或 "all"：classic 和 quorum 队列；"classic"：筛选 classic 队列；"quorum"：筛选 quorum 队列
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set 队列类型筛选，不填或 "all"：classic 和 quorum 队列；"classic"：筛选 classic 队列；"quorum"：筛选 quorum 队列
     * @param QueueType 队列类型筛选，不填或 "all"：classic 和 quorum 队列；"classic"：筛选 classic 队列；"quorum"：筛选 quorum 队列
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get 排序依据的字段：
MessageHeapCount - 消息堆积数；
MessageRateInOut - 生产消费速率之和；
MessageRateIn - 生产速率；
MessageRateOut - 消费速率； 
     * @return SortElement 排序依据的字段：
MessageHeapCount - 消息堆积数；
MessageRateInOut - 生产消费速率之和；
MessageRateIn - 生产速率；
MessageRateOut - 消费速率；
     */
    public String getSortElement() {
        return this.SortElement;
    }

    /**
     * Set 排序依据的字段：
MessageHeapCount - 消息堆积数；
MessageRateInOut - 生产消费速率之和；
MessageRateIn - 生产速率；
MessageRateOut - 消费速率；
     * @param SortElement 排序依据的字段：
MessageHeapCount - 消息堆积数；
MessageRateInOut - 生产消费速率之和；
MessageRateIn - 生产速率；
MessageRateOut - 消费速率；
     */
    public void setSortElement(String SortElement) {
        this.SortElement = SortElement;
    }

    /**
     * Get 排序顺序，ascend 或 descend 
     * @return SortOrder 排序顺序，ascend 或 descend
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 排序顺序，ascend 或 descend
     * @param SortOrder 排序顺序，ascend 或 descend
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeRabbitMQQueuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQQueuesRequest(DescribeRabbitMQQueuesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.QueueType != null) {
            this.QueueType = new String(source.QueueType);
        }
        if (source.SortElement != null) {
            this.SortElement = new String(source.SortElement);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "SortElement", this.SortElement);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

