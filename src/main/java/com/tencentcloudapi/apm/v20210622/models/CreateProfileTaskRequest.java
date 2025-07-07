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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProfileTaskRequest extends AbstractModel {

    /**
    * 应用名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * APM业务系统ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 应用实例（在线）
    */
    @SerializedName("ServiceInstance")
    @Expose
    private String ServiceInstance;

    /**
    * 事件类型（cpu、alloc）
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * 任务持续时长(单位：毫秒)，范围限制在5~180秒
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 执行次数，范围限制在1~100次
    */
    @SerializedName("AllTimes")
    @Expose
    private Long AllTimes;

    /**
    * 开始时间戳，0代表从当前开始(单位：秒)
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 任务执行间隔(单位：毫秒)，范围限制在10~600秒，不可小于1.5倍的Duration
    */
    @SerializedName("TaskInterval")
    @Expose
    private Long TaskInterval;

    /**
     * Get 应用名称 
     * @return ServiceName 应用名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 应用名称
     * @param ServiceName 应用名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get APM业务系统ID 
     * @return InstanceId APM业务系统ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set APM业务系统ID
     * @param InstanceId APM业务系统ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 应用实例（在线） 
     * @return ServiceInstance 应用实例（在线）
     */
    public String getServiceInstance() {
        return this.ServiceInstance;
    }

    /**
     * Set 应用实例（在线）
     * @param ServiceInstance 应用实例（在线）
     */
    public void setServiceInstance(String ServiceInstance) {
        this.ServiceInstance = ServiceInstance;
    }

    /**
     * Get 事件类型（cpu、alloc） 
     * @return Event 事件类型（cpu、alloc）
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set 事件类型（cpu、alloc）
     * @param Event 事件类型（cpu、alloc）
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get 任务持续时长(单位：毫秒)，范围限制在5~180秒 
     * @return Duration 任务持续时长(单位：毫秒)，范围限制在5~180秒
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 任务持续时长(单位：毫秒)，范围限制在5~180秒
     * @param Duration 任务持续时长(单位：毫秒)，范围限制在5~180秒
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 执行次数，范围限制在1~100次 
     * @return AllTimes 执行次数，范围限制在1~100次
     */
    public Long getAllTimes() {
        return this.AllTimes;
    }

    /**
     * Set 执行次数，范围限制在1~100次
     * @param AllTimes 执行次数，范围限制在1~100次
     */
    public void setAllTimes(Long AllTimes) {
        this.AllTimes = AllTimes;
    }

    /**
     * Get 开始时间戳，0代表从当前开始(单位：秒) 
     * @return StartTime 开始时间戳，0代表从当前开始(单位：秒)
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间戳，0代表从当前开始(单位：秒)
     * @param StartTime 开始时间戳，0代表从当前开始(单位：秒)
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务执行间隔(单位：毫秒)，范围限制在10~600秒，不可小于1.5倍的Duration 
     * @return TaskInterval 任务执行间隔(单位：毫秒)，范围限制在10~600秒，不可小于1.5倍的Duration
     */
    public Long getTaskInterval() {
        return this.TaskInterval;
    }

    /**
     * Set 任务执行间隔(单位：毫秒)，范围限制在10~600秒，不可小于1.5倍的Duration
     * @param TaskInterval 任务执行间隔(单位：毫秒)，范围限制在10~600秒，不可小于1.5倍的Duration
     */
    public void setTaskInterval(Long TaskInterval) {
        this.TaskInterval = TaskInterval;
    }

    public CreateProfileTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProfileTaskRequest(CreateProfileTaskRequest source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceInstance != null) {
            this.ServiceInstance = new String(source.ServiceInstance);
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.AllTimes != null) {
            this.AllTimes = new Long(source.AllTimes);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.TaskInterval != null) {
            this.TaskInterval = new Long(source.TaskInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ServiceInstance", this.ServiceInstance);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "AllTimes", this.AllTimes);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskInterval", this.TaskInterval);

    }
}

