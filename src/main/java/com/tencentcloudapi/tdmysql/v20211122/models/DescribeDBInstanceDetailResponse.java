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

public class DescribeDBInstanceDetailResponse extends AbstractModel {

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>区域</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>字符型vpcid</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>字符型subnetid</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>创建实例版本</p>
    */
    @SerializedName("CreateVersion")
    @Expose
    private String CreateVersion;

    /**
    * <p>子网IP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>子网端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>存储节点磁盘容量，单位GB</p>
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * <p>存储节点数量</p>
    */
    @SerializedName("StorageNodeNum")
    @Expose
    private Long StorageNodeNum;

    /**
    * <p>初始化实例参数</p>
    */
    @SerializedName("InitParams")
    @Expose
    private InstanceParam [] InitParams;

    /**
    * <p>实例标签信息</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>存储节点副本数量</p>
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
    * <p>字符集</p>
    */
    @SerializedName("CharSet")
    @Expose
    private String CharSet;

    /**
    * <p>节点信息</p>
    */
    @SerializedName("Node")
    @Expose
    private NodeInfo [] Node;

    /**
    * <p>实例所属地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>实例规格</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例状态中文描述</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>存储节点CPU核数</p>
    */
    @SerializedName("StorageNodeCpu")
    @Expose
    private Long StorageNodeCpu;

    /**
    * <p>存储节点内存大小</p>
    */
    @SerializedName("StorageNodeMem")
    @Expose
    private Long StorageNodeMem;

    /**
    * <p>续费标志</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>付费模式，0后付费，1预付费</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireAt")
    @Expose
    private String ExpireAt;

    /**
    * <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedAt")
    @Expose
    private String IsolatedAt;

    /**
    * <p>实例架构类型，separate:分离架构；hybrid:对等架构</p>
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
    * <p>实例节点可用区列表。Zones[0]表示主可用区</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>最大节点磁盘使用量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskUsage")
    @Expose
    private Long DiskUsage;

    /**
    * <p>binlog是否开启</p>
    */
    @SerializedName("BinlogStatus")
    @Expose
    private Long BinlogStatus;

    /**
    * <p>az模式，1: 单AZ 2: 多AZ非主AZ模式 3: 多AZ主AZ模式</p>
    */
    @SerializedName("AZMode")
    @Expose
    private Long AZMode;

    /**
    * <p>灾备标志位，1: 无灾备关系；2: 灾备主实例；3: 灾备备实例</p>
    */
    @SerializedName("StandbyFlag")
    @Expose
    private Long StandbyFlag;

    /**
    * <p>cdc节点类型</p>
    */
    @SerializedName("BinlogType")
    @Expose
    private String BinlogType;

    /**
    * <p>1表示支持，0表示不支持</p>
    */
    @SerializedName("TimingModifyInstanceFlag")
    @Expose
    private Long TimingModifyInstanceFlag;

    /**
    * <p>列存节点cpu核数</p>
    */
    @SerializedName("ColumnarNodeCpu")
    @Expose
    private Long ColumnarNodeCpu;

    /**
    * <p>列存节点mem内存大小</p>
    */
    @SerializedName("ColumnarNodeMem")
    @Expose
    private Long ColumnarNodeMem;

    /**
    * <p>列存节点个数</p>
    */
    @SerializedName("ColumnarNodeNum")
    @Expose
    private Long ColumnarNodeNum;

    /**
    * <p>列存节点磁盘大小</p>
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
    * <p>列存节点规格</p>
    */
    @SerializedName("ColumnarNodeSpecCode")
    @Expose
    private String ColumnarNodeSpecCode;

    /**
    * <p>列存 vip</p>
    */
    @SerializedName("ColumnarVip")
    @Expose
    private String ColumnarVip;

    /**
    * <p>列存 vport</p>
    */
    @SerializedName("ColumnarVport")
    @Expose
    private Long ColumnarVport;

    /**
    * <p>实例是否支持列存</p>
    */
    @SerializedName("IsSupportColumnar")
    @Expose
    private Boolean IsSupportColumnar;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("InstanceCategory")
    @Expose
    private Long InstanceCategory;

