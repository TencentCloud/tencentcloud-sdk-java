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

public class DescribeCmqTopicsRequest extends AbstractModel{

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
    * 根据TopicName进行模糊搜索
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * CMQ 主题名称列表过滤
    */
    @SerializedName("TopicNameList")
    @Expose
    private String [] TopicNameList;

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
     * Get 根据TopicName进行模糊搜索 
     * @return TopicName 根据TopicName进行模糊搜索
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 根据TopicName进行模糊搜索
     * @param TopicName 根据TopicName进行模糊搜索
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get CMQ 主题名称列表过滤 
     * @return TopicNameList CMQ 主题名称列表过滤
     */
    public String [] getTopicNameList() {
        return this.TopicNameList;
    }

    /**
     * Set CMQ 主题名称列表过滤
     * @param TopicNameList CMQ 主题名称列表过滤
     */
    public void setTopicNameList(String [] TopicNameList) {
        this.TopicNameList = TopicNameList;
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

    public DescribeCmqTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCmqTopicsRequest(DescribeCmqTopicsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.TopicNameList != null) {
            this.TopicNameList = new String[source.TopicNameList.length];
            for (int i = 0; i < source.TopicNameList.length; i++) {
                this.TopicNameList[i] = new String(source.TopicNameList[i]);
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
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArraySimple(map, prefix + "TopicNameList.", this.TopicNameList);
        this.setParamSimple(map, prefix + "IsTagFilter", this.IsTagFilter);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

