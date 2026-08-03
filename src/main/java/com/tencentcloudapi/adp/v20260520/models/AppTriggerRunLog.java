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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppTriggerRunLog extends AbstractModel {

    /**
    * <p>会话id</p>
    */
    @SerializedName("ConversationId")
    @Expose
    private String ConversationId;

    /**
    * <p>执行时间</p>
    */
    @SerializedName("DurationMs")
    @Expose
    private String DurationMs;

    /**
    * <p>结束时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_MANUAL_RUN</td><td>3</td><td>手动立即执行</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_TEST_RUN</td><td>4</td><td>测试执行</td></tr></tbody></table>
    */
    @SerializedName("FireType")
    @Expose
    private Long FireType;

    /**
    * <p>触发实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_NONE</td><td>1</td><td>未配置推送</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_WAITING</td><td>2</td><td>等待推送</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_SUCCESS</td><td>3</td><td>推送成功</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_FAILED</td><td>4</td><td>推送失败</td></tr></tbody></table>
    */
    @SerializedName("PushStatus")
    @Expose
    private Long PushStatus;

    /**
    * <p>结果码</p>
    */
    @SerializedName("ResultCode")
    @Expose
    private String ResultCode;

    /**
    * <p>结果概要</p>
    */
    @SerializedName("ResultSummary")
    @Expose
    private String ResultSummary;

    /**
    * <p>单次对话id</p>
    */
    @SerializedName("RunId")
    @Expose
    private String RunId;

    /**
    * <p>触发时间</p><p>参数格式：YYYY:MM:DD hh:mm:ss</p>
    */
    @SerializedName("ScheduledFireTime")
    @Expose
    private String ScheduledFireTime;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>开始执行时间</p><p>参数格式：YYYY:MM:DD hh:mm:ss</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TIMER_RUN_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>TIMER_RUN_STATUS_PENDING</td><td>1</td><td>等待执行</td></tr><tr><td>TIMER_RUN_STATUS_RUNNING</td><td>2</td><td>执行中</td></tr><tr><td>TIMER_RUN_STATUS_RETRY_WAIT</td><td>3</td><td>等待重试</td></tr><tr><td>TIMER_RUN_STATUS_SUCCESS</td><td>4</td><td>成功</td></tr><tr><td>TIMER_RUN_STATUS_DEAD</td><td>5</td><td>失败终态 (重试耗尽 / 不可重试)</td></tr><tr><td>TIMER_RUN_STATUS_CANCELLED</td><td>6</td><td>被任务暂停/删除/修改取消</td></tr></tbody></table>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>触发器id</p>
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>是否已读</p>
    */
    @SerializedName("Unread")
    @Expose
    private Boolean Unread;

    /**
    * <p>访客Id</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>工作流运行id</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
     * Get <p>会话id</p> 
     * @return ConversationId <p>会话id</p>
     */
    public String getConversationId() {
        return this.ConversationId;
    }

    /**
     * Set <p>会话id</p>
     * @param ConversationId <p>会话id</p>
     */
    public void setConversationId(String ConversationId) {
        this.ConversationId = ConversationId;
    }

    /**
     * Get <p>执行时间</p> 
     * @return DurationMs <p>执行时间</p>
     */
    public String getDurationMs() {
        return this.DurationMs;
    }

    /**
     * Set <p>执行时间</p>
     * @param DurationMs <p>执行时间</p>
     */
    public void setDurationMs(String DurationMs) {
        this.DurationMs = DurationMs;
    }

    /**
     * Get <p>结束时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return EndTime <p>结束时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param EndTime <p>结束时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_MANUAL_RUN</td><td>3</td><td>手动立即执行</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_TEST_RUN</td><td>4</td><td>测试执行</td></tr></tbody></table> 
     * @return FireType <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_MANUAL_RUN</td><td>3</td><td>手动立即执行</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_TEST_RUN</td><td>4</td><td>测试执行</td></tr></tbody></table>
     */
    public Long getFireType() {
        return this.FireType;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_MANUAL_RUN</td><td>3</td><td>手动立即执行</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_TEST_RUN</td><td>4</td><td>测试执行</td></tr></tbody></table>
     * @param FireType <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_MANUAL_RUN</td><td>3</td><td>手动立即执行</td></tr><tr><td>APP_TRIGGER_FIRE_TYPE_TEST_RUN</td><td>4</td><td>测试执行</td></tr></tbody></table>
     */
    public void setFireType(Long FireType) {
        this.FireType = FireType;
    }

    /**
     * Get <p>触发实例id</p> 
     * @return InstanceId <p>触发实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>触发实例id</p>
     * @param InstanceId <p>触发实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_NONE</td><td>1</td><td>未配置推送</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_WAITING</td><td>2</td><td>等待推送</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_SUCCESS</td><td>3</td><td>推送成功</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_FAILED</td><td>4</td><td>推送失败</td></tr></tbody></table> 
     * @return PushStatus <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_NONE</td><td>1</td><td>未配置推送</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_WAITING</td><td>2</td><td>等待推送</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_SUCCESS</td><td>3</td><td>推送成功</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_FAILED</td><td>4</td><td>推送失败</td></tr></tbody></table>
     */
    public Long getPushStatus() {
        return this.PushStatus;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_NONE</td><td>1</td><td>未配置推送</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_WAITING</td><td>2</td><td>等待推送</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_SUCCESS</td><td>3</td><td>推送成功</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_FAILED</td><td>4</td><td>推送失败</td></tr></tbody></table>
     * @param PushStatus <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_NONE</td><td>1</td><td>未配置推送</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_WAITING</td><td>2</td><td>等待推送</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_SUCCESS</td><td>3</td><td>推送成功</td></tr><tr><td>TIMER_RUN_PUSH_STATUS_FAILED</td><td>4</td><td>推送失败</td></tr></tbody></table>
     */
    public void setPushStatus(Long PushStatus) {
        this.PushStatus = PushStatus;
    }

    /**
     * Get <p>结果码</p> 
     * @return ResultCode <p>结果码</p>
     */
    public String getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set <p>结果码</p>
     * @param ResultCode <p>结果码</p>
     */
    public void setResultCode(String ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get <p>结果概要</p> 
     * @return ResultSummary <p>结果概要</p>
     */
    public String getResultSummary() {
        return this.ResultSummary;
    }

    /**
     * Set <p>结果概要</p>
     * @param ResultSummary <p>结果概要</p>
     */
    public void setResultSummary(String ResultSummary) {
        this.ResultSummary = ResultSummary;
    }

    /**
     * Get <p>单次对话id</p> 
     * @return RunId <p>单次对话id</p>
     */
    public String getRunId() {
        return this.RunId;
    }

    /**
     * Set <p>单次对话id</p>
     * @param RunId <p>单次对话id</p>
     */
    public void setRunId(String RunId) {
        this.RunId = RunId;
    }

    /**
     * Get <p>触发时间</p><p>参数格式：YYYY:MM:DD hh:mm:ss</p> 
     * @return ScheduledFireTime <p>触发时间</p><p>参数格式：YYYY:MM:DD hh:mm:ss</p>
     */
    public String getScheduledFireTime() {
        return this.ScheduledFireTime;
    }

    /**
     * Set <p>触发时间</p><p>参数格式：YYYY:MM:DD hh:mm:ss</p>
     * @param ScheduledFireTime <p>触发时间</p><p>参数格式：YYYY:MM:DD hh:mm:ss</p>
     */
    public void setScheduledFireTime(String ScheduledFireTime) {
        this.ScheduledFireTime = ScheduledFireTime;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table> 
     * @return Scope <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table>
     * @param Scope <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>开始执行时间</p><p>参数格式：YYYY:MM:DD hh:mm:ss</p> 
     * @return StartTime <p>开始执行时间</p><p>参数格式：YYYY:MM:DD hh:mm:ss</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始执行时间</p><p>参数格式：YYYY:MM:DD hh:mm:ss</p>
     * @param StartTime <p>开始执行时间</p><p>参数格式：YYYY:MM:DD hh:mm:ss</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TIMER_RUN_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>TIMER_RUN_STATUS_PENDING</td><td>1</td><td>等待执行</td></tr><tr><td>TIMER_RUN_STATUS_RUNNING</td><td>2</td><td>执行中</td></tr><tr><td>TIMER_RUN_STATUS_RETRY_WAIT</td><td>3</td><td>等待重试</td></tr><tr><td>TIMER_RUN_STATUS_SUCCESS</td><td>4</td><td>成功</td></tr><tr><td>TIMER_RUN_STATUS_DEAD</td><td>5</td><td>失败终态 (重试耗尽 / 不可重试)</td></tr><tr><td>TIMER_RUN_STATUS_CANCELLED</td><td>6</td><td>被任务暂停/删除/修改取消</td></tr></tbody></table> 
     * @return Status <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TIMER_RUN_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>TIMER_RUN_STATUS_PENDING</td><td>1</td><td>等待执行</td></tr><tr><td>TIMER_RUN_STATUS_RUNNING</td><td>2</td><td>执行中</td></tr><tr><td>TIMER_RUN_STATUS_RETRY_WAIT</td><td>3</td><td>等待重试</td></tr><tr><td>TIMER_RUN_STATUS_SUCCESS</td><td>4</td><td>成功</td></tr><tr><td>TIMER_RUN_STATUS_DEAD</td><td>5</td><td>失败终态 (重试耗尽 / 不可重试)</td></tr><tr><td>TIMER_RUN_STATUS_CANCELLED</td><td>6</td><td>被任务暂停/删除/修改取消</td></tr></tbody></table>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TIMER_RUN_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>TIMER_RUN_STATUS_PENDING</td><td>1</td><td>等待执行</td></tr><tr><td>TIMER_RUN_STATUS_RUNNING</td><td>2</td><td>执行中</td></tr><tr><td>TIMER_RUN_STATUS_RETRY_WAIT</td><td>3</td><td>等待重试</td></tr><tr><td>TIMER_RUN_STATUS_SUCCESS</td><td>4</td><td>成功</td></tr><tr><td>TIMER_RUN_STATUS_DEAD</td><td>5</td><td>失败终态 (重试耗尽 / 不可重试)</td></tr><tr><td>TIMER_RUN_STATUS_CANCELLED</td><td>6</td><td>被任务暂停/删除/修改取消</td></tr></tbody></table>
     * @param Status <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TIMER_RUN_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>TIMER_RUN_STATUS_PENDING</td><td>1</td><td>等待执行</td></tr><tr><td>TIMER_RUN_STATUS_RUNNING</td><td>2</td><td>执行中</td></tr><tr><td>TIMER_RUN_STATUS_RETRY_WAIT</td><td>3</td><td>等待重试</td></tr><tr><td>TIMER_RUN_STATUS_SUCCESS</td><td>4</td><td>成功</td></tr><tr><td>TIMER_RUN_STATUS_DEAD</td><td>5</td><td>失败终态 (重试耗尽 / 不可重试)</td></tr><tr><td>TIMER_RUN_STATUS_CANCELLED</td><td>6</td><td>被任务暂停/删除/修改取消</td></tr></tbody></table>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>触发器id</p> 
     * @return TriggerId <p>触发器id</p>
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>触发器id</p>
     * @param TriggerId <p>触发器id</p>
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get <p>是否已读</p> 
     * @return Unread <p>是否已读</p>
     */
    public Boolean getUnread() {
        return this.Unread;
    }

    /**
     * Set <p>是否已读</p>
     * @param Unread <p>是否已读</p>
     */
    public void setUnread(Boolean Unread) {
        this.Unread = Unread;
    }

    /**
     * Get <p>访客Id</p> 
     * @return UserId <p>访客Id</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>访客Id</p>
     * @param UserId <p>访客Id</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>工作流运行id</p> 
     * @return WorkflowRunId <p>工作流运行id</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>工作流运行id</p>
     * @param WorkflowRunId <p>工作流运行id</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    public AppTriggerRunLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerRunLog(AppTriggerRunLog source) {
        if (source.ConversationId != null) {
            this.ConversationId = new String(source.ConversationId);
        }
        if (source.DurationMs != null) {
            this.DurationMs = new String(source.DurationMs);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FireType != null) {
            this.FireType = new Long(source.FireType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PushStatus != null) {
            this.PushStatus = new Long(source.PushStatus);
        }
        if (source.ResultCode != null) {
            this.ResultCode = new String(source.ResultCode);
        }
        if (source.ResultSummary != null) {
            this.ResultSummary = new String(source.ResultSummary);
        }
        if (source.RunId != null) {
            this.RunId = new String(source.RunId);
        }
        if (source.ScheduledFireTime != null) {
            this.ScheduledFireTime = new String(source.ScheduledFireTime);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.Unread != null) {
            this.Unread = new Boolean(source.Unread);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConversationId", this.ConversationId);
        this.setParamSimple(map, prefix + "DurationMs", this.DurationMs);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FireType", this.FireType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PushStatus", this.PushStatus);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "ResultSummary", this.ResultSummary);
        this.setParamSimple(map, prefix + "RunId", this.RunId);
        this.setParamSimple(map, prefix + "ScheduledFireTime", this.ScheduledFireTime);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "Unread", this.Unread);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);

    }
}

