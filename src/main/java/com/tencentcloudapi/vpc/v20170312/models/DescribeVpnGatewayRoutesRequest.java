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

public class DescribeVpnGatewayRoutesRequest extends AbstractModel{

    /**
    * VPN网关的ID
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * 过滤条件,  条件包括(DestinationCidr, InstanceId,InstanceType)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量, 默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单页个数, 默认20, 最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get VPN网关的ID 
     * @return VpnGatewayId VPN网关的ID
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set VPN网关的ID
     * @param VpnGatewayId VPN网关的ID
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get 过滤条件,  条件包括(DestinationCidr, InstanceId,InstanceType) 
     * @return Filters 过滤条件,  条件包括(DestinationCidr, InstanceId,InstanceType)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件,  条件包括(DestinationCidr, InstanceId,InstanceType)
     * @param Filters 过滤条件,  条件包括(DestinationCidr, InstanceId,InstanceType)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量, 默认0 
     * @return Offset 偏移量, 默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量, 默认0
     * @param Offset 偏移量, 默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单页个数, 默认20, 最大值100 
     * @return Limit 单页个数, 默认20, 最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页个数, 默认20, 最大值100
     * @param Limit 单页个数, 默认20, 最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeVpnGatewayRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpnGatewayRoutesRequest(DescribeVpnGatewayRoutesRequest source) {
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
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
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

