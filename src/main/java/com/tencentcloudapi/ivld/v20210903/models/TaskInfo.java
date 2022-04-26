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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfo extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 描述任务名称，指定后可根据名称筛选
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 媒资文件ID
    */
    @SerializedName("MediaId")
    @Expose
    private String MediaId;

    /**
    * 任务执行状态
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long TaskStatus;

    /**
    * 任务进度，范围为[0，100]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskProgress")
    @Expose
    private Float TaskProgress;

    /**
    * 任务执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTimeCost")
    @Expose
    private Long TaskTimeCost;

    /**
    * 任务创建时间
    */
    @SerializedName("TaskCreateTime")
    @Expose
    private String TaskCreateTime;

    /**
    * 任务开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStartTime")
    @Expose
    private String TaskStartTime;

    /**
    * 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * 任务执行时指定的先验知识
    */
    @SerializedName("MediaPreknownInfo")
    @Expose
    private MediaPreknownInfo MediaPreknownInfo;

    /**
    * 媒资文件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * 媒资自定义标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 任务分析完成后的后调地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallbackURL")
    @Expose
    private String CallbackURL;

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
     * Get 描述任务名称，指定后可根据名称筛选
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 描述任务名称，指定后可根据名称筛选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 描述任务名称，指定后可根据名称筛选
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 描述任务名称，指定后可根据名称筛选
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 媒资文件ID 
     * @return MediaId 媒资文件ID
     */
    public String getMediaId() {
        return this.MediaId;
    }

    /**
     * Set 媒资文件ID
     * @param MediaId 媒资文件ID
     */
    public void setMediaId(String MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * Get 任务执行状态 
     * @return TaskStatus 任务执行状态
     */
    public Long getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务执行状态
     * @param TaskStatus 任务执行状态
     */
    public void setTaskStatus(Long TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务进度，范围为[0，100]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskProgress 任务进度，范围为[0，100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTaskProgress() {
        return this.TaskProgress;
    }

    /**
     * Set 任务进度，范围为[0，100]
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskProgress 任务进度，范围为[0，100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskProgress(Float TaskProgress) {
        this.TaskProgress = TaskProgress;
    }

    /**
     * Get 任务执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTimeCost 任务执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTimeCost() {
        return this.TaskTimeCost;
    }

    /**
     * Set 任务执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTimeCost 任务执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTimeCost(Long TaskTimeCost) {
        this.TaskTimeCost = TaskTimeCost;
    }

    /**
     * Get 任务创建时间 
     * @return TaskCreateTime 任务创建时间
     */
    public String getTaskCreateTime() {
        return this.TaskCreateTime;
    }

    /**
     * Set 任务创建时间
     * @param TaskCreateTime 任务创建时间
     */
    public void setTaskCreateTime(String TaskCreateTime) {
        this.TaskCreateTime = TaskCreateTime;
    }

    /**
     * Get 任务开始执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStartTime 任务开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStartTime() {
        return this.TaskStartTime;
    }

    /**
     * Set 任务开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStartTime 任务开始执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStartTime(String TaskStartTime) {
        this.TaskStartTime = TaskStartTime;
    }

    /**
     * Get 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedReason 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedReason 任务失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get 任务执行时指定的先验知识 
     * @return MediaPreknownInfo 任务执行时指定的先验知识
     */
    public MediaPreknownInfo getMediaPreknownInfo() {
        return this.MediaPreknownInfo;
    }

    /**
     * Set 任务执行时指定的先验知识
     * @param MediaPreknownInfo 任务执行时指定的先验知识
     */
    public void setMediaPreknownInfo(MediaPreknownInfo MediaPreknownInfo) {
        this.MediaPreknownInfo = MediaPreknownInfo;
    }

    /**
     * Get 媒资文件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaName 媒资文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set 媒资文件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaName 媒资文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get 媒资自定义标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 媒资自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 媒资自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 媒资自定义标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 任务分析完成后的后调地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallbackURL 任务分析完成后的后调地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallbackURL() {
        return this.CallbackURL;
    }

    /**
     * Set 任务分析完成后的后调地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallbackURL 任务分析完成后的后调地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallbackURL(String CallbackURL) {
        this.CallbackURL = CallbackURL;
    }

    public TaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfo(TaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.MediaId != null) {
            this.MediaId = new String(source.MediaId);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long(source.TaskStatus);
        }
        if (source.TaskProgress != null) {
            this.TaskProgress = new Float(source.TaskProgress);
        }
        if (source.TaskTimeCost != null) {
            this.TaskTimeCost = new Long(source.TaskTimeCost);
        }
        if (source.TaskCreateTime != null) {
            this.TaskCreateTime = new String(source.TaskCreateTime);
        }
        if (source.TaskStartTime != null) {
            this.TaskStartTime = new String(source.TaskStartTime);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.MediaPreknownInfo != null) {
            this.MediaPreknownInfo = new MediaPreknownInfo(source.MediaPreknownInfo);
        }
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.CallbackURL != null) {
            this.CallbackURL = new String(source.CallbackURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "MediaId", this.MediaId);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskProgress", this.TaskProgress);
        this.setParamSimple(map, prefix + "TaskTimeCost", this.TaskTimeCost);
        this.setParamSimple(map, prefix + "TaskCreateTime", this.TaskCreateTime);
        this.setParamSimple(map, prefix + "TaskStartTime", this.TaskStartTime);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamObj(map, prefix + "MediaPreknownInfo.", this.MediaPreknownInfo);
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "CallbackURL", this.CallbackURL);

    }
}

