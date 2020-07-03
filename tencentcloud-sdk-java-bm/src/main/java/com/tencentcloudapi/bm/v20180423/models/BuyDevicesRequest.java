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

public class BuyDevicesRequest extends AbstractModel{

    /**
    * 可用区ID。通过接口[查询地域以及可用区(DescribeRegions)](https://cloud.tencent.com/document/api/386/33564)获取可用区信息
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 部署服务器的操作系统ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/product/386/32902)获取操作系统信息
    */
    @SerializedName("OsTypeId")
    @Expose
    private Long OsTypeId;

    /**
    * RAID类型ID。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取RAID信息
    */
    @SerializedName("RaidId")
    @Expose
    private Long RaidId;

    /**
    * 购买数量
    */
    @SerializedName("GoodsCount")
    @Expose
    private Long GoodsCount;

    /**
    * 购买至私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 购买至子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 购买的机型ID。通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)获取机型信息
    */
    @SerializedName("DeviceClassCode")
    @Expose
    private String DeviceClassCode;

    /**
    * 购买时长单位，取值：M(月) D(天)
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 购买时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0
    */
    @SerializedName("NeedSecurityAgent")
    @Expose
    private Long NeedSecurityAgent;

    /**
    * 是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0
    */
    @SerializedName("NeedMonitorAgent")
    @Expose
    private Long NeedMonitorAgent;

    /**
    * 是否安装EMR Agent，取值：1(安装) 0(不安装)，默认取值0
    */
    @SerializedName("NeedEMRAgent")
    @Expose
    private Long NeedEMRAgent;

    /**
    * 是否安装EMR软件包，取值：1(安装) 0(不安装)，默认取值0
    */
    @SerializedName("NeedEMRSoftware")
    @Expose
    private Long NeedEMRSoftware;

    /**
    * 是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0
    */
    @SerializedName("ApplyEip")
    @Expose
    private Long ApplyEip;

    /**
    * 弹性公网IP计费模式，取值：Flow(按流量计费) Bandwidth(按带宽计费)，默认取值Flow
    */
    @SerializedName("EipPayMode")
    @Expose
    private String EipPayMode;

    /**
    * 弹性公网IP带宽限制，单位Mb
    */
    @SerializedName("EipBandwidth")
    @Expose
    private Long EipBandwidth;

    /**
    * 数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1
    */
    @SerializedName("IsZoning")
    @Expose
    private Long IsZoning;

    /**
    * 物理机计费模式，取值：1(预付费) 2(后付费)，默认取值为1
    */
    @SerializedName("CpmPayMode")
    @Expose
    private Long CpmPayMode;

    /**
    * 自定义镜像ID，取值生效时用自定义镜像部署物理机
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 设置Linux root或Windows Administrator的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 系统盘根分区大小，单位为G，默认取值10G。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取根分区信息
    */
    @SerializedName("SysRootSpace")
    @Expose
    private Long SysRootSpace;

    /**
    * 系统盘swap分区或/boot/efi分区的大小，单位为G。若是uefi启动的机器，分区为/boot/efi，且此值是默认是2G。 普通机器为swap分区，可以不指定此分区。 机型是否是uefi启动，参见接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
    */
    @SerializedName("SysSwaporuefiSpace")
    @Expose
    private Long SysSwaporuefiSpace;

    /**
    * /usr/local分区大小，单位为G
    */
    @SerializedName("SysUsrlocalSpace")
    @Expose
    private Long SysUsrlocalSpace;

    /**
    * /data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）
    */
    @SerializedName("SysDataSpace")
    @Expose
    private Long SysDataSpace;

    /**
    * 是否开启超线程，取值：1(开启) 0(关闭)，默认取值1
    */
    @SerializedName("HyperThreading")
    @Expose
    private Long HyperThreading;

    /**
    * 指定的内网IP列表，不指定时自动分配
    */
    @SerializedName("LanIps")
    @Expose
    private String [] LanIps;

    /**
    * 设备名称列表
    */
    @SerializedName("Aliases")
    @Expose
    private String [] Aliases;

