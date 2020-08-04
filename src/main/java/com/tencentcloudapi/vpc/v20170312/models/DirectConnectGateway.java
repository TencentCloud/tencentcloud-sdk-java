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

public class DirectConnectGateway extends AbstractModel{

    /**
    * 专线网关`ID`。
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * 专线网关名称。
    */
    @SerializedName("DirectConnectGatewayName")
    @Expose
    private String DirectConnectGatewayName;

    /**
    * 专线网关关联`VPC`实例`ID`。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 关联网络类型：
<li>`VPC` - 私有网络</li>
<li>`CCN` - 云联网</li>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 关联网络实例`ID`：
<li>`NetworkType`为`VPC`时，这里为私有网络实例`ID`</li>
<li>`NetworkType`为`CCN`时，这里为云联网实例`ID`</li>
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * 网关类型：
<li>NORMAL - 标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>
NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 专线网关IP。
    */
    @SerializedName("DirectConnectGatewayIp")
    @Expose
    private String DirectConnectGatewayIp;

    /**
    * 专线网关关联`CCN`实例`ID`。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 云联网路由学习类型：
<li>`BGP` - 自动学习。</li>
<li>`STATIC` - 静态，即用户配置。</li>
    */
    @SerializedName("CcnRouteType")
    @Expose
    private String CcnRouteType;

    /**
    * 是否启用BGP。
    */
    @SerializedName("EnableBGP")
    @Expose
    private Boolean EnableBGP;

    /**
    * 开启和关闭BGP的community属性。
    */
    @SerializedName("EnableBGPCommunity")
    @Expose
    private Boolean EnableBGPCommunity;

    /**
    * 绑定的NAT网关ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
     * Get 专线网关`ID`。 
     * @return DirectConnectGatewayId 专线网关`ID`。
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set 专线网关`ID`。
     * @param DirectConnectGatewayId 专线网关`ID`。
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Get 专线网关名称。 
     * @return DirectConnectGatewayName 专线网关名称。
     */
    public String getDirectConnectGatewayName() {
        return this.DirectConnectGatewayName;
    }

    /**
     * Set 专线网关名称。
     * @param DirectConnectGatewayName 专线网关名称。
     */
    public void setDirectConnectGatewayName(String DirectConnectGatewayName) {
        this.DirectConnectGatewayName = DirectConnectGatewayName;
    }

    /**
     * Get 专线网关关联`VPC`实例`ID`。 
     * @return VpcId 专线网关关联`VPC`实例`ID`。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 专线网关关联`VPC`实例`ID`。
     * @param VpcId 专线网关关联`VPC`实例`ID`。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 关联网络类型：
<li>`VPC` - 私有网络</li>
<li>`CCN` - 云联网</li> 
     * @return NetworkType 关联网络类型：
<li>`VPC` - 私有网络</li>
<li>`CCN` - 云联网</li>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 关联网络类型：
<li>`VPC` - 私有网络</li>
<li>`CCN` - 云联网</li>
     * @param NetworkType 关联网络类型：
<li>`VPC` - 私有网络</li>
<li>`CCN` - 云联网</li>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 关联网络实例`ID`：
<li>`NetworkType`为`VPC`时，这里为私有网络实例`ID`</li>
<li>`NetworkType`为`CCN`时，这里为云联网实例`ID`</li> 
     * @return NetworkInstanceId 关联网络实例`ID`：
<li>`NetworkType`为`VPC`时，这里为私有网络实例`ID`</li>
<li>`NetworkType`为`CCN`时，这里为云联网实例`ID`</li>
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set 关联网络实例`ID`：
<li>`NetworkType`为`VPC`时，这里为私有网络实例`ID`</li>
<li>`NetworkType`为`CCN`时，这里为云联网实例`ID`</li>
     * @param NetworkInstanceId 关联网络实例`ID`：
<li>`NetworkType`为`VPC`时，这里为私有网络实例`ID`</li>
<li>`NetworkType`为`CCN`时，这里为云联网实例`ID`</li>
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get 网关类型：
<li>NORMAL - 标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>
NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关 
     * @return GatewayType 网关类型：
<li>NORMAL - 标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>
NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 网关类型：
<li>NORMAL - 标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>
NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
     * @param GatewayType 网关类型：
<li>NORMAL - 标准型，注：云联网只支持标准型</li>
<li>NAT - NAT型</li>
NAT类型支持网络地址转换配置，类型确定后不能修改；一个私有网络可以创建一个NAT类型的专线网关和一个非NAT类型的专线网关
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
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
     * Get 专线网关IP。 
     * @return DirectConnectGatewayIp 专线网关IP。
     */
    public String getDirectConnectGatewayIp() {
        return this.DirectConnectGatewayIp;
    }

    /**
     * Set 专线网关IP。
     * @param DirectConnectGatewayIp 专线网关IP。
     */
    public void setDirectConnectGatewayIp(String DirectConnectGatewayIp) {
        this.DirectConnectGatewayIp = DirectConnectGatewayIp;
    }

    /**
     * Get 专线网关关联`CCN`实例`ID`。 
     * @return CcnId 专线网关关联`CCN`实例`ID`。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 专线网关关联`CCN`实例`ID`。
     * @param CcnId 专线网关关联`CCN`实例`ID`。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 云联网路由学习类型：
<li>`BGP` - 自动学习。</li>
<li>`STATIC` - 静态，即用户配置。</li> 
     * @return CcnRouteType 云联网路由学习类型：
<li>`BGP` - 自动学习。</li>
<li>`STATIC` - 静态，即用户配置。</li>
     */
    public String getCcnRouteType() {
        return this.CcnRouteType;
    }

    /**
     * Set 云联网路由学习类型：
<li>`BGP` - 自动学习。</li>
<li>`STATIC` - 静态，即用户配置。</li>
     * @param CcnRouteType 云联网路由学习类型：
<li>`BGP` - 自动学习。</li>
<li>`STATIC` - 静态，即用户配置。</li>
     */
    public void setCcnRouteType(String CcnRouteType) {
        this.CcnRouteType = CcnRouteType;
    }

    /**
     * Get 是否启用BGP。 
     * @return EnableBGP 是否启用BGP。
     */
    public Boolean getEnableBGP() {
        return this.EnableBGP;
    }

    /**
     * Set 是否启用BGP。
     * @param EnableBGP 是否启用BGP。
     */
    public void setEnableBGP(Boolean EnableBGP) {
        this.EnableBGP = EnableBGP;
    }

    /**
     * Get 开启和关闭BGP的community属性。 
     * @return EnableBGPCommunity 开启和关闭BGP的community属性。
     */
    public Boolean getEnableBGPCommunity() {
        return this.EnableBGPCommunity;
    }

    /**
     * Set 开启和关闭BGP的community属性。
     * @param EnableBGPCommunity 开启和关闭BGP的community属性。
     */
    public void setEnableBGPCommunity(Boolean EnableBGPCommunity) {
        this.EnableBGPCommunity = EnableBGPCommunity;
    }

    /**
     * Get 绑定的NAT网关ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatGatewayId 绑定的NAT网关ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set 绑定的NAT网关ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatGatewayId 绑定的NAT网关ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayName", this.DirectConnectGatewayName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DirectConnectGatewayIp", this.DirectConnectGatewayIp);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CcnRouteType", this.CcnRouteType);
        this.setParamSimple(map, prefix + "EnableBGP", this.EnableBGP);
        this.setParamSimple(map, prefix + "EnableBGPCommunity", this.EnableBGPCommunity);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);

    }
}

