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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskRequest extends AbstractModel{

    /**
    * 任务类型，取值为 “UpdateShadow” 或者 “PublishMessage”
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 执行任务的产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 执行任务的设备名的正则表达式
    */
    @SerializedName("DeviceNameFilter")
    @Expose
    private String DeviceNameFilter;

    /**
    * 任务开始执行的时间。 取值为 Unix 时间戳，单位秒，且需大于等于当前时间时间戳，0为系统当前时间时间戳，即立即执行，最大为当前时间86400秒后，超过则取值为当前时间86400秒后
    */
    @SerializedName("ScheduleTimeInSeconds")
    @Expose
    private Long ScheduleTimeInSeconds;

    /**
    * 任务描述细节，描述见下 Task
    */
    @SerializedName("Tasks")
    @Expose
    private Task Tasks;

    /**
    * 最长执行时间，单位秒，被调度后超过此时间仍未有结果则视为任务失败。取值为0-86400，默认为86400
    */
    @SerializedName("MaxExecutionTimeInSeconds")
    @Expose
    private Long MaxExecutionTimeInSeconds;

    /**
     * Get 任务类型，取值为 “UpdateShadow” 或者 “PublishMessage” 
     * @return TaskType 任务类型，取值为 “UpdateShadow” 或者 “PublishMessage”
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，取值为 “UpdateShadow” 或者 “PublishMessage”
     * @param TaskType 任务类型，取值为 “UpdateShadow” 或者 “PublishMessage”
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 执行任务的产品ID 
     * @return ProductId 执行任务的产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 执行任务的产品ID
     * @param ProductId 执行任务的产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 执行任务的设备名的正则表达式 
     * @return DeviceNameFilter 执行任务的设备名的正则表达式
     */
    public String getDeviceNameFilter() {
        return this.DeviceNameFilter;
    }

    /**
     * Set 执行任务的设备名的正则表达式
     * @param DeviceNameFilter 执行任务的设备名的正则表达式
     */
    public void setDeviceNameFilter(String DeviceNameFilter) {
        this.DeviceNameFilter = DeviceNameFilter;
    }

    /**
     * Get 任务开始执行的时间。 取值为 Unix 时间戳，单位秒，且需大于等于当前时间时间戳，0为系统当前时间时间戳，即立即执行，最大为当前时间86400秒后，超过则取值为当前时间86400秒后 
     * @return ScheduleTimeInSeconds 任务开始执行的时间。 取值为 Unix 时间戳，单位秒，且需大于等于当前时间时间戳，0为系统当前时间时间戳，即立即执行，最大为当前时间86400秒后，超过则取值为当前时间86400秒后
     */
    public Long getScheduleTimeInSeconds() {
        return this.ScheduleTimeInSeconds;
    }

    /**
     * Set 任务开始执行的时间。 取值为 Unix 时间戳，单位秒，且需大于等于当前时间时间戳，0为系统当前时间时间戳，即立即执行，最大为当前时间86400秒后，超过则取值为当前时间86400秒后
     * @param ScheduleTimeInSeconds 任务开始执行的时间。 取值为 Unix 时间戳，单位秒，且需大于等于当前时间时间戳，0为系统当前时间时间戳，即立即执行，最大为当前时间86400秒后，超过则取值为当前时间86400秒后
     */
    public void setScheduleTimeInSeconds(Long ScheduleTimeInSeconds) {
        this.ScheduleTimeInSeconds = ScheduleTimeInSeconds;
    }

    /**
     * Get 任务描述细节，描述见下 Task 
     * @return Tasks 任务描述细节，描述见下 Task
     */
    public Task getTasks() {
        return this.Tasks;
    }

    /**
     * Set 任务描述细节，描述见下 Task
     * @param Tasks 任务描述细节，描述见下 Task
     */
    public void setTasks(Task Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get 最长执行时间，单位秒，被调度后超过此时间仍未有结果则视为任务失败。取值为0-86400，默认为86400 
     * @return MaxExecutionTimeInSeconds 最长执行时间，单位秒，被调度后超过此时间仍未有结果则视为任务失败。取值为0-86400，默认为86400
     */
    public Long getMaxExecutionTimeInSeconds() {
        return this.MaxExecutionTimeInSeconds;
    }

    /**
     * Set 最长执行时间，单位秒，被调度后超过此时间仍未有结果则视为任务失败。取值为0-86400，默认为86400
     * @param MaxExecutionTimeInSeconds 最长执行时间，单位秒，被调度后超过此时间仍未有结果则视为任务失败。取值为0-86400，默认为86400
     */
    public void setMaxExecutionTimeInSeconds(Long MaxExecutionTimeInSeconds) {
        this.MaxExecutionTimeInSeconds = MaxExecutionTimeInSeconds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceNameFilter", this.DeviceNameFilter);
        this.setParamSimple(map, prefix + "ScheduleTimeInSeconds", this.ScheduleTimeInSeconds);
        this.setParamObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "MaxExecutionTimeInSeconds", this.MaxExecutionTimeInSeconds);

    }
}

