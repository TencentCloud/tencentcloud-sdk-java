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

public class DirectConnectGateway  extends AbstractModel{

    /**
    * 专线网关ID
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * 专线网关名称
    */
    @SerializedName("DirectConnectGatewayName")
    @Expose
    private String DirectConnectGatewayName;

    /**
    * VPC实例ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 关联网络类型，可选值：
<li>VPC - 私有网络</li>
<li>CCN - 云联网</li>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <li>NetworkType 为 VPC 时，这里传值为私有网络实例ID</li>
<li>NetworkType 为 NAT 时，这里传值为云联网实例ID</li>
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * 网关类型，可选值：
<li>NORMAL - （默认）标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 专线通道数
    */
    @SerializedName("DirectConnectTunnelCount")
    @Expose
    private Integer DirectConnectTunnelCount;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * 获取专线网关ID
     * @return DirectConnectGatewayId 专线网关ID
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * 设置专线网关ID
     * @param DirectConnectGatewayId 专线网关ID
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * 获取专线网关名称
     * @return DirectConnectGatewayName 专线网关名称
     */
    public String getDirectConnectGatewayName() {
        return this.DirectConnectGatewayName;
    }

    /**
     * 设置专线网关名称
     * @param DirectConnectGatewayName 专线网关名称
     */
    public void setDirectConnectGatewayName(String DirectConnectGatewayName) {
        this.DirectConnectGatewayName = DirectConnectGatewayName;
    }

    /**
     * 获取VPC实例ID
     * @return VpcId VPC实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC实例ID
     * @param VpcId VPC实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取关联网络类型，可选值：
<li>VPC - 私有网络</li>
<li>CCN - 云联网</li>
     * @return NetworkType 关联网络类型，可选值：
<li>VPC - 私有网络</li>
<li>CCN - 云联网</li>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * 设置关联网络类型，可选值：
<li>VPC - 私有网络</li>
<li>CCN - 云联网</li>
     * @param NetworkType 关联网络类型，可选值：
<li>VPC - 私有网络</li>
<li>CCN - 云联网</li>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * 获取<li>NetworkType 为 VPC 时，这里传值为私有网络实例ID</li>
<li>NetworkType 为 NAT 时，这里传值为云联网实例ID</li>
     * @return NetworkInstanceId <li>NetworkType 为 VPC 时，这里传值为私有网络实例ID</li>
<li>NetworkType 为 NAT 时，这里传值为云联网实例ID</li>
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * 设置<li>NetworkType 为 VPC 时，这里传值为私有网络实例ID</li>
<li>NetworkType 为 NAT 时，这里传值为云联网实例ID</li>
     * @param NetworkInstanceId <li>NetworkType 为 VPC 时，这里传值为私有网络实例ID</li>
<li>NetworkType 为 NAT 时，这里传值为云联网实例ID</li>
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * 获取网关类型，可选值：
<li>NORMAL - （默认）标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
     * @return GatewayType 网关类型，可选值：
<li>NORMAL - （默认）标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * 设置网关类型，可选值：
<li>NORMAL - （默认）标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
     * @param GatewayType 网关类型，可选值：
<li>NORMAL - （默认）标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * 获取专线通道数
     * @return DirectConnectTunnelCount 专线通道数
     */
    public Integer getDirectConnectTunnelCount() {
        return this.DirectConnectTunnelCount;
    }

    /**
     * 设置专线通道数
     * @param DirectConnectTunnelCount 专线通道数
     */
    public void setDirectConnectTunnelCount(Integer DirectConnectTunnelCount) {
        this.DirectConnectTunnelCount = DirectConnectTunnelCount;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayName", this.DirectConnectGatewayName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "DirectConnectTunnelCount", this.DirectConnectTunnelCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

