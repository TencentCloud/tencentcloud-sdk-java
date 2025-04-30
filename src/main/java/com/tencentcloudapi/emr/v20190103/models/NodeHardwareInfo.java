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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeHardwareInfo extends AbstractModel {

    /**
    * 用户APPID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 序列号
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * 机器实例ID
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * master节点绑定外网IP
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * 节点规格
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 节点核数
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * 节点内存,单位b
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 节点内存描述，单位GB
    */
    @SerializedName("MemDesc")
    @Expose
    private String MemDesc;

    /**
    * 节点所在region
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 节点所在Zone
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 申请时间
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * 释放时间
    */
    @SerializedName("FreeTime")
    @Expose
    private String FreeTime;

    /**
    * 硬盘大小
    */
    @SerializedName("DiskSize")
    @Expose
    private String DiskSize;

    /**
    * 节点描述
    */
    @SerializedName("NameTag")
    @Expose
    private String NameTag;

    /**
    * 节点部署服务
    */
    @SerializedName("Services")
    @Expose
    private String Services;

    /**
    * 磁盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘

    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * 系统盘大小，单位GB
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * 付费类型，0：按量计费；1：包年包月
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * 数据库IP
    */
    @SerializedName("CdbIp")
    @Expose
    private String CdbIp;

    /**
    * 数据库端口
    */
    @SerializedName("CdbPort")
    @Expose
    private Long CdbPort;

    /**
    * 硬盘容量,单位b
    */
    @SerializedName("HwDiskSize")
    @Expose
    private Long HwDiskSize;

    /**
    * 硬盘容量描述
    */
    @SerializedName("HwDiskSizeDesc")
    @Expose
    private String HwDiskSizeDesc;

    /**
    * 内存容量，单位b
    */
    @SerializedName("HwMemSize")
    @Expose
    private Long HwMemSize;

    /**
    * 内存容量描述
    */
    @SerializedName("HwMemSizeDesc")
    @Expose
    private String HwMemSizeDesc;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 节点资源ID
    */
    @SerializedName("EmrResourceId")
    @Expose
    private String EmrResourceId;

    /**
    * 续费标志
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Long IsAutoRenew;

    /**
    * 设备标识
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * 支持变配
    */
    @SerializedName("Mutable")
    @Expose
    private Long Mutable;

    /**
    * 多云盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MCMultiDisk")
    @Expose
    private MultiDiskMC [] MCMultiDisk;

    /**
    * 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdbNodeInfo")
    @Expose
    private CdbInfo CdbNodeInfo;

    /**
    * 内网IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 此节点是否可销毁，1可销毁，0不可销毁
    */
    @SerializedName("Destroyable")
    @Expose
    private Long Destroyable;

    /**
    * 节点绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。
    */
    @SerializedName("AutoFlag")
    @Expose
    private Long AutoFlag;

    /**
    * 资源类型, host/pod
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * 是否浮动规格，1是，0否
    */
    @SerializedName("IsDynamicSpec")
    @Expose
    private Long IsDynamicSpec;

    /**
    * 浮动规格值json字符串
    */
    @SerializedName("DynamicPodSpec")
    @Expose
    private String DynamicPodSpec;

    /**
    * 是否支持变更计费类型 1是，0否
    */
    @SerializedName("SupportModifyPayMode")
    @Expose
    private Long SupportModifyPayMode;

    /**
    * 系统盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘

    */
    @SerializedName("RootStorageType")
    @Expose
    private Long RootStorageType;

    /**
    * 可用区信息
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 子网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetInfo")
    @Expose
    private SubnetInfo SubnetInfo;

    /**
    * 客户端
    */
    @SerializedName("Clients")
    @Expose
    private String Clients;

    /**
    * 系统当前时间
    */
    @SerializedName("CurrentTime")
    @Expose
    private String CurrentTime;

    /**
    * 是否用于联邦 ,1是，0否
    */
    @SerializedName("IsFederation")
    @Expose
    private Long IsFederation;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 服务
    */
    @SerializedName("ServiceClient")
    @Expose
    private String ServiceClient;

    /**
    * 该实例是否开启实例保护，true为开启 false为关闭
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * 0表示老计费，1表示新计费
    */
    @SerializedName("TradeVersion")
    @Expose
    private Long TradeVersion;

    /**
    * 各组件状态，Zookeeper:STARTED,ResourceManager:STARTED，STARTED已启动，STOPED已停止
    */
    @SerializedName("ServicesStatus")
    @Expose
    private String ServicesStatus;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 共享集群id
    */
    @SerializedName("SharedClusterId")
    @Expose
    private String SharedClusterId;

    /**
    * 共享集群id描述
    */
    @SerializedName("SharedClusterIdDesc")
    @Expose
    private String SharedClusterIdDesc;

    /**
    * 是否是定时销毁资源
    */
    @SerializedName("TimingResource")
    @Expose
    private Boolean TimingResource;

    /**
    * 资源类型（HardwareResourceType）为pod时，对应的TKE集群id
    */
    @SerializedName("TkeClusterId")
    @Expose
    private String TkeClusterId;

    /**
    * 新挂磁盘时可支持配置的服务名称列表
    */
    @SerializedName("ConfigurableServices")
    @Expose
    private String [] ConfigurableServices;

    /**
     * Get 用户APPID 
     * @return AppId 用户APPID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户APPID
     * @param AppId 用户APPID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 序列号 
     * @return SerialNo 序列号
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 序列号
     * @param SerialNo 序列号
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get 机器实例ID 
     * @return OrderNo 机器实例ID
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 机器实例ID
     * @param OrderNo 机器实例ID
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get master节点绑定外网IP 
     * @return WanIp master节点绑定外网IP
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set master节点绑定外网IP
     * @param WanIp master节点绑定外网IP
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点 
     * @return Flag 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
     * @param Flag 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 节点规格 
     * @return Spec 节点规格
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 节点规格
     * @param Spec 节点规格
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 节点核数 
     * @return CpuNum 节点核数
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set 节点核数
     * @param CpuNum 节点核数
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get 节点内存,单位b 
     * @return MemSize 节点内存,单位b
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 节点内存,单位b
     * @param MemSize 节点内存,单位b
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 节点内存描述，单位GB 
     * @return MemDesc 节点内存描述，单位GB
     */
    public String getMemDesc() {
        return this.MemDesc;
    }

    /**
     * Set 节点内存描述，单位GB
     * @param MemDesc 节点内存描述，单位GB
     */
    public void setMemDesc(String MemDesc) {
        this.MemDesc = MemDesc;
    }

    /**
     * Get 节点所在region 
     * @return RegionId 节点所在region
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 节点所在region
     * @param RegionId 节点所在region
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 节点所在Zone 
     * @return ZoneId 节点所在Zone
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 节点所在Zone
     * @param ZoneId 节点所在Zone
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 申请时间 
     * @return ApplyTime 申请时间
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set 申请时间
     * @param ApplyTime 申请时间
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get 释放时间 
     * @return FreeTime 释放时间
     */
    public String getFreeTime() {
        return this.FreeTime;
    }

    /**
     * Set 释放时间
     * @param FreeTime 释放时间
     */
    public void setFreeTime(String FreeTime) {
        this.FreeTime = FreeTime;
    }

    /**
     * Get 硬盘大小 
     * @return DiskSize 硬盘大小
     */
    public String getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 硬盘大小
     * @param DiskSize 硬盘大小
     */
    public void setDiskSize(String DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 节点描述 
     * @return NameTag 节点描述
     */
    public String getNameTag() {
        return this.NameTag;
    }

    /**
     * Set 节点描述
     * @param NameTag 节点描述
     */
    public void setNameTag(String NameTag) {
        this.NameTag = NameTag;
    }

    /**
     * Get 节点部署服务 
     * @return Services 节点部署服务
     */
    public String getServices() {
        return this.Services;
    }

    /**
     * Set 节点部署服务
     * @param Services 节点部署服务
     */
    public void setServices(String Services) {
        this.Services = Services;
    }

    /**
     * Get 磁盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘
 
     * @return StorageType 磁盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘

     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 磁盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘

     * @param StorageType 磁盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘

     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 系统盘大小，单位GB 
     * @return RootSize 系统盘大小，单位GB
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set 系统盘大小，单位GB
     * @param RootSize 系统盘大小，单位GB
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get 付费类型，0：按量计费；1：包年包月 
     * @return ChargeType 付费类型，0：按量计费；1：包年包月
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 付费类型，0：按量计费；1：包年包月
     * @param ChargeType 付费类型，0：按量计费；1：包年包月
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 数据库IP 
     * @return CdbIp 数据库IP
     */
    public String getCdbIp() {
        return this.CdbIp;
    }

    /**
     * Set 数据库IP
     * @param CdbIp 数据库IP
     */
    public void setCdbIp(String CdbIp) {
        this.CdbIp = CdbIp;
    }

    /**
     * Get 数据库端口 
     * @return CdbPort 数据库端口
     */
    public Long getCdbPort() {
        return this.CdbPort;
    }

    /**
     * Set 数据库端口
     * @param CdbPort 数据库端口
     */
    public void setCdbPort(Long CdbPort) {
        this.CdbPort = CdbPort;
    }

    /**
     * Get 硬盘容量,单位b 
     * @return HwDiskSize 硬盘容量,单位b
     */
    public Long getHwDiskSize() {
        return this.HwDiskSize;
    }

    /**
     * Set 硬盘容量,单位b
     * @param HwDiskSize 硬盘容量,单位b
     */
    public void setHwDiskSize(Long HwDiskSize) {
        this.HwDiskSize = HwDiskSize;
    }

    /**
     * Get 硬盘容量描述 
     * @return HwDiskSizeDesc 硬盘容量描述
     */
    public String getHwDiskSizeDesc() {
        return this.HwDiskSizeDesc;
    }

    /**
     * Set 硬盘容量描述
     * @param HwDiskSizeDesc 硬盘容量描述
     */
    public void setHwDiskSizeDesc(String HwDiskSizeDesc) {
        this.HwDiskSizeDesc = HwDiskSizeDesc;
    }

    /**
     * Get 内存容量，单位b 
     * @return HwMemSize 内存容量，单位b
     */
    public Long getHwMemSize() {
        return this.HwMemSize;
    }

    /**
     * Set 内存容量，单位b
     * @param HwMemSize 内存容量，单位b
     */
    public void setHwMemSize(Long HwMemSize) {
        this.HwMemSize = HwMemSize;
    }

    /**
     * Get 内存容量描述 
     * @return HwMemSizeDesc 内存容量描述
     */
    public String getHwMemSizeDesc() {
        return this.HwMemSizeDesc;
    }

    /**
     * Set 内存容量描述
     * @param HwMemSizeDesc 内存容量描述
     */
    public void setHwMemSizeDesc(String HwMemSizeDesc) {
        this.HwMemSizeDesc = HwMemSizeDesc;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 节点资源ID 
     * @return EmrResourceId 节点资源ID
     */
    public String getEmrResourceId() {
        return this.EmrResourceId;
    }

    /**
     * Set 节点资源ID
     * @param EmrResourceId 节点资源ID
     */
    public void setEmrResourceId(String EmrResourceId) {
        this.EmrResourceId = EmrResourceId;
    }

    /**
     * Get 续费标志 
     * @return IsAutoRenew 续费标志
     */
    public Long getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set 续费标志
     * @param IsAutoRenew 续费标志
     */
    public void setIsAutoRenew(Long IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get 设备标识 
     * @return DeviceClass 设备标识
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set 设备标识
     * @param DeviceClass 设备标识
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get 支持变配 
     * @return Mutable 支持变配
     */
    public Long getMutable() {
        return this.Mutable;
    }

    /**
     * Set 支持变配
     * @param Mutable 支持变配
     */
    public void setMutable(Long Mutable) {
        this.Mutable = Mutable;
    }

    /**
     * Get 多云盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MCMultiDisk 多云盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiDiskMC [] getMCMultiDisk() {
        return this.MCMultiDisk;
    }

    /**
     * Set 多云盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param MCMultiDisk 多云盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMCMultiDisk(MultiDiskMC [] MCMultiDisk) {
        this.MCMultiDisk = MCMultiDisk;
    }

    /**
     * Get 数据库信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdbNodeInfo 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CdbInfo getCdbNodeInfo() {
        return this.CdbNodeInfo;
    }

    /**
     * Set 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdbNodeInfo 数据库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdbNodeInfo(CdbInfo CdbNodeInfo) {
        this.CdbNodeInfo = CdbNodeInfo;
    }

    /**
     * Get 内网IP 
     * @return Ip 内网IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 内网IP
     * @param Ip 内网IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 此节点是否可销毁，1可销毁，0不可销毁 
     * @return Destroyable 此节点是否可销毁，1可销毁，0不可销毁
     */
    public Long getDestroyable() {
        return this.Destroyable;
    }

    /**
     * Set 此节点是否可销毁，1可销毁，0不可销毁
     * @param Destroyable 此节点是否可销毁，1可销毁，0不可销毁
     */
    public void setDestroyable(Long Destroyable) {
        this.Destroyable = Destroyable;
    }

    /**
     * Get 节点绑定的标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 节点绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 节点绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 节点绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。 
     * @return AutoFlag 是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。
     */
    public Long getAutoFlag() {
        return this.AutoFlag;
    }

    /**
     * Set 是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。
     * @param AutoFlag 是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。
     */
    public void setAutoFlag(Long AutoFlag) {
        this.AutoFlag = AutoFlag;
    }

    /**
     * Get 资源类型, host/pod 
     * @return HardwareResourceType 资源类型, host/pod
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set 资源类型, host/pod
     * @param HardwareResourceType 资源类型, host/pod
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get 是否浮动规格，1是，0否 
     * @return IsDynamicSpec 是否浮动规格，1是，0否
     */
    public Long getIsDynamicSpec() {
        return this.IsDynamicSpec;
    }

    /**
     * Set 是否浮动规格，1是，0否
     * @param IsDynamicSpec 是否浮动规格，1是，0否
     */
    public void setIsDynamicSpec(Long IsDynamicSpec) {
        this.IsDynamicSpec = IsDynamicSpec;
    }

    /**
     * Get 浮动规格值json字符串 
     * @return DynamicPodSpec 浮动规格值json字符串
     */
    public String getDynamicPodSpec() {
        return this.DynamicPodSpec;
    }

    /**
     * Set 浮动规格值json字符串
     * @param DynamicPodSpec 浮动规格值json字符串
     */
    public void setDynamicPodSpec(String DynamicPodSpec) {
        this.DynamicPodSpec = DynamicPodSpec;
    }

    /**
     * Get 是否支持变更计费类型 1是，0否 
     * @return SupportModifyPayMode 是否支持变更计费类型 1是，0否
     */
    public Long getSupportModifyPayMode() {
        return this.SupportModifyPayMode;
    }

    /**
     * Set 是否支持变更计费类型 1是，0否
     * @param SupportModifyPayMode 是否支持变更计费类型 1是，0否
     */
    public void setSupportModifyPayMode(Long SupportModifyPayMode) {
        this.SupportModifyPayMode = SupportModifyPayMode;
    }

    /**
     * Get 系统盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘
 
     * @return RootStorageType 系统盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘

     */
    public Long getRootStorageType() {
        return this.RootStorageType;
    }

    /**
     * Set 系统盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘

     * @param RootStorageType 系统盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘

     */
    public void setRootStorageType(Long RootStorageType) {
        this.RootStorageType = RootStorageType;
    }

    /**
     * Get 可用区信息 
     * @return Zone 可用区信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息
     * @param Zone 可用区信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 子网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetInfo 子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubnetInfo getSubnetInfo() {
        return this.SubnetInfo;
    }

    /**
     * Set 子网
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetInfo 子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetInfo(SubnetInfo SubnetInfo) {
        this.SubnetInfo = SubnetInfo;
    }

    /**
     * Get 客户端 
     * @return Clients 客户端
     */
    public String getClients() {
        return this.Clients;
    }

    /**
     * Set 客户端
     * @param Clients 客户端
     */
    public void setClients(String Clients) {
        this.Clients = Clients;
    }

    /**
     * Get 系统当前时间 
     * @return CurrentTime 系统当前时间
     */
    public String getCurrentTime() {
        return this.CurrentTime;
    }

    /**
     * Set 系统当前时间
     * @param CurrentTime 系统当前时间
     */
    public void setCurrentTime(String CurrentTime) {
        this.CurrentTime = CurrentTime;
    }

    /**
     * Get 是否用于联邦 ,1是，0否 
     * @return IsFederation 是否用于联邦 ,1是，0否
     */
    public Long getIsFederation() {
        return this.IsFederation;
    }

    /**
     * Set 是否用于联邦 ,1是，0否
     * @param IsFederation 是否用于联邦 ,1是，0否
     */
    public void setIsFederation(Long IsFederation) {
        this.IsFederation = IsFederation;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 服务 
     * @return ServiceClient 服务
     */
    public String getServiceClient() {
        return this.ServiceClient;
    }

    /**
     * Set 服务
     * @param ServiceClient 服务
     */
    public void setServiceClient(String ServiceClient) {
        this.ServiceClient = ServiceClient;
    }

    /**
     * Get 该实例是否开启实例保护，true为开启 false为关闭 
     * @return DisableApiTermination 该实例是否开启实例保护，true为开启 false为关闭
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set 该实例是否开启实例保护，true为开启 false为关闭
     * @param DisableApiTermination 该实例是否开启实例保护，true为开启 false为关闭
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get 0表示老计费，1表示新计费 
     * @return TradeVersion 0表示老计费，1表示新计费
     */
    public Long getTradeVersion() {
        return this.TradeVersion;
    }

    /**
     * Set 0表示老计费，1表示新计费
     * @param TradeVersion 0表示老计费，1表示新计费
     */
    public void setTradeVersion(Long TradeVersion) {
        this.TradeVersion = TradeVersion;
    }

    /**
     * Get 各组件状态，Zookeeper:STARTED,ResourceManager:STARTED，STARTED已启动，STOPED已停止 
     * @return ServicesStatus 各组件状态，Zookeeper:STARTED,ResourceManager:STARTED，STARTED已启动，STOPED已停止
     */
    public String getServicesStatus() {
        return this.ServicesStatus;
    }

    /**
     * Set 各组件状态，Zookeeper:STARTED,ResourceManager:STARTED，STARTED已启动，STOPED已停止
     * @param ServicesStatus 各组件状态，Zookeeper:STARTED,ResourceManager:STARTED，STARTED已启动，STOPED已停止
     */
    public void setServicesStatus(String ServicesStatus) {
        this.ServicesStatus = ServicesStatus;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 共享集群id 
     * @return SharedClusterId 共享集群id
     */
    public String getSharedClusterId() {
        return this.SharedClusterId;
    }

    /**
     * Set 共享集群id
     * @param SharedClusterId 共享集群id
     */
    public void setSharedClusterId(String SharedClusterId) {
        this.SharedClusterId = SharedClusterId;
    }

    /**
     * Get 共享集群id描述 
     * @return SharedClusterIdDesc 共享集群id描述
     */
    public String getSharedClusterIdDesc() {
        return this.SharedClusterIdDesc;
    }

    /**
     * Set 共享集群id描述
     * @param SharedClusterIdDesc 共享集群id描述
     */
    public void setSharedClusterIdDesc(String SharedClusterIdDesc) {
        this.SharedClusterIdDesc = SharedClusterIdDesc;
    }

    /**
     * Get 是否是定时销毁资源 
     * @return TimingResource 是否是定时销毁资源
     */
    public Boolean getTimingResource() {
        return this.TimingResource;
    }

    /**
     * Set 是否是定时销毁资源
     * @param TimingResource 是否是定时销毁资源
     */
    public void setTimingResource(Boolean TimingResource) {
        this.TimingResource = TimingResource;
    }

    /**
     * Get 资源类型（HardwareResourceType）为pod时，对应的TKE集群id 
     * @return TkeClusterId 资源类型（HardwareResourceType）为pod时，对应的TKE集群id
     */
    public String getTkeClusterId() {
        return this.TkeClusterId;
    }

    /**
     * Set 资源类型（HardwareResourceType）为pod时，对应的TKE集群id
     * @param TkeClusterId 资源类型（HardwareResourceType）为pod时，对应的TKE集群id
     */
    public void setTkeClusterId(String TkeClusterId) {
        this.TkeClusterId = TkeClusterId;
    }

    /**
     * Get 新挂磁盘时可支持配置的服务名称列表 
     * @return ConfigurableServices 新挂磁盘时可支持配置的服务名称列表
     */
    public String [] getConfigurableServices() {
        return this.ConfigurableServices;
    }

    /**
     * Set 新挂磁盘时可支持配置的服务名称列表
     * @param ConfigurableServices 新挂磁盘时可支持配置的服务名称列表
     */
    public void setConfigurableServices(String [] ConfigurableServices) {
        this.ConfigurableServices = ConfigurableServices;
    }

    public NodeHardwareInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeHardwareInfo(NodeHardwareInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new String(source.OrderNo);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemDesc != null) {
            this.MemDesc = new String(source.MemDesc);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.FreeTime != null) {
            this.FreeTime = new String(source.FreeTime);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new String(source.DiskSize);
        }
        if (source.NameTag != null) {
            this.NameTag = new String(source.NameTag);
        }
        if (source.Services != null) {
            this.Services = new String(source.Services);
        }
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.RootSize != null) {
            this.RootSize = new Long(source.RootSize);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.CdbIp != null) {
            this.CdbIp = new String(source.CdbIp);
        }
        if (source.CdbPort != null) {
            this.CdbPort = new Long(source.CdbPort);
        }
        if (source.HwDiskSize != null) {
            this.HwDiskSize = new Long(source.HwDiskSize);
        }
        if (source.HwDiskSizeDesc != null) {
            this.HwDiskSizeDesc = new String(source.HwDiskSizeDesc);
        }
        if (source.HwMemSize != null) {
            this.HwMemSize = new Long(source.HwMemSize);
        }
        if (source.HwMemSizeDesc != null) {
            this.HwMemSizeDesc = new String(source.HwMemSizeDesc);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.EmrResourceId != null) {
            this.EmrResourceId = new String(source.EmrResourceId);
        }
        if (source.IsAutoRenew != null) {
            this.IsAutoRenew = new Long(source.IsAutoRenew);
        }
        if (source.DeviceClass != null) {
            this.DeviceClass = new String(source.DeviceClass);
        }
        if (source.Mutable != null) {
            this.Mutable = new Long(source.Mutable);
        }
        if (source.MCMultiDisk != null) {
            this.MCMultiDisk = new MultiDiskMC[source.MCMultiDisk.length];
            for (int i = 0; i < source.MCMultiDisk.length; i++) {
                this.MCMultiDisk[i] = new MultiDiskMC(source.MCMultiDisk[i]);
            }
        }
        if (source.CdbNodeInfo != null) {
            this.CdbNodeInfo = new CdbInfo(source.CdbNodeInfo);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Destroyable != null) {
            this.Destroyable = new Long(source.Destroyable);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoFlag != null) {
            this.AutoFlag = new Long(source.AutoFlag);
        }
        if (source.HardwareResourceType != null) {
            this.HardwareResourceType = new String(source.HardwareResourceType);
        }
        if (source.IsDynamicSpec != null) {
            this.IsDynamicSpec = new Long(source.IsDynamicSpec);
        }
        if (source.DynamicPodSpec != null) {
            this.DynamicPodSpec = new String(source.DynamicPodSpec);
        }
        if (source.SupportModifyPayMode != null) {
            this.SupportModifyPayMode = new Long(source.SupportModifyPayMode);
        }
        if (source.RootStorageType != null) {
            this.RootStorageType = new Long(source.RootStorageType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SubnetInfo != null) {
            this.SubnetInfo = new SubnetInfo(source.SubnetInfo);
        }
        if (source.Clients != null) {
            this.Clients = new String(source.Clients);
        }
        if (source.CurrentTime != null) {
            this.CurrentTime = new String(source.CurrentTime);
        }
        if (source.IsFederation != null) {
            this.IsFederation = new Long(source.IsFederation);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceClient != null) {
            this.ServiceClient = new String(source.ServiceClient);
        }
        if (source.DisableApiTermination != null) {
            this.DisableApiTermination = new Boolean(source.DisableApiTermination);
        }
        if (source.TradeVersion != null) {
            this.TradeVersion = new Long(source.TradeVersion);
        }
        if (source.ServicesStatus != null) {
            this.ServicesStatus = new String(source.ServicesStatus);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SharedClusterId != null) {
            this.SharedClusterId = new String(source.SharedClusterId);
        }
        if (source.SharedClusterIdDesc != null) {
            this.SharedClusterIdDesc = new String(source.SharedClusterIdDesc);
        }
        if (source.TimingResource != null) {
            this.TimingResource = new Boolean(source.TimingResource);
        }
        if (source.TkeClusterId != null) {
            this.TkeClusterId = new String(source.TkeClusterId);
        }
        if (source.ConfigurableServices != null) {
            this.ConfigurableServices = new String[source.ConfigurableServices.length];
            for (int i = 0; i < source.ConfigurableServices.length; i++) {
                this.ConfigurableServices[i] = new String(source.ConfigurableServices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemDesc", this.MemDesc);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "FreeTime", this.FreeTime);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "NameTag", this.NameTag);
        this.setParamSimple(map, prefix + "Services", this.Services);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "RootSize", this.RootSize);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "CdbIp", this.CdbIp);
        this.setParamSimple(map, prefix + "CdbPort", this.CdbPort);
        this.setParamSimple(map, prefix + "HwDiskSize", this.HwDiskSize);
        this.setParamSimple(map, prefix + "HwDiskSizeDesc", this.HwDiskSizeDesc);
        this.setParamSimple(map, prefix + "HwMemSize", this.HwMemSize);
        this.setParamSimple(map, prefix + "HwMemSizeDesc", this.HwMemSizeDesc);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "EmrResourceId", this.EmrResourceId);
        this.setParamSimple(map, prefix + "IsAutoRenew", this.IsAutoRenew);
        this.setParamSimple(map, prefix + "DeviceClass", this.DeviceClass);
        this.setParamSimple(map, prefix + "Mutable", this.Mutable);
        this.setParamArrayObj(map, prefix + "MCMultiDisk.", this.MCMultiDisk);
        this.setParamObj(map, prefix + "CdbNodeInfo.", this.CdbNodeInfo);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Destroyable", this.Destroyable);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoFlag", this.AutoFlag);
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);
        this.setParamSimple(map, prefix + "IsDynamicSpec", this.IsDynamicSpec);
        this.setParamSimple(map, prefix + "DynamicPodSpec", this.DynamicPodSpec);
        this.setParamSimple(map, prefix + "SupportModifyPayMode", this.SupportModifyPayMode);
        this.setParamSimple(map, prefix + "RootStorageType", this.RootStorageType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "SubnetInfo.", this.SubnetInfo);
        this.setParamSimple(map, prefix + "Clients", this.Clients);
        this.setParamSimple(map, prefix + "CurrentTime", this.CurrentTime);
        this.setParamSimple(map, prefix + "IsFederation", this.IsFederation);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ServiceClient", this.ServiceClient);
        this.setParamSimple(map, prefix + "DisableApiTermination", this.DisableApiTermination);
        this.setParamSimple(map, prefix + "TradeVersion", this.TradeVersion);
        this.setParamSimple(map, prefix + "ServicesStatus", this.ServicesStatus);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SharedClusterId", this.SharedClusterId);
        this.setParamSimple(map, prefix + "SharedClusterIdDesc", this.SharedClusterIdDesc);
        this.setParamSimple(map, prefix + "TimingResource", this.TimingResource);
        this.setParamSimple(map, prefix + "TkeClusterId", this.TkeClusterId);
        this.setParamArraySimple(map, prefix + "ConfigurableServices.", this.ConfigurableServices);

    }
}

