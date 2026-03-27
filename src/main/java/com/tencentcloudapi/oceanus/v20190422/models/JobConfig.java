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
    * <p>作业Id</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>主类</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntrypointClass")
    @Expose
    private String EntrypointClass;

    /**
    * <p>主类入参</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProgramArgs")
    @Expose
    private String ProgramArgs;

    /**
    * <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>作业配置创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>作业配置的版本号</p>
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * <p>作业默认并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultParallelism")
    @Expose
    private Long DefaultParallelism;

    /**
    * <p>系统参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRefDetails")
    @Expose
    private ResourceRefDetail [] ResourceRefDetails;

    /**
    * <p>创建者uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * <p>作业配置上次启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>作业绑定的存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("COSBucket")
    @Expose
    private String COSBucket;

    /**
    * <p>是否启用日志收集，0-未启用，1-采集到cls，4-采集到cos，5-采集到es</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogCollect")
    @Expose
    private Long LogCollect;

    /**
    * <p>作业的最大并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxParallelism")
    @Expose
    private Long MaxParallelism;

    /**
    * <p>JobManager规格</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobManagerSpec")
    @Expose
    private Float JobManagerSpec;

    /**
    * <p>TaskManager规格</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskManagerSpec")
    @Expose
    private Float TaskManagerSpec;

    /**
    * <p>CLS日志集ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * <p>CLS日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * <p>pyflink作业运行的python版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PythonVersion")
    @Expose
    private String PythonVersion;

    /**
    * <p>Oceanus 平台恢复作业开关 1:开启 -1: 关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRecover")
    @Expose
    private Long AutoRecover;

    /**
    * <p>日志级别</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogLevel")
    @Expose
    private String LogLevel;

    /**
    * <p>类日志级别</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClazzLevels")
    @Expose
    private ClazzLevel [] ClazzLevels;

    /**
    * <p>是否开启专家模式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpertModeOn")
    @Expose
    private Boolean ExpertModeOn;

    /**
    * <p>专家模式的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpertModeConfiguration")
    @Expose
    private ExpertModeConfiguration ExpertModeConfiguration;

    /**
    * <p>trace链路</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TraceModeOn")
    @Expose
    private Boolean TraceModeOn;

    /**
    * <p>trace链路配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TraceModeConfiguration")
    @Expose
    private TraceModeConfiguration TraceModeConfiguration;

    /**
    * <p>checkpoint保留个数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckpointRetainedNum")
    @Expose
    private Long CheckpointRetainedNum;

    /**
    * <p>算子拓扑图</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobGraph")
    @Expose
    private JobGraph JobGraph;

    /**
    * <p>es索引</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsServerlessIndex")
    @Expose
    private String EsServerlessIndex;

    /**
    * <p>es空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsServerlessSpace")
    @Expose
    private String EsServerlessSpace;

    /**
    * <p>es索引中文</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>es空间中文</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceName")
    @Expose
    private String WorkspaceName;

    /**
    * <p>flink 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * <p>jdk版本</p>
    */
    @SerializedName("JdkVersion")
    @Expose
    private String JdkVersion;

    /**
    * <p>jm使用cpu数目</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobManagerCpu")
    @Expose
    private Float JobManagerCpu;

    /**
    * <p>jm使用内存数目</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobManagerMem")
    @Expose
    private Float JobManagerMem;

    /**
    * <p>tm使用cpu数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskManagerCpu")
    @Expose
    private Float TaskManagerCpu;

    /**
    * <p>tm使用mem数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskManagerMem")
    @Expose
    private Float TaskManagerMem;

    /**
    * <p>运行中配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobConfigItem")
    @Expose
    private JobConfig JobConfigItem;

    /**
    * <p>checkpoint 超时时间</p>
    */
    @SerializedName("CheckpointTimeoutSecond")
    @Expose
    private Long CheckpointTimeoutSecond;

    /**
    * <p>checkpoint 间隔时间</p>
    */
    @SerializedName("CheckpointIntervalSecond")
    @Expose
    private Long CheckpointIntervalSecond;

    /**
    * <p>变量替换模式</p><p>枚举值：</p><ul><li>0： 表变量替换</li><li>1： 全局SQL变量替换</li></ul><p>默认值：0</p>
    */
    @SerializedName("VariableReplaceMode")
    @Expose
    private Long VariableReplaceMode;

    /**
     * Get <p>作业Id</p> 
     * @return JobId <p>作业Id</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业Id</p>
     * @param JobId <p>作业Id</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>主类</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntrypointClass <p>主类</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntrypointClass() {
        return this.EntrypointClass;
    }

    /**
     * Set <p>主类</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntrypointClass <p>主类</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntrypointClass(String EntrypointClass) {
        this.EntrypointClass = EntrypointClass;
    }

    /**
     * Get <p>主类入参</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProgramArgs <p>主类入参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProgramArgs() {
        return this.ProgramArgs;
    }

    /**
     * Set <p>主类入参</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProgramArgs <p>主类入参</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgramArgs(String ProgramArgs) {
        this.ProgramArgs = ProgramArgs;
    }

    /**
     * Get <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>作业配置创建时间</p> 
     * @return CreateTime <p>作业配置创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>作业配置创建时间</p>
     * @param CreateTime <p>作业配置创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>作业配置的版本号</p> 
     * @return Version <p>作业配置的版本号</p>
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set <p>作业配置的版本号</p>
     * @param Version <p>作业配置的版本号</p>
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get <p>作业默认并行度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultParallelism <p>作业默认并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultParallelism() {
        return this.DefaultParallelism;
    }

    /**
     * Set <p>作业默认并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultParallelism <p>作业默认并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultParallelism(Long DefaultParallelism) {
        this.DefaultParallelism = DefaultParallelism;
    }

    /**
     * Get <p>系统参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties <p>系统参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>系统参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties <p>系统参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRefDetails <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceRefDetail [] getResourceRefDetails() {
        return this.ResourceRefDetails;
    }

    /**
     * Set <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRefDetails <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRefDetails(ResourceRefDetail [] ResourceRefDetails) {
        this.ResourceRefDetails = ResourceRefDetails;
    }

    /**
     * Get <p>创建者uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin <p>创建者uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>创建者uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin <p>创建者uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>作业配置上次启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>作业配置上次启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>作业配置上次启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>作业配置上次启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>作业绑定的存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return COSBucket <p>作业绑定的存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCOSBucket() {
        return this.COSBucket;
    }

    /**
     * Set <p>作业绑定的存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param COSBucket <p>作业绑定的存储桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCOSBucket(String COSBucket) {
        this.COSBucket = COSBucket;
    }

    /**
     * Get <p>是否启用日志收集，0-未启用，1-采集到cls，4-采集到cos，5-采集到es</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogCollect <p>是否启用日志收集，0-未启用，1-采集到cls，4-采集到cos，5-采集到es</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogCollect() {
        return this.LogCollect;
    }

    /**
     * Set <p>是否启用日志收集，0-未启用，1-采集到cls，4-采集到cos，5-采集到es</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogCollect <p>是否启用日志收集，0-未启用，1-采集到cls，4-采集到cos，5-采集到es</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogCollect(Long LogCollect) {
        this.LogCollect = LogCollect;
    }

    /**
     * Get <p>作业的最大并行度</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxParallelism <p>作业的最大并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxParallelism() {
        return this.MaxParallelism;
    }

    /**
     * Set <p>作业的最大并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxParallelism <p>作业的最大并行度</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxParallelism(Long MaxParallelism) {
        this.MaxParallelism = MaxParallelism;
    }

    /**
     * Get <p>JobManager规格</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobManagerSpec <p>JobManager规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getJobManagerSpec() {
        return this.JobManagerSpec;
    }

    /**
     * Set <p>JobManager规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobManagerSpec <p>JobManager规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobManagerSpec(Float JobManagerSpec) {
        this.JobManagerSpec = JobManagerSpec;
    }

    /**
     * Get <p>TaskManager规格</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskManagerSpec <p>TaskManager规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTaskManagerSpec() {
        return this.TaskManagerSpec;
    }

    /**
     * Set <p>TaskManager规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskManagerSpec <p>TaskManager规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskManagerSpec(Float TaskManagerSpec) {
        this.TaskManagerSpec = TaskManagerSpec;
    }

    /**
     * Get <p>CLS日志集ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClsLogsetId <p>CLS日志集ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set <p>CLS日志集ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClsLogsetId <p>CLS日志集ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get <p>CLS日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClsTopicId <p>CLS日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set <p>CLS日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClsTopicId <p>CLS日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get <p>pyflink作业运行的python版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PythonVersion <p>pyflink作业运行的python版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPythonVersion() {
        return this.PythonVersion;
    }

    /**
     * Set <p>pyflink作业运行的python版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PythonVersion <p>pyflink作业运行的python版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPythonVersion(String PythonVersion) {
        this.PythonVersion = PythonVersion;
    }

    /**
     * Get <p>Oceanus 平台恢复作业开关 1:开启 -1: 关闭</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRecover <p>Oceanus 平台恢复作业开关 1:开启 -1: 关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRecover() {
        return this.AutoRecover;
    }

    /**
     * Set <p>Oceanus 平台恢复作业开关 1:开启 -1: 关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRecover <p>Oceanus 平台恢复作业开关 1:开启 -1: 关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRecover(Long AutoRecover) {
        this.AutoRecover = AutoRecover;
    }

    /**
     * Get <p>日志级别</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogLevel <p>日志级别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set <p>日志级别</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogLevel <p>日志级别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogLevel(String LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get <p>类日志级别</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClazzLevels <p>类日志级别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClazzLevel [] getClazzLevels() {
        return this.ClazzLevels;
    }

    /**
     * Set <p>类日志级别</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClazzLevels <p>类日志级别</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClazzLevels(ClazzLevel [] ClazzLevels) {
        this.ClazzLevels = ClazzLevels;
    }

    /**
     * Get <p>是否开启专家模式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpertModeOn <p>是否开启专家模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getExpertModeOn() {
        return this.ExpertModeOn;
    }

    /**
     * Set <p>是否开启专家模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpertModeOn <p>是否开启专家模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpertModeOn(Boolean ExpertModeOn) {
        this.ExpertModeOn = ExpertModeOn;
    }

    /**
     * Get <p>专家模式的配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpertModeConfiguration <p>专家模式的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExpertModeConfiguration getExpertModeConfiguration() {
        return this.ExpertModeConfiguration;
    }

    /**
     * Set <p>专家模式的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpertModeConfiguration <p>专家模式的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpertModeConfiguration(ExpertModeConfiguration ExpertModeConfiguration) {
        this.ExpertModeConfiguration = ExpertModeConfiguration;
    }

    /**
     * Get <p>trace链路</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TraceModeOn <p>trace链路</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTraceModeOn() {
        return this.TraceModeOn;
    }

    /**
     * Set <p>trace链路</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TraceModeOn <p>trace链路</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTraceModeOn(Boolean TraceModeOn) {
        this.TraceModeOn = TraceModeOn;
    }

    /**
     * Get <p>trace链路配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TraceModeConfiguration <p>trace链路配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TraceModeConfiguration getTraceModeConfiguration() {
        return this.TraceModeConfiguration;
    }

    /**
     * Set <p>trace链路配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TraceModeConfiguration <p>trace链路配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTraceModeConfiguration(TraceModeConfiguration TraceModeConfiguration) {
        this.TraceModeConfiguration = TraceModeConfiguration;
    }

    /**
     * Get <p>checkpoint保留个数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckpointRetainedNum <p>checkpoint保留个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckpointRetainedNum() {
        return this.CheckpointRetainedNum;
    }

    /**
     * Set <p>checkpoint保留个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckpointRetainedNum <p>checkpoint保留个数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckpointRetainedNum(Long CheckpointRetainedNum) {
        this.CheckpointRetainedNum = CheckpointRetainedNum;
    }

    /**
     * Get <p>算子拓扑图</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobGraph <p>算子拓扑图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobGraph getJobGraph() {
        return this.JobGraph;
    }

    /**
     * Set <p>算子拓扑图</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobGraph <p>算子拓扑图</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobGraph(JobGraph JobGraph) {
        this.JobGraph = JobGraph;
    }

    /**
     * Get <p>es索引</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsServerlessIndex <p>es索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsServerlessIndex() {
        return this.EsServerlessIndex;
    }

    /**
     * Set <p>es索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsServerlessIndex <p>es索引</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsServerlessIndex(String EsServerlessIndex) {
        this.EsServerlessIndex = EsServerlessIndex;
    }

    /**
     * Get <p>es空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsServerlessSpace <p>es空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEsServerlessSpace() {
        return this.EsServerlessSpace;
    }

    /**
     * Set <p>es空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsServerlessSpace <p>es空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsServerlessSpace(String EsServerlessSpace) {
        this.EsServerlessSpace = EsServerlessSpace;
    }

    /**
     * Get <p>es索引中文</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexName <p>es索引中文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>es索引中文</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexName <p>es索引中文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>es空间中文</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceName <p>es空间中文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspaceName() {
        return this.WorkspaceName;
    }

    /**
     * Set <p>es空间中文</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceName <p>es空间中文</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceName(String WorkspaceName) {
        this.WorkspaceName = WorkspaceName;
    }

    /**
     * Get <p>flink 版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlinkVersion <p>flink 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set <p>flink 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlinkVersion <p>flink 版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get <p>jdk版本</p> 
     * @return JdkVersion <p>jdk版本</p>
     */
    public String getJdkVersion() {
        return this.JdkVersion;
    }

    /**
     * Set <p>jdk版本</p>
     * @param JdkVersion <p>jdk版本</p>
     */
    public void setJdkVersion(String JdkVersion) {
        this.JdkVersion = JdkVersion;
    }

    /**
     * Get <p>jm使用cpu数目</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobManagerCpu <p>jm使用cpu数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getJobManagerCpu() {
        return this.JobManagerCpu;
    }

    /**
     * Set <p>jm使用cpu数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobManagerCpu <p>jm使用cpu数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobManagerCpu(Float JobManagerCpu) {
        this.JobManagerCpu = JobManagerCpu;
    }

    /**
     * Get <p>jm使用内存数目</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobManagerMem <p>jm使用内存数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getJobManagerMem() {
        return this.JobManagerMem;
    }

    /**
     * Set <p>jm使用内存数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobManagerMem <p>jm使用内存数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobManagerMem(Float JobManagerMem) {
        this.JobManagerMem = JobManagerMem;
    }

    /**
     * Get <p>tm使用cpu数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskManagerCpu <p>tm使用cpu数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTaskManagerCpu() {
        return this.TaskManagerCpu;
    }

    /**
     * Set <p>tm使用cpu数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskManagerCpu <p>tm使用cpu数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskManagerCpu(Float TaskManagerCpu) {
        this.TaskManagerCpu = TaskManagerCpu;
    }

    /**
     * Get <p>tm使用mem数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskManagerMem <p>tm使用mem数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTaskManagerMem() {
        return this.TaskManagerMem;
    }

    /**
     * Set <p>tm使用mem数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskManagerMem <p>tm使用mem数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskManagerMem(Float TaskManagerMem) {
        this.TaskManagerMem = TaskManagerMem;
    }

    /**
     * Get <p>运行中配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobConfigItem <p>运行中配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JobConfig getJobConfigItem() {
        return this.JobConfigItem;
    }

    /**
     * Set <p>运行中配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobConfigItem <p>运行中配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobConfigItem(JobConfig JobConfigItem) {
        this.JobConfigItem = JobConfigItem;
    }

    /**
     * Get <p>checkpoint 超时时间</p> 
     * @return CheckpointTimeoutSecond <p>checkpoint 超时时间</p>
     */
    public Long getCheckpointTimeoutSecond() {
        return this.CheckpointTimeoutSecond;
    }

    /**
     * Set <p>checkpoint 超时时间</p>
     * @param CheckpointTimeoutSecond <p>checkpoint 超时时间</p>
     */
    public void setCheckpointTimeoutSecond(Long CheckpointTimeoutSecond) {
        this.CheckpointTimeoutSecond = CheckpointTimeoutSecond;
    }

    /**
     * Get <p>checkpoint 间隔时间</p> 
     * @return CheckpointIntervalSecond <p>checkpoint 间隔时间</p>
     */
    public Long getCheckpointIntervalSecond() {
        return this.CheckpointIntervalSecond;
    }

    /**
     * Set <p>checkpoint 间隔时间</p>
     * @param CheckpointIntervalSecond <p>checkpoint 间隔时间</p>
     */
    public void setCheckpointIntervalSecond(Long CheckpointIntervalSecond) {
        this.CheckpointIntervalSecond = CheckpointIntervalSecond;
    }

    /**
     * Get <p>变量替换模式</p><p>枚举值：</p><ul><li>0： 表变量替换</li><li>1： 全局SQL变量替换</li></ul><p>默认值：0</p> 
     * @return VariableReplaceMode <p>变量替换模式</p><p>枚举值：</p><ul><li>0： 表变量替换</li><li>1： 全局SQL变量替换</li></ul><p>默认值：0</p>
     */
    public Long getVariableReplaceMode() {
        return this.VariableReplaceMode;
    }

    /**
     * Set <p>变量替换模式</p><p>枚举值：</p><ul><li>0： 表变量替换</li><li>1： 全局SQL变量替换</li></ul><p>默认值：0</p>
     * @param VariableReplaceMode <p>变量替换模式</p><p>枚举值：</p><ul><li>0： 表变量替换</li><li>1： 全局SQL变量替换</li></ul><p>默认值：0</p>
     */
    public void setVariableReplaceMode(Long VariableReplaceMode) {
        this.VariableReplaceMode = VariableReplaceMode;
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
        if (source.JdkVersion != null) {
            this.JdkVersion = new String(source.JdkVersion);
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
        if (source.VariableReplaceMode != null) {
            this.VariableReplaceMode = new Long(source.VariableReplaceMode);
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
        this.setParamSimple(map, prefix + "JdkVersion", this.JdkVersion);
        this.setParamSimple(map, prefix + "JobManagerCpu", this.JobManagerCpu);
        this.setParamSimple(map, prefix + "JobManagerMem", this.JobManagerMem);
        this.setParamSimple(map, prefix + "TaskManagerCpu", this.TaskManagerCpu);
        this.setParamSimple(map, prefix + "TaskManagerMem", this.TaskManagerMem);
        this.setParamObj(map, prefix + "JobConfigItem.", this.JobConfigItem);
        this.setParamSimple(map, prefix + "CheckpointTimeoutSecond", this.CheckpointTimeoutSecond);
        this.setParamSimple(map, prefix + "CheckpointIntervalSecond", this.CheckpointIntervalSecond);
        this.setParamSimple(map, prefix + "VariableReplaceMode", this.VariableReplaceMode);

    }
}

