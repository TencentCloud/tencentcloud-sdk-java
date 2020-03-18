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

public class ReloadDeviceOsRequest extends AbstractModel{

    /**
    * 设备的唯一ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 密码。 用户设置的linux root或Windows Administrator密码。密码校验规则: <li> Windows机器密码需12到16位，至少包括三项 `[a-z]`,`[A-Z]`,`[0-9]`和`[()`'`~!@#$%^&*-+=_`|`{}[]:;'<>,.?/]`的特殊符号, 密码不能包含Administrator(不区分大小写); <li> Linux机器密码需8到16位，至少包括两项`[a-z,A-Z]`,`[0-9]`和`[()`'`~!@#$%^&*-+=_`|`{}[]:;'<>,.?/]`的特殊符号
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 操作系统类型ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/api/386/32902)获取操作系统信息
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
    * 是否格式化数据盘。0: 不格式化（默认值）；1：格式化
    */
    @SerializedName("IsZoning")
    @Expose
    private Long IsZoning;

    /**
    * 系统盘根分区大小，默认是10G。系统盘的大小参考接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)
    */
    @SerializedName("SysRootSpace")
    @Expose
    private Long SysRootSpace;

    /**
    * 系统盘swap分区或/boot/efi分区的大小。若是uefi启动的机器，分区为/boot/efi ,且此值是默认是2G。普通机器为swap分区，可以不指定此分区。机型是否是uefi启动，参考接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
    */
    @SerializedName("SysSwaporuefiSpace")
    @Expose
    private Long SysSwaporuefiSpace;

    /**
    * /usr/local分区大小
    */
    @SerializedName("SysUsrlocalSpace")
    @Expose
    private Long SysUsrlocalSpace;

    /**
    * 重装到新的私有网络的ID。如果改变VPC子网，则要求与SubnetId同时传参，否则可不填
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 重装到新的子网的ID。如果改变VPC子网，则要求与VpcId同时传参，否则可不填
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 重装指定IP地址
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 指定是否开启超线程。 0：关闭超线程；1：开启超线程（默认值）
    */
    @SerializedName("HyperThreading")
    @Expose
    private Long HyperThreading;

    /**
    * 自定义镜像ID。传此字段则用自定义镜像重装
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 指定数据盘的文件系统格式，当前支持 EXT4和XFS选项， 默认为EXT4。 参数适用于数据盘和Linux， 且在IsZoning为1时生效
    */
    @SerializedName("FileSystem")
    @Expose
    private String FileSystem;

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
    * 是否保留安全组配置，取值：1(保留) 0(不保留)，默认取值0
    */
    @SerializedName("ReserveSgConfig")
    @Expose
    private Long ReserveSgConfig;

    /**
    * /data分区大小，可不填。除root、swap、usr/local的剩余空间会自动分配到data分区
    */
    @SerializedName("SysDataSpace")
    @Expose
    private Long SysDataSpace;

    /**
     * Get 设备的唯一ID 
     * @return InstanceId 设备的唯一ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 设备的唯一ID
     * @param InstanceId 设备的唯一ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 密码。 用户设置的linux root或Windows Administrator密码。密码校验规则: <li> Windows机器密码需12到16位，至少包括三项 `[a-z]`,`[A-Z]`,`[0-9]`和`[()`'`~!@#$%^&*-+=_`|`{}[]:;'<>,.?/]`的特殊符号, 密码不能包含Administrator(不区分大小写); <li> Linux机器密码需8到16位，至少包括两项`[a-z,A-Z]`,`[0-9]`和`[()`'`~!@#$%^&*-+=_`|`{}[]:;'<>,.?/]`的特殊符号 
     * @return Password 密码。 用户设置的linux root或Windows Administrator密码。密码校验规则: <li> Windows机器密码需12到16位，至少包括三项 `[a-z]`,`[A-Z]`,`[0-9]`和`[()`'`~!@#$%^&*-+=_`|`{}[]:;'<>,.?/]`的特殊符号, 密码不能包含Administrator(不区分大小写); <li> Linux机器密码需8到16位，至少包括两项`[a-z,A-Z]`,`[0-9]`和`[()`'`~!@#$%^&*-+=_`|`{}[]:;'<>,.?/]`的特殊符号
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码。 用户设置的linux root或Windows Administrator密码。密码校验规则: <li> Windows机器密码需12到16位，至少包括三项 `[a-z]`,`[A-Z]`,`[0-9]`和`[()`'`~!@#$%^&*-+=_`|`{}[]:;'<>,.?/]`的特殊符号, 密码不能包含Administrator(不区分大小写); <li> Linux机器密码需8到16位，至少包括两项`[a-z,A-Z]`,`[0-9]`和`[()`'`~!@#$%^&*-+=_`|`{}[]:;'<>,.?/]`的特殊符号
     * @param Password 密码。 用户设置的linux root或Windows Administrator密码。密码校验规则: <li> Windows机器密码需12到16位，至少包括三项 `[a-z]`,`[A-Z]`,`[0-9]`和`[()`'`~!@#$%^&*-+=_`|`{}[]:;'<>,.?/]`的特殊符号, 密码不能包含Administrator(不区分大小写); <li> Linux机器密码需8到16位，至少包括两项`[a-z,A-Z]`,`[0-9]`和`[()`'`~!@#$%^&*-+=_`|`{}[]:;'<>,.?/]`的特殊符号
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 操作系统类型ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/api/386/32902)获取操作系统信息 
     * @return OsTypeId 操作系统类型ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/api/386/32902)获取操作系统信息
     */
    public Long getOsTypeId() {
        return this.OsTypeId;
    }

