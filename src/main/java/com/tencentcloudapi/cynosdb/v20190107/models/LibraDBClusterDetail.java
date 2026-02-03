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

public class LibraDBClusterDetail extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 存储大小
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * VPC名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * vpc唯一id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网名称
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * 使用容量
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * vip地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * vport端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 集群只读实例的vip地址和vport端口
    */
    @SerializedName("RoAddr")
    @Expose
    private RoAddr [] RoAddr;

    /**
    * cynos版本
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * 是否冻结
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * 任务列表
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * 主可用区
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * 实例集合
    */
    @SerializedName("InstanceSet")
    @Expose
    private InstanceSet [] InstanceSet;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 到期时间
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 项目id
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 自动续费标识
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 版本标签
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * 不支持添加ro yes-不支持添加ro， no/null/"" 支持添加ro
    */
    @SerializedName("NoSupportAddRo")
    @Expose
    private String NoSupportAddRo;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 物理可用区
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return StatusDesc 状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
     * @param StatusDesc 状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 存储大小 
     * @return Storage 存储大小
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储大小
     * @param Storage 存储大小
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get VPC名称 
     * @return VpcName VPC名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC名称
     * @param VpcName VPC名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get vpc唯一id 
     * @return VpcId vpc唯一id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc唯一id
     * @param VpcId vpc唯一id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网名称 
     * @return SubnetName 子网名称
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名称
     * @param SubnetName 子网名称
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 数据库版本 
     * @return DbVersion 数据库版本
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 数据库版本
     * @param DbVersion 数据库版本
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get 使用容量 
     * @return UsedStorage 使用容量
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set 使用容量
     * @param UsedStorage 使用容量
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get vip地址 
     * @return Vip vip地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set vip地址
     * @param Vip vip地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get vport端口 
     * @return Vport vport端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set vport端口
     * @param Vport vport端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 集群只读实例的vip地址和vport端口 
     * @return RoAddr 集群只读实例的vip地址和vport端口
     */
    public RoAddr [] getRoAddr() {
        return this.RoAddr;
    }

    /**
     * Set 集群只读实例的vip地址和vport端口
     * @param RoAddr 集群只读实例的vip地址和vport端口
     */
    public void setRoAddr(RoAddr [] RoAddr) {
        this.RoAddr = RoAddr;
    }

    /**
     * Get cynos版本 
     * @return CynosVersion cynos版本
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set cynos版本
     * @param CynosVersion cynos版本
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get 是否冻结 
     * @return IsFreeze 是否冻结
     */
    public String getIsFreeze() {
        return this.IsFreeze;
    }

    /**
     * Set 是否冻结
     * @param IsFreeze 是否冻结
     */
    public void setIsFreeze(String IsFreeze) {
        this.IsFreeze = IsFreeze;
    }

    /**
     * Get 任务列表 
     * @return Tasks 任务列表
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务列表
     * @param Tasks 任务列表
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 主可用区 
     * @return MasterZone 主可用区
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set 主可用区
     * @param MasterZone 主可用区
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get 实例集合 
     * @return InstanceSet 实例集合
     */
    public InstanceSet [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set 实例集合
     * @param InstanceSet 实例集合
     */
    public void setInstanceSet(InstanceSet [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 到期时间 
     * @return PeriodEndTime 到期时间
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 到期时间
     * @param PeriodEndTime 到期时间
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 项目id 
     * @return ProjectID 项目id
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 项目id
     * @param ProjectID 项目id
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get 自动续费标识 
     * @return RenewFlag 自动续费标识
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识
     * @param RenewFlag 自动续费标识
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 版本标签 
     * @return CynosVersionTag 版本标签
     */
    public String getCynosVersionTag() {
        return this.CynosVersionTag;
    }

    /**
     * Set 版本标签
     * @param CynosVersionTag 版本标签
     */
    public void setCynosVersionTag(String CynosVersionTag) {
        this.CynosVersionTag = CynosVersionTag;
    }

    /**
     * Get 不支持添加ro yes-不支持添加ro， no/null/"" 支持添加ro 
     * @return NoSupportAddRo 不支持添加ro yes-不支持添加ro， no/null/"" 支持添加ro
     */
    public String getNoSupportAddRo() {
        return this.NoSupportAddRo;
    }

    /**
     * Set 不支持添加ro yes-不支持添加ro， no/null/"" 支持添加ro
     * @param NoSupportAddRo 不支持添加ro yes-不支持添加ro， no/null/"" 支持添加ro
     */
    public void setNoSupportAddRo(String NoSupportAddRo) {
        this.NoSupportAddRo = NoSupportAddRo;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 物理可用区 
     * @return PhysicalZone 物理可用区
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set 物理可用区
     * @param PhysicalZone 物理可用区
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    public LibraDBClusterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraDBClusterDetail(LibraDBClusterDetail source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.UsedStorage != null) {
            this.UsedStorage = new Long(source.UsedStorage);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.RoAddr != null) {
            this.RoAddr = new RoAddr[source.RoAddr.length];
            for (int i = 0; i < source.RoAddr.length; i++) {
                this.RoAddr[i] = new RoAddr(source.RoAddr[i]);
            }
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.IsFreeze != null) {
            this.IsFreeze = new String(source.IsFreeze);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.InstanceSet != null) {
            this.InstanceSet = new InstanceSet[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new InstanceSet(source.InstanceSet[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.CynosVersionTag != null) {
            this.CynosVersionTag = new String(source.CynosVersionTag);
        }
        if (source.NoSupportAddRo != null) {
            this.NoSupportAddRo = new String(source.NoSupportAddRo);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "UsedStorage", this.UsedStorage);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamArrayObj(map, prefix + "RoAddr.", this.RoAddr);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "CynosVersionTag", this.CynosVersionTag);
        this.setParamSimple(map, prefix + "NoSupportAddRo", this.NoSupportAddRo);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);

    }
}