    /**
    * CPU型号ID，自定义机型需要传入，取值：
<br/><li>1: E5-2620v3 (6核) &#42; 2</li><li>2: E5-2680v4 (14核) &#42; 2</li><li>3: E5-2670v3 (12核) &#42; 2</li><li>4: E5-2620v4 (8核) &#42; 2</li><li>5: 4110 (8核) &#42; 2</li><li>6: 6133 (20核) &#42; 2</li><br/>
    */
    @SerializedName("CpuId")
    @Expose
    private Long CpuId;

    /**
    * 是否有RAID卡，取值：1(有) 0(无)，自定义机型需要传入
    */
    @SerializedName("ContainRaidCard")
    @Expose
    private Long ContainRaidCard;

    /**
    * 内存大小，单位为G，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 系统盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
    */
    @SerializedName("SystemDiskTypeId")
    @Expose
    private Long SystemDiskTypeId;

    /**
    * 系统盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
    */
    @SerializedName("SystemDiskCount")
    @Expose
    private Long SystemDiskCount;

    /**
    * 数据盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
    */
    @SerializedName("DataDiskTypeId")
    @Expose
    private Long DataDiskTypeId;

    /**
    * 数据盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
    */
    @SerializedName("DataDiskCount")
    @Expose
    private Long DataDiskCount;

    /**
    * 绑定的标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 指定数据盘的文件系统格式，当前支持 EXT4和XFS选项， 默认为EXT4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效
    */
    @SerializedName("FileSystem")
    @Expose
    private String FileSystem;

    /**
    * 此参数是为了防止重复发货。如果两次调用传入相同的BuySession，只会发货一次。 不要以设备别名作为BuySession，这样只会第一次购买成功。参数长度为128位，合法字符为大小字母，数字，下划线，横线。
    */
    @SerializedName("BuySession")
    @Expose
    private String BuySession;

    /**
    * 绑定已有的安全组ID。仅在NeedSecurityAgent为1时生效
    */
    @SerializedName("SgId")
    @Expose
    private String SgId;

    /**
    * 安全组模板ID，由模板创建新安全组并绑定。TemplateId和SgId不能同时传入
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get 可用区ID。通过接口[查询地域以及可用区(DescribeRegions)](https://cloud.tencent.com/document/api/386/33564)获取可用区信息 
     * @return Zone 可用区ID。通过接口[查询地域以及可用区(DescribeRegions)](https://cloud.tencent.com/document/api/386/33564)获取可用区信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区ID。通过接口[查询地域以及可用区(DescribeRegions)](https://cloud.tencent.com/document/api/386/33564)获取可用区信息
     * @param Zone 可用区ID。通过接口[查询地域以及可用区(DescribeRegions)](https://cloud.tencent.com/document/api/386/33564)获取可用区信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 部署服务器的操作系统ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/product/386/32902)获取操作系统信息 
     * @return OsTypeId 部署服务器的操作系统ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/product/386/32902)获取操作系统信息
     */
    public Long getOsTypeId() {
        return this.OsTypeId;
    }

    /**
     * Set 部署服务器的操作系统ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/product/386/32902)获取操作系统信息
     * @param OsTypeId 部署服务器的操作系统ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/product/386/32902)获取操作系统信息
     */
    public void setOsTypeId(Long OsTypeId) {
        this.OsTypeId = OsTypeId;
    }

    /**
     * Get RAID类型ID。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取RAID信息 
     * @return RaidId RAID类型ID。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取RAID信息
     */
    public Long getRaidId() {
        return this.RaidId;
    }

    /**
     * Set RAID类型ID。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取RAID信息
     * @param RaidId RAID类型ID。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取RAID信息
     */
    public void setRaidId(Long RaidId) {
        this.RaidId = RaidId;
    }

    /**
     * Get 购买数量 
     * @return GoodsCount 购买数量
     */
    public Long getGoodsCount() {
        return this.GoodsCount;
    }

    /**
     * Set 购买数量
     * @param GoodsCount 购买数量
     */
    public void setGoodsCount(Long GoodsCount) {
        this.GoodsCount = GoodsCount;
    }