    /**
     * Set 操作系统类型ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/api/386/32902)获取操作系统信息
     * @param OsTypeId 操作系统类型ID。通过接口[查询操作系统信息(DescribeOsInfo)](https://cloud.tencent.com/document/api/386/32902)获取操作系统信息
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
     * Get 是否格式化数据盘。0: 不格式化（默认值）；1：格式化 
     * @return IsZoning 是否格式化数据盘。0: 不格式化（默认值）；1：格式化
     */
    public Long getIsZoning() {
        return this.IsZoning;
    }

    /**
     * Set 是否格式化数据盘。0: 不格式化（默认值）；1：格式化
     * @param IsZoning 是否格式化数据盘。0: 不格式化（默认值）；1：格式化
     */
    public void setIsZoning(Long IsZoning) {
        this.IsZoning = IsZoning;
    }

    /**
     * Get 系统盘根分区大小，默认是10G。系统盘的大小参考接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910) 
     * @return SysRootSpace 系统盘根分区大小，默认是10G。系统盘的大小参考接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)
     */
    public Long getSysRootSpace() {
        return this.SysRootSpace;
    }

    /**
     * Set 系统盘根分区大小，默认是10G。系统盘的大小参考接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)
     * @param SysRootSpace 系统盘根分区大小，默认是10G。系统盘的大小参考接口[查询机型RAID方式以及系统盘大小(DescribeDeviceClassPartition)](https://cloud.tencent.com/document/api/386/32910)
     */
    public void setSysRootSpace(Long SysRootSpace) {
        this.SysRootSpace = SysRootSpace;
    }

    /**
     * Get 系统盘swap分区或/boot/efi分区的大小。若是uefi启动的机器，分区为/boot/efi ,且此值是默认是2G。普通机器为swap分区，可以不指定此分区。机型是否是uefi启动，参考接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911) 
     * @return SysSwaporuefiSpace 系统盘swap分区或/boot/efi分区的大小。若是uefi启动的机器，分区为/boot/efi ,且此值是默认是2G。普通机器为swap分区，可以不指定此分区。机型是否是uefi启动，参考接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
     */
    public Long getSysSwaporuefiSpace() {
        return this.SysSwaporuefiSpace;
    }

    /**
     * Set 系统盘swap分区或/boot/efi分区的大小。若是uefi启动的机器，分区为/boot/efi ,且此值是默认是2G。普通机器为swap分区，可以不指定此分区。机型是否是uefi启动，参考接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
     * @param SysSwaporuefiSpace 系统盘swap分区或/boot/efi分区的大小。若是uefi启动的机器，分区为/boot/efi ,且此值是默认是2G。普通机器为swap分区，可以不指定此分区。机型是否是uefi启动，参考接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)
     */
    public void setSysSwaporuefiSpace(Long SysSwaporuefiSpace) {
        this.SysSwaporuefiSpace = SysSwaporuefiSpace;
    }

    /**
     * Get /usr/local分区大小 
     * @return SysUsrlocalSpace /usr/local分区大小
     */
    public Long getSysUsrlocalSpace() {
        return this.SysUsrlocalSpace;
    }

    /**
     * Set /usr/local分区大小
     * @param SysUsrlocalSpace /usr/local分区大小
     */
    public void setSysUsrlocalSpace(Long SysUsrlocalSpace) {
        this.SysUsrlocalSpace = SysUsrlocalSpace;
    }

