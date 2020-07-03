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

public class CreateVpcRequest extends AbstractModel{

    /**
    * 私有网络的名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 私有网络的CIDR
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 私有网络的可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 子网信息
    */
    @SerializedName("SubnetSet")
    @Expose
    private VpcSubnetCreateInfo [] SubnetSet;

    /**
    * 是否启用内网监控
    */
    @SerializedName("EnableMonitoring")
    @Expose
    private Boolean EnableMonitoring;

    /**
     * Get 私有网络的名称 
     * @return VpcName 私有网络的名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络的名称
     * @param VpcName 私有网络的名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 私有网络的CIDR 
     * @return CidrBlock 私有网络的CIDR
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 私有网络的CIDR
     * @param CidrBlock 私有网络的CIDR
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 私有网络的可用区 
     * @return Zone 私有网络的可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 私有网络的可用区
     * @param Zone 私有网络的可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 子网信息 
     * @return SubnetSet 子网信息
     */
    public VpcSubnetCreateInfo [] getSubnetSet() {
        return this.SubnetSet;
    }

    /**
     * Set 子网信息
     * @param SubnetSet 子网信息
     */
    public void setSubnetSet(VpcSubnetCreateInfo [] SubnetSet) {
        this.SubnetSet = SubnetSet;
    }

    /**
     * Get 是否启用内网监控 
     * @return EnableMonitoring 是否启用内网监控
     */
    public Boolean getEnableMonitoring() {
        return this.EnableMonitoring;
    }

    /**
     * Set 是否启用内网监控
     * @param EnableMonitoring 是否启用内网监控
     */
    public void setEnableMonitoring(Boolean EnableMonitoring) {
        this.EnableMonitoring = EnableMonitoring;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "SubnetSet.", this.SubnetSet);
        this.setParamSimple(map, prefix + "EnableMonitoring", this.EnableMonitoring);

    }
}

