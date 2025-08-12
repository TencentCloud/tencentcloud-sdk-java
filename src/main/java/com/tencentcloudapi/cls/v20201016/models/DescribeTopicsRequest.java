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

public class DescribeTopicsRequest extends AbstractModel {

    /**
    * <ul><li>topicName 按照【日志主题名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li>
<li>logsetName 按照【日志集名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li>
<li>topicId 按照【日志主题ID】进行过滤。类型：String。必选：否</li>
<li>logsetId 按照【日志集ID】进行过滤，可通过调用 <a href="https://cloud.tencent.com/document/product/614/58624">DescribeLogsets</a> 查询已创建的日志集列表或登录控制台进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/614/58626">CreateLogset</a> 创建新的日志集。类型：String。必选：否</li>
<li>tagKey 按照【标签键】进行过滤。类型：String。必选：否</li>
<li>tag:tagKey 按照【标签键值对】进行过滤。tagKey 使用具体的标签键进行替换，例如 tag:exampleKey。类型：String。必选：否</li>
<li>storageType 按照【日志主题的存储类型】进行过滤。可选值 hot（标准存储），cold（低频存储）类型：String。必选：否</li></ul>
注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为100。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分页的偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页单页限制数目，默认值为20，最大值100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 控制Filters相关字段是否为精确匹配。
<ul><li>0: 默认值，topicName 和 logsetName 模糊匹配</li>
<li>1: topicName   精确匹配</li>
<li>2: logsetName精确匹配</li>
<li>3: topicName 和logsetName 都精确匹配</li></ul>
    */
    @SerializedName("PreciseSearch")
    @Expose
    private Long PreciseSearch;

