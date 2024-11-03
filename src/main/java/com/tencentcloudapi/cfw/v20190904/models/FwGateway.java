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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FwGateway extends AbstractModel {

    /**
    * 防火墙网关id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关所属vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 网关ip地址
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
     * Get 防火墙网关id 
     * @return GatewayId 防火墙网关id
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 防火墙网关id
     * @param GatewayId 防火墙网关id
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关所属vpc id 
     * @return VpcId 网关所属vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 网关所属vpc id
     * @param VpcId 网关所属vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 网关ip地址 
     * @return IpAddress 网关ip地址
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set 网关ip地址
     * @param IpAddress 网关ip地址
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    public FwGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FwGateway(FwGateway source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);

    }
}

