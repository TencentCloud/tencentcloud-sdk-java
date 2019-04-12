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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubnetsRequest  extends AbstractModel{

    /**
    * 子网实例ID查询。形如：subnet-pxir56ns。参数不支持同时指定SubnetIds和Filters。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 过滤条件，参数不支持同时指定SubnetIds和Filters。
subnet-id - String - （过滤条件）Subnet实例名称。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
cidr-block - String - （过滤条件）vpc的cidr。
subnet-name - String - （过滤条件）子网名称。
zone - String - （过滤条件）可用区。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * 获取子网实例ID查询。形如：subnet-pxir56ns。参数不支持同时指定SubnetIds和Filters。
     * @return SubnetIds 子网实例ID查询。形如：subnet-pxir56ns。参数不支持同时指定SubnetIds和Filters。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * 设置子网实例ID查询。形如：subnet-pxir56ns。参数不支持同时指定SubnetIds和Filters。
     * @param SubnetIds 子网实例ID查询。形如：subnet-pxir56ns。参数不支持同时指定SubnetIds和Filters。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * 获取过滤条件，参数不支持同时指定SubnetIds和Filters。
subnet-id - String - （过滤条件）Subnet实例名称。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
cidr-block - String - （过滤条件）vpc的cidr。
subnet-name - String - （过滤条件）子网名称。
zone - String - （过滤条件）可用区。
     * @return Filters 过滤条件，参数不支持同时指定SubnetIds和Filters。
subnet-id - String - （过滤条件）Subnet实例名称。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
cidr-block - String - （过滤条件）vpc的cidr。
subnet-name - String - （过滤条件）子网名称。
zone - String - （过滤条件）可用区。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件，参数不支持同时指定SubnetIds和Filters。
subnet-id - String - （过滤条件）Subnet实例名称。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
cidr-block - String - （过滤条件）vpc的cidr。
subnet-name - String - （过滤条件）子网名称。
zone - String - （过滤条件）可用区。
     * @param Filters 过滤条件，参数不支持同时指定SubnetIds和Filters。
subnet-id - String - （过滤条件）Subnet实例名称。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
cidr-block - String - （过滤条件）vpc的cidr。
subnet-name - String - （过滤条件）子网名称。
zone - String - （过滤条件）可用区。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量
     * @return Limit 返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量
     * @param Limit 返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

