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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateJobConfigRequest extends AbstractModel{

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
    * 主类入参
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
     * Get 主类入参 
     * @return ProgramArgs 主类入参
     */
    public String getProgramArgs() {
        return this.ProgramArgs;
    }

    /**
     * Set 主类入参
     * @param ProgramArgs 主类入参
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

    }
}

