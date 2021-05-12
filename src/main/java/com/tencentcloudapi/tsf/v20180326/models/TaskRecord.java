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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskRecord extends AbstractModel{

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 执行类型
    */
    @SerializedName("ExecuteType")
    @Expose
    private String ExecuteType;

    /**
    * 任务内容，长度限制65535字节
    */
    @SerializedName("TaskContent")
    @Expose
    private String TaskContent;

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 超时时间
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * 重试次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * 重试间隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
    * 触发规则
    */
    @SerializedName("TaskRule")
    @Expose
    private TaskRule TaskRule;

    /**
    * 是否启用任务,ENABLED/DISABLED
    */
    @SerializedName("TaskState")
    @Expose
    private String TaskState;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 判断任务成功的操作符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessOperator")
    @Expose
    private String SuccessOperator;

    /**
    * 判断任务成功的阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessRatio")
    @Expose
    private Long SuccessRatio;

    /**
    * 分片数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * 高级设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvanceSettings")
    @Expose
    private AdvanceSettings AdvanceSettings;

    /**
    * 分片参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShardArguments")
    @Expose
    private ShardArgument [] ShardArguments;

    /**
    * 所属工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BelongFlowIds")
    @Expose
    private String [] BelongFlowIds;

    /**
    * 任务历史ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskLogId")
    @Expose
    private String TaskLogId;

    /**
    * 触发类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * 任务参数，长度限制10000个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskArgument")
    @Expose
    private String TaskArgument;

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务类型 
     * @return TaskType 任务类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
     * @param TaskType 任务类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 执行类型 
     * @return ExecuteType 执行类型
     */
    public String getExecuteType() {
        return this.ExecuteType;
    }

    /**
     * Set 执行类型
     * @param ExecuteType 执行类型
     */
    public void setExecuteType(String ExecuteType) {
        this.ExecuteType = ExecuteType;
    }

    /**
     * Get 任务内容，长度限制65535字节 
     * @return TaskContent 任务内容，长度限制65535字节
     */
    public String getTaskContent() {
        return this.TaskContent;
    }

    /**
     * Set 任务内容，长度限制65535字节
     * @param TaskContent 任务内容，长度限制65535字节
     */
    public void setTaskContent(String TaskContent) {
        this.TaskContent = TaskContent;
    }

    /**
     * Get 分组ID 
     * @return GroupId 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
     * @param GroupId 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 超时时间 
     * @return TimeOut 超时时间
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set 超时时间
     * @param TimeOut 超时时间
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get 重试次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryCount 重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set 重试次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryCount 重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get 重试间隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryInterval 重试间隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set 重试间隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryInterval 重试间隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    /**
     * Get 触发规则 
     * @return TaskRule 触发规则
     */
    public TaskRule getTaskRule() {
        return this.TaskRule;
    }

    /**
     * Set 触发规则
     * @param TaskRule 触发规则
     */
    public void setTaskRule(TaskRule TaskRule) {
        this.TaskRule = TaskRule;
    }

    /**
     * Get 是否启用任务,ENABLED/DISABLED 
     * @return TaskState 是否启用任务,ENABLED/DISABLED
     */
    public String getTaskState() {
        return this.TaskState;
    }

    /**
     * Set 是否启用任务,ENABLED/DISABLED
     * @param TaskState 是否启用任务,ENABLED/DISABLED
     */
    public void setTaskState(String TaskState) {
        this.TaskState = TaskState;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 判断任务成功的操作符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessOperator 判断任务成功的操作符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuccessOperator() {
        return this.SuccessOperator;
    }

    /**
     * Set 判断任务成功的操作符
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessOperator 判断任务成功的操作符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessOperator(String SuccessOperator) {
        this.SuccessOperator = SuccessOperator;
    }

    /**
     * Get 判断任务成功的阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessRatio 判断任务成功的阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessRatio() {
        return this.SuccessRatio;
    }

    /**
     * Set 判断任务成功的阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessRatio 判断任务成功的阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessRatio(Long SuccessRatio) {
        this.SuccessRatio = SuccessRatio;
    }

    /**
     * Get 分片数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardCount 分片数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set 分片数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardCount 分片数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get 高级设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvanceSettings 高级设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvanceSettings getAdvanceSettings() {
        return this.AdvanceSettings;
    }

    /**
     * Set 高级设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvanceSettings 高级设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvanceSettings(AdvanceSettings AdvanceSettings) {
        this.AdvanceSettings = AdvanceSettings;
    }

    /**
     * Get 分片参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShardArguments 分片参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ShardArgument [] getShardArguments() {
        return this.ShardArguments;
    }

    /**
     * Set 分片参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShardArguments 分片参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShardArguments(ShardArgument [] ShardArguments) {
        this.ShardArguments = ShardArguments;
    }

    /**
     * Get 所属工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BelongFlowIds 所属工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBelongFlowIds() {
        return this.BelongFlowIds;
    }

    /**
     * Set 所属工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BelongFlowIds 所属工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBelongFlowIds(String [] BelongFlowIds) {
        this.BelongFlowIds = BelongFlowIds;
    }

    /**
     * Get 任务历史ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskLogId 任务历史ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskLogId() {
        return this.TaskLogId;
    }

    /**
     * Set 任务历史ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskLogId 任务历史ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskLogId(String TaskLogId) {
        this.TaskLogId = TaskLogId;
    }

    /**
     * Get 触发类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 任务参数，长度限制10000个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskArgument 任务参数，长度限制10000个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskArgument() {
        return this.TaskArgument;
    }

    /**
     * Set 任务参数，长度限制10000个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskArgument 任务参数，长度限制10000个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskArgument(String TaskArgument) {
        this.TaskArgument = TaskArgument;
    }

    public TaskRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskRecord(TaskRecord source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ExecuteType != null) {
            this.ExecuteType = new String(source.ExecuteType);
        }
        if (source.TaskContent != null) {
            this.TaskContent = new String(source.TaskContent);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.TimeOut != null) {
            this.TimeOut = new Long(source.TimeOut);
        }
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.RetryInterval != null) {
            this.RetryInterval = new Long(source.RetryInterval);
        }
        if (source.TaskRule != null) {
            this.TaskRule = new TaskRule(source.TaskRule);
        }
        if (source.TaskState != null) {
            this.TaskState = new String(source.TaskState);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SuccessOperator != null) {
            this.SuccessOperator = new String(source.SuccessOperator);
        }
        if (source.SuccessRatio != null) {
            this.SuccessRatio = new Long(source.SuccessRatio);
        }
        if (source.ShardCount != null) {
            this.ShardCount = new Long(source.ShardCount);
        }
        if (source.AdvanceSettings != null) {
            this.AdvanceSettings = new AdvanceSettings(source.AdvanceSettings);
        }
        if (source.ShardArguments != null) {
            this.ShardArguments = new ShardArgument[source.ShardArguments.length];
            for (int i = 0; i < source.ShardArguments.length; i++) {
                this.ShardArguments[i] = new ShardArgument(source.ShardArguments[i]);
            }
        }
        if (source.BelongFlowIds != null) {
            this.BelongFlowIds = new String[source.BelongFlowIds.length];
            for (int i = 0; i < source.BelongFlowIds.length; i++) {
                this.BelongFlowIds[i] = new String(source.BelongFlowIds[i]);
            }
        }
        if (source.TaskLogId != null) {
            this.TaskLogId = new String(source.TaskLogId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.TaskArgument != null) {
            this.TaskArgument = new String(source.TaskArgument);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ExecuteType", this.ExecuteType);
        this.setParamSimple(map, prefix + "TaskContent", this.TaskContent);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);
        this.setParamObj(map, prefix + "TaskRule.", this.TaskRule);
        this.setParamSimple(map, prefix + "TaskState", this.TaskState);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SuccessOperator", this.SuccessOperator);
        this.setParamSimple(map, prefix + "SuccessRatio", this.SuccessRatio);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamObj(map, prefix + "AdvanceSettings.", this.AdvanceSettings);
        this.setParamArrayObj(map, prefix + "ShardArguments.", this.ShardArguments);
        this.setParamArraySimple(map, prefix + "BelongFlowIds.", this.BelongFlowIds);
        this.setParamSimple(map, prefix + "TaskLogId", this.TaskLogId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "TaskArgument", this.TaskArgument);

    }
}

