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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeHardwareInfo extends AbstractModel{

    /**
    * 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 序列号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * 机器实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * master节点绑定外网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * 节点规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 节点核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * 节点内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 节点内存描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemDesc")
    @Expose
    private String MemDesc;

    /**
    * 节点所在region
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 节点所在Zone
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 申请时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * 释放时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FreeTime")
    @Expose
    private String FreeTime;

    /**
    * 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private String DiskSize;

    /**
    * 节点描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameTag")
    @Expose
    private String NameTag;

    /**
    * 节点部署服务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Services")
    @Expose
    private String Services;

    /**
    * 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * 付费类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * 数据库IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdbIp")
    @Expose
    private String CdbIp;

    /**
    * 数据库端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdbPort")
    @Expose
    private Long CdbPort;

    /**
    * 硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HwDiskSize")
    @Expose
    private Long HwDiskSize;

    /**
    * 硬盘容量描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HwDiskSizeDesc")
    @Expose
    private String HwDiskSizeDesc;

    /**
    * 内存容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HwMemSize")
    @Expose
    private Long HwMemSize;

    /**
    * 内存容量描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HwMemSizeDesc")
    @Expose
    private String HwMemSizeDesc;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 节点资源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmrResourceId")
    @Expose
    private String EmrResourceId;

    /**
    * 续费标志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Long IsAutoRenew;

    /**
    * 设备标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * 支持变配
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 此节点是否可销毁，1可销毁，0不可销毁
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoFlag")
    @Expose
    private Long AutoFlag;

    /**
    * 资源类型, host/pod
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * 是否浮动规格，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDynamicSpec")
    @Expose
    private Long IsDynamicSpec;

    /**
    * 浮动规格值json字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DynamicPodSpec")
    @Expose
    private String DynamicPodSpec;

    /**
    * 是否支持变更计费类型 1是，0否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportModifyPayMode")
    @Expose
    private Long SupportModifyPayMode;

    /**
    * 系统盘类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootStorageType")
    @Expose
    private Long RootStorageType;

    /**
    * 可用区信息
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Clients")
    @Expose
    private String Clients;

    /**
     * Get 用户APPID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户APPID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 序列号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialNo 序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 序列号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialNo 序列号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get 机器实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderNo 机器实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 机器实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderNo 机器实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get master节点绑定外网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanIp master节点绑定外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set master节点绑定外网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanIp master节点绑定外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Flag 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Flag 节点类型。0:common节点；1:master节点
；2:core节点；3:task节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 节点规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Spec 节点规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 节点规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spec 节点规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 节点核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuNum 节点核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set 节点核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuNum 节点核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get 节点内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemSize 节点内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 节点内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemSize 节点内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 节点内存描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemDesc 节点内存描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemDesc() {
        return this.MemDesc;
    }

    /**
     * Set 节点内存描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemDesc 节点内存描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemDesc(String MemDesc) {
        this.MemDesc = MemDesc;
    }

    /**
     * Get 节点所在region
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 节点所在region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 节点所在region
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 节点所在region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 节点所在Zone
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 节点所在Zone
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 节点所在Zone
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 节点所在Zone
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 申请时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get 释放时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FreeTime 释放时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFreeTime() {
        return this.FreeTime;
    }

    /**
     * Set 释放时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FreeTime 释放时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFreeTime(String FreeTime) {
        this.FreeTime = FreeTime;
    }

    /**
     * Get 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 硬盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(String DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 节点描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameTag 节点描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameTag() {
        return this.NameTag;
    }

    /**
     * Set 节点描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameTag 节点描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameTag(String NameTag) {
        this.NameTag = NameTag;
    }

    /**
     * Get 节点部署服务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Services 节点部署服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServices() {
        return this.Services;
    }

    /**
     * Set 节点部署服务
注意：此字段可能返回 null，表示取不到有效值。
     * @param Services 节点部署服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServices(String Services) {
        this.Services = Services;
    }

    /**
     * Get 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 磁盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootSize 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootSize 系统盘大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get 付费类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 付费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 付费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 付费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 数据库IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdbIp 数据库IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdbIp() {
        return this.CdbIp;
    }

    /**
     * Set 数据库IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdbIp 数据库IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdbIp(String CdbIp) {
        this.CdbIp = CdbIp;
    }

    /**
     * Get 数据库端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdbPort 数据库端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCdbPort() {
        return this.CdbPort;
    }

    /**
     * Set 数据库端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdbPort 数据库端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdbPort(Long CdbPort) {
        this.CdbPort = CdbPort;
    }

    /**
     * Get 硬盘容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HwDiskSize 硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHwDiskSize() {
        return this.HwDiskSize;
    }

    /**
     * Set 硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param HwDiskSize 硬盘容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHwDiskSize(Long HwDiskSize) {
        this.HwDiskSize = HwDiskSize;
    }

    /**
     * Get 硬盘容量描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HwDiskSizeDesc 硬盘容量描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHwDiskSizeDesc() {
        return this.HwDiskSizeDesc;
    }

    /**
     * Set 硬盘容量描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param HwDiskSizeDesc 硬盘容量描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHwDiskSizeDesc(String HwDiskSizeDesc) {
        this.HwDiskSizeDesc = HwDiskSizeDesc;
    }

    /**
     * Get 内存容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HwMemSize 内存容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHwMemSize() {
        return this.HwMemSize;
    }

    /**
     * Set 内存容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param HwMemSize 内存容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHwMemSize(Long HwMemSize) {
        this.HwMemSize = HwMemSize;
    }

    /**
     * Get 内存容量描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HwMemSizeDesc 内存容量描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHwMemSizeDesc() {
        return this.HwMemSizeDesc;
    }

    /**
     * Set 内存容量描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param HwMemSizeDesc 内存容量描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHwMemSizeDesc(String HwMemSizeDesc) {
        this.HwMemSizeDesc = HwMemSizeDesc;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 节点资源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmrResourceId 节点资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmrResourceId() {
        return this.EmrResourceId;
    }

    /**
     * Set 节点资源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmrResourceId 节点资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmrResourceId(String EmrResourceId) {
        this.EmrResourceId = EmrResourceId;
    }

    /**
     * Get 续费标志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAutoRenew 续费标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set 续费标志
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAutoRenew 续费标志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAutoRenew(Long IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get 设备标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceClass 设备标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set 设备标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceClass 设备标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get 支持变配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mutable 支持变配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMutable() {
        return this.Mutable;
    }

    /**
     * Set 支持变配
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mutable 支持变配
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 此节点是否可销毁，1可销毁，0不可销毁
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Destroyable 此节点是否可销毁，1可销毁，0不可销毁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDestroyable() {
        return this.Destroyable;
    }

    /**
     * Set 此节点是否可销毁，1可销毁，0不可销毁
注意：此字段可能返回 null，表示取不到有效值。
     * @param Destroyable 此节点是否可销毁，1可销毁，0不可销毁
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoFlag 是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoFlag() {
        return this.AutoFlag;
    }

    /**
     * Set 是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoFlag 是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoFlag(Long AutoFlag) {
        this.AutoFlag = AutoFlag;
    }

    /**
     * Get 资源类型, host/pod
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HardwareResourceType 资源类型, host/pod
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set 资源类型, host/pod
注意：此字段可能返回 null，表示取不到有效值。
     * @param HardwareResourceType 资源类型, host/pod
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get 是否浮动规格，1是，0否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDynamicSpec 是否浮动规格，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDynamicSpec() {
        return this.IsDynamicSpec;
    }

    /**
     * Set 是否浮动规格，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDynamicSpec 是否浮动规格，1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDynamicSpec(Long IsDynamicSpec) {
        this.IsDynamicSpec = IsDynamicSpec;
    }

    /**
     * Get 浮动规格值json字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DynamicPodSpec 浮动规格值json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDynamicPodSpec() {
        return this.DynamicPodSpec;
    }

    /**
     * Set 浮动规格值json字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param DynamicPodSpec 浮动规格值json字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDynamicPodSpec(String DynamicPodSpec) {
        this.DynamicPodSpec = DynamicPodSpec;
    }

    /**
     * Get 是否支持变更计费类型 1是，0否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportModifyPayMode 是否支持变更计费类型 1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSupportModifyPayMode() {
        return this.SupportModifyPayMode;
    }

    /**
     * Set 是否支持变更计费类型 1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportModifyPayMode 是否支持变更计费类型 1是，0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportModifyPayMode(Long SupportModifyPayMode) {
        this.SupportModifyPayMode = SupportModifyPayMode;
    }

    /**
     * Get 系统盘类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootStorageType 系统盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRootStorageType() {
        return this.RootStorageType;
    }

    /**
     * Set 系统盘类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootStorageType 系统盘类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootStorageType(Long RootStorageType) {
        this.RootStorageType = RootStorageType;
    }

    /**
     * Get 可用区信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区信息
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Clients 客户端
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClients() {
        return this.Clients;
    }

    /**
     * Set 客户端
注意：此字段可能返回 null，表示取不到有效值。
     * @param Clients 客户端
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClients(String Clients) {
        this.Clients = Clients;
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

    }
}

