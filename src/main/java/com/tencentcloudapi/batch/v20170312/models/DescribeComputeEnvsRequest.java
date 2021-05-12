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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComputeEnvsRequest extends AbstractModel{

    /**
    * 计算环境ID列表，与Filters参数不能同时指定。
    */
    @SerializedName("EnvIds")
    @Expose
    private String [] EnvIds;

    /**
    * 过滤条件
<li> zone - String - 是否必填：否 -（过滤条件）按照可用区过滤。</li>
<li> env-id - String - 是否必填：否 -（过滤条件）按照计算环境ID过滤。</li>
<li> env-name - String - 是否必填：否 -（过滤条件）按照计算环境名称过滤。</li>
<li> resource-type - String - 是否必填：否 -（过滤条件）按照计算资源类型过滤，取值CVM或者CPM(黑石)。</li>
<li> tag-key - String - 是否必填：否 -（过滤条件）按照标签键进行过滤。</li>
<li>tag-value - String - 是否必填：否 -（过滤条件）按照标签值进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 -（过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。</li>
与EnvIds参数不能同时指定。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 计算环境ID列表，与Filters参数不能同时指定。 
     * @return EnvIds 计算环境ID列表，与Filters参数不能同时指定。
     */
    public String [] getEnvIds() {
        return this.EnvIds;
    }

    /**
     * Set 计算环境ID列表，与Filters参数不能同时指定。
     * @param EnvIds 计算环境ID列表，与Filters参数不能同时指定。
     */
    public void setEnvIds(String [] EnvIds) {
        this.EnvIds = EnvIds;
    }

    /**
     * Get 过滤条件
<li> zone - String - 是否必填：否 -（过滤条件）按照可用区过滤。</li>
<li> env-id - String - 是否必填：否 -（过滤条件）按照计算环境ID过滤。</li>
<li> env-name - String - 是否必填：否 -（过滤条件）按照计算环境名称过滤。</li>
<li> resource-type - String - 是否必填：否 -（过滤条件）按照计算资源类型过滤，取值CVM或者CPM(黑石)。</li>
<li> tag-key - String - 是否必填：否 -（过滤条件）按照标签键进行过滤。</li>
<li>tag-value - String - 是否必填：否 -（过滤条件）按照标签值进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 -（过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。</li>
与EnvIds参数不能同时指定。 
     * @return Filters 过滤条件
<li> zone - String - 是否必填：否 -（过滤条件）按照可用区过滤。</li>
<li> env-id - String - 是否必填：否 -（过滤条件）按照计算环境ID过滤。</li>
<li> env-name - String - 是否必填：否 -（过滤条件）按照计算环境名称过滤。</li>
<li> resource-type - String - 是否必填：否 -（过滤条件）按照计算资源类型过滤，取值CVM或者CPM(黑石)。</li>
<li> tag-key - String - 是否必填：否 -（过滤条件）按照标签键进行过滤。</li>
<li>tag-value - String - 是否必填：否 -（过滤条件）按照标签值进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 -（过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。</li>
与EnvIds参数不能同时指定。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
<li> zone - String - 是否必填：否 -（过滤条件）按照可用区过滤。</li>
<li> env-id - String - 是否必填：否 -（过滤条件）按照计算环境ID过滤。</li>
<li> env-name - String - 是否必填：否 -（过滤条件）按照计算环境名称过滤。</li>
<li> resource-type - String - 是否必填：否 -（过滤条件）按照计算资源类型过滤，取值CVM或者CPM(黑石)。</li>
<li> tag-key - String - 是否必填：否 -（过滤条件）按照标签键进行过滤。</li>
<li>tag-value - String - 是否必填：否 -（过滤条件）按照标签值进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 -（过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。</li>
与EnvIds参数不能同时指定。
     * @param Filters 过滤条件
<li> zone - String - 是否必填：否 -（过滤条件）按照可用区过滤。</li>
<li> env-id - String - 是否必填：否 -（过滤条件）按照计算环境ID过滤。</li>
<li> env-name - String - 是否必填：否 -（过滤条件）按照计算环境名称过滤。</li>
<li> resource-type - String - 是否必填：否 -（过滤条件）按照计算资源类型过滤，取值CVM或者CPM(黑石)。</li>
<li> tag-key - String - 是否必填：否 -（过滤条件）按照标签键进行过滤。</li>
<li>tag-value - String - 是否必填：否 -（过滤条件）按照标签值进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 -（过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。</li>
与EnvIds参数不能同时指定。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量 
     * @return Limit 返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量
     * @param Limit 返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeComputeEnvsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComputeEnvsRequest(DescribeComputeEnvsRequest source) {
        if (source.EnvIds != null) {
            this.EnvIds = new String[source.EnvIds.length];
            for (int i = 0; i < source.EnvIds.length; i++) {
                this.EnvIds[i] = new String(source.EnvIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "EnvIds.", this.EnvIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

