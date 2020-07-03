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

public class DescribeVpcIpv6AddressesRequest extends AbstractModel{

    /**
    * `VPC`实例`ID`，形如：`vpc-f49l6u0z`。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * `IP`地址列表，批量查询单次请求最多支持`10`个。
    */
    @SerializedName("Ipv6Addresses")
    @Expose
    private String [] Ipv6Addresses;

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get `VPC`实例`ID`，形如：`vpc-f49l6u0z`。 
     * @return VpcId `VPC`实例`ID`，形如：`vpc-f49l6u0z`。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `VPC`实例`ID`，形如：`vpc-f49l6u0z`。
     * @param VpcId `VPC`实例`ID`，形如：`vpc-f49l6u0z`。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get `IP`地址列表，批量查询单次请求最多支持`10`个。 
     * @return Ipv6Addresses `IP`地址列表，批量查询单次请求最多支持`10`个。
     */
    public String [] getIpv6Addresses() {
        return this.Ipv6Addresses;
    }

    /**
     * Set `IP`地址列表，批量查询单次请求最多支持`10`个。
     * @param Ipv6Addresses `IP`地址列表，批量查询单次请求最多支持`10`个。
     */
    public void setIpv6Addresses(String [] Ipv6Addresses) {
        this.Ipv6Addresses = Ipv6Addresses;
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
     * Get 返回数量。 
     * @return Limit 返回数量。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量。
     * @param Limit 返回数量。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "Ipv6Addresses.", this.Ipv6Addresses);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

