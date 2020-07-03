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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipInfo extends AbstractModel{

    /**
    * EIP实例ID
    */
    @SerializedName("EipId")
    @Expose
    private String EipId;

    /**
    * EIP名称
    */
    @SerializedName("EipName")
    @Expose
    private String EipName;

    /**
    * EIP地址
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
    * 运营商ID 0：电信； 1：联通； 2：移动； 3：教育网； 4：盈科； 5：BGP； 6：中国香港
    */
    @SerializedName("IspId")
    @Expose
    private Long IspId;

    /**
    * 状态 0：创建中； 1：绑定中； 2：已绑定； 3：解绑中； 4：未绑定； 6：下线中； 9：创建失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否欠费隔离 1： 欠费隔离； 0： 正常。处在欠费隔离情况下的EIP不能进行任何管理操作。
    */
    @SerializedName("Arrears")
    @Expose
    private Long Arrears;

    /**
    * EIP所绑定的服务器实例ID，未绑定则为空
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务器别名
    */
    @SerializedName("InstanceAlias")
    @Expose
    private String InstanceAlias;

    /**
    * EIP解绑时间
    */
    @SerializedName("FreeAt")
    @Expose
    private String FreeAt;

    /**
    * EIP创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * EIP更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * EIP未绑定服务器时长（单位：秒）
    */
    @SerializedName("FreeSecond")
    @Expose
    private Long FreeSecond;

    /**
    * EIP所绑定的资源类型，-1：未绑定资源；0：黑石物理机，字段对应unInstanceId；1：Nat网关，字段对应natUid；2：云服务器字段对应vpcIp; 3: 托管机器，字段对应HInstanceId, HInstanceAlias
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * EIP带宽计费模式下的带宽上限（单位：MB）
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 最近一次操作变更的EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
    */
    @SerializedName("LatestPayMode")
    @Expose
    private String LatestPayMode;

    /**
    * 最近一次操作变更的EIP计费模式对应的带宽上限值，仅在带宽计费模式下有效（单位：MB）
    */
    @SerializedName("LatestBandwidth")
    @Expose
    private Long LatestBandwidth;

    /**
    * 私有网络名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * EIP所绑定的NAT网关的数字ID，形如：1001,，未绑定则为空
    */
    @SerializedName("NatId")
    @Expose
    private Long NatId;

    /**
    * EIP所绑定的NAT网关实例ID，形如："nat-n47xxxxx"，未绑定则为空
    */
    @SerializedName("NatUid")
    @Expose
    private String NatUid;

    /**
    * EIP所绑定的云服务器IP(托管或者云服务器的IP），形如："10.1.1.3"。 注意：IP资源需要通过bmvpc模块注册或者申请后才可以绑定eip，接口使用申请子网IP和注册子网IP：,未绑定则为空
    */
    @SerializedName("VpcIp")
    @Expose
    private String VpcIp;

    /**
    * 私有网络实例ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 是否为独占类型EIP
    */
    @SerializedName("Exclusive")
    @Expose
    private Long Exclusive;

    /**
    * 私有网络的cidr
    */
    @SerializedName("VpcCidr")
    @Expose
    private String VpcCidr;

    /**
    * EIP ACL实例ID
    */
    @SerializedName("AclId")
    @Expose
    private String AclId;

    /**
    * EIP ACL名称
    */
    @SerializedName("AclName")
    @Expose
    private String AclName;

    /**
    * 托管机器实例ID
    */
    @SerializedName("HInstanceId")
    @Expose
    private String HInstanceId;

    /**
    * 托管机器别名
    */
    @SerializedName("HInstanceAlias")
    @Expose
    private String HInstanceAlias;

    /**
     * Get EIP实例ID 
     * @return EipId EIP实例ID
     */
    public String getEipId() {
        return this.EipId;
    }

    /**
     * Set EIP实例ID
     * @param EipId EIP实例ID
     */
    public void setEipId(String EipId) {
        this.EipId = EipId;
    }

    /**
     * Get EIP名称 
     * @return EipName EIP名称
     */
    public String getEipName() {
        return this.EipName;
    }

    /**
     * Set EIP名称
     * @param EipName EIP名称
     */
    public void setEipName(String EipName) {
        this.EipName = EipName;
    }

    /**
     * Get EIP地址 
     * @return Eip EIP地址
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set EIP地址
     * @param Eip EIP地址
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * Get 运营商ID 0：电信； 1：联通； 2：移动； 3：教育网； 4：盈科； 5：BGP； 6：中国香港 
     * @return IspId 运营商ID 0：电信； 1：联通； 2：移动； 3：教育网； 4：盈科； 5：BGP； 6：中国香港
     */
    public Long getIspId() {
        return this.IspId;
    }

    /**
     * Set 运营商ID 0：电信； 1：联通； 2：移动； 3：教育网； 4：盈科； 5：BGP； 6：中国香港
     * @param IspId 运营商ID 0：电信； 1：联通； 2：移动； 3：教育网； 4：盈科； 5：BGP； 6：中国香港
     */
    public void setIspId(Long IspId) {
        this.IspId = IspId;
    }

    /**
     * Get 状态 0：创建中； 1：绑定中； 2：已绑定； 3：解绑中； 4：未绑定； 6：下线中； 9：创建失败 
     * @return Status 状态 0：创建中； 1：绑定中； 2：已绑定； 3：解绑中； 4：未绑定； 6：下线中； 9：创建失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0：创建中； 1：绑定中； 2：已绑定； 3：解绑中； 4：未绑定； 6：下线中； 9：创建失败
     * @param Status 状态 0：创建中； 1：绑定中； 2：已绑定； 3：解绑中； 4：未绑定； 6：下线中； 9：创建失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否欠费隔离 1： 欠费隔离； 0： 正常。处在欠费隔离情况下的EIP不能进行任何管理操作。 
     * @return Arrears 是否欠费隔离 1： 欠费隔离； 0： 正常。处在欠费隔离情况下的EIP不能进行任何管理操作。
     */
    public Long getArrears() {
        return this.Arrears;
    }

    /**
     * Set 是否欠费隔离 1： 欠费隔离； 0： 正常。处在欠费隔离情况下的EIP不能进行任何管理操作。
     * @param Arrears 是否欠费隔离 1： 欠费隔离； 0： 正常。处在欠费隔离情况下的EIP不能进行任何管理操作。
     */
    public void setArrears(Long Arrears) {
        this.Arrears = Arrears;
    }

    /**
     * Get EIP所绑定的服务器实例ID，未绑定则为空 
     * @return InstanceId EIP所绑定的服务器实例ID，未绑定则为空
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EIP所绑定的服务器实例ID，未绑定则为空
     * @param InstanceId EIP所绑定的服务器实例ID，未绑定则为空
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务器别名 
     * @return InstanceAlias 服务器别名
     */
    public String getInstanceAlias() {
        return this.InstanceAlias;
    }

    /**
     * Set 服务器别名
     * @param InstanceAlias 服务器别名
     */
    public void setInstanceAlias(String InstanceAlias) {
        this.InstanceAlias = InstanceAlias;
    }

    /**
     * Get EIP解绑时间 
     * @return FreeAt EIP解绑时间
     */
    public String getFreeAt() {
        return this.FreeAt;
    }

    /**
     * Set EIP解绑时间
     * @param FreeAt EIP解绑时间
     */
    public void setFreeAt(String FreeAt) {
        this.FreeAt = FreeAt;
    }

    /**
     * Get EIP创建时间 
     * @return CreatedAt EIP创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set EIP创建时间
     * @param CreatedAt EIP创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get EIP更新时间 
     * @return UpdatedAt EIP更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set EIP更新时间
     * @param UpdatedAt EIP更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get EIP未绑定服务器时长（单位：秒） 
     * @return FreeSecond EIP未绑定服务器时长（单位：秒）
     */
    public Long getFreeSecond() {
        return this.FreeSecond;
    }

    /**
     * Set EIP未绑定服务器时长（单位：秒）
     * @param FreeSecond EIP未绑定服务器时长（单位：秒）
     */
    public void setFreeSecond(Long FreeSecond) {
        this.FreeSecond = FreeSecond;
    }

    /**
     * Get EIP所绑定的资源类型，-1：未绑定资源；0：黑石物理机，字段对应unInstanceId；1：Nat网关，字段对应natUid；2：云服务器字段对应vpcIp; 3: 托管机器，字段对应HInstanceId, HInstanceAlias 
     * @return Type EIP所绑定的资源类型，-1：未绑定资源；0：黑石物理机，字段对应unInstanceId；1：Nat网关，字段对应natUid；2：云服务器字段对应vpcIp; 3: 托管机器，字段对应HInstanceId, HInstanceAlias
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set EIP所绑定的资源类型，-1：未绑定资源；0：黑石物理机，字段对应unInstanceId；1：Nat网关，字段对应natUid；2：云服务器字段对应vpcIp; 3: 托管机器，字段对应HInstanceId, HInstanceAlias
     * @param Type EIP所绑定的资源类型，-1：未绑定资源；0：黑石物理机，字段对应unInstanceId；1：Nat网关，字段对应natUid；2：云服务器字段对应vpcIp; 3: 托管机器，字段对应HInstanceId, HInstanceAlias
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费 
     * @return PayMode EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     * @param PayMode EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get EIP带宽计费模式下的带宽上限（单位：MB） 
     * @return Bandwidth EIP带宽计费模式下的带宽上限（单位：MB）
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set EIP带宽计费模式下的带宽上限（单位：MB）
     * @param Bandwidth EIP带宽计费模式下的带宽上限（单位：MB）
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 最近一次操作变更的EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费 
     * @return LatestPayMode 最近一次操作变更的EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     */
    public String getLatestPayMode() {
        return this.LatestPayMode;
    }

    /**
     * Set 最近一次操作变更的EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     * @param LatestPayMode 最近一次操作变更的EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     */
    public void setLatestPayMode(String LatestPayMode) {
        this.LatestPayMode = LatestPayMode;
    }

    /**
     * Get 最近一次操作变更的EIP计费模式对应的带宽上限值，仅在带宽计费模式下有效（单位：MB） 
     * @return LatestBandwidth 最近一次操作变更的EIP计费模式对应的带宽上限值，仅在带宽计费模式下有效（单位：MB）
     */
    public Long getLatestBandwidth() {
        return this.LatestBandwidth;
    }

    /**
     * Set 最近一次操作变更的EIP计费模式对应的带宽上限值，仅在带宽计费模式下有效（单位：MB）
     * @param LatestBandwidth 最近一次操作变更的EIP计费模式对应的带宽上限值，仅在带宽计费模式下有效（单位：MB）
     */
    public void setLatestBandwidth(Long LatestBandwidth) {
        this.LatestBandwidth = LatestBandwidth;
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
     * Get EIP所绑定的NAT网关的数字ID，形如：1001,，未绑定则为空 
     * @return NatId EIP所绑定的NAT网关的数字ID，形如：1001,，未绑定则为空
     */
    public Long getNatId() {
        return this.NatId;
    }

    /**
     * Set EIP所绑定的NAT网关的数字ID，形如：1001,，未绑定则为空
     * @param NatId EIP所绑定的NAT网关的数字ID，形如：1001,，未绑定则为空
     */
    public void setNatId(Long NatId) {
        this.NatId = NatId;
    }

    /**
     * Get EIP所绑定的NAT网关实例ID，形如："nat-n47xxxxx"，未绑定则为空 
     * @return NatUid EIP所绑定的NAT网关实例ID，形如："nat-n47xxxxx"，未绑定则为空
     */
    public String getNatUid() {
        return this.NatUid;
    }

    /**
     * Set EIP所绑定的NAT网关实例ID，形如："nat-n47xxxxx"，未绑定则为空
     * @param NatUid EIP所绑定的NAT网关实例ID，形如："nat-n47xxxxx"，未绑定则为空
     */
    public void setNatUid(String NatUid) {
        this.NatUid = NatUid;
    }

    /**
     * Get EIP所绑定的云服务器IP(托管或者云服务器的IP），形如："10.1.1.3"。 注意：IP资源需要通过bmvpc模块注册或者申请后才可以绑定eip，接口使用申请子网IP和注册子网IP：,未绑定则为空 
     * @return VpcIp EIP所绑定的云服务器IP(托管或者云服务器的IP），形如："10.1.1.3"。 注意：IP资源需要通过bmvpc模块注册或者申请后才可以绑定eip，接口使用申请子网IP和注册子网IP：,未绑定则为空
     */
    public String getVpcIp() {
        return this.VpcIp;
    }

    /**
     * Set EIP所绑定的云服务器IP(托管或者云服务器的IP），形如："10.1.1.3"。 注意：IP资源需要通过bmvpc模块注册或者申请后才可以绑定eip，接口使用申请子网IP和注册子网IP：,未绑定则为空
     * @param VpcIp EIP所绑定的云服务器IP(托管或者云服务器的IP），形如："10.1.1.3"。 注意：IP资源需要通过bmvpc模块注册或者申请后才可以绑定eip，接口使用申请子网IP和注册子网IP：,未绑定则为空
     */
    public void setVpcIp(String VpcIp) {
        this.VpcIp = VpcIp;
    }

    /**
     * Get 私有网络实例ID 
     * @return VpcId 私有网络实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络实例ID
     * @param VpcId 私有网络实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 是否为独占类型EIP 
     * @return Exclusive 是否为独占类型EIP
     */
    public Long getExclusive() {
        return this.Exclusive;
    }

    /**
     * Set 是否为独占类型EIP
     * @param Exclusive 是否为独占类型EIP
     */
    public void setExclusive(Long Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * Get 私有网络的cidr 
     * @return VpcCidr 私有网络的cidr
     */
    public String getVpcCidr() {
        return this.VpcCidr;
    }

    /**
     * Set 私有网络的cidr
     * @param VpcCidr 私有网络的cidr
     */
    public void setVpcCidr(String VpcCidr) {
        this.VpcCidr = VpcCidr;
    }

    /**
     * Get EIP ACL实例ID 
     * @return AclId EIP ACL实例ID
     */
    public String getAclId() {
        return this.AclId;
    }

    /**
     * Set EIP ACL实例ID
     * @param AclId EIP ACL实例ID
     */
    public void setAclId(String AclId) {
        this.AclId = AclId;
    }

    /**
     * Get EIP ACL名称 
     * @return AclName EIP ACL名称
     */
    public String getAclName() {
        return this.AclName;
    }

    /**
     * Set EIP ACL名称
     * @param AclName EIP ACL名称
     */
    public void setAclName(String AclName) {
        this.AclName = AclName;
    }

    /**
     * Get 托管机器实例ID 
     * @return HInstanceId 托管机器实例ID
     */
    public String getHInstanceId() {
        return this.HInstanceId;
    }

    /**
     * Set 托管机器实例ID
     * @param HInstanceId 托管机器实例ID
     */
    public void setHInstanceId(String HInstanceId) {
        this.HInstanceId = HInstanceId;
    }

    /**
     * Get 托管机器别名 
     * @return HInstanceAlias 托管机器别名
     */
    public String getHInstanceAlias() {
        return this.HInstanceAlias;
    }

    /**
     * Set 托管机器别名
     * @param HInstanceAlias 托管机器别名
     */
    public void setHInstanceAlias(String HInstanceAlias) {
        this.HInstanceAlias = HInstanceAlias;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipId", this.EipId);
        this.setParamSimple(map, prefix + "EipName", this.EipName);
        this.setParamSimple(map, prefix + "Eip", this.Eip);
        this.setParamSimple(map, prefix + "IspId", this.IspId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Arrears", this.Arrears);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceAlias", this.InstanceAlias);
        this.setParamSimple(map, prefix + "FreeAt", this.FreeAt);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "FreeSecond", this.FreeSecond);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "LatestPayMode", this.LatestPayMode);
        this.setParamSimple(map, prefix + "LatestBandwidth", this.LatestBandwidth);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamSimple(map, prefix + "NatUid", this.NatUid);
        this.setParamSimple(map, prefix + "VpcIp", this.VpcIp);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamSimple(map, prefix + "VpcCidr", this.VpcCidr);
        this.setParamSimple(map, prefix + "AclId", this.AclId);
        this.setParamSimple(map, prefix + "AclName", this.AclName);
        this.setParamSimple(map, prefix + "HInstanceId", this.HInstanceId);
        this.setParamSimple(map, prefix + "HInstanceAlias", this.HInstanceAlias);

    }
}

