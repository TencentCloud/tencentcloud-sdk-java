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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLibraDBInstanceDetailResponse extends AbstractModel {

    /**
    * 主账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 账号唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Libra分析引擎版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibraDBVersion")
    @Expose
    private String LibraDBVersion;

    /**
    * cpu核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 存储大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 存储类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例角色
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 售卖方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 售卖开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodStartTime")
    @Expose
    private String PeriodStartTime;

    /**
    * 售卖结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 续费标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 网络类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 虚拟IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 实例网络信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceNetInfo")
    @Expose
    private InstanceNetInfo InstanceNetInfo;

    /**
    * 实例标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * 实例节点信息
    */
    @SerializedName("NodeInfo")
    @Expose
    private LibraDBNodeInfo [] NodeInfo;

    /**
    * 实例节点个数
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 主账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 账号唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 账号唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 账号唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 账号唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Libra分析引擎版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibraDBVersion Libra分析引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLibraDBVersion() {
        return this.LibraDBVersion;
    }

    /**
     * Set Libra分析引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibraDBVersion Libra分析引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibraDBVersion(String LibraDBVersion) {
        this.LibraDBVersion = LibraDBVersion;
    }

    /**
     * Get cpu核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu cpu核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu cpu核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 存储大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Storage 存储大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Storage 存储大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 存储类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例角色
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceRole 实例角色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 实例角色
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceRole 实例角色
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 售卖方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 售卖方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 售卖方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 售卖方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 售卖开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodStartTime 售卖开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeriodStartTime() {
        return this.PeriodStartTime;
    }

    /**
     * Set 售卖开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodStartTime 售卖开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodStartTime(String PeriodStartTime) {
        this.PeriodStartTime = PeriodStartTime;
    }

    /**
     * Get 售卖结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodEndTime 售卖结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 售卖结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodEndTime 售卖结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 续费标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 续费标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 续费标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 网络类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetType 网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetType 网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 虚拟IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip 虚拟IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 虚拟IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip 虚拟IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vport 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vport 端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 实例网络信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceNetInfo 实例网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNetInfo getInstanceNetInfo() {
        return this.InstanceNetInfo;
    }

    /**
     * Set 实例网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceNetInfo 实例网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceNetInfo(InstanceNetInfo InstanceNetInfo) {
        this.InstanceNetInfo = InstanceNetInfo;
    }

    /**
     * Get 实例标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTags 实例标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 实例标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTags 实例标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 实例节点信息 
     * @return NodeInfo 实例节点信息
     */
    public LibraDBNodeInfo [] getNodeInfo() {
        return this.NodeInfo;
    }

    /**
     * Set 实例节点信息
     * @param NodeInfo 实例节点信息
     */
    public void setNodeInfo(LibraDBNodeInfo [] NodeInfo) {
        this.NodeInfo = NodeInfo;
    }

    /**
     * Get 实例节点个数 
     * @return NodeCount 实例节点个数
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 实例节点个数
     * @param NodeCount 实例节点个数
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
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

    public DescribeLibraDBInstanceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibraDBInstanceDetailResponse(DescribeLibraDBInstanceDetailResponse source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.LibraDBVersion != null) {
            this.LibraDBVersion = new String(source.LibraDBVersion);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodStartTime != null) {
            this.PeriodStartTime = new String(source.PeriodStartTime);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.InstanceNetInfo != null) {
            this.InstanceNetInfo = new InstanceNetInfo(source.InstanceNetInfo);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.NodeInfo != null) {
            this.NodeInfo = new LibraDBNodeInfo[source.NodeInfo.length];
            for (int i = 0; i < source.NodeInfo.length; i++) {
                this.NodeInfo[i] = new LibraDBNodeInfo(source.NodeInfo[i]);
            }
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "LibraDBVersion", this.LibraDBVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodStartTime", this.PeriodStartTime);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamObj(map, prefix + "InstanceNetInfo.", this.InstanceNetInfo);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamArrayObj(map, prefix + "NodeInfo.", this.NodeInfo);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

