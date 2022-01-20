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

public class ModifyTaskRequest extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

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
    * 任务内容
    */
    @SerializedName("TaskContent")
    @Expose
    private String TaskContent;

    /**
    * 任务执行类型
    */
    @SerializedName("ExecuteType")
    @Expose
    private String ExecuteType;

    /**
    * 触发规则
    */
    @SerializedName("TaskRule")
    @Expose
    private TaskRule TaskRule;

    /**
    * 超时时间，单位 ms
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分片数量
    */
    @SerializedName("ShardCount")
    @Expose
    private Long ShardCount;

    /**
    * 分片参数
    */
    @SerializedName("ShardArguments")
    @Expose
    private ShardArgument [] ShardArguments;

    /**
    * 高级设置
    */
    @SerializedName("AdvanceSettings")
    @Expose
    private AdvanceSettings AdvanceSettings;

    /**
    * 判断任务成功的操作符 GT/GTE
    */
    @SerializedName("SuccessOperator")
    @Expose
    private String SuccessOperator;

    /**
    * 判断任务成功率的阈值
    */
    @SerializedName("SuccessRatio")
    @Expose
    private Long SuccessRatio;

    /**
    * 重试次数
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * 重试间隔
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
    * 任务参数，长度限制10000个字符
    */
    @SerializedName("TaskArgument")
    @Expose
    private String TaskArgument;

    /**
    * 无
    */
    @SerializedName("ProgramIdList")
    @Expose
    private String [] ProgramIdList;

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
     * Get 任务内容 
     * @return TaskContent 任务内容
     */
    public String getTaskContent() {
        return this.TaskContent;
    }

    /**
     * Set 任务内容
     * @param TaskContent 任务内容
     */
    public void setTaskContent(String TaskContent) {
        this.TaskContent = TaskContent;
    }

    /**
     * Get 任务执行类型 
     * @return ExecuteType 任务执行类型
     */
    public String getExecuteType() {
        return this.ExecuteType;
    }

    /**
     * Set 任务执行类型
     * @param ExecuteType 任务执行类型
     */
    public void setExecuteType(String ExecuteType) {
        this.ExecuteType = ExecuteType;
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
     * Get 超时时间，单位 ms 
     * @return TimeOut 超时时间，单位 ms
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set 超时时间，单位 ms
     * @param TimeOut 超时时间，单位 ms
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
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
     * Get 分片数量 
     * @return ShardCount 分片数量
     */
    public Long getShardCount() {
        return this.ShardCount;
    }

    /**
     * Set 分片数量
     * @param ShardCount 分片数量
     */
    public void setShardCount(Long ShardCount) {
        this.ShardCount = ShardCount;
    }

    /**
     * Get 分片参数 
     * @return ShardArguments 分片参数
     */
    public ShardArgument [] getShardArguments() {
        return this.ShardArguments;
    }

    /**
     * Set 分片参数
     * @param ShardArguments 分片参数
     */
    public void setShardArguments(ShardArgument [] ShardArguments) {
        this.ShardArguments = ShardArguments;
    }

    /**
     * Get 高级设置 
     * @return AdvanceSettings 高级设置
     */
    public AdvanceSettings getAdvanceSettings() {
        return this.AdvanceSettings;
    }

    /**
     * Set 高级设置
     * @param AdvanceSettings 高级设置
     */
    public void setAdvanceSettings(AdvanceSettings AdvanceSettings) {
        this.AdvanceSettings = AdvanceSettings;
    }

    /**
     * Get 判断任务成功的操作符 GT/GTE 
     * @return SuccessOperator 判断任务成功的操作符 GT/GTE
     */
    public String getSuccessOperator() {
        return this.SuccessOperator;
    }

    /**
     * Set 判断任务成功的操作符 GT/GTE
     * @param SuccessOperator 判断任务成功的操作符 GT/GTE
     */
    public void setSuccessOperator(String SuccessOperator) {
        this.SuccessOperator = SuccessOperator;
    }

    /**
     * Get 判断任务成功率的阈值 
     * @return SuccessRatio 判断任务成功率的阈值
     */
    public Long getSuccessRatio() {
        return this.SuccessRatio;
    }

    /**
     * Set 判断任务成功率的阈值
     * @param SuccessRatio 判断任务成功率的阈值
     */
    public void setSuccessRatio(Long SuccessRatio) {
        this.SuccessRatio = SuccessRatio;
    }

    /**
     * Get 重试次数 
     * @return RetryCount 重试次数
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set 重试次数
     * @param RetryCount 重试次数
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get 重试间隔 
     * @return RetryInterval 重试间隔
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set 重试间隔
     * @param RetryInterval 重试间隔
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    /**
     * Get 任务参数，长度限制10000个字符 
     * @return TaskArgument 任务参数，长度限制10000个字符
     */
    public String getTaskArgument() {
        return this.TaskArgument;
    }

    /**
     * Set 任务参数，长度限制10000个字符
     * @param TaskArgument 任务参数，长度限制10000个字符
     */
    public void setTaskArgument(String TaskArgument) {
        this.TaskArgument = TaskArgument;
    }

    /**
     * Get 无 
     * @return ProgramIdList 无
     */
    public String [] getProgramIdList() {
        return this.ProgramIdList;
    }

    /**
     * Set 无
     * @param ProgramIdList 无
     */
    public void setProgramIdList(String [] ProgramIdList) {
        this.ProgramIdList = ProgramIdList;
    }

    public ModifyTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskRequest(ModifyTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskContent != null) {
            this.TaskContent = new String(source.TaskContent);
        }
        if (source.ExecuteType != null) {
            this.ExecuteType = new String(source.ExecuteType);
        }
        if (source.TaskRule != null) {
            this.TaskRule = new TaskRule(source.TaskRule);
        }
        if (source.TimeOut != null) {
            this.TimeOut = new Long(source.TimeOut);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ShardCount != null) {
            this.ShardCount = new Long(source.ShardCount);
        }
        if (source.ShardArguments != null) {
            this.ShardArguments = new ShardArgument[source.ShardArguments.length];
            for (int i = 0; i < source.ShardArguments.length; i++) {
                this.ShardArguments[i] = new ShardArgument(source.ShardArguments[i]);
            }
        }
        if (source.AdvanceSettings != null) {
            this.AdvanceSettings = new AdvanceSettings(source.AdvanceSettings);
        }
        if (source.SuccessOperator != null) {
            this.SuccessOperator = new String(source.SuccessOperator);
        }
        if (source.SuccessRatio != null) {
            this.SuccessRatio = new Long(source.SuccessRatio);
        }
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.RetryInterval != null) {
            this.RetryInterval = new Long(source.RetryInterval);
        }
        if (source.TaskArgument != null) {
            this.TaskArgument = new String(source.TaskArgument);
        }
        if (source.ProgramIdList != null) {
            this.ProgramIdList = new String[source.ProgramIdList.length];
            for (int i = 0; i < source.ProgramIdList.length; i++) {
                this.ProgramIdList[i] = new String(source.ProgramIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskContent", this.TaskContent);
        this.setParamSimple(map, prefix + "ExecuteType", this.ExecuteType);
        this.setParamObj(map, prefix + "TaskRule.", this.TaskRule);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamArrayObj(map, prefix + "ShardArguments.", this.ShardArguments);
        this.setParamObj(map, prefix + "AdvanceSettings.", this.AdvanceSettings);
        this.setParamSimple(map, prefix + "SuccessOperator", this.SuccessOperator);
        this.setParamSimple(map, prefix + "SuccessRatio", this.SuccessRatio);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);
        this.setParamSimple(map, prefix + "TaskArgument", this.TaskArgument);
        this.setParamArraySimple(map, prefix + "ProgramIdList.", this.ProgramIdList);

    }
}

