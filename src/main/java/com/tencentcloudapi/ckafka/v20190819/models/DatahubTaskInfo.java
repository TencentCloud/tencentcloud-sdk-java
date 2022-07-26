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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatahubTaskInfo extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务类型，SOURCE数据接入，SINK数据流出
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 数据源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceResource")
    @Expose
    private DatahubResource SourceResource;

    /**
    * 数据目标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetResource")
    @Expose
    private DatahubResource TargetResource;

    /**
    * 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 创建进度百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskProgress")
    @Expose
    private Float TaskProgress;

    /**
    * 任务当前处于的步骤
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskCurrentStep")
    @Expose
    private String TaskCurrentStep;

    /**
    * Datahub转储Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatahubId")
    @Expose
    private String DatahubId;

    /**
    * 步骤列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StepList")
    @Expose
    private String [] StepList;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务类型，SOURCE数据接入，SINK数据流出 
     * @return TaskType 任务类型，SOURCE数据接入，SINK数据流出
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，SOURCE数据接入，SINK数据流出
     * @param TaskType 任务类型，SOURCE数据接入，SINK数据流出
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败 
     * @return Status 状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败
     * @param Status 状态，-1创建失败，0创建中，1运行中，2删除中，3已删除，4删除失败，5暂停中，6已暂停，7暂停失败，8恢复中，9恢复失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 数据源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceResource 数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatahubResource getSourceResource() {
        return this.SourceResource;
    }

    /**
     * Set 数据源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceResource 数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceResource(DatahubResource SourceResource) {
        this.SourceResource = SourceResource;
    }

    /**
     * Get 数据目标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetResource 数据目标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatahubResource getTargetResource() {
        return this.TargetResource;
    }

    /**
     * Set 数据目标
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetResource 数据目标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetResource(DatahubResource TargetResource) {
        this.TargetResource = TargetResource;
    }

    /**
     * Get 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 创建进度百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskProgress 创建进度百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTaskProgress() {
        return this.TaskProgress;
    }

    /**
     * Set 创建进度百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskProgress 创建进度百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskProgress(Float TaskProgress) {
        this.TaskProgress = TaskProgress;
    }

    /**
     * Get 任务当前处于的步骤
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskCurrentStep 任务当前处于的步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskCurrentStep() {
        return this.TaskCurrentStep;
    }

    /**
     * Set 任务当前处于的步骤
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskCurrentStep 任务当前处于的步骤
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskCurrentStep(String TaskCurrentStep) {
        this.TaskCurrentStep = TaskCurrentStep;
    }

    /**
     * Get Datahub转储Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatahubId Datahub转储Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatahubId() {
        return this.DatahubId;
    }

    /**
     * Set Datahub转储Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatahubId Datahub转储Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatahubId(String DatahubId) {
        this.DatahubId = DatahubId;
    }

    /**
     * Get 步骤列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StepList 步骤列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getStepList() {
        return this.StepList;
    }

    /**
     * Set 步骤列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param StepList 步骤列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStepList(String [] StepList) {
        this.StepList = StepList;
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

    }
}