    /**
     * Get 购买至私有网络ID 
     * @return VpcId 购买至私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 购买至私有网络ID
     * @param VpcId 购买至私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 购买至子网ID 
     * @return SubnetId 购买至子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 购买至子网ID
     * @param SubnetId 购买至子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 购买的机型ID。通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)获取机型信息 
     * @return DeviceClassCode 购买的机型ID。通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)获取机型信息
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * Set 购买的机型ID。通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)获取机型信息
     * @param DeviceClassCode 购买的机型ID。通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)获取机型信息
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    /**
     * Get 购买时长单位，取值：M(月) D(天) 
     * @return TimeUnit 购买时长单位，取值：M(月) D(天)
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 购买时长单位，取值：M(月) D(天)
     * @param TimeUnit 购买时长单位，取值：M(月) D(天)
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 购买时长 
     * @return TimeSpan 购买时长
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长
     * @param TimeSpan 购买时长
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0 
     * @return NeedSecurityAgent 是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public Long getNeedSecurityAgent() {
        return this.NeedSecurityAgent;
    }

    /**
     * Set 是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0
     * @param NeedSecurityAgent 是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public void setNeedSecurityAgent(Long NeedSecurityAgent) {
        this.NeedSecurityAgent = NeedSecurityAgent;
    }

    /**
     * Get 是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0 
     * @return NeedMonitorAgent 是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public Long getNeedMonitorAgent() {
        return this.NeedMonitorAgent;
    }

    /**
     * Set 是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0
     * @param NeedMonitorAgent 是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public void setNeedMonitorAgent(Long NeedMonitorAgent) {
        this.NeedMonitorAgent = NeedMonitorAgent;
    }

    /**
     * Get 是否安装EMR Agent，取值：1(安装) 0(不安装)，默认取值0 
     * @return NeedEMRAgent 是否安装EMR Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public Long getNeedEMRAgent() {
        return this.NeedEMRAgent;
    }

    /**
     * Set 是否安装EMR Agent，取值：1(安装) 0(不安装)，默认取值0
     * @param NeedEMRAgent 是否安装EMR Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public void setNeedEMRAgent(Long NeedEMRAgent) {
        this.NeedEMRAgent = NeedEMRAgent;
    }

    /**
     * Get 是否安装EMR软件包，取值：1(安装) 0(不安装)，默认取值0 
     * @return NeedEMRSoftware 是否安装EMR软件包，取值：1(安装) 0(不安装)，默认取值0
     */
    public Long getNeedEMRSoftware() {
        return this.NeedEMRSoftware;
    }

    /**
     * Set 是否安装EMR软件包，取值：1(安装) 0(不安装)，默认取值0
     * @param NeedEMRSoftware 是否安装EMR软件包，取值：1(安装) 0(不安装)，默认取值0
     */
    public void setNeedEMRSoftware(Long NeedEMRSoftware) {
        this.NeedEMRSoftware = NeedEMRSoftware;
    }

    /**
     * Get 是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0 
     * @return ApplyEip 是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0
     */
    public Long getApplyEip() {
        return this.ApplyEip;
    }

    /**
     * Set 是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0
     * @param ApplyEip 是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0
     */
    public void setApplyEip(Long ApplyEip) {
        this.ApplyEip = ApplyEip;
    }

    /**
     * Get 弹性公网IP计费模式，取值：Flow(按流量计费) Bandwidth(按带宽计费)，默认取值Flow 
     * @return EipPayMode 弹性公网IP计费模式，取值：Flow(按流量计费) Bandwidth(按带宽计费)，默认取值Flow
     */
    public String getEipPayMode() {
        return this.EipPayMode;
    }

    /**
     * Set 弹性公网IP计费模式，取值：Flow(按流量计费) Bandwidth(按带宽计费)，默认取值Flow
     * @param EipPayMode 弹性公网IP计费模式，取值：Flow(按流量计费) Bandwidth(按带宽计费)，默认取值Flow
     */
    public void setEipPayMode(String EipPayMode) {
        this.EipPayMode = EipPayMode;
    }

