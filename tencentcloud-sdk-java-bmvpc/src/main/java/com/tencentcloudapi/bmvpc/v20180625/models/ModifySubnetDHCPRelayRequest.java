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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubnetDHCPRelayRequest extends AbstractModel{

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 是否开启DHCP Relay
    */
    @SerializedName("EnableDHCP")
    @Expose
    private Boolean EnableDHCP;

    /**
    * DHCP服务器IP
    */
    @SerializedName("ServerIps")
    @Expose
    private String [] ServerIps;

    /**
    * 预留IP个数
    */
    @SerializedName("ReservedIpCount")
    @Expose
    private Long ReservedIpCount;

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 是否开启DHCP Relay 
     * @return EnableDHCP 是否开启DHCP Relay
     */
    public Boolean getEnableDHCP() {
        return this.EnableDHCP;
    }

    /**
     * Set 是否开启DHCP Relay
     * @param EnableDHCP 是否开启DHCP Relay
     */
    public void setEnableDHCP(Boolean EnableDHCP) {
        this.EnableDHCP = EnableDHCP;
    }

    /**
     * Get DHCP服务器IP 
     * @return ServerIps DHCP服务器IP
     */
    public String [] getServerIps() {
        return this.ServerIps;
    }

    /**
     * Set DHCP服务器IP
     * @param ServerIps DHCP服务器IP
     */
    public void setServerIps(String [] ServerIps) {
        this.ServerIps = ServerIps;
    }

    /**
     * Get 预留IP个数 
     * @return ReservedIpCount 预留IP个数
     */
    public Long getReservedIpCount() {
        return this.ReservedIpCount;
    }

    /**
     * Set 预留IP个数
     * @param ReservedIpCount 预留IP个数
     */
    public void setReservedIpCount(Long ReservedIpCount) {
        this.ReservedIpCount = ReservedIpCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EnableDHCP", this.EnableDHCP);
        this.setParamArraySimple(map, prefix + "ServerIps.", this.ServerIps);
        this.setParamSimple(map, prefix + "ReservedIpCount", this.ReservedIpCount);

    }
}

