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

public class DescribeBatchOperateTaskDTO extends AbstractModel{

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 工作流Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

    /**
    * 文件夹名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 是否提交
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Submit")
    @Expose
    private Long Submit;

    /**
    * 引擎：
presto\SparkJob\SparkSql
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创造时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 周期类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 调度计划
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 工作流Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 工作流名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeDesc 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeDesc() {
        return this.TaskTypeDesc;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeDesc 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
    }

    /**
     * Get 文件夹名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName 文件夹名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 文件夹名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName 文件夹名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 负责人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge 负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 负责人
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge 负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 是否提交
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Submit 是否提交
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubmit() {
        return this.Submit;
    }

    /**
     * Set 是否提交
注意：此字段可能返回 null，表示取不到有效值。
     * @param Submit 是否提交
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmit(Long Submit) {
        this.Submit = Submit;
    }

    /**
     * Get 引擎：
presto\SparkJob\SparkSql
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngine 引擎：
presto\SparkJob\SparkSql
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set 引擎：
presto\SparkJob\SparkSql
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngine 引擎：
presto\SparkJob\SparkSql
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创造时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创造时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创造时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创造时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 周期类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleUnit 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleUnit 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get 调度计划
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleDesc 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleDesc 调度计划
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    public DescribeBatchOperateTaskDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBatchOperateTaskDTO(DescribeBatchOperateTaskDTO source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.TaskTypeDesc != null) {
            this.TaskTypeDesc = new String(source.TaskTypeDesc);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.Submit != null) {
            this.Submit = new Long(source.Submit);
        }
        if (source.DataEngine != null) {
            this.DataEngine = new String(source.DataEngine);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new String(source.DatasourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TaskTypeDesc", this.TaskTypeDesc);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "Submit", this.Submit);
        this.setParamSimple(map, prefix + "DataEngine", this.DataEngine);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);

    }
}