    /**
    * 主题类型
- 0:日志主题，默认值
- 1:指标主题
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
     * Get <ul><li>topicName 按照【日志主题名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li>
<li>logsetName 按照【日志集名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li>
<li>topicId 按照【日志主题ID】进行过滤。类型：String。必选：否</li>
<li>logsetId 按照【日志集ID】进行过滤，可通过调用 <a href="https://cloud.tencent.com/document/product/614/58624">DescribeLogsets</a> 查询已创建的日志集列表或登录控制台进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/614/58626">CreateLogset</a> 创建新的日志集。类型：String。必选：否</li>
<li>tagKey 按照【标签键】进行过滤。类型：String。必选：否</li>
<li>tag:tagKey 按照【标签键值对】进行过滤。tagKey 使用具体的标签键进行替换，例如 tag:exampleKey。类型：String。必选：否</li>
<li>storageType 按照【日志主题的存储类型】进行过滤。可选值 hot（标准存储），cold（低频存储）类型：String。必选：否</li></ul>
注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为100。 
     * @return Filters <ul><li>topicName 按照【日志主题名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li>
<li>logsetName 按照【日志集名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li>
<li>topicId 按照【日志主题ID】进行过滤。类型：String。必选：否</li>
<li>logsetId 按照【日志集ID】进行过滤，可通过调用 <a href="https://cloud.tencent.com/document/product/614/58624">DescribeLogsets</a> 查询已创建的日志集列表或登录控制台进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/614/58626">CreateLogset</a> 创建新的日志集。类型：String。必选：否</li>
<li>tagKey 按照【标签键】进行过滤。类型：String。必选：否</li>
<li>tag:tagKey 按照【标签键值对】进行过滤。tagKey 使用具体的标签键进行替换，例如 tag:exampleKey。类型：String。必选：否</li>
<li>storageType 按照【日志主题的存储类型】进行过滤。可选值 hot（标准存储），cold（低频存储）类型：String。必选：否</li></ul>
注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为100。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <ul><li>topicName 按照【日志主题名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li>
<li>logsetName 按照【日志集名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li>
<li>topicId 按照【日志主题ID】进行过滤。类型：String。必选：否</li>
<li>logsetId 按照【日志集ID】进行过滤，可通过调用 <a href="https://cloud.tencent.com/document/product/614/58624">DescribeLogsets</a> 查询已创建的日志集列表或登录控制台进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/614/58626">CreateLogset</a> 创建新的日志集。类型：String。必选：否</li>
<li>tagKey 按照【标签键】进行过滤。类型：String。必选：否</li>
<li>tag:tagKey 按照【标签键值对】进行过滤。tagKey 使用具体的标签键进行替换，例如 tag:exampleKey。类型：String。必选：否</li>
<li>storageType 按照【日志主题的存储类型】进行过滤。可选值 hot（标准存储），cold（低频存储）类型：String。必选：否</li></ul>
注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为100。
     * @param Filters <ul><li>topicName 按照【日志主题名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li>
<li>logsetName 按照【日志集名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li>
<li>topicId 按照【日志主题ID】进行过滤。类型：String。必选：否</li>
<li>logsetId 按照【日志集ID】进行过滤，可通过调用 <a href="https://cloud.tencent.com/document/product/614/58624">DescribeLogsets</a> 查询已创建的日志集列表或登录控制台进行查看；也可以调用<a href="https://cloud.tencent.com/document/product/614/58626">CreateLogset</a> 创建新的日志集。类型：String。必选：否</li>
<li>tagKey 按照【标签键】进行过滤。类型：String。必选：否</li>
<li>tag:tagKey 按照【标签键值对】进行过滤。tagKey 使用具体的标签键进行替换，例如 tag:exampleKey。类型：String。必选：否</li>
<li>storageType 按照【日志主题的存储类型】进行过滤。可选值 hot（标准存储），cold（低频存储）类型：String。必选：否</li></ul>
注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为100。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页的偏移量，默认值为0。 
     * @return Offset 分页的偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量，默认值为0。
     * @param Offset 分页的偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页单页限制数目，默认值为20，最大值100。 
     * @return Limit 分页单页限制数目，默认值为20，最大值100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页单页限制数目，默认值为20，最大值100。
     * @param Limit 分页单页限制数目，默认值为20，最大值100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 控制Filters相关字段是否为精确匹配。
<ul><li>0: 默认值，topicName 和 logsetName 模糊匹配</li>
<li>1: topicName   精确匹配</li>
<li>2: logsetName精确匹配</li>
<li>3: topicName 和logsetName 都精确匹配</li></ul> 
     * @return PreciseSearch 控制Filters相关字段是否为精确匹配。
<ul><li>0: 默认值，topicName 和 logsetName 模糊匹配</li>
<li>1: topicName   精确匹配</li>
<li>2: logsetName精确匹配</li>
<li>3: topicName 和logsetName 都精确匹配</li></ul>
     */
    public Long getPreciseSearch() {
        return this.PreciseSearch;
    }

    /**
     * Set 控制Filters相关字段是否为精确匹配。
<ul><li>0: 默认值，topicName 和 logsetName 模糊匹配</li>
<li>1: topicName   精确匹配</li>
<li>2: logsetName精确匹配</li>
<li>3: topicName 和logsetName 都精确匹配</li></ul>
     * @param PreciseSearch 控制Filters相关字段是否为精确匹配。
<ul><li>0: 默认值，topicName 和 logsetName 模糊匹配</li>
<li>1: topicName   精确匹配</li>
<li>2: logsetName精确匹配</li>
<li>3: topicName 和logsetName 都精确匹配</li></ul>
     */
    public void setPreciseSearch(Long PreciseSearch) {
        this.PreciseSearch = PreciseSearch;
    }

    /**
     * Get 主题类型
- 0:日志主题，默认值
- 1:指标主题 
     * @return BizType 主题类型
- 0:日志主题，默认值
- 1:指标主题
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set 主题类型
- 0:日志主题，默认值
- 1:指标主题
     * @param BizType 主题类型
- 0:日志主题，默认值
- 1:指标主题
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    public DescribeTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicsRequest(DescribeTopicsRequest source) {
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
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
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
        this.setParamSimple(map, prefix + "BizType", this.BizType);

    }
}

