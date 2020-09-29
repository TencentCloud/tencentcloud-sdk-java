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

public class CreateTaskRequest extends AbstractModel{

    /**
    * 任务名称，任务长度64字符
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务内容，长度限制65536个字节
    */
    @SerializedName("TaskContent")
    @Expose
    private String TaskContent;

    /**
    * 执行类型，UNICAST/BROADCAST
    */
    @SerializedName("ExecuteType")
    @Expose
    private String ExecuteType;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务超时时间， 时间单位 ms
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * 部署组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 触发规则
    */
    @SerializedName("TaskRule")
    @Expose
    private TaskRule TaskRule;

    /**
    * 重试次数，0 <= RetryCount<= 10
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * 重试间隔， 0 <= RetryInterval <= 600000， 时间单位 ms
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

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
    * 判断任务成功的操作符
    */
    @SerializedName("SuccessOperator")
    @Expose
    private String SuccessOperator;

    /**
    * 判断任务成功率的阈值，如99.99
    */
    @SerializedName("SuccessRatio")
    @Expose
    private String SuccessRatio;

    /**
    * 高级设置
    */
    @SerializedName("AdvanceSettings")
    @Expose
    private AdvanceSettings AdvanceSettings;

    /**
    * 任务参数，长度限制10000个字符
    */
    @SerializedName("TaskArgument")
    @Expose
    private String TaskArgument;

    /**
     * Get 任务名称，任务长度64字符 
     * @return TaskName 任务名称，任务长度64字符
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称，任务长度64字符
     * @param TaskName 任务名称，任务长度64字符
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务内容，长度限制65536个字节 
     * @return TaskContent 任务内容，长度限制65536个字节
     */
    public String getTaskContent() {
        return this.TaskContent;
    }

    /**
     * Set 任务内容，长度限制65536个字节
     * @param TaskContent 任务内容，长度限制65536个字节
     */
    public void setTaskContent(String TaskContent) {
        this.TaskContent = TaskContent;
    }

    /**
     * Get 执行类型，UNICAST/BROADCAST 
     * @return ExecuteType 执行类型，UNICAST/BROADCAST
     */
    public String getExecuteType() {
        return this.ExecuteType;
    }

    /**
     * Set 执行类型，UNICAST/BROADCAST
     * @param ExecuteType 执行类型，UNICAST/BROADCAST
     */
    public void setExecuteType(String ExecuteType) {
        this.ExecuteType = ExecuteType;
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
     * Get 任务超时时间， 时间单位 ms 
     * @return TimeOut 任务超时时间， 时间单位 ms
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set 任务超时时间， 时间单位 ms
     * @param TimeOut 任务超时时间， 时间单位 ms
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get 部署组ID 
     * @return GroupId 部署组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
     * @param GroupId 部署组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
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
     * Get 重试次数，0 <= RetryCount<= 10 
     * @return RetryCount 重试次数，0 <= RetryCount<= 10
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set 重试次数，0 <= RetryCount<= 10
     * @param RetryCount 重试次数，0 <= RetryCount<= 10
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get 重试间隔， 0 <= RetryInterval <= 600000， 时间单位 ms 
     * @return RetryInterval 重试间隔， 0 <= RetryInterval <= 600000， 时间单位 ms
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set 重试间隔， 0 <= RetryInterval <= 600000， 时间单位 ms
     * @param RetryInterval 重试间隔， 0 <= RetryInterval <= 600000， 时间单位 ms
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
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
     * Get 判断任务成功的操作符 
     * @return SuccessOperator 判断任务成功的操作符
     */
    public String getSuccessOperator() {
        return this.SuccessOperator;
    }

    /**
     * Set 判断任务成功的操作符
     * @param SuccessOperator 判断任务成功的操作符
     */
    public void setSuccessOperator(String SuccessOperator) {
        this.SuccessOperator = SuccessOperator;
    }

    /**
     * Get 判断任务成功率的阈值，如99.99 
     * @return SuccessRatio 判断任务成功率的阈值，如99.99
     */
    public String getSuccessRatio() {
        return this.SuccessRatio;
    }

    /**
     * Set 判断任务成功率的阈值，如99.99
     * @param SuccessRatio 判断任务成功率的阈值，如99.99
     */
    public void setSuccessRatio(String SuccessRatio) {
        this.SuccessRatio = SuccessRatio;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskContent", this.TaskContent);
        this.setParamSimple(map, prefix + "ExecuteType", this.ExecuteType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "TaskRule.", this.TaskRule);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);
        this.setParamSimple(map, prefix + "ShardCount", this.ShardCount);
        this.setParamArrayObj(map, prefix + "ShardArguments.", this.ShardArguments);
        this.setParamSimple(map, prefix + "SuccessOperator", this.SuccessOperator);
        this.setParamSimple(map, prefix + "SuccessRatio", this.SuccessRatio);
        this.setParamObj(map, prefix + "AdvanceSettings.", this.AdvanceSettings);
        this.setParamSimple(map, prefix + "TaskArgument", this.TaskArgument);

    }
}

