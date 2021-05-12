/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例所属地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 健康得分。
    */
    @SerializedName("HealthScore")
    @Expose
    private Long HealthScore;

    /**
    * 所属产品。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 异常事件数量。
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 实例类型：1:MASTER；2:DR，3：RO，4:SDR。
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 核心数。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存，单位MB。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 硬盘存储，单位GB。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 数据库版本。
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * 内网地址。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 内网端口。
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 接入来源。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 分组ID。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组组名。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 实例状态：0：发货中；1：运行正常；4：销毁中；5：隔离中。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 子网统一ID。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * cdb类型。
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * cdb实例初始化标志：0：未初始化；1：已初始化。
    */
    @SerializedName("InitFlag")
    @Expose
    private Long InitFlag;

    /**
    * 任务状态。
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 私有网络统一ID。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 实例巡检/概览的状态。
    */
    @SerializedName("InstanceConf")
    @Expose
    private InstanceConfs InstanceConf;

    /**
    * 资源到期时间。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 是否是DBbrain支持的实例。
    */
    @SerializedName("IsSupported")
    @Expose
    private Boolean IsSupported;

    /**
    * 实例安全审计日志开启状态：ON： 安全审计开启；OFF： 未开启安全审计。
    */
    @SerializedName("SecAuditStatus")
    @Expose
    private String SecAuditStatus;

    /**
    * 实例审计日志开启状态，ALL_AUDIT： 开启全审计；RULE_AUDIT： 开启规则审计；UNBOUND： 未开启审计。
    */
    @SerializedName("AuditPolicyStatus")
    @Expose
    private String AuditPolicyStatus;

    /**
    * 实例审计日志运行状态：normal： 运行中； paused： 欠费暂停。
    */
    @SerializedName("AuditRunningStatus")
    @Expose
    private String AuditRunningStatus;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例所属地域。 
     * @return Region 实例所属地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所属地域。
     * @param Region 实例所属地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 健康得分。 
     * @return HealthScore 健康得分。
     */
    public Long getHealthScore() {
        return this.HealthScore;
    }

    /**
     * Set 健康得分。
     * @param HealthScore 健康得分。
     */
    public void setHealthScore(Long HealthScore) {
        this.HealthScore = HealthScore;
    }

    /**
     * Get 所属产品。 
     * @return Product 所属产品。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 所属产品。
     * @param Product 所属产品。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 异常事件数量。 
     * @return EventCount 异常事件数量。
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set 异常事件数量。
     * @param EventCount 异常事件数量。
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get 实例类型：1:MASTER；2:DR，3：RO，4:SDR。 
     * @return InstanceType 实例类型：1:MASTER；2:DR，3：RO，4:SDR。
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型：1:MASTER；2:DR，3：RO，4:SDR。
     * @param InstanceType 实例类型：1:MASTER；2:DR，3：RO，4:SDR。
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 核心数。 
     * @return Cpu 核心数。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 核心数。
     * @param Cpu 核心数。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存，单位MB。 
     * @return Memory 内存，单位MB。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存，单位MB。
     * @param Memory 内存，单位MB。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 硬盘存储，单位GB。 
     * @return Volume 硬盘存储，单位GB。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 硬盘存储，单位GB。
     * @param Volume 硬盘存储，单位GB。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 数据库版本。 
     * @return EngineVersion 数据库版本。
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 数据库版本。
     * @param EngineVersion 数据库版本。
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 内网地址。 
     * @return Vip 内网地址。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 内网地址。
     * @param Vip 内网地址。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 内网端口。 
     * @return Vport 内网端口。
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 内网端口。
     * @param Vport 内网端口。
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 接入来源。 
     * @return Source 接入来源。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 接入来源。
     * @param Source 接入来源。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 分组ID。 
     * @return GroupId 分组ID。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID。
     * @param GroupId 分组ID。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分组组名。 
     * @return GroupName 分组组名。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组组名。
     * @param GroupName 分组组名。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 实例状态：0：发货中；1：运行正常；4：销毁中；5：隔离中。 
     * @return Status 实例状态：0：发货中；1：运行正常；4：销毁中；5：隔离中。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态：0：发货中；1：运行正常；4：销毁中；5：隔离中。
     * @param Status 实例状态：0：发货中；1：运行正常；4：销毁中；5：隔离中。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 子网统一ID。 
     * @return UniqSubnetId 子网统一ID。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 子网统一ID。
     * @param UniqSubnetId 子网统一ID。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get cdb类型。 
     * @return DeployMode cdb类型。
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set cdb类型。
     * @param DeployMode cdb类型。
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get cdb实例初始化标志：0：未初始化；1：已初始化。 
     * @return InitFlag cdb实例初始化标志：0：未初始化；1：已初始化。
     */
    public Long getInitFlag() {
        return this.InitFlag;
    }

    /**
     * Set cdb实例初始化标志：0：未初始化；1：已初始化。
     * @param InitFlag cdb实例初始化标志：0：未初始化；1：已初始化。
     */
    public void setInitFlag(Long InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * Get 任务状态。 
     * @return TaskStatus 任务状态。
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态。
     * @param TaskStatus 任务状态。
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 私有网络统一ID。 
     * @return UniqVpcId 私有网络统一ID。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络统一ID。
     * @param UniqVpcId 私有网络统一ID。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 实例巡检/概览的状态。 
     * @return InstanceConf 实例巡检/概览的状态。
     */
    public InstanceConfs getInstanceConf() {
        return this.InstanceConf;
    }

    /**
     * Set 实例巡检/概览的状态。
     * @param InstanceConf 实例巡检/概览的状态。
     */
    public void setInstanceConf(InstanceConfs InstanceConf) {
        this.InstanceConf = InstanceConf;
    }

    /**
     * Get 资源到期时间。 
     * @return DeadlineTime 资源到期时间。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * Set 资源到期时间。
     * @param DeadlineTime 资源到期时间。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * Get 是否是DBbrain支持的实例。 
     * @return IsSupported 是否是DBbrain支持的实例。
     */
    public Boolean getIsSupported() {
        return this.IsSupported;
    }

    /**
     * Set 是否是DBbrain支持的实例。
     * @param IsSupported 是否是DBbrain支持的实例。
     */
    public void setIsSupported(Boolean IsSupported) {
        this.IsSupported = IsSupported;
    }

    /**
     * Get 实例安全审计日志开启状态：ON： 安全审计开启；OFF： 未开启安全审计。 
     * @return SecAuditStatus 实例安全审计日志开启状态：ON： 安全审计开启；OFF： 未开启安全审计。
     */
    public String getSecAuditStatus() {
        return this.SecAuditStatus;
    }

    /**
     * Set 实例安全审计日志开启状态：ON： 安全审计开启；OFF： 未开启安全审计。
     * @param SecAuditStatus 实例安全审计日志开启状态：ON： 安全审计开启；OFF： 未开启安全审计。
     */
    public void setSecAuditStatus(String SecAuditStatus) {
        this.SecAuditStatus = SecAuditStatus;
    }

    /**
     * Get 实例审计日志开启状态，ALL_AUDIT： 开启全审计；RULE_AUDIT： 开启规则审计；UNBOUND： 未开启审计。 
     * @return AuditPolicyStatus 实例审计日志开启状态，ALL_AUDIT： 开启全审计；RULE_AUDIT： 开启规则审计；UNBOUND： 未开启审计。
     */
    public String getAuditPolicyStatus() {
        return this.AuditPolicyStatus;
    }

    /**
     * Set 实例审计日志开启状态，ALL_AUDIT： 开启全审计；RULE_AUDIT： 开启规则审计；UNBOUND： 未开启审计。
     * @param AuditPolicyStatus 实例审计日志开启状态，ALL_AUDIT： 开启全审计；RULE_AUDIT： 开启规则审计；UNBOUND： 未开启审计。
     */
    public void setAuditPolicyStatus(String AuditPolicyStatus) {
        this.AuditPolicyStatus = AuditPolicyStatus;
    }

    /**
     * Get 实例审计日志运行状态：normal： 运行中； paused： 欠费暂停。 
     * @return AuditRunningStatus 实例审计日志运行状态：normal： 运行中； paused： 欠费暂停。
     */
    public String getAuditRunningStatus() {
        return this.AuditRunningStatus;
    }

    /**
     * Set 实例审计日志运行状态：normal： 运行中； paused： 欠费暂停。
     * @param AuditRunningStatus 实例审计日志运行状态：normal： 运行中； paused： 欠费暂停。
     */
    public void setAuditRunningStatus(String AuditRunningStatus) {
        this.AuditRunningStatus = AuditRunningStatus;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.HealthScore != null) {
            this.HealthScore = new Long(source.HealthScore);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.InitFlag != null) {
            this.InitFlag = new Long(source.InitFlag);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.InstanceConf != null) {
            this.InstanceConf = new InstanceConfs(source.InstanceConf);
        }
        if (source.DeadlineTime != null) {
            this.DeadlineTime = new String(source.DeadlineTime);
        }
        if (source.IsSupported != null) {
            this.IsSupported = new Boolean(source.IsSupported);
        }
        if (source.SecAuditStatus != null) {
            this.SecAuditStatus = new String(source.SecAuditStatus);
        }
        if (source.AuditPolicyStatus != null) {
            this.AuditPolicyStatus = new String(source.AuditPolicyStatus);
        }
        if (source.AuditRunningStatus != null) {
            this.AuditRunningStatus = new String(source.AuditRunningStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "HealthScore", this.HealthScore);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "InitFlag", this.InitFlag);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamObj(map, prefix + "InstanceConf.", this.InstanceConf);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "IsSupported", this.IsSupported);
        this.setParamSimple(map, prefix + "SecAuditStatus", this.SecAuditStatus);
        this.setParamSimple(map, prefix + "AuditPolicyStatus", this.AuditPolicyStatus);
        this.setParamSimple(map, prefix + "AuditRunningStatus", this.AuditRunningStatus);

    }
}

