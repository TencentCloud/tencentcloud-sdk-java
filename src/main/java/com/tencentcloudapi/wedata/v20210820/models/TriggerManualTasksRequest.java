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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerManualTasksRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 触发运行名称
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 运行范围 ENTIRE_WORKFLOW or SPECIFIED_TASK
    */
    @SerializedName("TriggerScope")
    @Expose
    private String TriggerScope;

    /**
    * 运行数据时间列表
    */
    @SerializedName("DataTimeList")
    @Expose
    private String [] DataTimeList;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 需要运行的任务列表
TriggerScope=ENTIRE_WORKFLOW 时无需传此参数，TriggerScope=SPECIFIED_TASK此参数必传
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 用户提交运行时指定的调度资源组，未指定时使用任务配置的调度资源组
    */
    @SerializedName("SchedulerResourceGroup")
    @Expose
    private String SchedulerResourceGroup;

    /**
    * 用户提交运行时指定的集成资源组，未指定时使用任务配置的集成资源组
    */
    @SerializedName("IntegrationResourceGroup")
    @Expose
    private String IntegrationResourceGroup;

    /**
    * 执行顺序 ASC、RAND、DESC
    */
    @SerializedName("ExecOrder")
    @Expose
    private String ExecOrder;

    /**
    * 自定义参数，最高优先级
    */
    @SerializedName("CustomParams")
    @Expose
    private KVPair [] CustomParams;

    /**
    * 页面反显使用，无业务含义
    */
    @SerializedName("ExtraParams")
    @Expose
    private String ExtraParams;

    /**
    * 实例时间的时区
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

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
     * Get 触发运行名称 
     * @return TriggerName 触发运行名称
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 触发运行名称
     * @param TriggerName 触发运行名称
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get 运行范围 ENTIRE_WORKFLOW or SPECIFIED_TASK 
     * @return TriggerScope 运行范围 ENTIRE_WORKFLOW or SPECIFIED_TASK
     */
    public String getTriggerScope() {
        return this.TriggerScope;
    }

    /**
     * Set 运行范围 ENTIRE_WORKFLOW or SPECIFIED_TASK
     * @param TriggerScope 运行范围 ENTIRE_WORKFLOW or SPECIFIED_TASK
     */
    public void setTriggerScope(String TriggerScope) {
        this.TriggerScope = TriggerScope;
    }

    /**
     * Get 运行数据时间列表 
     * @return DataTimeList 运行数据时间列表
     */
    public String [] getDataTimeList() {
        return this.DataTimeList;
    }

    /**
     * Set 运行数据时间列表
     * @param DataTimeList 运行数据时间列表
     */
    public void setDataTimeList(String [] DataTimeList) {
        this.DataTimeList = DataTimeList;
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
     * Get 需要运行的任务列表
TriggerScope=ENTIRE_WORKFLOW 时无需传此参数，TriggerScope=SPECIFIED_TASK此参数必传 
     * @return TaskIds 需要运行的任务列表
TriggerScope=ENTIRE_WORKFLOW 时无需传此参数，TriggerScope=SPECIFIED_TASK此参数必传
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 需要运行的任务列表
TriggerScope=ENTIRE_WORKFLOW 时无需传此参数，TriggerScope=SPECIFIED_TASK此参数必传
     * @param TaskIds 需要运行的任务列表
TriggerScope=ENTIRE_WORKFLOW 时无需传此参数，TriggerScope=SPECIFIED_TASK此参数必传
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 用户提交运行时指定的调度资源组，未指定时使用任务配置的调度资源组 
     * @return SchedulerResourceGroup 用户提交运行时指定的调度资源组，未指定时使用任务配置的调度资源组
     */
    public String getSchedulerResourceGroup() {
        return this.SchedulerResourceGroup;
    }

    /**
     * Set 用户提交运行时指定的调度资源组，未指定时使用任务配置的调度资源组
     * @param SchedulerResourceGroup 用户提交运行时指定的调度资源组，未指定时使用任务配置的调度资源组
     */
    public void setSchedulerResourceGroup(String SchedulerResourceGroup) {
        this.SchedulerResourceGroup = SchedulerResourceGroup;
    }

    /**
     * Get 用户提交运行时指定的集成资源组，未指定时使用任务配置的集成资源组 
     * @return IntegrationResourceGroup 用户提交运行时指定的集成资源组，未指定时使用任务配置的集成资源组
     */
    public String getIntegrationResourceGroup() {
        return this.IntegrationResourceGroup;
    }

    /**
     * Set 用户提交运行时指定的集成资源组，未指定时使用任务配置的集成资源组
     * @param IntegrationResourceGroup 用户提交运行时指定的集成资源组，未指定时使用任务配置的集成资源组
     */
    public void setIntegrationResourceGroup(String IntegrationResourceGroup) {
        this.IntegrationResourceGroup = IntegrationResourceGroup;
    }

    /**
     * Get 执行顺序 ASC、RAND、DESC 
     * @return ExecOrder 执行顺序 ASC、RAND、DESC
     */
    public String getExecOrder() {
        return this.ExecOrder;
    }

    /**
     * Set 执行顺序 ASC、RAND、DESC
     * @param ExecOrder 执行顺序 ASC、RAND、DESC
     */
    public void setExecOrder(String ExecOrder) {
        this.ExecOrder = ExecOrder;
    }

    /**
     * Get 自定义参数，最高优先级 
     * @return CustomParams 自定义参数，最高优先级
     */
    public KVPair [] getCustomParams() {
        return this.CustomParams;
    }

    /**
     * Set 自定义参数，最高优先级
     * @param CustomParams 自定义参数，最高优先级
     */
    public void setCustomParams(KVPair [] CustomParams) {
        this.CustomParams = CustomParams;
    }

    /**
     * Get 页面反显使用，无业务含义 
     * @return ExtraParams 页面反显使用，无业务含义
     */
    public String getExtraParams() {
        return this.ExtraParams;
    }

    /**
     * Set 页面反显使用，无业务含义
     * @param ExtraParams 页面反显使用，无业务含义
     */
    public void setExtraParams(String ExtraParams) {
        this.ExtraParams = ExtraParams;
    }

    /**
     * Get 实例时间的时区 
     * @return ScheduleTimeZone 实例时间的时区
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set 实例时间的时区
     * @param ScheduleTimeZone 实例时间的时区
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    public TriggerManualTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerManualTasksRequest(TriggerManualTasksRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.TriggerScope != null) {
            this.TriggerScope = new String(source.TriggerScope);
        }
        if (source.DataTimeList != null) {
            this.DataTimeList = new String[source.DataTimeList.length];
            for (int i = 0; i < source.DataTimeList.length; i++) {
                this.DataTimeList[i] = new String(source.DataTimeList[i]);
            }
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.SchedulerResourceGroup != null) {
            this.SchedulerResourceGroup = new String(source.SchedulerResourceGroup);
        }
        if (source.IntegrationResourceGroup != null) {
            this.IntegrationResourceGroup = new String(source.IntegrationResourceGroup);
        }
        if (source.ExecOrder != null) {
            this.ExecOrder = new String(source.ExecOrder);
        }
        if (source.CustomParams != null) {
            this.CustomParams = new KVPair[source.CustomParams.length];
            for (int i = 0; i < source.CustomParams.length; i++) {
                this.CustomParams[i] = new KVPair(source.CustomParams[i]);
            }
        }
        if (source.ExtraParams != null) {
            this.ExtraParams = new String(source.ExtraParams);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "TriggerScope", this.TriggerScope);
        this.setParamArraySimple(map, prefix + "DataTimeList.", this.DataTimeList);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamSimple(map, prefix + "SchedulerResourceGroup", this.SchedulerResourceGroup);
        this.setParamSimple(map, prefix + "IntegrationResourceGroup", this.IntegrationResourceGroup);
        this.setParamSimple(map, prefix + "ExecOrder", this.ExecOrder);
        this.setParamArrayObj(map, prefix + "CustomParams.", this.CustomParams);
        this.setParamSimple(map, prefix + "ExtraParams", this.ExtraParams);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);

    }
}

