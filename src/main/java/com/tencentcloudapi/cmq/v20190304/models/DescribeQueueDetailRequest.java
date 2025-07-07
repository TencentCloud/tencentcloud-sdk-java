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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQueueDetailRequest extends AbstractModel {

    /**
    * 标签搜索
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 分页时本页获取队列的个数，如果不传递该参数，则该参数默认为20，最大值为50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 精确匹配QueueName
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 筛选参数，目前支持QueueName筛选，且仅支持一个关键字
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页时本页获取队列列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 标签搜索 
     * @return TagKey 标签搜索
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 标签搜索
     * @param TagKey 标签搜索
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 分页时本页获取队列的个数，如果不传递该参数，则该参数默认为20，最大值为50。 
     * @return Limit 分页时本页获取队列的个数，如果不传递该参数，则该参数默认为20，最大值为50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页时本页获取队列的个数，如果不传递该参数，则该参数默认为20，最大值为50。
     * @param Limit 分页时本页获取队列的个数，如果不传递该参数，则该参数默认为20，最大值为50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 精确匹配QueueName 
     * @return QueueName 精确匹配QueueName
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 精确匹配QueueName
     * @param QueueName 精确匹配QueueName
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 筛选参数，目前支持QueueName筛选，且仅支持一个关键字 
     * @return Filters 筛选参数，目前支持QueueName筛选，且仅支持一个关键字
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选参数，目前支持QueueName筛选，且仅支持一个关键字
     * @param Filters 筛选参数，目前支持QueueName筛选，且仅支持一个关键字
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页时本页获取队列列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0 
     * @return Offset 分页时本页获取队列列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页时本页获取队列列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0
     * @param Offset 分页时本页获取队列列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeQueueDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQueueDetailRequest(DescribeQueueDetailRequest source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

