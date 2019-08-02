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

public class AssociateNatGatewayAddressRequest  extends AbstractModel{

    /**
    * NAT网关的ID，形如：`nat-df45454`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP, 其中AddressCount和PublicAddresses至少传递一个。
    */
    @SerializedName("AddressCount")
    @Expose
    private Integer AddressCount;

    /**
    * 绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。。
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 弹性IP可以区，自动分配弹性IP时传递。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * 获取NAT网关的ID，形如：`nat-df45454`。
     * @return NatGatewayId NAT网关的ID，形如：`nat-df45454`。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * 设置NAT网关的ID，形如：`nat-df45454`。
     * @param NatGatewayId NAT网关的ID，形如：`nat-df45454`。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * 获取需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP, 其中AddressCount和PublicAddresses至少传递一个。
     * @return AddressCount 需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP, 其中AddressCount和PublicAddresses至少传递一个。
     */
    public Integer getAddressCount() {
        return this.AddressCount;
    }

    /**
     * 设置需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP, 其中AddressCount和PublicAddresses至少传递一个。
     * @param AddressCount 需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP, 其中AddressCount和PublicAddresses至少传递一个。
     */
    public void setAddressCount(Integer AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * 获取绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。。
     * @return PublicIpAddresses 绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。。
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * 设置绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。。
     * @param PublicIpAddresses 绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。。
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * 获取弹性IP可以区，自动分配弹性IP时传递。
     * @return Zone 弹性IP可以区，自动分配弹性IP时传递。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置弹性IP可以区，自动分配弹性IP时传递。
     * @param Zone 弹性IP可以区，自动分配弹性IP时传递。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

