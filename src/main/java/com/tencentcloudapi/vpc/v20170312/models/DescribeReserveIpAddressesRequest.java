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

public class DescribeReserveIpAddressesRequest extends AbstractModel {

    /**
    * 内网保留IP唯一ID 列表
    */
    @SerializedName("ReserveIpIds")
    @Expose
    private String [] ReserveIpIds;

    /**
    * 过滤条件，参数不支持同时指定ReserveIpIds和Filters。

reserve-ip-id  - String - （过滤条件）内网保留 IP唯一 ID，形如：rsvip-pvqgv9vi。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。
address-ip - String - （过滤条件）内网保留 IP 地址，形如：192.168.0.10。
ip-type - String - （过滤条件）业务类型 ipType，0。
name - String - （过滤条件）名称。
state - String - （过滤条件）状态，可选值：Bind， UnBind。
resource-id - String - （过滤条件）绑定的实例资源，形如：eni-059qmnif。
tag-key - String -（过滤条件）按照标签键进行过滤。
tag:tag-key - String - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 请求对象个数。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 内网保留IP唯一ID 列表 
     * @return ReserveIpIds 内网保留IP唯一ID 列表
     */
    public String [] getReserveIpIds() {
        return this.ReserveIpIds;
    }

    /**
     * Set 内网保留IP唯一ID 列表
     * @param ReserveIpIds 内网保留IP唯一ID 列表
     */
    public void setReserveIpIds(String [] ReserveIpIds) {
        this.ReserveIpIds = ReserveIpIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定ReserveIpIds和Filters。

reserve-ip-id  - String - （过滤条件）内网保留 IP唯一 ID，形如：rsvip-pvqgv9vi。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。
address-ip - String - （过滤条件）内网保留 IP 地址，形如：192.168.0.10。
ip-type - String - （过滤条件）业务类型 ipType，0。
name - String - （过滤条件）名称。
state - String - （过滤条件）状态，可选值：Bind， UnBind。
resource-id - String - （过滤条件）绑定的实例资源，形如：eni-059qmnif。
tag-key - String -（过滤条件）按照标签键进行过滤。
tag:tag-key - String - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。
 
     * @return Filters 过滤条件，参数不支持同时指定ReserveIpIds和Filters。

reserve-ip-id  - String - （过滤条件）内网保留 IP唯一 ID，形如：rsvip-pvqgv9vi。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。
address-ip - String - （过滤条件）内网保留 IP 地址，形如：192.168.0.10。
ip-type - String - （过滤条件）业务类型 ipType，0。
name - String - （过滤条件）名称。
state - String - （过滤条件）状态，可选值：Bind， UnBind。
resource-id - String - （过滤条件）绑定的实例资源，形如：eni-059qmnif。
tag-key - String -（过滤条件）按照标签键进行过滤。
tag:tag-key - String - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定ReserveIpIds和Filters。

reserve-ip-id  - String - （过滤条件）内网保留 IP唯一 ID，形如：rsvip-pvqgv9vi。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。
address-ip - String - （过滤条件）内网保留 IP 地址，形如：192.168.0.10。
ip-type - String - （过滤条件）业务类型 ipType，0。
name - String - （过滤条件）名称。
state - String - （过滤条件）状态，可选值：Bind， UnBind。
resource-id - String - （过滤条件）绑定的实例资源，形如：eni-059qmnif。
tag-key - String -（过滤条件）按照标签键进行过滤。
tag:tag-key - String - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。

     * @param Filters 过滤条件，参数不支持同时指定ReserveIpIds和Filters。

reserve-ip-id  - String - （过滤条件）内网保留 IP唯一 ID，形如：rsvip-pvqgv9vi。
vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。
subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。
address-ip - String - （过滤条件）内网保留 IP 地址，形如：192.168.0.10。
ip-type - String - （过滤条件）业务类型 ipType，0。
name - String - （过滤条件）名称。
state - String - （过滤条件）状态，可选值：Bind， UnBind。
resource-id - String - （过滤条件）绑定的实例资源，形如：eni-059qmnif。
tag-key - String -（过滤条件）按照标签键进行过滤。
tag:tag-key - String - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量。 
     * @return Offset 偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 请求对象个数。 
     * @return Limit 请求对象个数。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 请求对象个数。
     * @param Limit 请求对象个数。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeReserveIpAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReserveIpAddressesRequest(DescribeReserveIpAddressesRequest source) {
        if (source.ReserveIpIds != null) {
            this.ReserveIpIds = new String[source.ReserveIpIds.length];
            for (int i = 0; i < source.ReserveIpIds.length; i++) {
                this.ReserveIpIds[i] = new String(source.ReserveIpIds[i]);
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
        this.setParamArraySimple(map, prefix + "ReserveIpIds.", this.ReserveIpIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

