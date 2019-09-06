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

public class EipInfo  extends AbstractModel{

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
    private Integer IspId;

    /**
    * 状态 0：创建中； 1：绑定中； 2：已绑定； 3：解绑中； 4：未绑定； 6：下线中； 9：创建失败
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 是否欠费隔离 1： 欠费隔离； 0： 正常。处在欠费隔离情况下的EIP不能进行任何管理操作。
    */
    @SerializedName("Arrears")
    @Expose
    private Integer Arrears;

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
    private Integer FreeSecond;

    /**
    * EIP所绑定的资源类型，-1：未绑定资源；0：黑石物理机，字段对应unInstanceId；1：Nat网关，字段对应natUid；2：云服务器字段对应vpcIp; 3: 托管机器，字段对应HInstanceId, HInstanceAlias
    */
    @SerializedName("Type")
    @Expose
    private Integer Type;

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
    private Integer Bandwidth;

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
    private Integer LatestBandwidth;

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
    private Integer NatId;

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
    private Integer Exclusive;

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
     * 获取EIP实例ID
     * @return EipId EIP实例ID
     */
    public String getEipId() {
        return this.EipId;
    }

    /**
     * 设置EIP实例ID
     * @param EipId EIP实例ID
     */
    public void setEipId(String EipId) {
        this.EipId = EipId;
    }

    /**
     * 获取EIP名称
     * @return EipName EIP名称
     */
    public String getEipName() {
        return this.EipName;
    }

    /**
     * 设置EIP名称
     * @param EipName EIP名称
     */
    public void setEipName(String EipName) {
        this.EipName = EipName;
    }

    /**
     * 获取EIP地址
     * @return Eip EIP地址
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * 设置EIP地址
     * @param Eip EIP地址
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * 获取运营商ID 0：电信； 1：联通； 2：移动； 3：教育网； 4：盈科； 5：BGP； 6：中国香港
     * @return IspId 运营商ID 0：电信； 1：联通； 2：移动； 3：教育网； 4：盈科； 5：BGP； 6：中国香港
     */
    public Integer getIspId() {
        return this.IspId;
    }

    /**
     * 设置运营商ID 0：电信； 1：联通； 2：移动； 3：教育网； 4：盈科； 5：BGP； 6：中国香港
     * @param IspId 运营商ID 0：电信； 1：联通； 2：移动； 3：教育网； 4：盈科； 5：BGP； 6：中国香港
     */
    public void setIspId(Integer IspId) {
        this.IspId = IspId;
    }

    /**
     * 获取状态 0：创建中； 1：绑定中； 2：已绑定； 3：解绑中； 4：未绑定； 6：下线中； 9：创建失败
     * @return Status 状态 0：创建中； 1：绑定中； 2：已绑定； 3：解绑中； 4：未绑定； 6：下线中； 9：创建失败
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态 0：创建中； 1：绑定中； 2：已绑定； 3：解绑中； 4：未绑定； 6：下线中； 9：创建失败
     * @param Status 状态 0：创建中； 1：绑定中； 2：已绑定； 3：解绑中； 4：未绑定； 6：下线中； 9：创建失败
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取是否欠费隔离 1： 欠费隔离； 0： 正常。处在欠费隔离情况下的EIP不能进行任何管理操作。
     * @return Arrears 是否欠费隔离 1： 欠费隔离； 0： 正常。处在欠费隔离情况下的EIP不能进行任何管理操作。
     */
    public Integer getArrears() {
        return this.Arrears;
    }

    /**
     * 设置是否欠费隔离 1： 欠费隔离； 0： 正常。处在欠费隔离情况下的EIP不能进行任何管理操作。
     * @param Arrears 是否欠费隔离 1： 欠费隔离； 0： 正常。处在欠费隔离情况下的EIP不能进行任何管理操作。
     */
    public void setArrears(Integer Arrears) {
        this.Arrears = Arrears;
    }

    /**
     * 获取EIP所绑定的服务器实例ID，未绑定则为空
     * @return InstanceId EIP所绑定的服务器实例ID，未绑定则为空
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置EIP所绑定的服务器实例ID，未绑定则为空
     * @param InstanceId EIP所绑定的服务器实例ID，未绑定则为空
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取服务器别名
     * @return InstanceAlias 服务器别名
     */
    public String getInstanceAlias() {
        return this.InstanceAlias;
    }

    /**
     * 设置服务器别名
     * @param InstanceAlias 服务器别名
     */
    public void setInstanceAlias(String InstanceAlias) {
        this.InstanceAlias = InstanceAlias;
    }

