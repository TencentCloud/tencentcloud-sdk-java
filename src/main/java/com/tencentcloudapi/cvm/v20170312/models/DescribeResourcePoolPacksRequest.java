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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourcePoolPacksRequest extends AbstractModel {

    /**
    * 返回数量，默认值为10，最小值为10，最大值为100。
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 分页标记，用于获取下一页数据。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * <li><strong>dedicated-resource-pack-id</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例资源池ID</strong>】进行过滤。形如：rpp-rn99mzt2。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>zone</strong></li>
<p style="padding-left: 30px;">按照【<strong>可用区</strong>】进行过滤。形如：ap-guangzhou-6。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a></p>
<li><strong>instance-family</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例类型</strong>】进行过滤。形如：SA9。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例规格</strong>】进行过滤。形如：SA9.96XLARGE1152。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>status</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例资源池状态</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：CREATING (创建中) | ACTIVE (运行中) | RETIRED (已过期)</p>
每次请求的`Filters`的上限为10。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 返回数量，默认值为10，最小值为10，最大值为100。 
     * @return MaxResults 返回数量，默认值为10，最小值为10，最大值为100。
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 返回数量，默认值为10，最小值为10，最大值为100。
     * @param MaxResults 返回数量，默认值为10，最小值为10，最大值为100。
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 分页标记，用于获取下一页数据。 
     * @return NextToken 分页标记，用于获取下一页数据。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 分页标记，用于获取下一页数据。
     * @param NextToken 分页标记，用于获取下一页数据。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get <li><strong>dedicated-resource-pack-id</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例资源池ID</strong>】进行过滤。形如：rpp-rn99mzt2。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>zone</strong></li>
<p style="padding-left: 30px;">按照【<strong>可用区</strong>】进行过滤。形如：ap-guangzhou-6。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a></p>
<li><strong>instance-family</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例类型</strong>】进行过滤。形如：SA9。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例规格</strong>】进行过滤。形如：SA9.96XLARGE1152。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>status</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例资源池状态</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：CREATING (创建中) | ACTIVE (运行中) | RETIRED (已过期)</p>
每次请求的`Filters`的上限为10。 
     * @return Filters <li><strong>dedicated-resource-pack-id</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例资源池ID</strong>】进行过滤。形如：rpp-rn99mzt2。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>zone</strong></li>
<p style="padding-left: 30px;">按照【<strong>可用区</strong>】进行过滤。形如：ap-guangzhou-6。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a></p>
<li><strong>instance-family</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例类型</strong>】进行过滤。形如：SA9。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例规格</strong>】进行过滤。形如：SA9.96XLARGE1152。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>status</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例资源池状态</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：CREATING (创建中) | ACTIVE (运行中) | RETIRED (已过期)</p>
每次请求的`Filters`的上限为10。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li><strong>dedicated-resource-pack-id</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例资源池ID</strong>】进行过滤。形如：rpp-rn99mzt2。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>zone</strong></li>
<p style="padding-left: 30px;">按照【<strong>可用区</strong>】进行过滤。形如：ap-guangzhou-6。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a></p>
<li><strong>instance-family</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例类型</strong>】进行过滤。形如：SA9。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例规格</strong>】进行过滤。形如：SA9.96XLARGE1152。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>status</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例资源池状态</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：CREATING (创建中) | ACTIVE (运行中) | RETIRED (已过期)</p>
每次请求的`Filters`的上限为10。
     * @param Filters <li><strong>dedicated-resource-pack-id</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例资源池ID</strong>】进行过滤。形如：rpp-rn99mzt2。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>zone</strong></li>
<p style="padding-left: 30px;">按照【<strong>可用区</strong>】进行过滤。形如：ap-guangzhou-6。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a></p>
<li><strong>instance-family</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例类型</strong>】进行过滤。形如：SA9。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>instance-type</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例规格</strong>】进行过滤。形如：SA9.96XLARGE1152。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p>
<li><strong>status</strong></li>
<p style="padding-left: 30px;">按照【<strong>实例资源池状态</strong>】进行过滤。</p><p style="padding-left: 30px;">类型：String</p><p style="padding-left: 30px;">必选：否</p><p style="padding-left: 30px;">可选项：CREATING (创建中) | ACTIVE (运行中) | RETIRED (已过期)</p>
每次请求的`Filters`的上限为10。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeResourcePoolPacksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcePoolPacksRequest(DescribeResourcePoolPacksRequest source) {
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
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
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

