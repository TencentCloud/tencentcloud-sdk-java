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

public class UnbindEipsFromNatGatewayRequest extends AbstractModel {

    /**
    * NAT网关ID，例如：nat-kdm476mp
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * 私有网络ID，例如：vpc-kd7d06of
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 已分配的EIP列表
    */
    @SerializedName("AssignedEips")
    @Expose
    private String [] AssignedEips;

    /**
     * Get NAT网关ID，例如：nat-kdm476mp 
     * @return NatId NAT网关ID，例如：nat-kdm476mp
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * Set NAT网关ID，例如：nat-kdm476mp
     * @param NatId NAT网关ID，例如：nat-kdm476mp
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * Get 私有网络ID，例如：vpc-kd7d06of 
     * @return VpcId 私有网络ID，例如：vpc-kd7d06of
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，例如：vpc-kd7d06of
     * @param VpcId 私有网络ID，例如：vpc-kd7d06of
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 已分配的EIP列表 
     * @return AssignedEips 已分配的EIP列表
     */
    public String [] getAssignedEips() {
        return this.AssignedEips;
    }

    /**
     * Set 已分配的EIP列表
     * @param AssignedEips 已分配的EIP列表
     */
    public void setAssignedEips(String [] AssignedEips) {
        this.AssignedEips = AssignedEips;
    }

    public UnbindEipsFromNatGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindEipsFromNatGatewayRequest(UnbindEipsFromNatGatewayRequest source) {
        if (source.NatId != null) {
            this.NatId = new String(source.NatId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.AssignedEips != null) {
            this.AssignedEips = new String[source.AssignedEips.length];
            for (int i = 0; i < source.AssignedEips.length; i++) {
                this.AssignedEips[i] = new String(source.AssignedEips[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "AssignedEips.", this.AssignedEips);

    }
}

