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
    * 资源状态，1表示资源为正常，2表示资源处于隔离状态
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
    * 资源类型，17表示EVSM，33表示GVSM，49表示SVSM
    */
    @SerializedName("VsmType")
    @Expose
    private Long VsmType;

    /**
    * 地域Id，返回腾讯云地域代码，如广州为1，北京为8
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 区域Id，返回腾讯云每个地域的可用区代码
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
    * 资源所关联的Tag
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 资源续费标识，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 厂商
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

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
     * Get 资源状态，1表示资源为正常，2表示资源处于隔离状态 
     * @return Status 资源状态，1表示资源为正常，2表示资源处于隔离状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态，1表示资源为正常，2表示资源处于隔离状态
     * @param Status 资源状态，1表示资源为正常，2表示资源处于隔离状态
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
     * Get 资源类型，17表示EVSM，33表示GVSM，49表示SVSM 
     * @return VsmType 资源类型，17表示EVSM，33表示GVSM，49表示SVSM
     */
    public Long getVsmType() {
        return this.VsmType;
    }

    /**
     * Set 资源类型，17表示EVSM，33表示GVSM，49表示SVSM
     * @param VsmType 资源类型，17表示EVSM，33表示GVSM，49表示SVSM
     */
    public void setVsmType(Long VsmType) {
        this.VsmType = VsmType;
    }

    /**
     * Get 地域Id，返回腾讯云地域代码，如广州为1，北京为8 
     * @return RegionId 地域Id，返回腾讯云地域代码，如广州为1，北京为8
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域Id，返回腾讯云地域代码，如广州为1，北京为8
     * @param RegionId 地域Id，返回腾讯云地域代码，如广州为1，北京为8
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域Id，返回腾讯云每个地域的可用区代码 
     * @return ZoneId 区域Id，返回腾讯云每个地域的可用区代码
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域Id，返回腾讯云每个地域的可用区代码
     * @param ZoneId 区域Id，返回腾讯云每个地域的可用区代码
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
     * Get 资源所关联的Tag
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 资源所关联的Tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 资源所关联的Tag
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 资源所关联的Tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 资源续费标识，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 资源续费标识，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 资源续费标识，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 资源续费标识，0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 厂商
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Manufacturer 厂商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 厂商
注意：此字段可能返回 null，表示取不到有效值。
     * @param Manufacturer 厂商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
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

    public DescribeVsmAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVsmAttributesResponse(DescribeVsmAttributesResponse source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.VsmType != null) {
            this.VsmType = new Long(source.VsmType);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.SgList != null) {
            this.SgList = new UsgRuleDetail[source.SgList.length];
            for (int i = 0; i < source.SgList.length; i++) {
                this.SgList[i] = new UsgRuleDetail(source.SgList[i]);
            }
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Expired != null) {
            this.Expired = new Boolean(source.Expired);
        }
        if (source.RemainSeconds != null) {
            this.RemainSeconds = new Long(source.RemainSeconds);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.SubnetCidrBlock != null) {
            this.SubnetCidrBlock = new String(source.SubnetCidrBlock);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

