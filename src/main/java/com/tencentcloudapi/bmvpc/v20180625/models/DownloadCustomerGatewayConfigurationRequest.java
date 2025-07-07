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

public class DownloadCustomerGatewayConfigurationRequest extends AbstractModel {

    /**
    * VPN通道实例ID。形如：bmvpnx-f49l6u0z。
    */
    @SerializedName("VpnConnectionId")
    @Expose
    private String VpnConnectionId;

    /**
    * 厂商,取值 h3c，cisco
    */
    @SerializedName("VendorName")
    @Expose
    private String VendorName;

    /**
     * Get VPN通道实例ID。形如：bmvpnx-f49l6u0z。 
     * @return VpnConnectionId VPN通道实例ID。形如：bmvpnx-f49l6u0z。
     */
    public String getVpnConnectionId() {
        return this.VpnConnectionId;
    }

    /**
     * Set VPN通道实例ID。形如：bmvpnx-f49l6u0z。
     * @param VpnConnectionId VPN通道实例ID。形如：bmvpnx-f49l6u0z。
     */
    public void setVpnConnectionId(String VpnConnectionId) {
        this.VpnConnectionId = VpnConnectionId;
    }

    /**
     * Get 厂商,取值 h3c，cisco 
     * @return VendorName 厂商,取值 h3c，cisco
     */
    public String getVendorName() {
        return this.VendorName;
    }

    /**
     * Set 厂商,取值 h3c，cisco
     * @param VendorName 厂商,取值 h3c，cisco
     */
    public void setVendorName(String VendorName) {
        this.VendorName = VendorName;
    }

    public DownloadCustomerGatewayConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadCustomerGatewayConfigurationRequest(DownloadCustomerGatewayConfigurationRequest source) {
        if (source.VpnConnectionId != null) {
            this.VpnConnectionId = new String(source.VpnConnectionId);
        }
        if (source.VendorName != null) {
            this.VendorName = new String(source.VendorName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnConnectionId", this.VpnConnectionId);
        this.setParamSimple(map, prefix + "VendorName", this.VendorName);

    }
}

