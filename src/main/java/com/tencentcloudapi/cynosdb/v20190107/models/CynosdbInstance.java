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

public class CynosdbInstance extends AbstractModel {

    /**
    * <p>用户Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>用户AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>集群ID</p>
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
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>实例状态中文描述</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>实例形态，是否为serverless实例</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>数据库类型</p>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>数据库版本</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>Cpu，单位：核</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存，单位：GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>存储量，单位：GB</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例当前角色</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>VPC网络ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>实例内网IP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>实例内网端口</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>付费模式</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>实例过期时间</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * <p>销毁期限</p>
    */
    @SerializedName("DestroyDeadlineText")
    @Expose
    private String DestroyDeadlineText;

    /**
    * <p>隔离时间</p>
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * <p>网络类型</p>
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

    /**
    * <p>外网域名</p>
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * <p>外网IP</p>
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * <p>外网端口</p>
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * <p>外网状态</p>
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * <p>实例销毁时间</p>
    */
    @SerializedName("DestroyTime")
    @Expose
    private String DestroyTime;

    /**
    * <p>Cynos内核版本</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * <p>正在处理的任务</p>
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * <p>续费标志</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>serverless实例cpu下限</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>serverless实例cpu上限</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>serverless实例状态, 可选值：<br>resume<br>pause</p>
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * <p>预付费存储Id</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>存储付费类型</p>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * <p>物理区</p>
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * <p>商业类型</p>
    */
    @SerializedName("BusinessType")
    @Expose
    private String BusinessType;

    /**
    * <p>任务</p>
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * <p>是否冻结</p>
    */
    @SerializedName("IsFreeze")
    @Expose
    private String IsFreeze;

    /**
    * <p>资源标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>主可用区</p>
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * <p>备可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaveZones")
    @Expose
    private String [] SlaveZones;

    /**
    * <p>实例网络信息</p>
    */
    @SerializedName("InstanceNetInfo")
    @Expose
    private InstanceNetInfo [] InstanceNetInfo;

    /**
    * <p>实例绑定资源包信息（此处只返回计算资源包，即packageType=CCU）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePackages")
    @Expose
    private ResourcePackage [] ResourcePackages;

    /**
    * <p>实例索引形态,可选值【mixedRowColumn（行列混存），onlyRowIndex（仅行存）】</p>
    */
    @SerializedName("InstanceIndexMode")
    @Expose
    private String InstanceIndexMode;

    /**
    * <p>当前实例支持的能力</p>
    */
    @SerializedName("InstanceAbility")
    @Expose
    private InstanceAbility InstanceAbility;

    /**
    * <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>实例存储类型</p>
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
    * <p>未知字段</p>
    */
    @SerializedName("CynosVersionTag")
    @Expose
    private String CynosVersionTag;

    /**
    * <p>libradb 节点信息</p>
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
    * <p>全球数据库唯一标识</p>
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
     * Get <p>用户Uin</p> 
     * @return Uin <p>用户Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>用户Uin</p>
     * @param Uin <p>用户Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>用户AppId</p> 
     * @return AppId <p>用户AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户AppId</p>
     * @param AppId <p>用户AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
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
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get <p>实例形态，是否为serverless实例</p> 
     * @return DbMode <p>实例形态，是否为serverless实例</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>实例形态，是否为serverless实例</p>
     * @param DbMode <p>实例形态，是否为serverless实例</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>数据库类型</p> 
     * @return DbType <p>数据库类型</p>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>数据库类型</p>
     * @param DbType <p>数据库类型</p>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
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
     * Get <p>Cpu，单位：核</p> 
     * @return Cpu <p>Cpu，单位：核</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Cpu，单位：核</p>
     * @param Cpu <p>Cpu，单位：核</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存，单位：GB</p> 
     * @return Memory <p>内存，单位：GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存，单位：GB</p>
     * @param Memory <p>内存，单位：GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>存储量，单位：GB</p> 
     * @return Storage <p>存储量，单位：GB</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>存储量，单位：GB</p>
     * @param Storage <p>存储量，单位：GB</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>实例类型</p> 
     * @return InstanceType <p>实例类型</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型</p>
     * @param InstanceType <p>实例类型</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例当前角色</p> 
     * @return InstanceRole <p>实例当前角色</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>实例当前角色</p>
     * @param InstanceRole <p>实例当前角色</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
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
     * Get <p>VPC网络ID</p> 
     * @return VpcId <p>VPC网络ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC网络ID</p>
     * @param VpcId <p>VPC网络ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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
     * Get <p>实例内网IP</p> 
     * @return Vip <p>实例内网IP</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>实例内网IP</p>
     * @param Vip <p>实例内网IP</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>实例内网端口</p> 
     * @return Vport <p>实例内网端口</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>实例内网端口</p>
     * @param Vport <p>实例内网端口</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
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
     * Get <p>实例过期时间</p> 
     * @return PeriodEndTime <p>实例过期时间</p>
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set <p>实例过期时间</p>
     * @param PeriodEndTime <p>实例过期时间</p>
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get <p>销毁期限</p> 
     * @return DestroyDeadlineText <p>销毁期限</p>
     */
    public String getDestroyDeadlineText() {
        return this.DestroyDeadlineText;
    }

