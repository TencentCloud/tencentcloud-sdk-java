/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
    * <p>用户APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>序列号</p>
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * <p>机器实例ID</p>
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * <p>master节点绑定外网IP</p>
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * <p>节点类型。0:common节点；1:master节点<br>；2:core节点；3:task节点</p>
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * <p>节点规格</p>
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * <p>节点核数</p>
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * <p>节点内存,单位b</p>
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * <p>节点内存描述，单位GB</p>
    */
    @SerializedName("MemDesc")
    @Expose
    private String MemDesc;

    /**
    * <p>节点所在region</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>节点所在Zone</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>申请时间</p>
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * <p>释放时间</p>
    */
    @SerializedName("FreeTime")
    @Expose
    private String FreeTime;

    /**
    * <p>硬盘大小</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private String DiskSize;

    /**
    * <p>节点描述</p>
    */
    @SerializedName("NameTag")
    @Expose
    private String NameTag;

    /**
    * <p>节点部署服务</p>
    */
    @SerializedName("Services")
    @Expose
    private String Services;

    /**
    * <p>磁盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘</p>
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * <p>系统盘大小，单位GB</p>
    */
    @SerializedName("RootSize")
    @Expose
    private Long RootSize;

    /**
    * <p>付费类型，0：按量计费；1：包年包月</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * <p>数据库IP</p>
    */
    @SerializedName("CdbIp")
    @Expose
    private String CdbIp;

    /**
    * <p>数据库端口</p>
    */
    @SerializedName("CdbPort")
    @Expose
    private Long CdbPort;

    /**
    * <p>硬盘容量,单位b</p>
    */
    @SerializedName("HwDiskSize")
    @Expose
    private Long HwDiskSize;

    /**
    * <p>硬盘容量描述</p>
    */
    @SerializedName("HwDiskSizeDesc")
    @Expose
    private String HwDiskSizeDesc;

    /**
    * <p>内存容量，单位b</p>
    */
    @SerializedName("HwMemSize")
    @Expose
    private Long HwMemSize;

    /**
    * <p>内存容量描述</p>
    */
    @SerializedName("HwMemSizeDesc")
    @Expose
    private String HwMemSizeDesc;

    /**
    * <p>过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>节点资源ID</p>
    */
    @SerializedName("EmrResourceId")
    @Expose
    private String EmrResourceId;

    /**
    * <p>续费标志</p>
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Long IsAutoRenew;

    /**
    * <p>设备标识</p>
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * <p>支持变配</p>
    */
    @SerializedName("Mutable")
    @Expose
    private Long Mutable;

    /**
    * <p>多云盘</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MCMultiDisk")
    @Expose
    private MultiDiskMC [] MCMultiDisk;

    /**
    * <p>数据库信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdbNodeInfo")
    @Expose
    private CdbInfo CdbNodeInfo;

    /**
    * <p>内网IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>此节点是否可销毁，1可销毁，0不可销毁</p>
    */
    @SerializedName("Destroyable")
    @Expose
    private Long Destroyable;

    /**
    * <p>节点绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。</p>
    */
    @SerializedName("AutoFlag")
    @Expose
    private Long AutoFlag;

    /**
    * <p>资源类型, host/pod</p>
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * <p>是否浮动规格，1是，0否</p>
    */
    @SerializedName("IsDynamicSpec")
    @Expose
    private Long IsDynamicSpec;

    /**
    * <p>浮动规格值json字符串</p>
    */
    @SerializedName("DynamicPodSpec")
    @Expose
    private String DynamicPodSpec;

    /**
    * <p>是否支持变更计费类型 1是，0否</p>
    */
    @SerializedName("SupportModifyPayMode")
    @Expose
    private Long SupportModifyPayMode;

    /**
    * <p>系统盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘</p>
    */
    @SerializedName("RootStorageType")
    @Expose
    private Long RootStorageType;

    /**
    * <p>可用区信息</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>子网</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetInfo")
    @Expose
    private SubnetInfo SubnetInfo;

    /**
    * <p>客户端</p>
    */
    @SerializedName("Clients")
    @Expose
    private String Clients;

    /**
    * <p>系统当前时间</p>
    */
    @SerializedName("CurrentTime")
    @Expose
    private String CurrentTime;

    /**
    * <p>是否用于联邦 ,1是，0否</p>
    */
    @SerializedName("IsFederation")
    @Expose
    private Long IsFederation;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>服务</p>
    */
    @SerializedName("ServiceClient")
    @Expose
    private String ServiceClient;

    /**
    * <p>该实例是否开启实例保护，true为开启 false为关闭</p>
    */
    @SerializedName("DisableApiTermination")
    @Expose
    private Boolean DisableApiTermination;

    /**
    * <p>0表示老计费，1表示新计费</p>
    */
    @SerializedName("TradeVersion")
    @Expose
    private Long TradeVersion;

    /**
    * <p>各组件状态，Zookeeper:STARTED,ResourceManager:STARTED，STARTED已启动，STOPED已停止</p>
    */
    @SerializedName("ServicesStatus")
    @Expose
    private String ServicesStatus;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>共享集群id</p>
    */
    @SerializedName("SharedClusterId")
    @Expose
    private String SharedClusterId;

    /**
    * <p>共享集群id描述</p>
    */
    @SerializedName("SharedClusterIdDesc")
    @Expose
    private String SharedClusterIdDesc;

    /**
    * <p>是否是定时销毁资源</p>
    */
    @SerializedName("TimingResource")
    @Expose
    private Boolean TimingResource;

    /**
    * <p>资源类型（HardwareResourceType）为pod时，对应的TKE集群id</p>
    */
    @SerializedName("TkeClusterId")
    @Expose
    private String TkeClusterId;

    /**
    * <p>新挂磁盘时可支持配置的服务名称列表</p>
    */
    @SerializedName("ConfigurableServices")
    @Expose
    private String [] ConfigurableServices;

    /**
    * <p>节点标注信息，目前只提供给tf平台使用</p>
    */
    @SerializedName("NodeMark")
    @Expose
    private String NodeMark;

    /**
    * <p>包销资源是否支持设置自动续费</p>
    */
    @SerializedName("UnderwriteSetAutoRenew")
    @Expose
    private Boolean UnderwriteSetAutoRenew;

    /**
    * <p>Gpu信息</p>
    */
    @SerializedName("GpuDesc")
    @Expose
    private String GpuDesc;

    /**
    * <p>磁盘问题描述</p>
    */
    @SerializedName("DiskHealthIssues")
    @Expose
    private DiskHealthIssue [] DiskHealthIssues;

    /**
     * Get <p>用户APPID</p> 
     * @return AppId <p>用户APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户APPID</p>
     * @param AppId <p>用户APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>序列号</p> 
     * @return SerialNo <p>序列号</p>
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set <p>序列号</p>
     * @param SerialNo <p>序列号</p>
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get <p>机器实例ID</p> 
     * @return OrderNo <p>机器实例ID</p>
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set <p>机器实例ID</p>
     * @param OrderNo <p>机器实例ID</p>
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get <p>master节点绑定外网IP</p> 
     * @return WanIp <p>master节点绑定外网IP</p>
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set <p>master节点绑定外网IP</p>
     * @param WanIp <p>master节点绑定外网IP</p>
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get <p>节点类型。0:common节点；1:master节点<br>；2:core节点；3:task节点</p> 
     * @return Flag <p>节点类型。0:common节点；1:master节点<br>；2:core节点；3:task节点</p>
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set <p>节点类型。0:common节点；1:master节点<br>；2:core节点；3:task节点</p>
     * @param Flag <p>节点类型。0:common节点；1:master节点<br>；2:core节点；3:task节点</p>
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get <p>节点规格</p> 
     * @return Spec <p>节点规格</p>
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>节点规格</p>
     * @param Spec <p>节点规格</p>
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>节点核数</p> 
     * @return CpuNum <p>节点核数</p>
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set <p>节点核数</p>
     * @param CpuNum <p>节点核数</p>
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get <p>节点内存,单位b</p> 
     * @return MemSize <p>节点内存,单位b</p>
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set <p>节点内存,单位b</p>
     * @param MemSize <p>节点内存,单位b</p>
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get <p>节点内存描述，单位GB</p> 
     * @return MemDesc <p>节点内存描述，单位GB</p>
     */
    public String getMemDesc() {
        return this.MemDesc;
    }

    /**
     * Set <p>节点内存描述，单位GB</p>
     * @param MemDesc <p>节点内存描述，单位GB</p>
     */
    public void setMemDesc(String MemDesc) {
        this.MemDesc = MemDesc;
    }

    /**
     * Get <p>节点所在region</p> 
     * @return RegionId <p>节点所在region</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>节点所在region</p>
     * @param RegionId <p>节点所在region</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>节点所在Zone</p> 
     * @return ZoneId <p>节点所在Zone</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>节点所在Zone</p>
     * @param ZoneId <p>节点所在Zone</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>申请时间</p> 
     * @return ApplyTime <p>申请时间</p>
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set <p>申请时间</p>
     * @param ApplyTime <p>申请时间</p>
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get <p>释放时间</p> 
     * @return FreeTime <p>释放时间</p>
     */
    public String getFreeTime() {
        return this.FreeTime;
    }

    /**
     * Set <p>释放时间</p>
     * @param FreeTime <p>释放时间</p>
     */
    public void setFreeTime(String FreeTime) {
        this.FreeTime = FreeTime;
    }

    /**
     * Get <p>硬盘大小</p> 
     * @return DiskSize <p>硬盘大小</p>
     */
    public String getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>硬盘大小</p>
     * @param DiskSize <p>硬盘大小</p>
     */
    public void setDiskSize(String DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>节点描述</p> 
     * @return NameTag <p>节点描述</p>
     */
    public String getNameTag() {
        return this.NameTag;
    }

    /**
     * Set <p>节点描述</p>
     * @param NameTag <p>节点描述</p>
     */
    public void setNameTag(String NameTag) {
        this.NameTag = NameTag;
    }

    /**
     * Get <p>节点部署服务</p> 
     * @return Services <p>节点部署服务</p>
     */
    public String getServices() {
        return this.Services;
    }

    /**
     * Set <p>节点部署服务</p>
     * @param Services <p>节点部署服务</p>
     */
    public void setServices(String Services) {
        this.Services = Services;
    }

    /**
     * Get <p>磁盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘</p> 
     * @return StorageType <p>磁盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘</p>
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>磁盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘</p>
     * @param StorageType <p>磁盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘</p>
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>系统盘大小，单位GB</p> 
     * @return RootSize <p>系统盘大小，单位GB</p>
     */
    public Long getRootSize() {
        return this.RootSize;
    }

    /**
     * Set <p>系统盘大小，单位GB</p>
     * @param RootSize <p>系统盘大小，单位GB</p>
     */
    public void setRootSize(Long RootSize) {
        this.RootSize = RootSize;
    }

    /**
     * Get <p>付费类型，0：按量计费；1：包年包月</p> 
     * @return ChargeType <p>付费类型，0：按量计费；1：包年包月</p>
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>付费类型，0：按量计费；1：包年包月</p>
     * @param ChargeType <p>付费类型，0：按量计费；1：包年包月</p>
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>数据库IP</p> 
     * @return CdbIp <p>数据库IP</p>
     */
    public String getCdbIp() {
        return this.CdbIp;
    }

    /**
     * Set <p>数据库IP</p>
     * @param CdbIp <p>数据库IP</p>
     */
    public void setCdbIp(String CdbIp) {
        this.CdbIp = CdbIp;
    }

    /**
     * Get <p>数据库端口</p> 
     * @return CdbPort <p>数据库端口</p>
     */
    public Long getCdbPort() {
        return this.CdbPort;
    }

    /**
     * Set <p>数据库端口</p>
     * @param CdbPort <p>数据库端口</p>
     */
    public void setCdbPort(Long CdbPort) {
        this.CdbPort = CdbPort;
    }

    /**
     * Get <p>硬盘容量,单位b</p> 
     * @return HwDiskSize <p>硬盘容量,单位b</p>
     */
    public Long getHwDiskSize() {
        return this.HwDiskSize;
    }

    /**
     * Set <p>硬盘容量,单位b</p>
     * @param HwDiskSize <p>硬盘容量,单位b</p>
     */
    public void setHwDiskSize(Long HwDiskSize) {
        this.HwDiskSize = HwDiskSize;
    }

    /**
     * Get <p>硬盘容量描述</p> 
     * @return HwDiskSizeDesc <p>硬盘容量描述</p>
     */
    public String getHwDiskSizeDesc() {
        return this.HwDiskSizeDesc;
    }

    /**
     * Set <p>硬盘容量描述</p>
     * @param HwDiskSizeDesc <p>硬盘容量描述</p>
     */
    public void setHwDiskSizeDesc(String HwDiskSizeDesc) {
        this.HwDiskSizeDesc = HwDiskSizeDesc;
    }

    /**
     * Get <p>内存容量，单位b</p> 
     * @return HwMemSize <p>内存容量，单位b</p>
     */
    public Long getHwMemSize() {
        return this.HwMemSize;
    }

    /**
     * Set <p>内存容量，单位b</p>
     * @param HwMemSize <p>内存容量，单位b</p>
     */
    public void setHwMemSize(Long HwMemSize) {
        this.HwMemSize = HwMemSize;
    }

    /**
     * Get <p>内存容量描述</p> 
     * @return HwMemSizeDesc <p>内存容量描述</p>
     */
    public String getHwMemSizeDesc() {
        return this.HwMemSizeDesc;
    }

    /**
     * Set <p>内存容量描述</p>
     * @param HwMemSizeDesc <p>内存容量描述</p>
     */
    public void setHwMemSizeDesc(String HwMemSizeDesc) {
        this.HwMemSizeDesc = HwMemSizeDesc;
    }

    /**
     * Get <p>过期时间</p> 
     * @return ExpireTime <p>过期时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间</p>
     * @param ExpireTime <p>过期时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>节点资源ID</p> 
     * @return EmrResourceId <p>节点资源ID</p>
     */
    public String getEmrResourceId() {
        return this.EmrResourceId;
    }

    /**
     * Set <p>节点资源ID</p>
     * @param EmrResourceId <p>节点资源ID</p>
     */
    public void setEmrResourceId(String EmrResourceId) {
        this.EmrResourceId = EmrResourceId;
    }

    /**
     * Get <p>续费标志</p> 
     * @return IsAutoRenew <p>续费标志</p>
     */
    public Long getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set <p>续费标志</p>
     * @param IsAutoRenew <p>续费标志</p>
     */
    public void setIsAutoRenew(Long IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get <p>设备标识</p> 
     * @return DeviceClass <p>设备标识</p>
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set <p>设备标识</p>
     * @param DeviceClass <p>设备标识</p>
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get <p>支持变配</p> 
     * @return Mutable <p>支持变配</p>
     */
    public Long getMutable() {
        return this.Mutable;
    }

    /**
     * Set <p>支持变配</p>
     * @param Mutable <p>支持变配</p>
     */
    public void setMutable(Long Mutable) {
        this.Mutable = Mutable;
    }

    /**
     * Get <p>多云盘</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MCMultiDisk <p>多云盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiDiskMC [] getMCMultiDisk() {
        return this.MCMultiDisk;
    }

    /**
     * Set <p>多云盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MCMultiDisk <p>多云盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMCMultiDisk(MultiDiskMC [] MCMultiDisk) {
        this.MCMultiDisk = MCMultiDisk;
    }

    /**
     * Get <p>数据库信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdbNodeInfo <p>数据库信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CdbInfo getCdbNodeInfo() {
        return this.CdbNodeInfo;
    }

    /**
     * Set <p>数据库信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdbNodeInfo <p>数据库信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdbNodeInfo(CdbInfo CdbNodeInfo) {
        this.CdbNodeInfo = CdbNodeInfo;
    }

    /**
     * Get <p>内网IP</p> 
     * @return Ip <p>内网IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>内网IP</p>
     * @param Ip <p>内网IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>此节点是否可销毁，1可销毁，0不可销毁</p> 
     * @return Destroyable <p>此节点是否可销毁，1可销毁，0不可销毁</p>
     */
    public Long getDestroyable() {
        return this.Destroyable;
    }

    /**
     * Set <p>此节点是否可销毁，1可销毁，0不可销毁</p>
     * @param Destroyable <p>此节点是否可销毁，1可销毁，0不可销毁</p>
     */
    public void setDestroyable(Long Destroyable) {
        this.Destroyable = Destroyable;
    }

    /**
     * Get <p>节点绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>节点绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>节点绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>节点绑定的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。</p> 
     * @return AutoFlag <p>是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。</p>
     */
    public Long getAutoFlag() {
        return this.AutoFlag;
    }

    /**
     * Set <p>是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。</p>
     * @param AutoFlag <p>是否是自动扩缩容节点，0为普通节点，1为自动扩缩容节点。</p>
     */
    public void setAutoFlag(Long AutoFlag) {
        this.AutoFlag = AutoFlag;
    }

    /**
     * Get <p>资源类型, host/pod</p> 
     * @return HardwareResourceType <p>资源类型, host/pod</p>
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set <p>资源类型, host/pod</p>
     * @param HardwareResourceType <p>资源类型, host/pod</p>
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get <p>是否浮动规格，1是，0否</p> 
     * @return IsDynamicSpec <p>是否浮动规格，1是，0否</p>
     */
    public Long getIsDynamicSpec() {
        return this.IsDynamicSpec;
    }

    /**
     * Set <p>是否浮动规格，1是，0否</p>
     * @param IsDynamicSpec <p>是否浮动规格，1是，0否</p>
     */
    public void setIsDynamicSpec(Long IsDynamicSpec) {
        this.IsDynamicSpec = IsDynamicSpec;
    }

    /**
     * Get <p>浮动规格值json字符串</p> 
     * @return DynamicPodSpec <p>浮动规格值json字符串</p>
     */
    public String getDynamicPodSpec() {
        return this.DynamicPodSpec;
    }

    /**
     * Set <p>浮动规格值json字符串</p>
     * @param DynamicPodSpec <p>浮动规格值json字符串</p>
     */
    public void setDynamicPodSpec(String DynamicPodSpec) {
        this.DynamicPodSpec = DynamicPodSpec;
    }

    /**
     * Get <p>是否支持变更计费类型 1是，0否</p> 
     * @return SupportModifyPayMode <p>是否支持变更计费类型 1是，0否</p>
     */
    public Long getSupportModifyPayMode() {
        return this.SupportModifyPayMode;
    }

    /**
     * Set <p>是否支持变更计费类型 1是，0否</p>
     * @param SupportModifyPayMode <p>是否支持变更计费类型 1是，0否</p>
     */
    public void setSupportModifyPayMode(Long SupportModifyPayMode) {
        this.SupportModifyPayMode = SupportModifyPayMode;
    }

    /**
     * Get <p>系统盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘</p> 
     * @return RootStorageType <p>系统盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘</p>
     */
    public Long getRootStorageType() {
        return this.RootStorageType;
    }

    /**
     * Set <p>系统盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘</p>
     * @param RootStorageType <p>系统盘类型，1 :本地盘 2 :云硬盘 3 : 本地SSD 4 : 云SSD 5 : 高效云盘 6 : 增强型SSD云硬盘 11 : 吞吐型云硬盘 12 : 极速型SSD云硬盘 13 : 通用型SSD云硬盘 14 : 大数据型云硬盘 15 : 高IO型云硬盘 16 : 远端SSD盘</p>
     */
    public void setRootStorageType(Long RootStorageType) {
        this.RootStorageType = RootStorageType;
    }

    /**
     * Get <p>可用区信息</p> 
     * @return Zone <p>可用区信息</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区信息</p>
     * @param Zone <p>可用区信息</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>子网</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetInfo <p>子网</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubnetInfo getSubnetInfo() {
        return this.SubnetInfo;
    }

    /**
     * Set <p>子网</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetInfo <p>子网</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetInfo(SubnetInfo SubnetInfo) {
        this.SubnetInfo = SubnetInfo;
    }

    /**
     * Get <p>客户端</p> 
     * @return Clients <p>客户端</p>
     */
    public String getClients() {
        return this.Clients;
    }

    /**
     * Set <p>客户端</p>
     * @param Clients <p>客户端</p>
     */
    public void setClients(String Clients) {
        this.Clients = Clients;
    }

    /**
     * Get <p>系统当前时间</p> 
     * @return CurrentTime <p>系统当前时间</p>
     */
    public String getCurrentTime() {
        return this.CurrentTime;
    }

    /**
     * Set <p>系统当前时间</p>
     * @param CurrentTime <p>系统当前时间</p>
     */
    public void setCurrentTime(String CurrentTime) {
        this.CurrentTime = CurrentTime;
    }

    /**
     * Get <p>是否用于联邦 ,1是，0否</p> 
     * @return IsFederation <p>是否用于联邦 ,1是，0否</p>
     */
    public Long getIsFederation() {
        return this.IsFederation;
    }

    /**
     * Set <p>是否用于联邦 ,1是，0否</p>
     * @param IsFederation <p>是否用于联邦 ,1是，0否</p>
     */
    public void setIsFederation(Long IsFederation) {
        this.IsFederation = IsFederation;
    }

    /**
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>服务</p> 
     * @return ServiceClient <p>服务</p>
     */
    public String getServiceClient() {
        return this.ServiceClient;
    }

    /**
     * Set <p>服务</p>
     * @param ServiceClient <p>服务</p>
     */
    public void setServiceClient(String ServiceClient) {
        this.ServiceClient = ServiceClient;
    }

    /**
     * Get <p>该实例是否开启实例保护，true为开启 false为关闭</p> 
     * @return DisableApiTermination <p>该实例是否开启实例保护，true为开启 false为关闭</p>
     */
    public Boolean getDisableApiTermination() {
        return this.DisableApiTermination;
    }

    /**
     * Set <p>该实例是否开启实例保护，true为开启 false为关闭</p>
     * @param DisableApiTermination <p>该实例是否开启实例保护，true为开启 false为关闭</p>
     */
    public void setDisableApiTermination(Boolean DisableApiTermination) {
        this.DisableApiTermination = DisableApiTermination;
    }

    /**
     * Get <p>0表示老计费，1表示新计费</p> 
     * @return TradeVersion <p>0表示老计费，1表示新计费</p>
     */
    public Long getTradeVersion() {
        return this.TradeVersion;
    }

    /**
     * Set <p>0表示老计费，1表示新计费</p>
     * @param TradeVersion <p>0表示老计费，1表示新计费</p>
     */
    public void setTradeVersion(Long TradeVersion) {
        this.TradeVersion = TradeVersion;
    }

    /**
     * Get <p>各组件状态，Zookeeper:STARTED,ResourceManager:STARTED，STARTED已启动，STOPED已停止</p> 
     * @return ServicesStatus <p>各组件状态，Zookeeper:STARTED,ResourceManager:STARTED，STARTED已启动，STOPED已停止</p>
     */
    public String getServicesStatus() {
        return this.ServicesStatus;
    }

    /**
     * Set <p>各组件状态，Zookeeper:STARTED,ResourceManager:STARTED，STARTED已启动，STOPED已停止</p>
     * @param ServicesStatus <p>各组件状态，Zookeeper:STARTED,ResourceManager:STARTED，STARTED已启动，STOPED已停止</p>
     */
    public void setServicesStatus(String ServicesStatus) {
        this.ServicesStatus = ServicesStatus;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>共享集群id</p> 
     * @return SharedClusterId <p>共享集群id</p>
     */
    public String getSharedClusterId() {
        return this.SharedClusterId;
    }

    /**
     * Set <p>共享集群id</p>
     * @param SharedClusterId <p>共享集群id</p>
     */
    public void setSharedClusterId(String SharedClusterId) {
        this.SharedClusterId = SharedClusterId;
    }

    /**
     * Get <p>共享集群id描述</p> 
     * @return SharedClusterIdDesc <p>共享集群id描述</p>
     */
    public String getSharedClusterIdDesc() {
        return this.SharedClusterIdDesc;
    }

    /**
     * Set <p>共享集群id描述</p>
     * @param SharedClusterIdDesc <p>共享集群id描述</p>
     */
    public void setSharedClusterIdDesc(String SharedClusterIdDesc) {
        this.SharedClusterIdDesc = SharedClusterIdDesc;
    }

    /**
     * Get <p>是否是定时销毁资源</p> 
     * @return TimingResource <p>是否是定时销毁资源</p>
     */
    public Boolean getTimingResource() {
        return this.TimingResource;
    }

    /**
     * Set <p>是否是定时销毁资源</p>
     * @param TimingResource <p>是否是定时销毁资源</p>
     */
    public void setTimingResource(Boolean TimingResource) {
        this.TimingResource = TimingResource;
    }

    /**
     * Get <p>资源类型（HardwareResourceType）为pod时，对应的TKE集群id</p> 
     * @return TkeClusterId <p>资源类型（HardwareResourceType）为pod时，对应的TKE集群id</p>
     */
    public String getTkeClusterId() {
        return this.TkeClusterId;
    }

    /**
     * Set <p>资源类型（HardwareResourceType）为pod时，对应的TKE集群id</p>
     * @param TkeClusterId <p>资源类型（HardwareResourceType）为pod时，对应的TKE集群id</p>
     */
    public void setTkeClusterId(String TkeClusterId) {
        this.TkeClusterId = TkeClusterId;
    }

    /**
     * Get <p>新挂磁盘时可支持配置的服务名称列表</p> 
     * @return ConfigurableServices <p>新挂磁盘时可支持配置的服务名称列表</p>
     */
    public String [] getConfigurableServices() {
        return this.ConfigurableServices;
    }

    /**
     * Set <p>新挂磁盘时可支持配置的服务名称列表</p>
     * @param ConfigurableServices <p>新挂磁盘时可支持配置的服务名称列表</p>
     */
    public void setConfigurableServices(String [] ConfigurableServices) {
        this.ConfigurableServices = ConfigurableServices;
    }

    /**
     * Get <p>节点标注信息，目前只提供给tf平台使用</p> 
     * @return NodeMark <p>节点标注信息，目前只提供给tf平台使用</p>
     */
    public String getNodeMark() {
        return this.NodeMark;
    }

    /**
     * Set <p>节点标注信息，目前只提供给tf平台使用</p>
     * @param NodeMark <p>节点标注信息，目前只提供给tf平台使用</p>
     */
    public void setNodeMark(String NodeMark) {
        this.NodeMark = NodeMark;
    }

    /**
     * Get <p>包销资源是否支持设置自动续费</p> 
     * @return UnderwriteSetAutoRenew <p>包销资源是否支持设置自动续费</p>
     */
    public Boolean getUnderwriteSetAutoRenew() {
        return this.UnderwriteSetAutoRenew;
    }

    /**
     * Set <p>包销资源是否支持设置自动续费</p>
     * @param UnderwriteSetAutoRenew <p>包销资源是否支持设置自动续费</p>
     */
    public void setUnderwriteSetAutoRenew(Boolean UnderwriteSetAutoRenew) {
        this.UnderwriteSetAutoRenew = UnderwriteSetAutoRenew;
    }

    /**
     * Get <p>Gpu信息</p> 
     * @return GpuDesc <p>Gpu信息</p>
     */
    public String getGpuDesc() {
        return this.GpuDesc;
    }

    /**
     * Set <p>Gpu信息</p>
     * @param GpuDesc <p>Gpu信息</p>
     */
    public void setGpuDesc(String GpuDesc) {
        this.GpuDesc = GpuDesc;
    }

    /**
     * Get <p>磁盘问题描述</p> 
     * @return DiskHealthIssues <p>磁盘问题描述</p>
     */
    public DiskHealthIssue [] getDiskHealthIssues() {
        return this.DiskHealthIssues;
    }

    /**
     * Set <p>磁盘问题描述</p>
     * @param DiskHealthIssues <p>磁盘问题描述</p>
     */
    public void setDiskHealthIssues(DiskHealthIssue [] DiskHealthIssues) {
        this.DiskHealthIssues = DiskHealthIssues;
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
        if (source.NodeMark != null) {
            this.NodeMark = new String(source.NodeMark);
        }
        if (source.UnderwriteSetAutoRenew != null) {
            this.UnderwriteSetAutoRenew = new Boolean(source.UnderwriteSetAutoRenew);
        }
        if (source.GpuDesc != null) {
            this.GpuDesc = new String(source.GpuDesc);
        }
        if (source.DiskHealthIssues != null) {
            this.DiskHealthIssues = new DiskHealthIssue[source.DiskHealthIssues.length];
            for (int i = 0; i < source.DiskHealthIssues.length; i++) {
                this.DiskHealthIssues[i] = new DiskHealthIssue(source.DiskHealthIssues[i]);
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
        this.setParamSimple(map, prefix + "NodeMark", this.NodeMark);
        this.setParamSimple(map, prefix + "UnderwriteSetAutoRenew", this.UnderwriteSetAutoRenew);
        this.setParamSimple(map, prefix + "GpuDesc", this.GpuDesc);
        this.setParamArrayObj(map, prefix + "DiskHealthIssues.", this.DiskHealthIssues);

    }
}

