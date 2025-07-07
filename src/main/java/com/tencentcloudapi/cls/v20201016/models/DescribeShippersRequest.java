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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShippersRequest extends AbstractModel {

    /**
    * - shipperName：按照【投递规则名称】进行过滤。
    类型：String。
    必选：否
- shipperId：按照【投递规则ID】进行过滤。
    类型：String。
    必选：否
- topicId：按照【日志主题】进行过滤。
    类型：String。
    必选：否
- taskStatus
按照【任务运行状态】进行过滤。 支持`0`：停止，`1`：运行中，`2`：异常
类型：String
必选：否

每次请求的Filters的上限为10，Filter.Values的上限为10。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页的偏移量，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页单页的限制数目，默认值为20，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 控制Filters相关字段是否为精确匹配。  0: 默认值，shipperName模糊匹配 1: shipperName 精确匹配
    */
    @SerializedName("PreciseSearch")
    @Expose
    private Long PreciseSearch;

    /**
     * Get - shipperName：按照【投递规则名称】进行过滤。
    类型：String。
    必选：否
- shipperId：按照【投递规则ID】进行过滤。
    类型：String。
    必选：否
- topicId：按照【日志主题】进行过滤。
    类型：String。
    必选：否
- taskStatus
按照【任务运行状态】进行过滤。 支持`0`：停止，`1`：运行中，`2`：异常
类型：String
必选：否

每次请求的Filters的上限为10，Filter.Values的上限为10。 
     * @return Filters - shipperName：按照【投递规则名称】进行过滤。
    类型：String。
    必选：否
- shipperId：按照【投递规则ID】进行过滤。
    类型：String。
    必选：否
- topicId：按照【日志主题】进行过滤。
    类型：String。
    必选：否
- taskStatus
按照【任务运行状态】进行过滤。 支持`0`：停止，`1`：运行中，`2`：异常
类型：String
必选：否

每次请求的Filters的上限为10，Filter.Values的上限为10。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set - shipperName：按照【投递规则名称】进行过滤。
    类型：String。
    必选：否
- shipperId：按照【投递规则ID】进行过滤。
    类型：String。
    必选：否
- topicId：按照【日志主题】进行过滤。
    类型：String。
    必选：否
- taskStatus
按照【任务运行状态】进行过滤。 支持`0`：停止，`1`：运行中，`2`：异常
类型：String
必选：否

每次请求的Filters的上限为10，Filter.Values的上限为10。
     * @param Filters - shipperName：按照【投递规则名称】进行过滤。
    类型：String。
    必选：否
- shipperId：按照【投递规则ID】进行过滤。
    类型：String。
    必选：否
- topicId：按照【日志主题】进行过滤。
    类型：String。
    必选：否
- taskStatus
按照【任务运行状态】进行过滤。 支持`0`：停止，`1`：运行中，`2`：异常
类型：String
必选：否

每次请求的Filters的上限为10，Filter.Values的上限为10。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页的偏移量，默认值为0 
     * @return Offset 分页的偏移量，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量，默认值为0
     * @param Offset 分页的偏移量，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页单页的限制数目，默认值为20，最大值100 
     * @return Limit 分页单页的限制数目，默认值为20，最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页单页的限制数目，默认值为20，最大值100
     * @param Limit 分页单页的限制数目，默认值为20，最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 控制Filters相关字段是否为精确匹配。  0: 默认值，shipperName模糊匹配 1: shipperName 精确匹配 
     * @return PreciseSearch 控制Filters相关字段是否为精确匹配。  0: 默认值，shipperName模糊匹配 1: shipperName 精确匹配
     */
    public Long getPreciseSearch() {
        return this.PreciseSearch;
    }

    /**
     * Set 控制Filters相关字段是否为精确匹配。  0: 默认值，shipperName模糊匹配 1: shipperName 精确匹配
     * @param PreciseSearch 控制Filters相关字段是否为精确匹配。  0: 默认值，shipperName模糊匹配 1: shipperName 精确匹配
     */
    public void setPreciseSearch(Long PreciseSearch) {
        this.PreciseSearch = PreciseSearch;
    }

    public DescribeShippersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShippersRequest(DescribeShippersRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PreciseSearch != null) {
            this.PreciseSearch = new Long(source.PreciseSearch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PreciseSearch", this.PreciseSearch);

    }
}

