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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusDetailResponse extends AbstractModel {

    /**
    * 镜像ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 木马文件大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 木马文件路径
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 最近生成时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 病毒名称
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 容器id
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机id
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * 进程名称
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 进程路径
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 进程md5
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * 进程id
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * 进程参数
    */
    @SerializedName("ProcessArgv")
    @Expose
    private String ProcessArgv;

    /**
    * 进程链
    */
    @SerializedName("ProcessChan")
    @Expose
    private String ProcessChan;

    /**
    * 进程组
    */
    @SerializedName("ProcessAccountGroup")
    @Expose
    private String ProcessAccountGroup;

    /**
    * 进程启动用户
    */
    @SerializedName("ProcessStartAccount")
    @Expose
    private String ProcessStartAccount;

    /**
    * 进程文件权限
    */
    @SerializedName("ProcessFileAuthority")
    @Expose
    private String ProcessFileAuthority;

    /**
    * 来源：0：一键扫描， 1：定时扫描 2：实时监控
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 事件描述
    */
    @SerializedName("HarmDescribe")
    @Expose
    private String HarmDescribe;

    /**
    * 建议方案
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * 备注
    */
    @SerializedName("Mark")
    @Expose
    private String Mark;

    /**
    * 风险文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件MD5
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 事件类型
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 集群名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

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
    */
    @SerializedName("SubStatus")
    @Expose
    private String SubStatus;

    /**
    * 内网ip
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 外网ip
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * 父进程启动用户
    */
    @SerializedName("PProcessStartUser")
    @Expose
    private String PProcessStartUser;

    /**
    * 父进程用户组
    */
    @SerializedName("PProcessUserGroup")
    @Expose
    private String PProcessUserGroup;

    /**
    * 父进程路径
    */
    @SerializedName("PProcessPath")
    @Expose
    private String PProcessPath;

    /**
    * 父进程命令行参数
    */
    @SerializedName("PProcessParam")
    @Expose
    private String PProcessParam;

    /**
    * 祖先进程启动用户
    */
    @SerializedName("AncestorProcessStartUser")
    @Expose
    private String AncestorProcessStartUser;

    /**
    * 祖先进程用户组
    */
    @SerializedName("AncestorProcessUserGroup")
    @Expose
    private String AncestorProcessUserGroup;

    /**
    * 祖先进程路径
    */
    @SerializedName("AncestorProcessPath")
    @Expose
    private String AncestorProcessPath;

    /**
    * 祖先进程命令行参数
    */
    @SerializedName("AncestorProcessParam")
    @Expose
    private String AncestorProcessParam;

    /**
    * 事件最后一次处理的时间
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

    /**
    * 容器隔离状态
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * 容器隔离子状态
    */
    @SerializedName("ContainerNetSubStatus")
    @Expose
    private String ContainerNetSubStatus;

    /**
    * 容器隔离操作来源
    */
    @SerializedName("ContainerIsolateOperationSrc")
    @Expose
    private String ContainerIsolateOperationSrc;

    /**
    * 检测平台
1: 云查杀引擎
2: tav
3: binaryAi
4: 异常行为
5: 威胁情报
    */
    @SerializedName("CheckPlatform")
    @Expose
    private String [] CheckPlatform;

    /**
    * 文件访问时间
    */
    @SerializedName("FileAccessTime")
    @Expose
    private String FileAccessTime;

    /**
    * 文件修改时间
    */
    @SerializedName("FileModifyTime")
    @Expose
    private String FileModifyTime;

    /**
    * 节点子网ID
    */
    @SerializedName("NodeSubNetID")
    @Expose
    private String NodeSubNetID;

    /**
    * 节点子网名称
    */
    @SerializedName("NodeSubNetName")
    @Expose
    private String NodeSubNetName;

    /**
    * 节点子网网段
    */
    @SerializedName("NodeSubNetCIDR")
    @Expose
    private String NodeSubNetCIDR;

    /**
    * 集群id
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * pod ip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * pod状态
    */
    @SerializedName("PodStatus")
    @Expose
    private String PodStatus;

    /**
    * 节点唯一ID
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * 节点类型：NORMAL普通节点、SUPER超级节点
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 工作负载类型
    */
    @SerializedName("WorkloadType")
    @Expose
    private String WorkloadType;

    /**
    * 容器状态
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 镜像ID 
     * @return ImageId 镜像ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID
     * @param ImageId 镜像ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
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
     * Get 木马文件大小 
     * @return Size 木马文件大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 木马文件大小
     * @param Size 木马文件大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 木马文件路径 
     * @return FilePath 木马文件路径
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 木马文件路径
     * @param FilePath 木马文件路径
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 最近生成时间 
     * @return ModifyTime 最近生成时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近生成时间
     * @param ModifyTime 最近生成时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 病毒名称 
     * @return VirusName 病毒名称
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名称
     * @param VirusName 病毒名称
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。 
     * @return RiskLevel 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
     * @param RiskLevel 风险等级 RISK_CRITICAL, RISK_HIGH, RISK_MEDIUM, RISK_LOW, RISK_NOTICE。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 容器名称 
     * @return ContainerName 容器名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称
     * @param ContainerName 容器名称
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 容器id 
     * @return ContainerId 容器id
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器id
     * @param ContainerId 容器id
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 主机名称 
     * @return HostName 主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
     * @param HostName 主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机id 
     * @return HostId 主机id
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set 主机id
     * @param HostId 主机id
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get 进程名称 
     * @return ProcessName 进程名称
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名称
     * @param ProcessName 进程名称
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 进程路径 
     * @return ProcessPath 进程路径
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 进程路径
     * @param ProcessPath 进程路径
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get 进程md5 
     * @return ProcessMd5 进程md5
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * Set 进程md5
     * @param ProcessMd5 进程md5
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * Get 进程id 
     * @return ProcessId 进程id
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set 进程id
     * @param ProcessId 进程id
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get 进程参数 
     * @return ProcessArgv 进程参数
     */
    public String getProcessArgv() {
        return this.ProcessArgv;
    }

    /**
     * Set 进程参数
     * @param ProcessArgv 进程参数
     */
    public void setProcessArgv(String ProcessArgv) {
        this.ProcessArgv = ProcessArgv;
    }

    /**
     * Get 进程链 
     * @return ProcessChan 进程链
     */
    public String getProcessChan() {
        return this.ProcessChan;
    }

    /**
     * Set 进程链
     * @param ProcessChan 进程链
     */
    public void setProcessChan(String ProcessChan) {
        this.ProcessChan = ProcessChan;
    }

    /**
     * Get 进程组 
     * @return ProcessAccountGroup 进程组
     */
    public String getProcessAccountGroup() {
        return this.ProcessAccountGroup;
    }

    /**
     * Set 进程组
     * @param ProcessAccountGroup 进程组
     */
    public void setProcessAccountGroup(String ProcessAccountGroup) {
        this.ProcessAccountGroup = ProcessAccountGroup;
    }

    /**
     * Get 进程启动用户 
     * @return ProcessStartAccount 进程启动用户
     */
    public String getProcessStartAccount() {
        return this.ProcessStartAccount;
    }

    /**
     * Set 进程启动用户
     * @param ProcessStartAccount 进程启动用户
     */
    public void setProcessStartAccount(String ProcessStartAccount) {
        this.ProcessStartAccount = ProcessStartAccount;
    }

    /**
     * Get 进程文件权限 
     * @return ProcessFileAuthority 进程文件权限
     */
    public String getProcessFileAuthority() {
        return this.ProcessFileAuthority;
    }

    /**
     * Set 进程文件权限
     * @param ProcessFileAuthority 进程文件权限
     */
    public void setProcessFileAuthority(String ProcessFileAuthority) {
        this.ProcessFileAuthority = ProcessFileAuthority;
    }

    /**
     * Get 来源：0：一键扫描， 1：定时扫描 2：实时监控 
     * @return SourceType 来源：0：一键扫描， 1：定时扫描 2：实时监控
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 来源：0：一键扫描， 1：定时扫描 2：实时监控
     * @param SourceType 来源：0：一键扫描， 1：定时扫描 2：实时监控
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 事件描述 
     * @return HarmDescribe 事件描述
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set 事件描述
     * @param HarmDescribe 事件描述
     */
    public void setHarmDescribe(String HarmDescribe) {
        this.HarmDescribe = HarmDescribe;
    }

    /**
     * Get 建议方案 
     * @return SuggestScheme 建议方案
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set 建议方案
     * @param SuggestScheme 建议方案
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get 备注 
     * @return Mark 备注
     */
    public String getMark() {
        return this.Mark;
    }

    /**
     * Set 备注
     * @param Mark 备注
     */
    public void setMark(String Mark) {
        this.Mark = Mark;
    }

    /**
     * Get 风险文件名称 
     * @return FileName 风险文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 风险文件名称
     * @param FileName 风险文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件MD5 
     * @return FileMd5 文件MD5
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set 文件MD5
     * @param FileMd5 文件MD5
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 事件类型 
     * @return EventType 事件类型
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型
     * @param EventType 事件类型
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 集群名称 
     * @return PodName 集群名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set 集群名称
     * @param PodName 集群名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
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
     * @return Status DEAL_NONE:文件待处理
DEAL_IGNORE:已经忽略
DEAL_ADD_WHITELIST:加白
DEAL_DEL:文件已经删除
DEAL_ISOLATE:已经隔离
DEAL_ISOLATING:隔离中
DEAL_ISOLATE_FAILED:隔离失败
DEAL_RECOVERING:恢复中
DEAL_RECOVER_FAILED: 恢复失败
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
     * @param Status DEAL_NONE:文件待处理
DEAL_IGNORE:已经忽略
DEAL_ADD_WHITELIST:加白
DEAL_DEL:文件已经删除
DEAL_ISOLATE:已经隔离
DEAL_ISOLATING:隔离中
DEAL_ISOLATE_FAILED:隔离失败
DEAL_RECOVERING:恢复中
DEAL_RECOVER_FAILED: 恢复失败
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
     * @return SubStatus 失败子状态:
FILE_NOT_FOUND:文件不存在
FILE_ABNORMAL:文件异常
FILE_ABNORMAL_DEAL_RECOVER:恢复文件时，文件异常
BACKUP_FILE_NOT_FOUND:备份文件不存在
CONTAINER_NOT_FOUND_DEAL_ISOLATE:隔离时，容器不存在
CONTAINER_NOT_FOUND_DEAL_RECOVER:恢复时，容器不存在
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
     * @param SubStatus 失败子状态:
FILE_NOT_FOUND:文件不存在
FILE_ABNORMAL:文件异常
FILE_ABNORMAL_DEAL_RECOVER:恢复文件时，文件异常
BACKUP_FILE_NOT_FOUND:备份文件不存在
CONTAINER_NOT_FOUND_DEAL_ISOLATE:隔离时，容器不存在
CONTAINER_NOT_FOUND_DEAL_RECOVER:恢复时，容器不存在
     */
    public void setSubStatus(String SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get 内网ip 
     * @return HostIP 内网ip
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 内网ip
     * @param HostIP 内网ip
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 外网ip 
     * @return ClientIP 外网ip
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set 外网ip
     * @param ClientIP 外网ip
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get 父进程启动用户 
     * @return PProcessStartUser 父进程启动用户
     */
    public String getPProcessStartUser() {
        return this.PProcessStartUser;
    }

    /**
     * Set 父进程启动用户
     * @param PProcessStartUser 父进程启动用户
     */
    public void setPProcessStartUser(String PProcessStartUser) {
        this.PProcessStartUser = PProcessStartUser;
    }

    /**
     * Get 父进程用户组 
     * @return PProcessUserGroup 父进程用户组
     */
    public String getPProcessUserGroup() {
        return this.PProcessUserGroup;
    }

    /**
     * Set 父进程用户组
     * @param PProcessUserGroup 父进程用户组
     */
    public void setPProcessUserGroup(String PProcessUserGroup) {
        this.PProcessUserGroup = PProcessUserGroup;
    }

    /**
     * Get 父进程路径 
     * @return PProcessPath 父进程路径
     */
    public String getPProcessPath() {
        return this.PProcessPath;
    }

    /**
     * Set 父进程路径
     * @param PProcessPath 父进程路径
     */
    public void setPProcessPath(String PProcessPath) {
        this.PProcessPath = PProcessPath;
    }

    /**
     * Get 父进程命令行参数 
     * @return PProcessParam 父进程命令行参数
     */
    public String getPProcessParam() {
        return this.PProcessParam;
    }

    /**
     * Set 父进程命令行参数
     * @param PProcessParam 父进程命令行参数
     */
    public void setPProcessParam(String PProcessParam) {
        this.PProcessParam = PProcessParam;
    }

    /**
     * Get 祖先进程启动用户 
     * @return AncestorProcessStartUser 祖先进程启动用户
     */
    public String getAncestorProcessStartUser() {
        return this.AncestorProcessStartUser;
    }

    /**
     * Set 祖先进程启动用户
     * @param AncestorProcessStartUser 祖先进程启动用户
     */
    public void setAncestorProcessStartUser(String AncestorProcessStartUser) {
        this.AncestorProcessStartUser = AncestorProcessStartUser;
    }

    /**
     * Get 祖先进程用户组 
     * @return AncestorProcessUserGroup 祖先进程用户组
     */
    public String getAncestorProcessUserGroup() {
        return this.AncestorProcessUserGroup;
    }

    /**
     * Set 祖先进程用户组
     * @param AncestorProcessUserGroup 祖先进程用户组
     */
    public void setAncestorProcessUserGroup(String AncestorProcessUserGroup) {
        this.AncestorProcessUserGroup = AncestorProcessUserGroup;
    }

    /**
     * Get 祖先进程路径 
     * @return AncestorProcessPath 祖先进程路径
     */
    public String getAncestorProcessPath() {
        return this.AncestorProcessPath;
    }

    /**
     * Set 祖先进程路径
     * @param AncestorProcessPath 祖先进程路径
     */
    public void setAncestorProcessPath(String AncestorProcessPath) {
        this.AncestorProcessPath = AncestorProcessPath;
    }

    /**
     * Get 祖先进程命令行参数 
     * @return AncestorProcessParam 祖先进程命令行参数
     */
    public String getAncestorProcessParam() {
        return this.AncestorProcessParam;
    }

    /**
     * Set 祖先进程命令行参数
     * @param AncestorProcessParam 祖先进程命令行参数
     */
    public void setAncestorProcessParam(String AncestorProcessParam) {
        this.AncestorProcessParam = AncestorProcessParam;
    }

    /**
     * Get 事件最后一次处理的时间 
     * @return OperationTime 事件最后一次处理的时间
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set 事件最后一次处理的时间
     * @param OperationTime 事件最后一次处理的时间
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
    }

    /**
     * Get 容器隔离状态 
     * @return ContainerNetStatus 容器隔离状态
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set 容器隔离状态
     * @param ContainerNetStatus 容器隔离状态
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get 容器隔离子状态 
     * @return ContainerNetSubStatus 容器隔离子状态
     */
    public String getContainerNetSubStatus() {
        return this.ContainerNetSubStatus;
    }

    /**
     * Set 容器隔离子状态
     * @param ContainerNetSubStatus 容器隔离子状态
     */
    public void setContainerNetSubStatus(String ContainerNetSubStatus) {
        this.ContainerNetSubStatus = ContainerNetSubStatus;
    }

    /**
     * Get 容器隔离操作来源 
     * @return ContainerIsolateOperationSrc 容器隔离操作来源
     */
    public String getContainerIsolateOperationSrc() {
        return this.ContainerIsolateOperationSrc;
    }

    /**
     * Set 容器隔离操作来源
     * @param ContainerIsolateOperationSrc 容器隔离操作来源
     */
    public void setContainerIsolateOperationSrc(String ContainerIsolateOperationSrc) {
        this.ContainerIsolateOperationSrc = ContainerIsolateOperationSrc;
    }

    /**
     * Get 检测平台
1: 云查杀引擎
2: tav
3: binaryAi
4: 异常行为
5: 威胁情报 
     * @return CheckPlatform 检测平台
1: 云查杀引擎
2: tav
3: binaryAi
4: 异常行为
5: 威胁情报
     */
    public String [] getCheckPlatform() {
        return this.CheckPlatform;
    }

    /**
     * Set 检测平台
1: 云查杀引擎
2: tav
3: binaryAi
4: 异常行为
5: 威胁情报
     * @param CheckPlatform 检测平台
1: 云查杀引擎
2: tav
3: binaryAi
4: 异常行为
5: 威胁情报
     */
    public void setCheckPlatform(String [] CheckPlatform) {
        this.CheckPlatform = CheckPlatform;
    }

    /**
     * Get 文件访问时间 
     * @return FileAccessTime 文件访问时间
     */
    public String getFileAccessTime() {
        return this.FileAccessTime;
    }

    /**
     * Set 文件访问时间
     * @param FileAccessTime 文件访问时间
     */
    public void setFileAccessTime(String FileAccessTime) {
        this.FileAccessTime = FileAccessTime;
    }

    /**
     * Get 文件修改时间 
     * @return FileModifyTime 文件修改时间
     */
    public String getFileModifyTime() {
        return this.FileModifyTime;
    }

    /**
     * Set 文件修改时间
     * @param FileModifyTime 文件修改时间
     */
    public void setFileModifyTime(String FileModifyTime) {
        this.FileModifyTime = FileModifyTime;
    }

    /**
     * Get 节点子网ID 
     * @return NodeSubNetID 节点子网ID
     */
    public String getNodeSubNetID() {
        return this.NodeSubNetID;
    }

    /**
     * Set 节点子网ID
     * @param NodeSubNetID 节点子网ID
     */
    public void setNodeSubNetID(String NodeSubNetID) {
        this.NodeSubNetID = NodeSubNetID;
    }

    /**
     * Get 节点子网名称 
     * @return NodeSubNetName 节点子网名称
     */
    public String getNodeSubNetName() {
        return this.NodeSubNetName;
    }

    /**
     * Set 节点子网名称
     * @param NodeSubNetName 节点子网名称
     */
    public void setNodeSubNetName(String NodeSubNetName) {
        this.NodeSubNetName = NodeSubNetName;
    }

    /**
     * Get 节点子网网段 
     * @return NodeSubNetCIDR 节点子网网段
     */
    public String getNodeSubNetCIDR() {
        return this.NodeSubNetCIDR;
    }

    /**
     * Set 节点子网网段
     * @param NodeSubNetCIDR 节点子网网段
     */
    public void setNodeSubNetCIDR(String NodeSubNetCIDR) {
        this.NodeSubNetCIDR = NodeSubNetCIDR;
    }

    /**
     * Get 集群id 
     * @return ClusterID 集群id
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群id
     * @param ClusterID 集群id
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get pod ip 
     * @return PodIP pod ip
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set pod ip
     * @param PodIP pod ip
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get pod状态 
     * @return PodStatus pod状态
     */
    public String getPodStatus() {
        return this.PodStatus;
    }

    /**
     * Set pod状态
     * @param PodStatus pod状态
     */
    public void setPodStatus(String PodStatus) {
        this.PodStatus = PodStatus;
    }

    /**
     * Get 节点唯一ID 
     * @return NodeUniqueID 节点唯一ID
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set 节点唯一ID
     * @param NodeUniqueID 节点唯一ID
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get 节点类型：NORMAL普通节点、SUPER超级节点 
     * @return NodeType 节点类型：NORMAL普通节点、SUPER超级节点
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型：NORMAL普通节点、SUPER超级节点
     * @param NodeType 节点类型：NORMAL普通节点、SUPER超级节点
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 节点ID 
     * @return NodeID 节点ID
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set 节点ID
     * @param NodeID 节点ID
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
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
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 工作负载类型 
     * @return WorkloadType 工作负载类型
     */
    public String getWorkloadType() {
        return this.WorkloadType;
    }

    /**
     * Set 工作负载类型
     * @param WorkloadType 工作负载类型
     */
    public void setWorkloadType(String WorkloadType) {
        this.WorkloadType = WorkloadType;
    }

    /**
     * Get 容器状态 
     * @return ContainerStatus 容器状态
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set 容器状态
     * @param ContainerStatus 容器状态
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
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
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
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
        if (source.PProcessStartUser != null) {
            this.PProcessStartUser = new String(source.PProcessStartUser);
        }
        if (source.PProcessUserGroup != null) {
            this.PProcessUserGroup = new String(source.PProcessUserGroup);
        }
        if (source.PProcessPath != null) {
            this.PProcessPath = new String(source.PProcessPath);
        }
        if (source.PProcessParam != null) {
            this.PProcessParam = new String(source.PProcessParam);
        }
        if (source.AncestorProcessStartUser != null) {
            this.AncestorProcessStartUser = new String(source.AncestorProcessStartUser);
        }
        if (source.AncestorProcessUserGroup != null) {
            this.AncestorProcessUserGroup = new String(source.AncestorProcessUserGroup);
        }
        if (source.AncestorProcessPath != null) {
            this.AncestorProcessPath = new String(source.AncestorProcessPath);
        }
        if (source.AncestorProcessParam != null) {
            this.AncestorProcessParam = new String(source.AncestorProcessParam);
        }
        if (source.OperationTime != null) {
            this.OperationTime = new String(source.OperationTime);
        }
        if (source.ContainerNetStatus != null) {
            this.ContainerNetStatus = new String(source.ContainerNetStatus);
        }
        if (source.ContainerNetSubStatus != null) {
            this.ContainerNetSubStatus = new String(source.ContainerNetSubStatus);
        }
        if (source.ContainerIsolateOperationSrc != null) {
            this.ContainerIsolateOperationSrc = new String(source.ContainerIsolateOperationSrc);
        }
        if (source.CheckPlatform != null) {
            this.CheckPlatform = new String[source.CheckPlatform.length];
            for (int i = 0; i < source.CheckPlatform.length; i++) {
                this.CheckPlatform[i] = new String(source.CheckPlatform[i]);
            }
        }
        if (source.FileAccessTime != null) {
            this.FileAccessTime = new String(source.FileAccessTime);
        }
        if (source.FileModifyTime != null) {
            this.FileModifyTime = new String(source.FileModifyTime);
        }
        if (source.NodeSubNetID != null) {
            this.NodeSubNetID = new String(source.NodeSubNetID);
        }
        if (source.NodeSubNetName != null) {
            this.NodeSubNetName = new String(source.NodeSubNetName);
        }
        if (source.NodeSubNetCIDR != null) {
            this.NodeSubNetCIDR = new String(source.NodeSubNetCIDR);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodStatus != null) {
            this.PodStatus = new String(source.PodStatus);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.WorkloadType != null) {
            this.WorkloadType = new String(source.WorkloadType);
        }
        if (source.ContainerStatus != null) {
            this.ContainerStatus = new String(source.ContainerStatus);
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
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "Mark", this.Mark);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "PProcessStartUser", this.PProcessStartUser);
        this.setParamSimple(map, prefix + "PProcessUserGroup", this.PProcessUserGroup);
        this.setParamSimple(map, prefix + "PProcessPath", this.PProcessPath);
        this.setParamSimple(map, prefix + "PProcessParam", this.PProcessParam);
        this.setParamSimple(map, prefix + "AncestorProcessStartUser", this.AncestorProcessStartUser);
        this.setParamSimple(map, prefix + "AncestorProcessUserGroup", this.AncestorProcessUserGroup);
        this.setParamSimple(map, prefix + "AncestorProcessPath", this.AncestorProcessPath);
        this.setParamSimple(map, prefix + "AncestorProcessParam", this.AncestorProcessParam);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamArraySimple(map, prefix + "CheckPlatform.", this.CheckPlatform);
        this.setParamSimple(map, prefix + "FileAccessTime", this.FileAccessTime);
        this.setParamSimple(map, prefix + "FileModifyTime", this.FileModifyTime);
        this.setParamSimple(map, prefix + "NodeSubNetID", this.NodeSubNetID);
        this.setParamSimple(map, prefix + "NodeSubNetName", this.NodeSubNetName);
        this.setParamSimple(map, prefix + "NodeSubNetCIDR", this.NodeSubNetCIDR);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodStatus", this.PodStatus);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "WorkloadType", this.WorkloadType);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

