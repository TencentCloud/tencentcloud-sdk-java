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

public class RefreshDirectConnectGatewayRouteToNatGatewayRequest extends AbstractModel{

    /**
    * vpc的ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * NAT网关ID
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 是否是预刷新；True:是， False:否
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get vpc的ID 
     * @return VpcId vpc的ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc的ID
     * @param VpcId vpc的ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get NAT网关ID 
     * @return NatGatewayId NAT网关ID
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT网关ID
     * @param NatGatewayId NAT网关ID
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get 是否是预刷新；True:是， False:否 
     * @return DryRun 是否是预刷新；True:是， False:否
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否是预刷新；True:是， False:否
     * @param DryRun 是否是预刷新；True:是， False:否
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public RefreshDirectConnectGatewayRouteToNatGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefreshDirectConnectGatewayRouteToNatGatewayRequest(RefreshDirectConnectGatewayRouteToNatGatewayRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

