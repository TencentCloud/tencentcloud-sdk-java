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

public class CreateDhcpIpRequest extends AbstractModel{

    /**
    * 私有网络`ID`。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网`ID`。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * `DhcpIp`名称。
    */
    @SerializedName("DhcpIpName")
    @Expose
    private String DhcpIpName;

    /**
    * 新申请的内网IP地址个数。总数不能超过64个。
    */
    @SerializedName("SecondaryPrivateIpAddressCount")
    @Expose
    private Long SecondaryPrivateIpAddressCount;

    /**
     * Get 私有网络`ID`。 
     * @return VpcId 私有网络`ID`。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络`ID`。
     * @param VpcId 私有网络`ID`。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网`ID`。 
     * @return SubnetId 子网`ID`。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网`ID`。
     * @param SubnetId 子网`ID`。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get `DhcpIp`名称。 
     * @return DhcpIpName `DhcpIp`名称。
     */
    public String getDhcpIpName() {
        return this.DhcpIpName;
    }

    /**
     * Set `DhcpIp`名称。
     * @param DhcpIpName `DhcpIp`名称。
     */
    public void setDhcpIpName(String DhcpIpName) {
        this.DhcpIpName = DhcpIpName;
    }

    /**
     * Get 新申请的内网IP地址个数。总数不能超过64个。 
     * @return SecondaryPrivateIpAddressCount 新申请的内网IP地址个数。总数不能超过64个。
     */
    public Long getSecondaryPrivateIpAddressCount() {
        return this.SecondaryPrivateIpAddressCount;
    }

    /**
     * Set 新申请的内网IP地址个数。总数不能超过64个。
     * @param SecondaryPrivateIpAddressCount 新申请的内网IP地址个数。总数不能超过64个。
     */
    public void setSecondaryPrivateIpAddressCount(Long SecondaryPrivateIpAddressCount) {
        this.SecondaryPrivateIpAddressCount = SecondaryPrivateIpAddressCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DhcpIpName", this.DhcpIpName);
        this.setParamSimple(map, prefix + "SecondaryPrivateIpAddressCount", this.SecondaryPrivateIpAddressCount);

    }
}

