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

public class DescribeTaskListRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 分页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，取Limit整数倍（自动向下取整）
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 项目Id
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 任务类型
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
    * 起始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 终止时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务状态
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 分页大小 
     * @return Limit 分页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小
     * @param Limit 分页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，取Limit整数倍（自动向下取整） 
     * @return Offset 偏移量，取Limit整数倍（自动向下取整）
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取Limit整数倍（自动向下取整）
     * @param Offset 偏移量，取Limit整数倍（自动向下取整）
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 项目Id 
     * @return ProjectIds 项目Id
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目Id
     * @param ProjectIds 项目Id
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 任务类型 
     * @return TaskTypes 任务类型
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set 任务类型
     * @param TaskTypes 任务类型
     */
    public void setTaskTypes(String [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * Get 起始时间 
     * @return BeginTime 起始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 起始时间
     * @param BeginTime 起始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 终止时间 
     * @return EndTime 终止时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 终止时间
     * @param EndTime 终止时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务状态 
     * @return TaskStatus 任务状态
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
     * @param TaskStatus 任务状态
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);

    }
}

