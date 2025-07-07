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

public class DescribeRabbitMQExchangesRequest extends AbstractModel {

    /**
    * 实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * VirtualHost 名称，形如 testvhost。有效的 VirtualHost 名称可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询，在左侧导航栏点击 Vhost，并在 Vhost 列表中找到Vhost名称。
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 分页 offset，默认 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页 limit，默认 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索关键词, 支持模糊匹配 
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 筛选 exchange 类型, 数组中每个元素为选中的过滤类型，仅支持 direct、fanout、topic、header
    */
    @SerializedName("ExchangeTypeFilters")
    @Expose
    private String [] ExchangeTypeFilters;

    /**
    * 筛选 exchange 创建来源,  "system":"系统创建", "user":"用户创建"
    */
    @SerializedName("ExchangeCreatorFilters")
    @Expose
    private String [] ExchangeCreatorFilters;

    /**
    * exchange 名称，用于精确匹配
    */
    @SerializedName("ExchangeName")
    @Expose
    private String ExchangeName;

    /**
    * 排序依据的字段：
MessageRateInOut - 生产消费速率之和；
MessageRateIn - 生产速率；
MessageRateOut - 消费速率；
    */
    @SerializedName("SortElement")
    @Expose
    private String SortElement;

    /**
    * 排序顺序，ascend 或 descend
ascend：升序
descend：降序
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get 实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。 
     * @return InstanceId 实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
     * @param InstanceId 实例 ID，形如 amqp-xxxxxxxx。有效的 InstanceId 可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get VirtualHost 名称，形如 testvhost。有效的 VirtualHost 名称可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询，在左侧导航栏点击 Vhost，并在 Vhost 列表中找到Vhost名称。 
     * @return VirtualHost VirtualHost 名称，形如 testvhost。有效的 VirtualHost 名称可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询，在左侧导航栏点击 Vhost，并在 Vhost 列表中找到Vhost名称。
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set VirtualHost 名称，形如 testvhost。有效的 VirtualHost 名称可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询，在左侧导航栏点击 Vhost，并在 Vhost 列表中找到Vhost名称。
     * @param VirtualHost VirtualHost 名称，形如 testvhost。有效的 VirtualHost 名称可通过登录 [TDMQ RabbitMQ 控制台](https://console.cloud.tencent.com/trabbitmq/cluster?rid=1)查询，在左侧导航栏点击 Vhost，并在 Vhost 列表中找到Vhost名称。
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 分页 offset，默认 0 
     * @return Offset 分页 offset，默认 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页 offset，默认 0
     * @param Offset 分页 offset，默认 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页 limit，默认 20 
     * @return Limit 分页 limit，默认 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页 limit，默认 20
     * @param Limit 分页 limit，默认 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索关键词, 支持模糊匹配  
     * @return SearchWord 搜索关键词, 支持模糊匹配 
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 搜索关键词, 支持模糊匹配 
     * @param SearchWord 搜索关键词, 支持模糊匹配 
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 筛选 exchange 类型, 数组中每个元素为选中的过滤类型，仅支持 direct、fanout、topic、header 
     * @return ExchangeTypeFilters 筛选 exchange 类型, 数组中每个元素为选中的过滤类型，仅支持 direct、fanout、topic、header
     */
    public String [] getExchangeTypeFilters() {
        return this.ExchangeTypeFilters;
    }

    /**
     * Set 筛选 exchange 类型, 数组中每个元素为选中的过滤类型，仅支持 direct、fanout、topic、header
     * @param ExchangeTypeFilters 筛选 exchange 类型, 数组中每个元素为选中的过滤类型，仅支持 direct、fanout、topic、header
     */
    public void setExchangeTypeFilters(String [] ExchangeTypeFilters) {
        this.ExchangeTypeFilters = ExchangeTypeFilters;
    }

    /**
     * Get 筛选 exchange 创建来源,  "system":"系统创建", "user":"用户创建" 
     * @return ExchangeCreatorFilters 筛选 exchange 创建来源,  "system":"系统创建", "user":"用户创建"
     */
    public String [] getExchangeCreatorFilters() {
        return this.ExchangeCreatorFilters;
    }

    /**
     * Set 筛选 exchange 创建来源,  "system":"系统创建", "user":"用户创建"
     * @param ExchangeCreatorFilters 筛选 exchange 创建来源,  "system":"系统创建", "user":"用户创建"
     */
    public void setExchangeCreatorFilters(String [] ExchangeCreatorFilters) {
        this.ExchangeCreatorFilters = ExchangeCreatorFilters;
    }

    /**
     * Get exchange 名称，用于精确匹配 
     * @return ExchangeName exchange 名称，用于精确匹配
     */
    public String getExchangeName() {
        return this.ExchangeName;
    }

    /**
     * Set exchange 名称，用于精确匹配
     * @param ExchangeName exchange 名称，用于精确匹配
     */
    public void setExchangeName(String ExchangeName) {
        this.ExchangeName = ExchangeName;
    }

    /**
     * Get 排序依据的字段：
MessageRateInOut - 生产消费速率之和；
MessageRateIn - 生产速率；
MessageRateOut - 消费速率； 
     * @return SortElement 排序依据的字段：
MessageRateInOut - 生产消费速率之和；
MessageRateIn - 生产速率；
MessageRateOut - 消费速率；
     */
    public String getSortElement() {
        return this.SortElement;
    }

    /**
     * Set 排序依据的字段：
MessageRateInOut - 生产消费速率之和；
MessageRateIn - 生产速率；
MessageRateOut - 消费速率；
     * @param SortElement 排序依据的字段：
MessageRateInOut - 生产消费速率之和；
MessageRateIn - 生产速率；
MessageRateOut - 消费速率；
     */
    public void setSortElement(String SortElement) {
        this.SortElement = SortElement;
    }

    /**
     * Get 排序顺序，ascend 或 descend
ascend：升序
descend：降序 
     * @return SortOrder 排序顺序，ascend 或 descend
ascend：升序
descend：降序
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 排序顺序，ascend 或 descend
ascend：升序
descend：降序
     * @param SortOrder 排序顺序，ascend 或 descend
ascend：升序
descend：降序
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeRabbitMQExchangesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQExchangesRequest(DescribeRabbitMQExchangesRequest source) {
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
        if (source.ExchangeTypeFilters != null) {
            this.ExchangeTypeFilters = new String[source.ExchangeTypeFilters.length];
            for (int i = 0; i < source.ExchangeTypeFilters.length; i++) {
                this.ExchangeTypeFilters[i] = new String(source.ExchangeTypeFilters[i]);
            }
        }
        if (source.ExchangeCreatorFilters != null) {
            this.ExchangeCreatorFilters = new String[source.ExchangeCreatorFilters.length];
            for (int i = 0; i < source.ExchangeCreatorFilters.length; i++) {
                this.ExchangeCreatorFilters[i] = new String(source.ExchangeCreatorFilters[i]);
            }
        }
        if (source.ExchangeName != null) {
            this.ExchangeName = new String(source.ExchangeName);
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
        this.setParamArraySimple(map, prefix + "ExchangeTypeFilters.", this.ExchangeTypeFilters);
        this.setParamArraySimple(map, prefix + "ExchangeCreatorFilters.", this.ExchangeCreatorFilters);
        this.setParamSimple(map, prefix + "ExchangeName", this.ExchangeName);
        this.setParamSimple(map, prefix + "SortElement", this.SortElement);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

