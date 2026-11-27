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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProtectionsRequest extends AbstractModel {

    /**
    * <p>过滤条件。<p><code>Filters</code> 数组的元素个数上限为 20。不填写该参数时，返回当前账号下有权限的全部防护实例。</p><p>支持的过滤字段：</p><ul><li><code>Name</code>：按防护实例名称过滤。</li><li><code>ProtectionId</code>：按防护实例 ID 过滤。</li><li><code>ProtectionLevel</code>：按防护实例级别过滤。可选项：<ul><li><code>advanced</code>：增强防护。</li><li><code>ultimate</code>：卓越防护。</li></ul></li><li><code>Status</code>：按防护实例状态过滤。可选项：<ul><li><code>protecting</code>：防护中。</li><li><code>processing</code>：变更中。</li><li><code>disabling</code>：隔离中或删除中。</li><li><code>disabled</code>：已隔离。</li></ul></li><li><code>TagKey</code>：按标签键过滤。</li><li><code>TagValue</code>：按标签值过滤。</li></ul><p>模糊查询时支持过滤字段名包括 <code>Name</code>、<code>ProtectionId</code>、<code>ProtectionLevel</code>、<code>Status</code>、<code>TagKey</code>、<code>TagValue</code>。</p></p>
    */
    @SerializedName("Filters")
    @Expose
    private ProtectionFilter [] Filters;

    /**
    * <p>分页查询偏移量。默认值：0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页查询限制数目。默认值：20，最大值：100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>过滤条件。<p><code>Filters</code> 数组的元素个数上限为 20。不填写该参数时，返回当前账号下有权限的全部防护实例。</p><p>支持的过滤字段：</p><ul><li><code>Name</code>：按防护实例名称过滤。</li><li><code>ProtectionId</code>：按防护实例 ID 过滤。</li><li><code>ProtectionLevel</code>：按防护实例级别过滤。可选项：<ul><li><code>advanced</code>：增强防护。</li><li><code>ultimate</code>：卓越防护。</li></ul></li><li><code>Status</code>：按防护实例状态过滤。可选项：<ul><li><code>protecting</code>：防护中。</li><li><code>processing</code>：变更中。</li><li><code>disabling</code>：隔离中或删除中。</li><li><code>disabled</code>：已隔离。</li></ul></li><li><code>TagKey</code>：按标签键过滤。</li><li><code>TagValue</code>：按标签值过滤。</li></ul><p>模糊查询时支持过滤字段名包括 <code>Name</code>、<code>ProtectionId</code>、<code>ProtectionLevel</code>、<code>Status</code>、<code>TagKey</code>、<code>TagValue</code>。</p></p> 
     * @return Filters <p>过滤条件。<p><code>Filters</code> 数组的元素个数上限为 20。不填写该参数时，返回当前账号下有权限的全部防护实例。</p><p>支持的过滤字段：</p><ul><li><code>Name</code>：按防护实例名称过滤。</li><li><code>ProtectionId</code>：按防护实例 ID 过滤。</li><li><code>ProtectionLevel</code>：按防护实例级别过滤。可选项：<ul><li><code>advanced</code>：增强防护。</li><li><code>ultimate</code>：卓越防护。</li></ul></li><li><code>Status</code>：按防护实例状态过滤。可选项：<ul><li><code>protecting</code>：防护中。</li><li><code>processing</code>：变更中。</li><li><code>disabling</code>：隔离中或删除中。</li><li><code>disabled</code>：已隔离。</li></ul></li><li><code>TagKey</code>：按标签键过滤。</li><li><code>TagValue</code>：按标签值过滤。</li></ul><p>模糊查询时支持过滤字段名包括 <code>Name</code>、<code>ProtectionId</code>、<code>ProtectionLevel</code>、<code>Status</code>、<code>TagKey</code>、<code>TagValue</code>。</p></p>
     */
    public ProtectionFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。<p><code>Filters</code> 数组的元素个数上限为 20。不填写该参数时，返回当前账号下有权限的全部防护实例。</p><p>支持的过滤字段：</p><ul><li><code>Name</code>：按防护实例名称过滤。</li><li><code>ProtectionId</code>：按防护实例 ID 过滤。</li><li><code>ProtectionLevel</code>：按防护实例级别过滤。可选项：<ul><li><code>advanced</code>：增强防护。</li><li><code>ultimate</code>：卓越防护。</li></ul></li><li><code>Status</code>：按防护实例状态过滤。可选项：<ul><li><code>protecting</code>：防护中。</li><li><code>processing</code>：变更中。</li><li><code>disabling</code>：隔离中或删除中。</li><li><code>disabled</code>：已隔离。</li></ul></li><li><code>TagKey</code>：按标签键过滤。</li><li><code>TagValue</code>：按标签值过滤。</li></ul><p>模糊查询时支持过滤字段名包括 <code>Name</code>、<code>ProtectionId</code>、<code>ProtectionLevel</code>、<code>Status</code>、<code>TagKey</code>、<code>TagValue</code>。</p></p>
     * @param Filters <p>过滤条件。<p><code>Filters</code> 数组的元素个数上限为 20。不填写该参数时，返回当前账号下有权限的全部防护实例。</p><p>支持的过滤字段：</p><ul><li><code>Name</code>：按防护实例名称过滤。</li><li><code>ProtectionId</code>：按防护实例 ID 过滤。</li><li><code>ProtectionLevel</code>：按防护实例级别过滤。可选项：<ul><li><code>advanced</code>：增强防护。</li><li><code>ultimate</code>：卓越防护。</li></ul></li><li><code>Status</code>：按防护实例状态过滤。可选项：<ul><li><code>protecting</code>：防护中。</li><li><code>processing</code>：变更中。</li><li><code>disabling</code>：隔离中或删除中。</li><li><code>disabled</code>：已隔离。</li></ul></li><li><code>TagKey</code>：按标签键过滤。</li><li><code>TagValue</code>：按标签值过滤。</li></ul><p>模糊查询时支持过滤字段名包括 <code>Name</code>、<code>ProtectionId</code>、<code>ProtectionLevel</code>、<code>Status</code>、<code>TagKey</code>、<code>TagValue</code>。</p></p>
     */
    public void setFilters(ProtectionFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页查询偏移量。默认值：0。</p> 
     * @return Offset <p>分页查询偏移量。默认值：0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询偏移量。默认值：0。</p>
     * @param Offset <p>分页查询偏移量。默认值：0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页查询限制数目。默认值：20，最大值：100。</p> 
     * @return Limit <p>分页查询限制数目。默认值：20，最大值：100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询限制数目。默认值：20，最大值：100。</p>
     * @param Limit <p>分页查询限制数目。默认值：20，最大值：100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeProtectionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProtectionsRequest(DescribeProtectionsRequest source) {
        if (source.Filters != null) {
            this.Filters = new ProtectionFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ProtectionFilter(source.Filters[i]);
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

