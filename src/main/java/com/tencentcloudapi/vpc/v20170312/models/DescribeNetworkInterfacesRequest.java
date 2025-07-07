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

public class DescribeNetworkInterfacesRequest extends AbstractModel {

    /**
    * 弹性网卡实例ID查询。形如：eni-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定NetworkInterfaceIds和Filters。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

    */
    @SerializedName("NetworkInterfaceIds")
    @Expose
    private String [] NetworkInterfaceIds;

    /**
    * 过滤条件，参数不支持同时指定NetworkInterfaceIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。可通过可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
</li>
<li>subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
</li>
<li>network-interface-id - String - （过滤条件）弹性网卡实例ID，形如：eni-5k56k7k7。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。
</li>
<li>attachment.instance-id - String - （过滤条件）绑定的云服务器实例ID，形如：ins-3nqpdn3i。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)接口获取。
</li>
<li>groups.security-group-id - String - （过滤条件）绑定的安全组实例ID，例如：sg-f9ekbxeq。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。
</li>
<li>network-interface-name - String - （过滤条件）网卡实例名称。</li>
<li>network-interface-description - String - （过滤条件）网卡实例描述。</li>
<li>address-ip - String - （过滤条件）内网IPv4地址，单IP后缀模糊匹配，多IP精确匹配。可以与`ip-exact-match`配合做单IP的精确匹配查询。</li>
<li>ip-exact-match - Boolean - （过滤条件）内网IPv4精确匹配查询，存在多值情况，只取第一个。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。使用请参考示例2</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
<li>is-primary - Boolean - 是否必填：否 - （过滤条件）按照是否主网卡进行过滤。值为true时，仅过滤主网卡；值为false时，仅过滤辅助网卡；此过滤参数未提供时，同时过滤主网卡和辅助网卡。</li>
<li>eni-type - String -是否必填：否- （过滤条件）按照网卡类型进行过滤。“0”-辅助网卡，“1”-主网卡，“2”：中继网卡。</li>
<li>eni-qos - String -是否必填：否- （过滤条件）按照网卡服务质量进行过滤。PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</li>
<li>address-ipv6 - String - 是否必填：否 -（过滤条件）内网IPv6地址过滤，支持多ipv6地址查询，如果和address-ip一起使用取交集。</li>
<li>public-address-ip - String - （过滤条件）公网IPv4地址，精确匹配。</li>
<li>address-type - String - （过滤条件）IPv6 Cidr 的类型，精确匹配。`GUA`(全球单播地址), `ULA`(唯一本地地址)。</li>
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
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 弹性网卡实例ID查询。形如：eni-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定NetworkInterfaceIds和Filters。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。
 
     * @return NetworkInterfaceIds 弹性网卡实例ID查询。形如：eni-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定NetworkInterfaceIds和Filters。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     */
    public String [] getNetworkInterfaceIds() {
        return this.NetworkInterfaceIds;
    }

