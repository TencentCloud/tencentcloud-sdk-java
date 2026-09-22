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

public class DescribeResourceGraphsRequest extends AbstractModel {

    /**
    * <ul><li>ResourceGraphId 按【资源图谱 ID】精确匹配。类型：String。必选：否</li><li>Name 按【资源图谱名称】模糊匹配。类型：String。必选：否</li><li>Status 按【状态】模糊匹配。类型：int。必选：否；0：初始化中；1：就绪；2：创建失败；3：删除中；5：删除失败</li><li>tagKey 按照【标签键】进行过滤。类型：String。必选：否</li><li>tag:tagKey 按照【标签键值对】进行过滤。tagKey 使用具体的标签键进行替换，例如 tag:exampleKey。类型：String。必选：否</li></ul>注意：每次请求的 Filters 上限 10，Filter.Values 上限 100。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>分页偏移量</p><p>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页单页数量</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <ul><li>ResourceGraphId 按【资源图谱 ID】精确匹配。类型：String。必选：否</li><li>Name 按【资源图谱名称】模糊匹配。类型：String。必选：否</li><li>Status 按【状态】模糊匹配。类型：int。必选：否；0：初始化中；1：就绪；2：创建失败；3：删除中；5：删除失败</li><li>tagKey 按照【标签键】进行过滤。类型：String。必选：否</li><li>tag:tagKey 按照【标签键值对】进行过滤。tagKey 使用具体的标签键进行替换，例如 tag:exampleKey。类型：String。必选：否</li></ul>注意：每次请求的 Filters 上限 10，Filter.Values 上限 100。 
     * @return Filters <ul><li>ResourceGraphId 按【资源图谱 ID】精确匹配。类型：String。必选：否</li><li>Name 按【资源图谱名称】模糊匹配。类型：String。必选：否</li><li>Status 按【状态】模糊匹配。类型：int。必选：否；0：初始化中；1：就绪；2：创建失败；3：删除中；5：删除失败</li><li>tagKey 按照【标签键】进行过滤。类型：String。必选：否</li><li>tag:tagKey 按照【标签键值对】进行过滤。tagKey 使用具体的标签键进行替换，例如 tag:exampleKey。类型：String。必选：否</li></ul>注意：每次请求的 Filters 上限 10，Filter.Values 上限 100。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <ul><li>ResourceGraphId 按【资源图谱 ID】精确匹配。类型：String。必选：否</li><li>Name 按【资源图谱名称】模糊匹配。类型：String。必选：否</li><li>Status 按【状态】模糊匹配。类型：int。必选：否；0：初始化中；1：就绪；2：创建失败；3：删除中；5：删除失败</li><li>tagKey 按照【标签键】进行过滤。类型：String。必选：否</li><li>tag:tagKey 按照【标签键值对】进行过滤。tagKey 使用具体的标签键进行替换，例如 tag:exampleKey。类型：String。必选：否</li></ul>注意：每次请求的 Filters 上限 10，Filter.Values 上限 100。
     * @param Filters <ul><li>ResourceGraphId 按【资源图谱 ID】精确匹配。类型：String。必选：否</li><li>Name 按【资源图谱名称】模糊匹配。类型：String。必选：否</li><li>Status 按【状态】模糊匹配。类型：int。必选：否；0：初始化中；1：就绪；2：创建失败；3：删除中；5：删除失败</li><li>tagKey 按照【标签键】进行过滤。类型：String。必选：否</li><li>tag:tagKey 按照【标签键值对】进行过滤。tagKey 使用具体的标签键进行替换，例如 tag:exampleKey。类型：String。必选：否</li></ul>注意：每次请求的 Filters 上限 10，Filter.Values 上限 100。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页偏移量</p><p>默认值：0</p> 
     * @return Offset <p>分页偏移量</p><p>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量</p><p>默认值：0</p>
     * @param Offset <p>分页偏移量</p><p>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页单页数量</p><p>取值范围：[0, 100]</p><p>默认值：20</p> 
     * @return Limit <p>分页单页数量</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页单页数量</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     * @param Limit <p>分页单页数量</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeResourceGraphsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceGraphsRequest(DescribeResourceGraphsRequest source) {
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

