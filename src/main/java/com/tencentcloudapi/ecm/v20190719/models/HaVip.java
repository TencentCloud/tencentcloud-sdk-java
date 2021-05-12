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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HaVip extends AbstractModel{

    /**
    * HAVIP的ID，是HAVIP的唯一标识。
    */
    @SerializedName("HaVipId")
    @Expose
    private String HaVipId;

    /**
    * HAVIP名称。
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
    * HAVIP所在私有网络ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * HAVIP所在子网ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * HAVIP关联弹性网卡ID。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 被绑定的实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 绑定EIP。
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * 状态：
AVAILABLE：运行中。
UNBIND：未绑定。
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
     * Get HAVIP的ID，是HAVIP的唯一标识。 
     * @return HaVipId HAVIP的ID，是HAVIP的唯一标识。
     */
    public String getHaVipId() {
        return this.HaVipId;
    }

    /**
     * Set HAVIP的ID，是HAVIP的唯一标识。
     * @param HaVipId HAVIP的ID，是HAVIP的唯一标识。
     */
    public void setHaVipId(String HaVipId) {
        this.HaVipId = HaVipId;
    }

    /**
     * Get HAVIP名称。 
     * @return HaVipName HAVIP名称。
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set HAVIP名称。
     * @param HaVipName HAVIP名称。
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
     * Get HAVIP所在私有网络ID。 
     * @return VpcId HAVIP所在私有网络ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set HAVIP所在私有网络ID。
     * @param VpcId HAVIP所在私有网络ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get HAVIP所在子网ID。 
     * @return SubnetId HAVIP所在子网ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set HAVIP所在子网ID。
     * @param SubnetId HAVIP所在子网ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get HAVIP关联弹性网卡ID。 
     * @return NetworkInterfaceId HAVIP关联弹性网卡ID。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set HAVIP关联弹性网卡ID。
     * @param NetworkInterfaceId HAVIP关联弹性网卡ID。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 被绑定的实例ID。 
     * @return InstanceId 被绑定的实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 被绑定的实例ID。
     * @param InstanceId 被绑定的实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 绑定EIP。 
     * @return AddressIp 绑定EIP。
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set 绑定EIP。
     * @param AddressIp 绑定EIP。
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Get 状态：
AVAILABLE：运行中。
UNBIND：未绑定。 
     * @return State 状态：
AVAILABLE：运行中。
UNBIND：未绑定。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态：
AVAILABLE：运行中。
UNBIND：未绑定。
     * @param State 状态：
AVAILABLE：运行中。
UNBIND：未绑定。
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

    public HaVip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HaVip(HaVip source) {
        if (source.HaVipId != null) {
            this.HaVipId = new String(source.HaVipId);
        }
        if (source.HaVipName != null) {
            this.HaVipName = new String(source.HaVipName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AddressIp != null) {
            this.AddressIp = new String(source.AddressIp);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
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