    /**
     * Get 重装到新的私有网络的ID。如果改变VPC子网，则要求与SubnetId同时传参，否则可不填 
     * @return VpcId 重装到新的私有网络的ID。如果改变VPC子网，则要求与SubnetId同时传参，否则可不填
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 重装到新的私有网络的ID。如果改变VPC子网，则要求与SubnetId同时传参，否则可不填
     * @param VpcId 重装到新的私有网络的ID。如果改变VPC子网，则要求与SubnetId同时传参，否则可不填
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 重装到新的子网的ID。如果改变VPC子网，则要求与VpcId同时传参，否则可不填 
     * @return SubnetId 重装到新的子网的ID。如果改变VPC子网，则要求与VpcId同时传参，否则可不填
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 重装到新的子网的ID。如果改变VPC子网，则要求与VpcId同时传参，否则可不填
     * @param SubnetId 重装到新的子网的ID。如果改变VPC子网，则要求与VpcId同时传参，否则可不填
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 重装指定IP地址 
     * @return LanIp 重装指定IP地址
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * Set 重装指定IP地址
     * @param LanIp 重装指定IP地址
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * Get 指定是否开启超线程。 0：关闭超线程；1：开启超线程（默认值） 
     * @return HyperThreading 指定是否开启超线程。 0：关闭超线程；1：开启超线程（默认值）
     */
    public Long getHyperThreading() {
        return this.HyperThreading;
    }

    /**
     * Set 指定是否开启超线程。 0：关闭超线程；1：开启超线程（默认值）
     * @param HyperThreading 指定是否开启超线程。 0：关闭超线程；1：开启超线程（默认值）
     */
    public void setHyperThreading(Long HyperThreading) {
        this.HyperThreading = HyperThreading;
    }

    /**
     * Get 自定义镜像ID。传此字段则用自定义镜像重装 
     * @return ImageId 自定义镜像ID。传此字段则用自定义镜像重装
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 自定义镜像ID。传此字段则用自定义镜像重装
     * @param ImageId 自定义镜像ID。传此字段则用自定义镜像重装
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
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
     * Get 是否保留安全组配置，取值：1(保留) 0(不保留)，默认取值0 
     * @return ReserveSgConfig 是否保留安全组配置，取值：1(保留) 0(不保留)，默认取值0
     */
    public Long getReserveSgConfig() {
        return this.ReserveSgConfig;
    }

    /**
     * Set 是否保留安全组配置，取值：1(保留) 0(不保留)，默认取值0
     * @param ReserveSgConfig 是否保留安全组配置，取值：1(保留) 0(不保留)，默认取值0
     */
    public void setReserveSgConfig(Long ReserveSgConfig) {
        this.ReserveSgConfig = ReserveSgConfig;
    }

    /**
     * Get /data分区大小，可不填。除root、swap、usr/local的剩余空间会自动分配到data分区 
     * @return SysDataSpace /data分区大小，可不填。除root、swap、usr/local的剩余空间会自动分配到data分区
     */
    public Long getSysDataSpace() {
        return this.SysDataSpace;
    }

    /**
     * Set /data分区大小，可不填。除root、swap、usr/local的剩余空间会自动分配到data分区
     * @param SysDataSpace /data分区大小，可不填。除root、swap、usr/local的剩余空间会自动分配到data分区
     */
    public void setSysDataSpace(Long SysDataSpace) {
        this.SysDataSpace = SysDataSpace;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "OsTypeId", this.OsTypeId);
        this.setParamSimple(map, prefix + "RaidId", this.RaidId);
        this.setParamSimple(map, prefix + "IsZoning", this.IsZoning);
        this.setParamSimple(map, prefix + "SysRootSpace", this.SysRootSpace);
        this.setParamSimple(map, prefix + "SysSwaporuefiSpace", this.SysSwaporuefiSpace);
        this.setParamSimple(map, prefix + "SysUsrlocalSpace", this.SysUsrlocalSpace);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "HyperThreading", this.HyperThreading);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "FileSystem", this.FileSystem);
        this.setParamSimple(map, prefix + "NeedSecurityAgent", this.NeedSecurityAgent);
        this.setParamSimple(map, prefix + "NeedMonitorAgent", this.NeedMonitorAgent);
        this.setParamSimple(map, prefix + "NeedEMRAgent", this.NeedEMRAgent);
        this.setParamSimple(map, prefix + "NeedEMRSoftware", this.NeedEMRSoftware);
        this.setParamSimple(map, prefix + "ReserveSgConfig", this.ReserveSgConfig);
        this.setParamSimple(map, prefix + "SysDataSpace", this.SysDataSpace);

    }
}

