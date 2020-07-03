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

public class ResetVpnGatewayInternetMaxBandwidthRequest extends AbstractModel{

    /**
    * VPN网关实例ID。
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * 公网带宽设置。可选带宽规格：5, 10, 20, 50, 100；单位：Mbps。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
     * Get VPN网关实例ID。 
     * @return VpnGatewayId VPN网关实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set VPN网关实例ID。
     * @param VpnGatewayId VPN网关实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get 公网带宽设置。可选带宽规格：5, 10, 20, 50, 100；单位：Mbps。 
     * @return InternetMaxBandwidthOut 公网带宽设置。可选带宽规格：5, 10, 20, 50, 100；单位：Mbps。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 公网带宽设置。可选带宽规格：5, 10, 20, 50, 100；单位：Mbps。
     * @param InternetMaxBandwidthOut 公网带宽设置。可选带宽规格：5, 10, 20, 50, 100；单位：Mbps。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);

    }
}