    /**
     * Get 弹性公网IP带宽限制，单位Mb 
     * @return EipBandwidth 弹性公网IP带宽限制，单位Mb
     */
    public Long getEipBandwidth() {
        return this.EipBandwidth;
    }

    /**
     * Set 弹性公网IP带宽限制，单位Mb
     * @param EipBandwidth 弹性公网IP带宽限制，单位Mb
     */
    public void setEipBandwidth(Long EipBandwidth) {
        this.EipBandwidth = EipBandwidth;
    }

    /**
     * Get 数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1 
     * @return IsZoning 数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1
     */
    public Long getIsZoning() {
        return this.IsZoning;
    }

    /**
     * Set 数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1
     * @param IsZoning 数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1
     */
    public void setIsZoning(Long IsZoning) {
        this.IsZoning = IsZoning;
    }

    /**
     * Get 物理机计费模式，取值：1(预付费) 2(后付费)，默认取值为1 
     * @return CpmPayMode 物理机计费模式，取值：1(预付费) 2(后付费)，默认取值为1
     */
    public Long getCpmPayMode() {
        return this.CpmPayMode;
    }

    /**
     * Set 物理机计费模式，取值：1(预付费) 2(后付费)，默认取值为1
     * @param CpmPayMode 物理机计费模式，取值：1(预付费) 2(后付费)，默认取值为1
     */
    public void setCpmPayMode(Long CpmPayMode) {
        this.CpmPayMode = CpmPayMode;
    }

    /**
     * Get 自定义镜像ID，取值生效时用自定义镜像部署物理机 
     * @return ImageId 自定义镜像ID，取值生效时用自定义镜像部署物理机
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 自定义镜像ID，取值生效时用自定义镜像部署物理机
     * @param ImageId 自定义镜像ID，取值生效时用自定义镜像部署物理机
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 设置Linux root或Windows Administrator的密码 
     * @return Password 设置Linux root或Windows Administrator的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 设置Linux root或Windows Administrator的密码
     * @param Password 设置Linux root或Windows Administrator的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0 
     * @return AutoRenewFlag 自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0
     * @param AutoRenewFlag 自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 系统盘根分区大小，单位为G，默认取值10G。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取根分区信息 
     * @return SysRootSpace 系统盘根分区大小，单位为G，默认取值10G。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取根分区信息
     */
    public Long getSysRootSpace() {
        return this.SysRootSpace;
    }

    /**
     * Set 系统盘根分区大小，单位为G，默认取值10G。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取根分区信息
     * @param SysRootSpace 系统盘根分区大小，单位为G，默认取值10G。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取根分区信息
     */
    public void setSysRootSpace(Long SysRootSpace) {
        this.SysRootSpace = SysRootSpace;
    }

    /**
     * Get 系统盘swap分区或/boot/efi分区的大小，单位为G。若是uefi启动的机器，分区为/boot/efi，且此值是默认是2G。 普通机器为swap分区，可以不指定此分区。 机型是否是uefi启动，参见接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911) 
     * @return SysSwaporuefiSpace 系统盘swap分区或/boot/efi分区的大小，单位为G。若是uefi启动的机器，分区为/boot/efi，且此值是默认是2G。 普通机器为swap分区，可以不指定此分区。 机型是否是uefi启动，参见接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
     */
    public Long getSysSwaporuefiSpace() {
        return this.SysSwaporuefiSpace;
    }

    /**
     * Set 系统盘swap分区或/boot/efi分区的大小，单位为G。若是uefi启动的机器，分区为/boot/efi，且此值是默认是2G。 普通机器为swap分区，可以不指定此分区。 机型是否是uefi启动，参见接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
     * @param SysSwaporuefiSpace 系统盘swap分区或/boot/efi分区的大小，单位为G。若是uefi启动的机器，分区为/boot/efi，且此值是默认是2G。 普通机器为swap分区，可以不指定此分区。 机型是否是uefi启动，参见接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
     */
    public void setSysSwaporuefiSpace(Long SysSwaporuefiSpace) {
        this.SysSwaporuefiSpace = SysSwaporuefiSpace;
    }

