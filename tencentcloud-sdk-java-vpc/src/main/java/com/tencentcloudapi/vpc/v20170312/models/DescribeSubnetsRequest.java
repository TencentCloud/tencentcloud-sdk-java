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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubnetsRequest extends AbstractModel{

    /**
    * 子网实例ID查询。形如：subnet-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定SubnetIds和Filters。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 过滤条件，参数不支持同时指定SubnetIds和Filters。
<li>subnet-id - String - （过滤条件）Subnet实例名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>cidr-block - String - （过滤条件）子网网段，形如: 192.168.1.0 。</li>
<li>is-default - Boolean - （过滤条件）是否是默认子网。</li>
<li>is-remote-vpc-snat - Boolean - （过滤条件）是否为VPC SNAT地址池子网。</li>
<li>subnet-name - String - （过滤条件）子网名称。</li>
<li>zone - String - （过滤条件）可用区。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
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
     * Get 子网实例ID查询。形如：subnet-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定SubnetIds和Filters。 
     * @return SubnetIds 子网实例ID查询。形如：subnet-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定SubnetIds和Filters。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网实例ID查询。形如：subnet-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定SubnetIds和Filters。
     * @param SubnetIds 子网实例ID查询。形如：subnet-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定SubnetIds和Filters。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定SubnetIds和Filters。
<li>subnet-id - String - （过滤条件）Subnet实例名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>cidr-block - String - （过滤条件）子网网段，形如: 192.168.1.0 。</li>
<li>is-default - Boolean - （过滤条件）是否是默认子网。</li>
<li>is-remote-vpc-snat - Boolean - （过滤条件）是否为VPC SNAT地址池子网。</li>
<li>subnet-name - String - （过滤条件）子网名称。</li>
<li>zone - String - （过滤条件）可用区。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li> 
     * @return Filters 过滤条件，参数不支持同时指定SubnetIds和Filters。
<li>subnet-id - String - （过滤条件）Subnet实例名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>cidr-block - String - （过滤条件）子网网段，形如: 192.168.1.0 。</li>
<li>is-default - Boolean - （过滤条件）是否是默认子网。</li>
<li>is-remote-vpc-snat - Boolean - （过滤条件）是否为VPC SNAT地址池子网。</li>
<li>subnet-name - String - （过滤条件）子网名称。</li>
<li>zone - String - （过滤条件）可用区。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定SubnetIds和Filters。
<li>subnet-id - String - （过滤条件）Subnet实例名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>cidr-block - String - （过滤条件）子网网段，形如: 192.168.1.0 。</li>
<li>is-default - Boolean - （过滤条件）是否是默认子网。</li>
<li>is-remote-vpc-snat - Boolean - （过滤条件）是否为VPC SNAT地址池子网。</li>
<li>subnet-name - String - （过滤条件）子网名称。</li>
<li>zone - String - （过滤条件）可用区。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
     * @param Filters 过滤条件，参数不支持同时指定SubnetIds和Filters。
<li>subnet-id - String - （过滤条件）Subnet实例名称。</li>
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>cidr-block - String - （过滤条件）子网网段，形如: 192.168.1.0 。</li>
<li>is-default - Boolean - （过滤条件）是否是默认子网。</li>
<li>is-remote-vpc-snat - Boolean - （过滤条件）是否为VPC SNAT地址池子网。</li>
<li>subnet-name - String - （过滤条件）子网名称。</li>
<li>zone - String - （过滤条件）可用区。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例2。</li>
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

