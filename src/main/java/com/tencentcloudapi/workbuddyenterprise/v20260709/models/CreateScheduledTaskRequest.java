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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScheduledTaskRequest extends AbstractModel {

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务关联的 Agent 配置</p>
    */
    @SerializedName("AgentConfig")
    @Expose
    private AgentConfig AgentConfig;

    /**
    * <p>Cron 表达式</p>
    */
    @SerializedName("CronExpr")
    @Expose
    private String CronExpr;

    /**
    * <p>任务描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>调度类型：CRON（按 Cron 周期执行，默认）或 ONCE（单次执行）</p>
    */
    @SerializedName("FrequencyType")
    @Expose
    private String FrequencyType;

    /**
    * <p>生效日期开始时间（YYYY-MM-DD 格式），可选，不传时不限制开始时间</p>
    */
    @SerializedName("EffectiveStart")
    @Expose
    private String EffectiveStart;

    /**
    * <p>生效日期结束时间（YYYY-MM-DD 格式），可选，不传时不限制结束时间</p>
    */
    @SerializedName("EffectiveEnd")
    @Expose
    private String EffectiveEnd;

    /**
    * <p>投递目标集合（BOT_CHANNEL / WEBHOOK 可并存）</p>
    */
    @SerializedName("DeliveryTargetSet")
    @Expose
    private DeliveryTarget [] DeliveryTargetSet;

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务关联的 Agent 配置</p> 
     * @return AgentConfig <p>任务关联的 Agent 配置</p>
     */
    public AgentConfig getAgentConfig() {
        return this.AgentConfig;
    }

    /**
     * Set <p>任务关联的 Agent 配置</p>
     * @param AgentConfig <p>任务关联的 Agent 配置</p>
     */
    public void setAgentConfig(AgentConfig AgentConfig) {
        this.AgentConfig = AgentConfig;
    }

    /**
     * Get <p>Cron 表达式</p> 
     * @return CronExpr <p>Cron 表达式</p>
     */
    public String getCronExpr() {
        return this.CronExpr;
    }

    /**
     * Set <p>Cron 表达式</p>
     * @param CronExpr <p>Cron 表达式</p>
     */
    public void setCronExpr(String CronExpr) {
        this.CronExpr = CronExpr;
    }

    /**
     * Get <p>任务描述</p> 
     * @return Description <p>任务描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述</p>
     * @param Description <p>任务描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>调度类型：CRON（按 Cron 周期执行，默认）或 ONCE（单次执行）</p> 
     * @return FrequencyType <p>调度类型：CRON（按 Cron 周期执行，默认）或 ONCE（单次执行）</p>
     */
    public String getFrequencyType() {
        return this.FrequencyType;
    }

    /**
     * Set <p>调度类型：CRON（按 Cron 周期执行，默认）或 ONCE（单次执行）</p>
     * @param FrequencyType <p>调度类型：CRON（按 Cron 周期执行，默认）或 ONCE（单次执行）</p>
     */
    public void setFrequencyType(String FrequencyType) {
        this.FrequencyType = FrequencyType;
    }

    /**
     * Get <p>生效日期开始时间（YYYY-MM-DD 格式），可选，不传时不限制开始时间</p> 
     * @return EffectiveStart <p>生效日期开始时间（YYYY-MM-DD 格式），可选，不传时不限制开始时间</p>
     */
    public String getEffectiveStart() {
        return this.EffectiveStart;
    }

    /**
     * Set <p>生效日期开始时间（YYYY-MM-DD 格式），可选，不传时不限制开始时间</p>
     * @param EffectiveStart <p>生效日期开始时间（YYYY-MM-DD 格式），可选，不传时不限制开始时间</p>
     */
    public void setEffectiveStart(String EffectiveStart) {
        this.EffectiveStart = EffectiveStart;
    }

    /**
     * Get <p>生效日期结束时间（YYYY-MM-DD 格式），可选，不传时不限制结束时间</p> 
     * @return EffectiveEnd <p>生效日期结束时间（YYYY-MM-DD 格式），可选，不传时不限制结束时间</p>
     */
    public String getEffectiveEnd() {
        return this.EffectiveEnd;
    }

    /**
     * Set <p>生效日期结束时间（YYYY-MM-DD 格式），可选，不传时不限制结束时间</p>
     * @param EffectiveEnd <p>生效日期结束时间（YYYY-MM-DD 格式），可选，不传时不限制结束时间</p>
     */
    public void setEffectiveEnd(String EffectiveEnd) {
        this.EffectiveEnd = EffectiveEnd;
    }

    /**
     * Get <p>投递目标集合（BOT_CHANNEL / WEBHOOK 可并存）</p> 
     * @return DeliveryTargetSet <p>投递目标集合（BOT_CHANNEL / WEBHOOK 可并存）</p>
     */
    public DeliveryTarget [] getDeliveryTargetSet() {
        return this.DeliveryTargetSet;
    }

    /**
     * Set <p>投递目标集合（BOT_CHANNEL / WEBHOOK 可并存）</p>
     * @param DeliveryTargetSet <p>投递目标集合（BOT_CHANNEL / WEBHOOK 可并存）</p>
     */
    public void setDeliveryTargetSet(DeliveryTarget [] DeliveryTargetSet) {
        this.DeliveryTargetSet = DeliveryTargetSet;
    }

    public CreateScheduledTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScheduledTaskRequest(CreateScheduledTaskRequest source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.AgentConfig != null) {
            this.AgentConfig = new AgentConfig(source.AgentConfig);
        }
        if (source.CronExpr != null) {
            this.CronExpr = new String(source.CronExpr);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FrequencyType != null) {
            this.FrequencyType = new String(source.FrequencyType);
        }
        if (source.EffectiveStart != null) {
            this.EffectiveStart = new String(source.EffectiveStart);
        }
        if (source.EffectiveEnd != null) {
            this.EffectiveEnd = new String(source.EffectiveEnd);
        }
        if (source.DeliveryTargetSet != null) {
            this.DeliveryTargetSet = new DeliveryTarget[source.DeliveryTargetSet.length];
            for (int i = 0; i < source.DeliveryTargetSet.length; i++) {
                this.DeliveryTargetSet[i] = new DeliveryTarget(source.DeliveryTargetSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamObj(map, prefix + "AgentConfig.", this.AgentConfig);
        this.setParamSimple(map, prefix + "CronExpr", this.CronExpr);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "FrequencyType", this.FrequencyType);
        this.setParamSimple(map, prefix + "EffectiveStart", this.EffectiveStart);
        this.setParamSimple(map, prefix + "EffectiveEnd", this.EffectiveEnd);
        this.setParamArrayObj(map, prefix + "DeliveryTargetSet.", this.DeliveryTargetSet);

    }
}