    /**
     * Set <p>销毁期限</p>
     * @param DestroyDeadlineText <p>销毁期限</p>
     */
    public void setDestroyDeadlineText(String DestroyDeadlineText) {
        this.DestroyDeadlineText = DestroyDeadlineText;
    }

    /**
     * Get <p>隔离时间</p> 
     * @return IsolateTime <p>隔离时间</p>
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set <p>隔离时间</p>
     * @param IsolateTime <p>隔离时间</p>
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get <p>网络类型</p> 
     * @return NetType <p>网络类型</p>
     */
    public Long getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>网络类型</p>
     * @param NetType <p>网络类型</p>
     */
    public void setNetType(Long NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>外网域名</p> 
     * @return WanDomain <p>外网域名</p>
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set <p>外网域名</p>
     * @param WanDomain <p>外网域名</p>
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get <p>外网IP</p> 
     * @return WanIP <p>外网IP</p>
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set <p>外网IP</p>
     * @param WanIP <p>外网IP</p>
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get <p>外网端口</p> 
     * @return WanPort <p>外网端口</p>
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set <p>外网端口</p>
     * @param WanPort <p>外网端口</p>
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get <p>外网状态</p> 
     * @return WanStatus <p>外网状态</p>
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set <p>外网状态</p>
     * @param WanStatus <p>外网状态</p>
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get <p>实例销毁时间</p> 
     * @return DestroyTime <p>实例销毁时间</p>
     */
    public String getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set <p>实例销毁时间</p>
     * @param DestroyTime <p>实例销毁时间</p>
     */
    public void setDestroyTime(String DestroyTime) {
        this.DestroyTime = DestroyTime;
    }

    /**
     * Get <p>Cynos内核版本</p> 
     * @return CynosVersion <p>Cynos内核版本</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>Cynos内核版本</p>
     * @param CynosVersion <p>Cynos内核版本</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get <p>正在处理的任务</p> 
     * @return ProcessingTask <p>正在处理的任务</p>
     */
    public String getProcessingTask() {
        return this.ProcessingTask;
    }

    /**
     * Set <p>正在处理的任务</p>
     * @param ProcessingTask <p>正在处理的任务</p>
     */
    public void setProcessingTask(String ProcessingTask) {
        this.ProcessingTask = ProcessingTask;
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
     * Get <p>serverless实例cpu下限</p> 
     * @return MinCpu <p>serverless实例cpu下限</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>serverless实例cpu下限</p>
     * @param MinCpu <p>serverless实例cpu下限</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>serverless实例cpu上限</p> 
     * @return MaxCpu <p>serverless实例cpu上限</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>serverless实例cpu上限</p>
     * @param MaxCpu <p>serverless实例cpu上限</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>serverless实例状态, 可选值：<br>resume<br>pause</p> 
     * @return ServerlessStatus <p>serverless实例状态, 可选值：<br>resume<br>pause</p>
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set <p>serverless实例状态, 可选值：<br>resume<br>pause</p>
     * @param ServerlessStatus <p>serverless实例状态, 可选值：<br>resume<br>pause</p>
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get <p>预付费存储Id</p> 
     * @return StorageId <p>预付费存储Id</p>
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set <p>预付费存储Id</p>
     * @param StorageId <p>预付费存储Id</p>
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get <p>存储付费类型</p> 
     * @return StoragePayMode <p>存储付费类型</p>
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>存储付费类型</p>
     * @param StoragePayMode <p>存储付费类型</p>
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get <p>物理区</p> 
     * @return PhysicalZone <p>物理区</p>
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set <p>物理区</p>
     * @param PhysicalZone <p>物理区</p>
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get <p>商业类型</p> 
     * @return BusinessType <p>商业类型</p>
     */
    public String getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set <p>商业类型</p>
     * @param BusinessType <p>商业类型</p>
     */
    public void setBusinessType(String BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get <p>任务</p> 
     * @return Tasks <p>任务</p>
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务</p>
     * @param Tasks <p>任务</p>
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
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
     * Get <p>资源标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceTags <p>资源标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>资源标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceTags <p>资源标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
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
     * Get <p>备可用区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaveZones <p>备可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSlaveZones() {
        return this.SlaveZones;
    }

    /**
     * Set <p>备可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaveZones <p>备可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaveZones(String [] SlaveZones) {
        this.SlaveZones = SlaveZones;
    }

    /**
     * Get <p>实例网络信息</p> 
     * @return InstanceNetInfo <p>实例网络信息</p>
     */
    public InstanceNetInfo [] getInstanceNetInfo() {
        return this.InstanceNetInfo;
    }

    /**
     * Set <p>实例网络信息</p>
     * @param InstanceNetInfo <p>实例网络信息</p>
     */
    public void setInstanceNetInfo(InstanceNetInfo [] InstanceNetInfo) {
        this.InstanceNetInfo = InstanceNetInfo;
    }

    /**
     * Get <p>实例绑定资源包信息（此处只返回计算资源包，即packageType=CCU）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePackages <p>实例绑定资源包信息（此处只返回计算资源包，即packageType=CCU）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourcePackage [] getResourcePackages() {
        return this.ResourcePackages;
    }

    /**
     * Set <p>实例绑定资源包信息（此处只返回计算资源包，即packageType=CCU）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePackages <p>实例绑定资源包信息（此处只返回计算资源包，即packageType=CCU）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePackages(ResourcePackage [] ResourcePackages) {
        this.ResourcePackages = ResourcePackages;
    }

    /**
     * Get <p>实例索引形态,可选值【mixedRowColumn（行列混存），onlyRowIndex（仅行存）】</p> 
     * @return InstanceIndexMode <p>实例索引形态,可选值【mixedRowColumn（行列混存），onlyRowIndex（仅行存）】</p>
     */
    public String getInstanceIndexMode() {
        return this.InstanceIndexMode;
    }

    /**
     * Set <p>实例索引形态,可选值【mixedRowColumn（行列混存），onlyRowIndex（仅行存）】</p>
     * @param InstanceIndexMode <p>实例索引形态,可选值【mixedRowColumn（行列混存），onlyRowIndex（仅行存）】</p>
     */
    public void setInstanceIndexMode(String InstanceIndexMode) {
        this.InstanceIndexMode = InstanceIndexMode;
    }

    /**
     * Get <p>当前实例支持的能力</p> 
     * @return InstanceAbility <p>当前实例支持的能力</p>
     */
    public InstanceAbility getInstanceAbility() {
        return this.InstanceAbility;
    }

    /**
     * Set <p>当前实例支持的能力</p>
     * @param InstanceAbility <p>当前实例支持的能力</p>
     */
    public void setInstanceAbility(InstanceAbility InstanceAbility) {
        this.InstanceAbility = InstanceAbility;
    }

    /**
     * Get <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol> 
     * @return DeviceType <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     * @param DeviceType <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>实例存储类型</p> 
     * @return InstanceStorageType <p>实例存储类型</p>
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set <p>实例存储类型</p>
     * @param InstanceStorageType <p>实例存储类型</p>
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    /**
     * Get <p>未知字段</p> 
     * @return CynosVersionTag <p>未知字段</p>
     */
    public String getCynosVersionTag() {
        return this.CynosVersionTag;
    }

    /**
     * Set <p>未知字段</p>
     * @param CynosVersionTag <p>未知字段</p>
     */
    public void setCynosVersionTag(String CynosVersionTag) {
        this.CynosVersionTag = CynosVersionTag;
    }

    /**
     * Get <p>libradb 节点信息</p> 
     * @return NodeList <p>libradb 节点信息</p>
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set <p>libradb 节点信息</p>
     * @param NodeList <p>libradb 节点信息</p>
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get <p>全球数据库唯一标识</p> 
     * @return GdnId <p>全球数据库唯一标识</p>
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set <p>全球数据库唯一标识</p>
     * @param GdnId <p>全球数据库唯一标识</p>
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    public CynosdbInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbInstance(CynosdbInstance source) {
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
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
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
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.DestroyDeadlineText != null) {
            this.DestroyDeadlineText = new String(source.DestroyDeadlineText);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new String(source.DestroyTime);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.ProcessingTask != null) {
            this.ProcessingTask = new String(source.ProcessingTask);
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
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String(source.BusinessType);
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.IsFreeze != null) {
            this.IsFreeze = new String(source.IsFreeze);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.SlaveZones != null) {
            this.SlaveZones = new String[source.SlaveZones.length];
            for (int i = 0; i < source.SlaveZones.length; i++) {
                this.SlaveZones[i] = new String(source.SlaveZones[i]);
            }
        }
        if (source.InstanceNetInfo != null) {
            this.InstanceNetInfo = new InstanceNetInfo[source.InstanceNetInfo.length];
            for (int i = 0; i < source.InstanceNetInfo.length; i++) {
                this.InstanceNetInfo[i] = new InstanceNetInfo(source.InstanceNetInfo[i]);
            }
        }
        if (source.ResourcePackages != null) {
            this.ResourcePackages = new ResourcePackage[source.ResourcePackages.length];
            for (int i = 0; i < source.ResourcePackages.length; i++) {
                this.ResourcePackages[i] = new ResourcePackage(source.ResourcePackages[i]);
            }
        }
        if (source.InstanceIndexMode != null) {
            this.InstanceIndexMode = new String(source.InstanceIndexMode);
        }
        if (source.InstanceAbility != null) {
            this.InstanceAbility = new InstanceAbility(source.InstanceAbility);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.InstanceStorageType != null) {
            this.InstanceStorageType = new String(source.InstanceStorageType);
        }
        if (source.CynosVersionTag != null) {
            this.CynosVersionTag = new String(source.CynosVersionTag);
        }
        if (source.NodeList != null) {
            this.NodeList = new String[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new String(source.NodeList[i]);
            }
        }
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
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
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "DestroyDeadlineText", this.DestroyDeadlineText);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "ProcessingTask", this.ProcessingTask);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "BusinessType", this.BusinessType);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArraySimple(map, prefix + "SlaveZones.", this.SlaveZones);
        this.setParamArrayObj(map, prefix + "InstanceNetInfo.", this.InstanceNetInfo);
        this.setParamArrayObj(map, prefix + "ResourcePackages.", this.ResourcePackages);
        this.setParamSimple(map, prefix + "InstanceIndexMode", this.InstanceIndexMode);
        this.setParamObj(map, prefix + "InstanceAbility.", this.InstanceAbility);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "InstanceStorageType", this.InstanceStorageType);
        this.setParamSimple(map, prefix + "CynosVersionTag", this.CynosVersionTag);
        this.setParamArraySimple(map, prefix + "NodeList.", this.NodeList);
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);

    }
}

