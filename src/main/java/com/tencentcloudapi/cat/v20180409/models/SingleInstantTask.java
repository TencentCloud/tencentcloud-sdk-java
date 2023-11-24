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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SingleInstantTask extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务地址
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 测试时间
    */
    @SerializedName("ProbeTime")
    @Expose
    private Long ProbeTime;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 成功率
    */
    @SerializedName("SuccessRate")
    @Expose
    private Float SuccessRate;

    /**
    * 节点数量
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 节点类型
    */
    @SerializedName("TaskCategory")
    @Expose
    private Long TaskCategory;

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
     * Get 任务地址 
     * @return TargetAddress 任务地址
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set 任务地址
     * @param TargetAddress 任务地址
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    /**
     * Get 任务类型 
     * @return TaskType 任务类型
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
     * @param TaskType 任务类型
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 测试时间 
     * @return ProbeTime 测试时间
     */
    public Long getProbeTime() {
        return this.ProbeTime;
    }

    /**
     * Set 测试时间
     * @param ProbeTime 测试时间
     */
    public void setProbeTime(Long ProbeTime) {
        this.ProbeTime = ProbeTime;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 成功率 
     * @return SuccessRate 成功率
     */
    public Float getSuccessRate() {
        return this.SuccessRate;
    }

    /**
     * Set 成功率
     * @param SuccessRate 成功率
     */
    public void setSuccessRate(Float SuccessRate) {
        this.SuccessRate = SuccessRate;
    }

    /**
     * Get 节点数量 
     * @return NodeCount 节点数量
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数量
     * @param NodeCount 节点数量
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 节点类型 
     * @return TaskCategory 节点类型
     */
    public Long getTaskCategory() {
        return this.TaskCategory;
    }

    /**
     * Set 节点类型
     * @param TaskCategory 节点类型
     */
    public void setTaskCategory(Long TaskCategory) {
        this.TaskCategory = TaskCategory;
    }

    public SingleInstantTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SingleInstantTask(SingleInstantTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TargetAddress != null) {
            this.TargetAddress = new String(source.TargetAddress);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.ProbeTime != null) {
            this.ProbeTime = new Long(source.ProbeTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SuccessRate != null) {
            this.SuccessRate = new Float(source.SuccessRate);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.TaskCategory != null) {
            this.TaskCategory = new Long(source.TaskCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TargetAddress", this.TargetAddress);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ProbeTime", this.ProbeTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SuccessRate", this.SuccessRate);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "TaskCategory", this.TaskCategory);

    }
}

