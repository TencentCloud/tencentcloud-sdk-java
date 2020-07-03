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

public class VpcSubnetViewInfo extends AbstractModel{

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网名称
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网CIDR
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 子网下设备个数
    */
    @SerializedName("CpmNum")
    @Expose
    private Long CpmNum;

    /**
    * 内网负载均衡个数
    */
    @SerializedName("LbNum")
    @Expose
    private Long LbNum;

    /**
    * 子网所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

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
     * Get 子网名称 
     * @return SubnetName 子网名称
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称
     * @param SubnetName 子网名称
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 子网CIDR 
     * @return CidrBlock 子网CIDR
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 子网CIDR
     * @param CidrBlock 子网CIDR
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 子网下设备个数 
     * @return CpmNum 子网下设备个数
     */
    public Long getCpmNum() {
        return this.CpmNum;
    }

    /**
     * Set 子网下设备个数
     * @param CpmNum 子网下设备个数
     */
    public void setCpmNum(Long CpmNum) {
        this.CpmNum = CpmNum;
    }

    /**
     * Get 内网负载均衡个数 
     * @return LbNum 内网负载均衡个数
     */
    public Long getLbNum() {
        return this.LbNum;
    }

    /**
     * Set 内网负载均衡个数
     * @param LbNum 内网负载均衡个数
     */
    public void setLbNum(Long LbNum) {
        this.LbNum = LbNum;
    }

    /**
     * Get 子网所在可用区 
     * @return Zone 子网所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 子网所在可用区
     * @param Zone 子网所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "CpmNum", this.CpmNum);
        this.setParamSimple(map, prefix + "LbNum", this.LbNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

