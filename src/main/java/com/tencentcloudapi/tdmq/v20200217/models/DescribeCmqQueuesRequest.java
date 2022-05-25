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

public class DescribeCmqQueuesRequest extends AbstractModel{

    /**
    * 分页时本页获取队列列表的起始位置。如果填写了该值，必须也要填写 limit 。该值缺省时，后台取默认值 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页时本页获取队列的个数，如果不传递该参数，则该参数默认为20，最大值为50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 根据QueueName进行过滤
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * CMQ 队列名称列表过滤
    */
    @SerializedName("QueueNameList")
    @Expose
    private String [] QueueNameList;

    /**
    * 标签过滤查找时，需要设置为 true
    */
    @SerializedName("IsTagFilter")
    @Expose
    private Boolean IsTagFilter;

    /**
    * 过滤器。目前支持按标签过滤，标签的Name需要加前缀“tag:”，例如：tag:负责人、tag:环境、tag:业务
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get 根据QueueName进行过滤 
     * @return QueueName 根据QueueName进行过滤
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 根据QueueName进行过滤
     * @param QueueName 根据QueueName进行过滤
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get CMQ 队列名称列表过滤 
     * @return QueueNameList CMQ 队列名称列表过滤
     */
    public String [] getQueueNameList() {
        return this.QueueNameList;
    }

    /**
     * Set CMQ 队列名称列表过滤
     * @param QueueNameList CMQ 队列名称列表过滤
     */
    public void setQueueNameList(String [] QueueNameList) {
        this.QueueNameList = QueueNameList;
    }

    /**
     * Get 标签过滤查找时，需要设置为 true 
     * @return IsTagFilter 标签过滤查找时，需要设置为 true
     */
    public Boolean getIsTagFilter() {
        return this.IsTagFilter;
    }

    /**
     * Set 标签过滤查找时，需要设置为 true
     * @param IsTagFilter 标签过滤查找时，需要设置为 true
     */
    public void setIsTagFilter(Boolean IsTagFilter) {
        this.IsTagFilter = IsTagFilter;
    }

    /**
     * Get 过滤器。目前支持按标签过滤，标签的Name需要加前缀“tag:”，例如：tag:负责人、tag:环境、tag:业务 
     * @return Filters 过滤器。目前支持按标签过滤，标签的Name需要加前缀“tag:”，例如：tag:负责人、tag:环境、tag:业务
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器。目前支持按标签过滤，标签的Name需要加前缀“tag:”，例如：tag:负责人、tag:环境、tag:业务
     * @param Filters 过滤器。目前支持按标签过滤，标签的Name需要加前缀“tag:”，例如：tag:负责人、tag:环境、tag:业务
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCmqQueuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCmqQueuesRequest(DescribeCmqQueuesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.QueueNameList != null) {
            this.QueueNameList = new String[source.QueueNameList.length];
            for (int i = 0; i < source.QueueNameList.length; i++) {
                this.QueueNameList[i] = new String(source.QueueNameList[i]);
            }
        }
        if (source.IsTagFilter != null) {
            this.IsTagFilter = new Boolean(source.IsTagFilter);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamArraySimple(map, prefix + "QueueNameList.", this.QueueNameList);
        this.setParamSimple(map, prefix + "IsTagFilter", this.IsTagFilter);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

