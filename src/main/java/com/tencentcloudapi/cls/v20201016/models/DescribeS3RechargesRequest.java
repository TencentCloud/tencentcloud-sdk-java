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

public class DescribeS3RechargesRequest extends AbstractModel {

    /**
    * <p>日志主题Id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <ul><li>name 按照【主题名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li><li>bucket 按照【S3 存储桶名称】进行过滤。类型：String。必选：否</li><li>status 按照【任务状态】进行过滤，支持0:已创建, 1:运行中, 2:已停止, 3:已完成, 4:运行失败。 类型：String。必选：否</li><li>enable 按照【启用状态】进行过滤，支持0:暂停，1:启用。类型：String。必选：否</li></ul><p>注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为10。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>分页的偏移量，默认值为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页单页限制数目，默认值为20，最大值100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>日志主题Id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul> 
     * @return TopicId <p>日志主题Id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题Id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     * @param TopicId <p>日志主题Id。</p><ul><li>通过<a href="https://cloud.tencent.com/document/api/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <ul><li>name 按照【主题名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li><li>bucket 按照【S3 存储桶名称】进行过滤。类型：String。必选：否</li><li>status 按照【任务状态】进行过滤，支持0:已创建, 1:运行中, 2:已停止, 3:已完成, 4:运行失败。 类型：String。必选：否</li><li>enable 按照【启用状态】进行过滤，支持0:暂停，1:启用。类型：String。必选：否</li></ul><p>注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为10。</p> 
     * @return Filters <ul><li>name 按照【主题名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li><li>bucket 按照【S3 存储桶名称】进行过滤。类型：String。必选：否</li><li>status 按照【任务状态】进行过滤，支持0:已创建, 1:运行中, 2:已停止, 3:已完成, 4:运行失败。 类型：String。必选：否</li><li>enable 按照【启用状态】进行过滤，支持0:暂停，1:启用。类型：String。必选：否</li></ul><p>注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为10。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <ul><li>name 按照【主题名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li><li>bucket 按照【S3 存储桶名称】进行过滤。类型：String。必选：否</li><li>status 按照【任务状态】进行过滤，支持0:已创建, 1:运行中, 2:已停止, 3:已完成, 4:运行失败。 类型：String。必选：否</li><li>enable 按照【启用状态】进行过滤，支持0:暂停，1:启用。类型：String。必选：否</li></ul><p>注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为10。</p>
     * @param Filters <ul><li>name 按照【主题名称】进行过滤，默认为模糊匹配，可使用 PreciseSearch 参数设置为精确匹配。类型：String。必选：否</li><li>bucket 按照【S3 存储桶名称】进行过滤。类型：String。必选：否</li><li>status 按照【任务状态】进行过滤，支持0:已创建, 1:运行中, 2:已停止, 3:已完成, 4:运行失败。 类型：String。必选：否</li><li>enable 按照【启用状态】进行过滤，支持0:暂停，1:启用。类型：String。必选：否</li></ul><p>注意：每次请求的 Filters 的上限为10，Filter.Values 的上限为10。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页的偏移量，默认值为0。</p> 
     * @return Offset <p>分页的偏移量，默认值为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页的偏移量，默认值为0。</p>
     * @param Offset <p>分页的偏移量，默认值为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页单页限制数目，默认值为20，最大值100。</p> 
     * @return Limit <p>分页单页限制数目，默认值为20，最大值100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页单页限制数目，默认值为20，最大值100。</p>
     * @param Limit <p>分页单页限制数目，默认值为20，最大值100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeS3RechargesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeS3RechargesRequest(DescribeS3RechargesRequest source) {
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

