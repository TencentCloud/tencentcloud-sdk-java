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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatahubTaskInfo extends AbstractModel {

    /**
    * <p>任务Id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务类型，SOURCE数据接入，SINK数据流出</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>数据源</p>
    */
    @SerializedName("SourceResource")
    @Expose
    private DatahubResource SourceResource;

    /**
    * <p>数据目标</p>
    */
    @SerializedName("TargetResource")
    @Expose
    private DatahubResource TargetResource;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>异常信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>创建进度百分比</p>
    */
    @SerializedName("TaskProgress")
    @Expose
    private Float TaskProgress;

    /**
    * <p>任务当前处于的步骤</p>
    */
    @SerializedName("TaskCurrentStep")
    @Expose
    private String TaskCurrentStep;

    /**
    * <p>Datahub转储Id</p>
    */
    @SerializedName("DatahubId")
    @Expose
    private String DatahubId;

    /**
    * <p>步骤列表</p>
    */
    @SerializedName("StepList")
    @Expose
    private String [] StepList;

    /**
    * <p>任务描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>任务并发数</p><p>默认值：1</p>
    */
    @SerializedName("TaskMax")
    @Expose
    private Long TaskMax;

    /**
    * <p>任务同步限流值,单位MB/s</p><p>默认值：20MB/s</p>
    */
    @SerializedName("SyncThrottleLimit")
    @Expose
    private Long SyncThrottleLimit;

    /**
    * <p>任务是否自动扩容标识</p><p>枚举值：</p><ul><li>true： 自动扩容</li><li>false： 手动扩容</li></ul><p>默认值：true</p>
    */
    @SerializedName("AutoExpandFlag")
    @Expose
    private Boolean AutoExpandFlag;

    /**
     * Get <p>任务Id</p> 
     * @return TaskId <p>任务Id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务Id</p>
     * @param TaskId <p>任务Id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务类型，SOURCE数据接入，SINK数据流出</p> 
     * @return TaskType <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     * @param TaskType <p>任务类型，SOURCE数据接入，SINK数据流出</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败</p> 
     * @return Status <p>状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败</p>
     * @param Status <p>状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据源</p> 
     * @return SourceResource <p>数据源</p>
     */
    public DatahubResource getSourceResource() {
        return this.SourceResource;
    }

    /**
     * Set <p>数据源</p>
     * @param SourceResource <p>数据源</p>
     */
    public void setSourceResource(DatahubResource SourceResource) {
        this.SourceResource = SourceResource;
    }

    /**
     * Get <p>数据目标</p> 
     * @return TargetResource <p>数据目标</p>
     */
    public DatahubResource getTargetResource() {
        return this.TargetResource;
    }

    /**
     * Set <p>数据目标</p>
     * @param TargetResource <p>数据目标</p>
     */
    public void setTargetResource(DatahubResource TargetResource) {
        this.TargetResource = TargetResource;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return CreateTime <p>任务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param CreateTime <p>任务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>异常信息</p> 
     * @return ErrorMessage <p>异常信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>异常信息</p>
     * @param ErrorMessage <p>异常信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>创建进度百分比</p> 
     * @return TaskProgress <p>创建进度百分比</p>
     */
    public Float getTaskProgress() {
        return this.TaskProgress;
    }

    /**
     * Set <p>创建进度百分比</p>
     * @param TaskProgress <p>创建进度百分比</p>
     */
    public void setTaskProgress(Float TaskProgress) {
        this.TaskProgress = TaskProgress;
    }

    /**
     * Get <p>任务当前处于的步骤</p> 
     * @return TaskCurrentStep <p>任务当前处于的步骤</p>
     */
    public String getTaskCurrentStep() {
        return this.TaskCurrentStep;
    }

    /**
     * Set <p>任务当前处于的步骤</p>
     * @param TaskCurrentStep <p>任务当前处于的步骤</p>
     */
    public void setTaskCurrentStep(String TaskCurrentStep) {
        this.TaskCurrentStep = TaskCurrentStep;
    }

    /**
     * Get <p>Datahub转储Id</p> 
     * @return DatahubId <p>Datahub转储Id</p>
     */
    public String getDatahubId() {
        return this.DatahubId;
    }

    /**
     * Set <p>Datahub转储Id</p>
     * @param DatahubId <p>Datahub转储Id</p>
     */
    public void setDatahubId(String DatahubId) {
        this.DatahubId = DatahubId;
    }

    /**
     * Get <p>步骤列表</p> 
     * @return StepList <p>步骤列表</p>
     */
    public String [] getStepList() {
        return this.StepList;
    }

    /**
     * Set <p>步骤列表</p>
     * @param StepList <p>步骤列表</p>
     */
    public void setStepList(String [] StepList) {
        this.StepList = StepList;
    }

    /**
     * Get <p>任务描述信息</p> 
     * @return Description <p>任务描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述信息</p>
     * @param Description <p>任务描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>任务并发数</p><p>默认值：1</p> 
     * @return TaskMax <p>任务并发数</p><p>默认值：1</p>
     */
    public Long getTaskMax() {
        return this.TaskMax;
    }

    /**
     * Set <p>任务并发数</p><p>默认值：1</p>
     * @param TaskMax <p>任务并发数</p><p>默认值：1</p>
     */
    public void setTaskMax(Long TaskMax) {
        this.TaskMax = TaskMax;
    }

    /**
     * Get <p>任务同步限流值,单位MB/s</p><p>默认值：20MB/s</p> 
     * @return SyncThrottleLimit <p>任务同步限流值,单位MB/s</p><p>默认值：20MB/s</p>
     */
    public Long getSyncThrottleLimit() {
        return this.SyncThrottleLimit;
    }

    /**
     * Set <p>任务同步限流值,单位MB/s</p><p>默认值：20MB/s</p>
     * @param SyncThrottleLimit <p>任务同步限流值,单位MB/s</p><p>默认值：20MB/s</p>
     */
    public void setSyncThrottleLimit(Long SyncThrottleLimit) {
        this.SyncThrottleLimit = SyncThrottleLimit;
    }

    /**
     * Get <p>任务是否自动扩容标识</p><p>枚举值：</p><ul><li>true： 自动扩容</li><li>false： 手动扩容</li></ul><p>默认值：true</p> 
     * @return AutoExpandFlag <p>任务是否自动扩容标识</p><p>枚举值：</p><ul><li>true： 自动扩容</li><li>false： 手动扩容</li></ul><p>默认值：true</p>
     */
    public Boolean getAutoExpandFlag() {
        return this.AutoExpandFlag;
    }

    /**
     * Set <p>任务是否自动扩容标识</p><p>枚举值：</p><ul><li>true： 自动扩容</li><li>false： 手动扩容</li></ul><p>默认值：true</p>
     * @param AutoExpandFlag <p>任务是否自动扩容标识</p><p>枚举值：</p><ul><li>true： 自动扩容</li><li>false： 手动扩容</li></ul><p>默认值：true</p>
     */
    public void setAutoExpandFlag(Boolean AutoExpandFlag) {
        this.AutoExpandFlag = AutoExpandFlag;
    }

    public DatahubTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatahubTaskInfo(DatahubTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SourceResource != null) {
            this.SourceResource = new DatahubResource(source.SourceResource);
        }
        if (source.TargetResource != null) {
            this.TargetResource = new DatahubResource(source.TargetResource);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.TaskProgress != null) {
            this.TaskProgress = new Float(source.TaskProgress);
        }
        if (source.TaskCurrentStep != null) {
            this.TaskCurrentStep = new String(source.TaskCurrentStep);
        }
        if (source.DatahubId != null) {
            this.DatahubId = new String(source.DatahubId);
        }
        if (source.StepList != null) {
            this.StepList = new String[source.StepList.length];
            for (int i = 0; i < source.StepList.length; i++) {
                this.StepList[i] = new String(source.StepList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TaskMax != null) {
            this.TaskMax = new Long(source.TaskMax);
        }
        if (source.SyncThrottleLimit != null) {
            this.SyncThrottleLimit = new Long(source.SyncThrottleLimit);
        }
        if (source.AutoExpandFlag != null) {
            this.AutoExpandFlag = new Boolean(source.AutoExpandFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "SourceResource.", this.SourceResource);
        this.setParamObj(map, prefix + "TargetResource.", this.TargetResource);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "TaskProgress", this.TaskProgress);
        this.setParamSimple(map, prefix + "TaskCurrentStep", this.TaskCurrentStep);
        this.setParamSimple(map, prefix + "DatahubId", this.DatahubId);
        this.setParamArraySimple(map, prefix + "StepList.", this.StepList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TaskMax", this.TaskMax);
        this.setParamSimple(map, prefix + "SyncThrottleLimit", this.SyncThrottleLimit);
        this.setParamSimple(map, prefix + "AutoExpandFlag", this.AutoExpandFlag);

    }
}

