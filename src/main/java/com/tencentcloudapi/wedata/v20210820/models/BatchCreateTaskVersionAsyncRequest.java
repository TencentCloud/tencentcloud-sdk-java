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

public class BatchCreateTaskVersionAsyncRequest extends AbstractModel {

    /**
    * <p>任务信息</p>
    */
    @SerializedName("Tasks")
    @Expose
    private BatchCreateTaskVersionDTO [] Tasks;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>是否自动运行</p>
    */
    @SerializedName("AutoRun")
    @Expose
    private Boolean AutoRun;

    /**
    * <p>告警方式:email-邮件;sms-短信;wecom-企业微信</p>
    */
    @SerializedName("AlarmWays")
    @Expose
    private String AlarmWays;

    /**
    * <p>告警对象:1-项目管理员，2-任务责任人</p>
    */
    @SerializedName("AlarmRecipientTypes")
    @Expose
    private String AlarmRecipientTypes;

    /**
    * <p>是否需要校验父任务已经提交到调度</p>
    */
    @SerializedName("NeedCheckParentSubmitted")
    @Expose
    private Boolean NeedCheckParentSubmitted;

    /**
    * <p>是否需要补录中间实例</p>
    */
    @SerializedName("EnableMakeUp")
    @Expose
    private Boolean EnableMakeUp;

    /**
    * <p>指定审批人列表</p>
    */
    @SerializedName("AssignApprovalList")
    @Expose
    private String [] AssignApprovalList;

    /**
    * <p>任务缺失实例处理策略</p><p>MAKEUP:补录缺失的实例;FORCE_SUCCESS:将缺失的实例置成功;SKIP:不处理，忽略缺失的实例</p>
    */
    @SerializedName("PerTaskMissingInstanceStrategy")
    @Expose
    private TaskMissingInstanceStrategy [] PerTaskMissingInstanceStrategy;

