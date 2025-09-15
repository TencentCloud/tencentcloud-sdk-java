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

public class DescribeNatGatewaysResponse extends AbstractModel {

    /**
    * NAT网关对象数组。
    */
    @SerializedName("NatGatewaySet")
    @Expose
    private NatGateway [] NatGatewaySet;

    /**
    * 符合条件的NAT网关对象个数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 输出信息详细程度，DETAIL代表输出实例所有信息；COMPACT代表不输出NAT规则和自定义路由，输出实例基本信息、特性开关和EIP信息；SIMPLE代表仅输出实例基本信息和特性开关
    */
    @SerializedName("VerboseLevel")
    @Expose
    private String VerboseLevel;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get NAT网关对象数组。 
     * @return NatGatewaySet NAT网关对象数组。
     */
    public NatGateway [] getNatGatewaySet() {
        return this.NatGatewaySet;
    }

    /**
     * Set NAT网关对象数组。
     * @param NatGatewaySet NAT网关对象数组。
     */
    public void setNatGatewaySet(NatGateway [] NatGatewaySet) {
        this.NatGatewaySet = NatGatewaySet;
    }

    /**
     * Get 符合条件的NAT网关对象个数。 
     * @return TotalCount 符合条件的NAT网关对象个数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的NAT网关对象个数。
     * @param TotalCount 符合条件的NAT网关对象个数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 输出信息详细程度，DETAIL代表输出实例所有信息；COMPACT代表不输出NAT规则和自定义路由，输出实例基本信息、特性开关和EIP信息；SIMPLE代表仅输出实例基本信息和特性开关 
     * @return VerboseLevel 输出信息详细程度，DETAIL代表输出实例所有信息；COMPACT代表不输出NAT规则和自定义路由，输出实例基本信息、特性开关和EIP信息；SIMPLE代表仅输出实例基本信息和特性开关
     */
    public String getVerboseLevel() {
        return this.VerboseLevel;
    }

    /**
     * Set 输出信息详细程度，DETAIL代表输出实例所有信息；COMPACT代表不输出NAT规则和自定义路由，输出实例基本信息、特性开关和EIP信息；SIMPLE代表仅输出实例基本信息和特性开关
     * @param VerboseLevel 输出信息详细程度，DETAIL代表输出实例所有信息；COMPACT代表不输出NAT规则和自定义路由，输出实例基本信息、特性开关和EIP信息；SIMPLE代表仅输出实例基本信息和特性开关
     */
    public void setVerboseLevel(String VerboseLevel) {
        this.VerboseLevel = VerboseLevel;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeNatGatewaysResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewaysResponse(DescribeNatGatewaysResponse source) {
        if (source.NatGatewaySet != null) {
            this.NatGatewaySet = new NatGateway[source.NatGatewaySet.length];
            for (int i = 0; i < source.NatGatewaySet.length; i++) {
                this.NatGatewaySet[i] = new NatGateway(source.NatGatewaySet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VerboseLevel != null) {
            this.VerboseLevel = new String(source.VerboseLevel);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NatGatewaySet.", this.NatGatewaySet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "VerboseLevel", this.VerboseLevel);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

