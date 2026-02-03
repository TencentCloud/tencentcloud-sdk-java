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

public class LibraDBClusterSet extends AbstractModel {

    /**
    * 用户id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 集群ID
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
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * cynos版本
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * 版本标签
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * 实例数量
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 是否冻结
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * 网络地址
    */
    @SerializedName("NetAddrs")
    @Expose
    private NetAddr [] NetAddrs;

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
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 自动续费标识，1为自动续费，0为到期不续
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

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
    * 存储大小，单位为G
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 任务列表
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * 账户id
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * vip地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * vpc唯一id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vport端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 主可用区
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * 物理可用区
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 用户id 
     * @return AppId 用户id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户id
     * @param AppId 用户id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
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
     * Get 实例数量 
     * @return InstanceNum 实例数量
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 实例数量
     * @param InstanceNum 实例数量
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
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
     * Get 网络地址 
     * @return NetAddrs 网络地址
     */
    public NetAddr [] getNetAddrs() {
        return this.NetAddrs;
    }

    /**
     * Set 网络地址
     * @param NetAddrs 网络地址
     */
    public void setNetAddrs(NetAddr [] NetAddrs) {
        this.NetAddrs = NetAddrs;
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
     * Get 自动续费标识，1为自动续费，0为到期不续 
     * @return RenewFlag 自动续费标识，1为自动续费，0为到期不续
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识，1为自动续费，0为到期不续
     * @param RenewFlag 自动续费标识，1为自动续费，0为到期不续
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
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
     * Get 存储大小，单位为G 
     * @return Storage 存储大小，单位为G
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储大小，单位为G
     * @param Storage 存储大小，单位为G
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
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
     * Get 账户id 
     * @return Uin 账户id
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 账户id
     * @param Uin 账户id
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
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
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    public LibraDBClusterSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraDBClusterSet(LibraDBClusterSet source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.CynosVersionTag != null) {
            this.CynosVersionTag = new String(source.CynosVersionTag);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.IsFreeze != null) {
            this.IsFreeze = new String(source.IsFreeze);
        }
        if (source.NetAddrs != null) {
            this.NetAddrs = new NetAddr[source.NetAddrs.length];
            for (int i = 0; i < source.NetAddrs.length; i++) {
                this.NetAddrs[i] = new NetAddr(source.NetAddrs[i]);
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
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
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "CynosVersionTag", this.CynosVersionTag);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamArrayObj(map, prefix + "NetAddrs.", this.NetAddrs);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

