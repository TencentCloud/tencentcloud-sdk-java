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

public class UnassignIpv6CidrBlockRequest extends AbstractModel {

    /**
    * `VPC`实例`ID`，形如：`vpc-f49l6u0z`。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * `IPv6`网段。形如：`3402:4e00:20:1000::/56`。
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

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
     * Get `IPv6`网段。形如：`3402:4e00:20:1000::/56`。 
     * @return Ipv6CidrBlock `IPv6`网段。形如：`3402:4e00:20:1000::/56`。
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set `IPv6`网段。形如：`3402:4e00:20:1000::/56`。
     * @param Ipv6CidrBlock `IPv6`网段。形如：`3402:4e00:20:1000::/56`。
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    public UnassignIpv6CidrBlockRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnassignIpv6CidrBlockRequest(UnassignIpv6CidrBlockRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);

    }
}

