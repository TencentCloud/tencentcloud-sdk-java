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

public class CynosdbInstanceDetail extends AbstractModel {

    /**
    * 用户Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 用户AppId
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
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例状态中文描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * serverless实例状态, 可能值：
resume
pause
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * 数据库类型
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Cpu，单位：核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 存储量，单位：GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例当前角色
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例过期时间
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 网络类型
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * VPC网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例内网IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 实例内网端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 实例外网域名
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 字符集
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * Cynos内核版本
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * 续费标志
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * serverless实例cpu下限
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * serverless实例cpu上限
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * Db类型:<li>NORMAL</li><li>SERVERLESS</li>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
     * Get 用户Uin 
     * @return Uin 用户Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
     * @param Uin 用户Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 用户AppId 
     * @return AppId 用户AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
     * @param AppId 用户AppId
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
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 实例状态 
     * @return Status 实例状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
     * @param Status 实例状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例状态中文描述 
     * @return StatusDesc 实例状态中文描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 实例状态中文描述
     * @param StatusDesc 实例状态中文描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get serverless实例状态, 可能值：
resume
pause 
     * @return ServerlessStatus serverless实例状态, 可能值：
resume
pause
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set serverless实例状态, 可能值：
resume
pause
     * @param ServerlessStatus serverless实例状态, 可能值：
resume
pause
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get 数据库类型 
     * @return DbType 数据库类型
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型
     * @param DbType 数据库类型
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
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
     * Get Cpu，单位：核 
     * @return Cpu Cpu，单位：核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu，单位：核
     * @param Cpu Cpu，单位：核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存，单位：GB 
     * @return Memory 内存，单位：GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存，单位：GB
     * @param Memory 内存，单位：GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 存储量，单位：GB 
     * @return Storage 存储量，单位：GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储量，单位：GB
     * @param Storage 存储量，单位：GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例当前角色 
     * @return InstanceRole 实例当前角色
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 实例当前角色
     * @param InstanceRole 实例当前角色
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
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
     * Get 实例过期时间 
     * @return PeriodEndTime 实例过期时间
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 实例过期时间
     * @param PeriodEndTime 实例过期时间
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 网络类型 
     * @return NetType 网络类型
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set 网络类型
     * @param NetType 网络类型
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get VPC网络ID 
     * @return VpcId VPC网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC网络ID
     * @param VpcId VPC网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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
     * Get 实例内网IP 
     * @return Vip 实例内网IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例内网IP
     * @param Vip 实例内网IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 实例内网端口 
     * @return Vport 实例内网端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例内网端口
     * @param Vport 实例内网端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 实例外网域名 
     * @return WanDomain 实例外网域名
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 实例外网域名
     * @param WanDomain 实例外网域名
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get 字符集 
     * @return Charset 字符集
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set 字符集
     * @param Charset 字符集
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get Cynos内核版本 
     * @return CynosVersion Cynos内核版本
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set Cynos内核版本
     * @param CynosVersion Cynos内核版本
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get 续费标志 
     * @return RenewFlag 续费标志
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标志
     * @param RenewFlag 续费标志
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get serverless实例cpu下限 
     * @return MinCpu serverless实例cpu下限
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set serverless实例cpu下限
     * @param MinCpu serverless实例cpu下限
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get serverless实例cpu上限 
     * @return MaxCpu serverless实例cpu上限
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set serverless实例cpu上限
     * @param MaxCpu serverless实例cpu上限
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get Db类型:<li>NORMAL</li><li>SERVERLESS</li> 
     * @return DbMode Db类型:<li>NORMAL</li><li>SERVERLESS</li>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set Db类型:<li>NORMAL</li><li>SERVERLESS</li>
     * @param DbMode Db类型:<li>NORMAL</li><li>SERVERLESS</li>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    public CynosdbInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbInstanceDetail(CynosdbInstanceDetail source) {
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
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
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
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
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
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.Charset != null) {
            this.Charset = new String(source.Charset);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
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
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);

    }
}