    /**
     * Set 弹性网卡实例ID查询。形如：eni-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定NetworkInterfaceIds和Filters。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     * @param NetworkInterfaceIds 弹性网卡实例ID查询。形如：eni-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定NetworkInterfaceIds和Filters。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。

     */
    public void setNetworkInterfaceIds(String [] NetworkInterfaceIds) {
        this.NetworkInterfaceIds = NetworkInterfaceIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定NetworkInterfaceIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。可通过可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
</li>
<li>subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
</li>
<li>network-interface-id - String - （过滤条件）弹性网卡实例ID，形如：eni-5k56k7k7。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。
</li>
<li>attachment.instance-id - String - （过滤条件）绑定的云服务器实例ID，形如：ins-3nqpdn3i。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)接口获取。
</li>
<li>groups.security-group-id - String - （过滤条件）绑定的安全组实例ID，例如：sg-f9ekbxeq。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。
</li>
<li>network-interface-name - String - （过滤条件）网卡实例名称。</li>
<li>network-interface-description - String - （过滤条件）网卡实例描述。</li>
<li>address-ip - String - （过滤条件）内网IPv4地址，单IP后缀模糊匹配，多IP精确匹配。可以与`ip-exact-match`配合做单IP的精确匹配查询。</li>
<li>ip-exact-match - Boolean - （过滤条件）内网IPv4精确匹配查询，存在多值情况，只取第一个。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。使用请参考示例2</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
<li>is-primary - Boolean - 是否必填：否 - （过滤条件）按照是否主网卡进行过滤。值为true时，仅过滤主网卡；值为false时，仅过滤辅助网卡；此过滤参数未提供时，同时过滤主网卡和辅助网卡。</li>
<li>eni-type - String -是否必填：否- （过滤条件）按照网卡类型进行过滤。“0”-辅助网卡，“1”-主网卡，“2”：中继网卡。</li>
<li>eni-qos - String -是否必填：否- （过滤条件）按照网卡服务质量进行过滤。PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</li>
<li>address-ipv6 - String - 是否必填：否 -（过滤条件）内网IPv6地址过滤，支持多ipv6地址查询，如果和address-ip一起使用取交集。</li>
<li>public-address-ip - String - （过滤条件）公网IPv4地址，精确匹配。</li>
<li>address-type - String - （过滤条件）IPv6 Cidr 的类型，精确匹配。`GUA`(全球单播地址), `ULA`(唯一本地地址)。</li> 
     * @return Filters 过滤条件，参数不支持同时指定NetworkInterfaceIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。可通过可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
</li>
<li>subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
</li>
<li>network-interface-id - String - （过滤条件）弹性网卡实例ID，形如：eni-5k56k7k7。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。
</li>
<li>attachment.instance-id - String - （过滤条件）绑定的云服务器实例ID，形如：ins-3nqpdn3i。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)接口获取。
</li>
<li>groups.security-group-id - String - （过滤条件）绑定的安全组实例ID，例如：sg-f9ekbxeq。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。
</li>
<li>network-interface-name - String - （过滤条件）网卡实例名称。</li>
<li>network-interface-description - String - （过滤条件）网卡实例描述。</li>
<li>address-ip - String - （过滤条件）内网IPv4地址，单IP后缀模糊匹配，多IP精确匹配。可以与`ip-exact-match`配合做单IP的精确匹配查询。</li>
<li>ip-exact-match - Boolean - （过滤条件）内网IPv4精确匹配查询，存在多值情况，只取第一个。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。使用请参考示例2</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
<li>is-primary - Boolean - 是否必填：否 - （过滤条件）按照是否主网卡进行过滤。值为true时，仅过滤主网卡；值为false时，仅过滤辅助网卡；此过滤参数未提供时，同时过滤主网卡和辅助网卡。</li>
<li>eni-type - String -是否必填：否- （过滤条件）按照网卡类型进行过滤。“0”-辅助网卡，“1”-主网卡，“2”：中继网卡。</li>
<li>eni-qos - String -是否必填：否- （过滤条件）按照网卡服务质量进行过滤。PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</li>
<li>address-ipv6 - String - 是否必填：否 -（过滤条件）内网IPv6地址过滤，支持多ipv6地址查询，如果和address-ip一起使用取交集。</li>
<li>public-address-ip - String - （过滤条件）公网IPv4地址，精确匹配。</li>
<li>address-type - String - （过滤条件）IPv6 Cidr 的类型，精确匹配。`GUA`(全球单播地址), `ULA`(唯一本地地址)。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定NetworkInterfaceIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。可通过可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
</li>
<li>subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
</li>
<li>network-interface-id - String - （过滤条件）弹性网卡实例ID，形如：eni-5k56k7k7。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。
</li>
<li>attachment.instance-id - String - （过滤条件）绑定的云服务器实例ID，形如：ins-3nqpdn3i。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)接口获取。
</li>
<li>groups.security-group-id - String - （过滤条件）绑定的安全组实例ID，例如：sg-f9ekbxeq。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。
</li>
<li>network-interface-name - String - （过滤条件）网卡实例名称。</li>
<li>network-interface-description - String - （过滤条件）网卡实例描述。</li>
<li>address-ip - String - （过滤条件）内网IPv4地址，单IP后缀模糊匹配，多IP精确匹配。可以与`ip-exact-match`配合做单IP的精确匹配查询。</li>
<li>ip-exact-match - Boolean - （过滤条件）内网IPv4精确匹配查询，存在多值情况，只取第一个。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。使用请参考示例2</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
<li>is-primary - Boolean - 是否必填：否 - （过滤条件）按照是否主网卡进行过滤。值为true时，仅过滤主网卡；值为false时，仅过滤辅助网卡；此过滤参数未提供时，同时过滤主网卡和辅助网卡。</li>
<li>eni-type - String -是否必填：否- （过滤条件）按照网卡类型进行过滤。“0”-辅助网卡，“1”-主网卡，“2”：中继网卡。</li>
<li>eni-qos - String -是否必填：否- （过滤条件）按照网卡服务质量进行过滤。PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</li>
<li>address-ipv6 - String - 是否必填：否 -（过滤条件）内网IPv6地址过滤，支持多ipv6地址查询，如果和address-ip一起使用取交集。</li>
<li>public-address-ip - String - （过滤条件）公网IPv4地址，精确匹配。</li>
<li>address-type - String - （过滤条件）IPv6 Cidr 的类型，精确匹配。`GUA`(全球单播地址), `ULA`(唯一本地地址)。</li>
     * @param Filters 过滤条件，参数不支持同时指定NetworkInterfaceIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。可通过可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取。
