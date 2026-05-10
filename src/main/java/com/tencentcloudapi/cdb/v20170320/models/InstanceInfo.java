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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel {

    /**
    * <p>外网状态，可能的返回值为：0-未开通外网；1-已开通外网；2-已关闭外网</p>
    */
    @SerializedName("WanStatus")
    @Expose
    private Long WanStatus;

    /**
    * <p>可用区信息</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>初始化标志，可能的返回值为：0-未初始化；1-已初始化</p>
    */
    @SerializedName("InitFlag")
    @Expose
    private Long InitFlag;

    /**
    * <p>只读vip信息。单独开通只读实例访问的只读实例才有该字段</p>
    */
    @SerializedName("RoVipInfo")
    @Expose
    private RoVipInfo RoVipInfo;

    /**
    * <p>内存容量，单位为 MB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例状态，可能的返回值：0-创建中；1-运行中；4-正在进行隔离操作；5-已隔离</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>私有网络 ID，例如：51102</p>
    */
    @SerializedName("VpcId")
    @Expose
    private Long VpcId;

    /**
    * <p>备机信息</p>
    */
    @SerializedName("SlaveInfo")
    @Expose
    private SlaveInfo SlaveInfo;

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>硬盘容量，单位为 GB</p>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>自动续费标志，可能的返回值：0-未开通自动续费；1-已开通自动续费；2-已关闭自动续费</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>数据复制方式。0 - 异步复制；1 - 半同步复制；2 - 强同步复制</p>
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
    * <p>只读组详细信息</p>
    */
    @SerializedName("RoGroups")
    @Expose
    private RoGroup [] RoGroups;

    /**
    * <p>子网 ID，例如：2333</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private Long SubnetId;

    /**
    * <p>实例类型，可能的返回值：1-主实例；2-灾备实例；3-只读实例</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * <p>项目 ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>地域信息</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>实例到期时间</p>
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * <p>可用区部署方式。可能的值为：0 - 单可用区；1 - 多可用区</p>
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * <p>实例任务状态。0 - 没有任务 ,1 - 升级中,2 - 数据导入中,3 - 开放Slave中,4 - 外网访问开通中,5 - 批量操作执行中,6 - 回档中,7 - 外网访问关闭中,8 - 密码修改中,9 - 实例名修改中,10 - 重启中,12 - 自建迁移中,13 - 删除库表中,14 - 灾备实例创建同步中,15 - 升级待切换,16 - 升级切换中,17 - 升级切换完成</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * <p>主实例详细信息</p>
    */
    @SerializedName("MasterInfo")
    @Expose
    private MasterInfo MasterInfo;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * <p>内核版本</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>灾备实例详细信息</p>
    */
    @SerializedName("DrInfo")
    @Expose
    private DrInfo [] DrInfo;

    /**
    * <p>外网域名</p>
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * <p>外网端口号</p>
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * <p>付费类型，可能的返回值：0-包年包月；1-按量计费</p>
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * <p>实例创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>实例 IP</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>端口号</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>磁盘写入是否被锁定（实例数据写入量已经超过磁盘配额）。0 -未被锁定 1 -已被锁定</p>
    */
    @SerializedName("CdbError")
    @Expose
    private Long CdbError;

    /**
    * <p>私有网络描述符，例如：“vpc-5v8wn9mg”</p>
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * <p>子网描述符，例如：“subnet-1typ0s7d”</p>
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * <p>物理 ID</p>
    */
    @SerializedName("PhysicalId")
    @Expose
    private String PhysicalId;

    /**
    * <p>核心数</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>每秒查询数量</p>
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * <p>可用区中文名称</p>
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * <p>物理机型</p>
    */
    @SerializedName("DeviceClass")
    @Expose
    private String DeviceClass;

    /**
    * <p>置放群组 ID</p>
    */
    @SerializedName("DeployGroupId")
    @Expose
    private String DeployGroupId;

    /**
    * <p>可用区 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>节点数</p>
    */
    @SerializedName("InstanceNodes")
    @Expose
    private Long InstanceNodes;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("TagList")
    @Expose
    private TagInfoItem [] TagList;

    /**
    * <p>引擎类型</p>
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * <p>最大延迟阈值</p>
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
    * <p>实例磁盘类型，仅云盘版和单节点（云盘）实例才会返回有效值。<br>说明：</p><ol><li>若返回：&quot;DiskType&quot;: &quot;CLOUD_HSSD&quot;，则表示该实例磁盘类型为增强型 SSD 云硬盘。</li><li>若返回：&quot;DiskType&quot;: &quot;CLOUD_SSD&quot;，则表示该实例磁盘类型为 SSD 云硬盘。</li><li>若返回：&quot;DiskType&quot;: &quot;&quot;，且参数 DeviceType 值为 UNIVERSAL 或 EXCLUSIVE，则表示该实例采用的是本地 SSD 盘。</li></ol>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>当前扩容的CPU核心数。</p>
    */
    @SerializedName("ExpandCpu")
    @Expose
    private Long ExpandCpu;

    /**
    * <p>云盘版实例节点信息</p>
    */
    @SerializedName("ClusterInfo")
    @Expose
    private ClusterInfo [] ClusterInfo;

    /**
    * <p>分析引擎节点列表</p>
    */
    @SerializedName("AnalysisNodeInfos")
    @Expose
    private AnalysisNodeInfo [] AnalysisNodeInfos;

    /**
    * <p>设备带宽，单位G。当DeviceClass不为空时此参数才有效。例：25-表示当前设备带宽为25G；10-表示当前设备带宽为10G。</p>
    */
    @SerializedName("DeviceBandwidth")
    @Expose
    private Long DeviceBandwidth;

    /**
    * <p>实例销毁保护状态，on表示开启保护，否则为关闭保护</p>
    */
    @SerializedName("DestroyProtect")
    @Expose
    private String DestroyProtect;

    /**
    * <p>TDSQL引擎参数</p>
    */
    @SerializedName("CpuModel")
    @Expose
    private String CpuModel;

    /**
    * <p>分析引擎实例版本升级信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisUpgradeVersionInfo")
    @Expose
    private UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo;

    /**
     * Get <p>外网状态，可能的返回值为：0-未开通外网；1-已开通外网；2-已关闭外网</p> 
     * @return WanStatus <p>外网状态，可能的返回值为：0-未开通外网；1-已开通外网；2-已关闭外网</p>
     */
    public Long getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set <p>外网状态，可能的返回值为：0-未开通外网；1-已开通外网；2-已关闭外网</p>
     * @param WanStatus <p>外网状态，可能的返回值为：0-未开通外网；1-已开通外网；2-已关闭外网</p>
     */
    public void setWanStatus(Long WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get <p>可用区信息</p> 
     * @return Zone <p>可用区信息</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区信息</p>
     * @param Zone <p>可用区信息</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>初始化标志，可能的返回值为：0-未初始化；1-已初始化</p> 
     * @return InitFlag <p>初始化标志，可能的返回值为：0-未初始化；1-已初始化</p>
     */
    public Long getInitFlag() {
        return this.InitFlag;
    }

    /**
     * Set <p>初始化标志，可能的返回值为：0-未初始化；1-已初始化</p>
     * @param InitFlag <p>初始化标志，可能的返回值为：0-未初始化；1-已初始化</p>
     */
    public void setInitFlag(Long InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * Get <p>只读vip信息。单独开通只读实例访问的只读实例才有该字段</p> 
     * @return RoVipInfo <p>只读vip信息。单独开通只读实例访问的只读实例才有该字段</p>
     */
    public RoVipInfo getRoVipInfo() {
        return this.RoVipInfo;
    }

    /**
     * Set <p>只读vip信息。单独开通只读实例访问的只读实例才有该字段</p>
     * @param RoVipInfo <p>只读vip信息。单独开通只读实例访问的只读实例才有该字段</p>
     */
    public void setRoVipInfo(RoVipInfo RoVipInfo) {
        this.RoVipInfo = RoVipInfo;
    }

    /**
     * Get <p>内存容量，单位为 MB</p> 
     * @return Memory <p>内存容量，单位为 MB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存容量，单位为 MB</p>
     * @param Memory <p>内存容量，单位为 MB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例状态，可能的返回值：0-创建中；1-运行中；4-正在进行隔离操作；5-已隔离</p> 
     * @return Status <p>实例状态，可能的返回值：0-创建中；1-运行中；4-正在进行隔离操作；5-已隔离</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态，可能的返回值：0-创建中；1-运行中；4-正在进行隔离操作；5-已隔离</p>
     * @param Status <p>实例状态，可能的返回值：0-创建中；1-运行中；4-正在进行隔离操作；5-已隔离</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>私有网络 ID，例如：51102</p> 
     * @return VpcId <p>私有网络 ID，例如：51102</p>
     */
    public Long getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络 ID，例如：51102</p>
     * @param VpcId <p>私有网络 ID，例如：51102</p>
     */
    public void setVpcId(Long VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>备机信息</p> 
     * @return SlaveInfo <p>备机信息</p>
     */
    public SlaveInfo getSlaveInfo() {
        return this.SlaveInfo;
    }

    /**
     * Set <p>备机信息</p>
     * @param SlaveInfo <p>备机信息</p>
     */
    public void setSlaveInfo(SlaveInfo SlaveInfo) {
        this.SlaveInfo = SlaveInfo;
    }

    /**
     * Get <p>实例 ID</p> 
     * @return InstanceId <p>实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param InstanceId <p>实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>硬盘容量，单位为 GB</p> 
     * @return Volume <p>硬盘容量，单位为 GB</p>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>硬盘容量，单位为 GB</p>
     * @param Volume <p>硬盘容量，单位为 GB</p>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>自动续费标志，可能的返回值：0-未开通自动续费；1-已开通自动续费；2-已关闭自动续费</p> 
     * @return AutoRenew <p>自动续费标志，可能的返回值：0-未开通自动续费；1-已开通自动续费；2-已关闭自动续费</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>自动续费标志，可能的返回值：0-未开通自动续费；1-已开通自动续费；2-已关闭自动续费</p>
     * @param AutoRenew <p>自动续费标志，可能的返回值：0-未开通自动续费；1-已开通自动续费；2-已关闭自动续费</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>数据复制方式。0 - 异步复制；1 - 半同步复制；2 - 强同步复制</p> 
     * @return ProtectMode <p>数据复制方式。0 - 异步复制；1 - 半同步复制；2 - 强同步复制</p>
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set <p>数据复制方式。0 - 异步复制；1 - 半同步复制；2 - 强同步复制</p>
     * @param ProtectMode <p>数据复制方式。0 - 异步复制；1 - 半同步复制；2 - 强同步复制</p>
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * Get <p>只读组详细信息</p> 
     * @return RoGroups <p>只读组详细信息</p>
     */
    public RoGroup [] getRoGroups() {
        return this.RoGroups;
    }

    /**
     * Set <p>只读组详细信息</p>
     * @param RoGroups <p>只读组详细信息</p>
     */
    public void setRoGroups(RoGroup [] RoGroups) {
        this.RoGroups = RoGroups;
    }

    /**
     * Get <p>子网 ID，例如：2333</p> 
     * @return SubnetId <p>子网 ID，例如：2333</p>
     */
    public Long getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID，例如：2333</p>
     * @param SubnetId <p>子网 ID，例如：2333</p>
     */
    public void setSubnetId(Long SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例类型，可能的返回值：1-主实例；2-灾备实例；3-只读实例</p> 
     * @return InstanceType <p>实例类型，可能的返回值：1-主实例；2-灾备实例；3-只读实例</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型，可能的返回值：1-主实例；2-灾备实例；3-只读实例</p>
     * @param InstanceType <p>实例类型，可能的返回值：1-主实例；2-灾备实例；3-只读实例</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>项目 ID</p> 
     * @return ProjectId <p>项目 ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID</p>
     * @param ProjectId <p>项目 ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>地域信息</p> 
     * @return Region <p>地域信息</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域信息</p>
     * @param Region <p>地域信息</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>实例到期时间</p> 
     * @return DeadlineTime <p>实例到期时间</p>
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set <p>实例到期时间</p>
     * @param DeadlineTime <p>实例到期时间</p>
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get <p>可用区部署方式。可能的值为：0 - 单可用区；1 - 多可用区</p> 
     * @return DeployMode <p>可用区部署方式。可能的值为：0 - 单可用区；1 - 多可用区</p>
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set <p>可用区部署方式。可能的值为：0 - 单可用区；1 - 多可用区</p>
     * @param DeployMode <p>可用区部署方式。可能的值为：0 - 单可用区；1 - 多可用区</p>
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get <p>实例任务状态。0 - 没有任务 ,1 - 升级中,2 - 数据导入中,3 - 开放Slave中,4 - 外网访问开通中,5 - 批量操作执行中,6 - 回档中,7 - 外网访问关闭中,8 - 密码修改中,9 - 实例名修改中,10 - 重启中,12 - 自建迁移中,13 - 删除库表中,14 - 灾备实例创建同步中,15 - 升级待切换,16 - 升级切换中,17 - 升级切换完成</p> 
     * @return TaskStatus <p>实例任务状态。0 - 没有任务 ,1 - 升级中,2 - 数据导入中,3 - 开放Slave中,4 - 外网访问开通中,5 - 批量操作执行中,6 - 回档中,7 - 外网访问关闭中,8 - 密码修改中,9 - 实例名修改中,10 - 重启中,12 - 自建迁移中,13 - 删除库表中,14 - 灾备实例创建同步中,15 - 升级待切换,16 - 升级切换中,17 - 升级切换完成</p>
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>实例任务状态。0 - 没有任务 ,1 - 升级中,2 - 数据导入中,3 - 开放Slave中,4 - 外网访问开通中,5 - 批量操作执行中,6 - 回档中,7 - 外网访问关闭中,8 - 密码修改中,9 - 实例名修改中,10 - 重启中,12 - 自建迁移中,13 - 删除库表中,14 - 灾备实例创建同步中,15 - 升级待切换,16 - 升级切换中,17 - 升级切换完成</p>
     * @param TaskStatus <p>实例任务状态。0 - 没有任务 ,1 - 升级中,2 - 数据导入中,3 - 开放Slave中,4 - 外网访问开通中,5 - 批量操作执行中,6 - 回档中,7 - 外网访问关闭中,8 - 密码修改中,9 - 实例名修改中,10 - 重启中,12 - 自建迁移中,13 - 删除库表中,14 - 灾备实例创建同步中,15 - 升级待切换,16 - 升级切换中,17 - 升级切换完成</p>
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>主实例详细信息</p> 
     * @return MasterInfo <p>主实例详细信息</p>
     */
    public MasterInfo getMasterInfo() {
        return this.MasterInfo;
    }

    /**
     * Set <p>主实例详细信息</p>
     * @param MasterInfo <p>主实例详细信息</p>
     */
    public void setMasterInfo(MasterInfo MasterInfo) {
        this.MasterInfo = MasterInfo;
    }

    /**
     * Get <p>实例类型</p> 
     * @return DeviceType <p>实例类型</p>
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set <p>实例类型</p>
     * @param DeviceType <p>实例类型</p>
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get <p>内核版本</p> 
     * @return EngineVersion <p>内核版本</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>内核版本</p>
     * @param EngineVersion <p>内核版本</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
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
     * Get <p>灾备实例详细信息</p> 
     * @return DrInfo <p>灾备实例详细信息</p>
     */
    public DrInfo [] getDrInfo() {
        return this.DrInfo;
    }

    /**
     * Set <p>灾备实例详细信息</p>
     * @param DrInfo <p>灾备实例详细信息</p>
     */
    public void setDrInfo(DrInfo [] DrInfo) {
        this.DrInfo = DrInfo;
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
     * Get <p>外网端口号</p> 
     * @return WanPort <p>外网端口号</p>
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set <p>外网端口号</p>
     * @param WanPort <p>外网端口号</p>
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get <p>付费类型，可能的返回值：0-包年包月；1-按量计费</p> 
     * @return PayType <p>付费类型，可能的返回值：0-包年包月；1-按量计费</p>
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set <p>付费类型，可能的返回值：0-包年包月；1-按量计费</p>
     * @param PayType <p>付费类型，可能的返回值：0-包年包月；1-按量计费</p>
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
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
     * Get <p>实例 IP</p> 
     * @return Vip <p>实例 IP</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>实例 IP</p>
     * @param Vip <p>实例 IP</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>端口号</p> 
     * @return Vport <p>端口号</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>端口号</p>
     * @param Vport <p>端口号</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>磁盘写入是否被锁定（实例数据写入量已经超过磁盘配额）。0 -未被锁定 1 -已被锁定</p> 
     * @return CdbError <p>磁盘写入是否被锁定（实例数据写入量已经超过磁盘配额）。0 -未被锁定 1 -已被锁定</p>
     */
    public Long getCdbError() {
        return this.CdbError;
    }

    /**
     * Set <p>磁盘写入是否被锁定（实例数据写入量已经超过磁盘配额）。0 -未被锁定 1 -已被锁定</p>
     * @param CdbError <p>磁盘写入是否被锁定（实例数据写入量已经超过磁盘配额）。0 -未被锁定 1 -已被锁定</p>
     */
    public void setCdbError(Long CdbError) {
        this.CdbError = CdbError;
    }

    /**
     * Get <p>私有网络描述符，例如：“vpc-5v8wn9mg”</p> 
     * @return UniqVpcId <p>私有网络描述符，例如：“vpc-5v8wn9mg”</p>
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set <p>私有网络描述符，例如：“vpc-5v8wn9mg”</p>
     * @param UniqVpcId <p>私有网络描述符，例如：“vpc-5v8wn9mg”</p>
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get <p>子网描述符，例如：“subnet-1typ0s7d”</p> 
     * @return UniqSubnetId <p>子网描述符，例如：“subnet-1typ0s7d”</p>
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set <p>子网描述符，例如：“subnet-1typ0s7d”</p>
     * @param UniqSubnetId <p>子网描述符，例如：“subnet-1typ0s7d”</p>
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get <p>物理 ID</p> 
     * @return PhysicalId <p>物理 ID</p>
     */
    public String getPhysicalId() {
        return this.PhysicalId;
    }

    /**
     * Set <p>物理 ID</p>
     * @param PhysicalId <p>物理 ID</p>
     */
    public void setPhysicalId(String PhysicalId) {
        this.PhysicalId = PhysicalId;
    }

    /**
     * Get <p>核心数</p> 
     * @return Cpu <p>核心数</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>核心数</p>
     * @param Cpu <p>核心数</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>每秒查询数量</p> 
     * @return Qps <p>每秒查询数量</p>
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set <p>每秒查询数量</p>
     * @param Qps <p>每秒查询数量</p>
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get <p>可用区中文名称</p> 
     * @return ZoneName <p>可用区中文名称</p>
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set <p>可用区中文名称</p>
     * @param ZoneName <p>可用区中文名称</p>
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get <p>物理机型</p> 
     * @return DeviceClass <p>物理机型</p>
     */
    public String getDeviceClass() {
        return this.DeviceClass;
    }

    /**
     * Set <p>物理机型</p>
     * @param DeviceClass <p>物理机型</p>
     */
    public void setDeviceClass(String DeviceClass) {
        this.DeviceClass = DeviceClass;
    }

    /**
     * Get <p>置放群组 ID</p> 
     * @return DeployGroupId <p>置放群组 ID</p>
     */
    public String getDeployGroupId() {
        return this.DeployGroupId;
    }

    /**
     * Set <p>置放群组 ID</p>
     * @param DeployGroupId <p>置放群组 ID</p>
     */
    public void setDeployGroupId(String DeployGroupId) {
        this.DeployGroupId = DeployGroupId;
    }

    /**
     * Get <p>可用区 ID</p> 
     * @return ZoneId <p>可用区 ID</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区 ID</p>
     * @param ZoneId <p>可用区 ID</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>节点数</p> 
     * @return InstanceNodes <p>节点数</p>
     */
    public Long getInstanceNodes() {
        return this.InstanceNodes;
    }

    /**
     * Set <p>节点数</p>
     * @param InstanceNodes <p>节点数</p>
     */
    public void setInstanceNodes(Long InstanceNodes) {
        this.InstanceNodes = InstanceNodes;
    }

    /**
     * Get <p>标签列表</p> 
     * @return TagList <p>标签列表</p>
     */
    public TagInfoItem [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>标签列表</p>
     * @param TagList <p>标签列表</p>
     */
    public void setTagList(TagInfoItem [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>引擎类型</p> 
     * @return EngineType <p>引擎类型</p>
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set <p>引擎类型</p>
     * @param EngineType <p>引擎类型</p>
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get <p>最大延迟阈值</p> 
     * @return MaxDelayTime <p>最大延迟阈值</p>
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set <p>最大延迟阈值</p>
     * @param MaxDelayTime <p>最大延迟阈值</p>
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    /**
     * Get <p>实例磁盘类型，仅云盘版和单节点（云盘）实例才会返回有效值。<br>说明：</p><ol><li>若返回：&quot;DiskType&quot;: &quot;CLOUD_HSSD&quot;，则表示该实例磁盘类型为增强型 SSD 云硬盘。</li><li>若返回：&quot;DiskType&quot;: &quot;CLOUD_SSD&quot;，则表示该实例磁盘类型为 SSD 云硬盘。</li><li>若返回：&quot;DiskType&quot;: &quot;&quot;，且参数 DeviceType 值为 UNIVERSAL 或 EXCLUSIVE，则表示该实例采用的是本地 SSD 盘。</li></ol> 
     * @return DiskType <p>实例磁盘类型，仅云盘版和单节点（云盘）实例才会返回有效值。<br>说明：</p><ol><li>若返回：&quot;DiskType&quot;: &quot;CLOUD_HSSD&quot;，则表示该实例磁盘类型为增强型 SSD 云硬盘。</li><li>若返回：&quot;DiskType&quot;: &quot;CLOUD_SSD&quot;，则表示该实例磁盘类型为 SSD 云硬盘。</li><li>若返回：&quot;DiskType&quot;: &quot;&quot;，且参数 DeviceType 值为 UNIVERSAL 或 EXCLUSIVE，则表示该实例采用的是本地 SSD 盘。</li></ol>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>实例磁盘类型，仅云盘版和单节点（云盘）实例才会返回有效值。<br>说明：</p><ol><li>若返回：&quot;DiskType&quot;: &quot;CLOUD_HSSD&quot;，则表示该实例磁盘类型为增强型 SSD 云硬盘。</li><li>若返回：&quot;DiskType&quot;: &quot;CLOUD_SSD&quot;，则表示该实例磁盘类型为 SSD 云硬盘。</li><li>若返回：&quot;DiskType&quot;: &quot;&quot;，且参数 DeviceType 值为 UNIVERSAL 或 EXCLUSIVE，则表示该实例采用的是本地 SSD 盘。</li></ol>
     * @param DiskType <p>实例磁盘类型，仅云盘版和单节点（云盘）实例才会返回有效值。<br>说明：</p><ol><li>若返回：&quot;DiskType&quot;: &quot;CLOUD_HSSD&quot;，则表示该实例磁盘类型为增强型 SSD 云硬盘。</li><li>若返回：&quot;DiskType&quot;: &quot;CLOUD_SSD&quot;，则表示该实例磁盘类型为 SSD 云硬盘。</li><li>若返回：&quot;DiskType&quot;: &quot;&quot;，且参数 DeviceType 值为 UNIVERSAL 或 EXCLUSIVE，则表示该实例采用的是本地 SSD 盘。</li></ol>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>当前扩容的CPU核心数。</p> 
     * @return ExpandCpu <p>当前扩容的CPU核心数。</p>
     */
    public Long getExpandCpu() {
        return this.ExpandCpu;
    }

    /**
     * Set <p>当前扩容的CPU核心数。</p>
     * @param ExpandCpu <p>当前扩容的CPU核心数。</p>
     */
    public void setExpandCpu(Long ExpandCpu) {
        this.ExpandCpu = ExpandCpu;
    }

    /**
     * Get <p>云盘版实例节点信息</p> 
     * @return ClusterInfo <p>云盘版实例节点信息</p>
     */
    public ClusterInfo [] getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set <p>云盘版实例节点信息</p>
     * @param ClusterInfo <p>云盘版实例节点信息</p>
     */
    public void setClusterInfo(ClusterInfo [] ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get <p>分析引擎节点列表</p> 
     * @return AnalysisNodeInfos <p>分析引擎节点列表</p>
     */
    public AnalysisNodeInfo [] getAnalysisNodeInfos() {
        return this.AnalysisNodeInfos;
    }

    /**
     * Set <p>分析引擎节点列表</p>
     * @param AnalysisNodeInfos <p>分析引擎节点列表</p>
     */
    public void setAnalysisNodeInfos(AnalysisNodeInfo [] AnalysisNodeInfos) {
        this.AnalysisNodeInfos = AnalysisNodeInfos;
    }

    /**
     * Get <p>设备带宽，单位G。当DeviceClass不为空时此参数才有效。例：25-表示当前设备带宽为25G；10-表示当前设备带宽为10G。</p> 
     * @return DeviceBandwidth <p>设备带宽，单位G。当DeviceClass不为空时此参数才有效。例：25-表示当前设备带宽为25G；10-表示当前设备带宽为10G。</p>
     */
    public Long getDeviceBandwidth() {
        return this.DeviceBandwidth;
    }

    /**
     * Set <p>设备带宽，单位G。当DeviceClass不为空时此参数才有效。例：25-表示当前设备带宽为25G；10-表示当前设备带宽为10G。</p>
     * @param DeviceBandwidth <p>设备带宽，单位G。当DeviceClass不为空时此参数才有效。例：25-表示当前设备带宽为25G；10-表示当前设备带宽为10G。</p>
     */
    public void setDeviceBandwidth(Long DeviceBandwidth) {
        this.DeviceBandwidth = DeviceBandwidth;
    }

    /**
     * Get <p>实例销毁保护状态，on表示开启保护，否则为关闭保护</p> 
     * @return DestroyProtect <p>实例销毁保护状态，on表示开启保护，否则为关闭保护</p>
     */
    public String getDestroyProtect() {
        return this.DestroyProtect;
    }

    /**
     * Set <p>实例销毁保护状态，on表示开启保护，否则为关闭保护</p>
     * @param DestroyProtect <p>实例销毁保护状态，on表示开启保护，否则为关闭保护</p>
     */
    public void setDestroyProtect(String DestroyProtect) {
        this.DestroyProtect = DestroyProtect;
    }

    /**
     * Get <p>TDSQL引擎参数</p> 
     * @return CpuModel <p>TDSQL引擎参数</p>
     */
    public String getCpuModel() {
        return this.CpuModel;
    }

    /**
     * Set <p>TDSQL引擎参数</p>
     * @param CpuModel <p>TDSQL引擎参数</p>
     */
    public void setCpuModel(String CpuModel) {
        this.CpuModel = CpuModel;
    }

    /**
     * Get <p>分析引擎实例版本升级信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisUpgradeVersionInfo <p>分析引擎实例版本升级信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpgradeAnalysisInstanceVersionInfo getAnalysisUpgradeVersionInfo() {
        return this.AnalysisUpgradeVersionInfo;
    }

    /**
     * Set <p>分析引擎实例版本升级信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisUpgradeVersionInfo <p>分析引擎实例版本升级信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisUpgradeVersionInfo(UpgradeAnalysisInstanceVersionInfo AnalysisUpgradeVersionInfo) {
        this.AnalysisUpgradeVersionInfo = AnalysisUpgradeVersionInfo;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.WanStatus != null) {
            this.WanStatus = new Long(source.WanStatus);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InitFlag != null) {
            this.InitFlag = new Long(source.InitFlag);
        }
        if (source.RoVipInfo != null) {
            this.RoVipInfo = new RoVipInfo(source.RoVipInfo);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VpcId != null) {
            this.VpcId = new Long(source.VpcId);
        }
        if (source.SlaveInfo != null) {
            this.SlaveInfo = new SlaveInfo(source.SlaveInfo);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
        if (source.RoGroups != null) {
            this.RoGroups = new RoGroup[source.RoGroups.length];
            for (int i = 0; i < source.RoGroups.length; i++) {
                this.RoGroups[i] = new RoGroup(source.RoGroups[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new Long(source.SubnetId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.MasterInfo != null) {
            this.MasterInfo = new MasterInfo(source.MasterInfo);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.DrInfo != null) {
            this.DrInfo = new DrInfo[source.DrInfo.length];
            for (int i = 0; i < source.DrInfo.length; i++) {
                this.DrInfo[i] = new DrInfo(source.DrInfo[i]);
            }
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.CdbError != null) {
            this.CdbError = new Long(source.CdbError);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.PhysicalId != null) {
            this.PhysicalId = new String(source.PhysicalId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.DeviceClass != null) {
            this.DeviceClass = new String(source.DeviceClass);
        }
        if (source.DeployGroupId != null) {
            this.DeployGroupId = new String(source.DeployGroupId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.InstanceNodes != null) {
            this.InstanceNodes = new Long(source.InstanceNodes);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfoItem[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfoItem(source.TagList[i]);
            }
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.MaxDelayTime != null) {
            this.MaxDelayTime = new Long(source.MaxDelayTime);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.ExpandCpu != null) {
            this.ExpandCpu = new Long(source.ExpandCpu);
        }
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new ClusterInfo[source.ClusterInfo.length];
            for (int i = 0; i < source.ClusterInfo.length; i++) {
                this.ClusterInfo[i] = new ClusterInfo(source.ClusterInfo[i]);
            }
        }
        if (source.AnalysisNodeInfos != null) {
            this.AnalysisNodeInfos = new AnalysisNodeInfo[source.AnalysisNodeInfos.length];
            for (int i = 0; i < source.AnalysisNodeInfos.length; i++) {
                this.AnalysisNodeInfos[i] = new AnalysisNodeInfo(source.AnalysisNodeInfos[i]);
            }
        }
        if (source.DeviceBandwidth != null) {
            this.DeviceBandwidth = new Long(source.DeviceBandwidth);
        }
        if (source.DestroyProtect != null) {
            this.DestroyProtect = new String(source.DestroyProtect);
        }
        if (source.CpuModel != null) {
            this.CpuModel = new String(source.CpuModel);
        }
        if (source.AnalysisUpgradeVersionInfo != null) {
            this.AnalysisUpgradeVersionInfo = new UpgradeAnalysisInstanceVersionInfo(source.AnalysisUpgradeVersionInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InitFlag", this.InitFlag);
        this.setParamObj(map, prefix + "RoVipInfo.", this.RoVipInfo);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamObj(map, prefix + "SlaveInfo.", this.SlaveInfo);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);
        this.setParamArrayObj(map, prefix + "RoGroups.", this.RoGroups);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamObj(map, prefix + "MasterInfo.", this.MasterInfo);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "DrInfo.", this.DrInfo);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "CdbError", this.CdbError);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "PhysicalId", this.PhysicalId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "DeviceClass", this.DeviceClass);
        this.setParamSimple(map, prefix + "DeployGroupId", this.DeployGroupId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "InstanceNodes", this.InstanceNodes);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "ExpandCpu", this.ExpandCpu);
        this.setParamArrayObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamArrayObj(map, prefix + "AnalysisNodeInfos.", this.AnalysisNodeInfos);
        this.setParamSimple(map, prefix + "DeviceBandwidth", this.DeviceBandwidth);
        this.setParamSimple(map, prefix + "DestroyProtect", this.DestroyProtect);
        this.setParamSimple(map, prefix + "CpuModel", this.CpuModel);
        this.setParamObj(map, prefix + "AnalysisUpgradeVersionInfo.", this.AnalysisUpgradeVersionInfo);

    }
}

