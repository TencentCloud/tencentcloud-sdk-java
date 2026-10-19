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

public class ClusterInstanceDetail extends AbstractModel {

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
    * <p>引擎类型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例状态</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * <p>实例状态描述</p>
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * <p>cpu核数</p>
    */
    @SerializedName("InstanceCpu")
    @Expose
    private Long InstanceCpu;

    /**
    * <p>Cpu</p><p>单位：核</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>serverless实例cpu下限</p><p>单位：核</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>serverless实例cpu上限</p><p>单位：核</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>内存</p><p>单位：GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>内存</p>
    */
    @SerializedName("InstanceMemory")
    @Expose
    private Long InstanceMemory;

    /**
    * <p>硬盘</p>
    */
    @SerializedName("InstanceStorage")
    @Expose
    private Long InstanceStorage;

    /**
    * <p>实例角色</p>
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * <p>执行开始时间(距离0点的秒数)</p>
    */
    @SerializedName("MaintainStartTime")
    @Expose
    private Long MaintainStartTime;

    /**
    * <p>持续的时间(单位：秒)</p>
    */
    @SerializedName("MaintainDuration")
    @Expose
    private Long MaintainDuration;

    /**
    * <p>可以执行的时间，枚举值：[&quot;Mon&quot;,&quot;Tue&quot;,&quot;Wed&quot;,&quot;Thu&quot;,&quot;Fri&quot;, &quot;Sat&quot;, &quot;Sun&quot;]</p>
    */
    @SerializedName("MaintainWeekDays")
    @Expose
    private String [] MaintainWeekDays;

    /**
    * <p>实例任务信息</p>
    */
    @SerializedName("InstanceTasks")
    @Expose
    private ObjectTask [] InstanceTasks;

    /**
    * <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
    */
    @SerializedName("InstanceDeviceType")
    @Expose
    private String InstanceDeviceType;

    /**
    * <p>实例存储类型<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
    * <p>数据库类型</p>
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * <p>节点列表<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
    * <p>serverless实例子状态</p>
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * <p>AI优化器状态</p>
    */
    @SerializedName("AIOptimizerStatus")
    @Expose
    private AIOptimizerStatus AIOptimizerStatus;

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
    * <p>实例所在的物理可用区</p>
    */
    @SerializedName("PhysicalZone")
    @Expose
    private String PhysicalZone;

    /**
    * <p>实例状态</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>running： 运行中</li><li>isolating： 隔离中</li><li>isolated： 已隔离</li><li>activating： 恢复中</li><li>offlining： 下线中</li><li>offlined： 已下线</li></ul>
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
    * <p>存储量</p><p>单位：GB</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>预付费存储Id</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>存储付费类型</p><p>枚举值：</p><ul><li>0： 后付费</li><li>1： 预付费</li></ul>
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

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
    * <p>隔离时间</p>
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * <p>实例销毁时间</p>
    */
    @SerializedName("DestroyTime")
    @Expose
    private String DestroyTime;

    /**
    * <p>销毁期限</p>
    */
    @SerializedName("DestroyDeadlineText")
    @Expose
    private String DestroyDeadlineText;

    /**
    * <p>实例过期时间</p>
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

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
    * <p>网络类型</p>
    */
    @SerializedName("NetType")
    @Expose
    private Long NetType;

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
    * <p>外网开启状态</p>
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * <p>实例外网域名</p>
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * <p>实例的网络信息</p>
    */
    @SerializedName("InstanceNetInfo")
    @Expose
    private InstanceNetInfo [] InstanceNetInfo;

    /**
    * <p>付费模式</p><p>枚举值：</p><ul><li>0： 后付费</li><li>1： 预付费</li></ul>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

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
    * <p>当前实例支持的能力</p>
    */
    @SerializedName("InstanceAbility")
    @Expose
    private InstanceAbility InstanceAbility;

