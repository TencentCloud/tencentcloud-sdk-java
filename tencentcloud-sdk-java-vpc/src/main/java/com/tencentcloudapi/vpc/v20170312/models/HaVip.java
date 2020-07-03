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

public class HaVip extends AbstractModel{

    /**
    * `HAVIP`的`ID`，是`HAVIP`的唯一标识。
    */
    @SerializedName("HaVipId")
    @Expose
    private String HaVipId;

    /**
    * `HAVIP`名称。
    */
    @SerializedName("HaVipName")
    @Expose
    private String HaVipName;

    /**
    * 虚拟IP地址。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * `HAVIP`所在私有网络`ID`。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * `HAVIP`所在子网`ID`。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * `HAVIP`关联弹性网卡`ID`。
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
    * 绑定`EIP`。
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

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
    * 使用havip的业务标识。
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
     * Get `HAVIP`的`ID`，是`HAVIP`的唯一标识。 
     * @return HaVipId `HAVIP`的`ID`，是`HAVIP`的唯一标识。
     */
    public String getHaVipId() {
        return this.HaVipId;
    }

    /**
     * Set `HAVIP`的`ID`，是`HAVIP`的唯一标识。
     * @param HaVipId `HAVIP`的`ID`，是`HAVIP`的唯一标识。
     */
    public void setHaVipId(String HaVipId) {
        this.HaVipId = HaVipId;
    }

    /**
     * Get `HAVIP`名称。 
     * @return HaVipName `HAVIP`名称。
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set `HAVIP`名称。
     * @param HaVipName `HAVIP`名称。
     */
    public void setHaVipName(String HaVipName) {
        this.HaVipName = HaVipName;
    }

    /**
     * Get 虚拟IP地址。 
     * @return Vip 虚拟IP地址。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 虚拟IP地址。
     * @param Vip 虚拟IP地址。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get `HAVIP`所在私有网络`ID`。 
     * @return VpcId `HAVIP`所在私有网络`ID`。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `HAVIP`所在私有网络`ID`。
     * @param VpcId `HAVIP`所在私有网络`ID`。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get `HAVIP`所在子网`ID`。 
     * @return SubnetId `HAVIP`所在子网`ID`。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set `HAVIP`所在子网`ID`。
     * @param SubnetId `HAVIP`所在子网`ID`。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get `HAVIP`关联弹性网卡`ID`。 
     * @return NetworkInterfaceId `HAVIP`关联弹性网卡`ID`。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set `HAVIP`关联弹性网卡`ID`。
     * @param NetworkInterfaceId `HAVIP`关联弹性网卡`ID`。
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
     * Get 使用havip的业务标识。 
     * @return Business 使用havip的业务标识。
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 使用havip的业务标识。
     * @param Business 使用havip的业务标识。
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HaVipId", this.HaVipId);
        this.setParamSimple(map, prefix + "HaVipName", this.HaVipName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Business", this.Business);

    }
}