    /**
     * 获取EIP解绑时间
     * @return FreeAt EIP解绑时间
     */
    public String getFreeAt() {
        return this.FreeAt;
    }

    /**
     * 设置EIP解绑时间
     * @param FreeAt EIP解绑时间
     */
    public void setFreeAt(String FreeAt) {
        this.FreeAt = FreeAt;
    }

    /**
     * 获取EIP创建时间
     * @return CreatedAt EIP创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * 设置EIP创建时间
     * @param CreatedAt EIP创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * 获取EIP更新时间
     * @return UpdatedAt EIP更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * 设置EIP更新时间
     * @param UpdatedAt EIP更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * 获取EIP未绑定服务器时长（单位：秒）
     * @return FreeSecond EIP未绑定服务器时长（单位：秒）
     */
    public Integer getFreeSecond() {
        return this.FreeSecond;
    }

    /**
     * 设置EIP未绑定服务器时长（单位：秒）
     * @param FreeSecond EIP未绑定服务器时长（单位：秒）
     */
    public void setFreeSecond(Integer FreeSecond) {
        this.FreeSecond = FreeSecond;
    }

    /**
     * 获取EIP所绑定的资源类型，-1：未绑定资源；0：黑石物理机，字段对应unInstanceId；1：Nat网关，字段对应natUid；2：云服务器字段对应vpcIp; 3: 托管机器，字段对应HInstanceId, HInstanceAlias
     * @return Type EIP所绑定的资源类型，-1：未绑定资源；0：黑石物理机，字段对应unInstanceId；1：Nat网关，字段对应natUid；2：云服务器字段对应vpcIp; 3: 托管机器，字段对应HInstanceId, HInstanceAlias
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置EIP所绑定的资源类型，-1：未绑定资源；0：黑石物理机，字段对应unInstanceId；1：Nat网关，字段对应natUid；2：云服务器字段对应vpcIp; 3: 托管机器，字段对应HInstanceId, HInstanceAlias
     * @param Type EIP所绑定的资源类型，-1：未绑定资源；0：黑石物理机，字段对应unInstanceId；1：Nat网关，字段对应natUid；2：云服务器字段对应vpcIp; 3: 托管机器，字段对应HInstanceId, HInstanceAlias
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 获取EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     * @return PayMode EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * 设置EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     * @param PayMode EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * 获取EIP带宽计费模式下的带宽上限（单位：MB）
     * @return Bandwidth EIP带宽计费模式下的带宽上限（单位：MB）
     */
    public Integer getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置EIP带宽计费模式下的带宽上限（单位：MB）
     * @param Bandwidth EIP带宽计费模式下的带宽上限（单位：MB）
     */
    public void setBandwidth(Integer Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 获取最近一次操作变更的EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     * @return LatestPayMode 最近一次操作变更的EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     */
    public String getLatestPayMode() {
        return this.LatestPayMode;
    }

    /**
     * 设置最近一次操作变更的EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     * @param LatestPayMode 最近一次操作变更的EIP计费模式，"flow"：流量计费； "bandwidth"：带宽计费
     */
    public void setLatestPayMode(String LatestPayMode) {
        this.LatestPayMode = LatestPayMode;
    }

    /**
     * 获取最近一次操作变更的EIP计费模式对应的带宽上限值，仅在带宽计费模式下有效（单位：MB）
     * @return LatestBandwidth 最近一次操作变更的EIP计费模式对应的带宽上限值，仅在带宽计费模式下有效（单位：MB）
     */
    public Integer getLatestBandwidth() {
        return this.LatestBandwidth;
    }

    /**
     * 设置最近一次操作变更的EIP计费模式对应的带宽上限值，仅在带宽计费模式下有效（单位：MB）
     * @param LatestBandwidth 最近一次操作变更的EIP计费模式对应的带宽上限值，仅在带宽计费模式下有效（单位：MB）
     */
    public void setLatestBandwidth(Integer LatestBandwidth) {
        this.LatestBandwidth = LatestBandwidth;
    }

    /**
     * 获取私有网络名称
     * @return VpcName 私有网络名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置私有网络名称
     * @param VpcName 私有网络名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取EIP所绑定的NAT网关的数字ID，形如：1001,，未绑定则为空
     * @return NatId EIP所绑定的NAT网关的数字ID，形如：1001,，未绑定则为空
     */
    public Integer getNatId() {
        return this.NatId;
    }

    /**
     * 设置EIP所绑定的NAT网关的数字ID，形如：1001,，未绑定则为空
     * @param NatId EIP所绑定的NAT网关的数字ID，形如：1001,，未绑定则为空
     */
    public void setNatId(Integer NatId) {
        this.NatId = NatId;
    }

    /**
     * 获取EIP所绑定的NAT网关实例ID，形如："nat-n47xxxxx"，未绑定则为空
     * @return NatUid EIP所绑定的NAT网关实例ID，形如："nat-n47xxxxx"，未绑定则为空
     */
    public String getNatUid() {
        return this.NatUid;
    }

    /**
     * 设置EIP所绑定的NAT网关实例ID，形如："nat-n47xxxxx"，未绑定则为空
     * @param NatUid EIP所绑定的NAT网关实例ID，形如："nat-n47xxxxx"，未绑定则为空
     */
    public void setNatUid(String NatUid) {
        this.NatUid = NatUid;
    }

    /**
     * 获取EIP所绑定的云服务器IP(托管或者云服务器的IP），形如："10.1.1.3"。 注意：IP资源需要通过bmvpc模块注册或者申请后才可以绑定eip，接口使用申请子网IP和注册子网IP：,未绑定则为空
     * @return VpcIp EIP所绑定的云服务器IP(托管或者云服务器的IP），形如："10.1.1.3"。 注意：IP资源需要通过bmvpc模块注册或者申请后才可以绑定eip，接口使用申请子网IP和注册子网IP：,未绑定则为空
     */
    public String getVpcIp() {
        return this.VpcIp;
    }

    /**
     * 设置EIP所绑定的云服务器IP(托管或者云服务器的IP），形如："10.1.1.3"。 注意：IP资源需要通过bmvpc模块注册或者申请后才可以绑定eip，接口使用申请子网IP和注册子网IP：,未绑定则为空
     * @param VpcIp EIP所绑定的云服务器IP(托管或者云服务器的IP），形如："10.1.1.3"。 注意：IP资源需要通过bmvpc模块注册或者申请后才可以绑定eip，接口使用申请子网IP和注册子网IP：,未绑定则为空
     */
    public void setVpcIp(String VpcIp) {
        this.VpcIp = VpcIp;
    }

    /**
     * 获取私有网络实例ID
     * @return VpcId 私有网络实例ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络实例ID
     * @param VpcId 私有网络实例ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取是否为独占类型EIP
     * @return Exclusive 是否为独占类型EIP
     */
    public Integer getExclusive() {
        return this.Exclusive;
    }

    /**
     * 设置是否为独占类型EIP
     * @param Exclusive 是否为独占类型EIP
     */
    public void setExclusive(Integer Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * 获取私有网络的cidr
     * @return VpcCidr 私有网络的cidr
     */
    public String getVpcCidr() {
        return this.VpcCidr;
    }

    /**
     * 设置私有网络的cidr
     * @param VpcCidr 私有网络的cidr
     */
    public void setVpcCidr(String VpcCidr) {
        this.VpcCidr = VpcCidr;
    }

    /**
     * 获取EIP ACL实例ID
     * @return AclId EIP ACL实例ID
     */
    public String getAclId() {
        return this.AclId;
    }

    /**
     * 设置EIP ACL实例ID
     * @param AclId EIP ACL实例ID
     */
    public void setAclId(String AclId) {
        this.AclId = AclId;
    }

    /**
     * 获取EIP ACL名称
     * @return AclName EIP ACL名称
     */
    public String getAclName() {
        return this.AclName;
    }

    /**
     * 设置EIP ACL名称
     * @param AclName EIP ACL名称
     */
    public void setAclName(String AclName) {
        this.AclName = AclName;
    }

    /**
     * 获取托管机器实例ID
     * @return HInstanceId 托管机器实例ID
     */
    public String getHInstanceId() {
        return this.HInstanceId;
    }

    /**
     * 设置托管机器实例ID
     * @param HInstanceId 托管机器实例ID
     */
    public void setHInstanceId(String HInstanceId) {
        this.HInstanceId = HInstanceId;
    }

    /**
     * 获取托管机器别名
     * @return HInstanceAlias 托管机器别名
     */
    public String getHInstanceAlias() {
        return this.HInstanceAlias;
    }

    /**
     * 设置托管机器别名
     * @param HInstanceAlias 托管机器别名
     */
    public void setHInstanceAlias(String HInstanceAlias) {
        this.HInstanceAlias = HInstanceAlias;
    }

    /**
     * 内部实现，用户禁止调用
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