    /**
    * <p>兼容模式</p>
    */
    @SerializedName("SQLMode")
    @Expose
    private String SQLMode;

    /**
    * <p>是否支持修改全能型副本数量</p>
    */
    @SerializedName("IsSwitchFullReplicationsEnable")
    @Expose
    private Boolean IsSwitchFullReplicationsEnable;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("InstanceMode")
    @Expose
    private String InstanceMode;

    /**
    * <p>dumper vip</p>
    */
    @SerializedName("DumperVip")
    @Expose
    private String DumperVip;

    /**
    * <p>dumper vport</p>
    */
    @SerializedName("DumperVport")
    @Expose
    private Long DumperVport;

    /**
    * <p>svls实例的ccu变配范围</p>
    */
    @SerializedName("AutoScaleConfig")
    @Expose
    private AutoScalingConfig AutoScaleConfig;

    /**
    * <p>参数模板id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>参数模板名称</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>实例分析引擎模式</p><p>枚举值：</p><ul><li>libra： LibraDB分析引擎实例</li></ul>
    */
    @SerializedName("AnalysisMode")
    @Expose
    private String AnalysisMode;

    /**
    * <p>分析引擎实例关系</p>
    */
    @SerializedName("AnalysisRelationInfos")
    @Expose
    private AnalysisRelationInfo [] AnalysisRelationInfos;

    /**
    * <p>分析引擎实例信息</p><p>Cpu、Memory、Disk复用顶层字段</p>
    */
    @SerializedName("AnalysisInstanceInfo")
    @Expose
    private AnalysisInstanceInfo AnalysisInstanceInfo;

    /**
    * <p>维护窗口配置</p>
    */
    @SerializedName("MaintenanceWindow")
    @Expose
    private MaintenanceWindowInfo MaintenanceWindow;

    /**
    * <p>是否开启透明加密，0：未开启；1：已开启</p>
    */
    @SerializedName("EncryptionEnable")
    @Expose
    private Long EncryptionEnable;

    /**
    * <p>真实使用的kms地域，用于后续调用kms服务</p>
    */
    @SerializedName("EncryptionKmsRegion")
    @Expose
    private String EncryptionKmsRegion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get <p>创建实例版本</p> 
     * @return CreateVersion <p>创建实例版本</p>
     */
    public String getCreateVersion() {
        return this.CreateVersion;
    }

