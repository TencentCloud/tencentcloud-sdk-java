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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubscriptionDetailRequest extends AbstractModel{

    /**
    * 主题名字，在单个地域同一帐号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线（-）。
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
    * 筛选参数，目前只支持SubscriptionName，且仅支持一个关键字。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 主题名字，在单个地域同一帐号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线（-）。 
     * @return TopicName 主题名字，在单个地域同一帐号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线（-）。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 主题名字，在单个地域同一帐号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线（-）。
     * @param TopicName 主题名字，在单个地域同一帐号下唯一。主题名称是一个不超过64个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线（-）。
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
     * Get 筛选参数，目前只支持SubscriptionName，且仅支持一个关键字。 
     * @return Filters 筛选参数，目前只支持SubscriptionName，且仅支持一个关键字。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选参数，目前只支持SubscriptionName，且仅支持一个关键字。
     * @param Filters 筛选参数，目前只支持SubscriptionName，且仅支持一个关键字。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

