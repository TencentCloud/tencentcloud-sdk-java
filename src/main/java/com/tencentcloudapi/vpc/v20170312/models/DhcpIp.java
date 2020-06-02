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

public class DhcpIp extends AbstractModel{

    /**
    * `DhcpIp`的`ID`，是`DhcpIp`的唯一标识。
    */
    @SerializedName("DhcpIpId")
    @Expose
    private String DhcpIpId;

    /**
    * `DhcpIp`所在私有网络`ID`。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * `DhcpIp`所在子网`ID`。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * `DhcpIp`的名称。
    */
    @SerializedName("DhcpIpName")
    @Expose
    private String DhcpIpName;

    /**
    * IP地址。
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * 绑定`EIP`。
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * `DhcpIp`关联弹性网卡`ID`。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 被绑定的实例`ID`。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 状态：
<li>`AVAILABLE`：运行中</li>
<li>`UNBIND`：未绑定</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get `DhcpIp`的`ID`，是`DhcpIp`的唯一标识。 
     * @return DhcpIpId `DhcpIp`的`ID`，是`DhcpIp`的唯一标识。
     */
    public String getDhcpIpId() {
        return this.DhcpIpId;
    }

    /**
     * Set `DhcpIp`的`ID`，是`DhcpIp`的唯一标识。
     * @param DhcpIpId `DhcpIp`的`ID`，是`DhcpIp`的唯一标识。
     */
    public void setDhcpIpId(String DhcpIpId) {
        this.DhcpIpId = DhcpIpId;
    }

    /**
     * Get `DhcpIp`所在私有网络`ID`。 
     * @return VpcId `DhcpIp`所在私有网络`ID`。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `DhcpIp`所在私有网络`ID`。
     * @param VpcId `DhcpIp`所在私有网络`ID`。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get `DhcpIp`所在子网`ID`。 
     * @return SubnetId `DhcpIp`所在子网`ID`。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set `DhcpIp`所在子网`ID`。
     * @param SubnetId `DhcpIp`所在子网`ID`。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get `DhcpIp`的名称。 
     * @return DhcpIpName `DhcpIp`的名称。
     */
    public String getDhcpIpName() {
        return this.DhcpIpName;
    }

    /**
     * Set `DhcpIp`的名称。
     * @param DhcpIpName `DhcpIp`的名称。
     */
    public void setDhcpIpName(String DhcpIpName) {
        this.DhcpIpName = DhcpIpName;
    }

    /**
     * Get IP地址。 
     * @return PrivateIpAddress IP地址。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set IP地址。
     * @param PrivateIpAddress IP地址。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get 绑定`EIP`。 
     * @return AddressIp 绑定`EIP`。
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set 绑定`EIP`。
     * @param AddressIp 绑定`EIP`。
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Get `DhcpIp`关联弹性网卡`ID`。 
     * @return NetworkInterfaceId `DhcpIp`关联弹性网卡`ID`。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set `DhcpIp`关联弹性网卡`ID`。
     * @param NetworkInterfaceId `DhcpIp`关联弹性网卡`ID`。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 被绑定的实例`ID`。 
     * @return InstanceId 被绑定的实例`ID`。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 被绑定的实例`ID`。
     * @param InstanceId 被绑定的实例`ID`。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 状态：
<li>`AVAILABLE`：运行中</li>
<li>`UNBIND`：未绑定</li> 
     * @return State 状态：
<li>`AVAILABLE`：运行中</li>
<li>`UNBIND`：未绑定</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态：
<li>`AVAILABLE`：运行中</li>
<li>`UNBIND`：未绑定</li>
     * @param State 状态：
<li>`AVAILABLE`：运行中</li>
<li>`UNBIND`：未绑定</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DhcpIpId", this.DhcpIpId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DhcpIpName", this.DhcpIpName);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

