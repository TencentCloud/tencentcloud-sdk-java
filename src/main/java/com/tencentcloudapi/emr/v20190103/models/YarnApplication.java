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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class YarnApplication extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 应用名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 队列
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * 应用类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 运行时间
    */
    @SerializedName("ElapsedTime")
    @Expose
    private String ElapsedTime;

    /**
    * 状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 最终状态
    */
    @SerializedName("FinalStatus")
    @Expose
    private String FinalStatus;

    /**
    * 进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 开始时间毫秒
    */
    @SerializedName("StartedTime")
    @Expose
    private Long StartedTime;

    /**
    * 结束时间毫秒
    */
    @SerializedName("FinishedTime")
    @Expose
    private Long FinishedTime;

    /**
    * 申请内存MB
    */
    @SerializedName("AllocatedMB")
    @Expose
    private Long AllocatedMB;

    /**
    * 申请VCores
    */
    @SerializedName("AllocatedVCores")
    @Expose
    private Long AllocatedVCores;

    /**
    * 运行的Containers数
    */
    @SerializedName("RunningContainers")
    @Expose
    private Long RunningContainers;

    /**
    * 内存MB*时间秒
    */
    @SerializedName("MemorySeconds")
    @Expose
    private Long MemorySeconds;

    /**
    * VCores*时间秒
    */
    @SerializedName("VCoreSeconds")
    @Expose
    private Long VCoreSeconds;

    /**
    * 队列资源占比
    */
    @SerializedName("QueueUsagePercentage")
    @Expose
    private Float QueueUsagePercentage;

    /**
    * 集群资源占比
    */
    @SerializedName("ClusterUsagePercentage")
    @Expose
    private Float ClusterUsagePercentage;

    /**
    * 预占用的内存
    */
    @SerializedName("PreemptedResourceMB")
    @Expose
    private Long PreemptedResourceMB;

    /**
    * 预占用的VCore
    */
    @SerializedName("PreemptedResourceVCores")
    @Expose
    private Long PreemptedResourceVCores;

    /**
    * 预占的非应用程序主节点容器数量
    */
    @SerializedName("NumNonAMContainerPreempted")
    @Expose
    private Long NumNonAMContainerPreempted;

    /**
    * AM预占用的容器数量
    */
    @SerializedName("NumAMContainerPreempted")
    @Expose
    private Long NumAMContainerPreempted;

    /**
    * Map总数
    */
    @SerializedName("MapsTotal")
    @Expose
    private Long MapsTotal;

    /**
    * 完成的Map数
    */
    @SerializedName("MapsCompleted")
    @Expose
    private Long MapsCompleted;

    /**
    * Reduce总数
    */
    @SerializedName("ReducesTotal")
    @Expose
    private Long ReducesTotal;

    /**
    * 完成的Reduce数
    */
    @SerializedName("ReducesCompleted")
    @Expose
    private Long ReducesCompleted;

    /**
    * 平均Map时间
    */
    @SerializedName("AvgMapTime")
    @Expose
    private Long AvgMapTime;

    /**
    * 平均Reduce时间
    */
    @SerializedName("AvgReduceTime")
    @Expose
    private Long AvgReduceTime;

    /**
    * 平均Shuffle时间毫秒
    */
    @SerializedName("AvgShuffleTime")
    @Expose
    private Long AvgShuffleTime;

    /**
    * 平均Merge时间毫秒
    */
    @SerializedName("AvgMergeTime")
    @Expose
    private Long AvgMergeTime;

    /**
    * 失败的Reduce执行次数
    */
    @SerializedName("FailedReduceAttempts")
    @Expose
    private Long FailedReduceAttempts;

    /**
    * Kill的Reduce执行次数
    */
    @SerializedName("KilledReduceAttempts")
    @Expose
    private Long KilledReduceAttempts;

    /**
    * 成功的Reduce执行次数
    */
    @SerializedName("SuccessfulReduceAttempts")
    @Expose
    private Long SuccessfulReduceAttempts;

    /**
    * 失败的Map执行次数
    */
    @SerializedName("FailedMapAttempts")
    @Expose
    private Long FailedMapAttempts;

    /**
    * Kill的Map执行次数
    */
    @SerializedName("KilledMapAttempts")
    @Expose
    private Long KilledMapAttempts;

    /**
    * 成功的Map执行次数
    */
    @SerializedName("SuccessfulMapAttempts")
    @Expose
    private Long SuccessfulMapAttempts;

    /**
    * GC毫秒
    */
    @SerializedName("GcTimeMillis")
    @Expose
    private Long GcTimeMillis;

    /**
    * Map使用的VCore毫秒
    */
    @SerializedName("VCoreMillisMaps")
    @Expose
    private Long VCoreMillisMaps;

    /**
    * Map使用的内存毫秒
    */
    @SerializedName("MbMillisMaps")
    @Expose
    private Long MbMillisMaps;

    /**
    * Reduce使用的VCore毫秒
    */
    @SerializedName("VCoreMillisReduces")
    @Expose
    private Long VCoreMillisReduces;

    /**
    * Reduce使用的内存毫秒
    */
    @SerializedName("MbMillisReduces")
    @Expose
    private Long MbMillisReduces;

    /**
    * 启动Map的总数
    */
    @SerializedName("TotalLaunchedMaps")
    @Expose
    private Long TotalLaunchedMaps;

    /**
    * 启动Reduce的总数
    */
    @SerializedName("TotalLaunchedReduces")
    @Expose
    private Long TotalLaunchedReduces;

    /**
    * Map输入记录数
    */
    @SerializedName("MapInputRecords")
    @Expose
    private Long MapInputRecords;

    /**
    * Map输出记录数
    */
    @SerializedName("MapOutputRecords")
    @Expose
    private Long MapOutputRecords;

    /**
    * Reduce输入记录数
    */
    @SerializedName("ReduceInputRecords")
    @Expose
    private Long ReduceInputRecords;

    /**
    * Reduce输出记录数
    */
    @SerializedName("ReduceOutputRecords")
    @Expose
    private Long ReduceOutputRecords;

    /**
    * HDFS写入字节数
    */
    @SerializedName("HDFSBytesWritten")
    @Expose
    private Long HDFSBytesWritten;

    /**
    * HDFS读取字节数
    */
    @SerializedName("HDFSBytesRead")
    @Expose
    private Long HDFSBytesRead;

    /**
     * Get 应用ID 
     * @return Id 应用ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 应用ID
     * @param Id 应用ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 用户 
     * @return User 用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户
     * @param User 用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 应用名 
     * @return Name 应用名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名
     * @param Name 应用名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 队列 
     * @return Queue 队列
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set 队列
     * @param Queue 队列
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get 应用类型 
     * @return ApplicationType 应用类型
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型
     * @param ApplicationType 应用类型
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 运行时间 
     * @return ElapsedTime 运行时间
     */
    public String getElapsedTime() {
        return this.ElapsedTime;
    }

    /**
     * Set 运行时间
     * @param ElapsedTime 运行时间
     */
    public void setElapsedTime(String ElapsedTime) {
        this.ElapsedTime = ElapsedTime;
    }

    /**
     * Get 状态 
     * @return State 状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态
     * @param State 状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 最终状态 
     * @return FinalStatus 最终状态
     */
    public String getFinalStatus() {
        return this.FinalStatus;
    }

    /**
     * Set 最终状态
     * @param FinalStatus 最终状态
     */
    public void setFinalStatus(String FinalStatus) {
        this.FinalStatus = FinalStatus;
    }

    /**
     * Get 进度 
     * @return Progress 进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 进度
     * @param Progress 进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 开始时间毫秒 
     * @return StartedTime 开始时间毫秒
     */
    public Long getStartedTime() {
        return this.StartedTime;
    }

    /**
     * Set 开始时间毫秒
     * @param StartedTime 开始时间毫秒
     */
    public void setStartedTime(Long StartedTime) {
        this.StartedTime = StartedTime;
    }

    /**
     * Get 结束时间毫秒 
     * @return FinishedTime 结束时间毫秒
     */
    public Long getFinishedTime() {
        return this.FinishedTime;
    }

    /**
     * Set 结束时间毫秒
     * @param FinishedTime 结束时间毫秒
     */
    public void setFinishedTime(Long FinishedTime) {
        this.FinishedTime = FinishedTime;
    }

    /**
     * Get 申请内存MB 
     * @return AllocatedMB 申请内存MB
     */
    public Long getAllocatedMB() {
        return this.AllocatedMB;
    }

    /**
     * Set 申请内存MB
     * @param AllocatedMB 申请内存MB
     */
    public void setAllocatedMB(Long AllocatedMB) {
        this.AllocatedMB = AllocatedMB;
    }

    /**
     * Get 申请VCores 
     * @return AllocatedVCores 申请VCores
     */
    public Long getAllocatedVCores() {
        return this.AllocatedVCores;
    }

    /**
     * Set 申请VCores
     * @param AllocatedVCores 申请VCores
     */
    public void setAllocatedVCores(Long AllocatedVCores) {
        this.AllocatedVCores = AllocatedVCores;
    }

    /**
     * Get 运行的Containers数 
     * @return RunningContainers 运行的Containers数
     */
    public Long getRunningContainers() {
        return this.RunningContainers;
    }

    /**
     * Set 运行的Containers数
     * @param RunningContainers 运行的Containers数
     */
    public void setRunningContainers(Long RunningContainers) {
        this.RunningContainers = RunningContainers;
    }

    /**
     * Get 内存MB*时间秒 
     * @return MemorySeconds 内存MB*时间秒
     */
    public Long getMemorySeconds() {
        return this.MemorySeconds;
    }

    /**
     * Set 内存MB*时间秒
     * @param MemorySeconds 内存MB*时间秒
     */
    public void setMemorySeconds(Long MemorySeconds) {
        this.MemorySeconds = MemorySeconds;
    }

    /**
     * Get VCores*时间秒 
     * @return VCoreSeconds VCores*时间秒
     */
    public Long getVCoreSeconds() {
        return this.VCoreSeconds;
    }

    /**
     * Set VCores*时间秒
     * @param VCoreSeconds VCores*时间秒
     */
    public void setVCoreSeconds(Long VCoreSeconds) {
        this.VCoreSeconds = VCoreSeconds;
    }

    /**
     * Get 队列资源占比 
     * @return QueueUsagePercentage 队列资源占比
     */
    public Float getQueueUsagePercentage() {
        return this.QueueUsagePercentage;
    }

    /**
     * Set 队列资源占比
     * @param QueueUsagePercentage 队列资源占比
     */
    public void setQueueUsagePercentage(Float QueueUsagePercentage) {
        this.QueueUsagePercentage = QueueUsagePercentage;
    }

    /**
     * Get 集群资源占比 
     * @return ClusterUsagePercentage 集群资源占比
     */
    public Float getClusterUsagePercentage() {
        return this.ClusterUsagePercentage;
    }

    /**
     * Set 集群资源占比
     * @param ClusterUsagePercentage 集群资源占比
     */
    public void setClusterUsagePercentage(Float ClusterUsagePercentage) {
        this.ClusterUsagePercentage = ClusterUsagePercentage;
    }

    /**
     * Get 预占用的内存 
     * @return PreemptedResourceMB 预占用的内存
     */
    public Long getPreemptedResourceMB() {
        return this.PreemptedResourceMB;
    }

    /**
     * Set 预占用的内存
     * @param PreemptedResourceMB 预占用的内存
     */
    public void setPreemptedResourceMB(Long PreemptedResourceMB) {
        this.PreemptedResourceMB = PreemptedResourceMB;
    }

    /**
     * Get 预占用的VCore 
     * @return PreemptedResourceVCores 预占用的VCore
     */
    public Long getPreemptedResourceVCores() {
        return this.PreemptedResourceVCores;
    }

    /**
     * Set 预占用的VCore
     * @param PreemptedResourceVCores 预占用的VCore
     */
    public void setPreemptedResourceVCores(Long PreemptedResourceVCores) {
        this.PreemptedResourceVCores = PreemptedResourceVCores;
    }

    /**
     * Get 预占的非应用程序主节点容器数量 
     * @return NumNonAMContainerPreempted 预占的非应用程序主节点容器数量
     */
    public Long getNumNonAMContainerPreempted() {
        return this.NumNonAMContainerPreempted;
    }

    /**
     * Set 预占的非应用程序主节点容器数量
     * @param NumNonAMContainerPreempted 预占的非应用程序主节点容器数量
     */
    public void setNumNonAMContainerPreempted(Long NumNonAMContainerPreempted) {
        this.NumNonAMContainerPreempted = NumNonAMContainerPreempted;
    }

    /**
     * Get AM预占用的容器数量 
     * @return NumAMContainerPreempted AM预占用的容器数量
     */
    public Long getNumAMContainerPreempted() {
        return this.NumAMContainerPreempted;
    }

    /**
     * Set AM预占用的容器数量
     * @param NumAMContainerPreempted AM预占用的容器数量
     */
    public void setNumAMContainerPreempted(Long NumAMContainerPreempted) {
        this.NumAMContainerPreempted = NumAMContainerPreempted;
    }

    /**
     * Get Map总数 
     * @return MapsTotal Map总数
     */
    public Long getMapsTotal() {
        return this.MapsTotal;
    }

    /**
     * Set Map总数
     * @param MapsTotal Map总数
     */
    public void setMapsTotal(Long MapsTotal) {
        this.MapsTotal = MapsTotal;
    }

    /**
     * Get 完成的Map数 
     * @return MapsCompleted 完成的Map数
     */
    public Long getMapsCompleted() {
        return this.MapsCompleted;
    }

    /**
     * Set 完成的Map数
     * @param MapsCompleted 完成的Map数
     */
    public void setMapsCompleted(Long MapsCompleted) {
        this.MapsCompleted = MapsCompleted;
    }

    /**
     * Get Reduce总数 
     * @return ReducesTotal Reduce总数
     */
    public Long getReducesTotal() {
        return this.ReducesTotal;
    }

    /**
     * Set Reduce总数
     * @param ReducesTotal Reduce总数
     */
    public void setReducesTotal(Long ReducesTotal) {
        this.ReducesTotal = ReducesTotal;
    }

    /**
     * Get 完成的Reduce数 
     * @return ReducesCompleted 完成的Reduce数
     */
    public Long getReducesCompleted() {
        return this.ReducesCompleted;
    }

    /**
     * Set 完成的Reduce数
     * @param ReducesCompleted 完成的Reduce数
     */
    public void setReducesCompleted(Long ReducesCompleted) {
        this.ReducesCompleted = ReducesCompleted;
    }

    /**
     * Get 平均Map时间 
     * @return AvgMapTime 平均Map时间
     */
    public Long getAvgMapTime() {
        return this.AvgMapTime;
    }

    /**
     * Set 平均Map时间
     * @param AvgMapTime 平均Map时间
     */
    public void setAvgMapTime(Long AvgMapTime) {
        this.AvgMapTime = AvgMapTime;
    }

    /**
     * Get 平均Reduce时间 
     * @return AvgReduceTime 平均Reduce时间
     */
    public Long getAvgReduceTime() {
        return this.AvgReduceTime;
    }

    /**
     * Set 平均Reduce时间
     * @param AvgReduceTime 平均Reduce时间
     */
    public void setAvgReduceTime(Long AvgReduceTime) {
        this.AvgReduceTime = AvgReduceTime;
    }

    /**
     * Get 平均Shuffle时间毫秒 
     * @return AvgShuffleTime 平均Shuffle时间毫秒
     */
    public Long getAvgShuffleTime() {
        return this.AvgShuffleTime;
    }

    /**
     * Set 平均Shuffle时间毫秒
     * @param AvgShuffleTime 平均Shuffle时间毫秒
     */
    public void setAvgShuffleTime(Long AvgShuffleTime) {
        this.AvgShuffleTime = AvgShuffleTime;
    }

    /**
     * Get 平均Merge时间毫秒 
     * @return AvgMergeTime 平均Merge时间毫秒
     */
    public Long getAvgMergeTime() {
        return this.AvgMergeTime;
    }

    /**
     * Set 平均Merge时间毫秒
     * @param AvgMergeTime 平均Merge时间毫秒
     */
    public void setAvgMergeTime(Long AvgMergeTime) {
        this.AvgMergeTime = AvgMergeTime;
    }

    /**
     * Get 失败的Reduce执行次数 
     * @return FailedReduceAttempts 失败的Reduce执行次数
     */
    public Long getFailedReduceAttempts() {
        return this.FailedReduceAttempts;
    }

    /**
     * Set 失败的Reduce执行次数
     * @param FailedReduceAttempts 失败的Reduce执行次数
     */
    public void setFailedReduceAttempts(Long FailedReduceAttempts) {
        this.FailedReduceAttempts = FailedReduceAttempts;
    }

    /**
     * Get Kill的Reduce执行次数 
     * @return KilledReduceAttempts Kill的Reduce执行次数
     */
    public Long getKilledReduceAttempts() {
        return this.KilledReduceAttempts;
    }

    /**
     * Set Kill的Reduce执行次数
     * @param KilledReduceAttempts Kill的Reduce执行次数
     */
    public void setKilledReduceAttempts(Long KilledReduceAttempts) {
        this.KilledReduceAttempts = KilledReduceAttempts;
    }

    /**
     * Get 成功的Reduce执行次数 
     * @return SuccessfulReduceAttempts 成功的Reduce执行次数
     */
    public Long getSuccessfulReduceAttempts() {
        return this.SuccessfulReduceAttempts;
    }

    /**
     * Set 成功的Reduce执行次数
     * @param SuccessfulReduceAttempts 成功的Reduce执行次数
     */
    public void setSuccessfulReduceAttempts(Long SuccessfulReduceAttempts) {
        this.SuccessfulReduceAttempts = SuccessfulReduceAttempts;
    }

    /**
     * Get 失败的Map执行次数 
     * @return FailedMapAttempts 失败的Map执行次数
     */
    public Long getFailedMapAttempts() {
        return this.FailedMapAttempts;
    }

    /**
     * Set 失败的Map执行次数
     * @param FailedMapAttempts 失败的Map执行次数
     */
    public void setFailedMapAttempts(Long FailedMapAttempts) {
        this.FailedMapAttempts = FailedMapAttempts;
    }

    /**
     * Get Kill的Map执行次数 
     * @return KilledMapAttempts Kill的Map执行次数
     */
    public Long getKilledMapAttempts() {
        return this.KilledMapAttempts;
    }

    /**
     * Set Kill的Map执行次数
     * @param KilledMapAttempts Kill的Map执行次数
     */
    public void setKilledMapAttempts(Long KilledMapAttempts) {
        this.KilledMapAttempts = KilledMapAttempts;
    }

    /**
     * Get 成功的Map执行次数 
     * @return SuccessfulMapAttempts 成功的Map执行次数
     */
    public Long getSuccessfulMapAttempts() {
        return this.SuccessfulMapAttempts;
    }

    /**
     * Set 成功的Map执行次数
     * @param SuccessfulMapAttempts 成功的Map执行次数
     */
    public void setSuccessfulMapAttempts(Long SuccessfulMapAttempts) {
        this.SuccessfulMapAttempts = SuccessfulMapAttempts;
    }

    /**
     * Get GC毫秒 
     * @return GcTimeMillis GC毫秒
     */
    public Long getGcTimeMillis() {
        return this.GcTimeMillis;
    }

    /**
     * Set GC毫秒
     * @param GcTimeMillis GC毫秒
     */
    public void setGcTimeMillis(Long GcTimeMillis) {
        this.GcTimeMillis = GcTimeMillis;
    }

    /**
     * Get Map使用的VCore毫秒 
     * @return VCoreMillisMaps Map使用的VCore毫秒
     */
    public Long getVCoreMillisMaps() {
        return this.VCoreMillisMaps;
    }

    /**
     * Set Map使用的VCore毫秒
     * @param VCoreMillisMaps Map使用的VCore毫秒
     */
    public void setVCoreMillisMaps(Long VCoreMillisMaps) {
        this.VCoreMillisMaps = VCoreMillisMaps;
    }

    /**
     * Get Map使用的内存毫秒 
     * @return MbMillisMaps Map使用的内存毫秒
     */
    public Long getMbMillisMaps() {
        return this.MbMillisMaps;
    }

    /**
     * Set Map使用的内存毫秒
     * @param MbMillisMaps Map使用的内存毫秒
     */
    public void setMbMillisMaps(Long MbMillisMaps) {
        this.MbMillisMaps = MbMillisMaps;
    }

    /**
     * Get Reduce使用的VCore毫秒 
     * @return VCoreMillisReduces Reduce使用的VCore毫秒
     */
    public Long getVCoreMillisReduces() {
        return this.VCoreMillisReduces;
    }

    /**
     * Set Reduce使用的VCore毫秒
     * @param VCoreMillisReduces Reduce使用的VCore毫秒
     */
    public void setVCoreMillisReduces(Long VCoreMillisReduces) {
        this.VCoreMillisReduces = VCoreMillisReduces;
    }

    /**
     * Get Reduce使用的内存毫秒 
     * @return MbMillisReduces Reduce使用的内存毫秒
     */
    public Long getMbMillisReduces() {
        return this.MbMillisReduces;
    }

    /**
     * Set Reduce使用的内存毫秒
     * @param MbMillisReduces Reduce使用的内存毫秒
     */
    public void setMbMillisReduces(Long MbMillisReduces) {
        this.MbMillisReduces = MbMillisReduces;
    }

    /**
     * Get 启动Map的总数 
     * @return TotalLaunchedMaps 启动Map的总数
     */
    public Long getTotalLaunchedMaps() {
        return this.TotalLaunchedMaps;
    }

    /**
     * Set 启动Map的总数
     * @param TotalLaunchedMaps 启动Map的总数
     */
    public void setTotalLaunchedMaps(Long TotalLaunchedMaps) {
        this.TotalLaunchedMaps = TotalLaunchedMaps;
    }

    /**
     * Get 启动Reduce的总数 
     * @return TotalLaunchedReduces 启动Reduce的总数
     */
    public Long getTotalLaunchedReduces() {
        return this.TotalLaunchedReduces;
    }

    /**
     * Set 启动Reduce的总数
     * @param TotalLaunchedReduces 启动Reduce的总数
     */
    public void setTotalLaunchedReduces(Long TotalLaunchedReduces) {
        this.TotalLaunchedReduces = TotalLaunchedReduces;
    }

    /**
     * Get Map输入记录数 
     * @return MapInputRecords Map输入记录数
     */
    public Long getMapInputRecords() {
        return this.MapInputRecords;
    }

    /**
     * Set Map输入记录数
     * @param MapInputRecords Map输入记录数
     */
    public void setMapInputRecords(Long MapInputRecords) {
        this.MapInputRecords = MapInputRecords;
    }

    /**
     * Get Map输出记录数 
     * @return MapOutputRecords Map输出记录数
     */
    public Long getMapOutputRecords() {
        return this.MapOutputRecords;
    }

    /**
     * Set Map输出记录数
     * @param MapOutputRecords Map输出记录数
     */
    public void setMapOutputRecords(Long MapOutputRecords) {
        this.MapOutputRecords = MapOutputRecords;
    }

    /**
     * Get Reduce输入记录数 
     * @return ReduceInputRecords Reduce输入记录数
     */
    public Long getReduceInputRecords() {
        return this.ReduceInputRecords;
    }

    /**
     * Set Reduce输入记录数
     * @param ReduceInputRecords Reduce输入记录数
     */
    public void setReduceInputRecords(Long ReduceInputRecords) {
        this.ReduceInputRecords = ReduceInputRecords;
    }

    /**
     * Get Reduce输出记录数 
     * @return ReduceOutputRecords Reduce输出记录数
     */
    public Long getReduceOutputRecords() {
        return this.ReduceOutputRecords;
    }

    /**
     * Set Reduce输出记录数
     * @param ReduceOutputRecords Reduce输出记录数
     */
    public void setReduceOutputRecords(Long ReduceOutputRecords) {
        this.ReduceOutputRecords = ReduceOutputRecords;
    }

    /**
     * Get HDFS写入字节数 
     * @return HDFSBytesWritten HDFS写入字节数
     */
    public Long getHDFSBytesWritten() {
        return this.HDFSBytesWritten;
    }

    /**
     * Set HDFS写入字节数
     * @param HDFSBytesWritten HDFS写入字节数
     */
    public void setHDFSBytesWritten(Long HDFSBytesWritten) {
        this.HDFSBytesWritten = HDFSBytesWritten;
    }

    /**
     * Get HDFS读取字节数 
     * @return HDFSBytesRead HDFS读取字节数
     */
    public Long getHDFSBytesRead() {
        return this.HDFSBytesRead;
    }

    /**
     * Set HDFS读取字节数
     * @param HDFSBytesRead HDFS读取字节数
     */
    public void setHDFSBytesRead(Long HDFSBytesRead) {
        this.HDFSBytesRead = HDFSBytesRead;
    }

    public YarnApplication() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public YarnApplication(YarnApplication source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.ElapsedTime != null) {
            this.ElapsedTime = new String(source.ElapsedTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.FinalStatus != null) {
            this.FinalStatus = new String(source.FinalStatus);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.StartedTime != null) {
            this.StartedTime = new Long(source.StartedTime);
        }
        if (source.FinishedTime != null) {
            this.FinishedTime = new Long(source.FinishedTime);
        }
        if (source.AllocatedMB != null) {
            this.AllocatedMB = new Long(source.AllocatedMB);
        }
        if (source.AllocatedVCores != null) {
            this.AllocatedVCores = new Long(source.AllocatedVCores);
        }
        if (source.RunningContainers != null) {
            this.RunningContainers = new Long(source.RunningContainers);
        }
        if (source.MemorySeconds != null) {
            this.MemorySeconds = new Long(source.MemorySeconds);
        }
        if (source.VCoreSeconds != null) {
            this.VCoreSeconds = new Long(source.VCoreSeconds);
        }
        if (source.QueueUsagePercentage != null) {
            this.QueueUsagePercentage = new Float(source.QueueUsagePercentage);
        }
        if (source.ClusterUsagePercentage != null) {
            this.ClusterUsagePercentage = new Float(source.ClusterUsagePercentage);
        }
        if (source.PreemptedResourceMB != null) {
            this.PreemptedResourceMB = new Long(source.PreemptedResourceMB);
        }
        if (source.PreemptedResourceVCores != null) {
            this.PreemptedResourceVCores = new Long(source.PreemptedResourceVCores);
        }
        if (source.NumNonAMContainerPreempted != null) {
            this.NumNonAMContainerPreempted = new Long(source.NumNonAMContainerPreempted);
        }
        if (source.NumAMContainerPreempted != null) {
            this.NumAMContainerPreempted = new Long(source.NumAMContainerPreempted);
        }
        if (source.MapsTotal != null) {
            this.MapsTotal = new Long(source.MapsTotal);
        }
        if (source.MapsCompleted != null) {
            this.MapsCompleted = new Long(source.MapsCompleted);
        }
        if (source.ReducesTotal != null) {
            this.ReducesTotal = new Long(source.ReducesTotal);
        }
        if (source.ReducesCompleted != null) {
            this.ReducesCompleted = new Long(source.ReducesCompleted);
        }
        if (source.AvgMapTime != null) {
            this.AvgMapTime = new Long(source.AvgMapTime);
        }
        if (source.AvgReduceTime != null) {
            this.AvgReduceTime = new Long(source.AvgReduceTime);
        }
        if (source.AvgShuffleTime != null) {
            this.AvgShuffleTime = new Long(source.AvgShuffleTime);
        }
        if (source.AvgMergeTime != null) {
            this.AvgMergeTime = new Long(source.AvgMergeTime);
        }
        if (source.FailedReduceAttempts != null) {
            this.FailedReduceAttempts = new Long(source.FailedReduceAttempts);
        }
        if (source.KilledReduceAttempts != null) {
            this.KilledReduceAttempts = new Long(source.KilledReduceAttempts);
        }
        if (source.SuccessfulReduceAttempts != null) {
            this.SuccessfulReduceAttempts = new Long(source.SuccessfulReduceAttempts);
        }
        if (source.FailedMapAttempts != null) {
            this.FailedMapAttempts = new Long(source.FailedMapAttempts);
        }
        if (source.KilledMapAttempts != null) {
            this.KilledMapAttempts = new Long(source.KilledMapAttempts);
        }
        if (source.SuccessfulMapAttempts != null) {
            this.SuccessfulMapAttempts = new Long(source.SuccessfulMapAttempts);
        }
        if (source.GcTimeMillis != null) {
            this.GcTimeMillis = new Long(source.GcTimeMillis);
        }
        if (source.VCoreMillisMaps != null) {
            this.VCoreMillisMaps = new Long(source.VCoreMillisMaps);
        }
        if (source.MbMillisMaps != null) {
            this.MbMillisMaps = new Long(source.MbMillisMaps);
        }
        if (source.VCoreMillisReduces != null) {
            this.VCoreMillisReduces = new Long(source.VCoreMillisReduces);
        }
        if (source.MbMillisReduces != null) {
            this.MbMillisReduces = new Long(source.MbMillisReduces);
        }
        if (source.TotalLaunchedMaps != null) {
            this.TotalLaunchedMaps = new Long(source.TotalLaunchedMaps);
        }
        if (source.TotalLaunchedReduces != null) {
            this.TotalLaunchedReduces = new Long(source.TotalLaunchedReduces);
        }
        if (source.MapInputRecords != null) {
            this.MapInputRecords = new Long(source.MapInputRecords);
        }
        if (source.MapOutputRecords != null) {
            this.MapOutputRecords = new Long(source.MapOutputRecords);
        }
        if (source.ReduceInputRecords != null) {
            this.ReduceInputRecords = new Long(source.ReduceInputRecords);
        }
        if (source.ReduceOutputRecords != null) {
            this.ReduceOutputRecords = new Long(source.ReduceOutputRecords);
        }
        if (source.HDFSBytesWritten != null) {
            this.HDFSBytesWritten = new Long(source.HDFSBytesWritten);
        }
        if (source.HDFSBytesRead != null) {
            this.HDFSBytesRead = new Long(source.HDFSBytesRead);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ElapsedTime", this.ElapsedTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "FinalStatus", this.FinalStatus);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "StartedTime", this.StartedTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);
        this.setParamSimple(map, prefix + "AllocatedMB", this.AllocatedMB);
        this.setParamSimple(map, prefix + "AllocatedVCores", this.AllocatedVCores);
        this.setParamSimple(map, prefix + "RunningContainers", this.RunningContainers);
        this.setParamSimple(map, prefix + "MemorySeconds", this.MemorySeconds);
        this.setParamSimple(map, prefix + "VCoreSeconds", this.VCoreSeconds);
        this.setParamSimple(map, prefix + "QueueUsagePercentage", this.QueueUsagePercentage);
        this.setParamSimple(map, prefix + "ClusterUsagePercentage", this.ClusterUsagePercentage);
        this.setParamSimple(map, prefix + "PreemptedResourceMB", this.PreemptedResourceMB);
        this.setParamSimple(map, prefix + "PreemptedResourceVCores", this.PreemptedResourceVCores);
        this.setParamSimple(map, prefix + "NumNonAMContainerPreempted", this.NumNonAMContainerPreempted);
        this.setParamSimple(map, prefix + "NumAMContainerPreempted", this.NumAMContainerPreempted);
        this.setParamSimple(map, prefix + "MapsTotal", this.MapsTotal);
        this.setParamSimple(map, prefix + "MapsCompleted", this.MapsCompleted);
        this.setParamSimple(map, prefix + "ReducesTotal", this.ReducesTotal);
        this.setParamSimple(map, prefix + "ReducesCompleted", this.ReducesCompleted);
        this.setParamSimple(map, prefix + "AvgMapTime", this.AvgMapTime);
        this.setParamSimple(map, prefix + "AvgReduceTime", this.AvgReduceTime);
        this.setParamSimple(map, prefix + "AvgShuffleTime", this.AvgShuffleTime);
        this.setParamSimple(map, prefix + "AvgMergeTime", this.AvgMergeTime);
        this.setParamSimple(map, prefix + "FailedReduceAttempts", this.FailedReduceAttempts);
        this.setParamSimple(map, prefix + "KilledReduceAttempts", this.KilledReduceAttempts);
        this.setParamSimple(map, prefix + "SuccessfulReduceAttempts", this.SuccessfulReduceAttempts);
        this.setParamSimple(map, prefix + "FailedMapAttempts", this.FailedMapAttempts);
        this.setParamSimple(map, prefix + "KilledMapAttempts", this.KilledMapAttempts);
        this.setParamSimple(map, prefix + "SuccessfulMapAttempts", this.SuccessfulMapAttempts);
        this.setParamSimple(map, prefix + "GcTimeMillis", this.GcTimeMillis);
        this.setParamSimple(map, prefix + "VCoreMillisMaps", this.VCoreMillisMaps);
        this.setParamSimple(map, prefix + "MbMillisMaps", this.MbMillisMaps);
        this.setParamSimple(map, prefix + "VCoreMillisReduces", this.VCoreMillisReduces);
        this.setParamSimple(map, prefix + "MbMillisReduces", this.MbMillisReduces);
        this.setParamSimple(map, prefix + "TotalLaunchedMaps", this.TotalLaunchedMaps);
        this.setParamSimple(map, prefix + "TotalLaunchedReduces", this.TotalLaunchedReduces);
        this.setParamSimple(map, prefix + "MapInputRecords", this.MapInputRecords);
        this.setParamSimple(map, prefix + "MapOutputRecords", this.MapOutputRecords);
        this.setParamSimple(map, prefix + "ReduceInputRecords", this.ReduceInputRecords);
        this.setParamSimple(map, prefix + "ReduceOutputRecords", this.ReduceOutputRecords);
        this.setParamSimple(map, prefix + "HDFSBytesWritten", this.HDFSBytesWritten);
        this.setParamSimple(map, prefix + "HDFSBytesRead", this.HDFSBytesRead);

    }
}

