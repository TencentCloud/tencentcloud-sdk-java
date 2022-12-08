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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Job extends AbstractModel{

    /**
    * 任务的JobID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 任务的场景ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScenarioId")
    @Expose
    private String ScenarioId;

    /**
    * 任务的施压配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Load")
    @Expose
    private Load Load;

    /**
    * 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Configs")
    @Expose
    private String [] Configs;

    /**
    * 任务的数据集文件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Datasets")
    @Expose
    private TestData [] Datasets;

    /**
    * 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extensions")
    @Expose
    private String [] Extensions;

    /**
    * 任务的运行状态, JobUnknown: 0,JobCreated:1,JobPending:2, JobPreparing:3,JobSelectClustering:4,JobCreateTasking:5,JobSyncTasking:6
JobRunning:11,JobFinished:12,JobPrepareException:13,JobFinishException:14,JobAborting:15,JobAborted:16,JobAbortException:17,JobDeleted:18,
JobSelectClusterException:19,JobCreateTaskException:20,JobSyncTaskException:21
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务的开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务的结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务的最大VU数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxVirtualUserCount")
    @Expose
    private Long MaxVirtualUserCount;

    /**
    * 任务的备注信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 错误率百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorRate")
    @Expose
    private Float ErrorRate;

    /**
    * 任务发起人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobOwner")
    @Expose
    private String JobOwner;

    /**
    * 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadSources")
    @Expose
    private LoadSource LoadSources;

    /**
    * 任务时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 最大每秒请求数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxRequestsPerSecond")
    @Expose
    private Long MaxRequestsPerSecond;

    /**
    * 总请求数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestTotal")
    @Expose
    private Float RequestTotal;

    /**
    * 平均每秒请求数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestsPerSecond")
    @Expose
    private Float RequestsPerSecond;

    /**
    * 平均响应时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseTimeAverage")
    @Expose
    private Float ResponseTimeAverage;

    /**
    * 响应时间第99百分位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseTimeP99")
    @Expose
    private Float ResponseTimeP99;

    /**
    * 响应时间第95百分位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseTimeP95")
    @Expose
    private Float ResponseTimeP95;

    /**
    * 响应时间第90百分位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseTimeP90")
    @Expose
    private Float ResponseTimeP90;

    /**
    * 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scripts")
    @Expose
    private String [] Scripts;

    /**
    * 最大响应时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseTimeMax")
    @Expose
    private Float ResponseTimeMax;

    /**
    * 最小响应时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseTimeMin")
    @Expose
    private Float ResponseTimeMin;

    /**
    * 发压host信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadSourceInfos")
    @Expose
    private LoadSource [] LoadSourceInfos;

    /**
    * 测试脚本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TestScripts")
    @Expose
    private ScriptInfo [] TestScripts;

    /**
    * 协议脚本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocols")
    @Expose
    private ProtocolInfo [] Protocols;

    /**
    * 请求文件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestFiles")
    @Expose
    private FileInfo [] RequestFiles;

    /**
    * 拓展包文件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Plugins")
    @Expose
    private FileInfo [] Plugins;

    /**
    * 定时任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronId")
    @Expose
    private String CronId;

    /**
    * 场景类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 域名绑定配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainNameConfig")
    @Expose
    private DomainNameConfig DomainNameConfig;

    /**
    * false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Debug")
    @Expose
    private Boolean Debug;

    /**
    * 中断原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AbortReason")
    @Expose
    private Long AbortReason;

    /**
    * 任务的创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 通知事件回调
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotificationHooks")
    @Expose
    private NotificationHook [] NotificationHooks;

    /**
    * 每秒接收字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkReceiveRate")
    @Expose
    private Float NetworkReceiveRate;

    /**
    * 每秒发送字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkSendRate")
    @Expose
    private Float NetworkSendRate;

    /**
    * 任务状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 任务的JobID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 任务的JobID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务的JobID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 任务的JobID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 任务的场景ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScenarioId 任务的场景ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScenarioId() {
        return this.ScenarioId;
    }

    /**
     * Set 任务的场景ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScenarioId 任务的场景ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScenarioId(String ScenarioId) {
        this.ScenarioId = ScenarioId;
    }

    /**
     * Get 任务的施压配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Load 任务的施压配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Load getLoad() {
        return this.Load;
    }

    /**
     * Set 任务的施压配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Load 任务的施压配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoad(Load Load) {
        this.Load = Load;
    }

    /**
     * Get 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Configs 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getConfigs() {
        return this.Configs;
    }

    /**
     * Set 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Configs 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigs(String [] Configs) {
        this.Configs = Configs;
    }

    /**
     * Get 任务的数据集文件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Datasets 任务的数据集文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TestData [] getDatasets() {
        return this.Datasets;
    }

    /**
     * Set 任务的数据集文件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Datasets 任务的数据集文件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasets(TestData [] Datasets) {
        this.Datasets = Datasets;
    }

    /**
     * Get 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extensions 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExtensions() {
        return this.Extensions;
    }

    /**
     * Set 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extensions 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtensions(String [] Extensions) {
        this.Extensions = Extensions;
    }

    /**
     * Get 任务的运行状态, JobUnknown: 0,JobCreated:1,JobPending:2, JobPreparing:3,JobSelectClustering:4,JobCreateTasking:5,JobSyncTasking:6
JobRunning:11,JobFinished:12,JobPrepareException:13,JobFinishException:14,JobAborting:15,JobAborted:16,JobAbortException:17,JobDeleted:18,
JobSelectClusterException:19,JobCreateTaskException:20,JobSyncTaskException:21
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务的运行状态, JobUnknown: 0,JobCreated:1,JobPending:2, JobPreparing:3,JobSelectClustering:4,JobCreateTasking:5,JobSyncTasking:6
JobRunning:11,JobFinished:12,JobPrepareException:13,JobFinishException:14,JobAborting:15,JobAborted:16,JobAbortException:17,JobDeleted:18,
JobSelectClusterException:19,JobCreateTaskException:20,JobSyncTaskException:21
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务的运行状态, JobUnknown: 0,JobCreated:1,JobPending:2, JobPreparing:3,JobSelectClustering:4,JobCreateTasking:5,JobSyncTasking:6
JobRunning:11,JobFinished:12,JobPrepareException:13,JobFinishException:14,JobAborting:15,JobAborted:16,JobAbortException:17,JobDeleted:18,
JobSelectClusterException:19,JobCreateTaskException:20,JobSyncTaskException:21
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务的运行状态, JobUnknown: 0,JobCreated:1,JobPending:2, JobPreparing:3,JobSelectClustering:4,JobCreateTasking:5,JobSyncTasking:6
JobRunning:11,JobFinished:12,JobPrepareException:13,JobFinishException:14,JobAborting:15,JobAborted:16,JobAbortException:17,JobDeleted:18,
JobSelectClusterException:19,JobCreateTaskException:20,JobSyncTaskException:21
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务的开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 任务的开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务的开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 任务的开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务的结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 任务的结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务的结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 任务的结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务的最大VU数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxVirtualUserCount 任务的最大VU数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxVirtualUserCount() {
        return this.MaxVirtualUserCount;
    }

    /**
     * Set 任务的最大VU数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxVirtualUserCount 任务的最大VU数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxVirtualUserCount(Long MaxVirtualUserCount) {
        this.MaxVirtualUserCount = MaxVirtualUserCount;
    }

    /**
     * Get 任务的备注信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Note 任务的备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 任务的备注信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Note 任务的备注信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 错误率百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorRate 错误率百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getErrorRate() {
        return this.ErrorRate;
    }

    /**
     * Set 错误率百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorRate 错误率百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorRate(Float ErrorRate) {
        this.ErrorRate = ErrorRate;
    }

    /**
     * Get 任务发起人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobOwner 任务发起人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobOwner() {
        return this.JobOwner;
    }

    /**
     * Set 任务发起人
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobOwner 任务发起人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobOwner(String JobOwner) {
        this.JobOwner = JobOwner;
    }

    /**
     * Get 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadSources 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LoadSource getLoadSources() {
        return this.LoadSources;
    }

    /**
     * Set 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadSources 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadSources(LoadSource LoadSources) {
        this.LoadSources = LoadSources;
    }

    /**
     * Get 任务时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 任务时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 任务时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 任务时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 最大每秒请求数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxRequestsPerSecond 最大每秒请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxRequestsPerSecond() {
        return this.MaxRequestsPerSecond;
    }

    /**
     * Set 最大每秒请求数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxRequestsPerSecond 最大每秒请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxRequestsPerSecond(Long MaxRequestsPerSecond) {
        this.MaxRequestsPerSecond = MaxRequestsPerSecond;
    }

    /**
     * Get 总请求数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestTotal 总请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRequestTotal() {
        return this.RequestTotal;
    }

    /**
     * Set 总请求数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestTotal 总请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestTotal(Float RequestTotal) {
        this.RequestTotal = RequestTotal;
    }

    /**
     * Get 平均每秒请求数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestsPerSecond 平均每秒请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRequestsPerSecond() {
        return this.RequestsPerSecond;
    }

    /**
     * Set 平均每秒请求数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestsPerSecond 平均每秒请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestsPerSecond(Float RequestsPerSecond) {
        this.RequestsPerSecond = RequestsPerSecond;
    }

    /**
     * Get 平均响应时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseTimeAverage 平均响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getResponseTimeAverage() {
        return this.ResponseTimeAverage;
    }

    /**
     * Set 平均响应时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseTimeAverage 平均响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseTimeAverage(Float ResponseTimeAverage) {
        this.ResponseTimeAverage = ResponseTimeAverage;
    }

    /**
     * Get 响应时间第99百分位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseTimeP99 响应时间第99百分位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getResponseTimeP99() {
        return this.ResponseTimeP99;
    }

    /**
     * Set 响应时间第99百分位
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseTimeP99 响应时间第99百分位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseTimeP99(Float ResponseTimeP99) {
        this.ResponseTimeP99 = ResponseTimeP99;
    }

    /**
     * Get 响应时间第95百分位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseTimeP95 响应时间第95百分位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getResponseTimeP95() {
        return this.ResponseTimeP95;
    }

    /**
     * Set 响应时间第95百分位
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseTimeP95 响应时间第95百分位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseTimeP95(Float ResponseTimeP95) {
        this.ResponseTimeP95 = ResponseTimeP95;
    }

    /**
     * Get 响应时间第90百分位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseTimeP90 响应时间第90百分位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getResponseTimeP90() {
        return this.ResponseTimeP90;
    }

    /**
     * Set 响应时间第90百分位
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseTimeP90 响应时间第90百分位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseTimeP90(Float ResponseTimeP90) {
        this.ResponseTimeP90 = ResponseTimeP90;
    }

    /**
     * Get 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scripts 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getScripts() {
        return this.Scripts;
    }

    /**
     * Set 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scripts 此字段不再使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScripts(String [] Scripts) {
        this.Scripts = Scripts;
    }

    /**
     * Get 最大响应时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseTimeMax 最大响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getResponseTimeMax() {
        return this.ResponseTimeMax;
    }

    /**
     * Set 最大响应时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseTimeMax 最大响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseTimeMax(Float ResponseTimeMax) {
        this.ResponseTimeMax = ResponseTimeMax;
    }

    /**
     * Get 最小响应时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseTimeMin 最小响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getResponseTimeMin() {
        return this.ResponseTimeMin;
    }

    /**
     * Set 最小响应时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseTimeMin 最小响应时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseTimeMin(Float ResponseTimeMin) {
        this.ResponseTimeMin = ResponseTimeMin;
    }

    /**
     * Get 发压host信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadSourceInfos 发压host信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LoadSource [] getLoadSourceInfos() {
        return this.LoadSourceInfos;
    }

    /**
     * Set 发压host信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadSourceInfos 发压host信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadSourceInfos(LoadSource [] LoadSourceInfos) {
        this.LoadSourceInfos = LoadSourceInfos;
    }

    /**
     * Get 测试脚本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TestScripts 测试脚本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScriptInfo [] getTestScripts() {
        return this.TestScripts;
    }

    /**
     * Set 测试脚本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TestScripts 测试脚本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTestScripts(ScriptInfo [] TestScripts) {
        this.TestScripts = TestScripts;
    }

    /**
     * Get 协议脚本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocols 协议脚本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProtocolInfo [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set 协议脚本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocols 协议脚本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocols(ProtocolInfo [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get 请求文件信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestFiles 请求文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo [] getRequestFiles() {
        return this.RequestFiles;
    }

    /**
     * Set 请求文件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestFiles 请求文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestFiles(FileInfo [] RequestFiles) {
        this.RequestFiles = RequestFiles;
    }

    /**
     * Get 拓展包文件信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Plugins 拓展包文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileInfo [] getPlugins() {
        return this.Plugins;
    }

    /**
     * Set 拓展包文件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Plugins 拓展包文件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlugins(FileInfo [] Plugins) {
        this.Plugins = Plugins;
    }

    /**
     * Get 定时任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronId 定时任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCronId() {
        return this.CronId;
    }

    /**
     * Set 定时任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronId 定时任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronId(String CronId) {
        this.CronId = CronId;
    }

    /**
     * Get 场景类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 场景类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 场景类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 场景类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 域名绑定配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainNameConfig 域名绑定配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DomainNameConfig getDomainNameConfig() {
        return this.DomainNameConfig;
    }

    /**
     * Set 域名绑定配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainNameConfig 域名绑定配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainNameConfig(DomainNameConfig DomainNameConfig) {
        this.DomainNameConfig = DomainNameConfig;
    }

    /**
     * Get false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Debug false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDebug() {
        return this.Debug;
    }

    /**
     * Set false
注意：此字段可能返回 null，表示取不到有效值。
     * @param Debug false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDebug(Boolean Debug) {
        this.Debug = Debug;
    }

    /**
     * Get 中断原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AbortReason 中断原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAbortReason() {
        return this.AbortReason;
    }

    /**
     * Set 中断原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param AbortReason 中断原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbortReason(Long AbortReason) {
        this.AbortReason = AbortReason;
    }

    /**
     * Get 任务的创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 任务的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 任务的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 任务的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 通知事件回调
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotificationHooks 通知事件回调
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NotificationHook [] getNotificationHooks() {
        return this.NotificationHooks;
    }

    /**
     * Set 通知事件回调
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotificationHooks 通知事件回调
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotificationHooks(NotificationHook [] NotificationHooks) {
        this.NotificationHooks = NotificationHooks;
    }

    /**
     * Get 每秒接收字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkReceiveRate 每秒接收字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getNetworkReceiveRate() {
        return this.NetworkReceiveRate;
    }

    /**
     * Set 每秒接收字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkReceiveRate 每秒接收字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkReceiveRate(Float NetworkReceiveRate) {
        this.NetworkReceiveRate = NetworkReceiveRate;
    }

    /**
     * Get 每秒发送字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkSendRate 每秒发送字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getNetworkSendRate() {
        return this.NetworkSendRate;
    }

    /**
     * Set 每秒发送字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkSendRate 每秒发送字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkSendRate(Float NetworkSendRate) {
        this.NetworkSendRate = NetworkSendRate;
    }

    /**
     * Get 任务状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 任务状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 任务状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 任务状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public Job() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Job(Job source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ScenarioId != null) {
            this.ScenarioId = new String(source.ScenarioId);
        }
        if (source.Load != null) {
            this.Load = new Load(source.Load);
        }
        if (source.Configs != null) {
            this.Configs = new String[source.Configs.length];
            for (int i = 0; i < source.Configs.length; i++) {
                this.Configs[i] = new String(source.Configs[i]);
            }
        }
        if (source.Datasets != null) {
            this.Datasets = new TestData[source.Datasets.length];
            for (int i = 0; i < source.Datasets.length; i++) {
                this.Datasets[i] = new TestData(source.Datasets[i]);
            }
        }
        if (source.Extensions != null) {
            this.Extensions = new String[source.Extensions.length];
            for (int i = 0; i < source.Extensions.length; i++) {
                this.Extensions[i] = new String(source.Extensions[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MaxVirtualUserCount != null) {
            this.MaxVirtualUserCount = new Long(source.MaxVirtualUserCount);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.ErrorRate != null) {
            this.ErrorRate = new Float(source.ErrorRate);
        }
        if (source.JobOwner != null) {
            this.JobOwner = new String(source.JobOwner);
        }
        if (source.LoadSources != null) {
            this.LoadSources = new LoadSource(source.LoadSources);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.MaxRequestsPerSecond != null) {
            this.MaxRequestsPerSecond = new Long(source.MaxRequestsPerSecond);
        }
        if (source.RequestTotal != null) {
            this.RequestTotal = new Float(source.RequestTotal);
        }
        if (source.RequestsPerSecond != null) {
            this.RequestsPerSecond = new Float(source.RequestsPerSecond);
        }
        if (source.ResponseTimeAverage != null) {
            this.ResponseTimeAverage = new Float(source.ResponseTimeAverage);
        }
        if (source.ResponseTimeP99 != null) {
            this.ResponseTimeP99 = new Float(source.ResponseTimeP99);
        }
        if (source.ResponseTimeP95 != null) {
            this.ResponseTimeP95 = new Float(source.ResponseTimeP95);
        }
        if (source.ResponseTimeP90 != null) {
            this.ResponseTimeP90 = new Float(source.ResponseTimeP90);
        }
        if (source.Scripts != null) {
            this.Scripts = new String[source.Scripts.length];
            for (int i = 0; i < source.Scripts.length; i++) {
                this.Scripts[i] = new String(source.Scripts[i]);
            }
        }
        if (source.ResponseTimeMax != null) {
            this.ResponseTimeMax = new Float(source.ResponseTimeMax);
        }
        if (source.ResponseTimeMin != null) {
            this.ResponseTimeMin = new Float(source.ResponseTimeMin);
        }
        if (source.LoadSourceInfos != null) {
            this.LoadSourceInfos = new LoadSource[source.LoadSourceInfos.length];
            for (int i = 0; i < source.LoadSourceInfos.length; i++) {
                this.LoadSourceInfos[i] = new LoadSource(source.LoadSourceInfos[i]);
            }
        }
        if (source.TestScripts != null) {
            this.TestScripts = new ScriptInfo[source.TestScripts.length];
            for (int i = 0; i < source.TestScripts.length; i++) {
                this.TestScripts[i] = new ScriptInfo(source.TestScripts[i]);
            }
        }
        if (source.Protocols != null) {
            this.Protocols = new ProtocolInfo[source.Protocols.length];
            for (int i = 0; i < source.Protocols.length; i++) {
                this.Protocols[i] = new ProtocolInfo(source.Protocols[i]);
            }
        }
        if (source.RequestFiles != null) {
            this.RequestFiles = new FileInfo[source.RequestFiles.length];
            for (int i = 0; i < source.RequestFiles.length; i++) {
                this.RequestFiles[i] = new FileInfo(source.RequestFiles[i]);
            }
        }
        if (source.Plugins != null) {
            this.Plugins = new FileInfo[source.Plugins.length];
            for (int i = 0; i < source.Plugins.length; i++) {
                this.Plugins[i] = new FileInfo(source.Plugins[i]);
            }
        }
        if (source.CronId != null) {
            this.CronId = new String(source.CronId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DomainNameConfig != null) {
            this.DomainNameConfig = new DomainNameConfig(source.DomainNameConfig);
        }
        if (source.Debug != null) {
            this.Debug = new Boolean(source.Debug);
        }
        if (source.AbortReason != null) {
            this.AbortReason = new Long(source.AbortReason);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.NotificationHooks != null) {
            this.NotificationHooks = new NotificationHook[source.NotificationHooks.length];
            for (int i = 0; i < source.NotificationHooks.length; i++) {
                this.NotificationHooks[i] = new NotificationHook(source.NotificationHooks[i]);
            }
        }
        if (source.NetworkReceiveRate != null) {
            this.NetworkReceiveRate = new Float(source.NetworkReceiveRate);
        }
        if (source.NetworkSendRate != null) {
            this.NetworkSendRate = new Float(source.NetworkSendRate);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ScenarioId", this.ScenarioId);
        this.setParamObj(map, prefix + "Load.", this.Load);
        this.setParamArraySimple(map, prefix + "Configs.", this.Configs);
        this.setParamArrayObj(map, prefix + "Datasets.", this.Datasets);
        this.setParamArraySimple(map, prefix + "Extensions.", this.Extensions);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MaxVirtualUserCount", this.MaxVirtualUserCount);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "ErrorRate", this.ErrorRate);
        this.setParamSimple(map, prefix + "JobOwner", this.JobOwner);
        this.setParamObj(map, prefix + "LoadSources.", this.LoadSources);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "MaxRequestsPerSecond", this.MaxRequestsPerSecond);
        this.setParamSimple(map, prefix + "RequestTotal", this.RequestTotal);
        this.setParamSimple(map, prefix + "RequestsPerSecond", this.RequestsPerSecond);
        this.setParamSimple(map, prefix + "ResponseTimeAverage", this.ResponseTimeAverage);
        this.setParamSimple(map, prefix + "ResponseTimeP99", this.ResponseTimeP99);
        this.setParamSimple(map, prefix + "ResponseTimeP95", this.ResponseTimeP95);
        this.setParamSimple(map, prefix + "ResponseTimeP90", this.ResponseTimeP90);
        this.setParamArraySimple(map, prefix + "Scripts.", this.Scripts);
        this.setParamSimple(map, prefix + "ResponseTimeMax", this.ResponseTimeMax);
        this.setParamSimple(map, prefix + "ResponseTimeMin", this.ResponseTimeMin);
        this.setParamArrayObj(map, prefix + "LoadSourceInfos.", this.LoadSourceInfos);
        this.setParamArrayObj(map, prefix + "TestScripts.", this.TestScripts);
        this.setParamArrayObj(map, prefix + "Protocols.", this.Protocols);
        this.setParamArrayObj(map, prefix + "RequestFiles.", this.RequestFiles);
        this.setParamArrayObj(map, prefix + "Plugins.", this.Plugins);
        this.setParamSimple(map, prefix + "CronId", this.CronId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "DomainNameConfig.", this.DomainNameConfig);
        this.setParamSimple(map, prefix + "Debug", this.Debug);
        this.setParamSimple(map, prefix + "AbortReason", this.AbortReason);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "NotificationHooks.", this.NotificationHooks);
        this.setParamSimple(map, prefix + "NetworkReceiveRate", this.NetworkReceiveRate);
        this.setParamSimple(map, prefix + "NetworkSendRate", this.NetworkSendRate);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

