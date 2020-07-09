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

public class DescribeSubscriptionsRequest extends AbstractModel{

    /**
    * 环境（命名空间）名称。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 主题名称。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 起始下标，不填默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，不填则默认为10，最大值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 订阅者名称，模糊匹配。
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * 数据过滤条件。
    */
    @SerializedName("Filters")
    @Expose
    private FilterSubscription [] Filters;

    /**
     * Get 环境（命名空间）名称。 
     * @return EnvironmentId 环境（命名空间）名称。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）名称。
     * @param EnvironmentId 环境（命名空间）名称。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 主题名称。 
     * @return TopicName 主题名称。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名称。
     * @param TopicName 主题名称。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 起始下标，不填默认为0。 
     * @return Offset 起始下标，不填默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始下标，不填默认为0。
     * @param Offset 起始下标，不填默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，不填则默认为10，最大值为20。 
     * @return Limit 返回数量，不填则默认为10，最大值为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，不填则默认为10，最大值为20。
     * @param Limit 返回数量，不填则默认为10，最大值为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 订阅者名称，模糊匹配。 
     * @return SubscriptionName 订阅者名称，模糊匹配。
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set 订阅者名称，模糊匹配。
     * @param SubscriptionName 订阅者名称，模糊匹配。
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get 数据过滤条件。 
     * @return Filters 数据过滤条件。
     */
    public FilterSubscription [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 数据过滤条件。
     * @param Filters 数据过滤条件。
     */
    public void setFilters(FilterSubscription [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

