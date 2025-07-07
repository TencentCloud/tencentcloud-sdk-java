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

public class DescribeTaskByStatusReportRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 时间类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 类型名称
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 聚合单元，H小时
    */
    @SerializedName("AggregationUnit")
    @Expose
    private String AggregationUnit;

    /**
    * 周期
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 责任人
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 项目ID列表，用于多项目实例趋势筛选，当指定了 ProjectIds 的时候，ProjectId 将只用来鉴权，不做筛选
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 时间类型 
     * @return Type 时间类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 时间类型
     * @param Type 时间类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 类型 
     * @return TaskType 类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 类型
     * @param TaskType 类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 类型名称 
     * @return TypeName 类型名称
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 类型名称
     * @param TypeName 类型名称
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 聚合单元，H小时 
     * @return AggregationUnit 聚合单元，H小时
     */
    public String getAggregationUnit() {
        return this.AggregationUnit;
    }

    /**
     * Set 聚合单元，H小时
     * @param AggregationUnit 聚合单元，H小时
     */
    public void setAggregationUnit(String AggregationUnit) {
        this.AggregationUnit = AggregationUnit;
    }

    /**
     * Get 周期 
     * @return CycleUnit 周期
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set 周期
     * @param CycleUnit 周期
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 责任人 
     * @return InCharge 责任人
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 责任人
     * @param InCharge 责任人
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 工作流ID 
     * @return WorkflowId 工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
     * @param WorkflowId 工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 项目ID列表，用于多项目实例趋势筛选，当指定了 ProjectIds 的时候，ProjectId 将只用来鉴权，不做筛选 
     * @return ProjectIds 项目ID列表，用于多项目实例趋势筛选，当指定了 ProjectIds 的时候，ProjectId 将只用来鉴权，不做筛选
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID列表，用于多项目实例趋势筛选，当指定了 ProjectIds 的时候，ProjectId 将只用来鉴权，不做筛选
     * @param ProjectIds 项目ID列表，用于多项目实例趋势筛选，当指定了 ProjectIds 的时候，ProjectId 将只用来鉴权，不做筛选
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    public DescribeTaskByStatusReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskByStatusReportRequest(DescribeTaskByStatusReportRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AggregationUnit != null) {
            this.AggregationUnit = new String(source.AggregationUnit);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AggregationUnit", this.AggregationUnit);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);

    }
}

