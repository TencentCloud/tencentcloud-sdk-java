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

public class AppTriggerInstance extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>会话id</p>
    */
    @SerializedName("ConversationId")
    @Expose
    private String ConversationId;

    /**
    * <p>触发器创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("FinishedAt")
    @Expose
    private String FinishedAt;

    /**
    * <p>触发器运行实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>请求ID</p>
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * <p>结果码</p>
    */
    @SerializedName("ResultCode")
    @Expose
    private String ResultCode;

    /**
    * <p>结果摘要</p>
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
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_APP_TRIGGER</td><td>1</td><td>来源于应用触发器</td></tr></tbody></table>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>触发器开始执行时间</p>
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>TIMER_RUN_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>TIMER_RUN_STATUS_PENDING</td><td>1</td><td>等待执行</td></tr><tr><td>TIMER_RUN_STATUS_RUNNING</td><td>2</td><td>执行中</td></tr><tr><td>TIMER_RUN_STATUS_RETRY_WAIT</td><td>3</td><td>等待重试</td></tr><tr><td>TIMER_RUN_STATUS_SUCCESS</td><td>4</td><td>成功</td></tr><tr><td>TIMER_RUN_STATUS_DEAD</td><td>5</td><td>失败终态 (重试耗尽 / 不可重试)</td></tr><tr><td>TIMER_RUN_STATUS_CANCELLED</td><td>6</td><td>被任务暂停/删除/修改取消</td></tr></tbody></table>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>TraceId，用于日志记录</p>
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * <p>触发器id</p>
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>访客ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>工作流运行ID</p>
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
     * Get <p>应用id</p> 
     * @return AppId <p>应用id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
     * @param AppId <p>应用id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

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
     * Get <p>触发器创建时间</p> 
     * @return CreatedAt <p>触发器创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>触发器创建时间</p>
     * @param CreatedAt <p>触发器创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>结束时间</p> 
     * @return FinishedAt <p>结束时间</p>
     */
    public String getFinishedAt() {
        return this.FinishedAt;
    }

    /**
     * Set <p>结束时间</p>
     * @param FinishedAt <p>结束时间</p>
     */
    public void setFinishedAt(String FinishedAt) {
        this.FinishedAt = FinishedAt;
    }

    /**
     * Get <p>触发器运行实例id</p> 
     * @return InstanceId <p>触发器运行实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>触发器运行实例id</p>
     * @param InstanceId <p>触发器运行实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>请求ID</p> 
     * @return RequestId <p>请求ID</p>
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>请求ID</p>
     * @param RequestId <p>请求ID</p>
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
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
     * Get <p>结果摘要</p> 
     * @return ResultSummary <p>结果摘要</p>
     */
    public String getResultSummary() {
        return this.ResultSummary;
    }

    /**
     * Set <p>结果摘要</p>
     * @param ResultSummary <p>结果摘要</p>
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
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_APP_TRIGGER</td><td>1</td><td>来源于应用触发器</td></tr></tbody></table> 
     * @return Source <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_APP_TRIGGER</td><td>1</td><td>来源于应用触发器</td></tr></tbody></table>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_APP_TRIGGER</td><td>1</td><td>来源于应用触发器</td></tr></tbody></table>
     * @param Source <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_INSTANCE_SOURCE_APP_TRIGGER</td><td>1</td><td>来源于应用触发器</td></tr></tbody></table>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>触发器开始执行时间</p> 
     * @return StartedAt <p>触发器开始执行时间</p>
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set <p>触发器开始执行时间</p>
     * @param StartedAt <p>触发器开始执行时间</p>
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
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
     * Get <p>TraceId，用于日志记录</p> 
     * @return TraceId <p>TraceId，用于日志记录</p>
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set <p>TraceId，用于日志记录</p>
     * @param TraceId <p>TraceId，用于日志记录</p>
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
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
     * Get <p>访客ID</p> 
     * @return UserId <p>访客ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>访客ID</p>
     * @param UserId <p>访客ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>工作流运行ID</p> 
     * @return WorkflowRunId <p>工作流运行ID</p>
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>工作流运行ID</p>
     * @param WorkflowRunId <p>工作流运行ID</p>
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    public AppTriggerInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerInstance(AppTriggerInstance source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ConversationId != null) {
            this.ConversationId = new String(source.ConversationId);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.FinishedAt != null) {
            this.FinishedAt = new String(source.FinishedAt);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
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
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ConversationId", this.ConversationId);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "FinishedAt", this.FinishedAt);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "ResultSummary", this.ResultSummary);
        this.setParamSimple(map, prefix + "RunId", this.RunId);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);

    }
}

