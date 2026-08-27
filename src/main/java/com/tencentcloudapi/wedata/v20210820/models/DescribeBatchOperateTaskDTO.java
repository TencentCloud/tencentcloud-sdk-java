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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBatchOperateTaskDTO extends AbstractModel {

    /**
    * <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>工作流Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>工作流名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeDesc")
    @Expose
    private String TaskTypeDesc;

    /**
    * <p>文件夹名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * <p>负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * <p>是否提交</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Submit")
    @Expose
    private Long Submit;

    /**
    * <p>引擎：<br>presto\SparkJob\SparkSql</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>创造时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>周期类型D天周期<br>H小时<br>Ccrontab类型<br>I分钟<br>O一次性<br>Y年<br>R用户驱动<br>W周<br>M月</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
    * <p>引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeResource")
    @Expose
    private String ComputeResource;

    /**
    * <p>dlc地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DlcRegion")
    @Expose
    private String DlcRegion;

    /**
    * <p>资源组或自定义</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsInherit")
    @Expose
    private String IsInherit;

    /**
    * <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
     * Get <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName <p>任务名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>工作流Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId <p>工作流Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId <p>工作流Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>工作流名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName <p>工作流名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>工作流名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName <p>工作流名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeDesc <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeDesc() {
        return this.TaskTypeDesc;
    }

    /**
     * Set <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeDesc <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeDesc(String TaskTypeDesc) {
        this.TaskTypeDesc = TaskTypeDesc;
    }

    /**
     * Get <p>文件夹名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName <p>文件夹名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set <p>文件夹名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName <p>文件夹名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get <p>负责人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge <p>负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set <p>负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge <p>负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get <p>是否提交</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Submit <p>是否提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubmit() {
        return this.Submit;
    }

    /**
     * Set <p>是否提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Submit <p>是否提交</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmit(Long Submit) {
        this.Submit = Submit;
    }

    /**
     * Get <p>引擎：<br>presto\SparkJob\SparkSql</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngine <p>引擎：<br>presto\SparkJob\SparkSql</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set <p>引擎：<br>presto\SparkJob\SparkSql</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngine <p>引擎：<br>presto\SparkJob\SparkSql</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>创造时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创造时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创造时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创造时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>周期类型D天周期<br>H小时<br>Ccrontab类型<br>I分钟<br>O一次性<br>Y年<br>R用户驱动<br>W周<br>M月</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleUnit <p>周期类型D天周期<br>H小时<br>Ccrontab类型<br>I分钟<br>O一次性<br>Y年<br>R用户驱动<br>W周<br>M月</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set <p>周期类型D天周期<br>H小时<br>Ccrontab类型<br>I分钟<br>O一次性<br>Y年<br>R用户驱动<br>W周<br>M月</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleUnit <p>周期类型D天周期<br>H小时<br>Ccrontab类型<br>I分钟<br>O一次性<br>Y年<br>R用户驱动<br>W周<br>M月</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleDesc <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleDesc <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId <p>数据源ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceType <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceType <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    /**
     * Get <p>引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputeResource <p>引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputeResource() {
        return this.ComputeResource;
    }

    /**
     * Set <p>引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeResource <p>引擎名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeResource(String ComputeResource) {
        this.ComputeResource = ComputeResource;
    }

    /**
     * Get <p>dlc地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DlcRegion <p>dlc地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDlcRegion() {
        return this.DlcRegion;
    }

    /**
     * Set <p>dlc地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DlcRegion <p>dlc地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDlcRegion(String DlcRegion) {
        this.DlcRegion = DlcRegion;
    }

    /**
     * Get <p>资源组或自定义</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsInherit <p>资源组或自定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set <p>资源组或自定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsInherit <p>资源组或自定义</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsInherit(String IsInherit) {
        this.IsInherit = IsInherit;
    }

    /**
     * Get <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Privilege <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Privilege <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
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
        if (source.ComputeResource != null) {
            this.ComputeResource = new String(source.ComputeResource);
        }
        if (source.DlcRegion != null) {
            this.DlcRegion = new String(source.DlcRegion);
        }
        if (source.IsInherit != null) {
            this.IsInherit = new String(source.IsInherit);
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
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
        this.setParamSimple(map, prefix + "ComputeResource", this.ComputeResource);
        this.setParamSimple(map, prefix + "DlcRegion", this.DlcRegion);
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);

    }
}

