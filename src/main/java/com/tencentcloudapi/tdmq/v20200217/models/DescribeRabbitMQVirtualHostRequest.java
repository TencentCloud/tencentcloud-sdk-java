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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQVirtualHostRequest extends AbstractModel{

    /**
    * 集群实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * vhost名,不传则查询全部
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
    * search-virtual-host：vhost名称模糊查询，之前前缀和后缀匹配
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

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
     * Get 集群实例Id 
     * @return InstanceId 集群实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例Id
     * @param InstanceId 集群实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get vhost名,不传则查询全部 
     * @return VirtualHost vhost名,不传则查询全部
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set vhost名,不传则查询全部
     * @param VirtualHost vhost名,不传则查询全部
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
     * Get search-virtual-host：vhost名称模糊查询，之前前缀和后缀匹配 
     * @return Filters search-virtual-host：vhost名称模糊查询，之前前缀和后缀匹配
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set search-virtual-host：vhost名称模糊查询，之前前缀和后缀匹配
     * @param Filters search-virtual-host：vhost名称模糊查询，之前前缀和后缀匹配
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
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

    public DescribeRabbitMQVirtualHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQVirtualHostRequest(DescribeRabbitMQVirtualHostRequest source) {
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
        if (source.Filters != null) {
            this.Filters = new Filter(source.Filters);
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
        this.setParamObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortElement", this.SortElement);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

