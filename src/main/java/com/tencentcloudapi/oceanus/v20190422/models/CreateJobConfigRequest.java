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

public class CreateJobConfigRequest extends AbstractModel {

    /**
    * 作业Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 主类
    */
    @SerializedName("EntrypointClass")
    @Expose
    private String EntrypointClass;

    /**
    * 主类入参，需要区分下Sql作业配置，Jar作业配置，Python作业配置，具体参考下面的示例值
    */
    @SerializedName("ProgramArgs")
    @Expose
    private String ProgramArgs;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 资源引用数组
    */
    @SerializedName("ResourceRefs")
    @Expose
    private ResourceRef [] ResourceRefs;

    /**
    * 作业默认并行度
    */
    @SerializedName("DefaultParallelism")
    @Expose
    private Long DefaultParallelism;

    /**
    * 系统参数
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * 1: 作业配置达到上限之后，自动删除可删除的最早版本
    */
    @SerializedName("AutoDelete")
    @Expose
    private Long AutoDelete;

    /**
    * 作业使用的 COS 存储桶名
    */
    @SerializedName("COSBucket")
    @Expose
    private String COSBucket;

    /**
    * 是否采集作业日志
    */
    @SerializedName("LogCollect")
    @Expose
    private Boolean LogCollect;

    /**
    * JobManager规格
    */
    @SerializedName("JobManagerSpec")
    @Expose
    private Float JobManagerSpec;

    /**
    * TaskManager规格
    */
    @SerializedName("TaskManagerSpec")
    @Expose
    private Float TaskManagerSpec;

    /**
    * CLS日志集ID
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * CLS日志主题ID
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * 日志采集类型 2：CLS；3：COS
    */
    @SerializedName("LogCollectType")
    @Expose
    private Long LogCollectType;

    /**
    * pyflink作业运行时使用的python版本
    */
    @SerializedName("PythonVersion")
    @Expose
    private String PythonVersion;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * 日志级别
    */
    @SerializedName("LogLevel")
    @Expose
    private String LogLevel;

    /**
    * Oceanus 平台恢复作业开关 1:开启 -1: 关闭
    */
    @SerializedName("AutoRecover")
    @Expose
    private Long AutoRecover;

    /**
    * 类日志级别
    */
    @SerializedName("ClazzLevels")
    @Expose
    private ClazzLevel [] ClazzLevels;

    /**
    * 是否打开专家模式
    */
    @SerializedName("ExpertModeOn")
    @Expose
    private Boolean ExpertModeOn;

    /**
    * 专家模式的配置
    */
    @SerializedName("ExpertModeConfiguration")
    @Expose
    private ExpertModeConfiguration ExpertModeConfiguration;

    /**
    * trace链路
    */
    @SerializedName("TraceModeOn")
    @Expose
    private Boolean TraceModeOn;

    /**
    * trace链路配置
    */
    @SerializedName("TraceModeConfiguration")
    @Expose
    private TraceModeConfiguration TraceModeConfiguration;

    /**
    * checkpoint保留个数
    */
    @SerializedName("CheckpointRetainedNum")
    @Expose
    private Long CheckpointRetainedNum;

    /**
    * 算子拓扑图
    */
    @SerializedName("JobGraph")
    @Expose
    private JobGraph JobGraph;

    /**
    * es索引名称
    */
    @SerializedName("EsServerlessIndex")
    @Expose
    private String EsServerlessIndex;

    /**
    * es索引空间
    */
    @SerializedName("EsServerlessSpace")
    @Expose
    private String EsServerlessSpace;

    /**
    * flink版本
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * JobManager cpu
    */
    @SerializedName("JobManagerCpu")
    @Expose
    private Float JobManagerCpu;

    /**
    * JobManager 内存
    */
    @SerializedName("JobManagerMem")
    @Expose
    private Float JobManagerMem;

    /**
    * TaskManager cpu
    */
    @SerializedName("TaskManagerCpu")
    @Expose
    private Float TaskManagerCpu;

    /**
    * TaskManager 内存
    */
    @SerializedName("TaskManagerMem")
    @Expose
    private Float TaskManagerMem;

    /**
    * 0=默认使用老的 1=使用新的
    */
    @SerializedName("UseOldSystemConnector")
    @Expose
    private Long UseOldSystemConnector;

