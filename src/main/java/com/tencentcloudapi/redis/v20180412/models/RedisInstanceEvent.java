/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisInstanceEvent extends AbstractModel {

    /**
    * 事件 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 事件类型，当前仅支持配置实例迁移、资源腾挪、机房裁撤相关的运维操作。该参数仅支持配置为 **InstanceMigration**。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件等级根据其影响严重程度和紧急程度进行分级，由重至轻依次为关键、重要、中等、一般。
- Critical：关键
- High：重要
- Middle：中等
- Low：一般
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * 事件计划执行日期。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionDate")
    @Expose
    private String ExecutionDate;

    /**
    * 事件计划执行开始时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 事件计划执行结束时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 运维事件最迟执行的日期，即该事件必须在该日期之前完成，否则可能会对业务产生影响。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestExecutionDate")
    @Expose
    private String LatestExecutionDate;

    /**
    * 事件当前状态。
- Waiting：未到达执行日期或不在维护时间窗内的事件。
- Running：在维护时间窗内，正在执行维护的事件。
- Finished：已全部完成维护的事件。
- Canceled：已取消执行的事件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 事件执行任务完成时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskEndTime")
    @Expose
    private String TaskEndTime;

    /**
    * 事件影响信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EffectInfo")
    @Expose
    private String EffectInfo;

    /**
    * 事件最初计划执行日期。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitialExecutionDate")
    @Expose
    private String InitialExecutionDate;

    /**
     * Get 事件 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 事件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 事件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 事件 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 实例 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 事件类型，当前仅支持配置实例迁移、资源腾挪、机房裁撤相关的运维操作。该参数仅支持配置为 **InstanceMigration**。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 事件类型，当前仅支持配置实例迁移、资源腾挪、机房裁撤相关的运维操作。该参数仅支持配置为 **InstanceMigration**。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件类型，当前仅支持配置实例迁移、资源腾挪、机房裁撤相关的运维操作。该参数仅支持配置为 **InstanceMigration**。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 事件类型，当前仅支持配置实例迁移、资源腾挪、机房裁撤相关的运维操作。该参数仅支持配置为 **InstanceMigration**。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件等级根据其影响严重程度和紧急程度进行分级，由重至轻依次为关键、重要、中等、一般。
- Critical：关键
- High：重要
- Middle：中等
- Low：一般
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grade 事件等级根据其影响严重程度和紧急程度进行分级，由重至轻依次为关键、重要、中等、一般。
- Critical：关键
- High：重要
- Middle：中等
- Low：一般
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set 事件等级根据其影响严重程度和紧急程度进行分级，由重至轻依次为关键、重要、中等、一般。
- Critical：关键
- High：重要
- Middle：中等
- Low：一般
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grade 事件等级根据其影响严重程度和紧急程度进行分级，由重至轻依次为关键、重要、中等、一般。
- Critical：关键
- High：重要
- Middle：中等
- Low：一般
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 事件计划执行日期。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionDate 事件计划执行日期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionDate() {
        return this.ExecutionDate;
    }

    /**
     * Set 事件计划执行日期。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionDate 事件计划执行日期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionDate(String ExecutionDate) {
        this.ExecutionDate = ExecutionDate;
    }

    /**
     * Get 事件计划执行开始时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 事件计划执行开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 事件计划执行开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 事件计划执行开始时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 事件计划执行结束时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 事件计划执行结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 事件计划执行结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 事件计划执行结束时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 运维事件最迟执行的日期，即该事件必须在该日期之前完成，否则可能会对业务产生影响。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestExecutionDate 运维事件最迟执行的日期，即该事件必须在该日期之前完成，否则可能会对业务产生影响。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestExecutionDate() {
        return this.LatestExecutionDate;
    }

    /**
     * Set 运维事件最迟执行的日期，即该事件必须在该日期之前完成，否则可能会对业务产生影响。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestExecutionDate 运维事件最迟执行的日期，即该事件必须在该日期之前完成，否则可能会对业务产生影响。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestExecutionDate(String LatestExecutionDate) {
        this.LatestExecutionDate = LatestExecutionDate;
    }

    /**
     * Get 事件当前状态。
- Waiting：未到达执行日期或不在维护时间窗内的事件。
- Running：在维护时间窗内，正在执行维护的事件。
- Finished：已全部完成维护的事件。
- Canceled：已取消执行的事件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 事件当前状态。
- Waiting：未到达执行日期或不在维护时间窗内的事件。
- Running：在维护时间窗内，正在执行维护的事件。
- Finished：已全部完成维护的事件。
- Canceled：已取消执行的事件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 事件当前状态。
- Waiting：未到达执行日期或不在维护时间窗内的事件。
- Running：在维护时间窗内，正在执行维护的事件。
- Finished：已全部完成维护的事件。
- Canceled：已取消执行的事件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 事件当前状态。
- Waiting：未到达执行日期或不在维护时间窗内的事件。
- Running：在维护时间窗内，正在执行维护的事件。
- Finished：已全部完成维护的事件。
- Canceled：已取消执行的事件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 事件执行任务完成时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskEndTime 事件执行任务完成时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskEndTime() {
        return this.TaskEndTime;
    }

    /**
     * Set 事件执行任务完成时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskEndTime 事件执行任务完成时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskEndTime(String TaskEndTime) {
        this.TaskEndTime = TaskEndTime;
    }

    /**
     * Get 事件影响信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EffectInfo 事件影响信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEffectInfo() {
        return this.EffectInfo;
    }

    /**
     * Set 事件影响信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EffectInfo 事件影响信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEffectInfo(String EffectInfo) {
        this.EffectInfo = EffectInfo;
    }

    /**
     * Get 事件最初计划执行日期。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitialExecutionDate 事件最初计划执行日期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInitialExecutionDate() {
        return this.InitialExecutionDate;
    }

    /**
     * Set 事件最初计划执行日期。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitialExecutionDate 事件最初计划执行日期。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitialExecutionDate(String InitialExecutionDate) {
        this.InitialExecutionDate = InitialExecutionDate;
    }

    public RedisInstanceEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisInstanceEvent(RedisInstanceEvent source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.ExecutionDate != null) {
            this.ExecutionDate = new String(source.ExecutionDate);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LatestExecutionDate != null) {
            this.LatestExecutionDate = new String(source.LatestExecutionDate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskEndTime != null) {
            this.TaskEndTime = new String(source.TaskEndTime);
        }
        if (source.EffectInfo != null) {
            this.EffectInfo = new String(source.EffectInfo);
        }
        if (source.InitialExecutionDate != null) {
            this.InitialExecutionDate = new String(source.InitialExecutionDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamSimple(map, prefix + "ExecutionDate", this.ExecutionDate);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LatestExecutionDate", this.LatestExecutionDate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskEndTime", this.TaskEndTime);
        this.setParamSimple(map, prefix + "EffectInfo", this.EffectInfo);
        this.setParamSimple(map, prefix + "InitialExecutionDate", this.InitialExecutionDate);

    }
}