    /**
     * Get <p>任务信息</p> 
     * @return Tasks <p>任务信息</p>
     */
    public BatchCreateTaskVersionDTO [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务信息</p>
     * @param Tasks <p>任务信息</p>
     */
    public void setTasks(BatchCreateTaskVersionDTO [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>是否自动运行</p> 
     * @return AutoRun <p>是否自动运行</p>
     */
    public Boolean getAutoRun() {
        return this.AutoRun;
    }

    /**
     * Set <p>是否自动运行</p>
     * @param AutoRun <p>是否自动运行</p>
     */
    public void setAutoRun(Boolean AutoRun) {
        this.AutoRun = AutoRun;
    }

    /**
     * Get <p>告警方式:email-邮件;sms-短信;wecom-企业微信</p> 
     * @return AlarmWays <p>告警方式:email-邮件;sms-短信;wecom-企业微信</p>
     */
    public String getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set <p>告警方式:email-邮件;sms-短信;wecom-企业微信</p>
     * @param AlarmWays <p>告警方式:email-邮件;sms-短信;wecom-企业微信</p>
     */
    public void setAlarmWays(String AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get <p>告警对象:1-项目管理员，2-任务责任人</p> 
     * @return AlarmRecipientTypes <p>告警对象:1-项目管理员，2-任务责任人</p>
     */
    public String getAlarmRecipientTypes() {
        return this.AlarmRecipientTypes;
    }

    /**
     * Set <p>告警对象:1-项目管理员，2-任务责任人</p>
     * @param AlarmRecipientTypes <p>告警对象:1-项目管理员，2-任务责任人</p>
     */
    public void setAlarmRecipientTypes(String AlarmRecipientTypes) {
        this.AlarmRecipientTypes = AlarmRecipientTypes;
    }

    /**
     * Get <p>是否需要校验父任务已经提交到调度</p> 
     * @return NeedCheckParentSubmitted <p>是否需要校验父任务已经提交到调度</p>
     */
    public Boolean getNeedCheckParentSubmitted() {
        return this.NeedCheckParentSubmitted;
    }

    /**
     * Set <p>是否需要校验父任务已经提交到调度</p>
     * @param NeedCheckParentSubmitted <p>是否需要校验父任务已经提交到调度</p>
     */
    public void setNeedCheckParentSubmitted(Boolean NeedCheckParentSubmitted) {
        this.NeedCheckParentSubmitted = NeedCheckParentSubmitted;
    }

    /**
     * Get <p>是否需要补录中间实例</p> 
     * @return EnableMakeUp <p>是否需要补录中间实例</p>
     */
    public Boolean getEnableMakeUp() {
        return this.EnableMakeUp;
    }

    /**
     * Set <p>是否需要补录中间实例</p>
     * @param EnableMakeUp <p>是否需要补录中间实例</p>
     */
    public void setEnableMakeUp(Boolean EnableMakeUp) {
        this.EnableMakeUp = EnableMakeUp;
    }

    /**
     * Get <p>指定审批人列表</p> 
     * @return AssignApprovalList <p>指定审批人列表</p>
     */
    public String [] getAssignApprovalList() {
        return this.AssignApprovalList;
    }

    /**
     * Set <p>指定审批人列表</p>
     * @param AssignApprovalList <p>指定审批人列表</p>
     */
    public void setAssignApprovalList(String [] AssignApprovalList) {
        this.AssignApprovalList = AssignApprovalList;
    }

    /**
     * Get <p>任务缺失实例处理策略</p><p>MAKEUP:补录缺失的实例;FORCE_SUCCESS:将缺失的实例置成功;SKIP:不处理，忽略缺失的实例</p> 
     * @return PerTaskMissingInstanceStrategy <p>任务缺失实例处理策略</p><p>MAKEUP:补录缺失的实例;FORCE_SUCCESS:将缺失的实例置成功;SKIP:不处理，忽略缺失的实例</p>
     */
    public TaskMissingInstanceStrategy [] getPerTaskMissingInstanceStrategy() {
        return this.PerTaskMissingInstanceStrategy;
    }

    /**
     * Set <p>任务缺失实例处理策略</p><p>MAKEUP:补录缺失的实例;FORCE_SUCCESS:将缺失的实例置成功;SKIP:不处理，忽略缺失的实例</p>
     * @param PerTaskMissingInstanceStrategy <p>任务缺失实例处理策略</p><p>MAKEUP:补录缺失的实例;FORCE_SUCCESS:将缺失的实例置成功;SKIP:不处理，忽略缺失的实例</p>
     */
    public void setPerTaskMissingInstanceStrategy(TaskMissingInstanceStrategy [] PerTaskMissingInstanceStrategy) {
        this.PerTaskMissingInstanceStrategy = PerTaskMissingInstanceStrategy;
    }

    public BatchCreateTaskVersionAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateTaskVersionAsyncRequest(BatchCreateTaskVersionAsyncRequest source) {
        if (source.Tasks != null) {
            this.Tasks = new BatchCreateTaskVersionDTO[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new BatchCreateTaskVersionDTO(source.Tasks[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AutoRun != null) {
            this.AutoRun = new Boolean(source.AutoRun);
        }
        if (source.AlarmWays != null) {
            this.AlarmWays = new String(source.AlarmWays);
        }
        if (source.AlarmRecipientTypes != null) {
            this.AlarmRecipientTypes = new String(source.AlarmRecipientTypes);
        }
        if (source.NeedCheckParentSubmitted != null) {
            this.NeedCheckParentSubmitted = new Boolean(source.NeedCheckParentSubmitted);
        }
        if (source.EnableMakeUp != null) {
            this.EnableMakeUp = new Boolean(source.EnableMakeUp);
        }
        if (source.AssignApprovalList != null) {
            this.AssignApprovalList = new String[source.AssignApprovalList.length];
            for (int i = 0; i < source.AssignApprovalList.length; i++) {
                this.AssignApprovalList[i] = new String(source.AssignApprovalList[i]);
            }
        }
        if (source.PerTaskMissingInstanceStrategy != null) {
            this.PerTaskMissingInstanceStrategy = new TaskMissingInstanceStrategy[source.PerTaskMissingInstanceStrategy.length];
            for (int i = 0; i < source.PerTaskMissingInstanceStrategy.length; i++) {
                this.PerTaskMissingInstanceStrategy[i] = new TaskMissingInstanceStrategy(source.PerTaskMissingInstanceStrategy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoRun", this.AutoRun);
        this.setParamSimple(map, prefix + "AlarmWays", this.AlarmWays);
        this.setParamSimple(map, prefix + "AlarmRecipientTypes", this.AlarmRecipientTypes);
        this.setParamSimple(map, prefix + "NeedCheckParentSubmitted", this.NeedCheckParentSubmitted);
        this.setParamSimple(map, prefix + "EnableMakeUp", this.EnableMakeUp);
        this.setParamArraySimple(map, prefix + "AssignApprovalList.", this.AssignApprovalList);
        this.setParamArrayObj(map, prefix + "PerTaskMissingInstanceStrategy.", this.PerTaskMissingInstanceStrategy);

    }
}

