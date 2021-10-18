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

public class DescribeNatGatewayDirectConnectGatewayRouteRequest extends AbstractModel{

    /**
    * nat的唯一标识
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * vpc的唯一标识
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 0到200之间
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 大于0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get nat的唯一标识 
     * @return NatGatewayId nat的唯一标识
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set nat的唯一标识
     * @param NatGatewayId nat的唯一标识
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get vpc的唯一标识 
     * @return VpcId vpc的唯一标识
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc的唯一标识
     * @param VpcId vpc的唯一标识
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 0到200之间 
     * @return Limit 0到200之间
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 0到200之间
     * @param Limit 0到200之间
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 大于0 
     * @return Offset 大于0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 大于0
     * @param Offset 大于0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeNatGatewayDirectConnectGatewayRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewayDirectConnectGatewayRouteRequest(DescribeNatGatewayDirectConnectGatewayRouteRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

