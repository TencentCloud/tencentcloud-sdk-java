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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskInfoResponse extends AbstractModel{

    /**
    * 任务状态preparing:待执行，running：执行中，succeed：成功，failed：失败，error 执行出错
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 实例的ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务信息，错误时显示错误信息。执行中与成功则为空
    */
    @SerializedName("TaskMessage")
    @Expose
    private String TaskMessage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态preparing:待执行，running：执行中，succeed：成功，failed：失败，error 执行出错 
     * @return Status 任务状态preparing:待执行，running：执行中，succeed：成功，failed：失败，error 执行出错
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态preparing:待执行，running：执行中，succeed：成功，failed：失败，error 执行出错
     * @param Status 任务状态preparing:待执行，running：执行中，succeed：成功，failed：失败，error 执行出错
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务开始时间 
     * @return StartTime 任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间
     * @param StartTime 任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
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
     * Get 实例的ID 
     * @return InstanceId 实例的ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例的ID
     * @param InstanceId 实例的ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 任务信息，错误时显示错误信息。执行中与成功则为空 
     * @return TaskMessage 任务信息，错误时显示错误信息。执行中与成功则为空
     */
    public String getTaskMessage() {
        return this.TaskMessage;
    }

    /**
     * Set 任务信息，错误时显示错误信息。执行中与成功则为空
     * @param TaskMessage 任务信息，错误时显示错误信息。执行中与成功则为空
     */
    public void setTaskMessage(String TaskMessage) {
        this.TaskMessage = TaskMessage;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TaskMessage", this.TaskMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

