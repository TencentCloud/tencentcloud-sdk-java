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

public class ResetNatGatewayConnectionRequest extends AbstractModel {

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
    * 独享实例规格。如果要变配到独享实例，此参数必选，取值范围：ExclusiveSmall/ExclusiveMedium1/ExclusiveLarge1
    */
    @SerializedName("ExclusiveType")
    @Expose
    private String ExclusiveType;

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
     * Get 独享实例规格。如果要变配到独享实例，此参数必选，取值范围：ExclusiveSmall/ExclusiveMedium1/ExclusiveLarge1 
     * @return ExclusiveType 独享实例规格。如果要变配到独享实例，此参数必选，取值范围：ExclusiveSmall/ExclusiveMedium1/ExclusiveLarge1
     */
    public String getExclusiveType() {
        return this.ExclusiveType;
    }

    /**
     * Set 独享实例规格。如果要变配到独享实例，此参数必选，取值范围：ExclusiveSmall/ExclusiveMedium1/ExclusiveLarge1
     * @param ExclusiveType 独享实例规格。如果要变配到独享实例，此参数必选，取值范围：ExclusiveSmall/ExclusiveMedium1/ExclusiveLarge1
     */
    public void setExclusiveType(String ExclusiveType) {
        this.ExclusiveType = ExclusiveType;
    }

    public ResetNatGatewayConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetNatGatewayConnectionRequest(ResetNatGatewayConnectionRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.MaxConcurrentConnection != null) {
            this.MaxConcurrentConnection = new Long(source.MaxConcurrentConnection);
        }
        if (source.ExclusiveType != null) {
            this.ExclusiveType = new String(source.ExclusiveType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "MaxConcurrentConnection", this.MaxConcurrentConnection);
        this.setParamSimple(map, prefix + "ExclusiveType", this.ExclusiveType);

    }
}

