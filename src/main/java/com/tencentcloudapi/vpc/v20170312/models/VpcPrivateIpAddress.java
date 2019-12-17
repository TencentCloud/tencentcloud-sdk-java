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

public class VpcPrivateIpAddress extends AbstractModel{

    /**
    * `VPC`内网`IP`。
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * 所属子网`CIDR`。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 内网`IP`类型。
    */
    @SerializedName("PrivateIpAddressType")
    @Expose
    private String PrivateIpAddressType;

    /**
    * `IP`申请时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get `VPC`内网`IP`。 
     * @return PrivateIpAddress `VPC`内网`IP`。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set `VPC`内网`IP`。
     * @param PrivateIpAddress `VPC`内网`IP`。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get 所属子网`CIDR`。 
     * @return CidrBlock 所属子网`CIDR`。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 所属子网`CIDR`。
     * @param CidrBlock 所属子网`CIDR`。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 内网`IP`类型。 
     * @return PrivateIpAddressType 内网`IP`类型。
     */
    public String getPrivateIpAddressType() {
        return this.PrivateIpAddressType;
    }

    /**
     * Set 内网`IP`类型。
     * @param PrivateIpAddressType 内网`IP`类型。
     */
    public void setPrivateIpAddressType(String PrivateIpAddressType) {
        this.PrivateIpAddressType = PrivateIpAddressType;
    }

    /**
     * Get `IP`申请时间。 
     * @return CreatedTime `IP`申请时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set `IP`申请时间。
     * @param CreatedTime `IP`申请时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "PrivateIpAddressType", this.PrivateIpAddressType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

