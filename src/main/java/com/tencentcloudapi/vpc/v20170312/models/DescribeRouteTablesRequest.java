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

public class DescribeRouteTablesRequest extends AbstractModel {

    /**
    * 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>route-table-id - String - （过滤条件）路由表实例ID。</li>
<li>route-table-name - String - （过滤条件）路由表名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>association.main - String - （过滤条件）是否主路由表。</li>
<li>tag-key - String -是否必填：否 - （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
<li>next-hop-type - String - 是否必填：否 - （过滤条件）按下一跳类型进行过滤。使用next-hop-type进行过滤时，必须同时携带route-table-id与vpc-id。
目前我们支持的类型有：
LOCAL: 本地路由
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：NAT网关; 
NORMAL_CVM：普通云服务器；
EIP：云服务器的公网IP；
CCN：云联网；
LOCAL_GATEWAY：本地网关。
</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableIds")
    @Expose
    private String [] RouteTableIds;

    /**
    * 偏移量。
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
    * 是否需要获取路由策略信息，默认获取，当控制台不需要拉取路由策略信息时，改为False。
    */
    @SerializedName("NeedRouterInfo")
    @Expose
    private Boolean NeedRouterInfo;

    /**
     * Get 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>route-table-id - String - （过滤条件）路由表实例ID。</li>
<li>route-table-name - String - （过滤条件）路由表名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>association.main - String - （过滤条件）是否主路由表。</li>
<li>tag-key - String -是否必填：否 - （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
<li>next-hop-type - String - 是否必填：否 - （过滤条件）按下一跳类型进行过滤。使用next-hop-type进行过滤时，必须同时携带route-table-id与vpc-id。
目前我们支持的类型有：
LOCAL: 本地路由
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：NAT网关; 
NORMAL_CVM：普通云服务器；
EIP：云服务器的公网IP；
CCN：云联网；
LOCAL_GATEWAY：本地网关。
</li> 
     * @return Filters 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>route-table-id - String - （过滤条件）路由表实例ID。</li>
<li>route-table-name - String - （过滤条件）路由表名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>association.main - String - （过滤条件）是否主路由表。</li>
<li>tag-key - String -是否必填：否 - （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
<li>next-hop-type - String - 是否必填：否 - （过滤条件）按下一跳类型进行过滤。使用next-hop-type进行过滤时，必须同时携带route-table-id与vpc-id。
目前我们支持的类型有：
LOCAL: 本地路由
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：NAT网关; 
NORMAL_CVM：普通云服务器；
EIP：云服务器的公网IP；
CCN：云联网；
LOCAL_GATEWAY：本地网关。
</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>route-table-id - String - （过滤条件）路由表实例ID。</li>
<li>route-table-name - String - （过滤条件）路由表名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>association.main - String - （过滤条件）是否主路由表。</li>
<li>tag-key - String -是否必填：否 - （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
<li>next-hop-type - String - 是否必填：否 - （过滤条件）按下一跳类型进行过滤。使用next-hop-type进行过滤时，必须同时携带route-table-id与vpc-id。
目前我们支持的类型有：
LOCAL: 本地路由
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：NAT网关; 
NORMAL_CVM：普通云服务器；
EIP：云服务器的公网IP；
CCN：云联网；
LOCAL_GATEWAY：本地网关。
</li>
     * @param Filters 过滤条件，参数不支持同时指定RouteTableIds和Filters。
<li>route-table-id - String - （过滤条件）路由表实例ID。</li>
<li>route-table-name - String - （过滤条件）路由表名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>association.main - String - （过滤条件）是否主路由表。</li>
<li>tag-key - String -是否必填：否 - （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
<li>next-hop-type - String - 是否必填：否 - （过滤条件）按下一跳类型进行过滤。使用next-hop-type进行过滤时，必须同时携带route-table-id与vpc-id。
目前我们支持的类型有：
LOCAL: 本地路由
CVM：公网网关类型的云服务器；
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
HAVIP：高可用虚拟IP；
NAT：NAT网关; 
NORMAL_CVM：普通云服务器；
EIP：云服务器的公网IP；
CCN：云联网；
LOCAL_GATEWAY：本地网关。
</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 路由表实例ID，例如：rtb-azd4dt1c。 
     * @return RouteTableIds 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public String [] getRouteTableIds() {
        return this.RouteTableIds;
    }

    /**
     * Set 路由表实例ID，例如：rtb-azd4dt1c。
     * @param RouteTableIds 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public void setRouteTableIds(String [] RouteTableIds) {
        this.RouteTableIds = RouteTableIds;
    }

    /**
     * Get 偏移量。 
     * @return Offset 偏移量。
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
     * @param Offset 偏移量。
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
     * Get 是否需要获取路由策略信息，默认获取，当控制台不需要拉取路由策略信息时，改为False。 
     * @return NeedRouterInfo 是否需要获取路由策略信息，默认获取，当控制台不需要拉取路由策略信息时，改为False。
     */
    public Boolean getNeedRouterInfo() {
        return this.NeedRouterInfo;
    }

    /**
     * Set 是否需要获取路由策略信息，默认获取，当控制台不需要拉取路由策略信息时，改为False。
     * @param NeedRouterInfo 是否需要获取路由策略信息，默认获取，当控制台不需要拉取路由策略信息时，改为False。
     */
    public void setNeedRouterInfo(Boolean NeedRouterInfo) {
        this.NeedRouterInfo = NeedRouterInfo;
    }

    public DescribeRouteTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRouteTablesRequest(DescribeRouteTablesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.RouteTableIds != null) {
            this.RouteTableIds = new String[source.RouteTableIds.length];
            for (int i = 0; i < source.RouteTableIds.length; i++) {
                this.RouteTableIds[i] = new String(source.RouteTableIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.NeedRouterInfo != null) {
            this.NeedRouterInfo = new Boolean(source.NeedRouterInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "RouteTableIds.", this.RouteTableIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NeedRouterInfo", this.NeedRouterInfo);

    }
}

