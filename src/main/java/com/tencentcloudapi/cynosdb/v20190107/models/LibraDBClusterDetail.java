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
    * <p>集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>状态描述</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>存储大小</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>VPC名称</p>
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * <p>vpc唯一id</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网名称</p>
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>数据库版本</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>使用容量</p>
    */
    @SerializedName("UsedStorage")
    @Expose
    private Long UsedStorage;

    /**
    * <p>vip地址</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>vport端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>集群只读实例的vip地址和vport端口</p>
    */
    @SerializedName("RoAddr")
    @Expose
    private RoAddr [] RoAddr;

    /**
    * <p>cynos版本</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * <p>是否冻结</p>
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * <p>任务列表</p>
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * <p>主可用区</p>
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * <p>实例集合</p>
    */
    @SerializedName("InstanceSet")
    @Expose
    private InstanceSet [] InstanceSet;

    /**
    * <p>付费模式</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>到期时间</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>项目id</p>
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * <p>自动续费标识</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>版本标签</p>
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * <p>不支持添加ro yes-不支持添加ro， no/null/&quot;&quot; 支持添加ro</p>
    */
    @SerializedName("NoSupportAddRo")
    @Expose
    private String NoSupportAddRo;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>物理可用区</p>
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * <p>版本升级灰度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisUpgradeVersionInfo")
    @Expose
    private UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo;

    /**
     * Get <p>集群id</p> 
     * @return ClusterId <p>集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterId <p>集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>状态描述</p> 
     * @return StatusDesc <p>状态描述</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>状态描述</p>
     * @param StatusDesc <p>状态描述</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>存储大小</p> 
     * @return Storage <p>存储大小</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>存储大小</p>
     * @param Storage <p>存储大小</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>VPC名称</p> 
     * @return VpcName <p>VPC名称</p>
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set <p>VPC名称</p>
     * @param VpcName <p>VPC名称</p>
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get <p>vpc唯一id</p> 
     * @return VpcId <p>vpc唯一id</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc唯一id</p>
     * @param VpcId <p>vpc唯一id</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网名称</p> 
     * @return SubnetName <p>子网名称</p>
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set <p>子网名称</p>
     * @param SubnetName <p>子网名称</p>
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubnetId <p>子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetId <p>子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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
     * Get <p>数据库版本</p> 
     * @return DbVersion <p>数据库版本</p>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set <p>数据库版本</p>
     * @param DbVersion <p>数据库版本</p>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get <p>使用容量</p> 
     * @return UsedStorage <p>使用容量</p>
     */
    public Long getUsedStorage() {
        return this.UsedStorage;
    }

    /**
     * Set <p>使用容量</p>
     * @param UsedStorage <p>使用容量</p>
     */
    public void setUsedStorage(Long UsedStorage) {
        this.UsedStorage = UsedStorage;
    }

    /**
     * Get <p>vip地址</p> 
     * @return Vip <p>vip地址</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>vip地址</p>
     * @param Vip <p>vip地址</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>vport端口</p> 
     * @return Vport <p>vport端口</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>vport端口</p>
     * @param Vport <p>vport端口</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>集群只读实例的vip地址和vport端口</p> 
     * @return RoAddr <p>集群只读实例的vip地址和vport端口</p>
     */
    public RoAddr [] getRoAddr() {
        return this.RoAddr;
    }

    /**
     * Set <p>集群只读实例的vip地址和vport端口</p>
     * @param RoAddr <p>集群只读实例的vip地址和vport端口</p>
     */
    public void setRoAddr(RoAddr [] RoAddr) {
        this.RoAddr = RoAddr;
    }

    /**
     * Get <p>cynos版本</p> 
     * @return CynosVersion <p>cynos版本</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>cynos版本</p>
     * @param CynosVersion <p>cynos版本</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get <p>是否冻结</p> 
     * @return IsFreeze <p>是否冻结</p>
     */
    public String getIsFreeze() {
        return this.IsFreeze;
    }

    /**
     * Set <p>是否冻结</p>
     * @param IsFreeze <p>是否冻结</p>
     */
    public void setIsFreeze(String IsFreeze) {
        this.IsFreeze = IsFreeze;
    }

    /**
     * Get <p>任务列表</p> 
     * @return Tasks <p>任务列表</p>
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务列表</p>
     * @param Tasks <p>任务列表</p>
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>主可用区</p> 
     * @return MasterZone <p>主可用区</p>
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set <p>主可用区</p>
     * @param MasterZone <p>主可用区</p>
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get <p>实例集合</p> 
     * @return InstanceSet <p>实例集合</p>
     */
    public InstanceSet [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set <p>实例集合</p>
     * @param InstanceSet <p>实例集合</p>
     */
    public void setInstanceSet(InstanceSet [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get <p>付费模式</p> 
     * @return PayMode <p>付费模式</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式</p>
     * @param PayMode <p>付费模式</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>到期时间</p> 
     * @return PeriodEndTime <p>到期时间</p>
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>到期时间</p>
     * @param PeriodEndTime <p>到期时间</p>
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get <p>项目id</p> 
     * @return ProjectID <p>项目id</p>
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set <p>项目id</p>
     * @param ProjectID <p>项目id</p>
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get <p>自动续费标识</p> 
     * @return RenewFlag <p>自动续费标识</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>自动续费标识</p>
     * @param RenewFlag <p>自动续费标识</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>版本标签</p> 
     * @return CynosVersionTag <p>版本标签</p>
     */
    public String getCynosVersionTag() {
        return this.CynosVersionTag;
    }

    /**
     * Set <p>版本标签</p>
     * @param CynosVersionTag <p>版本标签</p>
     */
    public void setCynosVersionTag(String CynosVersionTag) {
        this.CynosVersionTag = CynosVersionTag;
    }

    /**
     * Get <p>不支持添加ro yes-不支持添加ro， no/null/&quot;&quot; 支持添加ro</p> 
     * @return NoSupportAddRo <p>不支持添加ro yes-不支持添加ro， no/null/&quot;&quot; 支持添加ro</p>
     */
    public String getNoSupportAddRo() {
        return this.NoSupportAddRo;
    }

    /**
     * Set <p>不支持添加ro yes-不支持添加ro， no/null/&quot;&quot; 支持添加ro</p>
     * @param NoSupportAddRo <p>不支持添加ro yes-不支持添加ro， no/null/&quot;&quot; 支持添加ro</p>
     */
    public void setNoSupportAddRo(String NoSupportAddRo) {
        this.NoSupportAddRo = NoSupportAddRo;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>物理可用区</p> 
     * @return PhysicalZone <p>物理可用区</p>
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set <p>物理可用区</p>
     * @param PhysicalZone <p>物理可用区</p>
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get <p>版本升级灰度信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisUpgradeVersionInfo <p>版本升级灰度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpgradeAnalysisInstanceVersionInfo getAnalysisUpgradeVersionInfo() {
        return this.AnalysisUpgradeVersionInfo;
    }

    /**
     * Set <p>版本升级灰度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisUpgradeVersionInfo <p>版本升级灰度信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisUpgradeVersionInfo(UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo) {
        this.AnalysisUpgradeVersionInfo = AnalysisUpgradeVersionInfo;
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
        if (source.AnalysisUpgradeVersionInfo != null) {
            this.AnalysisUpgradeVersionInfo = new UpgradeAnalysisInstanceVersionInfo(source.AnalysisUpgradeVersionInfo);
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
        this.setParamObj(map, prefix + "AnalysisUpgradeVersionInfo.", this.AnalysisUpgradeVersionInfo);

    }
}