    /**
     * Get /usr/local分区大小，单位为G 
     * @return SysUsrlocalSpace /usr/local分区大小，单位为G
     */
    public Long getSysUsrlocalSpace() {
        return this.SysUsrlocalSpace;
    }

    /**
     * Set /usr/local分区大小，单位为G
     * @param SysUsrlocalSpace /usr/local分区大小，单位为G
     */
    public void setSysUsrlocalSpace(Long SysUsrlocalSpace) {
        this.SysUsrlocalSpace = SysUsrlocalSpace;
    }

    /**
     * Get /data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区） 
     * @return SysDataSpace /data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）
     */
    public Long getSysDataSpace() {
        return this.SysDataSpace;
    }

    /**
     * Set /data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）
     * @param SysDataSpace /data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）
     */
    public void setSysDataSpace(Long SysDataSpace) {
        this.SysDataSpace = SysDataSpace;
    }

    /**
     * Get 是否开启超线程，取值：1(开启) 0(关闭)，默认取值1 
     * @return HyperThreading 是否开启超线程，取值：1(开启) 0(关闭)，默认取值1
     */
    public Long getHyperThreading() {
        return this.HyperThreading;
    }

    /**
     * Set 是否开启超线程，取值：1(开启) 0(关闭)，默认取值1
     * @param HyperThreading 是否开启超线程，取值：1(开启) 0(关闭)，默认取值1
     */
    public void setHyperThreading(Long HyperThreading) {
        this.HyperThreading = HyperThreading;
    }

    /**
     * Get 指定的内网IP列表，不指定时自动分配 
     * @return LanIps 指定的内网IP列表，不指定时自动分配
     */
    public String [] getLanIps() {
        return this.LanIps;
    }

    /**
     * Set 指定的内网IP列表，不指定时自动分配
     * @param LanIps 指定的内网IP列表，不指定时自动分配
     */
    public void setLanIps(String [] LanIps) {
        this.LanIps = LanIps;
    }

    /**
     * Get 设备名称列表 
     * @return Aliases 设备名称列表
     */
    public String [] getAliases() {
        return this.Aliases;
    }

    /**
     * Set 设备名称列表
     * @param Aliases 设备名称列表
     */
    public void setAliases(String [] Aliases) {
        this.Aliases = Aliases;
    }

    /**
     * Get CPU型号ID，自定义机型需要传入，取值：
<br/><li>1: E5-2620v3 (6核) &#42; 2</li><li>2: E5-2680v4 (14核) &#42; 2</li><li>3: E5-2670v3 (12核) &#42; 2</li><li>4: E5-2620v4 (8核) &#42; 2</li><li>5: 4110 (8核) &#42; 2</li><li>6: 6133 (20核) &#42; 2</li><br/> 
     * @return CpuId CPU型号ID，自定义机型需要传入，取值：
<br/><li>1: E5-2620v3 (6核) &#42; 2</li><li>2: E5-2680v4 (14核) &#42; 2</li><li>3: E5-2670v3 (12核) &#42; 2</li><li>4: E5-2620v4 (8核) &#42; 2</li><li>5: 4110 (8核) &#42; 2</li><li>6: 6133 (20核) &#42; 2</li><br/>
     */
    public Long getCpuId() {
        return this.CpuId;
    }

    /**
     * Set CPU型号ID，自定义机型需要传入，取值：
<br/><li>1: E5-2620v3 (6核) &#42; 2</li><li>2: E5-2680v4 (14核) &#42; 2</li><li>3: E5-2670v3 (12核) &#42; 2</li><li>4: E5-2620v4 (8核) &#42; 2</li><li>5: 4110 (8核) &#42; 2</li><li>6: 6133 (20核) &#42; 2</li><br/>
     * @param CpuId CPU型号ID，自定义机型需要传入，取值：
<br/><li>1: E5-2620v3 (6核) &#42; 2</li><li>2: E5-2680v4 (14核) &#42; 2</li><li>3: E5-2670v3 (12核) &#42; 2</li><li>4: E5-2620v4 (8核) &#42; 2</li><li>5: 4110 (8核) &#42; 2</li><li>6: 6133 (20核) &#42; 2</li><br/>
     */
    public void setCpuId(Long CpuId) {
        this.CpuId = CpuId;
    }

