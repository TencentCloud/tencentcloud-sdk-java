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

public class ModifyDhcpIpAttributeRequest extends AbstractModel{

    /**
    * `DhcpIp`唯一`ID`，形如：`dhcpip-9o233uri`。
    */
    @SerializedName("DhcpIpId")
    @Expose
    private String DhcpIpId;

    /**
    * `DhcpIp`名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("DhcpIpName")
    @Expose
    private String DhcpIpName;

    /**
     * Get `DhcpIp`唯一`ID`，形如：`dhcpip-9o233uri`。 
     * @return DhcpIpId `DhcpIp`唯一`ID`，形如：`dhcpip-9o233uri`。
     */
    public String getDhcpIpId() {
        return this.DhcpIpId;
    }

    /**
     * Set `DhcpIp`唯一`ID`，形如：`dhcpip-9o233uri`。
     * @param DhcpIpId `DhcpIp`唯一`ID`，形如：`dhcpip-9o233uri`。
     */
    public void setDhcpIpId(String DhcpIpId) {
        this.DhcpIpId = DhcpIpId;
    }

    /**
     * Get `DhcpIp`名称，可任意命名，但不得超过60个字符。 
     * @return DhcpIpName `DhcpIp`名称，可任意命名，但不得超过60个字符。
     */
    public String getDhcpIpName() {
        return this.DhcpIpName;
    }

    /**
     * Set `DhcpIp`名称，可任意命名，但不得超过60个字符。
     * @param DhcpIpName `DhcpIp`名称，可任意命名，但不得超过60个字符。
     */
    public void setDhcpIpName(String DhcpIpName) {
        this.DhcpIpName = DhcpIpName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DhcpIpId", this.DhcpIpId);
        this.setParamSimple(map, prefix + "DhcpIpName", this.DhcpIpName);

    }
}

