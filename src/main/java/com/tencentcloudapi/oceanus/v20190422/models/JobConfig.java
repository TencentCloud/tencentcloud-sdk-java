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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobConfig extends AbstractModel {

    /**
    * 作业Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 主类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntrypointClass")
    @Expose
    private String EntrypointClass;

    /**
    * 主类入参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramArgs")
    @Expose
    private String ProgramArgs;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 作业配置创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 作业配置的版本号
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 作业默认并行度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultParallelism")
    @Expose
    private Long DefaultParallelism;

    /**
    * 系统参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * 引用资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRefDetails")
    @Expose
    private ResourceRefDetail [] ResourceRefDetails;

    /**
    * 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 作业配置上次启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 作业绑定的存储桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("COSBucket")
    @Expose
    private String COSBucket;

    /**
    * 是否启用日志收集，0-未启用，1-已启用，2-历史集群未设置日志集，3-历史集群已开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogCollect")
    @Expose
    private Long LogCollect;

    /**
    * 作业的最大并行度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxParallelism")
    @Expose
    private Long MaxParallelism;

    /**
    * JobManager规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobManagerSpec")
    @Expose
    private Float JobManagerSpec;

    /**
    * TaskManager规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskManagerSpec")
    @Expose
    private Float TaskManagerSpec;

    /**
    * CLS日志集ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * CLS日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * pyflink作业运行的python版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PythonVersion")
    @Expose
    private String PythonVersion;

    /**
    * Oceanus 平台恢复作业开关 1:开启 -1: 关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRecover")
    @Expose
    private Long AutoRecover;

    /**
    * 日志级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogLevel")
    @Expose
    private String LogLevel;

    /**
    * 类日志级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClazzLevels")
    @Expose
    private ClazzLevel [] ClazzLevels;

    /**
    * 是否开启专家模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpertModeOn")
    @Expose
    private Boolean ExpertModeOn;

    /**
    * 专家模式的配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpertModeConfiguration")
    @Expose
    private ExpertModeConfiguration ExpertModeConfiguration;

    /**
    * trace链路
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TraceModeOn")
    @Expose
    private Boolean TraceModeOn;

    /**
    * trace链路配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TraceModeConfiguration")
    @Expose
    private TraceModeConfiguration TraceModeConfiguration;

    /**
    * checkpoint保留个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckpointRetainedNum")
    @Expose
    private Long CheckpointRetainedNum;

    /**
    * 算子拓扑图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobGraph")
    @Expose
    private JobGraph JobGraph;

    /**
    * es索引
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsServerlessIndex")
    @Expose
    private String EsServerlessIndex;

    /**
    * es空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsServerlessSpace")
    @Expose
    private String EsServerlessSpace;

    /**
    * es索引中文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * es空间中文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceName")
    @Expose
    private String WorkspaceName;

    /**
    * flink 版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * jm使用cpu数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobManagerCpu")
    @Expose
    private Float JobManagerCpu;

    /**
    * jm使用内存数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobManagerMem")
    @Expose
    private Float JobManagerMem;

    /**
    * tm使用cpu数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskManagerCpu")
    @Expose
    private Float TaskManagerCpu;

    /**
    * tm使用mem数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskManagerMem")
    @Expose
    private Float TaskManagerMem;

    /**
    * 运行中配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobConfigItem")
    @Expose
    private JobConfig JobConfigItem;

    /**
    * checkpoint 超时时间
    */
    @SerializedName("CheckpointTimeoutSecond")
    @Expose
    private Long CheckpointTimeoutSecond;

    /**
    * checkpoint 间隔时间
    */
    @SerializedName("CheckpointIntervalSecond")
    @Expose
    private Long CheckpointIntervalSecond;

    /**
     * Get 作业Id 
     * @return JobId 作业Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业Id
     * @param JobId 作业Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 主类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntrypointClass 主类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntrypointClass() {
        return this.EntrypointClass;
    }

    /**
     * Set 主类
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntrypointClass 主类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntrypointClass(String EntrypointClass) {
        this.EntrypointClass = EntrypointClass;
    }

    /**
     * Get 主类入参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramArgs 主类入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgramArgs() {
        return this.ProgramArgs;
    }

    /**
     * Set 主类入参
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramArgs 主类入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramArgs(String ProgramArgs) {
        this.ProgramArgs = ProgramArgs;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 作业配置创建时间 
     * @return CreateTime 作业配置创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 作业配置创建时间
     * @param CreateTime 作业配置创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 作业配置的版本号 
     * @return Version 作业配置的版本号
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 作业配置的版本号
     * @param Version 作业配置的版本号
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 作业默认并行度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultParallelism 作业默认并行度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultParallelism() {
        return this.DefaultParallelism;
    }

    /**
     * Set 作业默认并行度
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultParallelism 作业默认并行度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultParallelism(Long DefaultParallelism) {
        this.DefaultParallelism = DefaultParallelism;
    }

    /**
     * Get 系统参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 系统参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 系统参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 系统参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 引用资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRefDetails 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceRefDetail [] getResourceRefDetails() {
        return this.ResourceRefDetails;
    }

    /**
     * Set 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRefDetails 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRefDetails(ResourceRefDetail [] ResourceRefDetails) {
        this.ResourceRefDetails = ResourceRefDetails;
    }

    /**
     * Get 创建者uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin 创建者uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 作业配置上次启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 作业配置上次启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 作业配置上次启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 作业配置上次启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 作业绑定的存储桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return COSBucket 作业绑定的存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCOSBucket() {
        return this.COSBucket;
    }

    /**
     * Set 作业绑定的存储桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param COSBucket 作业绑定的存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCOSBucket(String COSBucket) {
        this.COSBucket = COSBucket;
    }

    /**
     * Get 是否启用日志收集，0-未启用，1-已启用，2-历史集群未设置日志集，3-历史集群已开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogCollect 是否启用日志收集，0-未启用，1-已启用，2-历史集群未设置日志集，3-历史集群已开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogCollect() {
        return this.LogCollect;
    }

    /**
     * Set 是否启用日志收集，0-未启用，1-已启用，2-历史集群未设置日志集，3-历史集群已开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogCollect 是否启用日志收集，0-未启用，1-已启用，2-历史集群未设置日志集，3-历史集群已开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogCollect(Long LogCollect) {
        this.LogCollect = LogCollect;
    }

    /**
     * Get 作业的最大并行度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxParallelism 作业的最大并行度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxParallelism() {
        return this.MaxParallelism;
    }

    /**
     * Set 作业的最大并行度
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxParallelism 作业的最大并行度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxParallelism(Long MaxParallelism) {
        this.MaxParallelism = MaxParallelism;
    }

    /**
     * Get JobManager规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobManagerSpec JobManager规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getJobManagerSpec() {
        return this.JobManagerSpec;
    }

    /**
     * Set JobManager规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobManagerSpec JobManager规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobManagerSpec(Float JobManagerSpec) {
        this.JobManagerSpec = JobManagerSpec;
    }

    /**
     * Get TaskManager规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskManagerSpec TaskManager规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTaskManagerSpec() {
        return this.TaskManagerSpec;
    }

    /**
     * Set TaskManager规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskManagerSpec TaskManager规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskManagerSpec(Float TaskManagerSpec) {
        this.TaskManagerSpec = TaskManagerSpec;
    }

    /**
     * Get CLS日志集ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClsLogsetId CLS日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set CLS日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClsLogsetId CLS日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get CLS日志主题ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClsTopicId CLS日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set CLS日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClsTopicId CLS日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get pyflink作业运行的python版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PythonVersion pyflink作业运行的python版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPythonVersion() {
        return this.PythonVersion;
    }

    /**
     * Set pyflink作业运行的python版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PythonVersion pyflink作业运行的python版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPythonVersion(String PythonVersion) {
        this.PythonVersion = PythonVersion;
    }

    /**
     * Get Oceanus 平台恢复作业开关 1:开启 -1: 关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRecover Oceanus 平台恢复作业开关 1:开启 -1: 关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRecover() {
        return this.AutoRecover;
    }

    /**
     * Set Oceanus 平台恢复作业开关 1:开启 -1: 关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRecover Oceanus 平台恢复作业开关 1:开启 -1: 关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRecover(Long AutoRecover) {
        this.AutoRecover = AutoRecover;
    }

    /**
     * Get 日志级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogLevel 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogLevel 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogLevel(String LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get 类日志级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClazzLevels 类日志级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClazzLevel [] getClazzLevels() {
        return this.ClazzLevels;
    }

    /**
     * Set 类日志级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClazzLevels 类日志级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClazzLevels(ClazzLevel [] ClazzLevels) {
        this.ClazzLevels = ClazzLevels;
    }

    /**
     * Get 是否开启专家模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpertModeOn 是否开启专家模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getExpertModeOn() {
        return this.ExpertModeOn;
    }

    /**
     * Set 是否开启专家模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpertModeOn 是否开启专家模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpertModeOn(Boolean ExpertModeOn) {
        this.ExpertModeOn = ExpertModeOn;
    }

    /**
     * Get 专家模式的配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpertModeConfiguration 专家模式的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExpertModeConfiguration getExpertModeConfiguration() {
        return this.ExpertModeConfiguration;
    }

    /**
     * Set 专家模式的配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpertModeConfiguration 专家模式的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpertModeConfiguration(ExpertModeConfiguration ExpertModeConfiguration) {
        this.ExpertModeConfiguration = ExpertModeConfiguration;
    }

    /**
     * Get trace链路
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TraceModeOn trace链路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTraceModeOn() {
        return this.TraceModeOn;
    }

    /**
     * Set trace链路
注意：此字段可能返回 null，表示取不到有效值。
     * @param TraceModeOn trace链路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTraceModeOn(Boolean TraceModeOn) {
        this.TraceModeOn = TraceModeOn;
    }

    /**
     * Get trace链路配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TraceModeConfiguration trace链路配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TraceModeConfiguration getTraceModeConfiguration() {
        return this.TraceModeConfiguration;
    }

    /**
     * Set trace链路配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param TraceModeConfiguration trace链路配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTraceModeConfiguration(TraceModeConfiguration TraceModeConfiguration) {
        this.TraceModeConfiguration = TraceModeConfiguration;
    }

    /**
     * Get checkpoint保留个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckpointRetainedNum checkpoint保留个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckpointRetainedNum() {
        return this.CheckpointRetainedNum;
    }

    /**
     * Set checkpoint保留个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckpointRetainedNum checkpoint保留个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckpointRetainedNum(Long CheckpointRetainedNum) {
        this.CheckpointRetainedNum = CheckpointRetainedNum;
    }

    /**
     * Get 算子拓扑图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobGraph 算子拓扑图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobGraph getJobGraph() {
        return this.JobGraph;
    }

    /**
     * Set 算子拓扑图
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobGraph 算子拓扑图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobGraph(JobGraph JobGraph) {
        this.JobGraph = JobGraph;
    }

    /**
     * Get es索引
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsServerlessIndex es索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsServerlessIndex() {
        return this.EsServerlessIndex;
    }

    /**
     * Set es索引
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsServerlessIndex es索引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsServerlessIndex(String EsServerlessIndex) {
        this.EsServerlessIndex = EsServerlessIndex;
    }

    /**
     * Get es空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsServerlessSpace es空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsServerlessSpace() {
        return this.EsServerlessSpace;
    }

    /**
     * Set es空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsServerlessSpace es空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsServerlessSpace(String EsServerlessSpace) {
        this.EsServerlessSpace = EsServerlessSpace;
    }

    /**
     * Get es索引中文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexName es索引中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set es索引中文
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexName es索引中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get es空间中文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceName es空间中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspaceName() {
        return this.WorkspaceName;
    }

    /**
     * Set es空间中文
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceName es空间中文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceName(String WorkspaceName) {
        this.WorkspaceName = WorkspaceName;
    }

    /**
     * Get flink 版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlinkVersion flink 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set flink 版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlinkVersion flink 版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get jm使用cpu数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobManagerCpu jm使用cpu数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getJobManagerCpu() {
        return this.JobManagerCpu;
    }

    /**
     * Set jm使用cpu数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobManagerCpu jm使用cpu数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobManagerCpu(Float JobManagerCpu) {
        this.JobManagerCpu = JobManagerCpu;
    }

    /**
     * Get jm使用内存数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobManagerMem jm使用内存数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getJobManagerMem() {
        return this.JobManagerMem;
    }

    /**
     * Set jm使用内存数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobManagerMem jm使用内存数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobManagerMem(Float JobManagerMem) {
        this.JobManagerMem = JobManagerMem;
    }

    /**
     * Get tm使用cpu数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskManagerCpu tm使用cpu数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTaskManagerCpu() {
        return this.TaskManagerCpu;
    }

    /**
     * Set tm使用cpu数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskManagerCpu tm使用cpu数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskManagerCpu(Float TaskManagerCpu) {
        this.TaskManagerCpu = TaskManagerCpu;
    }

    /**
     * Get tm使用mem数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskManagerMem tm使用mem数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTaskManagerMem() {
        return this.TaskManagerMem;
    }

    /**
     * Set tm使用mem数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskManagerMem tm使用mem数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskManagerMem(Float TaskManagerMem) {
        this.TaskManagerMem = TaskManagerMem;
    }

    /**
     * Get 运行中配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobConfigItem 运行中配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobConfig getJobConfigItem() {
        return this.JobConfigItem;
    }

    /**
     * Set 运行中配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobConfigItem 运行中配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobConfigItem(JobConfig JobConfigItem) {
        this.JobConfigItem = JobConfigItem;
    }

    /**
     * Get checkpoint 超时时间 
     * @return CheckpointTimeoutSecond checkpoint 超时时间
     */
    public Long getCheckpointTimeoutSecond() {
        return this.CheckpointTimeoutSecond;
    }

    /**
     * Set checkpoint 超时时间
     * @param CheckpointTimeoutSecond checkpoint 超时时间
     */
    public void setCheckpointTimeoutSecond(Long CheckpointTimeoutSecond) {
        this.CheckpointTimeoutSecond = CheckpointTimeoutSecond;
    }

    /**
     * Get checkpoint 间隔时间 
     * @return CheckpointIntervalSecond checkpoint 间隔时间
     */
    public Long getCheckpointIntervalSecond() {
        return this.CheckpointIntervalSecond;
    }

    /**
     * Set checkpoint 间隔时间
     * @param CheckpointIntervalSecond checkpoint 间隔时间
     */
    public void setCheckpointIntervalSecond(Long CheckpointIntervalSecond) {
        this.CheckpointIntervalSecond = CheckpointIntervalSecond;
    }

    public JobConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobConfig(JobConfig source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.EntrypointClass != null) {
            this.EntrypointClass = new String(source.EntrypointClass);
        }
        if (source.ProgramArgs != null) {
            this.ProgramArgs = new String(source.ProgramArgs);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.DefaultParallelism != null) {
            this.DefaultParallelism = new Long(source.DefaultParallelism);
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
        if (source.ResourceRefDetails != null) {
            this.ResourceRefDetails = new ResourceRefDetail[source.ResourceRefDetails.length];
            for (int i = 0; i < source.ResourceRefDetails.length; i++) {
                this.ResourceRefDetails[i] = new ResourceRefDetail(source.ResourceRefDetails[i]);
            }
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.COSBucket != null) {
            this.COSBucket = new String(source.COSBucket);
        }
        if (source.LogCollect != null) {
            this.LogCollect = new Long(source.LogCollect);
        }
        if (source.MaxParallelism != null) {
            this.MaxParallelism = new Long(source.MaxParallelism);
        }
        if (source.JobManagerSpec != null) {
            this.JobManagerSpec = new Float(source.JobManagerSpec);
        }
        if (source.TaskManagerSpec != null) {
            this.TaskManagerSpec = new Float(source.TaskManagerSpec);
        }
        if (source.ClsLogsetId != null) {
            this.ClsLogsetId = new String(source.ClsLogsetId);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.PythonVersion != null) {
            this.PythonVersion = new String(source.PythonVersion);
        }
        if (source.AutoRecover != null) {
            this.AutoRecover = new Long(source.AutoRecover);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new String(source.LogLevel);
        }
        if (source.ClazzLevels != null) {
            this.ClazzLevels = new ClazzLevel[source.ClazzLevels.length];
            for (int i = 0; i < source.ClazzLevels.length; i++) {
                this.ClazzLevels[i] = new ClazzLevel(source.ClazzLevels[i]);
            }
        }
        if (source.ExpertModeOn != null) {
            this.ExpertModeOn = new Boolean(source.ExpertModeOn);
        }
        if (source.ExpertModeConfiguration != null) {
            this.ExpertModeConfiguration = new ExpertModeConfiguration(source.ExpertModeConfiguration);
        }
        if (source.TraceModeOn != null) {
            this.TraceModeOn = new Boolean(source.TraceModeOn);
        }
        if (source.TraceModeConfiguration != null) {
            this.TraceModeConfiguration = new TraceModeConfiguration(source.TraceModeConfiguration);
        }
        if (source.CheckpointRetainedNum != null) {
            this.CheckpointRetainedNum = new Long(source.CheckpointRetainedNum);
        }
        if (source.JobGraph != null) {
            this.JobGraph = new JobGraph(source.JobGraph);
        }
        if (source.EsServerlessIndex != null) {
            this.EsServerlessIndex = new String(source.EsServerlessIndex);
        }
        if (source.EsServerlessSpace != null) {
            this.EsServerlessSpace = new String(source.EsServerlessSpace);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.WorkspaceName != null) {
            this.WorkspaceName = new String(source.WorkspaceName);
        }
        if (source.FlinkVersion != null) {
            this.FlinkVersion = new String(source.FlinkVersion);
        }
        if (source.JobManagerCpu != null) {
            this.JobManagerCpu = new Float(source.JobManagerCpu);
        }
        if (source.JobManagerMem != null) {
            this.JobManagerMem = new Float(source.JobManagerMem);
        }
        if (source.TaskManagerCpu != null) {
            this.TaskManagerCpu = new Float(source.TaskManagerCpu);
        }
        if (source.TaskManagerMem != null) {
            this.TaskManagerMem = new Float(source.TaskManagerMem);
        }
        if (source.JobConfigItem != null) {
            this.JobConfigItem = new JobConfig(source.JobConfigItem);
        }
        if (source.CheckpointTimeoutSecond != null) {
            this.CheckpointTimeoutSecond = new Long(source.CheckpointTimeoutSecond);
        }
        if (source.CheckpointIntervalSecond != null) {
            this.CheckpointIntervalSecond = new Long(source.CheckpointIntervalSecond);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "EntrypointClass", this.EntrypointClass);
        this.setParamSimple(map, prefix + "ProgramArgs", this.ProgramArgs);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "DefaultParallelism", this.DefaultParallelism);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamArrayObj(map, prefix + "ResourceRefDetails.", this.ResourceRefDetails);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "COSBucket", this.COSBucket);
        this.setParamSimple(map, prefix + "LogCollect", this.LogCollect);
        this.setParamSimple(map, prefix + "MaxParallelism", this.MaxParallelism);
        this.setParamSimple(map, prefix + "JobManagerSpec", this.JobManagerSpec);
        this.setParamSimple(map, prefix + "TaskManagerSpec", this.TaskManagerSpec);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "PythonVersion", this.PythonVersion);
        this.setParamSimple(map, prefix + "AutoRecover", this.AutoRecover);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamArrayObj(map, prefix + "ClazzLevels.", this.ClazzLevels);
        this.setParamSimple(map, prefix + "ExpertModeOn", this.ExpertModeOn);
        this.setParamObj(map, prefix + "ExpertModeConfiguration.", this.ExpertModeConfiguration);
        this.setParamSimple(map, prefix + "TraceModeOn", this.TraceModeOn);
        this.setParamObj(map, prefix + "TraceModeConfiguration.", this.TraceModeConfiguration);
        this.setParamSimple(map, prefix + "CheckpointRetainedNum", this.CheckpointRetainedNum);
        this.setParamObj(map, prefix + "JobGraph.", this.JobGraph);
        this.setParamSimple(map, prefix + "EsServerlessIndex", this.EsServerlessIndex);
        this.setParamSimple(map, prefix + "EsServerlessSpace", this.EsServerlessSpace);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "WorkspaceName", this.WorkspaceName);
        this.setParamSimple(map, prefix + "FlinkVersion", this.FlinkVersion);
        this.setParamSimple(map, prefix + "JobManagerCpu", this.JobManagerCpu);
        this.setParamSimple(map, prefix + "JobManagerMem", this.JobManagerMem);
        this.setParamSimple(map, prefix + "TaskManagerCpu", this.TaskManagerCpu);
        this.setParamSimple(map, prefix + "TaskManagerMem", this.TaskManagerMem);
        this.setParamObj(map, prefix + "JobConfigItem.", this.JobConfigItem);
        this.setParamSimple(map, prefix + "CheckpointTimeoutSecond", this.CheckpointTimeoutSecond);
        this.setParamSimple(map, prefix + "CheckpointIntervalSecond", this.CheckpointIntervalSecond);

    }
}

