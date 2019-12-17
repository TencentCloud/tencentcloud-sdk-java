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

public class VpcIpv6Address extends AbstractModel{

    /**
    * `VPC`内`IPv6`地址。
    */
    @SerializedName("Ipv6Address")
    @Expose
    private String Ipv6Address;

    /**
    * 所属子网 `IPv6` `CIDR`。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * `IPv6`类型。
    */
    @SerializedName("Ipv6AddressType")
    @Expose
    private String Ipv6AddressType;

    /**
    * `IPv6`申请时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get `VPC`内`IPv6`地址。 
     * @return Ipv6Address `VPC`内`IPv6`地址。
     */
    public String getIpv6Address() {
        return this.Ipv6Address;
    }

    /**
     * Set `VPC`内`IPv6`地址。
     * @param Ipv6Address `VPC`内`IPv6`地址。
     */
    public void setIpv6Address(String Ipv6Address) {
        this.Ipv6Address = Ipv6Address;
    }

    /**
     * Get 所属子网 `IPv6` `CIDR`。 
     * @return CidrBlock 所属子网 `IPv6` `CIDR`。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 所属子网 `IPv6` `CIDR`。
     * @param CidrBlock 所属子网 `IPv6` `CIDR`。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get `IPv6`类型。 
     * @return Ipv6AddressType `IPv6`类型。
     */
    public String getIpv6AddressType() {
        return this.Ipv6AddressType;
    }

    /**
     * Set `IPv6`类型。
     * @param Ipv6AddressType `IPv6`类型。
     */
    public void setIpv6AddressType(String Ipv6AddressType) {
        this.Ipv6AddressType = Ipv6AddressType;
    }

    /**
     * Get `IPv6`申请时间。 
     * @return CreatedTime `IPv6`申请时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set `IPv6`申请时间。
     * @param CreatedTime `IPv6`申请时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ipv6Address", this.Ipv6Address);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Ipv6AddressType", this.Ipv6AddressType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

