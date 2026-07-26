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

public class AppTrigger extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * 
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr></table>
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>指令执行</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>工作流执行</td></tr></table>
    */
    @SerializedName("ExecuteType")
    @Expose
    private Long ExecuteType;

    /**
    * 
    */
    @SerializedName("PushConfig")
    @Expose
    private TimerPushConfig PushConfig;

    /**
    * <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>启用</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>暂停</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>已删除</td></tr></table>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 
    */
    @SerializedName("SuccessCount")
    @Expose
    private String SuccessCount;

    /**
    * 
    */
    @SerializedName("FailedCount")
    @Expose
    private String FailedCount;

    /**
    * 
    */
    @SerializedName("TriggerConfig")
    @Expose
    private TriggerConfig TriggerConfig;

    /**
    * 
    */
    @SerializedName("ExecuteConfig")
    @Expose
    private ExecuteConfig ExecuteConfig;

    /**
    * 
    */
    @SerializedName("TriggerStatus")
    @Expose
    private TriggerStatus TriggerStatus;

    /**
     * Get  
     * @return TriggerId 
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set 
     * @param TriggerId 
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get  
     * @return AppId 
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 
     * @param AppId 
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get  
     * @return TriggerName 
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 
     * @param TriggerName 
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr></table> 
     * @return TriggerType <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr></table>
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr></table>
     * @param TriggerType <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_TYPE_SCHEDULED</td><td>1</td><td>定时触发</td></tr><tr><td>APP_TRIGGER_TYPE_WEBHOOK</td><td>2</td><td>Webhook 触发</td></tr></table>
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>指令执行</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>工作流执行</td></tr></table> 
     * @return ExecuteType <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>指令执行</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>工作流执行</td></tr></table>
     */
    public Long getExecuteType() {
        return this.ExecuteType;
    }

    /**
     * Set <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>指令执行</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>工作流执行</td></tr></table>
     * @param ExecuteType <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_PROMPT</td><td>1</td><td>指令执行</td></tr><tr><td>APP_TRIGGER_EXECUTE_TYPE_WORKFLOW</td><td>2</td><td>工作流执行</td></tr></table>
     */
    public void setExecuteType(Long ExecuteType) {
        this.ExecuteType = ExecuteType;
    }

    /**
     * Get  
     * @return PushConfig 
     */
    public TimerPushConfig getPushConfig() {
        return this.PushConfig;
    }

    /**
     * Set 
     * @param PushConfig 
     */
    public void setPushConfig(TimerPushConfig PushConfig) {
        this.PushConfig = PushConfig;
    }

    /**
     * Get <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>启用</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>暂停</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>已删除</td></tr></table> 
     * @return Status <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>启用</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>暂停</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>已删除</td></tr></table>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>启用</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>暂停</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>已删除</td></tr></table>
     * @param Status <table><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>APP_TRIGGER_STATUS_UNSPECIFIED</td><td>0</td><td>未指定</td></tr><tr><td>APP_TRIGGER_STATUS_ENABLED</td><td>1</td><td>启用</td></tr><tr><td>APP_TRIGGER_STATUS_PAUSED</td><td>2</td><td>暂停</td></tr><tr><td>APP_TRIGGER_STATUS_DELETED</td><td>3</td><td>已删除</td></tr></table>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return SuccessCount 
     */
    public String getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 
     * @param SuccessCount 
     */
    public void setSuccessCount(String SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get  
     * @return FailedCount 
     */
    public String getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 
     * @param FailedCount 
     */
    public void setFailedCount(String FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get  
     * @return TriggerConfig 
     */
    public TriggerConfig getTriggerConfig() {
        return this.TriggerConfig;
    }

    /**
     * Set 
     * @param TriggerConfig 
     */
    public void setTriggerConfig(TriggerConfig TriggerConfig) {
        this.TriggerConfig = TriggerConfig;
    }

    /**
     * Get  
     * @return ExecuteConfig 
     */
    public ExecuteConfig getExecuteConfig() {
        return this.ExecuteConfig;
    }

    /**
     * Set 
     * @param ExecuteConfig 
     */
    public void setExecuteConfig(ExecuteConfig ExecuteConfig) {
        this.ExecuteConfig = ExecuteConfig;
    }

    /**
     * Get  
     * @return TriggerStatus 
     */
    public TriggerStatus getTriggerStatus() {
        return this.TriggerStatus;
    }

    /**
     * Set 
     * @param TriggerStatus 
     */
    public void setTriggerStatus(TriggerStatus TriggerStatus) {
        this.TriggerStatus = TriggerStatus;
    }

    public AppTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppTrigger(AppTrigger source) {
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.ExecuteType != null) {
            this.ExecuteType = new Long(source.ExecuteType);
        }
        if (source.PushConfig != null) {
            this.PushConfig = new TimerPushConfig(source.PushConfig);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new String(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new String(source.FailedCount);
        }
        if (source.TriggerConfig != null) {
            this.TriggerConfig = new TriggerConfig(source.TriggerConfig);
        }
        if (source.ExecuteConfig != null) {
            this.ExecuteConfig = new ExecuteConfig(source.ExecuteConfig);
        }
        if (source.TriggerStatus != null) {
            this.TriggerStatus = new TriggerStatus(source.TriggerStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "ExecuteType", this.ExecuteType);
        this.setParamObj(map, prefix + "PushConfig.", this.PushConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamObj(map, prefix + "TriggerConfig.", this.TriggerConfig);
        this.setParamObj(map, prefix + "ExecuteConfig.", this.ExecuteConfig);
        this.setParamObj(map, prefix + "TriggerStatus.", this.TriggerStatus);

    }
}

