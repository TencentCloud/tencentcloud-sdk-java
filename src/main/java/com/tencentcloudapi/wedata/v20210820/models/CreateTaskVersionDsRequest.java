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

public class CreateTaskVersionDsRequest extends AbstractModel {

    /**
    * <p>任务id</p>
    */
    @SerializedName("Task")
    @Expose
    private BatchCreateTaskVersionDTO Task;

    /**
    * <p>是否需要校验父任务已经提交到调度</p>
    */
    @SerializedName("NeedCheckParentSubmitted")
    @Expose
    private Boolean NeedCheckParentSubmitted;

    /**
    * <p>是否自动运行</p>
    */
    @SerializedName("AutoRun")
    @Expose
    private Boolean AutoRun;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 请求来源，WEB 前端；CLIENT 客户端
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

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
    * <p>是否需要校验循环依赖，默认为 true，如果使用了 CheckTaskCycleLink 和 CheckTaskCycleConfiguration 两个接口校验成功可以传 false，后台服务器不再做校验</p>
    */
    @SerializedName("EnableCheckTaskCycleLink")
    @Expose
    private Boolean EnableCheckTaskCycleLink;

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
    * <p>MAKEUP:补录缺失的实例;FORCE_SUCCESS:将缺失的实例置成功;SKIP:不处理，忽略缺失的实例</p>
    */
    @SerializedName("MissingInstanceStrategy")
    @Expose
    private String MissingInstanceStrategy;

    /**
     * Get <p>任务id</p> 
     * @return Task <p>任务id</p>
     */
    public BatchCreateTaskVersionDTO getTask() {
        return this.Task;
    }

    /**
     * Set <p>任务id</p>
     * @param Task <p>任务id</p>
     */
    public void setTask(BatchCreateTaskVersionDTO Task) {
        this.Task = Task;
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
     * Get 请求来源，WEB 前端；CLIENT 客户端 
     * @return RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set 请求来源，WEB 前端；CLIENT 客户端
     * @param RequestFromSource 请求来源，WEB 前端；CLIENT 客户端
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
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
     * Get <p>是否需要校验循环依赖，默认为 true，如果使用了 CheckTaskCycleLink 和 CheckTaskCycleConfiguration 两个接口校验成功可以传 false，后台服务器不再做校验</p> 
     * @return EnableCheckTaskCycleLink <p>是否需要校验循环依赖，默认为 true，如果使用了 CheckTaskCycleLink 和 CheckTaskCycleConfiguration 两个接口校验成功可以传 false，后台服务器不再做校验</p>
     */
    public Boolean getEnableCheckTaskCycleLink() {
        return this.EnableCheckTaskCycleLink;
    }

    /**
     * Set <p>是否需要校验循环依赖，默认为 true，如果使用了 CheckTaskCycleLink 和 CheckTaskCycleConfiguration 两个接口校验成功可以传 false，后台服务器不再做校验</p>
     * @param EnableCheckTaskCycleLink <p>是否需要校验循环依赖，默认为 true，如果使用了 CheckTaskCycleLink 和 CheckTaskCycleConfiguration 两个接口校验成功可以传 false，后台服务器不再做校验</p>
     */
    public void setEnableCheckTaskCycleLink(Boolean EnableCheckTaskCycleLink) {
        this.EnableCheckTaskCycleLink = EnableCheckTaskCycleLink;
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
     * Get <p>MAKEUP:补录缺失的实例;FORCE_SUCCESS:将缺失的实例置成功;SKIP:不处理，忽略缺失的实例</p> 
     * @return MissingInstanceStrategy <p>MAKEUP:补录缺失的实例;FORCE_SUCCESS:将缺失的实例置成功;SKIP:不处理，忽略缺失的实例</p>
     */
    public String getMissingInstanceStrategy() {
        return this.MissingInstanceStrategy;
    }

    /**
     * Set <p>MAKEUP:补录缺失的实例;FORCE_SUCCESS:将缺失的实例置成功;SKIP:不处理，忽略缺失的实例</p>
     * @param MissingInstanceStrategy <p>MAKEUP:补录缺失的实例;FORCE_SUCCESS:将缺失的实例置成功;SKIP:不处理，忽略缺失的实例</p>
     */
    public void setMissingInstanceStrategy(String MissingInstanceStrategy) {
        this.MissingInstanceStrategy = MissingInstanceStrategy;
    }

    public CreateTaskVersionDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskVersionDsRequest(CreateTaskVersionDsRequest source) {
        if (source.Task != null) {
            this.Task = new BatchCreateTaskVersionDTO(source.Task);
        }
        if (source.NeedCheckParentSubmitted != null) {
            this.NeedCheckParentSubmitted = new Boolean(source.NeedCheckParentSubmitted);
        }
        if (source.AutoRun != null) {
            this.AutoRun = new Boolean(source.AutoRun);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.AlarmWays != null) {
            this.AlarmWays = new String(source.AlarmWays);
        }
        if (source.AlarmRecipientTypes != null) {
            this.AlarmRecipientTypes = new String(source.AlarmRecipientTypes);
        }
        if (source.EnableCheckTaskCycleLink != null) {
            this.EnableCheckTaskCycleLink = new Boolean(source.EnableCheckTaskCycleLink);
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
        if (source.MissingInstanceStrategy != null) {
            this.MissingInstanceStrategy = new String(source.MissingInstanceStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamSimple(map, prefix + "NeedCheckParentSubmitted", this.NeedCheckParentSubmitted);
        this.setParamSimple(map, prefix + "AutoRun", this.AutoRun);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamSimple(map, prefix + "AlarmWays", this.AlarmWays);
        this.setParamSimple(map, prefix + "AlarmRecipientTypes", this.AlarmRecipientTypes);
        this.setParamSimple(map, prefix + "EnableCheckTaskCycleLink", this.EnableCheckTaskCycleLink);
        this.setParamSimple(map, prefix + "EnableMakeUp", this.EnableMakeUp);
        this.setParamArraySimple(map, prefix + "AssignApprovalList.", this.AssignApprovalList);
        this.setParamSimple(map, prefix + "MissingInstanceStrategy", this.MissingInstanceStrategy);

    }
}

