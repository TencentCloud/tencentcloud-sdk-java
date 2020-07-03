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

public class VpnGateway extends AbstractModel{

    /**
    * 网关实例ID。
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 网关实例名称。
    */
    @SerializedName("VpnGatewayName")
    @Expose
    private String VpnGatewayName;

    /**
    * VPC网段
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * VPC名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 网关出带宽。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 网关实例状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 网关公网IP。
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 可用区，如：ap-guangzhou
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPN网关的通道数
    */
    @SerializedName("VpnConnNum")
    @Expose
    private Long VpnConnNum;

    /**
     * Get 网关实例ID。 
     * @return VpnGatewayId 网关实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set 网关实例ID。
     * @param VpnGatewayId 网关实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get VPC实例ID。 
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 网关实例名称。 
     * @return VpnGatewayName 网关实例名称。
     */
    public String getVpnGatewayName() {
        return this.VpnGatewayName;
    }

    /**
     * Set 网关实例名称。
     * @param VpnGatewayName 网关实例名称。
     */
    public void setVpnGatewayName(String VpnGatewayName) {
        this.VpnGatewayName = VpnGatewayName;
    }

    /**
     * Get VPC网段 
     * @return VpcCidrBlock VPC网段
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set VPC网段
     * @param VpcCidrBlock VPC网段
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get VPC名称 
     * @return VpcName VPC名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC名称
     * @param VpcName VPC名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 网关出带宽。 
     * @return InternetMaxBandwidthOut 网关出带宽。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 网关出带宽。
     * @param InternetMaxBandwidthOut 网关出带宽。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 网关实例状态 
     * @return State 网关实例状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 网关实例状态
     * @param State 网关实例状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 网关公网IP。 
     * @return PublicIpAddress 网关公网IP。
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set 网关公网IP。
     * @param PublicIpAddress 网关公网IP。
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 可用区，如：ap-guangzhou 
     * @return Zone 可用区，如：ap-guangzhou
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区，如：ap-guangzhou
     * @param Zone 可用区，如：ap-guangzhou
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPN网关的通道数 
     * @return VpnConnNum VPN网关的通道数
     */
    public Long getVpnConnNum() {
        return this.VpnConnNum;
    }

    /**
     * Set VPN网关的通道数
     * @param VpnConnNum VPN网关的通道数
     */
    public void setVpnConnNum(Long VpnConnNum) {
        this.VpnConnNum = VpnConnNum;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpnGatewayName", this.VpnGatewayName);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpnConnNum", this.VpnConnNum);

    }
}

