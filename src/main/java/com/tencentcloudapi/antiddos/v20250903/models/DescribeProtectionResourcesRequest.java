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

public class DescribeProtectionResourcesRequest extends AbstractModel {

    /**
    * <p>防护实例 ID。</p>
    */
    @SerializedName("ProtectionId")
    @Expose
    private String ProtectionId;

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
    * <p>过滤条件。<p><code>Filters</code> 数组的元素个数上限为 20。不填写该参数时，返回防护实例下的全部防护资源。</p><p>支持的过滤字段：</p><ul><li><code>ResourceType</code>：按防护资源类型过滤。可选项：<ul><li><code>cvm</code>：云服务器。</li><li><code>lighthouse</code>：轻量应用服务器。</li><li><code>clb</code>：负载均衡。</li><li><code>eip</code>：弹性公网 IP。</li><li><code>waf</code>：Web 应用防火墙。</li><li><code>teo_l7_domain</code>：EdgeOne 域名。</li><li><code>teo_l4_proxy</code>：EdgeOne 四层代理。</li></ul></li></ul></p>
    */
    @SerializedName("Filters")
    @Expose
    private ProtectionFilter [] Filters;

    /**
     * Get <p>防护实例 ID。</p> 
     * @return ProtectionId <p>防护实例 ID。</p>
     */
    public String getProtectionId() {
        return this.ProtectionId;
    }

    /**
     * Set <p>防护实例 ID。</p>
     * @param ProtectionId <p>防护实例 ID。</p>
     */
    public void setProtectionId(String ProtectionId) {
        this.ProtectionId = ProtectionId;
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

    /**
     * Get <p>过滤条件。<p><code>Filters</code> 数组的元素个数上限为 20。不填写该参数时，返回防护实例下的全部防护资源。</p><p>支持的过滤字段：</p><ul><li><code>ResourceType</code>：按防护资源类型过滤。可选项：<ul><li><code>cvm</code>：云服务器。</li><li><code>lighthouse</code>：轻量应用服务器。</li><li><code>clb</code>：负载均衡。</li><li><code>eip</code>：弹性公网 IP。</li><li><code>waf</code>：Web 应用防火墙。</li><li><code>teo_l7_domain</code>：EdgeOne 域名。</li><li><code>teo_l4_proxy</code>：EdgeOne 四层代理。</li></ul></li></ul></p> 
     * @return Filters <p>过滤条件。<p><code>Filters</code> 数组的元素个数上限为 20。不填写该参数时，返回防护实例下的全部防护资源。</p><p>支持的过滤字段：</p><ul><li><code>ResourceType</code>：按防护资源类型过滤。可选项：<ul><li><code>cvm</code>：云服务器。</li><li><code>lighthouse</code>：轻量应用服务器。</li><li><code>clb</code>：负载均衡。</li><li><code>eip</code>：弹性公网 IP。</li><li><code>waf</code>：Web 应用防火墙。</li><li><code>teo_l7_domain</code>：EdgeOne 域名。</li><li><code>teo_l4_proxy</code>：EdgeOne 四层代理。</li></ul></li></ul></p>
     */
    public ProtectionFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。<p><code>Filters</code> 数组的元素个数上限为 20。不填写该参数时，返回防护实例下的全部防护资源。</p><p>支持的过滤字段：</p><ul><li><code>ResourceType</code>：按防护资源类型过滤。可选项：<ul><li><code>cvm</code>：云服务器。</li><li><code>lighthouse</code>：轻量应用服务器。</li><li><code>clb</code>：负载均衡。</li><li><code>eip</code>：弹性公网 IP。</li><li><code>waf</code>：Web 应用防火墙。</li><li><code>teo_l7_domain</code>：EdgeOne 域名。</li><li><code>teo_l4_proxy</code>：EdgeOne 四层代理。</li></ul></li></ul></p>
     * @param Filters <p>过滤条件。<p><code>Filters</code> 数组的元素个数上限为 20。不填写该参数时，返回防护实例下的全部防护资源。</p><p>支持的过滤字段：</p><ul><li><code>ResourceType</code>：按防护资源类型过滤。可选项：<ul><li><code>cvm</code>：云服务器。</li><li><code>lighthouse</code>：轻量应用服务器。</li><li><code>clb</code>：负载均衡。</li><li><code>eip</code>：弹性公网 IP。</li><li><code>waf</code>：Web 应用防火墙。</li><li><code>teo_l7_domain</code>：EdgeOne 域名。</li><li><code>teo_l4_proxy</code>：EdgeOne 四层代理。</li></ul></li></ul></p>
     */
    public void setFilters(ProtectionFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeProtectionResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProtectionResourcesRequest(DescribeProtectionResourcesRequest source) {
        if (source.ProtectionId != null) {
            this.ProtectionId = new String(source.ProtectionId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ProtectionFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ProtectionFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectionId", this.ProtectionId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

