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

public class DescribeVpcEndPointRequest extends AbstractModel {

    /**
    * 过滤条件。当前支持如下过滤条件：
<li> end-point-service-id- String - （过滤条件）终端节点服务ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。
</li>
<li>end-point-name - String - （过滤条件）终端节点实例名称。</li>
<li> end-point-id- String - （过滤条件）终端节点实例ID。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 
接口获取。</li>
<li> vpc-id- String - （过滤条件）VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
</li>
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
    * 终端节点ID列表。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 
获取。
    */
    @SerializedName("EndPointId")
    @Expose
    private String [] EndPointId;

    /**
    * 协议类型，支持 Ipv4，Ipv6， DualStack，默认 Ipv4。使用DualStack查询双栈的时候，必须要使用MaxResult配合NextToken查询。第1次查询的时候只需要携带MaxResult，如果返回NextToken非空，表示有更多可用数据。第2次查询的时候就需要携带NextToken进行分页查询。
    */
    @SerializedName("IpAddressType")
    @Expose
    private String IpAddressType;

    /**
    * 每次调用返回的最大结果数。如果查询返回的时候有NextToken返回，您可以使用NextToken值获取更多页结果， 当NextToke返回空或者返回的结果数量小于MaxResults时，表示没有更多数据了。允许的最大页面大小为 100。
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 如果NextToken返回非空字符串 ，表示还有更多可用结果。 NextToken是每个页面唯一的分页令牌。使用返回的令牌再次调用以检索下一页。需要保持所有其他参数不变。每个分页令牌在 24 小时后过期。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get 过滤条件。当前支持如下过滤条件：
<li> end-point-service-id- String - （过滤条件）终端节点服务ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。
</li>
<li>end-point-name - String - （过滤条件）终端节点实例名称。</li>
<li> end-point-id- String - （过滤条件）终端节点实例ID。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 
接口获取。</li>
<li> vpc-id- String - （过滤条件）VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
</li> 
     * @return Filters 过滤条件。当前支持如下过滤条件：
<li> end-point-service-id- String - （过滤条件）终端节点服务ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。
</li>
<li>end-point-name - String - （过滤条件）终端节点实例名称。</li>
<li> end-point-id- String - （过滤条件）终端节点实例ID。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 
接口获取。</li>
<li> vpc-id- String - （过滤条件）VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。当前支持如下过滤条件：
<li> end-point-service-id- String - （过滤条件）终端节点服务ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。
</li>
<li>end-point-name - String - （过滤条件）终端节点实例名称。</li>
<li> end-point-id- String - （过滤条件）终端节点实例ID。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 
接口获取。</li>
<li> vpc-id- String - （过滤条件）VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
</li>
     * @param Filters 过滤条件。当前支持如下过滤条件：
<li> end-point-service-id- String - （过滤条件）终端节点服务ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。
</li>
<li>end-point-name - String - （过滤条件）终端节点实例名称。</li>
<li> end-point-id- String - （过滤条件）终端节点实例ID。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 
接口获取。</li>
<li> vpc-id- String - （过滤条件）VPC实例ID。可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取。
</li>
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
     * Get 终端节点ID列表。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 
获取。 
     * @return EndPointId 终端节点ID列表。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 
获取。
     */
    public String [] getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set 终端节点ID列表。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 
获取。
     * @param EndPointId 终端节点ID列表。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 
获取。
     */
    public void setEndPointId(String [] EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get 协议类型，支持 Ipv4，Ipv6， DualStack，默认 Ipv4。使用DualStack查询双栈的时候，必须要使用MaxResult配合NextToken查询。第1次查询的时候只需要携带MaxResult，如果返回NextToken非空，表示有更多可用数据。第2次查询的时候就需要携带NextToken进行分页查询。 
     * @return IpAddressType 协议类型，支持 Ipv4，Ipv6， DualStack，默认 Ipv4。使用DualStack查询双栈的时候，必须要使用MaxResult配合NextToken查询。第1次查询的时候只需要携带MaxResult，如果返回NextToken非空，表示有更多可用数据。第2次查询的时候就需要携带NextToken进行分页查询。
     */
    public String getIpAddressType() {
        return this.IpAddressType;
    }

    /**
     * Set 协议类型，支持 Ipv4，Ipv6， DualStack，默认 Ipv4。使用DualStack查询双栈的时候，必须要使用MaxResult配合NextToken查询。第1次查询的时候只需要携带MaxResult，如果返回NextToken非空，表示有更多可用数据。第2次查询的时候就需要携带NextToken进行分页查询。
     * @param IpAddressType 协议类型，支持 Ipv4，Ipv6， DualStack，默认 Ipv4。使用DualStack查询双栈的时候，必须要使用MaxResult配合NextToken查询。第1次查询的时候只需要携带MaxResult，如果返回NextToken非空，表示有更多可用数据。第2次查询的时候就需要携带NextToken进行分页查询。
     */
    public void setIpAddressType(String IpAddressType) {
        this.IpAddressType = IpAddressType;
    }

    /**
     * Get 每次调用返回的最大结果数。如果查询返回的时候有NextToken返回，您可以使用NextToken值获取更多页结果， 当NextToke返回空或者返回的结果数量小于MaxResults时，表示没有更多数据了。允许的最大页面大小为 100。 
     * @return MaxResults 每次调用返回的最大结果数。如果查询返回的时候有NextToken返回，您可以使用NextToken值获取更多页结果， 当NextToke返回空或者返回的结果数量小于MaxResults时，表示没有更多数据了。允许的最大页面大小为 100。
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 每次调用返回的最大结果数。如果查询返回的时候有NextToken返回，您可以使用NextToken值获取更多页结果， 当NextToke返回空或者返回的结果数量小于MaxResults时，表示没有更多数据了。允许的最大页面大小为 100。
     * @param MaxResults 每次调用返回的最大结果数。如果查询返回的时候有NextToken返回，您可以使用NextToken值获取更多页结果， 当NextToke返回空或者返回的结果数量小于MaxResults时，表示没有更多数据了。允许的最大页面大小为 100。
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 如果NextToken返回非空字符串 ，表示还有更多可用结果。 NextToken是每个页面唯一的分页令牌。使用返回的令牌再次调用以检索下一页。需要保持所有其他参数不变。每个分页令牌在 24 小时后过期。 
     * @return NextToken 如果NextToken返回非空字符串 ，表示还有更多可用结果。 NextToken是每个页面唯一的分页令牌。使用返回的令牌再次调用以检索下一页。需要保持所有其他参数不变。每个分页令牌在 24 小时后过期。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 如果NextToken返回非空字符串 ，表示还有更多可用结果。 NextToken是每个页面唯一的分页令牌。使用返回的令牌再次调用以检索下一页。需要保持所有其他参数不变。每个分页令牌在 24 小时后过期。
     * @param NextToken 如果NextToken返回非空字符串 ，表示还有更多可用结果。 NextToken是每个页面唯一的分页令牌。使用返回的令牌再次调用以检索下一页。需要保持所有其他参数不变。每个分页令牌在 24 小时后过期。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeVpcEndPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcEndPointRequest(DescribeVpcEndPointRequest source) {
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
        if (source.EndPointId != null) {
            this.EndPointId = new String[source.EndPointId.length];
            for (int i = 0; i < source.EndPointId.length; i++) {
                this.EndPointId[i] = new String(source.EndPointId[i]);
            }
        }
        if (source.IpAddressType != null) {
            this.IpAddressType = new String(source.IpAddressType);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "EndPointId.", this.EndPointId);
        this.setParamSimple(map, prefix + "IpAddressType", this.IpAddressType);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

