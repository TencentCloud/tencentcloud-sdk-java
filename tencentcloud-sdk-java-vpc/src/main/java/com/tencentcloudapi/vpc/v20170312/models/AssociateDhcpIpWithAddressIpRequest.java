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

public class AssociateDhcpIpWithAddressIpRequest extends AbstractModel{

    /**
    * `DhcpIp`唯一`ID`，形如：`dhcpip-9o233uri`。必须是没有绑定`EIP`的`DhcpIp`
    */
    @SerializedName("DhcpIpId")
    @Expose
    private String DhcpIpId;

    /**
    * 弹性公网`IP`。必须是没有绑定`DhcpIp`的`EIP`
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
     * Get `DhcpIp`唯一`ID`，形如：`dhcpip-9o233uri`。必须是没有绑定`EIP`的`DhcpIp` 
     * @return DhcpIpId `DhcpIp`唯一`ID`，形如：`dhcpip-9o233uri`。必须是没有绑定`EIP`的`DhcpIp`
     */
    public String getDhcpIpId() {
        return this.DhcpIpId;
    }

    /**
     * Set `DhcpIp`唯一`ID`，形如：`dhcpip-9o233uri`。必须是没有绑定`EIP`的`DhcpIp`
     * @param DhcpIpId `DhcpIp`唯一`ID`，形如：`dhcpip-9o233uri`。必须是没有绑定`EIP`的`DhcpIp`
     */
    public void setDhcpIpId(String DhcpIpId) {
        this.DhcpIpId = DhcpIpId;
    }

    /**
     * Get 弹性公网`IP`。必须是没有绑定`DhcpIp`的`EIP` 
     * @return AddressIp 弹性公网`IP`。必须是没有绑定`DhcpIp`的`EIP`
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set 弹性公网`IP`。必须是没有绑定`DhcpIp`的`EIP`
     * @param AddressIp 弹性公网`IP`。必须是没有绑定`DhcpIp`的`EIP`
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DhcpIpId", this.DhcpIpId);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);

    }
}

