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

public class SourceIpTranslationNatRule extends AbstractModel{

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型，目前包含SUBNET、NETWORKINTERFACE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 源IP/网段
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * 弹性IP地址池
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Snat规则ID
    */
    @SerializedName("NatGatewaySnatId")
    @Expose
    private String NatGatewaySnatId;

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
    * NAT网关SNAT规则创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型，目前包含SUBNET、NETWORKINTERFACE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型，目前包含SUBNET、NETWORKINTERFACE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，目前包含SUBNET、NETWORKINTERFACE
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型，目前包含SUBNET、NETWORKINTERFACE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 源IP/网段 
     * @return PrivateIpAddress 源IP/网段
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set 源IP/网段
     * @param PrivateIpAddress 源IP/网段
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get 弹性IP地址池 
     * @return PublicIpAddresses 弹性IP地址池
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 弹性IP地址池
     * @param PublicIpAddresses 弹性IP地址池
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Snat规则ID 
     * @return NatGatewaySnatId Snat规则ID
     */
    public String getNatGatewaySnatId() {
        return this.NatGatewaySnatId;
    }

    /**
     * Set Snat规则ID
     * @param NatGatewaySnatId Snat规则ID
     */
    public void setNatGatewaySnatId(String NatGatewaySnatId) {
        this.NatGatewaySnatId = NatGatewaySnatId;
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
     * Get NAT网关SNAT规则创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime NAT网关SNAT规则创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set NAT网关SNAT规则创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime NAT网关SNAT规则创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public SourceIpTranslationNatRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceIpTranslationNatRule(SourceIpTranslationNatRule source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NatGatewaySnatId != null) {
            this.NatGatewaySnatId = new String(source.NatGatewaySnatId);
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
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "NatGatewaySnatId", this.NatGatewaySnatId);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

