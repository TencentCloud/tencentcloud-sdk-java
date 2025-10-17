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
    * 任务id
    */
    @SerializedName("Task")
    @Expose
    private BatchCreateTaskVersionDTO Task;

    /**
    * 是否需要校验父任务已经提交到调度
    */
    @SerializedName("NeedCheckParentSubmitted")
    @Expose
    private Boolean NeedCheckParentSubmitted;

    /**
    * 是否自动运行
    */
    @SerializedName("AutoRun")
    @Expose
    private Boolean AutoRun;

    /**
    * 项目ID
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
    * 告警方式:email-邮件;sms-短信;wecom-企业微信
    */
    @SerializedName("AlarmWays")
    @Expose
    private String AlarmWays;

    /**
    * 告警对象:1-项目管理员，2-任务责任人
    */
    @SerializedName("AlarmRecipientTypes")
    @Expose
    private String AlarmRecipientTypes;

    /**
    * 是否需要校验循环依赖，默认为 true，如果使用了 CheckTaskCycleLink 和 CheckTaskCycleConfiguration 两个接口校验成功可以传 false，后台服务器不再做校验
    */
    @SerializedName("EnableCheckTaskCycleLink")
    @Expose
    private Boolean EnableCheckTaskCycleLink;

    /**
    * 是否需要补录中间实例
    */
    @SerializedName("EnableMakeUp")
    @Expose
    private Boolean EnableMakeUp;

    /**
     * Get 任务id 
     * @return Task 任务id
     */
    public BatchCreateTaskVersionDTO getTask() {
        return this.Task;
    }

    /**
     * Set 任务id
     * @param Task 任务id
     */
    public void setTask(BatchCreateTaskVersionDTO Task) {
        this.Task = Task;
    }

    /**
     * Get 是否需要校验父任务已经提交到调度 
     * @return NeedCheckParentSubmitted 是否需要校验父任务已经提交到调度
     */
    public Boolean getNeedCheckParentSubmitted() {
        return this.NeedCheckParentSubmitted;
    }

    /**
     * Set 是否需要校验父任务已经提交到调度
     * @param NeedCheckParentSubmitted 是否需要校验父任务已经提交到调度
     */
    public void setNeedCheckParentSubmitted(Boolean NeedCheckParentSubmitted) {
        this.NeedCheckParentSubmitted = NeedCheckParentSubmitted;
    }

    /**
     * Get 是否自动运行 
     * @return AutoRun 是否自动运行
     */
    public Boolean getAutoRun() {
        return this.AutoRun;
    }

    /**
     * Set 是否自动运行
     * @param AutoRun 是否自动运行
     */
    public void setAutoRun(Boolean AutoRun) {
        this.AutoRun = AutoRun;
    }

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
     * Get 告警方式:email-邮件;sms-短信;wecom-企业微信 
     * @return AlarmWays 告警方式:email-邮件;sms-短信;wecom-企业微信
     */
    public String getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set 告警方式:email-邮件;sms-短信;wecom-企业微信
     * @param AlarmWays 告警方式:email-邮件;sms-短信;wecom-企业微信
     */
    public void setAlarmWays(String AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get 告警对象:1-项目管理员，2-任务责任人 
     * @return AlarmRecipientTypes 告警对象:1-项目管理员，2-任务责任人
     */
    public String getAlarmRecipientTypes() {
        return this.AlarmRecipientTypes;
    }

    /**
     * Set 告警对象:1-项目管理员，2-任务责任人
     * @param AlarmRecipientTypes 告警对象:1-项目管理员，2-任务责任人
     */
    public void setAlarmRecipientTypes(String AlarmRecipientTypes) {
        this.AlarmRecipientTypes = AlarmRecipientTypes;
    }

    /**
     * Get 是否需要校验循环依赖，默认为 true，如果使用了 CheckTaskCycleLink 和 CheckTaskCycleConfiguration 两个接口校验成功可以传 false，后台服务器不再做校验 
     * @return EnableCheckTaskCycleLink 是否需要校验循环依赖，默认为 true，如果使用了 CheckTaskCycleLink 和 CheckTaskCycleConfiguration 两个接口校验成功可以传 false，后台服务器不再做校验
     */
    public Boolean getEnableCheckTaskCycleLink() {
        return this.EnableCheckTaskCycleLink;
    }

    /**
     * Set 是否需要校验循环依赖，默认为 true，如果使用了 CheckTaskCycleLink 和 CheckTaskCycleConfiguration 两个接口校验成功可以传 false，后台服务器不再做校验
     * @param EnableCheckTaskCycleLink 是否需要校验循环依赖，默认为 true，如果使用了 CheckTaskCycleLink 和 CheckTaskCycleConfiguration 两个接口校验成功可以传 false，后台服务器不再做校验
     */
    public void setEnableCheckTaskCycleLink(Boolean EnableCheckTaskCycleLink) {
        this.EnableCheckTaskCycleLink = EnableCheckTaskCycleLink;
    }

    /**
     * Get 是否需要补录中间实例 
     * @return EnableMakeUp 是否需要补录中间实例
     */
    public Boolean getEnableMakeUp() {
        return this.EnableMakeUp;
    }

    /**
     * Set 是否需要补录中间实例
     * @param EnableMakeUp 是否需要补录中间实例
     */
    public void setEnableMakeUp(Boolean EnableMakeUp) {
        this.EnableMakeUp = EnableMakeUp;
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

    }
}

