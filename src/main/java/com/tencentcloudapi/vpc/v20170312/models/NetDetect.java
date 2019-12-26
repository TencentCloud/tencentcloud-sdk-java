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

public class NetDetect extends AbstractModel{

    /**
    * `VPC`实例`ID`。形如：`vpc-12345678`
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * `VPC`实例名称。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 子网实例ID。形如：subnet-12345678。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网实例名称。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 网络探测实例ID。形如：netd-12345678。
    */
    @SerializedName("NetDetectId")
    @Expose
    private String NetDetectId;

    /**
    * 网络探测名称，最大长度不能超过60个字节。
    */
    @SerializedName("NetDetectName")
    @Expose
    private String NetDetectName;

    /**
    * 探测目的IPv4地址数组，最多两个。
    */
    @SerializedName("DetectDestinationIp")
    @Expose
    private String [] DetectDestinationIp;

    /**
    * 系统自动分配的探测源IPv4数组。长度为2。
    */
    @SerializedName("DetectSourceIp")
    @Expose
    private String [] DetectSourceIp;

    /**
    * 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云服务器；
    */
    @SerializedName("NextHopType")
    @Expose
    private String NextHopType;

    /**
    * 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云服务器IPv4地址，形如：10.0.0.12；
    */
    @SerializedName("NextHopDestination")
    @Expose
    private String NextHopDestination;

    /**
    * 下一跳网关名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextHopName")
    @Expose
    private String NextHopName;

    /**
    * 网络探测描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetDetectDescription")
    @Expose
    private String NetDetectDescription;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get `VPC`实例`ID`。形如：`vpc-12345678` 
     * @return VpcId `VPC`实例`ID`。形如：`vpc-12345678`
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `VPC`实例`ID`。形如：`vpc-12345678`
     * @param VpcId `VPC`实例`ID`。形如：`vpc-12345678`
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get `VPC`实例名称。 
     * @return VpcName `VPC`实例名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set `VPC`实例名称。
     * @param VpcName `VPC`实例名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 子网实例ID。形如：subnet-12345678。 
     * @return SubnetId 子网实例ID。形如：subnet-12345678。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例ID。形如：subnet-12345678。
     * @param SubnetId 子网实例ID。形如：subnet-12345678。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网实例名称。 
     * @return SubnetName 子网实例名称。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网实例名称。
     * @param SubnetName 子网实例名称。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 网络探测实例ID。形如：netd-12345678。 
     * @return NetDetectId 网络探测实例ID。形如：netd-12345678。
     */
    public String getNetDetectId() {
        return this.NetDetectId;
    }

    /**
     * Set 网络探测实例ID。形如：netd-12345678。
     * @param NetDetectId 网络探测实例ID。形如：netd-12345678。
     */
    public void setNetDetectId(String NetDetectId) {
        this.NetDetectId = NetDetectId;
    }

    /**
     * Get 网络探测名称，最大长度不能超过60个字节。 
     * @return NetDetectName 网络探测名称，最大长度不能超过60个字节。
     */
    public String getNetDetectName() {
        return this.NetDetectName;
    }

    /**
     * Set 网络探测名称，最大长度不能超过60个字节。
     * @param NetDetectName 网络探测名称，最大长度不能超过60个字节。
     */
    public void setNetDetectName(String NetDetectName) {
        this.NetDetectName = NetDetectName;
    }

    /**
     * Get 探测目的IPv4地址数组，最多两个。 
     * @return DetectDestinationIp 探测目的IPv4地址数组，最多两个。
     */
    public String [] getDetectDestinationIp() {
        return this.DetectDestinationIp;
    }

    /**
     * Set 探测目的IPv4地址数组，最多两个。
     * @param DetectDestinationIp 探测目的IPv4地址数组，最多两个。
     */
    public void setDetectDestinationIp(String [] DetectDestinationIp) {
        this.DetectDestinationIp = DetectDestinationIp;
    }

    /**
     * Get 系统自动分配的探测源IPv4数组。长度为2。 
     * @return DetectSourceIp 系统自动分配的探测源IPv4数组。长度为2。
     */
    public String [] getDetectSourceIp() {
        return this.DetectSourceIp;
    }

    /**
     * Set 系统自动分配的探测源IPv4数组。长度为2。
     * @param DetectSourceIp 系统自动分配的探测源IPv4数组。长度为2。
     */
    public void setDetectSourceIp(String [] DetectSourceIp) {
        this.DetectSourceIp = DetectSourceIp;
    }

    /**
     * Get 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云服务器； 
     * @return NextHopType 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云服务器；
     */
    public String getNextHopType() {
        return this.NextHopType;
    }

    /**
     * Set 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云服务器；
     * @param NextHopType 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云服务器；
     */
    public void setNextHopType(String NextHopType) {
        this.NextHopType = NextHopType;
    }

    /**
     * Get 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云服务器IPv4地址，形如：10.0.0.12； 
     * @return NextHopDestination 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云服务器IPv4地址，形如：10.0.0.12；
     */
    public String getNextHopDestination() {
        return this.NextHopDestination;
    }

    /**
     * Set 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云服务器IPv4地址，形如：10.0.0.12；
     * @param NextHopDestination 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云服务器IPv4地址，形如：10.0.0.12；
     */
    public void setNextHopDestination(String NextHopDestination) {
        this.NextHopDestination = NextHopDestination;
    }

    /**
     * Get 下一跳网关名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextHopName 下一跳网关名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextHopName() {
        return this.NextHopName;
    }

    /**
     * Set 下一跳网关名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextHopName 下一跳网关名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextHopName(String NextHopName) {
        this.NextHopName = NextHopName;
    }

    /**
     * Get 网络探测描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetDetectDescription 网络探测描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetDetectDescription() {
        return this.NetDetectDescription;
    }

    /**
     * Set 网络探测描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetDetectDescription 网络探测描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetDetectDescription(String NetDetectDescription) {
        this.NetDetectDescription = NetDetectDescription;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "NetDetectId", this.NetDetectId);
        this.setParamSimple(map, prefix + "NetDetectName", this.NetDetectName);
        this.setParamArraySimple(map, prefix + "DetectDestinationIp.", this.DetectDestinationIp);
        this.setParamArraySimple(map, prefix + "DetectSourceIp.", this.DetectSourceIp);
        this.setParamSimple(map, prefix + "NextHopType", this.NextHopType);
        this.setParamSimple(map, prefix + "NextHopDestination", this.NextHopDestination);
        this.setParamSimple(map, prefix + "NextHopName", this.NextHopName);
        this.setParamSimple(map, prefix + "NetDetectDescription", this.NetDetectDescription);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