    /**
    * 压缩参数
    */
    @SerializedName("ProgramArgsAfterGzip")
    @Expose
    private String ProgramArgsAfterGzip;

    /**
    * checkpoint 超时时间
    */
    @SerializedName("CheckpointTimeoutSecond")
    @Expose
    private Long CheckpointTimeoutSecond;

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
     * @return EntrypointClass 主类
     */
    public String getEntrypointClass() {
        return this.EntrypointClass;
    }

    /**
     * Set 主类
     * @param EntrypointClass 主类
     */
    public void setEntrypointClass(String EntrypointClass) {
        this.EntrypointClass = EntrypointClass;
    }

    /**
     * Get 主类入参，需要区分下Sql作业配置，Jar作业配置，Python作业配置，具体参考下面的示例值 
     * @return ProgramArgs 主类入参，需要区分下Sql作业配置，Jar作业配置，Python作业配置，具体参考下面的示例值
     */
    public String getProgramArgs() {
        return this.ProgramArgs;
    }

    /**
     * Set 主类入参，需要区分下Sql作业配置，Jar作业配置，Python作业配置，具体参考下面的示例值
     * @param ProgramArgs 主类入参，需要区分下Sql作业配置，Jar作业配置，Python作业配置，具体参考下面的示例值
     */
    public void setProgramArgs(String ProgramArgs) {
        this.ProgramArgs = ProgramArgs;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 资源引用数组 
     * @return ResourceRefs 资源引用数组
     */
    public ResourceRef [] getResourceRefs() {
        return this.ResourceRefs;
    }

    /**
     * Set 资源引用数组
     * @param ResourceRefs 资源引用数组
     */
    public void setResourceRefs(ResourceRef [] ResourceRefs) {
        this.ResourceRefs = ResourceRefs;
    }

    /**
     * Get 作业默认并行度 
     * @return DefaultParallelism 作业默认并行度
     */
    public Long getDefaultParallelism() {
        return this.DefaultParallelism;
    }

    /**
     * Set 作业默认并行度
     * @param DefaultParallelism 作业默认并行度
     */
    public void setDefaultParallelism(Long DefaultParallelism) {
        this.DefaultParallelism = DefaultParallelism;
    }

    /**
     * Get 系统参数 
     * @return Properties 系统参数
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 系统参数
     * @param Properties 系统参数
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 1: 作业配置达到上限之后，自动删除可删除的最早版本 
     * @return AutoDelete 1: 作业配置达到上限之后，自动删除可删除的最早版本
     */
    public Long getAutoDelete() {
        return this.AutoDelete;
    }

    /**
     * Set 1: 作业配置达到上限之后，自动删除可删除的最早版本
     * @param AutoDelete 1: 作业配置达到上限之后，自动删除可删除的最早版本
     */
    public void setAutoDelete(Long AutoDelete) {
        this.AutoDelete = AutoDelete;
    }

    /**
     * Get 作业使用的 COS 存储桶名 
     * @return COSBucket 作业使用的 COS 存储桶名
     */
    public String getCOSBucket() {
        return this.COSBucket;
    }

    /**
     * Set 作业使用的 COS 存储桶名
     * @param COSBucket 作业使用的 COS 存储桶名
     */
    public void setCOSBucket(String COSBucket) {
        this.COSBucket = COSBucket;
    }

    /**
     * Get 是否采集作业日志 
     * @return LogCollect 是否采集作业日志
     */
    public Boolean getLogCollect() {
        return this.LogCollect;
    }

    /**
     * Set 是否采集作业日志
     * @param LogCollect 是否采集作业日志
     */
    public void setLogCollect(Boolean LogCollect) {
        this.LogCollect = LogCollect;
    }

    /**
     * Get JobManager规格 
     * @return JobManagerSpec JobManager规格
     */
    public Float getJobManagerSpec() {
        return this.JobManagerSpec;
    }

    /**
     * Set JobManager规格
     * @param JobManagerSpec JobManager规格
     */
    public void setJobManagerSpec(Float JobManagerSpec) {
        this.JobManagerSpec = JobManagerSpec;
    }

    /**
     * Get TaskManager规格 
     * @return TaskManagerSpec TaskManager规格
     */
    public Float getTaskManagerSpec() {
        return this.TaskManagerSpec;
    }

    /**
     * Set TaskManager规格
     * @param TaskManagerSpec TaskManager规格
     */
    public void setTaskManagerSpec(Float TaskManagerSpec) {
        this.TaskManagerSpec = TaskManagerSpec;
    }

    /**
     * Get CLS日志集ID 
     * @return ClsLogsetId CLS日志集ID
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set CLS日志集ID
     * @param ClsLogsetId CLS日志集ID
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get CLS日志主题ID 
     * @return ClsTopicId CLS日志主题ID
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set CLS日志主题ID
     * @param ClsTopicId CLS日志主题ID
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get 日志采集类型 2：CLS；3：COS 
     * @return LogCollectType 日志采集类型 2：CLS；3：COS
     */
    public Long getLogCollectType() {
        return this.LogCollectType;
    }

    /**
     * Set 日志采集类型 2：CLS；3：COS
     * @param LogCollectType 日志采集类型 2：CLS；3：COS
     */
    public void setLogCollectType(Long LogCollectType) {
        this.LogCollectType = LogCollectType;
    }

    /**
     * Get pyflink作业运行时使用的python版本 
     * @return PythonVersion pyflink作业运行时使用的python版本
     */
    public String getPythonVersion() {
        return this.PythonVersion;
    }

    /**
     * Set pyflink作业运行时使用的python版本
     * @param PythonVersion pyflink作业运行时使用的python版本
     */
    public void setPythonVersion(String PythonVersion) {
        this.PythonVersion = PythonVersion;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get 日志级别 
     * @return LogLevel 日志级别
     */
    public String getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set 日志级别
     * @param LogLevel 日志级别
     */
    public void setLogLevel(String LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get Oceanus 平台恢复作业开关 1:开启 -1: 关闭 
     * @return AutoRecover Oceanus 平台恢复作业开关 1:开启 -1: 关闭
     */
    public Long getAutoRecover() {
        return this.AutoRecover;
    }

    /**
     * Set Oceanus 平台恢复作业开关 1:开启 -1: 关闭
     * @param AutoRecover Oceanus 平台恢复作业开关 1:开启 -1: 关闭
     */
    public void setAutoRecover(Long AutoRecover) {
        this.AutoRecover = AutoRecover;
    }

    /**
     * Get 类日志级别 
     * @return ClazzLevels 类日志级别
     */
    public ClazzLevel [] getClazzLevels() {
        return this.ClazzLevels;
    }

    /**
     * Set 类日志级别
     * @param ClazzLevels 类日志级别
     */
    public void setClazzLevels(ClazzLevel [] ClazzLevels) {
        this.ClazzLevels = ClazzLevels;
    }

    /**
     * Get 是否打开专家模式 
     * @return ExpertModeOn 是否打开专家模式
     */
    public Boolean getExpertModeOn() {
        return this.ExpertModeOn;
    }

    /**
     * Set 是否打开专家模式
     * @param ExpertModeOn 是否打开专家模式
     */
    public void setExpertModeOn(Boolean ExpertModeOn) {
        this.ExpertModeOn = ExpertModeOn;
    }

    /**
     * Get 专家模式的配置 
     * @return ExpertModeConfiguration 专家模式的配置
     */
    public ExpertModeConfiguration getExpertModeConfiguration() {
        return this.ExpertModeConfiguration;
    }

    /**
     * Set 专家模式的配置
     * @param ExpertModeConfiguration 专家模式的配置
     */
    public void setExpertModeConfiguration(ExpertModeConfiguration ExpertModeConfiguration) {
        this.ExpertModeConfiguration = ExpertModeConfiguration;
    }

    /**
     * Get trace链路 
     * @return TraceModeOn trace链路
     */
    public Boolean getTraceModeOn() {
        return this.TraceModeOn;
    }

    /**
     * Set trace链路
     * @param TraceModeOn trace链路
     */
    public void setTraceModeOn(Boolean TraceModeOn) {
        this.TraceModeOn = TraceModeOn;
    }

    /**
     * Get trace链路配置 
     * @return TraceModeConfiguration trace链路配置
     */
    public TraceModeConfiguration getTraceModeConfiguration() {
        return this.TraceModeConfiguration;
    }

    /**
     * Set trace链路配置
     * @param TraceModeConfiguration trace链路配置
     */
    public void setTraceModeConfiguration(TraceModeConfiguration TraceModeConfiguration) {
        this.TraceModeConfiguration = TraceModeConfiguration;
    }

    /**
     * Get checkpoint保留个数 
     * @return CheckpointRetainedNum checkpoint保留个数
     */
    public Long getCheckpointRetainedNum() {
        return this.CheckpointRetainedNum;
    }

    /**
     * Set checkpoint保留个数
     * @param CheckpointRetainedNum checkpoint保留个数
     */
    public void setCheckpointRetainedNum(Long CheckpointRetainedNum) {
        this.CheckpointRetainedNum = CheckpointRetainedNum;
    }

    /**
     * Get 算子拓扑图 
     * @return JobGraph 算子拓扑图
     */
    public JobGraph getJobGraph() {
        return this.JobGraph;
    }

    /**
     * Set 算子拓扑图
     * @param JobGraph 算子拓扑图
     */
    public void setJobGraph(JobGraph JobGraph) {
        this.JobGraph = JobGraph;
    }

    /**
     * Get es索引名称 
     * @return EsServerlessIndex es索引名称
     */
    public String getEsServerlessIndex() {
        return this.EsServerlessIndex;
    }

    /**
     * Set es索引名称
     * @param EsServerlessIndex es索引名称
     */
    public void setEsServerlessIndex(String EsServerlessIndex) {
        this.EsServerlessIndex = EsServerlessIndex;
    }

    /**
     * Get es索引空间 
     * @return EsServerlessSpace es索引空间
     */
    public String getEsServerlessSpace() {
        return this.EsServerlessSpace;
    }

    /**
     * Set es索引空间
     * @param EsServerlessSpace es索引空间
     */
    public void setEsServerlessSpace(String EsServerlessSpace) {
        this.EsServerlessSpace = EsServerlessSpace;
    }

    /**
     * Get flink版本 
     * @return FlinkVersion flink版本
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set flink版本
     * @param FlinkVersion flink版本
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get JobManager cpu 
     * @return JobManagerCpu JobManager cpu
     */
    public Float getJobManagerCpu() {
        return this.JobManagerCpu;
    }

    /**
     * Set JobManager cpu
     * @param JobManagerCpu JobManager cpu
     */
    public void setJobManagerCpu(Float JobManagerCpu) {
        this.JobManagerCpu = JobManagerCpu;
    }

    /**
     * Get JobManager 内存 
     * @return JobManagerMem JobManager 内存
     */
    public Float getJobManagerMem() {
        return this.JobManagerMem;
    }

    /**
     * Set JobManager 内存
     * @param JobManagerMem JobManager 内存
     */
    public void setJobManagerMem(Float JobManagerMem) {
        this.JobManagerMem = JobManagerMem;
    }

    /**
     * Get TaskManager cpu 
     * @return TaskManagerCpu TaskManager cpu
     */
    public Float getTaskManagerCpu() {
        return this.TaskManagerCpu;
    }

    /**
     * Set TaskManager cpu
     * @param TaskManagerCpu TaskManager cpu
     */
    public void setTaskManagerCpu(Float TaskManagerCpu) {
        this.TaskManagerCpu = TaskManagerCpu;
    }

    /**
     * Get TaskManager 内存 
     * @return TaskManagerMem TaskManager 内存
     */
    public Float getTaskManagerMem() {
        return this.TaskManagerMem;
    }

    /**
     * Set TaskManager 内存
     * @param TaskManagerMem TaskManager 内存
     */
    public void setTaskManagerMem(Float TaskManagerMem) {
        this.TaskManagerMem = TaskManagerMem;
    }

    /**
     * Get 0=默认使用老的 1=使用新的 
     * @return UseOldSystemConnector 0=默认使用老的 1=使用新的
     */
    public Long getUseOldSystemConnector() {
        return this.UseOldSystemConnector;
    }

    /**
     * Set 0=默认使用老的 1=使用新的
     * @param UseOldSystemConnector 0=默认使用老的 1=使用新的
     */
    public void setUseOldSystemConnector(Long UseOldSystemConnector) {
        this.UseOldSystemConnector = UseOldSystemConnector;
    }

    /**
     * Get 压缩参数 
     * @return ProgramArgsAfterGzip 压缩参数
     */
    public String getProgramArgsAfterGzip() {
        return this.ProgramArgsAfterGzip;
    }

    /**
     * Set 压缩参数
     * @param ProgramArgsAfterGzip 压缩参数
     */
    public void setProgramArgsAfterGzip(String ProgramArgsAfterGzip) {
        this.ProgramArgsAfterGzip = ProgramArgsAfterGzip;
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

    public CreateJobConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateJobConfigRequest(CreateJobConfigRequest source) {
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
        if (source.ResourceRefs != null) {
            this.ResourceRefs = new ResourceRef[source.ResourceRefs.length];
            for (int i = 0; i < source.ResourceRefs.length; i++) {
                this.ResourceRefs[i] = new ResourceRef(source.ResourceRefs[i]);
            }
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
        if (source.AutoDelete != null) {
            this.AutoDelete = new Long(source.AutoDelete);
        }
        if (source.COSBucket != null) {
            this.COSBucket = new String(source.COSBucket);
        }
        if (source.LogCollect != null) {
            this.LogCollect = new Boolean(source.LogCollect);
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
        if (source.LogCollectType != null) {
            this.LogCollectType = new Long(source.LogCollectType);
        }
        if (source.PythonVersion != null) {
            this.PythonVersion = new String(source.PythonVersion);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new String(source.LogLevel);
        }
        if (source.AutoRecover != null) {
            this.AutoRecover = new Long(source.AutoRecover);
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
        if (source.UseOldSystemConnector != null) {
            this.UseOldSystemConnector = new Long(source.UseOldSystemConnector);
        }
        if (source.ProgramArgsAfterGzip != null) {
            this.ProgramArgsAfterGzip = new String(source.ProgramArgsAfterGzip);
        }
        if (source.CheckpointTimeoutSecond != null) {
            this.CheckpointTimeoutSecond = new Long(source.CheckpointTimeoutSecond);
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
        this.setParamArrayObj(map, prefix + "ResourceRefs.", this.ResourceRefs);
        this.setParamSimple(map, prefix + "DefaultParallelism", this.DefaultParallelism);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "AutoDelete", this.AutoDelete);
        this.setParamSimple(map, prefix + "COSBucket", this.COSBucket);
        this.setParamSimple(map, prefix + "LogCollect", this.LogCollect);
        this.setParamSimple(map, prefix + "JobManagerSpec", this.JobManagerSpec);
        this.setParamSimple(map, prefix + "TaskManagerSpec", this.TaskManagerSpec);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "LogCollectType", this.LogCollectType);
        this.setParamSimple(map, prefix + "PythonVersion", this.PythonVersion);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "AutoRecover", this.AutoRecover);
        this.setParamArrayObj(map, prefix + "ClazzLevels.", this.ClazzLevels);
        this.setParamSimple(map, prefix + "ExpertModeOn", this.ExpertModeOn);
        this.setParamObj(map, prefix + "ExpertModeConfiguration.", this.ExpertModeConfiguration);
        this.setParamSimple(map, prefix + "TraceModeOn", this.TraceModeOn);
        this.setParamObj(map, prefix + "TraceModeConfiguration.", this.TraceModeConfiguration);
        this.setParamSimple(map, prefix + "CheckpointRetainedNum", this.CheckpointRetainedNum);
        this.setParamObj(map, prefix + "JobGraph.", this.JobGraph);
        this.setParamSimple(map, prefix + "EsServerlessIndex", this.EsServerlessIndex);
        this.setParamSimple(map, prefix + "EsServerlessSpace", this.EsServerlessSpace);
        this.setParamSimple(map, prefix + "FlinkVersion", this.FlinkVersion);
        this.setParamSimple(map, prefix + "JobManagerCpu", this.JobManagerCpu);
        this.setParamSimple(map, prefix + "JobManagerMem", this.JobManagerMem);
        this.setParamSimple(map, prefix + "TaskManagerCpu", this.TaskManagerCpu);
        this.setParamSimple(map, prefix + "TaskManagerMem", this.TaskManagerMem);
        this.setParamSimple(map, prefix + "UseOldSystemConnector", this.UseOldSystemConnector);
        this.setParamSimple(map, prefix + "ProgramArgsAfterGzip", this.ProgramArgsAfterGzip);
        this.setParamSimple(map, prefix + "CheckpointTimeoutSecond", this.CheckpointTimeoutSecond);

    }
}

