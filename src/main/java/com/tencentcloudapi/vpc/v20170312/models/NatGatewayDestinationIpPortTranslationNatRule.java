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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatGatewayDestinationIpPortTranslationNatRule extends AbstractModel {

    /**
    * 网络协议，可选值：`TCP`、`UDP`。
    */
    @SerializedName("IpProtocol")
    @Expose
    private String IpProtocol;

    /**
    * 弹性公网IP。
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * 公网端口。
    */
    @SerializedName("PublicPort")
    @Expose
    private Long PublicPort;

    /**
    * 内网地址。
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * 内网端口。
    */
    @SerializedName("PrivatePort")
    @Expose
    private Long PrivatePort;

    /**
    * NAT网关转发规则描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * NAT网关的ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * 私有网络VPC的ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * NAT网关转发规则创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 网络协议，可选值：`TCP`、`UDP`。 
     * @return IpProtocol 网络协议，可选值：`TCP`、`UDP`。
     */
    public String getIpProtocol() {
        return this.IpProtocol;
    }

    /**
     * Set 网络协议，可选值：`TCP`、`UDP`。
     * @param IpProtocol 网络协议，可选值：`TCP`、`UDP`。
     */
    public void setIpProtocol(String IpProtocol) {
        this.IpProtocol = IpProtocol;
    }

    /**
     * Get 弹性公网IP。 
     * @return PublicIpAddress 弹性公网IP。
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set 弹性公网IP。
     * @param PublicIpAddress 弹性公网IP。
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get 公网端口。 
     * @return PublicPort 公网端口。
     */
    public Long getPublicPort() {
        return this.PublicPort;
    }

    /**
     * Set 公网端口。
     * @param PublicPort 公网端口。
     */
    public void setPublicPort(Long PublicPort) {
        this.PublicPort = PublicPort;
    }

    /**
     * Get 内网地址。 
     * @return PrivateIpAddress 内网地址。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set 内网地址。
     * @param PrivateIpAddress 内网地址。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get 内网端口。 
     * @return PrivatePort 内网端口。
     */
    public Long getPrivatePort() {
        return this.PrivatePort;
    }

    /**
     * Set 内网端口。
     * @param PrivatePort 内网端口。
     */
    public void setPrivatePort(Long PrivatePort) {
        this.PrivatePort = PrivatePort;
    }

    /**
     * Get NAT网关转发规则描述。 
     * @return Description NAT网关转发规则描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set NAT网关转发规则描述。
     * @param Description NAT网关转发规则描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get NAT网关的ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatGatewayId NAT网关的ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT网关的ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatGatewayId NAT网关的ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get 私有网络VPC的ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络VPC的ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络VPC的ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络VPC的ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get NAT网关转发规则创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime NAT网关转发规则创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set NAT网关转发规则创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime NAT网关转发规则创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public NatGatewayDestinationIpPortTranslationNatRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatGatewayDestinationIpPortTranslationNatRule(NatGatewayDestinationIpPortTranslationNatRule source) {
        if (source.IpProtocol != null) {
            this.IpProtocol = new String(source.IpProtocol);
        }
        if (source.PublicIpAddress != null) {
            this.PublicIpAddress = new String(source.PublicIpAddress);
        }
        if (source.PublicPort != null) {
            this.PublicPort = new Long(source.PublicPort);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.PrivatePort != null) {
            this.PrivatePort = new Long(source.PrivatePort);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpProtocol", this.IpProtocol);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "PublicPort", this.PublicPort);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "PrivatePort", this.PrivatePort);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