    /**
    * <p>实例机器类型</p><p>枚举值：</p><ul><li>common： 通用型</li><li>exclusive： 独享型</li></ul>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

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
     * Get <p>引擎类型</p> 
     * @return InstanceType <p>引擎类型</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>引擎类型</p>
     * @param InstanceType <p>引擎类型</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例状态</p> 
     * @return InstanceStatus <p>实例状态</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态</p>
     * @param InstanceStatus <p>实例状态</p>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>实例状态描述</p> 
     * @return InstanceStatusDesc <p>实例状态描述</p>
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set <p>实例状态描述</p>
     * @param InstanceStatusDesc <p>实例状态描述</p>
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get <p>cpu核数</p> 
     * @return InstanceCpu <p>cpu核数</p>
     * @deprecated
     */
    @Deprecated
    public Long getInstanceCpu() {
        return this.InstanceCpu;
    }

    /**
     * Set <p>cpu核数</p>
     * @param InstanceCpu <p>cpu核数</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceCpu(Long InstanceCpu) {
        this.InstanceCpu = InstanceCpu;
    }

    /**
     * Get <p>Cpu</p><p>单位：核</p> 
     * @return Cpu <p>Cpu</p><p>单位：核</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Cpu</p><p>单位：核</p>
     * @param Cpu <p>Cpu</p><p>单位：核</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>serverless实例cpu下限</p><p>单位：核</p> 
     * @return MinCpu <p>serverless实例cpu下限</p><p>单位：核</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>serverless实例cpu下限</p><p>单位：核</p>
     * @param MinCpu <p>serverless实例cpu下限</p><p>单位：核</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>serverless实例cpu上限</p><p>单位：核</p> 
     * @return MaxCpu <p>serverless实例cpu上限</p><p>单位：核</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>serverless实例cpu上限</p><p>单位：核</p>
     * @param MaxCpu <p>serverless实例cpu上限</p><p>单位：核</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>内存</p><p>单位：GB</p> 
     * @return Memory <p>内存</p><p>单位：GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存</p><p>单位：GB</p>
     * @param Memory <p>内存</p><p>单位：GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>内存</p> 
     * @return InstanceMemory <p>内存</p>
     */
    public Long getInstanceMemory() {
        return this.InstanceMemory;
    }

    /**
     * Set <p>内存</p>
     * @param InstanceMemory <p>内存</p>
     */
    public void setInstanceMemory(Long InstanceMemory) {
        this.InstanceMemory = InstanceMemory;
    }

    /**
     * Get <p>硬盘</p> 
     * @return InstanceStorage <p>硬盘</p>
     */
    public Long getInstanceStorage() {
        return this.InstanceStorage;
    }

    /**
     * Set <p>硬盘</p>
     * @param InstanceStorage <p>硬盘</p>
     */
    public void setInstanceStorage(Long InstanceStorage) {
        this.InstanceStorage = InstanceStorage;
    }

    /**
     * Get <p>实例角色</p> 
     * @return InstanceRole <p>实例角色</p>
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set <p>实例角色</p>
     * @param InstanceRole <p>实例角色</p>
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get <p>执行开始时间(距离0点的秒数)</p> 
     * @return MaintainStartTime <p>执行开始时间(距离0点的秒数)</p>
     */
    public Long getMaintainStartTime() {
        return this.MaintainStartTime;
    }

    /**
     * Set <p>执行开始时间(距离0点的秒数)</p>
     * @param MaintainStartTime <p>执行开始时间(距离0点的秒数)</p>
     */
    public void setMaintainStartTime(Long MaintainStartTime) {
        this.MaintainStartTime = MaintainStartTime;
    }

    /**
     * Get <p>持续的时间(单位：秒)</p> 
     * @return MaintainDuration <p>持续的时间(单位：秒)</p>
     */
    public Long getMaintainDuration() {
        return this.MaintainDuration;
    }

    /**
     * Set <p>持续的时间(单位：秒)</p>
     * @param MaintainDuration <p>持续的时间(单位：秒)</p>
     */
    public void setMaintainDuration(Long MaintainDuration) {
        this.MaintainDuration = MaintainDuration;
    }

