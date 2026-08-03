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

public class AppTriggerSummary extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>指令执行</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>工作流执行</td></tr></tbody></table>
    */
    @SerializedName("ExecuteType")
    @Expose
    private Long ExecuteType;

    /**
    * <p>失败次数</p>
    */
    @SerializedName("FailedCount")
    @Expose
    private String FailedCount;

    /**
    * <p>最近一次会话id</p>
    */
    @SerializedName("LastSessionId")
    @Expose
    private String LastSessionId;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table><p>取值范围：[0, 2]</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>启用</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>暂停</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>已删除</td></tr></tbody></table>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>成功次数</p>
    */
    @SerializedName("SuccessCount")
    @Expose
    private String SuccessCount;

    /**
    * <p>触发器id</p>
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>触发器名称</p>
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * <p>触发器执行状态</p>
    */
    @SerializedName("TriggerStatus")
    @Expose
    private TriggerStatus TriggerStatus;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr></tbody></table>
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * <p>未读日志的数量</p>
    */
    @SerializedName("UnreadRunLogCount")
    @Expose
    private String UnreadRunLogCount;

    /**
    * <p>访客ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>指令执行</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>工作流执行</td></tr></tbody></table> 
     * @return ExecuteType <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>指令执行</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>工作流执行</td></tr></tbody></table>
     */
    public Long getExecuteType() {
        return this.ExecuteType;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>指令执行</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>工作流执行</td></tr></tbody></table>
     * @param ExecuteType <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>指令执行</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>工作流执行</td></tr></tbody></table>
     */
    public void setExecuteType(Long ExecuteType) {
        this.ExecuteType = ExecuteType;
    }

    /**
     * Get <p>失败次数</p> 
     * @return FailedCount <p>失败次数</p>
     */
    public String getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set <p>失败次数</p>
     * @param FailedCount <p>失败次数</p>
     */
    public void setFailedCount(String FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get <p>最近一次会话id</p> 
     * @return LastSessionId <p>最近一次会话id</p>
     */
    public String getLastSessionId() {
        return this.LastSessionId;
    }

    /**
     * Set <p>最近一次会话id</p>
     * @param LastSessionId <p>最近一次会话id</p>
     */
    public void setLastSessionId(String LastSessionId) {
        this.LastSessionId = LastSessionId;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table><p>取值范围：[0, 2]</p> 
     * @return Scope <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table><p>取值范围：[0, 2]</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table><p>取值范围：[0, 2]</p>
     * @param Scope <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_SCOPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_SCOPE_APP</td><td>1</td><td>B 端管理员</td></tr><tr><td>APP_TRIGGER_SCOPE_USER</td><td>2</td><td>C 端访客</td></tr></tbody></table><p>取值范围：[0, 2]</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>启用</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>暂停</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>已删除</td></tr></tbody></table> 
     * @return Status <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>启用</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>暂停</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>已删除</td></tr></tbody></table>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>启用</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>暂停</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>已删除</td></tr></tbody></table>
     * @param Status <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>启用</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>暂停</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>已删除</td></tr></tbody></table>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>成功次数</p> 
     * @return SuccessCount <p>成功次数</p>
     */
    public String getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set <p>成功次数</p>
     * @param SuccessCount <p>成功次数</p>
     */
    public void setSuccessCount(String SuccessCount) {
        this.SuccessCount = SuccessCount;
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
     * Get <p>触发器名称</p> 
     * @return TriggerName <p>触发器名称</p>
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set <p>触发器名称</p>
     * @param TriggerName <p>触发器名称</p>
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get <p>触发器执行状态</p> 
     * @return TriggerStatus <p>触发器执行状态</p>
     */
    public TriggerStatus getTriggerStatus() {
        return this.TriggerStatus;
    }

    /**
     * Set <p>触发器执行状态</p>
     * @param TriggerStatus <p>触发器执行状态</p>
     */
    public void setTriggerStatus(TriggerStatus TriggerStatus) {
        this.TriggerStatus = TriggerStatus;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr></tbody></table> 
     * @return TriggerType <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr></tbody></table>
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr></tbody></table>
     * @param TriggerType <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr></tbody></table>
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>未读日志的数量</p> 
     * @return UnreadRunLogCount <p>未读日志的数量</p>
     */
    public String getUnreadRunLogCount() {
        return this.UnreadRunLogCount;
    }

    /**
     * Set <p>未读日志的数量</p>
     * @param UnreadRunLogCount <p>未读日志的数量</p>
     */
    public void setUnreadRunLogCount(String UnreadRunLogCount) {
        this.UnreadRunLogCount = UnreadRunLogCount;
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

    public AppTriggerSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTriggerSummary(AppTriggerSummary source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ExecuteType != null) {
            this.ExecuteType = new Long(source.ExecuteType);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new String(source.FailedCount);
        }
        if (source.LastSessionId != null) {
            this.LastSessionId = new String(source.LastSessionId);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new String(source.SuccessCount);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.TriggerStatus != null) {
            this.TriggerStatus = new TriggerStatus(source.TriggerStatus);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.UnreadRunLogCount != null) {
            this.UnreadRunLogCount = new String(source.UnreadRunLogCount);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ExecuteType", this.ExecuteType);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "LastSessionId", this.LastSessionId);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamObj(map, prefix + "TriggerStatus.", this.TriggerStatus);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "UnreadRunLogCount", this.UnreadRunLogCount);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

