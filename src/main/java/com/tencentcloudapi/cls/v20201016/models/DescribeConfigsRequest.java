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

public class DescribeConfigsRequest extends AbstractModel {

    /**
    * configName
- 按照【采集配置名称】进行模糊匹配过滤。
- 类型：String
- 必选：否
- 示例：test-config

configId
- 按照【采集配置ID】进行过滤。
- 类型：String
- 必选：否
- 示例：3581a3be-aa41-423b-995a-54ec84da6264

topicId
- 按照【日志主题】进行过滤。
- 类型：String
- 必选：否
- 示例：3b83f9d6-3a4d-47f9-9b7f-285c868b2f9a
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。

每次请求的Filters的上限为10，Filter.Values的上限为5。
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
     * Get configName
- 按照【采集配置名称】进行模糊匹配过滤。
- 类型：String
- 必选：否
- 示例：test-config

configId
- 按照【采集配置ID】进行过滤。
- 类型：String
- 必选：否
- 示例：3581a3be-aa41-423b-995a-54ec84da6264

topicId
- 按照【日志主题】进行过滤。
- 类型：String
- 必选：否
- 示例：3b83f9d6-3a4d-47f9-9b7f-285c868b2f9a
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。

每次请求的Filters的上限为10，Filter.Values的上限为5。 
     * @return Filters configName
- 按照【采集配置名称】进行模糊匹配过滤。
- 类型：String
- 必选：否
- 示例：test-config

configId
- 按照【采集配置ID】进行过滤。
- 类型：String
- 必选：否
- 示例：3581a3be-aa41-423b-995a-54ec84da6264

topicId
- 按照【日志主题】进行过滤。
- 类型：String
- 必选：否
- 示例：3b83f9d6-3a4d-47f9-9b7f-285c868b2f9a
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。

每次请求的Filters的上限为10，Filter.Values的上限为5。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set configName
- 按照【采集配置名称】进行模糊匹配过滤。
- 类型：String
- 必选：否
- 示例：test-config

configId
- 按照【采集配置ID】进行过滤。
- 类型：String
- 必选：否
- 示例：3581a3be-aa41-423b-995a-54ec84da6264

topicId
- 按照【日志主题】进行过滤。
- 类型：String
- 必选：否
- 示例：3b83f9d6-3a4d-47f9-9b7f-285c868b2f9a
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。

每次请求的Filters的上限为10，Filter.Values的上限为5。
     * @param Filters configName
- 按照【采集配置名称】进行模糊匹配过滤。
- 类型：String
- 必选：否
- 示例：test-config

configId
- 按照【采集配置ID】进行过滤。
- 类型：String
- 必选：否
- 示例：3581a3be-aa41-423b-995a-54ec84da6264

topicId
- 按照【日志主题】进行过滤。
- 类型：String
- 必选：否
- 示例：3b83f9d6-3a4d-47f9-9b7f-285c868b2f9a
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。

每次请求的Filters的上限为10，Filter.Values的上限为5。
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

    public DescribeConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigsRequest(DescribeConfigsRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

