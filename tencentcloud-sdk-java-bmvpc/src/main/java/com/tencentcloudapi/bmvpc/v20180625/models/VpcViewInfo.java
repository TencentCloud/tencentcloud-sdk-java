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

public class VpcViewInfo extends AbstractModel{

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 私有网络CIDR
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 私有网络所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 外网负载均衡个数
    */
    @SerializedName("LbNum")
    @Expose
    private Long LbNum;

    /**
    * 弹性公网IP个数
    */
    @SerializedName("EipNum")
    @Expose
    private Long EipNum;

    /**
    * NAT网关个数
    */
    @SerializedName("NatNum")
    @Expose
    private Long NatNum;

    /**
    * 子网列表
    */
    @SerializedName("SubnetSet")
    @Expose
    private VpcSubnetViewInfo [] SubnetSet;

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
     * Get 私有网络名称 
     * @return VpcName 私有网络名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称
     * @param VpcName 私有网络名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 私有网络CIDR 
     * @return CidrBlock 私有网络CIDR
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 私有网络CIDR
     * @param CidrBlock 私有网络CIDR
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 私有网络所在可用区 
     * @return Zone 私有网络所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 私有网络所在可用区
     * @param Zone 私有网络所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 外网负载均衡个数 
     * @return LbNum 外网负载均衡个数
     */
    public Long getLbNum() {
        return this.LbNum;
    }

    /**
     * Set 外网负载均衡个数
     * @param LbNum 外网负载均衡个数
     */
    public void setLbNum(Long LbNum) {
        this.LbNum = LbNum;
    }

    /**
     * Get 弹性公网IP个数 
     * @return EipNum 弹性公网IP个数
     */
    public Long getEipNum() {
        return this.EipNum;
    }

    /**
     * Set 弹性公网IP个数
     * @param EipNum 弹性公网IP个数
     */
    public void setEipNum(Long EipNum) {
        this.EipNum = EipNum;
    }

    /**
     * Get NAT网关个数 
     * @return NatNum NAT网关个数
     */
    public Long getNatNum() {
        return this.NatNum;
    }

    /**
     * Set NAT网关个数
     * @param NatNum NAT网关个数
     */
    public void setNatNum(Long NatNum) {
        this.NatNum = NatNum;
    }

    /**
     * Get 子网列表 
     * @return SubnetSet 子网列表
     */
    public VpcSubnetViewInfo [] getSubnetSet() {
        return this.SubnetSet;
    }

    /**
     * Set 子网列表
     * @param SubnetSet 子网列表
     */
    public void setSubnetSet(VpcSubnetViewInfo [] SubnetSet) {
        this.SubnetSet = SubnetSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "LbNum", this.LbNum);
        this.setParamSimple(map, prefix + "EipNum", this.EipNum);
        this.setParamSimple(map, prefix + "NatNum", this.NatNum);
        this.setParamArrayObj(map, prefix + "SubnetSet.", this.SubnetSet);

    }
}

