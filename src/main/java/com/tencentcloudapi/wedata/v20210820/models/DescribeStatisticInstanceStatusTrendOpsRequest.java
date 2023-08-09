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

public class DescribeStatisticInstanceStatusTrendOpsRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务类型Id
    */
    @SerializedName("TaskTypeId")
    @Expose
    private String TaskTypeId;

    /**
    * 时间类型
    */
    @SerializedName("TimeType")
    @Expose
    private String TimeType;

    /**
    * 任务类型名称
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
    * 资源组ID
    */
    @SerializedName("ExecutionGroupId")
    @Expose
    private String ExecutionGroupId;

    /**
    * 资源组名称
    */
    @SerializedName("ExecutionGroupName")
    @Expose
    private String ExecutionGroupName;

    /**
    * 1
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 1
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 1
    */
    @SerializedName("StateList")
    @Expose
    private Long [] StateList;

    /**
    * D代表天，H代表小时
    */
    @SerializedName("AggregationUnit")
    @Expose
    private String AggregationUnit;

    /**
    * 1
    */
    @SerializedName("AverageWindowSize")
    @Expose
    private Long AverageWindowSize;

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
     * Get 任务类型Id 
     * @return TaskTypeId 任务类型Id
     */
    public String getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务类型Id
     * @param TaskTypeId 任务类型Id
     */
    public void setTaskTypeId(String TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 时间类型 
     * @return TimeType 时间类型
     */
    public String getTimeType() {
        return this.TimeType;
    }

    /**
     * Set 时间类型
     * @param TimeType 时间类型
     */
    public void setTimeType(String TimeType) {
        this.TimeType = TimeType;
    }

    /**
     * Get 任务类型名称 
     * @return TypeName 任务类型名称
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 任务类型名称
     * @param TypeName 任务类型名称
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
     * Get 资源组ID 
     * @return ExecutionGroupId 资源组ID
     */
    public String getExecutionGroupId() {
        return this.ExecutionGroupId;
    }

    /**
     * Set 资源组ID
     * @param ExecutionGroupId 资源组ID
     */
    public void setExecutionGroupId(String ExecutionGroupId) {
        this.ExecutionGroupId = ExecutionGroupId;
    }

    /**
     * Get 资源组名称 
     * @return ExecutionGroupName 资源组名称
     */
    public String getExecutionGroupName() {
        return this.ExecutionGroupName;
    }

    /**
     * Set 资源组名称
     * @param ExecutionGroupName 资源组名称
     */
    public void setExecutionGroupName(String ExecutionGroupName) {
        this.ExecutionGroupName = ExecutionGroupName;
    }

    /**
     * Get 1 
     * @return InCharge 1
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 1
     * @param InCharge 1
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 1 
     * @return TaskType 1
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 1
     * @param TaskType 1
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 1 
     * @return StateList 1
     */
    public Long [] getStateList() {
        return this.StateList;
    }

    /**
     * Set 1
     * @param StateList 1
     */
    public void setStateList(Long [] StateList) {
        this.StateList = StateList;
    }

    /**
     * Get D代表天，H代表小时 
     * @return AggregationUnit D代表天，H代表小时
     */
    public String getAggregationUnit() {
        return this.AggregationUnit;
    }

    /**
     * Set D代表天，H代表小时
     * @param AggregationUnit D代表天，H代表小时
     */
    public void setAggregationUnit(String AggregationUnit) {
        this.AggregationUnit = AggregationUnit;
    }

    /**
     * Get 1 
     * @return AverageWindowSize 1
     */
    public Long getAverageWindowSize() {
        return this.AverageWindowSize;
    }

    /**
     * Set 1
     * @param AverageWindowSize 1
     */
    public void setAverageWindowSize(Long AverageWindowSize) {
        this.AverageWindowSize = AverageWindowSize;
    }

    public DescribeStatisticInstanceStatusTrendOpsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStatisticInstanceStatusTrendOpsRequest(DescribeStatisticInstanceStatusTrendOpsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new String(source.TaskTypeId);
        }
        if (source.TimeType != null) {
            this.TimeType = new String(source.TimeType);
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
        if (source.ExecutionGroupId != null) {
            this.ExecutionGroupId = new String(source.ExecutionGroupId);
        }
        if (source.ExecutionGroupName != null) {
            this.ExecutionGroupName = new String(source.ExecutionGroupName);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.StateList != null) {
            this.StateList = new Long[source.StateList.length];
            for (int i = 0; i < source.StateList.length; i++) {
                this.StateList[i] = new Long(source.StateList[i]);
            }
        }
        if (source.AggregationUnit != null) {
            this.AggregationUnit = new String(source.AggregationUnit);
        }
        if (source.AverageWindowSize != null) {
            this.AverageWindowSize = new Long(source.AverageWindowSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "TimeType", this.TimeType);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ExecutionGroupId", this.ExecutionGroupId);
        this.setParamSimple(map, prefix + "ExecutionGroupName", this.ExecutionGroupName);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "StateList.", this.StateList);
        this.setParamSimple(map, prefix + "AggregationUnit", this.AggregationUnit);
        this.setParamSimple(map, prefix + "AverageWindowSize", this.AverageWindowSize);

    }
}

