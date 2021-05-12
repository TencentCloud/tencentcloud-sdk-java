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
package com.tencentcloudapi.ecm.v20190719.models;

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
subnet-id - String - Subnet实例名称。
subnet-name - String - 子网名称。只支持单值的模糊查询。
cidr-block - String - 子网网段，形如: 192.168.1.0 。只支持单值的模糊查询。
vpc-id - String - VPC实例ID，形如：vpc-f49l6u0z。
vpc-cidr-block  - String - vpc网段，形如: 192.168.1.0 。只支持单值的模糊查询。
region - String - ECM地域
zone - String - 可用区。
tag-key - String -是否必填：否- 按照标签键进行过滤。
tag:tag-key - String - 是否必填：否 - 按照标签键值对进行过滤。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * ECM 地域
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 排序方式：time时间倒序, default按照网络规划排序
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

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
subnet-id - String - Subnet实例名称。
subnet-name - String - 子网名称。只支持单值的模糊查询。
cidr-block - String - 子网网段，形如: 192.168.1.0 。只支持单值的模糊查询。
vpc-id - String - VPC实例ID，形如：vpc-f49l6u0z。
vpc-cidr-block  - String - vpc网段，形如: 192.168.1.0 。只支持单值的模糊查询。
region - String - ECM地域
zone - String - 可用区。
tag-key - String -是否必填：否- 按照标签键进行过滤。
tag:tag-key - String - 是否必填：否 - 按照标签键值对进行过滤。 
     * @return Filters 过滤条件，参数不支持同时指定SubnetIds和Filters。
subnet-id - String - Subnet实例名称。
subnet-name - String - 子网名称。只支持单值的模糊查询。
cidr-block - String - 子网网段，形如: 192.168.1.0 。只支持单值的模糊查询。
vpc-id - String - VPC实例ID，形如：vpc-f49l6u0z。
vpc-cidr-block  - String - vpc网段，形如: 192.168.1.0 。只支持单值的模糊查询。
region - String - ECM地域
zone - String - 可用区。
tag-key - String -是否必填：否- 按照标签键进行过滤。
tag:tag-key - String - 是否必填：否 - 按照标签键值对进行过滤。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定SubnetIds和Filters。
subnet-id - String - Subnet实例名称。
subnet-name - String - 子网名称。只支持单值的模糊查询。
cidr-block - String - 子网网段，形如: 192.168.1.0 。只支持单值的模糊查询。
vpc-id - String - VPC实例ID，形如：vpc-f49l6u0z。
vpc-cidr-block  - String - vpc网段，形如: 192.168.1.0 。只支持单值的模糊查询。
region - String - ECM地域
zone - String - 可用区。
tag-key - String -是否必填：否- 按照标签键进行过滤。
tag:tag-key - String - 是否必填：否 - 按照标签键值对进行过滤。
     * @param Filters 过滤条件，参数不支持同时指定SubnetIds和Filters。
subnet-id - String - Subnet实例名称。
subnet-name - String - 子网名称。只支持单值的模糊查询。
cidr-block - String - 子网网段，形如: 192.168.1.0 。只支持单值的模糊查询。
vpc-id - String - VPC实例ID，形如：vpc-f49l6u0z。
vpc-cidr-block  - String - vpc网段，形如: 192.168.1.0 。只支持单值的模糊查询。
region - String - ECM地域
zone - String - 可用区。
tag-key - String -是否必填：否- 按照标签键进行过滤。
tag:tag-key - String - 是否必填：否 - 按照标签键值对进行过滤。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量 
     * @return Limit 返回数量
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量
     * @param Limit 返回数量
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get ECM 地域 
     * @return EcmRegion ECM 地域
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM 地域
     * @param EcmRegion ECM 地域
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get 排序方式：time时间倒序, default按照网络规划排序 
     * @return Sort 排序方式：time时间倒序, default按照网络规划排序
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方式：time时间倒序, default按照网络规划排序
     * @param Sort 排序方式：time时间倒序, default按照网络规划排序
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    public DescribeSubnetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubnetsRequest(DescribeSubnetsRequest source) {
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
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
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "Sort", this.Sort);

    }
}