    /**
     * Get <p>可以执行的时间，枚举值：[&quot;Mon&quot;,&quot;Tue&quot;,&quot;Wed&quot;,&quot;Thu&quot;,&quot;Fri&quot;, &quot;Sat&quot;, &quot;Sun&quot;]</p> 
     * @return MaintainWeekDays <p>可以执行的时间，枚举值：[&quot;Mon&quot;,&quot;Tue&quot;,&quot;Wed&quot;,&quot;Thu&quot;,&quot;Fri&quot;, &quot;Sat&quot;, &quot;Sun&quot;]</p>
     */
    public String [] getMaintainWeekDays() {
        return this.MaintainWeekDays;
    }

    /**
     * Set <p>可以执行的时间，枚举值：[&quot;Mon&quot;,&quot;Tue&quot;,&quot;Wed&quot;,&quot;Thu&quot;,&quot;Fri&quot;, &quot;Sat&quot;, &quot;Sun&quot;]</p>
     * @param MaintainWeekDays <p>可以执行的时间，枚举值：[&quot;Mon&quot;,&quot;Tue&quot;,&quot;Wed&quot;,&quot;Thu&quot;,&quot;Fri&quot;, &quot;Sat&quot;, &quot;Sun&quot;]</p>
     */
    public void setMaintainWeekDays(String [] MaintainWeekDays) {
        this.MaintainWeekDays = MaintainWeekDays;
    }

    /**
     * Get <p>实例任务信息</p> 
     * @return InstanceTasks <p>实例任务信息</p>
     */
    public ObjectTask [] getInstanceTasks() {
        return this.InstanceTasks;
    }

    /**
     * Set <p>实例任务信息</p>
     * @param InstanceTasks <p>实例任务信息</p>
     */
    public void setInstanceTasks(ObjectTask [] InstanceTasks) {
        this.InstanceTasks = InstanceTasks;
    }

    /**
     * Get <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol> 
     * @return InstanceDeviceType <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     */
    public String getInstanceDeviceType() {
        return this.InstanceDeviceType;
    }

    /**
     * Set <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     * @param InstanceDeviceType <p>实例机器类型</p><ol><li>common，通用型。</li><li>exclusive，独享型。</li></ol>
     */
    public void setInstanceDeviceType(String InstanceDeviceType) {
        this.InstanceDeviceType = InstanceDeviceType;
    }

    /**
     * Get <p>实例存储类型<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p> 
     * @return InstanceStorageType <p>实例存储类型<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set <p>实例存储类型<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     * @param InstanceStorageType <p>实例存储类型<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    /**
     * Get <p>数据库类型</p> 
     * @return DbMode <p>数据库类型</p>
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set <p>数据库类型</p>
     * @param DbMode <p>数据库类型</p>
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get <p>节点列表<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p> 
     * @return NodeList <p>节点列表<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set <p>节点列表<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     * @param NodeList <p>节点列表<br>说明：仅当要查询的资源为 LibraDB 时，此参数才会返回值。</p>
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get <p>serverless实例子状态</p> 
     * @return ServerlessStatus <p>serverless实例子状态</p>
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set <p>serverless实例子状态</p>
     * @param ServerlessStatus <p>serverless实例子状态</p>
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get <p>AI优化器状态</p> 
     * @return AIOptimizerStatus <p>AI优化器状态</p>
     */
    public AIOptimizerStatus getAIOptimizerStatus() {
        return this.AIOptimizerStatus;
    }

