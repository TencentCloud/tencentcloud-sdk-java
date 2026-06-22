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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQServerlessQueuesRequest extends AbstractModel {

    /**
    * <p>实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Vhost参数</p>
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * <p>分页Offset</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页Limit</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>搜索关键词</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>队列类型筛选，不填或 &quot;all&quot;：classic 和 quorum 队列；&quot;classic&quot;：筛选 classic 队列；&quot;quorum&quot;：筛选 quorum 队列</p>
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * <p>排序依据的字段：<br>messages_ready - 消息堆积数；<br>publish - 生产速率；<br>deliver - 消费速率；<br>consumers - 在线消费者数量；</p>
    */
    @SerializedName("SortElement")
    @Expose
    private String SortElement;

    /**
    * <p>排序顺序，asc 或 desc</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get <p>实例Id</p> 
     * @return InstanceId <p>实例Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例Id</p>
     * @param InstanceId <p>实例Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Vhost参数</p> 
     * @return VirtualHost <p>Vhost参数</p>
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set <p>Vhost参数</p>
     * @param VirtualHost <p>Vhost参数</p>
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get <p>分页Offset</p> 
     * @return Offset <p>分页Offset</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页Offset</p>
     * @param Offset <p>分页Offset</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页Limit</p> 
     * @return Limit <p>分页Limit</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页Limit</p>
     * @param Limit <p>分页Limit</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>搜索关键词</p> 
     * @return SearchWord <p>搜索关键词</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>搜索关键词</p>
     * @param SearchWord <p>搜索关键词</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>队列类型筛选，不填或 &quot;all&quot;：classic 和 quorum 队列；&quot;classic&quot;：筛选 classic 队列；&quot;quorum&quot;：筛选 quorum 队列</p> 
     * @return QueueType <p>队列类型筛选，不填或 &quot;all&quot;：classic 和 quorum 队列；&quot;classic&quot;：筛选 classic 队列；&quot;quorum&quot;：筛选 quorum 队列</p>
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set <p>队列类型筛选，不填或 &quot;all&quot;：classic 和 quorum 队列；&quot;classic&quot;：筛选 classic 队列；&quot;quorum&quot;：筛选 quorum 队列</p>
     * @param QueueType <p>队列类型筛选，不填或 &quot;all&quot;：classic 和 quorum 队列；&quot;classic&quot;：筛选 classic 队列；&quot;quorum&quot;：筛选 quorum 队列</p>
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get <p>排序依据的字段：<br>messages_ready - 消息堆积数；<br>publish - 生产速率；<br>deliver - 消费速率；<br>consumers - 在线消费者数量；</p> 
     * @return SortElement <p>排序依据的字段：<br>messages_ready - 消息堆积数；<br>publish - 生产速率；<br>deliver - 消费速率；<br>consumers - 在线消费者数量；</p>
     */
    public String getSortElement() {
        return this.SortElement;
    }

    /**
     * Set <p>排序依据的字段：<br>messages_ready - 消息堆积数；<br>publish - 生产速率；<br>deliver - 消费速率；<br>consumers - 在线消费者数量；</p>
     * @param SortElement <p>排序依据的字段：<br>messages_ready - 消息堆积数；<br>publish - 生产速率；<br>deliver - 消费速率；<br>consumers - 在线消费者数量；</p>
     */
    public void setSortElement(String SortElement) {
        this.SortElement = SortElement;
    }

    /**
     * Get <p>排序顺序，asc 或 desc</p> 
     * @return SortOrder <p>排序顺序，asc 或 desc</p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>排序顺序，asc 或 desc</p>
     * @param SortOrder <p>排序顺序，asc 或 desc</p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeRabbitMQServerlessQueuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessQueuesRequest(DescribeRabbitMQServerlessQueuesRequest source) {
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

