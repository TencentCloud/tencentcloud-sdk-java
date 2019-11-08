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

public class BuyDevicesRequest  extends AbstractModel{

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
    private Integer OsTypeId;

    /**
    * RAID类型ID。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取RAID信息
    */
    @SerializedName("RaidId")
    @Expose
    private Integer RaidId;

    /**
    * 购买数量
    */
    @SerializedName("GoodsCount")
    @Expose
    private Integer GoodsCount;

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
    private Integer TimeSpan;

    /**
    * 是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0
    */
    @SerializedName("NeedSecurityAgent")
    @Expose
    private Integer NeedSecurityAgent;

    /**
    * 是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0
    */
    @SerializedName("NeedMonitorAgent")
    @Expose
    private Integer NeedMonitorAgent;

    /**
    * 是否安装EMR Agent，取值：1(安装) 0(不安装)，默认取值0
    */
    @SerializedName("NeedEMRAgent")
    @Expose
    private Integer NeedEMRAgent;

    /**
    * 是否安装EMR软件包，取值：1(安装) 0(不安装)，默认取值0
    */
    @SerializedName("NeedEMRSoftware")
    @Expose
    private Integer NeedEMRSoftware;

    /**
    * 是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0
    */
    @SerializedName("ApplyEip")
    @Expose
    private Integer ApplyEip;

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
    private Integer EipBandwidth;

    /**
    * 数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1
    */
    @SerializedName("IsZoning")
    @Expose
    private Integer IsZoning;

    /**
    * 物理机计费模式，取值：1(预付费) 2(后付费)，默认取值为1
    */
    @SerializedName("CpmPayMode")
    @Expose
    private Integer CpmPayMode;

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
    private Integer AutoRenewFlag;

    /**
    * 系统盘根分区大小，单位为G，默认取值10G。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取根分区信息
    */
    @SerializedName("SysRootSpace")
    @Expose
    private Integer SysRootSpace;

    /**
    * 系统盘swap分区或/boot/efi分区的大小，单位为G。若是uefi启动的机器，分区为/boot/efi，且此值是默认是2G。 普通机器为swap分区，可以不指定此分区。 机型是否是uefi启动，参见接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
    */
    @SerializedName("SysSwaporuefiSpace")
    @Expose
    private Integer SysSwaporuefiSpace;

    /**
    * /usr/local分区大小，单位为G
    */
    @SerializedName("SysUsrlocalSpace")
    @Expose
    private Integer SysUsrlocalSpace;

    /**
    * /data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）
    */
    @SerializedName("SysDataSpace")
    @Expose
    private Integer SysDataSpace;

    /**
    * 是否开启超线程，取值：1(开启) 0(关闭)，默认取值1
    */
    @SerializedName("HyperThreading")
    @Expose
    private Integer HyperThreading;

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
<br/><li>1: E5-2620v3 (6核) * 2</li><li>2: E5-2680v4 (14核) * 2</li><li>3: E5-2670v3 (12核) * 2</li><li>4: E5-2620v4 (8核) * 2</li><li>5: 4110 (8核) * 2</li><li>6: 6133 (20核) * 2</li><br/>
    */
    @SerializedName("CpuId")
    @Expose
    private Integer CpuId;

    /**
    * 是否有RAID卡，取值：1(有) 0(无)，自定义机型需要传入
    */
    @SerializedName("ContainRaidCard")
    @Expose
    private Integer ContainRaidCard;

    /**
    * 内存大小，单位为G，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
    */
    @SerializedName("MemSize")
    @Expose
    private Integer MemSize;

    /**
    * 系统盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
    */
    @SerializedName("SystemDiskTypeId")
    @Expose
    private Integer SystemDiskTypeId;

    /**
    * 系统盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
    */
    @SerializedName("SystemDiskCount")
    @Expose
    private Integer SystemDiskCount;

    /**
    * 数据盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
    */
    @SerializedName("DataDiskTypeId")
    @Expose
    private Integer DataDiskTypeId;