    /**
     * Set <p>AI优化器状态</p>
     * @param AIOptimizerStatus <p>AI优化器状态</p>
     */
    public void setAIOptimizerStatus(AIOptimizerStatus AIOptimizerStatus) {
        this.AIOptimizerStatus = AIOptimizerStatus;
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
     * Get <p>实例所在的物理可用区</p> 
     * @return PhysicalZone <p>实例所在的物理可用区</p>
     */
    public String getPhysicalZone() {
        return this.PhysicalZone;
    }

    /**
     * Set <p>实例所在的物理可用区</p>
     * @param PhysicalZone <p>实例所在的物理可用区</p>
     */
    public void setPhysicalZone(String PhysicalZone) {
        this.PhysicalZone = PhysicalZone;
    }

    /**
     * Get <p>实例状态</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>running： 运行中</li><li>isolating： 隔离中</li><li>isolated： 已隔离</li><li>activating： 恢复中</li><li>offlining： 下线中</li><li>offlined： 已下线</li></ul> 
     * @return Status <p>实例状态</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>running： 运行中</li><li>isolating： 隔离中</li><li>isolated： 已隔离</li><li>activating： 恢复中</li><li>offlining： 下线中</li><li>offlined： 已下线</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>running： 运行中</li><li>isolating： 隔离中</li><li>isolated： 已隔离</li><li>activating： 恢复中</li><li>offlining： 下线中</li><li>offlined： 已下线</li></ul>
     * @param Status <p>实例状态</p><p>枚举值：</p><ul><li>creating： 创建中</li><li>running： 运行中</li><li>isolating： 隔离中</li><li>isolated： 已隔离</li><li>activating： 恢复中</li><li>offlining： 下线中</li><li>offlined： 已下线</li></ul>
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
     * Get <p>存储量</p><p>单位：GB</p> 
     * @return Storage <p>存储量</p><p>单位：GB</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>存储量</p><p>单位：GB</p>
     * @param Storage <p>存储量</p><p>单位：GB</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
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
     * Get <p>存储付费类型</p><p>枚举值：</p><ul><li>0： 后付费</li><li>1： 预付费</li></ul> 
     * @return StoragePayMode <p>存储付费类型</p><p>枚举值：</p><ul><li>0： 后付费</li><li>1： 预付费</li></ul>
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set <p>存储付费类型</p><p>枚举值：</p><ul><li>0： 后付费</li><li>1： 预付费</li></ul>
     * @param StoragePayMode <p>存储付费类型</p><p>枚举值：</p><ul><li>0： 后付费</li><li>1： 预付费</li></ul>
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
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
     * Get <p>外网开启状态</p> 
     * @return WanStatus <p>外网开启状态</p>
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set <p>外网开启状态</p>
     * @param WanStatus <p>外网开启状态</p>
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get <p>实例外网域名</p> 
     * @return WanDomain <p>实例外网域名</p>
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set <p>实例外网域名</p>
     * @param WanDomain <p>实例外网域名</p>
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get <p>实例的网络信息</p> 
     * @return InstanceNetInfo <p>实例的网络信息</p>
     */
    public InstanceNetInfo [] getInstanceNetInfo() {
        return this.InstanceNetInfo;
    }

    /**
     * Set <p>实例的网络信息</p>
     * @param InstanceNetInfo <p>实例的网络信息</p>
     */
    public void setInstanceNetInfo(InstanceNetInfo [] InstanceNetInfo) {
        this.InstanceNetInfo = InstanceNetInfo;
    }

    /**
     * Get <p>付费模式</p><p>枚举值：</p><ul><li>0： 后付费</li><li>1： 预付费</li></ul> 
     * @return PayMode <p>付费模式</p><p>枚举值：</p><ul><li>0： 后付费</li><li>1： 预付费</li></ul>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费模式</p><p>枚举值：</p><ul><li>0： 后付费</li><li>1： 预付费</li></ul>
     * @param PayMode <p>付费模式</p><p>枚举值：</p><ul><li>0： 后付费</li><li>1： 预付费</li></ul>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
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
     * Get <p>实例机器类型</p><p>枚举值：</p><ul><li>common： 通用型</li><li>exclusive： 独享型</li></ul> 
     * @return DeviceType <p>实例机器类型</p><p>枚举值：</p><ul><li>common： 通用型</li><li>exclusive： 独享型</li></ul>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>实例机器类型</p><p>枚举值：</p><ul><li>common： 通用型</li><li>exclusive： 独享型</li></ul>
     * @param DeviceType <p>实例机器类型</p><p>枚举值：</p><ul><li>common： 通用型</li><li>exclusive： 独享型</li></ul>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
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

    public ClusterInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInstanceDetail(ClusterInstanceDetail source) {
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
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.InstanceCpu != null) {
            this.InstanceCpu = new Long(source.InstanceCpu);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceMemory != null) {
            this.InstanceMemory = new Long(source.InstanceMemory);
        }
        if (source.InstanceStorage != null) {
            this.InstanceStorage = new Long(source.InstanceStorage);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.MaintainStartTime != null) {
            this.MaintainStartTime = new Long(source.MaintainStartTime);
        }
        if (source.MaintainDuration != null) {
            this.MaintainDuration = new Long(source.MaintainDuration);
        }
        if (source.MaintainWeekDays != null) {
            this.MaintainWeekDays = new String[source.MaintainWeekDays.length];
            for (int i = 0; i < source.MaintainWeekDays.length; i++) {
                this.MaintainWeekDays[i] = new String(source.MaintainWeekDays[i]);
            }
        }
        if (source.InstanceTasks != null) {
            this.InstanceTasks = new ObjectTask[source.InstanceTasks.length];
            for (int i = 0; i < source.InstanceTasks.length; i++) {
                this.InstanceTasks[i] = new ObjectTask(source.InstanceTasks[i]);
            }
        }
        if (source.InstanceDeviceType != null) {
            this.InstanceDeviceType = new String(source.InstanceDeviceType);
        }
        if (source.InstanceStorageType != null) {
            this.InstanceStorageType = new String(source.InstanceStorageType);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.NodeList != null) {
            this.NodeList = new String[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new String(source.NodeList[i]);
            }
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.AIOptimizerStatus != null) {
            this.AIOptimizerStatus = new AIOptimizerStatus(source.AIOptimizerStatus);
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
        if (source.PhysicalZone != null) {
            this.PhysicalZone = new String(source.PhysicalZone);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new String(source.DestroyTime);
        }
        if (source.DestroyDeadlineText != null) {
            this.DestroyDeadlineText = new String(source.DestroyDeadlineText);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
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
        if (source.NetType != null) {
            this.NetType = new Long(source.NetType);
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
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.InstanceNetInfo != null) {
            this.InstanceNetInfo = new InstanceNetInfo[source.InstanceNetInfo.length];
            for (int i = 0; i < source.InstanceNetInfo.length; i++) {
                this.InstanceNetInfo[i] = new InstanceNetInfo(source.InstanceNetInfo[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ProcessingTask != null) {
            this.ProcessingTask = new String(source.ProcessingTask);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
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
        if (source.InstanceAbility != null) {
            this.InstanceAbility = new InstanceAbility(source.InstanceAbility);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
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
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "InstanceCpu", this.InstanceCpu);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceMemory", this.InstanceMemory);
        this.setParamSimple(map, prefix + "InstanceStorage", this.InstanceStorage);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "MaintainStartTime", this.MaintainStartTime);
        this.setParamSimple(map, prefix + "MaintainDuration", this.MaintainDuration);
        this.setParamArraySimple(map, prefix + "MaintainWeekDays.", this.MaintainWeekDays);
        this.setParamArrayObj(map, prefix + "InstanceTasks.", this.InstanceTasks);
        this.setParamSimple(map, prefix + "InstanceDeviceType", this.InstanceDeviceType);
        this.setParamSimple(map, prefix + "InstanceStorageType", this.InstanceStorageType);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamArraySimple(map, prefix + "NodeList.", this.NodeList);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamObj(map, prefix + "AIOptimizerStatus.", this.AIOptimizerStatus);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "PhysicalZone", this.PhysicalZone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "DestroyDeadlineText", this.DestroyDeadlineText);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamArrayObj(map, prefix + "InstanceNetInfo.", this.InstanceNetInfo);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProcessingTask", this.ProcessingTask);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "IsFreeze", this.IsFreeze);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamObj(map, prefix + "InstanceAbility.", this.InstanceAbility);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);

    }
}

