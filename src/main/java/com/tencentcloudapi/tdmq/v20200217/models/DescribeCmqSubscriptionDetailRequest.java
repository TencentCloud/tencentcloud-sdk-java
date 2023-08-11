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

public class DescribeCmqSubscriptionDetailRequest extends AbstractModel{

    /**
    * 主题名字，在单个地域同一账号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线（-）。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 分页时本页获取主题列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页时本页获取主题的个数，如果不传递该参数，则该参数默认为20，最大值为50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 根据SubscriptionName进行模糊搜索
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * 队列名称，订阅绑定的endpoint
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 查询类型。取值：（1）topic；（2）queue。
默认值是topic。如果 queryType 是 topic，则查询主题下的订阅列表；如果 queryType 是 queue，则查询队列绑定的订阅列表。
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
     * Get 主题名字，在单个地域同一账号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线（-）。 
     * @return TopicName 主题名字，在单个地域同一账号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线（-）。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名字，在单个地域同一账号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线（-）。
     * @param TopicName 主题名字，在单个地域同一账号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线（-）。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 分页时本页获取主题列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0 
     * @return Offset 分页时本页获取主题列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页时本页获取主题列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0
     * @param Offset 分页时本页获取主题列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页时本页获取主题的个数，如果不传递该参数，则该参数默认为20，最大值为50。 
     * @return Limit 分页时本页获取主题的个数，如果不传递该参数，则该参数默认为20，最大值为50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页时本页获取主题的个数，如果不传递该参数，则该参数默认为20，最大值为50。
     * @param Limit 分页时本页获取主题的个数，如果不传递该参数，则该参数默认为20，最大值为50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 根据SubscriptionName进行模糊搜索 
     * @return SubscriptionName 根据SubscriptionName进行模糊搜索
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set 根据SubscriptionName进行模糊搜索
     * @param SubscriptionName 根据SubscriptionName进行模糊搜索
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get 队列名称，订阅绑定的endpoint 
     * @return QueueName 队列名称，订阅绑定的endpoint
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名称，订阅绑定的endpoint
     * @param QueueName 队列名称，订阅绑定的endpoint
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 查询类型。取值：（1）topic；（2）queue。
默认值是topic。如果 queryType 是 topic，则查询主题下的订阅列表；如果 queryType 是 queue，则查询队列绑定的订阅列表。 
     * @return QueryType 查询类型。取值：（1）topic；（2）queue。
默认值是topic。如果 queryType 是 topic，则查询主题下的订阅列表；如果 queryType 是 queue，则查询队列绑定的订阅列表。
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 查询类型。取值：（1）topic；（2）queue。
默认值是topic。如果 queryType 是 topic，则查询主题下的订阅列表；如果 queryType 是 queue，则查询队列绑定的订阅列表。
     * @param QueryType 查询类型。取值：（1）topic；（2）queue。
默认值是topic。如果 queryType 是 topic，则查询主题下的订阅列表；如果 queryType 是 queue，则查询队列绑定的订阅列表。
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    public DescribeCmqSubscriptionDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCmqSubscriptionDetailRequest(DescribeCmqSubscriptionDetailRequest source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SubscriptionName != null) {
            this.SubscriptionName = new String(source.SubscriptionName);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);

    }
}

