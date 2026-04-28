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
    * <p>主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>账号唯一ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>Libra分析引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LibraDBVersion")
    @Expose
    private String LibraDBVersion;

    /**
    * <p>cpu核数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>存储大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>存储类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>实例类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例角色</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>售卖方式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>售卖开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodStartTime")
    @Expose
    private String PeriodStartTime;

    /**
    * <p>售卖结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>续费标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>网络类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * <p>私有网络ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>虚拟IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>端口</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>实例网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceNetInfo")
    @Expose
    private InstanceNetInfo InstanceNetInfo;

    /**
    * <p>实例标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>实例节点信息</p>
    */
    @SerializedName("NodeInfo")
    @Expose
    private LibraDBNodeInfo [] NodeInfo;

    /**
    * <p>实例节点个数</p>
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * <p>分析实例升级版本之后信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisUpgradeVersionInfo")
    @Expose
    private UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>主账号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin <p>主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin <p>主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>账号唯一ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>账号唯一ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>账号唯一ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>账号唯一ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>集群ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName <p>集群名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>实例状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc <p>状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc <p>状态描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>Libra分析引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LibraDBVersion <p>Libra分析引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLibraDBVersion() {
        return this.LibraDBVersion;
    }

    /**
     * Set <p>Libra分析引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LibraDBVersion <p>Libra分析引擎版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLibraDBVersion(String LibraDBVersion) {
        this.LibraDBVersion = LibraDBVersion;
    }

    /**
     * Get <p>cpu核数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu <p>cpu核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu <p>cpu核数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory <p>内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory <p>内存大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>存储大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Storage <p>存储大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>存储大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Storage <p>存储大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>存储类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType <p>存储类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType <p>存储类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>实例类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType <p>实例类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType <p>实例类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例角色</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceRole <p>实例角色</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>实例角色</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceRole <p>实例角色</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>售卖方式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode <p>售卖方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>售卖方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode <p>售卖方式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>售卖开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodStartTime <p>售卖开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeriodStartTime() {
        return this.PeriodStartTime;
    }

    /**
     * Set <p>售卖开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodStartTime <p>售卖开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodStartTime(String PeriodStartTime) {
        this.PeriodStartTime = PeriodStartTime;
    }

    /**
     * Get <p>售卖结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodEndTime <p>售卖结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>售卖结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodEndTime <p>售卖结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get <p>续费标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag <p>续费标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>续费标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag <p>续费标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>网络类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetType <p>网络类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>网络类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetType <p>网络类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>私有网络ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId <p>私有网络ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId <p>私有网络ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId <p>子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId <p>子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>虚拟IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip <p>虚拟IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>虚拟IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip <p>虚拟IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>端口</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vport <p>端口</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>端口</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vport <p>端口</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>实例网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceNetInfo <p>实例网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNetInfo getInstanceNetInfo() {
        return this.InstanceNetInfo;
    }

    /**
     * Set <p>实例网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceNetInfo <p>实例网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceNetInfo(InstanceNetInfo InstanceNetInfo) {
        this.InstanceNetInfo = InstanceNetInfo;
    }

    /**
     * Get <p>实例标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTags <p>实例标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>实例标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTags <p>实例标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>实例节点信息</p> 
     * @return NodeInfo <p>实例节点信息</p>
     */
    public LibraDBNodeInfo [] getNodeInfo() {
        return this.NodeInfo;
    }

    /**
     * Set <p>实例节点信息</p>
     * @param NodeInfo <p>实例节点信息</p>
     */
    public void setNodeInfo(LibraDBNodeInfo [] NodeInfo) {
        this.NodeInfo = NodeInfo;
    }

    /**
     * Get <p>实例节点个数</p> 
     * @return NodeCount <p>实例节点个数</p>
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set <p>实例节点个数</p>
     * @param NodeCount <p>实例节点个数</p>
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get <p>分析实例升级版本之后信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisUpgradeVersionInfo <p>分析实例升级版本之后信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpgradeAnalysisInstanceVersionInfo getAnalysisUpgradeVersionInfo() {
        return this.AnalysisUpgradeVersionInfo;
    }

    /**
     * Set <p>分析实例升级版本之后信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisUpgradeVersionInfo <p>分析实例升级版本之后信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisUpgradeVersionInfo(UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo) {
        this.AnalysisUpgradeVersionInfo = AnalysisUpgradeVersionInfo;
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
        if (source.AnalysisUpgradeVersionInfo != null) {
            this.AnalysisUpgradeVersionInfo = new UpgradeAnalysisInstanceVersionInfo(source.AnalysisUpgradeVersionInfo);
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
        this.setParamObj(map, prefix + "AnalysisUpgradeVersionInfo.", this.AnalysisUpgradeVersionInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

