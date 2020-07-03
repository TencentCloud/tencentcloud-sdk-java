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

public class DescribeDeadLetterSourceQueuesRequest extends AbstractModel{

    /**
    * 死信队列名称
    */
    @SerializedName("DeadLetterQueueName")
    @Expose
    private String DeadLetterQueueName;

    /**
    * 分页时本页获取主题列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页时本页获取主题的个数，如果不传递该参数，则该参数默认为20，最大值为50。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤死信队列源队列名称，目前仅支持SourceQueueName过滤
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 死信队列名称 
     * @return DeadLetterQueueName 死信队列名称
     */
    public String getDeadLetterQueueName() {
        return this.DeadLetterQueueName;
    }

    /**
     * Set 死信队列名称
     * @param DeadLetterQueueName 死信队列名称
     */
    public void setDeadLetterQueueName(String DeadLetterQueueName) {
        this.DeadLetterQueueName = DeadLetterQueueName;
    }

    /**
     * Get 分页时本页获取主题列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0。 
     * @return Limit 分页时本页获取主题列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页时本页获取主题列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0。
     * @param Limit 分页时本页获取主题列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页时本页获取主题的个数，如果不传递该参数，则该参数默认为20，最大值为50。 
     * @return Offset 分页时本页获取主题的个数，如果不传递该参数，则该参数默认为20，最大值为50。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页时本页获取主题的个数，如果不传递该参数，则该参数默认为20，最大值为50。
     * @param Offset 分页时本页获取主题的个数，如果不传递该参数，则该参数默认为20，最大值为50。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤死信队列源队列名称，目前仅支持SourceQueueName过滤 
     * @return Filters 过滤死信队列源队列名称，目前仅支持SourceQueueName过滤
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤死信队列源队列名称，目前仅支持SourceQueueName过滤
     * @param Filters 过滤死信队列源队列名称，目前仅支持SourceQueueName过滤
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeadLetterQueueName", this.DeadLetterQueueName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

