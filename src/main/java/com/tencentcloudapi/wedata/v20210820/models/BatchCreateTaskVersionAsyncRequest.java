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
    * 任务信息
    */
    @SerializedName("Tasks")
    @Expose
    private BatchCreateTaskVersionDTO [] Tasks;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否自动运行
    */
    @SerializedName("AutoRun")
    @Expose
    private Boolean AutoRun;

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
    * 是否需要校验父任务已经提交到调度
    */
    @SerializedName("NeedCheckParentSubmitted")
    @Expose
    private Boolean NeedCheckParentSubmitted;

    /**
     * Get 任务信息 
     * @return Tasks 任务信息
     */
    public BatchCreateTaskVersionDTO [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务信息
     * @param Tasks 任务信息
     */
    public void setTasks(BatchCreateTaskVersionDTO [] Tasks) {
        this.Tasks = Tasks;
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

    }
}

