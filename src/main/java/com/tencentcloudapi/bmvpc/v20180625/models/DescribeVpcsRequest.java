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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcsRequest extends AbstractModel {

    /**
    * VPC实例ID。形如：vpc-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpcIds和Filters。
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * 过滤条件，参数不支持同时指定VpcIds和Filters。
vpc-name - String - （过滤条件）VPC实例名称。
vpc-id - String - （过滤条件）VPC实例ID形如：vpc-f49l6u0z。
cidr-block - String - （过滤条件）vpc的cidr。
state - String - （过滤条件）VPC状态。(pending | available).
zone -  String - （过滤条件）VPC的可用区。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 初始行的偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页行数，默认为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get VPC实例ID。形如：vpc-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpcIds和Filters。 
     * @return VpcIds VPC实例ID。形如：vpc-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpcIds和Filters。
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set VPC实例ID。形如：vpc-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpcIds和Filters。
     * @param VpcIds VPC实例ID。形如：vpc-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpcIds和Filters。
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定VpcIds和Filters。
vpc-name - String - （过滤条件）VPC实例名称。
vpc-id - String - （过滤条件）VPC实例ID形如：vpc-f49l6u0z。
cidr-block - String - （过滤条件）vpc的cidr。
state - String - （过滤条件）VPC状态。(pending | available).
zone -  String - （过滤条件）VPC的可用区。 
     * @return Filters 过滤条件，参数不支持同时指定VpcIds和Filters。
vpc-name - String - （过滤条件）VPC实例名称。
vpc-id - String - （过滤条件）VPC实例ID形如：vpc-f49l6u0z。
cidr-block - String - （过滤条件）vpc的cidr。
state - String - （过滤条件）VPC状态。(pending | available).
zone -  String - （过滤条件）VPC的可用区。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定VpcIds和Filters。
vpc-name - String - （过滤条件）VPC实例名称。
vpc-id - String - （过滤条件）VPC实例ID形如：vpc-f49l6u0z。
cidr-block - String - （过滤条件）vpc的cidr。
state - String - （过滤条件）VPC状态。(pending | available).
zone -  String - （过滤条件）VPC的可用区。
     * @param Filters 过滤条件，参数不支持同时指定VpcIds和Filters。
vpc-name - String - （过滤条件）VPC实例名称。
vpc-id - String - （过滤条件）VPC实例ID形如：vpc-f49l6u0z。
cidr-block - String - （过滤条件）vpc的cidr。
state - String - （过滤条件）VPC状态。(pending | available).
zone -  String - （过滤条件）VPC的可用区。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 初始行的偏移量，默认为0。 
     * @return Offset 初始行的偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 初始行的偏移量，默认为0。
     * @param Offset 初始行的偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页行数，默认为20。 
     * @return Limit 每页行数，默认为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页行数，默认为20。
     * @param Limit 每页行数，默认为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeVpcsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcsRequest(DescribeVpcsRequest source) {
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
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
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

