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

public class DescribeVsmAttributesResponse extends AbstractModel{

    /**
    * 资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 资源IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 资源所属Vpc
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 资源所属子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 资源所属HSM的规格
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 资源类型
    */
    @SerializedName("VsmType")
    @Expose
    private Long VsmType;

    /**
    * 地域Id
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 区域Id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 安全组详情信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SgList")
    @Expose
    private UsgRuleDetail [] SgList;

    /**
    * 子网名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 地域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 区域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 实例是否已经过期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Expired")
    @Expose
    private Boolean Expired;

    /**
    * 为正数表示实例距离过期时间剩余秒数，为负数表示实例已经过期多少秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemainSeconds")
    @Expose
    private Long RemainSeconds;

    /**
    * 私有虚拟网络名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VPC的IPv4 CIDR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 子网的CIDR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetCidrBlock")
    @Expose
    private String SubnetCidrBlock;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 资源Id 
     * @return ResourceId 资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源Id
     * @param ResourceId 资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源名称 
     * @return ResourceName 资源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
     * @param ResourceName 资源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源状态 
     * @return Status 资源状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态
     * @param Status 资源状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 资源IP 
     * @return Vip 资源IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 资源IP
     * @param Vip 资源IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 资源所属Vpc 
     * @return VpcId 资源所属Vpc
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 资源所属Vpc
     * @param VpcId 资源所属Vpc
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 资源所属子网 
     * @return SubnetId 资源所属子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 资源所属子网
     * @param SubnetId 资源所属子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 资源所属HSM的规格 
     * @return Model 资源所属HSM的规格
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 资源所属HSM的规格
     * @param Model 资源所属HSM的规格
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 资源类型 
     * @return VsmType 资源类型
     */
    public Long getVsmType() {
        return this.VsmType;
    }

    /**
     * Set 资源类型
     * @param VsmType 资源类型
     */
    public void setVsmType(Long VsmType) {
        this.VsmType = VsmType;
    }

    /**
     * Get 地域Id 
     * @return RegionId 地域Id
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域Id
     * @param RegionId 地域Id
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域Id 
     * @return ZoneId 区域Id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域Id
     * @param ZoneId 区域Id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 安全组详情信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SgList 安全组详情信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UsgRuleDetail [] getSgList() {
        return this.SgList;
    }

    /**
     * Set 安全组详情信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SgList 安全组详情信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSgList(UsgRuleDetail [] SgList) {
        this.SgList = SgList;
    }

    /**
     * Get 子网名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetName 子网名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetName 子网名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 地域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionName 地域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionName 地域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 区域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneName 区域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 区域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneName 区域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 实例是否已经过期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Expired 实例是否已经过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getExpired() {
        return this.Expired;
    }

    /**
     * Set 实例是否已经过期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Expired 实例是否已经过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpired(Boolean Expired) {
        this.Expired = Expired;
    }

    /**
     * Get 为正数表示实例距离过期时间剩余秒数，为负数表示实例已经过期多少秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemainSeconds 为正数表示实例距离过期时间剩余秒数，为负数表示实例已经过期多少秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemainSeconds() {
        return this.RemainSeconds;
    }

    /**
     * Set 为正数表示实例距离过期时间剩余秒数，为负数表示实例已经过期多少秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemainSeconds 为正数表示实例距离过期时间剩余秒数，为负数表示实例已经过期多少秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemainSeconds(Long RemainSeconds) {
        this.RemainSeconds = RemainSeconds;
    }

    /**
     * Get 私有虚拟网络名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcName 私有虚拟网络名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有虚拟网络名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcName 私有虚拟网络名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VPC的IPv4 CIDR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcCidrBlock VPC的IPv4 CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set VPC的IPv4 CIDR
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcCidrBlock VPC的IPv4 CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 子网的CIDR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetCidrBlock 子网的CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetCidrBlock() {
        return this.SubnetCidrBlock;
    }

    /**
     * Set 子网的CIDR
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetCidrBlock 子网的CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetCidrBlock(String SubnetCidrBlock) {
        this.SubnetCidrBlock = SubnetCidrBlock;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "VsmType", this.VsmType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArrayObj(map, prefix + "SgList.", this.SgList);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Expired", this.Expired);
        this.setParamSimple(map, prefix + "RemainSeconds", this.RemainSeconds);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetCidrBlock", this.SubnetCidrBlock);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