    /**
     * Get 是否有RAID卡，取值：1(有) 0(无)，自定义机型需要传入 
     * @return ContainRaidCard 是否有RAID卡，取值：1(有) 0(无)，自定义机型需要传入
     */
    public Long getContainRaidCard() {
        return this.ContainRaidCard;
    }

    /**
     * Set 是否有RAID卡，取值：1(有) 0(无)，自定义机型需要传入
     * @param ContainRaidCard 是否有RAID卡，取值：1(有) 0(无)，自定义机型需要传入
     */
    public void setContainRaidCard(Long ContainRaidCard) {
        this.ContainRaidCard = ContainRaidCard;
    }

    /**
     * Get 内存大小，单位为G，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值 
     * @return MemSize 内存大小，单位为G，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存大小，单位为G，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @param MemSize 内存大小，单位为G，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 系统盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值 
     * @return SystemDiskTypeId 系统盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public Long getSystemDiskTypeId() {
        return this.SystemDiskTypeId;
    }

    /**
     * Set 系统盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @param SystemDiskTypeId 系统盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public void setSystemDiskTypeId(Long SystemDiskTypeId) {
        this.SystemDiskTypeId = SystemDiskTypeId;
    }

    /**
     * Get 系统盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值 
     * @return SystemDiskCount 系统盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public Long getSystemDiskCount() {
        return this.SystemDiskCount;
    }

    /**
     * Set 系统盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @param SystemDiskCount 系统盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public void setSystemDiskCount(Long SystemDiskCount) {
        this.SystemDiskCount = SystemDiskCount;
    }

    /**
     * Get 数据盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值 
     * @return DataDiskTypeId 数据盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public Long getDataDiskTypeId() {
        return this.DataDiskTypeId;
    }

    /**
     * Set 数据盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @param DataDiskTypeId 数据盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public void setDataDiskTypeId(Long DataDiskTypeId) {
        this.DataDiskTypeId = DataDiskTypeId;
    }

    /**
     * Get 数据盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值 
     * @return DataDiskCount 数据盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public Long getDataDiskCount() {
        return this.DataDiskCount;
    }

    /**
     * Set 数据盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @param DataDiskCount 数据盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public void setDataDiskCount(Long DataDiskCount) {
        this.DataDiskCount = DataDiskCount;
    }

    /**
     * Get 绑定的标签列表 
     * @return Tags 绑定的标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 绑定的标签列表
     * @param Tags 绑定的标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 指定数据盘的文件系统格式，当前支持 EXT4和XFS选项， 默认为EXT4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效 
     * @return FileSystem 指定数据盘的文件系统格式，当前支持 EXT4和XFS选项， 默认为EXT4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效
     */
    public String getFileSystem() {
        return this.FileSystem;
    }

    /**
     * Set 指定数据盘的文件系统格式，当前支持 EXT4和XFS选项， 默认为EXT4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效
     * @param FileSystem 指定数据盘的文件系统格式，当前支持 EXT4和XFS选项， 默认为EXT4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效
     */
    public void setFileSystem(String FileSystem) {
        this.FileSystem = FileSystem;
    }

    /**
     * Get 此参数是为了防止重复发货。如果两次调用传入相同的BuySession，只会发货一次。 不要以设备别名作为BuySession，这样只会第一次购买成功。参数长度为128位，合法字符为大小字母，数字，下划线，横线。 
     * @return BuySession 此参数是为了防止重复发货。如果两次调用传入相同的BuySession，只会发货一次。 不要以设备别名作为BuySession，这样只会第一次购买成功。参数长度为128位，合法字符为大小字母，数字，下划线，横线。
     */
    public String getBuySession() {
        return this.BuySession;
    }

