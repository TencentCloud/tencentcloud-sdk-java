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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoutePoliciesRequest extends AbstractModel {

    /**
    * 路由策略实例唯一ID。形如：rrp-q7ywkx31。每次请求的实例的上限为100。参数不支持同时指定RoutePolicyIds和Filters。
    */
    @SerializedName("RoutePolicyIds")
    @Expose
    private String [] RoutePolicyIds;

    /**
    * 过滤条件，不支持同时指定RoutePolicyIds和Filters参数。
支持的过滤条件如下：
<li>route-policy-name：路由策略实例名称，支持模糊查询。</li>
<li>route-policy-description：路由策略实例描述，支持模糊查询。</li>
<li>route-policy-id ：路由策略实例ID，例如：rrp-q7ywkx3w。</li>

  **说明：**若同一个过滤条件（Filter）存在多个Values，则同一Filter下Values间的关系为逻辑或（OR）关系；若存在多个过滤条件（Filter），Filter之间的关系为逻辑与（AND）关系。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * 是否返回路由策略条目。默认为False。当该参数为False时，仍然会返回空的返回空的RoutePolicyEntrySet。
    */
    @SerializedName("NeedRoutePolicyEntry")
    @Expose
    private Boolean NeedRoutePolicyEntry;

    /**
     * Get 路由策略实例唯一ID。形如：rrp-q7ywkx31。每次请求的实例的上限为100。参数不支持同时指定RoutePolicyIds和Filters。 
     * @return RoutePolicyIds 路由策略实例唯一ID。形如：rrp-q7ywkx31。每次请求的实例的上限为100。参数不支持同时指定RoutePolicyIds和Filters。
     */
    public String [] getRoutePolicyIds() {
        return this.RoutePolicyIds;
    }

    /**
     * Set 路由策略实例唯一ID。形如：rrp-q7ywkx31。每次请求的实例的上限为100。参数不支持同时指定RoutePolicyIds和Filters。
     * @param RoutePolicyIds 路由策略实例唯一ID。形如：rrp-q7ywkx31。每次请求的实例的上限为100。参数不支持同时指定RoutePolicyIds和Filters。
     */
    public void setRoutePolicyIds(String [] RoutePolicyIds) {
        this.RoutePolicyIds = RoutePolicyIds;
    }

    /**
     * Get 过滤条件，不支持同时指定RoutePolicyIds和Filters参数。
支持的过滤条件如下：
<li>route-policy-name：路由策略实例名称，支持模糊查询。</li>
<li>route-policy-description：路由策略实例描述，支持模糊查询。</li>
<li>route-policy-id ：路由策略实例ID，例如：rrp-q7ywkx3w。</li>

  **说明：**若同一个过滤条件（Filter）存在多个Values，则同一Filter下Values间的关系为逻辑或（OR）关系；若存在多个过滤条件（Filter），Filter之间的关系为逻辑与（AND）关系。 
     * @return Filters 过滤条件，不支持同时指定RoutePolicyIds和Filters参数。
支持的过滤条件如下：
<li>route-policy-name：路由策略实例名称，支持模糊查询。</li>
<li>route-policy-description：路由策略实例描述，支持模糊查询。</li>
<li>route-policy-id ：路由策略实例ID，例如：rrp-q7ywkx3w。</li>

  **说明：**若同一个过滤条件（Filter）存在多个Values，则同一Filter下Values间的关系为逻辑或（OR）关系；若存在多个过滤条件（Filter），Filter之间的关系为逻辑与（AND）关系。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，不支持同时指定RoutePolicyIds和Filters参数。
支持的过滤条件如下：
<li>route-policy-name：路由策略实例名称，支持模糊查询。</li>
<li>route-policy-description：路由策略实例描述，支持模糊查询。</li>
<li>route-policy-id ：路由策略实例ID，例如：rrp-q7ywkx3w。</li>

  **说明：**若同一个过滤条件（Filter）存在多个Values，则同一Filter下Values间的关系为逻辑或（OR）关系；若存在多个过滤条件（Filter），Filter之间的关系为逻辑与（AND）关系。
     * @param Filters 过滤条件，不支持同时指定RoutePolicyIds和Filters参数。
支持的过滤条件如下：
<li>route-policy-name：路由策略实例名称，支持模糊查询。</li>
<li>route-policy-description：路由策略实例描述，支持模糊查询。</li>
<li>route-policy-id ：路由策略实例ID，例如：rrp-q7ywkx3w。</li>

  **说明：**若同一个过滤条件（Filter）存在多个Values，则同一Filter下Values间的关系为逻辑或（OR）关系；若存在多个过滤条件（Filter），Filter之间的关系为逻辑与（AND）关系。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是否返回路由策略条目。默认为False。当该参数为False时，仍然会返回空的返回空的RoutePolicyEntrySet。 
     * @return NeedRoutePolicyEntry 是否返回路由策略条目。默认为False。当该参数为False时，仍然会返回空的返回空的RoutePolicyEntrySet。
     */
    public Boolean getNeedRoutePolicyEntry() {
        return this.NeedRoutePolicyEntry;
    }

    /**
     * Set 是否返回路由策略条目。默认为False。当该参数为False时，仍然会返回空的返回空的RoutePolicyEntrySet。
     * @param NeedRoutePolicyEntry 是否返回路由策略条目。默认为False。当该参数为False时，仍然会返回空的返回空的RoutePolicyEntrySet。
     */
    public void setNeedRoutePolicyEntry(Boolean NeedRoutePolicyEntry) {
        this.NeedRoutePolicyEntry = NeedRoutePolicyEntry;
    }

    public DescribeRoutePoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoutePoliciesRequest(DescribeRoutePoliciesRequest source) {
        if (source.RoutePolicyIds != null) {
            this.RoutePolicyIds = new String[source.RoutePolicyIds.length];
            for (int i = 0; i < source.RoutePolicyIds.length; i++) {
                this.RoutePolicyIds[i] = new String(source.RoutePolicyIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.NeedRoutePolicyEntry != null) {
            this.NeedRoutePolicyEntry = new Boolean(source.NeedRoutePolicyEntry);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RoutePolicyIds.", this.RoutePolicyIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NeedRoutePolicyEntry", this.NeedRoutePolicyEntry);

    }
}

