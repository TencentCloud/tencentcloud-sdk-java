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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcEndPointServiceRequest extends AbstractModel {

    /**
    * 过滤条件。不支持同时传入参数 EndPointServiceIds and Filters。
<li> service-id - String - （过滤条件）终端节点服务唯一ID。</li>
<li>service-name - String - （过滤条件）终端节点实例名称。</li>
<li>service-instance-id - String - （过滤条件）后端服务的唯一ID，比如lb-xxx。</li>
<li>service-type - String - （过滤条件）后端PAAS服务类型，CLB,CDB,CRS，不填默认查询类型为CLB。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单页返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 终端节点服务ID。不支持同时传入参数 EndPointServiceIds and Filters。
    */
    @SerializedName("EndPointServiceIds")
    @Expose
    private String [] EndPointServiceIds;

    /**
    * <li>不支持同时传入参数 Filters 。</li> <li>列出授权给当前账号的终端节点服务信息。可以配合EndPointServiceIds参数进行过滤，哪些终端节点服务授权了该账户。</li>
    */
    @SerializedName("IsListAuthorizedEndPointService")
    @Expose
    private Boolean IsListAuthorizedEndPointService;

    /**
    * 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
    */
    @SerializedName("IpAddressType")
    @Expose
    private String IpAddressType;

    /**
     * Get 过滤条件。不支持同时传入参数 EndPointServiceIds and Filters。
<li> service-id - String - （过滤条件）终端节点服务唯一ID。</li>
<li>service-name - String - （过滤条件）终端节点实例名称。</li>
<li>service-instance-id - String - （过滤条件）后端服务的唯一ID，比如lb-xxx。</li>
<li>service-type - String - （过滤条件）后端PAAS服务类型，CLB,CDB,CRS，不填默认查询类型为CLB。</li> 
     * @return Filters 过滤条件。不支持同时传入参数 EndPointServiceIds and Filters。
<li> service-id - String - （过滤条件）终端节点服务唯一ID。</li>
<li>service-name - String - （过滤条件）终端节点实例名称。</li>
<li>service-instance-id - String - （过滤条件）后端服务的唯一ID，比如lb-xxx。</li>
<li>service-type - String - （过滤条件）后端PAAS服务类型，CLB,CDB,CRS，不填默认查询类型为CLB。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。不支持同时传入参数 EndPointServiceIds and Filters。
<li> service-id - String - （过滤条件）终端节点服务唯一ID。</li>
<li>service-name - String - （过滤条件）终端节点实例名称。</li>
<li>service-instance-id - String - （过滤条件）后端服务的唯一ID，比如lb-xxx。</li>
<li>service-type - String - （过滤条件）后端PAAS服务类型，CLB,CDB,CRS，不填默认查询类型为CLB。</li>
     * @param Filters 过滤条件。不支持同时传入参数 EndPointServiceIds and Filters。
<li> service-id - String - （过滤条件）终端节点服务唯一ID。</li>
<li>service-name - String - （过滤条件）终端节点实例名称。</li>
<li>service-instance-id - String - （过滤条件）后端服务的唯一ID，比如lb-xxx。</li>
<li>service-type - String - （过滤条件）后端PAAS服务类型，CLB,CDB,CRS，不填默认查询类型为CLB。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单页返回数量，默认为20，最大值为100。 
     * @return Limit 单页返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页返回数量，默认为20，最大值为100。
     * @param Limit 单页返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 终端节点服务ID。不支持同时传入参数 EndPointServiceIds and Filters。 
     * @return EndPointServiceIds 终端节点服务ID。不支持同时传入参数 EndPointServiceIds and Filters。
     */
    public String [] getEndPointServiceIds() {
        return this.EndPointServiceIds;
    }

    /**
     * Set 终端节点服务ID。不支持同时传入参数 EndPointServiceIds and Filters。
     * @param EndPointServiceIds 终端节点服务ID。不支持同时传入参数 EndPointServiceIds and Filters。
     */
    public void setEndPointServiceIds(String [] EndPointServiceIds) {
        this.EndPointServiceIds = EndPointServiceIds;
    }

    /**
     * Get <li>不支持同时传入参数 Filters 。</li> <li>列出授权给当前账号的终端节点服务信息。可以配合EndPointServiceIds参数进行过滤，哪些终端节点服务授权了该账户。</li> 
     * @return IsListAuthorizedEndPointService <li>不支持同时传入参数 Filters 。</li> <li>列出授权给当前账号的终端节点服务信息。可以配合EndPointServiceIds参数进行过滤，哪些终端节点服务授权了该账户。</li>
     */
    public Boolean getIsListAuthorizedEndPointService() {
        return this.IsListAuthorizedEndPointService;
    }

    /**
     * Set <li>不支持同时传入参数 Filters 。</li> <li>列出授权给当前账号的终端节点服务信息。可以配合EndPointServiceIds参数进行过滤，哪些终端节点服务授权了该账户。</li>
     * @param IsListAuthorizedEndPointService <li>不支持同时传入参数 Filters 。</li> <li>列出授权给当前账号的终端节点服务信息。可以配合EndPointServiceIds参数进行过滤，哪些终端节点服务授权了该账户。</li>
     */
    public void setIsListAuthorizedEndPointService(Boolean IsListAuthorizedEndPointService) {
        this.IsListAuthorizedEndPointService = IsListAuthorizedEndPointService;
    }

    /**
     * Get 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。 
     * @return IpAddressType 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     */
    public String getIpAddressType() {
        return this.IpAddressType;
    }

    /**
     * Set 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     * @param IpAddressType 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     */
    public void setIpAddressType(String IpAddressType) {
        this.IpAddressType = IpAddressType;
    }

    public DescribeVpcEndPointServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcEndPointServiceRequest(DescribeVpcEndPointServiceRequest source) {
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
        if (source.EndPointServiceIds != null) {
            this.EndPointServiceIds = new String[source.EndPointServiceIds.length];
            for (int i = 0; i < source.EndPointServiceIds.length; i++) {
                this.EndPointServiceIds[i] = new String(source.EndPointServiceIds[i]);
            }
        }
        if (source.IsListAuthorizedEndPointService != null) {
            this.IsListAuthorizedEndPointService = new Boolean(source.IsListAuthorizedEndPointService);
        }
        if (source.IpAddressType != null) {
            this.IpAddressType = new String(source.IpAddressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "EndPointServiceIds.", this.EndPointServiceIds);
        this.setParamSimple(map, prefix + "IsListAuthorizedEndPointService", this.IsListAuthorizedEndPointService);
        this.setParamSimple(map, prefix + "IpAddressType", this.IpAddressType);

    }
}