    /**
    * 数据盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
    */
    @SerializedName("DataDiskCount")
    @Expose
    private Integer DataDiskCount;

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
     * 获取可用区ID。通过接口[查询地域以及可用区(DescribeRegions)](https://cloud.tencent.com/document/api/386/33564)获取可用区信息
     * @return Zone 可用区ID。通过接口[查询地域以及可用区(DescribeRegions)](https://cloud.tencent.com/document/api/386/33564)获取可用区信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区ID。通过接口[查询地域以及可用区(DescribeRegions)](https://cloud.tencent.com/document/api/386/33564)获取可用区信息
     * @param Zone 可用区ID。通过接口[查询地域以及可用区(DescribeRegions)](https://cloud.tencent.com/document/api/386/33564)获取可用区信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取部署服务器的操作系统ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/product/386/32902)获取操作系统信息
     * @return OsTypeId 部署服务器的操作系统ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/product/386/32902)获取操作系统信息
     */
    public Integer getOsTypeId() {
        return this.OsTypeId;
    }

    /**
     * 设置部署服务器的操作系统ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/product/386/32902)获取操作系统信息
     * @param OsTypeId 部署服务器的操作系统ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/product/386/32902)获取操作系统信息
     */
    public void setOsTypeId(Integer OsTypeId) {
        this.OsTypeId = OsTypeId;
    }

    /**
     * 获取RAID类型ID。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取RAID信息
     * @return RaidId RAID类型ID。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取RAID信息
     */
    public Integer getRaidId() {
        return this.RaidId;
    }

    /**
     * 设置RAID类型ID。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取RAID信息
     * @param RaidId RAID类型ID。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取RAID信息
     */
    public void setRaidId(Integer RaidId) {
        this.RaidId = RaidId;
    }

    /**
     * 获取购买数量
     * @return GoodsCount 购买数量
     */
    public Integer getGoodsCount() {
        return this.GoodsCount;
    }

    /**
     * 设置购买数量
     * @param GoodsCount 购买数量
     */
    public void setGoodsCount(Integer GoodsCount) {
        this.GoodsCount = GoodsCount;
    }

    /**
     * 获取购买至私有网络ID
     * @return VpcId 购买至私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置购买至私有网络ID
     * @param VpcId 购买至私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取购买至子网ID
     * @return SubnetId 购买至子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置购买至子网ID
     * @param SubnetId 购买至子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取购买的机型ID。通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)获取机型信息
     * @return DeviceClassCode 购买的机型ID。通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)获取机型信息
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * 设置购买的机型ID。通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)获取机型信息
     * @param DeviceClassCode 购买的机型ID。通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)获取机型信息
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    /**
     * 获取购买时长单位，取值：M(月) D(天)
     * @return TimeUnit 购买时长单位，取值：M(月) D(天)
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * 设置购买时长单位，取值：M(月) D(天)
     * @param TimeUnit 购买时长单位，取值：M(月) D(天)
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * 获取购买时长
     * @return TimeSpan 购买时长
     */
    public Integer getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * 设置购买时长
     * @param TimeSpan 购买时长
     */
    public void setTimeSpan(Integer TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * 获取是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0
     * @return NeedSecurityAgent 是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public Integer getNeedSecurityAgent() {
        return this.NeedSecurityAgent;
    }

    /**
     * 设置是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0
     * @param NeedSecurityAgent 是否安装安全Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public void setNeedSecurityAgent(Integer NeedSecurityAgent) {
        this.NeedSecurityAgent = NeedSecurityAgent;
    }

    /**
     * 获取是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0
     * @return NeedMonitorAgent 是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public Integer getNeedMonitorAgent() {
        return this.NeedMonitorAgent;
    }

    /**
     * 设置是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0
     * @param NeedMonitorAgent 是否安装监控Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public void setNeedMonitorAgent(Integer NeedMonitorAgent) {
        this.NeedMonitorAgent = NeedMonitorAgent;
    }

    /**
     * 获取是否安装EMR Agent，取值：1(安装) 0(不安装)，默认取值0
     * @return NeedEMRAgent 是否安装EMR Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public Integer getNeedEMRAgent() {
        return this.NeedEMRAgent;
    }

    /**
     * 设置是否安装EMR Agent，取值：1(安装) 0(不安装)，默认取值0
     * @param NeedEMRAgent 是否安装EMR Agent，取值：1(安装) 0(不安装)，默认取值0
     */
    public void setNeedEMRAgent(Integer NeedEMRAgent) {
        this.NeedEMRAgent = NeedEMRAgent;
    }

    /**
     * 获取是否安装EMR软件包，取值：1(安装) 0(不安装)，默认取值0
     * @return NeedEMRSoftware 是否安装EMR软件包，取值：1(安装) 0(不安装)，默认取值0
     */
    public Integer getNeedEMRSoftware() {
        return this.NeedEMRSoftware;
    }

    /**
     * 设置是否安装EMR软件包，取值：1(安装) 0(不安装)，默认取值0
     * @param NeedEMRSoftware 是否安装EMR软件包，取值：1(安装) 0(不安装)，默认取值0
     */
    public void setNeedEMRSoftware(Integer NeedEMRSoftware) {
        this.NeedEMRSoftware = NeedEMRSoftware;
    }

    /**
     * 获取是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0
     * @return ApplyEip 是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0
     */
    public Integer getApplyEip() {
        return this.ApplyEip;
    }

    /**
     * 设置是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0
     * @param ApplyEip 是否分配弹性公网IP，取值：1(分配) 0(不分配)，默认取值0
     */
    public void setApplyEip(Integer ApplyEip) {
        this.ApplyEip = ApplyEip;
    }

    /**
     * 获取弹性公网IP计费模式，取值：Flow(按流量计费) Bandwidth(按带宽计费)，默认取值Flow
     * @return EipPayMode 弹性公网IP计费模式，取值：Flow(按流量计费) Bandwidth(按带宽计费)，默认取值Flow
     */
    public String getEipPayMode() {
        return this.EipPayMode;
    }

    /**
     * 设置弹性公网IP计费模式，取值：Flow(按流量计费) Bandwidth(按带宽计费)，默认取值Flow
     * @param EipPayMode 弹性公网IP计费模式，取值：Flow(按流量计费) Bandwidth(按带宽计费)，默认取值Flow
     */
    public void setEipPayMode(String EipPayMode) {
        this.EipPayMode = EipPayMode;
    }

    /**
     * 获取弹性公网IP带宽限制，单位Mb
     * @return EipBandwidth 弹性公网IP带宽限制，单位Mb
     */
    public Integer getEipBandwidth() {
        return this.EipBandwidth;
    }

    /**
     * 设置弹性公网IP带宽限制，单位Mb
     * @param EipBandwidth 弹性公网IP带宽限制，单位Mb
     */
    public void setEipBandwidth(Integer EipBandwidth) {
        this.EipBandwidth = EipBandwidth;
    }

    /**
     * 获取数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1
     * @return IsZoning 数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1
     */
    public Integer getIsZoning() {
        return this.IsZoning;
    }

    /**
     * 设置数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1
     * @param IsZoning 数据盘是否格式化，取值：1(格式化) 0(不格式化)，默认取值为1
     */
    public void setIsZoning(Integer IsZoning) {
        this.IsZoning = IsZoning;
    }

    /**
     * 获取物理机计费模式，取值：1(预付费) 2(后付费)，默认取值为1
     * @return CpmPayMode 物理机计费模式，取值：1(预付费) 2(后付费)，默认取值为1
     */
    public Integer getCpmPayMode() {
        return this.CpmPayMode;
    }

    /**
     * 设置物理机计费模式，取值：1(预付费) 2(后付费)，默认取值为1
     * @param CpmPayMode 物理机计费模式，取值：1(预付费) 2(后付费)，默认取值为1
     */
    public void setCpmPayMode(Integer CpmPayMode) {
        this.CpmPayMode = CpmPayMode;
    }

    /**
     * 获取自定义镜像ID，取值生效时用自定义镜像部署物理机
     * @return ImageId 自定义镜像ID，取值生效时用自定义镜像部署物理机
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * 设置自定义镜像ID，取值生效时用自定义镜像部署物理机
     * @param ImageId 自定义镜像ID，取值生效时用自定义镜像部署物理机
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * 获取设置Linux root或Windows Administrator的密码
     * @return Password 设置Linux root或Windows Administrator的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置设置Linux root或Windows Administrator的密码
     * @param Password 设置Linux root或Windows Administrator的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0
     * @return AutoRenewFlag 自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0
     */
    public Integer getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * 设置自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0
     * @param AutoRenewFlag 自动续费标志位，取值：1(自动续费) 0(不自动续费)，默认取值0
     */
    public void setAutoRenewFlag(Integer AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * 获取系统盘根分区大小，单位为G，默认取值10G。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取根分区信息
     * @return SysRootSpace 系统盘根分区大小，单位为G，默认取值10G。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取根分区信息
     */
    public Integer getSysRootSpace() {
        return this.SysRootSpace;
    }

    /**
     * 设置系统盘根分区大小，单位为G，默认取值10G。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取根分区信息
     * @param SysRootSpace 系统盘根分区大小，单位为G，默认取值10G。通过接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)获取根分区信息
     */
    public void setSysRootSpace(Integer SysRootSpace) {
        this.SysRootSpace = SysRootSpace;
    }

    /**
     * 获取系统盘swap分区或/boot/efi分区的大小，单位为G。若是uefi启动的机器，分区为/boot/efi，且此值是默认是2G。 普通机器为swap分区，可以不指定此分区。 机型是否是uefi启动，参见接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
     * @return SysSwaporuefiSpace 系统盘swap分区或/boot/efi分区的大小，单位为G。若是uefi启动的机器，分区为/boot/efi，且此值是默认是2G。 普通机器为swap分区，可以不指定此分区。 机型是否是uefi启动，参见接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
     */
    public Integer getSysSwaporuefiSpace() {
        return this.SysSwaporuefiSpace;
    }

    /**
     * 设置系统盘swap分区或/boot/efi分区的大小，单位为G。若是uefi启动的机器，分区为/boot/efi，且此值是默认是2G。 普通机器为swap分区，可以不指定此分区。 机型是否是uefi启动，参见接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
     * @param SysSwaporuefiSpace 系统盘swap分区或/boot/efi分区的大小，单位为G。若是uefi启动的机器，分区为/boot/efi，且此值是默认是2G。 普通机器为swap分区，可以不指定此分区。 机型是否是uefi启动，参见接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
     */
    public void setSysSwaporuefiSpace(Integer SysSwaporuefiSpace) {
        this.SysSwaporuefiSpace = SysSwaporuefiSpace;
    }

    /**
     * 获取/usr/local分区大小，单位为G
     * @return SysUsrlocalSpace /usr/local分区大小，单位为G
     */
    public Integer getSysUsrlocalSpace() {
        return this.SysUsrlocalSpace;
    }

    /**
     * 设置/usr/local分区大小，单位为G
     * @param SysUsrlocalSpace /usr/local分区大小，单位为G
     */
    public void setSysUsrlocalSpace(Integer SysUsrlocalSpace) {
        this.SysUsrlocalSpace = SysUsrlocalSpace;
    }

    /**
     * 获取/data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）
     * @return SysDataSpace /data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）
     */
    public Integer getSysDataSpace() {
        return this.SysDataSpace;
    }

    /**
     * 设置/data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）
     * @param SysDataSpace /data分区大小，单位为G。如果系统盘还有剩余大小，会分配给/data分区。（特殊情况：如果剩余空间不足10G，并且没有指定/data分区，则剩余空间会分配给Root分区）
     */
    public void setSysDataSpace(Integer SysDataSpace) {
        this.SysDataSpace = SysDataSpace;
    }

    /**
     * 获取是否开启超线程，取值：1(开启) 0(关闭)，默认取值1
     * @return HyperThreading 是否开启超线程，取值：1(开启) 0(关闭)，默认取值1
     */
    public Integer getHyperThreading() {
        return this.HyperThreading;
    }

    /**
     * 设置是否开启超线程，取值：1(开启) 0(关闭)，默认取值1
     * @param HyperThreading 是否开启超线程，取值：1(开启) 0(关闭)，默认取值1
     */
    public void setHyperThreading(Integer HyperThreading) {
        this.HyperThreading = HyperThreading;
    }

    /**
     * 获取指定的内网IP列表，不指定时自动分配
     * @return LanIps 指定的内网IP列表，不指定时自动分配
     */
    public String [] getLanIps() {
        return this.LanIps;
    }

    /**
     * 设置指定的内网IP列表，不指定时自动分配
     * @param LanIps 指定的内网IP列表，不指定时自动分配
     */
    public void setLanIps(String [] LanIps) {
        this.LanIps = LanIps;
    }

    /**
     * 获取设备名称列表
     * @return Aliases 设备名称列表
     */
    public String [] getAliases() {
        return this.Aliases;
    }

    /**
     * 设置设备名称列表
     * @param Aliases 设备名称列表
     */
    public void setAliases(String [] Aliases) {
        this.Aliases = Aliases;
    }

    /**
     * 获取CPU型号ID，自定义机型需要传入，取值：
<br/><li>1: E5-2620v3 (6核) * 2</li><li>2: E5-2680v4 (14核) * 2</li><li>3: E5-2670v3 (12核) * 2</li><li>4: E5-2620v4 (8核) * 2</li><li>5: 4110 (8核) * 2</li><li>6: 6133 (20核) * 2</li><br/>
     * @return CpuId CPU型号ID，自定义机型需要传入，取值：
<br/><li>1: E5-2620v3 (6核) * 2</li><li>2: E5-2680v4 (14核) * 2</li><li>3: E5-2670v3 (12核) * 2</li><li>4: E5-2620v4 (8核) * 2</li><li>5: 4110 (8核) * 2</li><li>6: 6133 (20核) * 2</li><br/>
     */
    public Integer getCpuId() {
        return this.CpuId;
    }

    /**
     * 设置CPU型号ID，自定义机型需要传入，取值：
<br/><li>1: E5-2620v3 (6核) * 2</li><li>2: E5-2680v4 (14核) * 2</li><li>3: E5-2670v3 (12核) * 2</li><li>4: E5-2620v4 (8核) * 2</li><li>5: 4110 (8核) * 2</li><li>6: 6133 (20核) * 2</li><br/>
     * @param CpuId CPU型号ID，自定义机型需要传入，取值：
<br/><li>1: E5-2620v3 (6核) * 2</li><li>2: E5-2680v4 (14核) * 2</li><li>3: E5-2670v3 (12核) * 2</li><li>4: E5-2620v4 (8核) * 2</li><li>5: 4110 (8核) * 2</li><li>6: 6133 (20核) * 2</li><br/>
     */
    public void setCpuId(Integer CpuId) {
        this.CpuId = CpuId;
    }

    /**
     * 获取是否有RAID卡，取值：1(有) 0(无)，自定义机型需要传入
     * @return ContainRaidCard 是否有RAID卡，取值：1(有) 0(无)，自定义机型需要传入
     */
    public Integer getContainRaidCard() {
        return this.ContainRaidCard;
    }

    /**
     * 设置是否有RAID卡，取值：1(有) 0(无)，自定义机型需要传入
     * @param ContainRaidCard 是否有RAID卡，取值：1(有) 0(无)，自定义机型需要传入
     */
    public void setContainRaidCard(Integer ContainRaidCard) {
        this.ContainRaidCard = ContainRaidCard;
    }

    /**
     * 获取内存大小，单位为G，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @return MemSize 内存大小，单位为G，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public Integer getMemSize() {
        return this.MemSize;
    }

    /**
     * 设置内存大小，单位为G，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @param MemSize 内存大小，单位为G，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public void setMemSize(Integer MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * 获取系统盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @return SystemDiskTypeId 系统盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public Integer getSystemDiskTypeId() {
        return this.SystemDiskTypeId;
    }

    /**
     * 设置系统盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @param SystemDiskTypeId 系统盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public void setSystemDiskTypeId(Integer SystemDiskTypeId) {
        this.SystemDiskTypeId = SystemDiskTypeId;
    }

    /**
     * 获取系统盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @return SystemDiskCount 系统盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public Integer getSystemDiskCount() {
        return this.SystemDiskCount;
    }

    /**
     * 设置系统盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @param SystemDiskCount 系统盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public void setSystemDiskCount(Integer SystemDiskCount) {
        this.SystemDiskCount = SystemDiskCount;
    }

    /**
     * 获取数据盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @return DataDiskTypeId 数据盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public Integer getDataDiskTypeId() {
        return this.DataDiskTypeId;
    }

    /**
     * 设置数据盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @param DataDiskTypeId 数据盘ID，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public void setDataDiskTypeId(Integer DataDiskTypeId) {
        this.DataDiskTypeId = DataDiskTypeId;
    }

    /**
     * 获取数据盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @return DataDiskCount 数据盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public Integer getDataDiskCount() {
        return this.DataDiskCount;
    }

    /**
     * 设置数据盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     * @param DataDiskCount 数据盘数量，自定义机型需要传入。取值参考接口[查询自定义机型部件信息(DescribeHardwareSpecification)](https://cloud.tencent.com/document/api/386/33565)返回值
     */
    public void setDataDiskCount(Integer DataDiskCount) {
        this.DataDiskCount = DataDiskCount;
    }

    /**
     * 获取绑定的标签列表
     * @return Tags 绑定的标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * 设置绑定的标签列表
     * @param Tags 绑定的标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取指定数据盘的文件系统格式，当前支持 EXT4和XFS选项， 默认为EXT4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效
     * @return FileSystem 指定数据盘的文件系统格式，当前支持 EXT4和XFS选项， 默认为EXT4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效
     */
    public String getFileSystem() {
        return this.FileSystem;
    }

    /**
     * 设置指定数据盘的文件系统格式，当前支持 EXT4和XFS选项， 默认为EXT4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效
     * @param FileSystem 指定数据盘的文件系统格式，当前支持 EXT4和XFS选项， 默认为EXT4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效
     */
    public void setFileSystem(String FileSystem) {
        this.FileSystem = FileSystem;
    }

    /**
     * 获取此参数是为了防止重复发货。如果两次调用传入相同的BuySession，只会发货一次。 不要以设备别名作为BuySession，这样只会第一次购买成功。参数长度为128位，合法字符为大小字母，数字，下划线，横线。
     * @return BuySession 此参数是为了防止重复发货。如果两次调用传入相同的BuySession，只会发货一次。 不要以设备别名作为BuySession，这样只会第一次购买成功。参数长度为128位，合法字符为大小字母，数字，下划线，横线。
     */
    public String getBuySession() {
        return this.BuySession;
    }

    /**
     * 设置此参数是为了防止重复发货。如果两次调用传入相同的BuySession，只会发货一次。 不要以设备别名作为BuySession，这样只会第一次购买成功。参数长度为128位，合法字符为大小字母，数字，下划线，横线。
     * @param BuySession 此参数是为了防止重复发货。如果两次调用传入相同的BuySession，只会发货一次。 不要以设备别名作为BuySession，这样只会第一次购买成功。参数长度为128位，合法字符为大小字母，数字，下划线，横线。
     */
    public void setBuySession(String BuySession) {
        this.BuySession = BuySession;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

