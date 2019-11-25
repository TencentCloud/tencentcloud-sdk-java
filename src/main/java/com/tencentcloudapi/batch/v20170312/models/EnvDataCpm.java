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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvDataCpm  extends AbstractModel{

    /**
    * 黑石可用区名称列表。如ap-guangzhou-bls-1, 可通过黑石接口[DescribeRegions]( https://cloud.tencent.com/document/api/386/33564)接口获取。不是Batch可用区名称。目前仅支持一个可用区名称。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 购买的机型ID。通过黑石接口[DescribeDeviceClass]( https://cloud.tencent.com/document/api/386/32911)查询设备型号，获取机型信息。
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * 购买时长单位，取值：m(月)。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 购买时长。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Integer TimeSpan;

    /**
    * RAID类型ID。通过黑石接口[DescribeDeviceClassPartition]( https://cloud.tencent.com/document/api/386/32910)查询机型RAID方式以及系统盘大小，获取RAID信息。
    */
    @SerializedName("RaidId")
    @Expose
    private Integer RaidId;

    /**
    * 部署服务器的操作系统ID。通过黑石接口[DescribeOsInfo]( https://cloud.tencent.com/document/product/386/32902)查询操作系统信息。
    */
    @SerializedName("OsTypeId")
    @Expose
    private Integer OsTypeId;

    /**
    * 黑石VPC列表，目前仅支持一个VPC。
    */
    @SerializedName("VirtualPrivateClouds")
    @Expose
    private CpmVirtualPrivateCloud [] VirtualPrivateClouds;

    /**
    * 是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0。
    */
    @SerializedName("NeedSecurityAgent")
    @Expose
    private Integer NeedSecurityAgent;

    /**
    * 是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0。
    */
    @SerializedName("NeedMonitorAgent")
    @Expose
    private Integer NeedMonitorAgent;

    /**
    * 自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Integer AutoRenewFlag;

    /**
    * 数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1。
    */
    @SerializedName("IsZoning")
    @Expose
    private Integer IsZoning;

    /**
    * 指定数据盘的文件系统格式，当前支持 ext4和xfs选项， 默认为ext4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效。
    */
    @SerializedName("FileSystem")
    @Expose
    private String FileSystem;

    /**
    * 设置Linux root或Windows Administrator的密码。若不设置此参数，默认情况下会随机生成密码，并以站内信方式通知到用户。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0。
    */
    @SerializedName("ApplyEip")
    @Expose
    private Integer ApplyEip;

    /**
    * 弹性公网IP计费模式，取值：flow(按流量计费) bandwidth(按带宽计费)，默认取值flow。
    */
    @SerializedName("EipPayMode")
    @Expose
    private String EipPayMode;

    /**
    * 弹性公网IP带宽限制，单位Mb。
    */
    @SerializedName("EipBandwidth")
    @Expose
    private Integer EipBandwidth;

    /**
    * 自定义镜像ID，取值生效时用自定义镜像部署物理机。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 系统盘根分区大小，单位为G，默认取值10G。通过黑石接口[DescribeDeviceClassPartition]( https://cloud.tencent.com/document/api/386/32910)查询机型RAID方式以及系统盘大小，获取根分区信息。
    */
    @SerializedName("SysRootSpace")
    @Expose
    private Integer SysRootSpace;

    /**
    * /data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）。
    */
    @SerializedName("SysDataSpace")
    @Expose
    private Integer SysDataSpace;

    /**
    * 是否开启超线程，取值：1(开启) 0(关闭)，默认取值1。
    */
    @SerializedName("HyperThreading")
    @Expose
    private Integer HyperThreading;

    /**
    * 指定的内网IP列表，不指定时自动分配。
    */
    @SerializedName("LanIps")
    @Expose
    private String [] LanIps;

    /**
     * 获取黑石可用区名称列表。如ap-guangzhou-bls-1, 可通过黑石接口[DescribeRegions]( https://cloud.tencent.com/document/api/386/33564)接口获取。不是Batch可用区名称。目前仅支持一个可用区名称。
     * @return Zones 黑石可用区名称列表。如ap-guangzhou-bls-1, 可通过黑石接口[DescribeRegions]( https://cloud.tencent.com/document/api/386/33564)接口获取。不是Batch可用区名称。目前仅支持一个可用区名称。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * 设置黑石可用区名称列表。如ap-guangzhou-bls-1, 可通过黑石接口[DescribeRegions]( https://cloud.tencent.com/document/api/386/33564)接口获取。不是Batch可用区名称。目前仅支持一个可用区名称。
     * @param Zones 黑石可用区名称列表。如ap-guangzhou-bls-1, 可通过黑石接口[DescribeRegions]( https://cloud.tencent.com/document/api/386/33564)接口获取。不是Batch可用区名称。目前仅支持一个可用区名称。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * 获取购买的机型ID。通过黑石接口[DescribeDeviceClass]( https://cloud.tencent.com/document/api/386/32911)查询设备型号，获取机型信息。
     * @return InstanceTypes 购买的机型ID。通过黑石接口[DescribeDeviceClass]( https://cloud.tencent.com/document/api/386/32911)查询设备型号，获取机型信息。
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * 设置购买的机型ID。通过黑石接口[DescribeDeviceClass]( https://cloud.tencent.com/document/api/386/32911)查询设备型号，获取机型信息。
     * @param InstanceTypes 购买的机型ID。通过黑石接口[DescribeDeviceClass]( https://cloud.tencent.com/document/api/386/32911)查询设备型号，获取机型信息。
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * 获取购买时长单位，取值：m(月)。
     * @return TimeUnit 购买时长单位，取值：m(月)。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * 设置购买时长单位，取值：m(月)。
     * @param TimeUnit 购买时长单位，取值：m(月)。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * 获取购买时长。
     * @return TimeSpan 购买时长。
     */
    public Integer getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * 设置购买时长。
     * @param TimeSpan 购买时长。
     */
    public void setTimeSpan(Integer TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * 获取RAID类型ID。通过黑石接口[DescribeDeviceClassPartition]( https://cloud.tencent.com/document/api/386/32910)查询机型RAID方式以及系统盘大小，获取RAID信息。
     * @return RaidId RAID类型ID。通过黑石接口[DescribeDeviceClassPartition]( https://cloud.tencent.com/document/api/386/32910)查询机型RAID方式以及系统盘大小，获取RAID信息。
     */
    public Integer getRaidId() {
        return this.RaidId;
    }

    /**
     * 设置RAID类型ID。通过黑石接口[DescribeDeviceClassPartition]( https://cloud.tencent.com/document/api/386/32910)查询机型RAID方式以及系统盘大小，获取RAID信息。
     * @param RaidId RAID类型ID。通过黑石接口[DescribeDeviceClassPartition]( https://cloud.tencent.com/document/api/386/32910)查询机型RAID方式以及系统盘大小，获取RAID信息。
     */
    public void setRaidId(Integer RaidId) {
        this.RaidId = RaidId;
    }

    /**
     * 获取部署服务器的操作系统ID。通过黑石接口[DescribeOsInfo]( https://cloud.tencent.com/document/product/386/32902)查询操作系统信息。
     * @return OsTypeId 部署服务器的操作系统ID。通过黑石接口[DescribeOsInfo]( https://cloud.tencent.com/document/product/386/32902)查询操作系统信息。
     */
    public Integer getOsTypeId() {
        return this.OsTypeId;
    }

    /**
     * 设置部署服务器的操作系统ID。通过黑石接口[DescribeOsInfo]( https://cloud.tencent.com/document/product/386/32902)查询操作系统信息。
     * @param OsTypeId 部署服务器的操作系统ID。通过黑石接口[DescribeOsInfo]( https://cloud.tencent.com/document/product/386/32902)查询操作系统信息。
     */
    public void setOsTypeId(Integer OsTypeId) {
        this.OsTypeId = OsTypeId;
    }

    /**
     * 获取黑石VPC列表，目前仅支持一个VPC。
     * @return VirtualPrivateClouds 黑石VPC列表，目前仅支持一个VPC。
     */
    public CpmVirtualPrivateCloud [] getVirtualPrivateClouds() {
        return this.VirtualPrivateClouds;
    }

    /**
     * 设置黑石VPC列表，目前仅支持一个VPC。
     * @param VirtualPrivateClouds 黑石VPC列表，目前仅支持一个VPC。
     */
    public void setVirtualPrivateClouds(CpmVirtualPrivateCloud [] VirtualPrivateClouds) {
        this.VirtualPrivateClouds = VirtualPrivateClouds;
    }

    /**
     * 获取是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0。
     * @return NeedSecurityAgent 是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0。
     */
    public Integer getNeedSecurityAgent() {
        return this.NeedSecurityAgent;
    }

    /**
     * 设置是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0。
     * @param NeedSecurityAgent 是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0。
     */
    public void setNeedSecurityAgent(Integer NeedSecurityAgent) {
        this.NeedSecurityAgent = NeedSecurityAgent;
    }

    /**
     * 获取是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0。
     * @return NeedMonitorAgent 是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0。
     */
    public Integer getNeedMonitorAgent() {
        return this.NeedMonitorAgent;
    }

    /**
     * 设置是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0。
     * @param NeedMonitorAgent 是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0。
     */
    public void setNeedMonitorAgent(Integer NeedMonitorAgent) {
        this.NeedMonitorAgent = NeedMonitorAgent;
    }

    /**
     * 获取自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0。
     * @return AutoRenewFlag 自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0。
     */
    public Integer getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * 设置自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0。
     * @param AutoRenewFlag 自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0。
     */
    public void setAutoRenewFlag(Integer AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * 获取数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1。
     * @return IsZoning 数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1。
     */
    public Integer getIsZoning() {
        return this.IsZoning;
    }

    /**
     * 设置数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1。
     * @param IsZoning 数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1。
     */
    public void setIsZoning(Integer IsZoning) {
        this.IsZoning = IsZoning;
    }

    /**
     * 获取指定数据盘的文件系统格式，当前支持 ext4和xfs选项， 默认为ext4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效。
     * @return FileSystem 指定数据盘的文件系统格式，当前支持 ext4和xfs选项， 默认为ext4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效。
     */
    public String getFileSystem() {
        return this.FileSystem;
    }

    /**
     * 设置指定数据盘的文件系统格式，当前支持 ext4和xfs选项， 默认为ext4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效。
     * @param FileSystem 指定数据盘的文件系统格式，当前支持 ext4和xfs选项， 默认为ext4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效。
     */
    public void setFileSystem(String FileSystem) {
        this.FileSystem = FileSystem;
    }

    /**
     * 获取设置Linux root或Windows Administrator的密码。若不设置此参数，默认情况下会随机生成密码，并以站内信方式通知到用户。
     * @return Password 设置Linux root或Windows Administrator的密码。若不设置此参数，默认情况下会随机生成密码，并以站内信方式通知到用户。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置设置Linux root或Windows Administrator的密码。若不设置此参数，默认情况下会随机生成密码，并以站内信方式通知到用户。
     * @param Password 设置Linux root或Windows Administrator的密码。若不设置此参数，默认情况下会随机生成密码，并以站内信方式通知到用户。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0。
     * @return ApplyEip 是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0。
     */
    public Integer getApplyEip() {
        return this.ApplyEip;
    }

    /**
     * 设置是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0。
     * @param ApplyEip 是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0。
     */
    public void setApplyEip(Integer ApplyEip) {
        this.ApplyEip = ApplyEip;
    }

    /**
     * 获取弹性公网IP计费模式，取值：flow(按流量计费) bandwidth(按带宽计费)，默认取值flow。
     * @return EipPayMode 弹性公网IP计费模式，取值：flow(按流量计费) bandwidth(按带宽计费)，默认取值flow。
     */
    public String getEipPayMode() {
        return this.EipPayMode;
    }

    /**
     * 设置弹性公网IP计费模式，取值：flow(按流量计费) bandwidth(按带宽计费)，默认取值flow。
     * @param EipPayMode 弹性公网IP计费模式，取值：flow(按流量计费) bandwidth(按带宽计费)，默认取值flow。
     */
    public void setEipPayMode(String EipPayMode) {
        this.EipPayMode = EipPayMode;
    }

    /**
     * 获取弹性公网IP带宽限制，单位Mb。
     * @return EipBandwidth 弹性公网IP带宽限制，单位Mb。
     */
    public Integer getEipBandwidth() {
        return this.EipBandwidth;
    }

    /**
     * 设置弹性公网IP带宽限制，单位Mb。
     * @param EipBandwidth 弹性公网IP带宽限制，单位Mb。
     */
    public void setEipBandwidth(Integer EipBandwidth) {
        this.EipBandwidth = EipBandwidth;
    }

    /**
     * 获取自定义镜像ID，取值生效时用自定义镜像部署物理机。
     * @return ImageId 自定义镜像ID，取值生效时用自定义镜像部署物理机。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * 设置自定义镜像ID，取值生效时用自定义镜像部署物理机。
     * @param ImageId 自定义镜像ID，取值生效时用自定义镜像部署物理机。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * 获取系统盘根分区大小，单位为G，默认取值10G。通过黑石接口[DescribeDeviceClassPartition]( https://cloud.tencent.com/document/api/386/32910)查询机型RAID方式以及系统盘大小，获取根分区信息。
     * @return SysRootSpace 系统盘根分区大小，单位为G，默认取值10G。通过黑石接口[DescribeDeviceClassPartition]( https://cloud.tencent.com/document/api/386/32910)查询机型RAID方式以及系统盘大小，获取根分区信息。
     */
    public Integer getSysRootSpace() {
        return this.SysRootSpace;
    }

    /**
     * 设置系统盘根分区大小，单位为G，默认取值10G。通过黑石接口[DescribeDeviceClassPartition]( https://cloud.tencent.com/document/api/386/32910)查询机型RAID方式以及系统盘大小，获取根分区信息。
     * @param SysRootSpace 系统盘根分区大小，单位为G，默认取值10G。通过黑石接口[DescribeDeviceClassPartition]( https://cloud.tencent.com/document/api/386/32910)查询机型RAID方式以及系统盘大小，获取根分区信息。
     */
    public void setSysRootSpace(Integer SysRootSpace) {
        this.SysRootSpace = SysRootSpace;
    }

    /**
     * 获取/data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）。
     * @return SysDataSpace /data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）。
     */
    public Integer getSysDataSpace() {
        return this.SysDataSpace;
    }

    /**
     * 设置/data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）。
     * @param SysDataSpace /data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）。
     */
    public void setSysDataSpace(Integer SysDataSpace) {
        this.SysDataSpace = SysDataSpace;
    }

    /**
     * 获取是否开启超线程，取值：1(开启) 0(关闭)，默认取值1。
     * @return HyperThreading 是否开启超线程，取值：1(开启) 0(关闭)，默认取值1。
     */
    public Integer getHyperThreading() {
        return this.HyperThreading;
    }

    /**
     * 设置是否开启超线程，取值：1(开启) 0(关闭)，默认取值1。
     * @param HyperThreading 是否开启超线程，取值：1(开启) 0(关闭)，默认取值1。
     */
    public void setHyperThreading(Integer HyperThreading) {
        this.HyperThreading = HyperThreading;
    }

    /**
     * 获取指定的内网IP列表，不指定时自动分配。
     * @return LanIps 指定的内网IP列表，不指定时自动分配。
     */
    public String [] getLanIps() {
        return this.LanIps;
    }

    /**
     * 设置指定的内网IP列表，不指定时自动分配。
     * @param LanIps 指定的内网IP列表，不指定时自动分配。
     */
    public void setLanIps(String [] LanIps) {
        this.LanIps = LanIps;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "RaidId", this.RaidId);
        this.setParamSimple(map, prefix + "OsTypeId", this.OsTypeId);
        this.setParamArrayObj(map, prefix + "VirtualPrivateClouds.", this.VirtualPrivateClouds);
        this.setParamSimple(map, prefix + "NeedSecurityAgent", this.NeedSecurityAgent);
        this.setParamSimple(map, prefix + "NeedMonitorAgent", this.NeedMonitorAgent);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "IsZoning", this.IsZoning);
        this.setParamSimple(map, prefix + "FileSystem", this.FileSystem);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ApplyEip", this.ApplyEip);
        this.setParamSimple(map, prefix + "EipPayMode", this.EipPayMode);
        this.setParamSimple(map, prefix + "EipBandwidth", this.EipBandwidth);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "SysRootSpace", this.SysRootSpace);
        this.setParamSimple(map, prefix + "SysDataSpace", this.SysDataSpace);
        this.setParamSimple(map, prefix + "HyperThreading", this.HyperThreading);
        this.setParamArraySimple(map, prefix + "LanIps.", this.LanIps);

    }
}

