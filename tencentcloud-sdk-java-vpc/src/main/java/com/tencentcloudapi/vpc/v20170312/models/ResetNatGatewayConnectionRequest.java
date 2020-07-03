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

public class ResetNatGatewayConnectionRequest extends AbstractModel{

    /**
    * NAT网关ID。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * NAT网关并发连接上限，形如：1000000、3000000、10000000。
    */
    @SerializedName("MaxConcurrentConnection")
    @Expose
    private Long MaxConcurrentConnection;

    /**
     * Get NAT网关ID。 
     * @return NatGatewayId NAT网关ID。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT网关ID。
     * @param NatGatewayId NAT网关ID。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get NAT网关并发连接上限，形如：1000000、3000000、10000000。 
     * @return MaxConcurrentConnection NAT网关并发连接上限，形如：1000000、3000000、10000000。
     */
    public Long getMaxConcurrentConnection() {
        return this.MaxConcurrentConnection;
    }

    /**
     * Set NAT网关并发连接上限，形如：1000000、3000000、10000000。
     * @param MaxConcurrentConnection NAT网关并发连接上限，形如：1000000、3000000、10000000。
     */
    public void setMaxConcurrentConnection(Long MaxConcurrentConnection) {
        this.MaxConcurrentConnection = MaxConcurrentConnection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "MaxConcurrentConnection", this.MaxConcurrentConnection);

    }
}

