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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceInfo  extends AbstractModel{

    /**
    * 设备唯一ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 设备状态ID
    */
    @SerializedName("DeviceStatus")
    @Expose
    private Integer DeviceStatus;

    /**
    * 设备操作状态
    */
    @SerializedName("OperateStatus")
    @Expose
    private Integer OperateStatus;

    /**
    * 操作系统ID
    */
    @SerializedName("OsTypeId")
    @Expose
    private Integer OsTypeId;

    /**
    * RAID类型ID
    */
    @SerializedName("RaidId")
    @Expose
    private Integer RaidId;

    /**
    * 设备别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * AppId
    */
    @SerializedName("AppId")
    @Expose
    private Integer AppId;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 外网IP
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 内网IP
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 设备交付时间
    */
    @SerializedName("DeliverTime")
    @Expose
    private String DeliverTime;

    /**
    * 设备到期时间
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 自动续费标识。0: 不自动续费; 1:自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Integer AutoRenewFlag;

    /**
    * 设备类型
    */
    @SerializedName("DeviceClassCode")
    @Expose
    private String DeviceClassCode;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 计费模式。1: 预付费; 2: 后付费; 3:预付费转后付费中
    */
    @SerializedName("CpmPayMode")
    @Expose
    private Integer CpmPayMode;

    /**
    * 带外IP
    */
    @SerializedName("DhcpIp")
    @Expose
    private String DhcpIp;

    /**
    * 所在私有网络别名
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 所在子网别名
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 所在私有网络CIDR
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 所在子网CIDR
    */
    @SerializedName("SubnetCidrBlock")
    @Expose
    private String SubnetCidrBlock;

    /**
    * 标识是否是竞价实例。0: 普通设备; 1: 竞价实例设备
    */
    @SerializedName("IsLuckyDevice")
    @Expose
    private Integer IsLuckyDevice;

    /**
     * 获取设备唯一ID
     * @return InstanceId 设备唯一ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置设备唯一ID
     * @param InstanceId 设备唯一ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取私有网络ID
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网ID
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取设备状态ID
     * @return DeviceStatus 设备状态ID
     */
    public Integer getDeviceStatus() {
        return this.DeviceStatus;
    }

    /**
     * 设置设备状态ID
     * @param DeviceStatus 设备状态ID
     */
    public void setDeviceStatus(Integer DeviceStatus) {
        this.DeviceStatus = DeviceStatus;
    }

    /**
     * 获取设备操作状态
     * @return OperateStatus 设备操作状态
     */
    public Integer getOperateStatus() {
        return this.OperateStatus;
    }

    /**
     * 设置设备操作状态
     * @param OperateStatus 设备操作状态
     */
    public void setOperateStatus(Integer OperateStatus) {
        this.OperateStatus = OperateStatus;
    }

    /**
     * 获取操作系统ID
     * @return OsTypeId 操作系统ID
     */
    public Integer getOsTypeId() {
        return this.OsTypeId;
    }

    /**
     * 设置操作系统ID
     * @param OsTypeId 操作系统ID
     */
    public void setOsTypeId(Integer OsTypeId) {
        this.OsTypeId = OsTypeId;
    }

    /**
     * 获取RAID类型ID
     * @return RaidId RAID类型ID
     */
    public Integer getRaidId() {
        return this.RaidId;
    }

    /**
     * 设置RAID类型ID
     * @param RaidId RAID类型ID
     */
    public void setRaidId(Integer RaidId) {
        this.RaidId = RaidId;
    }

    /**
     * 获取设备别名
     * @return Alias 设备别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * 设置设备别名
     * @param Alias 设备别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * 获取AppId
     * @return AppId AppId
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置AppId
     * @param AppId AppId
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取可用区
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取外网IP
     * @return WanIp 外网IP
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * 设置外网IP
     * @param WanIp 外网IP
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * 获取内网IP
     * @return LanIp 内网IP
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * 设置内网IP
     * @param LanIp 内网IP
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * 获取设备交付时间
     * @return DeliverTime 设备交付时间
     */
    public String getDeliverTime() {
        return this.DeliverTime;
    }

    /**
     * 设置设备交付时间
     * @param DeliverTime 设备交付时间
     */
    public void setDeliverTime(String DeliverTime) {
        this.DeliverTime = DeliverTime;
    }

    /**
     * 获取设备到期时间
     * @return Deadline 设备到期时间
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * 设置设备到期时间
     * @param Deadline 设备到期时间
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * 获取自动续费标识。0: 不自动续费; 1:自动续费
     * @return AutoRenewFlag 自动续费标识。0: 不自动续费; 1:自动续费
     */
    public Integer getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * 设置自动续费标识。0: 不自动续费; 1:自动续费
     * @param AutoRenewFlag 自动续费标识。0: 不自动续费; 1:自动续费
     */
    public void setAutoRenewFlag(Integer AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * 获取设备类型
     * @return DeviceClassCode 设备类型
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * 设置设备类型
     * @param DeviceClassCode 设备类型
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    /**
     * 获取标签列表
     * @return Tags 标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * 设置标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取计费模式。1: 预付费; 2: 后付费; 3:预付费转后付费中
     * @return CpmPayMode 计费模式。1: 预付费; 2: 后付费; 3:预付费转后付费中
     */
    public Integer getCpmPayMode() {
        return this.CpmPayMode;
    }

    /**
     * 设置计费模式。1: 预付费; 2: 后付费; 3:预付费转后付费中
     * @param CpmPayMode 计费模式。1: 预付费; 2: 后付费; 3:预付费转后付费中
     */
    public void setCpmPayMode(Integer CpmPayMode) {
        this.CpmPayMode = CpmPayMode;
    }

    /**
     * 获取带外IP
     * @return DhcpIp 带外IP
     */
    public String getDhcpIp() {
        return this.DhcpIp;
    }

    /**
     * 设置带外IP
     * @param DhcpIp 带外IP
     */
    public void setDhcpIp(String DhcpIp) {
        this.DhcpIp = DhcpIp;
    }

    /**
     * 获取所在私有网络别名
     * @return VpcName 所在私有网络别名
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置所在私有网络别名
     * @param VpcName 所在私有网络别名
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取所在子网别名
     * @return SubnetName 所在子网别名
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * 设置所在子网别名
     * @param SubnetName 所在子网别名
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * 获取所在私有网络CIDR
     * @return VpcCidrBlock 所在私有网络CIDR
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * 设置所在私有网络CIDR
     * @param VpcCidrBlock 所在私有网络CIDR
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * 获取所在子网CIDR
     * @return SubnetCidrBlock 所在子网CIDR
     */
    public String getSubnetCidrBlock() {
        return this.SubnetCidrBlock;
    }

    /**
     * 设置所在子网CIDR
     * @param SubnetCidrBlock 所在子网CIDR
     */
    public void setSubnetCidrBlock(String SubnetCidrBlock) {
        this.SubnetCidrBlock = SubnetCidrBlock;
    }

    /**
     * 获取标识是否是竞价实例。0: 普通设备; 1: 竞价实例设备
     * @return IsLuckyDevice 标识是否是竞价实例。0: 普通设备; 1: 竞价实例设备
     */
    public Integer getIsLuckyDevice() {
        return this.IsLuckyDevice;
    }

    /**
     * 设置标识是否是竞价实例。0: 普通设备; 1: 竞价实例设备
     * @param IsLuckyDevice 标识是否是竞价实例。0: 普通设备; 1: 竞价实例设备
     */
    public void setIsLuckyDevice(Integer IsLuckyDevice) {
        this.IsLuckyDevice = IsLuckyDevice;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DeviceStatus", this.DeviceStatus);
        this.setParamSimple(map, prefix + "OperateStatus", this.OperateStatus);
        this.setParamSimple(map, prefix + "OsTypeId", this.OsTypeId);
        this.setParamSimple(map, prefix + "RaidId", this.RaidId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "DeliverTime", this.DeliverTime);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "DeviceClassCode", this.DeviceClassCode);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CpmPayMode", this.CpmPayMode);
        this.setParamSimple(map, prefix + "DhcpIp", this.DhcpIp);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "SubnetCidrBlock", this.SubnetCidrBlock);
        this.setParamSimple(map, prefix + "IsLuckyDevice", this.IsLuckyDevice);

    }
}