    /**
     * Set <p>创建实例版本</p>
     * @param CreateVersion <p>创建实例版本</p>
     */
    public void setCreateVersion(String CreateVersion) {
        this.CreateVersion = CreateVersion;
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
     * Get <p>实例状态</p> 
     * @return Status <p>实例状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p>
     * @param Status <p>实例状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get <p>初始化实例参数</p> 
     * @return InitParams <p>初始化实例参数</p>
     */
    public InstanceParam [] getInitParams() {
        return this.InitParams;
    }

    /**
     * Set <p>初始化实例参数</p>
     * @param InitParams <p>初始化实例参数</p>
     */
    public void setInitParams(InstanceParam [] InitParams) {
        this.InitParams = InitParams;
    }

    /**
     * Get <p>实例标签信息</p> 
     * @return ResourceTags <p>实例标签信息</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>实例标签信息</p>
     * @param ResourceTags <p>实例标签信息</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>存储节点副本数量</p> 
     * @return Replications <p>存储节点副本数量</p>
     */
    public Long getReplications() {
        return this.Replications;
    }

    /**
     * Set <p>存储节点副本数量</p>
     * @param Replications <p>存储节点副本数量</p>
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
     * Get <p>字符集</p> 
     * @return CharSet <p>字符集</p>
     */
    public String getCharSet() {
        return this.CharSet;
    }

    /**
     * Set <p>字符集</p>
     * @param CharSet <p>字符集</p>
     */
    public void setCharSet(String CharSet) {
        this.CharSet = CharSet;
    }

    /**
     * Get <p>节点信息</p> 
     * @return Node <p>节点信息</p>
     */
    public NodeInfo [] getNode() {
        return this.Node;
    }

    /**
     * Set <p>节点信息</p>
     * @param Node <p>节点信息</p>
     */
    public void setNode(NodeInfo [] Node) {
        this.Node = Node;
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
     * Get <p>实例规格</p> 
     * @return SpecCode <p>实例规格</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>实例规格</p>
     * @param SpecCode <p>实例规格</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get <p>存储节点CPU核数</p> 
     * @return StorageNodeCpu <p>存储节点CPU核数</p>
     */
    public Long getStorageNodeCpu() {
        return this.StorageNodeCpu;
    }

    /**
     * Set <p>存储节点CPU核数</p>
     * @param StorageNodeCpu <p>存储节点CPU核数</p>
     */
    public void setStorageNodeCpu(Long StorageNodeCpu) {
        this.StorageNodeCpu = StorageNodeCpu;
    }

    /**
     * Get <p>存储节点内存大小</p> 
     * @return StorageNodeMem <p>存储节点内存大小</p>
     */
    public Long getStorageNodeMem() {
        return this.StorageNodeMem;
    }

    /**
     * Set <p>存储节点内存大小</p>
     * @param StorageNodeMem <p>存储节点内存大小</p>
     */
    public void setStorageNodeMem(Long StorageNodeMem) {
        this.StorageNodeMem = StorageNodeMem;
    }

    /**
     * Get <p>续费标志</p> 
     * @return RenewFlag <p>续费标志</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>续费标志</p>
     * @param RenewFlag <p>续费标志</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>付费模式，0后付费，1预付费</p> 
     * @return PayMode <p>付费模式，0后付费，1预付费</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式，0后付费，1预付费</p>
     * @param PayMode <p>付费模式，0后付费，1预付费</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireAt <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireAt() {
        return this.ExpireAt;
    }

    /**
     * Set <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireAt <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireAt(String ExpireAt) {
        this.ExpireAt = ExpireAt;
    }

    /**
     * Get <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedAt <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedAt() {
        return this.IsolatedAt;
    }

    /**
     * Set <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedAt <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedAt(String IsolatedAt) {
        this.IsolatedAt = IsolatedAt;
    }

    /**
     * Get <p>实例架构类型，separate:分离架构；hybrid:对等架构</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType <p>实例架构类型，separate:分离架构；hybrid:对等架构</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例架构类型，separate:分离架构；hybrid:对等架构</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType <p>实例架构类型，separate:分离架构；hybrid:对等架构</p>
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
     * Get <p>实例节点可用区列表。Zones[0]表示主可用区</p> 
     * @return Zones <p>实例节点可用区列表。Zones[0]表示主可用区</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>实例节点可用区列表。Zones[0]表示主可用区</p>
     * @param Zones <p>实例节点可用区列表。Zones[0]表示主可用区</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>最大节点磁盘使用量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskUsage <p>最大节点磁盘使用量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set <p>最大节点磁盘使用量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskUsage <p>最大节点磁盘使用量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskUsage(Long DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get <p>binlog是否开启</p> 
     * @return BinlogStatus <p>binlog是否开启</p>
     */
    public Long getBinlogStatus() {
        return this.BinlogStatus;
    }

    /**
     * Set <p>binlog是否开启</p>
     * @param BinlogStatus <p>binlog是否开启</p>
     */
    public void setBinlogStatus(Long BinlogStatus) {
        this.BinlogStatus = BinlogStatus;
    }

    /**
     * Get <p>az模式，1: 单AZ 2: 多AZ非主AZ模式 3: 多AZ主AZ模式</p> 
     * @return AZMode <p>az模式，1: 单AZ 2: 多AZ非主AZ模式 3: 多AZ主AZ模式</p>
     */
    public Long getAZMode() {
        return this.AZMode;
    }

    /**
     * Set <p>az模式，1: 单AZ 2: 多AZ非主AZ模式 3: 多AZ主AZ模式</p>
     * @param AZMode <p>az模式，1: 单AZ 2: 多AZ非主AZ模式 3: 多AZ主AZ模式</p>
     */
    public void setAZMode(Long AZMode) {
        this.AZMode = AZMode;
    }

    /**
     * Get <p>灾备标志位，1: 无灾备关系；2: 灾备主实例；3: 灾备备实例</p> 
     * @return StandbyFlag <p>灾备标志位，1: 无灾备关系；2: 灾备主实例；3: 灾备备实例</p>
     */
    public Long getStandbyFlag() {
        return this.StandbyFlag;
    }

    /**
     * Set <p>灾备标志位，1: 无灾备关系；2: 灾备主实例；3: 灾备备实例</p>
     * @param StandbyFlag <p>灾备标志位，1: 无灾备关系；2: 灾备主实例；3: 灾备备实例</p>
     */
    public void setStandbyFlag(Long StandbyFlag) {
        this.StandbyFlag = StandbyFlag;
    }

    /**
     * Get <p>cdc节点类型</p> 
     * @return BinlogType <p>cdc节点类型</p>
     */
    public String getBinlogType() {
        return this.BinlogType;
    }

    /**
     * Set <p>cdc节点类型</p>
     * @param BinlogType <p>cdc节点类型</p>
     */
    public void setBinlogType(String BinlogType) {
        this.BinlogType = BinlogType;
    }

    /**
     * Get <p>1表示支持，0表示不支持</p> 
     * @return TimingModifyInstanceFlag <p>1表示支持，0表示不支持</p>
     */
    public Long getTimingModifyInstanceFlag() {
        return this.TimingModifyInstanceFlag;
    }

    /**
     * Set <p>1表示支持，0表示不支持</p>
     * @param TimingModifyInstanceFlag <p>1表示支持，0表示不支持</p>
     */
    public void setTimingModifyInstanceFlag(Long TimingModifyInstanceFlag) {
        this.TimingModifyInstanceFlag = TimingModifyInstanceFlag;
    }

    /**
     * Get <p>列存节点cpu核数</p> 
     * @return ColumnarNodeCpu <p>列存节点cpu核数</p>
     */
    public Long getColumnarNodeCpu() {
        return this.ColumnarNodeCpu;
    }

    /**
     * Set <p>列存节点cpu核数</p>
     * @param ColumnarNodeCpu <p>列存节点cpu核数</p>
     */
    public void setColumnarNodeCpu(Long ColumnarNodeCpu) {
        this.ColumnarNodeCpu = ColumnarNodeCpu;
    }

    /**
     * Get <p>列存节点mem内存大小</p> 
     * @return ColumnarNodeMem <p>列存节点mem内存大小</p>
     */
    public Long getColumnarNodeMem() {
        return this.ColumnarNodeMem;
    }

    /**
     * Set <p>列存节点mem内存大小</p>
     * @param ColumnarNodeMem <p>列存节点mem内存大小</p>
     */
    public void setColumnarNodeMem(Long ColumnarNodeMem) {
        this.ColumnarNodeMem = ColumnarNodeMem;
    }

    /**
     * Get <p>列存节点个数</p> 
     * @return ColumnarNodeNum <p>列存节点个数</p>
     */
    public Long getColumnarNodeNum() {
        return this.ColumnarNodeNum;
    }

    /**
     * Set <p>列存节点个数</p>
     * @param ColumnarNodeNum <p>列存节点个数</p>
     */
    public void setColumnarNodeNum(Long ColumnarNodeNum) {
        this.ColumnarNodeNum = ColumnarNodeNum;
    }

    /**
     * Get <p>列存节点磁盘大小</p> 
     * @return ColumnarNodeDisk <p>列存节点磁盘大小</p>
     */
    public Long getColumnarNodeDisk() {
        return this.ColumnarNodeDisk;
    }

    /**
     * Set <p>列存节点磁盘大小</p>
     * @param ColumnarNodeDisk <p>列存节点磁盘大小</p>
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
     * Get <p>列存节点规格</p> 
     * @return ColumnarNodeSpecCode <p>列存节点规格</p>
     */
    public String getColumnarNodeSpecCode() {
        return this.ColumnarNodeSpecCode;
    }

    /**
     * Set <p>列存节点规格</p>
     * @param ColumnarNodeSpecCode <p>列存节点规格</p>
     */
    public void setColumnarNodeSpecCode(String ColumnarNodeSpecCode) {
        this.ColumnarNodeSpecCode = ColumnarNodeSpecCode;
    }

    /**
     * Get <p>列存 vip</p> 
     * @return ColumnarVip <p>列存 vip</p>
     */
    public String getColumnarVip() {
        return this.ColumnarVip;
    }

    /**
     * Set <p>列存 vip</p>
     * @param ColumnarVip <p>列存 vip</p>
     */
    public void setColumnarVip(String ColumnarVip) {
        this.ColumnarVip = ColumnarVip;
    }

    /**
     * Get <p>列存 vport</p> 
     * @return ColumnarVport <p>列存 vport</p>
     */
    public Long getColumnarVport() {
        return this.ColumnarVport;
    }

    /**
     * Set <p>列存 vport</p>
     * @param ColumnarVport <p>列存 vport</p>
     */
    public void setColumnarVport(Long ColumnarVport) {
        this.ColumnarVport = ColumnarVport;
    }

    /**
     * Get <p>实例是否支持列存</p> 
     * @return IsSupportColumnar <p>实例是否支持列存</p>
     */
    public Boolean getIsSupportColumnar() {
        return this.IsSupportColumnar;
    }

    /**
     * Set <p>实例是否支持列存</p>
     * @param IsSupportColumnar <p>实例是否支持列存</p>
     */
    public void setIsSupportColumnar(Boolean IsSupportColumnar) {
        this.IsSupportColumnar = IsSupportColumnar;
    }

    /**
     * Get <p>实例类型</p> 
     * @return InstanceCategory <p>实例类型</p>
     */
    public Long getInstanceCategory() {
        return this.InstanceCategory;
    }

    /**
     * Set <p>实例类型</p>
     * @param InstanceCategory <p>实例类型</p>
     */
    public void setInstanceCategory(Long InstanceCategory) {
        this.InstanceCategory = InstanceCategory;
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
     * Get <p>是否支持修改全能型副本数量</p> 
     * @return IsSwitchFullReplicationsEnable <p>是否支持修改全能型副本数量</p>
     */
    public Boolean getIsSwitchFullReplicationsEnable() {
        return this.IsSwitchFullReplicationsEnable;
    }

    /**
     * Set <p>是否支持修改全能型副本数量</p>
     * @param IsSwitchFullReplicationsEnable <p>是否支持修改全能型副本数量</p>
     */
    public void setIsSwitchFullReplicationsEnable(Boolean IsSwitchFullReplicationsEnable) {
        this.IsSwitchFullReplicationsEnable = IsSwitchFullReplicationsEnable;
    }

    /**
     * Get <p>实例类型</p> 
     * @return InstanceMode <p>实例类型</p>
     */
    public String getInstanceMode() {
        return this.InstanceMode;
    }

    /**
     * Set <p>实例类型</p>
     * @param InstanceMode <p>实例类型</p>
     */
    public void setInstanceMode(String InstanceMode) {
        this.InstanceMode = InstanceMode;
    }

    /**
     * Get <p>dumper vip</p> 
     * @return DumperVip <p>dumper vip</p>
     */
    public String getDumperVip() {
        return this.DumperVip;
    }

    /**
     * Set <p>dumper vip</p>
     * @param DumperVip <p>dumper vip</p>
     */
    public void setDumperVip(String DumperVip) {
        this.DumperVip = DumperVip;
    }

    /**
     * Get <p>dumper vport</p> 
     * @return DumperVport <p>dumper vport</p>
     */
    public Long getDumperVport() {
        return this.DumperVport;
    }

    /**
     * Set <p>dumper vport</p>
     * @param DumperVport <p>dumper vport</p>
     */
    public void setDumperVport(Long DumperVport) {
        this.DumperVport = DumperVport;
    }

    /**
     * Get <p>svls实例的ccu变配范围</p> 
     * @return AutoScaleConfig <p>svls实例的ccu变配范围</p>
     */
    public AutoScalingConfig getAutoScaleConfig() {
        return this.AutoScaleConfig;
    }

    /**
     * Set <p>svls实例的ccu变配范围</p>
     * @param AutoScaleConfig <p>svls实例的ccu变配范围</p>
     */
    public void setAutoScaleConfig(AutoScalingConfig AutoScaleConfig) {
        this.AutoScaleConfig = AutoScaleConfig;
    }

    /**
     * Get <p>参数模板id</p> 
     * @return TemplateId <p>参数模板id</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>参数模板id</p>
     * @param TemplateId <p>参数模板id</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>参数模板名称</p> 
     * @return TemplateName <p>参数模板名称</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>参数模板名称</p>
     * @param TemplateName <p>参数模板名称</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>实例分析引擎模式</p><p>枚举值：</p><ul><li>libra： LibraDB分析引擎实例</li></ul> 
     * @return AnalysisMode <p>实例分析引擎模式</p><p>枚举值：</p><ul><li>libra： LibraDB分析引擎实例</li></ul>
     */
    public String getAnalysisMode() {
        return this.AnalysisMode;
    }

    /**
     * Set <p>实例分析引擎模式</p><p>枚举值：</p><ul><li>libra： LibraDB分析引擎实例</li></ul>
     * @param AnalysisMode <p>实例分析引擎模式</p><p>枚举值：</p><ul><li>libra： LibraDB分析引擎实例</li></ul>
     */
    public void setAnalysisMode(String AnalysisMode) {
        this.AnalysisMode = AnalysisMode;
    }

    /**
     * Get <p>分析引擎实例关系</p> 
     * @return AnalysisRelationInfos <p>分析引擎实例关系</p>
     */
    public AnalysisRelationInfo [] getAnalysisRelationInfos() {
        return this.AnalysisRelationInfos;
    }

    /**
     * Set <p>分析引擎实例关系</p>
     * @param AnalysisRelationInfos <p>分析引擎实例关系</p>
     */
    public void setAnalysisRelationInfos(AnalysisRelationInfo [] AnalysisRelationInfos) {
        this.AnalysisRelationInfos = AnalysisRelationInfos;
    }

    /**
     * Get <p>分析引擎实例信息</p><p>Cpu、Memory、Disk复用顶层字段</p> 
     * @return AnalysisInstanceInfo <p>分析引擎实例信息</p><p>Cpu、Memory、Disk复用顶层字段</p>
     */
    public AnalysisInstanceInfo getAnalysisInstanceInfo() {
        return this.AnalysisInstanceInfo;
    }

    /**
     * Set <p>分析引擎实例信息</p><p>Cpu、Memory、Disk复用顶层字段</p>
     * @param AnalysisInstanceInfo <p>分析引擎实例信息</p><p>Cpu、Memory、Disk复用顶层字段</p>
     */
    public void setAnalysisInstanceInfo(AnalysisInstanceInfo AnalysisInstanceInfo) {
        this.AnalysisInstanceInfo = AnalysisInstanceInfo;
    }

    /**
     * Get <p>维护窗口配置</p> 
     * @return MaintenanceWindow <p>维护窗口配置</p>
     */
    public MaintenanceWindowInfo getMaintenanceWindow() {
        return this.MaintenanceWindow;
    }

    /**
     * Set <p>维护窗口配置</p>
     * @param MaintenanceWindow <p>维护窗口配置</p>
     */
    public void setMaintenanceWindow(MaintenanceWindowInfo MaintenanceWindow) {
        this.MaintenanceWindow = MaintenanceWindow;
    }

    /**
     * Get <p>是否开启透明加密，0：未开启；1：已开启</p> 
     * @return EncryptionEnable <p>是否开启透明加密，0：未开启；1：已开启</p>
     */
    public Long getEncryptionEnable() {
        return this.EncryptionEnable;
    }

    /**
     * Set <p>是否开启透明加密，0：未开启；1：已开启</p>
     * @param EncryptionEnable <p>是否开启透明加密，0：未开启；1：已开启</p>
     */
    public void setEncryptionEnable(Long EncryptionEnable) {
        this.EncryptionEnable = EncryptionEnable;
    }

    /**
     * Get <p>真实使用的kms地域，用于后续调用kms服务</p> 
     * @return EncryptionKmsRegion <p>真实使用的kms地域，用于后续调用kms服务</p>
     */
    public String getEncryptionKmsRegion() {
        return this.EncryptionKmsRegion;
    }

    /**
     * Set <p>真实使用的kms地域，用于后续调用kms服务</p>
     * @param EncryptionKmsRegion <p>真实使用的kms地域，用于后续调用kms服务</p>
     */
    public void setEncryptionKmsRegion(String EncryptionKmsRegion) {
        this.EncryptionKmsRegion = EncryptionKmsRegion;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBInstanceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceDetailResponse(DescribeDBInstanceDetailResponse source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CreateVersion != null) {
            this.CreateVersion = new String(source.CreateVersion);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.StorageNodeNum != null) {
            this.StorageNodeNum = new Long(source.StorageNodeNum);
        }
        if (source.InitParams != null) {
            this.InitParams = new InstanceParam[source.InitParams.length];
            for (int i = 0; i < source.InitParams.length; i++) {
                this.InitParams[i] = new InstanceParam(source.InitParams[i]);
            }
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Replications != null) {
            this.Replications = new Long(source.Replications);
        }
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
        if (source.CharSet != null) {
            this.CharSet = new String(source.CharSet);
        }
        if (source.Node != null) {
            this.Node = new NodeInfo[source.Node.length];
            for (int i = 0; i < source.Node.length; i++) {
                this.Node[i] = new NodeInfo(source.Node[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.StorageNodeCpu != null) {
            this.StorageNodeCpu = new Long(source.StorageNodeCpu);
        }
        if (source.StorageNodeMem != null) {
            this.StorageNodeMem = new Long(source.StorageNodeMem);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ExpireAt != null) {
            this.ExpireAt = new String(source.ExpireAt);
        }
        if (source.IsolatedAt != null) {
            this.IsolatedAt = new String(source.IsolatedAt);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new Long(source.DiskUsage);
        }
        if (source.BinlogStatus != null) {
            this.BinlogStatus = new Long(source.BinlogStatus);
        }
        if (source.AZMode != null) {
            this.AZMode = new Long(source.AZMode);
        }
        if (source.StandbyFlag != null) {
            this.StandbyFlag = new Long(source.StandbyFlag);
        }
        if (source.BinlogType != null) {
            this.BinlogType = new String(source.BinlogType);
        }
        if (source.TimingModifyInstanceFlag != null) {
            this.TimingModifyInstanceFlag = new Long(source.TimingModifyInstanceFlag);
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
        if (source.ColumnarNodeSpecCode != null) {
            this.ColumnarNodeSpecCode = new String(source.ColumnarNodeSpecCode);
        }
        if (source.ColumnarVip != null) {
            this.ColumnarVip = new String(source.ColumnarVip);
        }
        if (source.ColumnarVport != null) {
            this.ColumnarVport = new Long(source.ColumnarVport);
        }
        if (source.IsSupportColumnar != null) {
            this.IsSupportColumnar = new Boolean(source.IsSupportColumnar);
        }
        if (source.InstanceCategory != null) {
            this.InstanceCategory = new Long(source.InstanceCategory);
        }
        if (source.SQLMode != null) {
            this.SQLMode = new String(source.SQLMode);
        }
        if (source.IsSwitchFullReplicationsEnable != null) {
            this.IsSwitchFullReplicationsEnable = new Boolean(source.IsSwitchFullReplicationsEnable);
        }
        if (source.InstanceMode != null) {
            this.InstanceMode = new String(source.InstanceMode);
        }
        if (source.DumperVip != null) {
            this.DumperVip = new String(source.DumperVip);
        }
        if (source.DumperVport != null) {
            this.DumperVport = new Long(source.DumperVport);
        }
        if (source.AutoScaleConfig != null) {
            this.AutoScaleConfig = new AutoScalingConfig(source.AutoScaleConfig);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
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
        if (source.MaintenanceWindow != null) {
            this.MaintenanceWindow = new MaintenanceWindowInfo(source.MaintenanceWindow);
        }
        if (source.EncryptionEnable != null) {
            this.EncryptionEnable = new Long(source.EncryptionEnable);
        }
        if (source.EncryptionKmsRegion != null) {
            this.EncryptionKmsRegion = new String(source.EncryptionKmsRegion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreateVersion", this.CreateVersion);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "StorageNodeNum", this.StorageNodeNum);
        this.setParamArrayObj(map, prefix + "InitParams.", this.InitParams);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Replications", this.Replications);
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);
        this.setParamSimple(map, prefix + "CharSet", this.CharSet);
        this.setParamArrayObj(map, prefix + "Node.", this.Node);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "StorageNodeCpu", this.StorageNodeCpu);
        this.setParamSimple(map, prefix + "StorageNodeMem", this.StorageNodeMem);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ExpireAt", this.ExpireAt);
        this.setParamSimple(map, prefix + "IsolatedAt", this.IsolatedAt);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "BinlogStatus", this.BinlogStatus);
        this.setParamSimple(map, prefix + "AZMode", this.AZMode);
        this.setParamSimple(map, prefix + "StandbyFlag", this.StandbyFlag);
        this.setParamSimple(map, prefix + "BinlogType", this.BinlogType);
        this.setParamSimple(map, prefix + "TimingModifyInstanceFlag", this.TimingModifyInstanceFlag);
        this.setParamSimple(map, prefix + "ColumnarNodeCpu", this.ColumnarNodeCpu);
        this.setParamSimple(map, prefix + "ColumnarNodeMem", this.ColumnarNodeMem);
        this.setParamSimple(map, prefix + "ColumnarNodeNum", this.ColumnarNodeNum);
        this.setParamSimple(map, prefix + "ColumnarNodeDisk", this.ColumnarNodeDisk);
        this.setParamSimple(map, prefix + "ColumnarNodeStorageType", this.ColumnarNodeStorageType);
        this.setParamSimple(map, prefix + "ColumnarNodeSpecCode", this.ColumnarNodeSpecCode);
        this.setParamSimple(map, prefix + "ColumnarVip", this.ColumnarVip);
        this.setParamSimple(map, prefix + "ColumnarVport", this.ColumnarVport);
        this.setParamSimple(map, prefix + "IsSupportColumnar", this.IsSupportColumnar);
        this.setParamSimple(map, prefix + "InstanceCategory", this.InstanceCategory);
        this.setParamSimple(map, prefix + "SQLMode", this.SQLMode);
        this.setParamSimple(map, prefix + "IsSwitchFullReplicationsEnable", this.IsSwitchFullReplicationsEnable);
        this.setParamSimple(map, prefix + "InstanceMode", this.InstanceMode);
        this.setParamSimple(map, prefix + "DumperVip", this.DumperVip);
        this.setParamSimple(map, prefix + "DumperVport", this.DumperVport);
        this.setParamObj(map, prefix + "AutoScaleConfig.", this.AutoScaleConfig);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);
        this.setParamArrayObj(map, prefix + "AnalysisRelationInfos.", this.AnalysisRelationInfos);
        this.setParamObj(map, prefix + "AnalysisInstanceInfo.", this.AnalysisInstanceInfo);
        this.setParamObj(map, prefix + "MaintenanceWindow.", this.MaintenanceWindow);
        this.setParamSimple(map, prefix + "EncryptionEnable", this.EncryptionEnable);
        this.setParamSimple(map, prefix + "EncryptionKmsRegion", this.EncryptionKmsRegion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

