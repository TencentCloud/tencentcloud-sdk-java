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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Subnet extends AbstractModel{

    /**
    * VPC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网实例ID，例如：subnet-bthucmmy。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网的 IPv4 CIDR。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 可用IP数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableIpAddressCount")
    @Expose
    private Long AvailableIpAddressCount;

    /**
    * 子网的 IPv6 CIDR。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * 总IP数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalIpAddressCount")
    @Expose
    private Long TotalIpAddressCount;

    /**
    * 是否为默认Subnet
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
     * Get VPC实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId VPC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId VPC实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网实例ID，例如：subnet-bthucmmy。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网实例ID，例如：subnet-bthucmmy。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例ID，例如：subnet-bthucmmy。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网实例ID，例如：subnet-bthucmmy。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetName 子网名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetName 子网名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 子网的 IPv4 CIDR。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CidrBlock 子网的 IPv4 CIDR。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 子网的 IPv4 CIDR。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CidrBlock 子网的 IPv4 CIDR。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 可用IP数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableIpAddressCount 可用IP数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailableIpAddressCount() {
        return this.AvailableIpAddressCount;
    }

    /**
     * Set 可用IP数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableIpAddressCount 可用IP数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableIpAddressCount(Long AvailableIpAddressCount) {
        this.AvailableIpAddressCount = AvailableIpAddressCount;
    }

    /**
     * Get 子网的 IPv6 CIDR。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6CidrBlock 子网的 IPv6 CIDR。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set 子网的 IPv6 CIDR。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6CidrBlock 子网的 IPv6 CIDR。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get 总IP数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalIpAddressCount 总IP数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalIpAddressCount() {
        return this.TotalIpAddressCount;
    }

    /**
     * Set 总IP数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalIpAddressCount 总IP数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalIpAddressCount(Long TotalIpAddressCount) {
        this.TotalIpAddressCount = TotalIpAddressCount;
    }

    /**
     * Get 是否为默认Subnet
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefault 是否为默认Subnet
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认Subnet
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefault 是否为默认Subnet
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "AvailableIpAddressCount", this.AvailableIpAddressCount);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "TotalIpAddressCount", this.TotalIpAddressCount);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

