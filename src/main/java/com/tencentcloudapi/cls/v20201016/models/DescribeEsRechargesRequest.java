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

public class DescribeEsRechargesRequest extends AbstractModel {

    /**
    * 日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * -  taskId按照【配置id】进行过滤。类型：String  必选：否
-  name按照【配置名称】进行过滤。类型：String 必选：否
-  statusFlag按照【配置状态标记】进行过滤。类型：String 必选：否
-  每次请求的Filters的上限为10，Filter.Values的上限为100。
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
     * Get 日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。 
     * @return TopicId 日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
     * @param TopicId 日志主题id。
- 通过 [获取日志主题列表](https://cloud.tencent.com/document/product/614/56454) 获取日志主题Id。
- 通过 [创建日志主题](https://cloud.tencent.com/document/product/614/56456) 获取日志主题Id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get -  taskId按照【配置id】进行过滤。类型：String  必选：否
-  name按照【配置名称】进行过滤。类型：String 必选：否
-  statusFlag按照【配置状态标记】进行过滤。类型：String 必选：否
-  每次请求的Filters的上限为10，Filter.Values的上限为100。 
     * @return Filters -  taskId按照【配置id】进行过滤。类型：String  必选：否
-  name按照【配置名称】进行过滤。类型：String 必选：否
-  statusFlag按照【配置状态标记】进行过滤。类型：String 必选：否
-  每次请求的Filters的上限为10，Filter.Values的上限为100。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set -  taskId按照【配置id】进行过滤。类型：String  必选：否
-  name按照【配置名称】进行过滤。类型：String 必选：否
-  statusFlag按照【配置状态标记】进行过滤。类型：String 必选：否
-  每次请求的Filters的上限为10，Filter.Values的上限为100。
     * @param Filters -  taskId按照【配置id】进行过滤。类型：String  必选：否
-  name按照【配置名称】进行过滤。类型：String 必选：否
-  statusFlag按照【配置状态标记】进行过滤。类型：String 必选：否
-  每次请求的Filters的上限为10，Filter.Values的上限为100。
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

    public DescribeEsRechargesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEsRechargesRequest(DescribeEsRechargesRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
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
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

