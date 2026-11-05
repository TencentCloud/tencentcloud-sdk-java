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

public class DescribeScheduledTaskResponse extends AbstractModel {

    /**
    * <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskKey")
    @Expose
    private String TaskKey;

    /**
    * <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>关联 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * <p>Cron 表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronExpr")
    @Expose
    private String CronExpr;

    /**
    * <p>任务状态：ACTIVE（启用）/ PAUSED（暂停）/ DISABLED（停用）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>最近执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastRunTime")
    @Expose
    private String LastRunTime;

    /**
    * <p>下次执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextRunTime")
    @Expose
    private String NextRunTime;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * <p>任务 Agent 配置（Prompt/Model/AgentId）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentConfig")
    @Expose
    private AgentConfig AgentConfig;

    /**
    * <p>生效日期开始时间（YYYY-MM-DD 格式），不传时不限制开始时间</p>
    */
    @SerializedName("EffectiveStart")
    @Expose
    private String EffectiveStart;

    /**
    * <p>生效日期结束时间（YYYY-MM-DD 格式），不传时不限制结束时间</p>
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
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskKey <p>任务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskKey() {
        return this.TaskKey;
    }

    /**
     * Set <p>任务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskKey <p>任务唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskKey(String TaskKey) {
        this.TaskKey = TaskKey;
    }

    /**
     * Get <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>关联 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentId <p>关联 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set <p>关联 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentId <p>关联 Agent ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get <p>Cron 表达式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronExpr <p>Cron 表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCronExpr() {
        return this.CronExpr;
    }

    /**
     * Set <p>Cron 表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronExpr <p>Cron 表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronExpr(String CronExpr) {
        this.CronExpr = CronExpr;
    }

    /**
     * Get <p>任务状态：ACTIVE（启用）/ PAUSED（暂停）/ DISABLED（停用）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>任务状态：ACTIVE（启用）/ PAUSED（暂停）/ DISABLED（停用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态：ACTIVE（启用）/ PAUSED（暂停）/ DISABLED（停用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>任务状态：ACTIVE（启用）/ PAUSED（暂停）/ DISABLED（停用）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>最近执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastRunTime <p>最近执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastRunTime() {
        return this.LastRunTime;
    }

    /**
     * Set <p>最近执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastRunTime <p>最近执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastRunTime(String LastRunTime) {
        this.LastRunTime = LastRunTime;
    }

    /**
     * Get <p>下次执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextRunTime <p>下次执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextRunTime() {
        return this.NextRunTime;
    }

    /**
     * Set <p>下次执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextRunTime <p>下次执行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextRunTime(String NextRunTime) {
        this.NextRunTime = NextRunTime;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>任务 Agent 配置（Prompt/Model/AgentId）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentConfig <p>任务 Agent 配置（Prompt/Model/AgentId）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentConfig getAgentConfig() {
        return this.AgentConfig;
    }

    /**
     * Set <p>任务 Agent 配置（Prompt/Model/AgentId）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentConfig <p>任务 Agent 配置（Prompt/Model/AgentId）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentConfig(AgentConfig AgentConfig) {
        this.AgentConfig = AgentConfig;
    }

    /**
     * Get <p>生效日期开始时间（YYYY-MM-DD 格式），不传时不限制开始时间</p> 
     * @return EffectiveStart <p>生效日期开始时间（YYYY-MM-DD 格式），不传时不限制开始时间</p>
     */
    public String getEffectiveStart() {
        return this.EffectiveStart;
    }

    /**
     * Set <p>生效日期开始时间（YYYY-MM-DD 格式），不传时不限制开始时间</p>
     * @param EffectiveStart <p>生效日期开始时间（YYYY-MM-DD 格式），不传时不限制开始时间</p>
     */
    public void setEffectiveStart(String EffectiveStart) {
        this.EffectiveStart = EffectiveStart;
    }

    /**
     * Get <p>生效日期结束时间（YYYY-MM-DD 格式），不传时不限制结束时间</p> 
     * @return EffectiveEnd <p>生效日期结束时间（YYYY-MM-DD 格式），不传时不限制结束时间</p>
     */
    public String getEffectiveEnd() {
        return this.EffectiveEnd;
    }

    /**
     * Set <p>生效日期结束时间（YYYY-MM-DD 格式），不传时不限制结束时间</p>
     * @param EffectiveEnd <p>生效日期结束时间（YYYY-MM-DD 格式），不传时不限制结束时间</p>
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

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeScheduledTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScheduledTaskResponse(DescribeScheduledTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskKey != null) {
            this.TaskKey = new String(source.TaskKey);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.CronExpr != null) {
            this.CronExpr = new String(source.CronExpr);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LastRunTime != null) {
            this.LastRunTime = new String(source.LastRunTime);
        }
        if (source.NextRunTime != null) {
            this.NextRunTime = new String(source.NextRunTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.AgentConfig != null) {
            this.AgentConfig = new AgentConfig(source.AgentConfig);
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskKey", this.TaskKey);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "CronExpr", this.CronExpr);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastRunTime", this.LastRunTime);
        this.setParamSimple(map, prefix + "NextRunTime", this.NextRunTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamObj(map, prefix + "AgentConfig.", this.AgentConfig);
        this.setParamSimple(map, prefix + "EffectiveStart", this.EffectiveStart);
        this.setParamSimple(map, prefix + "EffectiveEnd", this.EffectiveEnd);
        this.setParamArrayObj(map, prefix + "DeliveryTargetSet.", this.DeliveryTargetSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

