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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportTaskInfo extends AbstractModel{

    /**
    * 导出任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExportTaskId")
    @Expose
    private Long ExportTaskId;

    /**
    * 导出任务类型(1.全部,2.触发行,3.通过行)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 任务创建人 id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorId")
    @Expose
    private Long OperatorId;

    /**
    * 任务创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 导出状态(1.已提交 2.导出中 3.导出成功 4.导出失败)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 调度任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerTaskId")
    @Expose
    private String SchedulerTaskId;

    /**
    * 调度时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerCurRunDate")
    @Expose
    private String SchedulerCurRunDate;

    /**
    * 文件相对路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
     * Get 导出任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExportTaskId 导出任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExportTaskId() {
        return this.ExportTaskId;
    }

    /**
     * Set 导出任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExportTaskId 导出任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExportTaskId(Long ExportTaskId) {
        this.ExportTaskId = ExportTaskId;
    }

    /**
     * Get 导出任务类型(1.全部,2.触发行,3.通过行)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 导出任务类型(1.全部,2.触发行,3.通过行)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 导出任务类型(1.全部,2.触发行,3.通过行)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 导出任务类型(1.全部,2.触发行,3.通过行)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务创建人 id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorId 任务创建人 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set 任务创建人 id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorId 任务创建人 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorId(Long OperatorId) {
        this.OperatorId = OperatorId;
    }

    /**
     * Get 任务创建人昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorName 任务创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 任务创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorName 任务创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
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
     * Get 导出状态(1.已提交 2.导出中 3.导出成功 4.导出失败)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 导出状态(1.已提交 2.导出中 3.导出成功 4.导出失败)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 导出状态(1.已提交 2.导出中 3.导出成功 4.导出失败)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 导出状态(1.已提交 2.导出中 3.导出成功 4.导出失败)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 调度任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerTaskId 调度任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerTaskId() {
        return this.SchedulerTaskId;
    }

    /**
     * Set 调度任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerTaskId 调度任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerTaskId(String SchedulerTaskId) {
        this.SchedulerTaskId = SchedulerTaskId;
    }

    /**
     * Get 调度时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerCurRunDate 调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerCurRunDate() {
        return this.SchedulerCurRunDate;
    }

    /**
     * Set 调度时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerCurRunDate 调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerCurRunDate(String SchedulerCurRunDate) {
        this.SchedulerCurRunDate = SchedulerCurRunDate;
    }

    /**
     * Get 文件相对路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilePath 文件相对路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件相对路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilePath 文件相对路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    public ExportTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportTaskInfo(ExportTaskInfo source) {
        if (source.ExportTaskId != null) {
            this.ExportTaskId = new Long(source.ExportTaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.OperatorId != null) {
            this.OperatorId = new Long(source.OperatorId);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SchedulerTaskId != null) {
            this.SchedulerTaskId = new String(source.SchedulerTaskId);
        }
        if (source.SchedulerCurRunDate != null) {
            this.SchedulerCurRunDate = new String(source.SchedulerCurRunDate);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExportTaskId", this.ExportTaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "OperatorId", this.OperatorId);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SchedulerTaskId", this.SchedulerTaskId);
        this.setParamSimple(map, prefix + "SchedulerCurRunDate", this.SchedulerCurRunDate);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);

    }
}