    /**
     * Set 此参数是为了防止重复发货。如果两次调用传入相同的BuySession，只会发货一次。 不要以设备别名作为BuySession，这样只会第一次购买成功。参数长度为128位，合法字符为大小字母，数字，下划线，横线。
     * @param BuySession 此参数是为了防止重复发货。如果两次调用传入相同的BuySession，只会发货一次。 不要以设备别名作为BuySession，这样只会第一次购买成功。参数长度为128位，合法字符为大小字母，数字，下划线，横线。
     */
    public void setBuySession(String BuySession) {
        this.BuySession = BuySession;
    }

    /**
     * Get 绑定已有的安全组ID。仅在NeedSecurityAgent为1时生效 
     * @return SgId 绑定已有的安全组ID。仅在NeedSecurityAgent为1时生效
     */
    public String getSgId() {
        return this.SgId;
    }

    /**
     * Set 绑定已有的安全组ID。仅在NeedSecurityAgent为1时生效
     * @param SgId 绑定已有的安全组ID。仅在NeedSecurityAgent为1时生效
     */
    public void setSgId(String SgId) {
        this.SgId = SgId;
    }

    /**
     * Get 安全组模板ID，由模板创建新安全组并绑定。TemplateId和SgId不能同时传入 
     * @return TemplateId 安全组模板ID，由模板创建新安全组并绑定。TemplateId和SgId不能同时传入
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 安全组模板ID，由模板创建新安全组并绑定。TemplateId和SgId不能同时传入
     * @param TemplateId 安全组模板ID，由模板创建新安全组并绑定。TemplateId和SgId不能同时传入
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "OsTypeId", this.OsTypeId);
        this.setParamSimple(map, prefix + "RaidId", this.RaidId);
        this.setParamSimple(map, prefix + "GoodsCount", this.GoodsCount);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DeviceClassCode", this.DeviceClassCode);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "NeedSecurityAgent", this.NeedSecurityAgent);
        this.setParamSimple(map, prefix + "NeedMonitorAgent", this.NeedMonitorAgent);
        this.setParamSimple(map, prefix + "NeedEMRAgent", this.NeedEMRAgent);
        this.setParamSimple(map, prefix + "NeedEMRSoftware", this.NeedEMRSoftware);
        this.setParamSimple(map, prefix + "ApplyEip", this.ApplyEip);
        this.setParamSimple(map, prefix + "EipPayMode", this.EipPayMode);
        this.setParamSimple(map, prefix + "EipBandwidth", this.EipBandwidth);
        this.setParamSimple(map, prefix + "IsZoning", this.IsZoning);
        this.setParamSimple(map, prefix + "CpmPayMode", this.CpmPayMode);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "SysRootSpace", this.SysRootSpace);
        this.setParamSimple(map, prefix + "SysSwaporuefiSpace", this.SysSwaporuefiSpace);
        this.setParamSimple(map, prefix + "SysUsrlocalSpace", this.SysUsrlocalSpace);
        this.setParamSimple(map, prefix + "SysDataSpace", this.SysDataSpace);
        this.setParamSimple(map, prefix + "HyperThreading", this.HyperThreading);
        this.setParamArraySimple(map, prefix + "LanIps.", this.LanIps);
        this.setParamArraySimple(map, prefix + "Aliases.", this.Aliases);
        this.setParamSimple(map, prefix + "CpuId", this.CpuId);
        this.setParamSimple(map, prefix + "ContainRaidCard", this.ContainRaidCard);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "SystemDiskTypeId", this.SystemDiskTypeId);
        this.setParamSimple(map, prefix + "SystemDiskCount", this.SystemDiskCount);
        this.setParamSimple(map, prefix + "DataDiskTypeId", this.DataDiskTypeId);
        this.setParamSimple(map, prefix + "DataDiskCount", this.DataDiskCount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "FileSystem", this.FileSystem);
        this.setParamSimple(map, prefix + "BuySession", this.BuySession);
        this.setParamSimple(map, prefix + "SgId", this.SgId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

