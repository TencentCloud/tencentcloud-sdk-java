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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * <p>计算节点数量</p>
    */
    @SerializedName("ComputeNodeNum")
    @Expose
    private Long ComputeNodeNum;

    /**
    * <p>区域</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>创建实例版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateVersion")
    @Expose
    private String CreateVersion;

    /**
    * <p>初始化实例参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitParams")
    @Expose
    private InstanceParam [] InitParams;

    /**
    * <p>实例状态：creating、created、initializing、running、modifying、isolating、isolated、destroying、destroyed</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>存储节点数量</p>
    */
    @SerializedName("StorageNodeNum")
    @Expose
    private Long StorageNodeNum;

    /**
    * <p>实例标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>计算节点cpu核数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>字符型vpcid</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>计算节点mem，单位GB</p>
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * <p>子网IP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>字符型subnetid</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>子网端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>存储节点磁盘容量，单位GB</p>
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * <p>实例创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>实例所属地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>实例状态中文描述</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>管控节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MCCpu")
    @Expose
    private Long MCCpu;

    /**
    * <p>管控节点CPU大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MCMem")
    @Expose
    private Long MCMem;

    /**
    * <p>计算节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputerNodeCpu")
    @Expose
    private Long ComputerNodeCpu;

    /**
    * <p>计算节点内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputerNodeMem")
    @Expose
    private Long ComputerNodeMem;

    /**
    * <p>存储节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageNodeCpu")
    @Expose
    private Long StorageNodeCpu;

    /**
    * <p>存储节点内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageNodeMem")
    @Expose
    private Long StorageNodeMem;

    /**
    * <p>管控节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MCNum")
    @Expose
    private Long MCNum;

    /**
    * <p>续费标志</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>付费模式，0按量付费；1包年包月</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>用户标签，inner：内部用户；external：外部用户</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountTag")
    @Expose
    private String AccountTag;

    /**
    * <p>实例架构类型，separate:分离架构；hyper:对等架构</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestroyedAt")
    @Expose
    private String DestroyedAt;

    /**
    * <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireAt")
    @Expose
    private String ExpireAt;

    /**
    * <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedAt")
    @Expose
    private String IsolatedAt;

    /**
    * <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedFrom")
    @Expose
    private String IsolatedFrom;

    /**
    * <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replications")
    @Expose
    private Long Replications;

    /**
    * <p>全能型副本数</p>
    */
    @SerializedName("FullReplications")
    @Expose
    private Long FullReplications;

    /**
    * <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>AZ信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>实例节点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nodes")
    @Expose
    private InstanceNode [] Nodes;

    /**
    * <p>binlog是否打开</p>
    */
    @SerializedName("BinlogStatus")
    @Expose
    private Long BinlogStatus;

    /**
    * <p>cdc节点核数</p>
    */
    @SerializedName("CdcNodeCpu")
    @Expose
    private Long CdcNodeCpu;

    /**
    * <p>cdc节点内存大小</p>
    */
    @SerializedName("CdcNodeMem")
    @Expose
    private Long CdcNodeMem;

    /**
    * <p>cdc节点数</p>
    */
    @SerializedName("CdcNodeNum")
    @Expose
    private Long CdcNodeNum;

    /**
    * <p>az模式，1: 单AZ 2: 多AZ非主AZ模式 3: 多AZ主AZ模式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AZMode")
    @Expose
    private Long AZMode;

    /**
    * <p>灾备标志位，1: 无灾备关系；2: 灾备主实例；3: 灾备备实例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandbyFlag")
    @Expose
    private Long StandbyFlag;

    /**
    * <p>连接的备实例数量（仅当 StandbyFlag == 2 时有效）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandbySecondaryNum")
    @Expose
    private Long StandbySecondaryNum;

    /**
    * <p>列存节点 cpu 核数</p>
    */
    @SerializedName("ColumnarNodeCpu")
    @Expose
    private Long ColumnarNodeCpu;

    /**
    * <p>列存节点内存大小</p>
    */
    @SerializedName("ColumnarNodeMem")
    @Expose
    private Long ColumnarNodeMem;

    /**
    * <p>列存节点数</p>
    */
    @SerializedName("ColumnarNodeNum")
    @Expose
    private Long ColumnarNodeNum;

    /**
    * <p>列存节点磁盘容量，单位GB</p>
    */
    @SerializedName("ColumnarNodeDisk")
    @Expose
    private Long ColumnarNodeDisk;

    /**
    * <p>列存节点磁盘类型</p>
    */
    @SerializedName("ColumnarNodeStorageType")
    @Expose
    private String ColumnarNodeStorageType;

    /**
    * <p>独享标志位，1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）</p>
    */
    @SerializedName("InstanceCategory")
    @Expose
    private Long InstanceCategory;

    /**
    * <p>dbdc-xxxxx</p>
    */
    @SerializedName("ExclusiveClusterId")
    @Expose
    private String ExclusiveClusterId;

    /**
    * <p>兼容模式</p>
    */
    @SerializedName("SQLMode")
    @Expose
    private String SQLMode;

    /**
    * <p>实例模式</p>
    */
    @SerializedName("InstanceMode")
    @Expose
    private String InstanceMode;

    /**
    * <p>实例发货平台</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>自动扩容配置</p>
    */
    @SerializedName("AutoScaleConfig")
    @Expose
    private AutoScalingConfig AutoScaleConfig;

    /**
    * <p>分析引擎模式</p><p>枚举值：</p><ul><li>libra： LibraDB分析引擎模式</li></ul>
    */
    @SerializedName("AnalysisMode")
    @Expose
    private String AnalysisMode;

    /**
    * <p>分析引擎关系信息</p>
    */
    @SerializedName("AnalysisRelationInfos")
    @Expose
    private AnalysisRelationInfo [] AnalysisRelationInfos;

    /**
    * <p>分析引擎实例信息</p>
    */
    @SerializedName("AnalysisInstanceInfo")
    @Expose
    private AnalysisInstanceInfo AnalysisInstanceInfo;

    /**
     * Get <p>计算节点数量</p> 
     * @return ComputeNodeNum <p>计算节点数量</p>
     * @deprecated
     */
    @Deprecated
    public Long getComputeNodeNum() {
        return this.ComputeNodeNum;
    }

    /**
     * Set <p>计算节点数量</p>
     * @param ComputeNodeNum <p>计算节点数量</p>
     * @deprecated
     */
    @Deprecated
    public void setComputeNodeNum(Long ComputeNodeNum) {
        this.ComputeNodeNum = ComputeNodeNum;
    }

    /**
     * Get <p>区域</p> 
     * @return Zone <p>区域</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>区域</p>
     * @param Zone <p>区域</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>创建实例版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateVersion <p>创建实例版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateVersion() {
        return this.CreateVersion;
    }

    /**
     * Set <p>创建实例版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateVersion <p>创建实例版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateVersion(String CreateVersion) {
        this.CreateVersion = CreateVersion;
    }

    /**
     * Get <p>初始化实例参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitParams <p>初始化实例参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceParam [] getInitParams() {
        return this.InitParams;
    }

    /**
     * Set <p>初始化实例参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitParams <p>初始化实例参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitParams(InstanceParam [] InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get <p>实例状态：creating、created、initializing、running、modifying、isolating、isolated、destroying、destroyed</p> 
     * @return Status <p>实例状态：creating、created、initializing、running、modifying、isolating、isolated、destroying、destroyed</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态：creating、created、initializing、running、modifying、isolating、isolated、destroying、destroyed</p>
     * @param Status <p>实例状态：creating、created、initializing、running、modifying、isolating、isolated、destroying、destroyed</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>存储节点数量</p> 
     * @return StorageNodeNum <p>存储节点数量</p>
     */
    public Long getStorageNodeNum() {
        return this.StorageNodeNum;
    }

    /**
     * Set <p>存储节点数量</p>
     * @param StorageNodeNum <p>存储节点数量</p>
     */
    public void setStorageNodeNum(Long StorageNodeNum) {
        this.StorageNodeNum = StorageNodeNum;
    }

    /**
     * Get <p>实例标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTags <p>实例标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>实例标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTags <p>实例标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>计算节点cpu核数</p> 
     * @return Cpu <p>计算节点cpu核数</p>
     * @deprecated
     */
    @Deprecated
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>计算节点cpu核数</p>
     * @param Cpu <p>计算节点cpu核数</p>
     * @deprecated
     */
    @Deprecated
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>字符型vpcid</p> 
     * @return VpcId <p>字符型vpcid</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>字符型vpcid</p>
     * @param VpcId <p>字符型vpcid</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>计算节点mem，单位GB</p> 
     * @return Mem <p>计算节点mem，单位GB</p>
     * @deprecated
     */
    @Deprecated
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set <p>计算节点mem，单位GB</p>
     * @param Mem <p>计算节点mem，单位GB</p>
     * @deprecated
     */
    @Deprecated
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>子网IP</p> 
     * @return Vip <p>子网IP</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>子网IP</p>
     * @param Vip <p>子网IP</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>字符型subnetid</p> 
     * @return SubnetId <p>字符型subnetid</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>字符型subnetid</p>
     * @param SubnetId <p>字符型subnetid</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>子网端口</p> 
     * @return Vport <p>子网端口</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>子网端口</p>
     * @param Vport <p>子网端口</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>存储节点磁盘容量，单位GB</p> 
     * @return Disk <p>存储节点磁盘容量，单位GB</p>
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set <p>存储节点磁盘容量，单位GB</p>
     * @param Disk <p>存储节点磁盘容量，单位GB</p>
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get <p>实例创建时间</p> 
     * @return CreateTime <p>实例创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>实例创建时间</p>
     * @param CreateTime <p>实例创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>实例所属地域</p> 
     * @return Region <p>实例所属地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>实例所属地域</p>
     * @param Region <p>实例所属地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>实例状态中文描述</p> 
     * @return StatusDesc <p>实例状态中文描述</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>实例状态中文描述</p>
     * @param StatusDesc <p>实例状态中文描述</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>管控节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MCCpu <p>管控节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getMCCpu() {
        return this.MCCpu;
    }

    /**
     * Set <p>管控节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MCCpu <p>管控节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setMCCpu(Long MCCpu) {
        this.MCCpu = MCCpu;
    }

    /**
     * Get <p>管控节点CPU大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MCMem <p>管控节点CPU大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getMCMem() {
        return this.MCMem;
    }

    /**
     * Set <p>管控节点CPU大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MCMem <p>管控节点CPU大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setMCMem(Long MCMem) {
        this.MCMem = MCMem;
    }

    /**
     * Get <p>计算节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputerNodeCpu <p>计算节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getComputerNodeCpu() {
        return this.ComputerNodeCpu;
    }

    /**
     * Set <p>计算节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputerNodeCpu <p>计算节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setComputerNodeCpu(Long ComputerNodeCpu) {
        this.ComputerNodeCpu = ComputerNodeCpu;
    }

    /**
     * Get <p>计算节点内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputerNodeMem <p>计算节点内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getComputerNodeMem() {
        return this.ComputerNodeMem;
    }

    /**
     * Set <p>计算节点内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputerNodeMem <p>计算节点内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setComputerNodeMem(Long ComputerNodeMem) {
        this.ComputerNodeMem = ComputerNodeMem;
    }

    /**
     * Get <p>存储节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageNodeCpu <p>存储节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageNodeCpu() {
        return this.StorageNodeCpu;
    }

    /**
     * Set <p>存储节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageNodeCpu <p>存储节点CPU核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageNodeCpu(Long StorageNodeCpu) {
        this.StorageNodeCpu = StorageNodeCpu;
    }

    /**
     * Get <p>存储节点内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageNodeMem <p>存储节点内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageNodeMem() {
        return this.StorageNodeMem;
    }

    /**
     * Set <p>存储节点内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageNodeMem <p>存储节点内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageNodeMem(Long StorageNodeMem) {
        this.StorageNodeMem = StorageNodeMem;
    }

    /**
     * Get <p>管控节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MCNum <p>管控节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public Long getMCNum() {
        return this.MCNum;
    }

    /**
     * Set <p>管控节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MCNum <p>管控节点数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setMCNum(Long MCNum) {
        this.MCNum = MCNum;
    }

    /**
     * Get <p>续费标志</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag <p>续费标志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>续费标志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag <p>续费标志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>付费模式，0按量付费；1包年包月</p> 
     * @return PayMode <p>付费模式，0按量付费；1包年包月</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式，0按量付费；1包年包月</p>
     * @param PayMode <p>付费模式，0按量付费；1包年包月</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>用户标签，inner：内部用户；external：外部用户</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountTag <p>用户标签，inner：内部用户；external：外部用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountTag() {
        return this.AccountTag;
    }

    /**
     * Set <p>用户标签，inner：内部用户；external：外部用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountTag <p>用户标签，inner：内部用户；external：外部用户</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountTag(String AccountTag) {
        this.AccountTag = AccountTag;
    }

    /**
     * Get <p>实例架构类型，separate:分离架构；hyper:对等架构</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType <p>实例架构类型，separate:分离架构；hyper:对等架构</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例架构类型，separate:分离架构；hyper:对等架构</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType <p>实例架构类型，separate:分离架构；hyper:对等架构</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType <p>磁盘类型，CLOUD_HSSD增强型SSD,CLOUD_TCS本地SSD盘</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestroyedAt <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestroyedAt() {
        return this.DestroyedAt;
    }

    /**
     * Set <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestroyedAt <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestroyedAt(String DestroyedAt) {
        this.DestroyedAt = DestroyedAt;
    }

    /**
     * Get <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireAt <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireAt() {
        return this.ExpireAt;
    }

    /**
     * Set <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireAt <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireAt(String ExpireAt) {
        this.ExpireAt = ExpireAt;
    }

    /**
     * Get <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedAt <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedAt() {
        return this.IsolatedAt;
    }

    /**
     * Set <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedAt <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedAt(String IsolatedAt) {
        this.IsolatedAt = IsolatedAt;
    }

    /**
     * Get <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedFrom <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedFrom() {
        return this.IsolatedFrom;
    }

    /**
     * Set <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedFrom <p>&quot;0000-00-00 00:00:00&quot;</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedFrom(String IsolatedFrom) {
        this.IsolatedFrom = IsolatedFrom;
    }

    /**
     * Get <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replications <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplications() {
        return this.Replications;
    }

    /**
     * Set <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replications <p>1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplications(Long Replications) {
        this.Replications = Replications;
    }

    /**
     * Get <p>全能型副本数</p> 
     * @return FullReplications <p>全能型副本数</p>
     */
    public Long getFullReplications() {
        return this.FullReplications;
    }

    /**
     * Set <p>全能型副本数</p>
     * @param FullReplications <p>全能型副本数</p>
     */
    public void setFullReplications(Long FullReplications) {
        this.FullReplications = FullReplications;
    }

    /**
     * Get <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin <p>账号信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>AZ信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zones <p>AZ信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>AZ信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zones <p>AZ信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>实例节点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nodes <p>实例节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set <p>实例节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nodes <p>实例节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodes(InstanceNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get <p>binlog是否打开</p> 
     * @return BinlogStatus <p>binlog是否打开</p>
     */
    public Long getBinlogStatus() {
        return this.BinlogStatus;
    }

    /**
     * Set <p>binlog是否打开</p>
     * @param BinlogStatus <p>binlog是否打开</p>
     */
    public void setBinlogStatus(Long BinlogStatus) {
        this.BinlogStatus = BinlogStatus;
    }

    /**
     * Get <p>cdc节点核数</p> 
     * @return CdcNodeCpu <p>cdc节点核数</p>
     * @deprecated
     */
    @Deprecated
    public Long getCdcNodeCpu() {
        return this.CdcNodeCpu;
    }

    /**
     * Set <p>cdc节点核数</p>
     * @param CdcNodeCpu <p>cdc节点核数</p>
     * @deprecated
     */
    @Deprecated
    public void setCdcNodeCpu(Long CdcNodeCpu) {
        this.CdcNodeCpu = CdcNodeCpu;
    }

    /**
     * Get <p>cdc节点内存大小</p> 
     * @return CdcNodeMem <p>cdc节点内存大小</p>
     * @deprecated
     */
    @Deprecated
    public Long getCdcNodeMem() {
        return this.CdcNodeMem;
    }

    /**
     * Set <p>cdc节点内存大小</p>
     * @param CdcNodeMem <p>cdc节点内存大小</p>
     * @deprecated
     */
    @Deprecated
    public void setCdcNodeMem(Long CdcNodeMem) {
        this.CdcNodeMem = CdcNodeMem;
    }

    /**
     * Get <p>cdc节点数</p> 
     * @return CdcNodeNum <p>cdc节点数</p>
     * @deprecated
     */
    @Deprecated
    public Long getCdcNodeNum() {
        return this.CdcNodeNum;
    }

    /**
     * Set <p>cdc节点数</p>
     * @param CdcNodeNum <p>cdc节点数</p>
     * @deprecated
     */
    @Deprecated
    public void setCdcNodeNum(Long CdcNodeNum) {
        this.CdcNodeNum = CdcNodeNum;
    }

    /**
     * Get <p>az模式，1: 单AZ 2: 多AZ非主AZ模式 3: 多AZ主AZ模式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AZMode <p>az模式，1: 单AZ 2: 多AZ非主AZ模式 3: 多AZ主AZ模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAZMode() {
        return this.AZMode;
    }

    /**
     * Set <p>az模式，1: 单AZ 2: 多AZ非主AZ模式 3: 多AZ主AZ模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AZMode <p>az模式，1: 单AZ 2: 多AZ非主AZ模式 3: 多AZ主AZ模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAZMode(Long AZMode) {
        this.AZMode = AZMode;
    }

    /**
     * Get <p>灾备标志位，1: 无灾备关系；2: 灾备主实例；3: 灾备备实例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandbyFlag <p>灾备标志位，1: 无灾备关系；2: 灾备主实例；3: 灾备备实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStandbyFlag() {
        return this.StandbyFlag;
    }

    /**
     * Set <p>灾备标志位，1: 无灾备关系；2: 灾备主实例；3: 灾备备实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandbyFlag <p>灾备标志位，1: 无灾备关系；2: 灾备主实例；3: 灾备备实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandbyFlag(Long StandbyFlag) {
        this.StandbyFlag = StandbyFlag;
    }

    /**
     * Get <p>连接的备实例数量（仅当 StandbyFlag == 2 时有效）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandbySecondaryNum <p>连接的备实例数量（仅当 StandbyFlag == 2 时有效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStandbySecondaryNum() {
        return this.StandbySecondaryNum;
    }

    /**
     * Set <p>连接的备实例数量（仅当 StandbyFlag == 2 时有效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandbySecondaryNum <p>连接的备实例数量（仅当 StandbyFlag == 2 时有效）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandbySecondaryNum(Long StandbySecondaryNum) {
        this.StandbySecondaryNum = StandbySecondaryNum;
    }

    /**
     * Get <p>列存节点 cpu 核数</p> 
     * @return ColumnarNodeCpu <p>列存节点 cpu 核数</p>
     */
    public Long getColumnarNodeCpu() {
        return this.ColumnarNodeCpu;
    }

    /**
     * Set <p>列存节点 cpu 核数</p>
     * @param ColumnarNodeCpu <p>列存节点 cpu 核数</p>
     */
    public void setColumnarNodeCpu(Long ColumnarNodeCpu) {
        this.ColumnarNodeCpu = ColumnarNodeCpu;
    }

    /**
     * Get <p>列存节点内存大小</p> 
     * @return ColumnarNodeMem <p>列存节点内存大小</p>
     */
    public Long getColumnarNodeMem() {
        return this.ColumnarNodeMem;
    }

    /**
     * Set <p>列存节点内存大小</p>
     * @param ColumnarNodeMem <p>列存节点内存大小</p>
     */
    public void setColumnarNodeMem(Long ColumnarNodeMem) {
        this.ColumnarNodeMem = ColumnarNodeMem;
    }

    /**
     * Get <p>列存节点数</p> 
     * @return ColumnarNodeNum <p>列存节点数</p>
     */
    public Long getColumnarNodeNum() {
        return this.ColumnarNodeNum;
    }

    /**
     * Set <p>列存节点数</p>
     * @param ColumnarNodeNum <p>列存节点数</p>
     */
    public void setColumnarNodeNum(Long ColumnarNodeNum) {
        this.ColumnarNodeNum = ColumnarNodeNum;
    }

    /**
     * Get <p>列存节点磁盘容量，单位GB</p> 
     * @return ColumnarNodeDisk <p>列存节点磁盘容量，单位GB</p>
     */
    public Long getColumnarNodeDisk() {
        return this.ColumnarNodeDisk;
    }

    /**
     * Set <p>列存节点磁盘容量，单位GB</p>
     * @param ColumnarNodeDisk <p>列存节点磁盘容量，单位GB</p>
     */
    public void setColumnarNodeDisk(Long ColumnarNodeDisk) {
        this.ColumnarNodeDisk = ColumnarNodeDisk;
    }

    /**
     * Get <p>列存节点磁盘类型</p> 
     * @return ColumnarNodeStorageType <p>列存节点磁盘类型</p>
     */
    public String getColumnarNodeStorageType() {
        return this.ColumnarNodeStorageType;
    }

    /**
     * Set <p>列存节点磁盘类型</p>
     * @param ColumnarNodeStorageType <p>列存节点磁盘类型</p>
     */
    public void setColumnarNodeStorageType(String ColumnarNodeStorageType) {
        this.ColumnarNodeStorageType = ColumnarNodeStorageType;
    }

    /**
     * Get <p>独享标志位，1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）</p> 
     * @return InstanceCategory <p>独享标志位，1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）</p>
     */
    public Long getInstanceCategory() {
        return this.InstanceCategory;
    }

    /**
     * Set <p>独享标志位，1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）</p>
     * @param InstanceCategory <p>独享标志位，1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）</p>
     */
    public void setInstanceCategory(Long InstanceCategory) {
        this.InstanceCategory = InstanceCategory;
    }

    /**
     * Get <p>dbdc-xxxxx</p> 
     * @return ExclusiveClusterId <p>dbdc-xxxxx</p>
     */
    public String getExclusiveClusterId() {
        return this.ExclusiveClusterId;
    }

    /**
     * Set <p>dbdc-xxxxx</p>
     * @param ExclusiveClusterId <p>dbdc-xxxxx</p>
     */
    public void setExclusiveClusterId(String ExclusiveClusterId) {
        this.ExclusiveClusterId = ExclusiveClusterId;
    }

    /**
     * Get <p>兼容模式</p> 
     * @return SQLMode <p>兼容模式</p>
     */
    public String getSQLMode() {
        return this.SQLMode;
    }

    /**
     * Set <p>兼容模式</p>
     * @param SQLMode <p>兼容模式</p>
     */
    public void setSQLMode(String SQLMode) {
        this.SQLMode = SQLMode;
    }

    /**
     * Get <p>实例模式</p> 
     * @return InstanceMode <p>实例模式</p>
     */
    public String getInstanceMode() {
        return this.InstanceMode;
    }

    /**
     * Set <p>实例模式</p>
     * @param InstanceMode <p>实例模式</p>
     */
    public void setInstanceMode(String InstanceMode) {
        this.InstanceMode = InstanceMode;
    }

    /**
     * Get <p>实例发货平台</p> 
     * @return ClusterId <p>实例发货平台</p>
     * @deprecated
     */
    @Deprecated
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>实例发货平台</p>
     * @param ClusterId <p>实例发货平台</p>
     * @deprecated
     */
    @Deprecated
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>自动扩容配置</p> 
     * @return AutoScaleConfig <p>自动扩容配置</p>
     */
    public AutoScalingConfig getAutoScaleConfig() {
        return this.AutoScaleConfig;
    }

    /**
     * Set <p>自动扩容配置</p>
     * @param AutoScaleConfig <p>自动扩容配置</p>
     */
    public void setAutoScaleConfig(AutoScalingConfig AutoScaleConfig) {
        this.AutoScaleConfig = AutoScaleConfig;
    }

    /**
     * Get <p>分析引擎模式</p><p>枚举值：</p><ul><li>libra： LibraDB分析引擎模式</li></ul> 
     * @return AnalysisMode <p>分析引擎模式</p><p>枚举值：</p><ul><li>libra： LibraDB分析引擎模式</li></ul>
     */
    public String getAnalysisMode() {
        return this.AnalysisMode;
    }

    /**
     * Set <p>分析引擎模式</p><p>枚举值：</p><ul><li>libra： LibraDB分析引擎模式</li></ul>
     * @param AnalysisMode <p>分析引擎模式</p><p>枚举值：</p><ul><li>libra： LibraDB分析引擎模式</li></ul>
     */
    public void setAnalysisMode(String AnalysisMode) {
        this.AnalysisMode = AnalysisMode;
    }

    /**
     * Get <p>分析引擎关系信息</p> 
     * @return AnalysisRelationInfos <p>分析引擎关系信息</p>
     */
    public AnalysisRelationInfo [] getAnalysisRelationInfos() {
        return this.AnalysisRelationInfos;
    }

    /**
     * Set <p>分析引擎关系信息</p>
     * @param AnalysisRelationInfos <p>分析引擎关系信息</p>
     */
    public void setAnalysisRelationInfos(AnalysisRelationInfo [] AnalysisRelationInfos) {
        this.AnalysisRelationInfos = AnalysisRelationInfos;
    }

    /**
     * Get <p>分析引擎实例信息</p> 
     * @return AnalysisInstanceInfo <p>分析引擎实例信息</p>
     */
    public AnalysisInstanceInfo getAnalysisInstanceInfo() {
        return this.AnalysisInstanceInfo;
    }

    /**
     * Set <p>分析引擎实例信息</p>
     * @param AnalysisInstanceInfo <p>分析引擎实例信息</p>
     */
    public void setAnalysisInstanceInfo(AnalysisInstanceInfo AnalysisInstanceInfo) {
        this.AnalysisInstanceInfo = AnalysisInstanceInfo;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.ComputeNodeNum != null) {
            this.ComputeNodeNum = new Long(source.ComputeNodeNum);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CreateVersion != null) {
            this.CreateVersion = new String(source.CreateVersion);
        }
        if (source.InitParams != null) {
            this.InitParams = new InstanceParam[source.InitParams.length];
            for (int i = 0; i < source.InitParams.length; i++) {
                this.InitParams[i] = new InstanceParam(source.InitParams[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StorageNodeNum != null) {
            this.StorageNodeNum = new Long(source.StorageNodeNum);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.MCCpu != null) {
            this.MCCpu = new Long(source.MCCpu);
        }
        if (source.MCMem != null) {
            this.MCMem = new Long(source.MCMem);
        }
        if (source.ComputerNodeCpu != null) {
            this.ComputerNodeCpu = new Long(source.ComputerNodeCpu);
        }
        if (source.ComputerNodeMem != null) {
            this.ComputerNodeMem = new Long(source.ComputerNodeMem);
        }
        if (source.StorageNodeCpu != null) {
            this.StorageNodeCpu = new Long(source.StorageNodeCpu);
        }
        if (source.StorageNodeMem != null) {
            this.StorageNodeMem = new Long(source.StorageNodeMem);
        }
        if (source.MCNum != null) {
            this.MCNum = new Long(source.MCNum);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.AccountTag != null) {
            this.AccountTag = new String(source.AccountTag);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.DestroyedAt != null) {
            this.DestroyedAt = new String(source.DestroyedAt);
        }
        if (source.ExpireAt != null) {
            this.ExpireAt = new String(source.ExpireAt);
        }
        if (source.IsolatedAt != null) {
            this.IsolatedAt = new String(source.IsolatedAt);
        }
        if (source.IsolatedFrom != null) {
            this.IsolatedFrom = new String(source.IsolatedFrom);
        }
        if (source.Replications != null) {
            this.Replications = new Long(source.Replications);
        }
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.Nodes != null) {
            this.Nodes = new InstanceNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new InstanceNode(source.Nodes[i]);
            }
        }
        if (source.BinlogStatus != null) {
            this.BinlogStatus = new Long(source.BinlogStatus);
        }
        if (source.CdcNodeCpu != null) {
            this.CdcNodeCpu = new Long(source.CdcNodeCpu);
        }
        if (source.CdcNodeMem != null) {
            this.CdcNodeMem = new Long(source.CdcNodeMem);
        }
        if (source.CdcNodeNum != null) {
            this.CdcNodeNum = new Long(source.CdcNodeNum);
        }
        if (source.AZMode != null) {
            this.AZMode = new Long(source.AZMode);
        }
        if (source.StandbyFlag != null) {
            this.StandbyFlag = new Long(source.StandbyFlag);
        }
        if (source.StandbySecondaryNum != null) {
            this.StandbySecondaryNum = new Long(source.StandbySecondaryNum);
        }
        if (source.ColumnarNodeCpu != null) {
            this.ColumnarNodeCpu = new Long(source.ColumnarNodeCpu);
        }
        if (source.ColumnarNodeMem != null) {
            this.ColumnarNodeMem = new Long(source.ColumnarNodeMem);
        }
        if (source.ColumnarNodeNum != null) {
            this.ColumnarNodeNum = new Long(source.ColumnarNodeNum);
        }
        if (source.ColumnarNodeDisk != null) {
            this.ColumnarNodeDisk = new Long(source.ColumnarNodeDisk);
        }
        if (source.ColumnarNodeStorageType != null) {
            this.ColumnarNodeStorageType = new String(source.ColumnarNodeStorageType);
        }
        if (source.InstanceCategory != null) {
            this.InstanceCategory = new Long(source.InstanceCategory);
        }
        if (source.ExclusiveClusterId != null) {
            this.ExclusiveClusterId = new String(source.ExclusiveClusterId);
        }
        if (source.SQLMode != null) {
            this.SQLMode = new String(source.SQLMode);
        }
        if (source.InstanceMode != null) {
            this.InstanceMode = new String(source.InstanceMode);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AutoScaleConfig != null) {
            this.AutoScaleConfig = new AutoScalingConfig(source.AutoScaleConfig);
        }
        if (source.AnalysisMode != null) {
            this.AnalysisMode = new String(source.AnalysisMode);
        }
        if (source.AnalysisRelationInfos != null) {
            this.AnalysisRelationInfos = new AnalysisRelationInfo[source.AnalysisRelationInfos.length];
            for (int i = 0; i < source.AnalysisRelationInfos.length; i++) {
                this.AnalysisRelationInfos[i] = new AnalysisRelationInfo(source.AnalysisRelationInfos[i]);
            }
        }
        if (source.AnalysisInstanceInfo != null) {
            this.AnalysisInstanceInfo = new AnalysisInstanceInfo(source.AnalysisInstanceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComputeNodeNum", this.ComputeNodeNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreateVersion", this.CreateVersion);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StorageNodeNum", this.StorageNodeNum);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "MCCpu", this.MCCpu);
        this.setParamSimple(map, prefix + "MCMem", this.MCMem);
        this.setParamSimple(map, prefix + "ComputerNodeCpu", this.ComputerNodeCpu);
        this.setParamSimple(map, prefix + "ComputerNodeMem", this.ComputerNodeMem);
        this.setParamSimple(map, prefix + "StorageNodeCpu", this.StorageNodeCpu);
        this.setParamSimple(map, prefix + "StorageNodeMem", this.StorageNodeMem);
        this.setParamSimple(map, prefix + "MCNum", this.MCNum);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AccountTag", this.AccountTag);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "DestroyedAt", this.DestroyedAt);
        this.setParamSimple(map, prefix + "ExpireAt", this.ExpireAt);
        this.setParamSimple(map, prefix + "IsolatedAt", this.IsolatedAt);
        this.setParamSimple(map, prefix + "IsolatedFrom", this.IsolatedFrom);
        this.setParamSimple(map, prefix + "Replications", this.Replications);
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamSimple(map, prefix + "BinlogStatus", this.BinlogStatus);
        this.setParamSimple(map, prefix + "CdcNodeCpu", this.CdcNodeCpu);
        this.setParamSimple(map, prefix + "CdcNodeMem", this.CdcNodeMem);
        this.setParamSimple(map, prefix + "CdcNodeNum", this.CdcNodeNum);
        this.setParamSimple(map, prefix + "AZMode", this.AZMode);
        this.setParamSimple(map, prefix + "StandbyFlag", this.StandbyFlag);
        this.setParamSimple(map, prefix + "StandbySecondaryNum", this.StandbySecondaryNum);
        this.setParamSimple(map, prefix + "ColumnarNodeCpu", this.ColumnarNodeCpu);
        this.setParamSimple(map, prefix + "ColumnarNodeMem", this.ColumnarNodeMem);
        this.setParamSimple(map, prefix + "ColumnarNodeNum", this.ColumnarNodeNum);
        this.setParamSimple(map, prefix + "ColumnarNodeDisk", this.ColumnarNodeDisk);
        this.setParamSimple(map, prefix + "ColumnarNodeStorageType", this.ColumnarNodeStorageType);
        this.setParamSimple(map, prefix + "InstanceCategory", this.InstanceCategory);
        this.setParamSimple(map, prefix + "ExclusiveClusterId", this.ExclusiveClusterId);
        this.setParamSimple(map, prefix + "SQLMode", this.SQLMode);
        this.setParamSimple(map, prefix + "InstanceMode", this.InstanceMode);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "AutoScaleConfig.", this.AutoScaleConfig);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);
        this.setParamArrayObj(map, prefix + "AnalysisRelationInfos.", this.AnalysisRelationInfos);
        this.setParamObj(map, prefix + "AnalysisInstanceInfo.", this.AnalysisInstanceInfo);

    }
}

