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

public class AssignIpv6CidrBlockResponse extends AbstractModel {

    /**
    * <p>分配的 <code>IPv6</code> 网段。形如：<code>3402:4e00:20:1000::/56</code>。</p>
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * <p>申请IPv6 Cidr 的类型，<code>GUA</code>,  <code>ULA</code></p>
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>分配的 <code>IPv6</code> 网段。形如：<code>3402:4e00:20:1000::/56</code>。</p> 
     * @return Ipv6CidrBlock <p>分配的 <code>IPv6</code> 网段。形如：<code>3402:4e00:20:1000::/56</code>。</p>
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set <p>分配的 <code>IPv6</code> 网段。形如：<code>3402:4e00:20:1000::/56</code>。</p>
     * @param Ipv6CidrBlock <p>分配的 <code>IPv6</code> 网段。形如：<code>3402:4e00:20:1000::/56</code>。</p>
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get <p>申请IPv6 Cidr 的类型，<code>GUA</code>,  <code>ULA</code></p> 
     * @return AddressType <p>申请IPv6 Cidr 的类型，<code>GUA</code>,  <code>ULA</code></p>
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set <p>申请IPv6 Cidr 的类型，<code>GUA</code>,  <code>ULA</code></p>
     * @param AddressType <p>申请IPv6 Cidr 的类型，<code>GUA</code>,  <code>ULA</code></p>
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
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

    public AssignIpv6CidrBlockResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignIpv6CidrBlockResponse(AssignIpv6CidrBlockResponse source) {
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