</li>
<li>subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取。
</li>
<li>network-interface-id - String - （过滤条件）弹性网卡实例ID，形如：eni-5k56k7k7。可通过[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口获取。
</li>
<li>attachment.instance-id - String - （过滤条件）绑定的云服务器实例ID，形如：ins-3nqpdn3i。可通过[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)接口获取。
</li>
<li>groups.security-group-id - String - （过滤条件）绑定的安全组实例ID，例如：sg-f9ekbxeq。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。
</li>
<li>network-interface-name - String - （过滤条件）网卡实例名称。</li>
<li>network-interface-description - String - （过滤条件）网卡实例描述。</li>
<li>address-ip - String - （过滤条件）内网IPv4地址，单IP后缀模糊匹配，多IP精确匹配。可以与`ip-exact-match`配合做单IP的精确匹配查询。</li>
<li>ip-exact-match - Boolean - （过滤条件）内网IPv4精确匹配查询，存在多值情况，只取第一个。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。使用请参考示例2</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
<li>is-primary - Boolean - 是否必填：否 - （过滤条件）按照是否主网卡进行过滤。值为true时，仅过滤主网卡；值为false时，仅过滤辅助网卡；此过滤参数未提供时，同时过滤主网卡和辅助网卡。</li>
<li>eni-type - String -是否必填：否- （过滤条件）按照网卡类型进行过滤。“0”-辅助网卡，“1”-主网卡，“2”：中继网卡。</li>
<li>eni-qos - String -是否必填：否- （过滤条件）按照网卡服务质量进行过滤。PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</li>
<li>address-ipv6 - String - 是否必填：否 -（过滤条件）内网IPv6地址过滤，支持多ipv6地址查询，如果和address-ip一起使用取交集。</li>
<li>public-address-ip - String - （过滤条件）公网IPv4地址，精确匹配。</li>
<li>address-type - String - （过滤条件）IPv6 Cidr 的类型，精确匹配。`GUA`(全球单播地址), `ULA`(唯一本地地址)。</li>
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
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeNetworkInterfacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkInterfacesRequest(DescribeNetworkInterfacesRequest source) {
        if (source.NetworkInterfaceIds != null) {
            this.NetworkInterfaceIds = new String[source.NetworkInterfaceIds.length];
            for (int i = 0; i < source.NetworkInterfaceIds.length; i++) {
                this.NetworkInterfaceIds[i] = new String(source.NetworkInterfaceIds[i]);
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
        this.setParamArraySimple(map, prefix + "NetworkInterfaceIds.", this.NetworkInterfaceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

