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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusDetailResponse extends AbstractModel{

    /**
    * 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 木马文件大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 木马文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 最近生成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 病毒名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 容器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 容器id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 主机名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 进程名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 进程路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 进程md5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * 进程id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * 进程参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessArgv")
    @Expose
    private String ProcessArgv;

    /**
    * 进程链
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessChan")
    @Expose
    private String ProcessChan;

    /**
    * 进程组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessAccountGroup")
    @Expose
    private String ProcessAccountGroup;

    /**
    * 进程启动用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessStartAccount")
    @Expose
    private String ProcessStartAccount;

    /**
    * 进程文件权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessFileAuthority")
    @Expose
    private String ProcessFileAuthority;

    /**
    * 来源：0：一键扫描， 1：定时扫描 2：实时监控
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 事件描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HarmDescribe")
    @Expose
    private String HarmDescribe;

    /**
    * 建议方案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * 风险文件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件MD5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 事件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * DEAL_NONE:文件待处理
DEAL_IGNORE:已经忽略
DEAL_ADD_WHITELIST:加白
DEAL_DEL:文件已经删除
DEAL_ISOLATE:已经隔离
DEAL_ISOLATING:隔离中
DEAL_ISOLATE_FAILED:隔离失败
DEAL_RECOVERING:恢复中
DEAL_RECOVER_FAILED: 恢复失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 失败子状态:
FILE_NOT_FOUND:文件不存在
FILE_ABNORMAL:文件异常
FILE_ABNORMAL_DEAL_RECOVER:恢复文件时，文件异常
BACKUP_FILE_NOT_FOUND:备份文件不存在
CONTAINER_NOT_FOUND_DEAL_ISOLATE:隔离时，容器不存在
CONTAINER_NOT_FOUND_DEAL_RECOVER:恢复时，容器不存在
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubStatus")
    @Expose
    private String SubStatus;

    /**
    * 内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 外网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageId 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageId 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageName 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageName 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
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
     * Get 木马文件大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 木马文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 木马文件大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 木马文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 木马文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilePath 木马文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 木马文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilePath 木马文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 最近生成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 最近生成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近生成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 最近生成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 病毒名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirusName 病毒名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirusName 病毒名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 容器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerName 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerName 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 容器id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerId 容器id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerId 容器id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 主机名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 主机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostId 主机id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 主机id
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostId 主机id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 进程名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessName 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessName 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 进程路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessPath 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessPath 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get 进程md5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessMd5 进程md5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * Set 进程md5
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessMd5 进程md5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * Get 进程id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessId 进程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set 进程id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessId 进程id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get 进程参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessArgv 进程参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessArgv() {
        return this.ProcessArgv;
    }

    /**
     * Set 进程参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessArgv 进程参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessArgv(String ProcessArgv) {
        this.ProcessArgv = ProcessArgv;
    }

    /**
     * Get 进程链
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessChan 进程链
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessChan() {
        return this.ProcessChan;
    }

    /**
     * Set 进程链
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessChan 进程链
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessChan(String ProcessChan) {
        this.ProcessChan = ProcessChan;
    }

    /**
     * Get 进程组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessAccountGroup 进程组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessAccountGroup() {
        return this.ProcessAccountGroup;
    }

    /**
     * Set 进程组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessAccountGroup 进程组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessAccountGroup(String ProcessAccountGroup) {
        this.ProcessAccountGroup = ProcessAccountGroup;
    }

    /**
     * Get 进程启动用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessStartAccount 进程启动用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessStartAccount() {
        return this.ProcessStartAccount;
    }

    /**
     * Set 进程启动用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessStartAccount 进程启动用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessStartAccount(String ProcessStartAccount) {
        this.ProcessStartAccount = ProcessStartAccount;
    }

    /**
     * Get 进程文件权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessFileAuthority 进程文件权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessFileAuthority() {
        return this.ProcessFileAuthority;
    }

    /**
     * Set 进程文件权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessFileAuthority 进程文件权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessFileAuthority(String ProcessFileAuthority) {
        this.ProcessFileAuthority = ProcessFileAuthority;
    }

    /**
     * Get 来源：0：一键扫描， 1：定时扫描 2：实时监控
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType 来源：0：一键扫描， 1：定时扫描 2：实时监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 来源：0：一键扫描， 1：定时扫描 2：实时监控
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType 来源：0：一键扫描， 1：定时扫描 2：实时监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 事件描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HarmDescribe 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param HarmDescribe 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHarmDescribe(String HarmDescribe) {
        this.HarmDescribe = HarmDescribe;
    }

    /**
     * Get 建议方案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuggestScheme 建议方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set 建议方案
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuggestScheme 建议方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get 风险文件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 风险文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 风险文件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 风险文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件MD5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMd5 文件MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 文件MD5
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMd5 文件MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 事件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventType 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventType 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get DEAL_NONE:文件待处理
DEAL_IGNORE:已经忽略
DEAL_ADD_WHITELIST:加白
DEAL_DEL:文件已经删除
DEAL_ISOLATE:已经隔离
DEAL_ISOLATING:隔离中
DEAL_ISOLATE_FAILED:隔离失败
DEAL_RECOVERING:恢复中
DEAL_RECOVER_FAILED: 恢复失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status DEAL_NONE:文件待处理
DEAL_IGNORE:已经忽略
DEAL_ADD_WHITELIST:加白
DEAL_DEL:文件已经删除
DEAL_ISOLATE:已经隔离
DEAL_ISOLATING:隔离中
DEAL_ISOLATE_FAILED:隔离失败
DEAL_RECOVERING:恢复中
DEAL_RECOVER_FAILED: 恢复失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DEAL_NONE:文件待处理
DEAL_IGNORE:已经忽略
DEAL_ADD_WHITELIST:加白
DEAL_DEL:文件已经删除
DEAL_ISOLATE:已经隔离
DEAL_ISOLATING:隔离中
DEAL_ISOLATE_FAILED:隔离失败
DEAL_RECOVERING:恢复中
DEAL_RECOVER_FAILED: 恢复失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status DEAL_NONE:文件待处理
DEAL_IGNORE:已经忽略
DEAL_ADD_WHITELIST:加白
DEAL_DEL:文件已经删除
DEAL_ISOLATE:已经隔离
DEAL_ISOLATING:隔离中
DEAL_ISOLATE_FAILED:隔离失败
DEAL_RECOVERING:恢复中
DEAL_RECOVER_FAILED: 恢复失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 失败子状态:
FILE_NOT_FOUND:文件不存在
FILE_ABNORMAL:文件异常
FILE_ABNORMAL_DEAL_RECOVER:恢复文件时，文件异常
BACKUP_FILE_NOT_FOUND:备份文件不存在
CONTAINER_NOT_FOUND_DEAL_ISOLATE:隔离时，容器不存在
CONTAINER_NOT_FOUND_DEAL_RECOVER:恢复时，容器不存在
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubStatus 失败子状态:
FILE_NOT_FOUND:文件不存在
FILE_ABNORMAL:文件异常
FILE_ABNORMAL_DEAL_RECOVER:恢复文件时，文件异常
BACKUP_FILE_NOT_FOUND:备份文件不存在
CONTAINER_NOT_FOUND_DEAL_ISOLATE:隔离时，容器不存在
CONTAINER_NOT_FOUND_DEAL_RECOVER:恢复时，容器不存在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set 失败子状态:
FILE_NOT_FOUND:文件不存在
FILE_ABNORMAL:文件异常
FILE_ABNORMAL_DEAL_RECOVER:恢复文件时，文件异常
BACKUP_FILE_NOT_FOUND:备份文件不存在
CONTAINER_NOT_FOUND_DEAL_ISOLATE:隔离时，容器不存在
CONTAINER_NOT_FOUND_DEAL_RECOVER:恢复时，容器不存在
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubStatus 失败子状态:
FILE_NOT_FOUND:文件不存在
FILE_ABNORMAL:文件异常
FILE_ABNORMAL_DEAL_RECOVER:恢复文件时，文件异常
BACKUP_FILE_NOT_FOUND:备份文件不存在
CONTAINER_NOT_FOUND_DEAL_ISOLATE:隔离时，容器不存在
CONTAINER_NOT_FOUND_DEAL_RECOVER:恢复时，容器不存在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubStatus(String SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get 内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostIP 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostIP 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 外网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIP 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIP 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVirusDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusDetailResponse(DescribeVirusDetailResponse source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.ProcessMd5 != null) {
            this.ProcessMd5 = new String(source.ProcessMd5);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.ProcessArgv != null) {
            this.ProcessArgv = new String(source.ProcessArgv);
        }
        if (source.ProcessChan != null) {
            this.ProcessChan = new String(source.ProcessChan);
        }
        if (source.ProcessAccountGroup != null) {
            this.ProcessAccountGroup = new String(source.ProcessAccountGroup);
        }
        if (source.ProcessStartAccount != null) {
            this.ProcessStartAccount = new String(source.ProcessStartAccount);
        }
        if (source.ProcessFileAuthority != null) {
            this.ProcessFileAuthority = new String(source.ProcessFileAuthority);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.HarmDescribe != null) {
            this.HarmDescribe = new String(source.HarmDescribe);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.Mark != null) {
            this.Mark = new String(source.Mark);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new String(source.SubStatus);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ClientIP != null) {
            this.ClientIP = new String(source.ClientIP);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "ProcessMd5", this.ProcessMd5);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ProcessArgv", this.ProcessArgv);
        this.setParamSimple(map, prefix + "ProcessChan", this.ProcessChan);
        this.setParamSimple(map, prefix + "ProcessAccountGroup", this.ProcessAccountGroup);
        this.setParamSimple(map, prefix + "ProcessStartAccount", this.ProcessStartAccount);
        this.setParamSimple(map, prefix + "ProcessFileAuthority", this.ProcessFileAuthority);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

