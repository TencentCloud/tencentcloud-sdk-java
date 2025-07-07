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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignIpv6SubnetCidrBlockRequest extends AbstractModel {

    /**
    * 子网所在私有网络`ID`。形如：`vpc-f49l6u0z`。	
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 分配 `IPv6` 子网段列表。
    */
    @SerializedName("Ipv6SubnetCidrBlocks")
    @Expose
    private Ipv6SubnetCidrBlock [] Ipv6SubnetCidrBlocks;

    /**
    * ECM地域。
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
     * Get 子网所在私有网络`ID`。形如：`vpc-f49l6u0z`。	 
     * @return VpcId 子网所在私有网络`ID`。形如：`vpc-f49l6u0z`。	
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 子网所在私有网络`ID`。形如：`vpc-f49l6u0z`。	
     * @param VpcId 子网所在私有网络`ID`。形如：`vpc-f49l6u0z`。	
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 分配 `IPv6` 子网段列表。 
     * @return Ipv6SubnetCidrBlocks 分配 `IPv6` 子网段列表。
     */
    public Ipv6SubnetCidrBlock [] getIpv6SubnetCidrBlocks() {
        return this.Ipv6SubnetCidrBlocks;
    }

    /**
     * Set 分配 `IPv6` 子网段列表。
     * @param Ipv6SubnetCidrBlocks 分配 `IPv6` 子网段列表。
     */
    public void setIpv6SubnetCidrBlocks(Ipv6SubnetCidrBlock [] Ipv6SubnetCidrBlocks) {
        this.Ipv6SubnetCidrBlocks = Ipv6SubnetCidrBlocks;
    }

    /**
     * Get ECM地域。 
     * @return EcmRegion ECM地域。
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM地域。
     * @param EcmRegion ECM地域。
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    public AssignIpv6SubnetCidrBlockRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignIpv6SubnetCidrBlockRequest(AssignIpv6SubnetCidrBlockRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Ipv6SubnetCidrBlocks != null) {
            this.Ipv6SubnetCidrBlocks = new Ipv6SubnetCidrBlock[source.Ipv6SubnetCidrBlocks.length];
            for (int i = 0; i < source.Ipv6SubnetCidrBlocks.length; i++) {
                this.Ipv6SubnetCidrBlocks[i] = new Ipv6SubnetCidrBlock(source.Ipv6SubnetCidrBlocks[i]);
            }
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "Ipv6SubnetCidrBlocks.", this.Ipv6SubnetCidrBlocks);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);

    }
}

