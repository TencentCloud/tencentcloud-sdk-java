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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutorTaskInstanceCount extends AbstractModel {

    /**
    * 执行资源组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorGroupId")
    @Expose
    private String ExecutorGroupId;

    /**
    * 数据开发中的任务类型绑定的资源组数量等待调度的任务实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulingTaskCount")
    @Expose
    private Long SchedulingTaskCount;

    /**
    * 数据开发中的任务类型绑定的资源组数量运行中的人物实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningInstanceCount")
    @Expose
    private Long RunningInstanceCount;

    /**
    * 数据开发中的任务类型绑定的资源组数量等待运行的任务实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitingInstanceCount")
    @Expose
    private Long WaitingInstanceCount;

    /**
    * 非离线开发调度中任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OthersTaskTypeSchedulingTaskCount")
    @Expose
    private Long OthersTaskTypeSchedulingTaskCount;

    /**
    * 非离线开发运行中实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OthersTaskTypeRunningInstanceCount")
    @Expose
    private Long OthersTaskTypeRunningInstanceCount;

    /**
    * 非离线开发等待运行实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OthersTaskTypeWaitingInstanceCount")
    @Expose
    private String OthersTaskTypeWaitingInstanceCount;

    /**
     * Get 执行资源组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorGroupId 执行资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorGroupId() {
        return this.ExecutorGroupId;
    }

    /**
     * Set 执行资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorGroupId 执行资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorGroupId(String ExecutorGroupId) {
        this.ExecutorGroupId = ExecutorGroupId;
    }

    /**
     * Get 数据开发中的任务类型绑定的资源组数量等待调度的任务实例数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulingTaskCount 数据开发中的任务类型绑定的资源组数量等待调度的任务实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSchedulingTaskCount() {
        return this.SchedulingTaskCount;
    }

    /**
     * Set 数据开发中的任务类型绑定的资源组数量等待调度的任务实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulingTaskCount 数据开发中的任务类型绑定的资源组数量等待调度的任务实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulingTaskCount(Long SchedulingTaskCount) {
        this.SchedulingTaskCount = SchedulingTaskCount;
    }

    /**
     * Get 数据开发中的任务类型绑定的资源组数量运行中的人物实例数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningInstanceCount 数据开发中的任务类型绑定的资源组数量运行中的人物实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunningInstanceCount() {
        return this.RunningInstanceCount;
    }

    /**
     * Set 数据开发中的任务类型绑定的资源组数量运行中的人物实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningInstanceCount 数据开发中的任务类型绑定的资源组数量运行中的人物实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningInstanceCount(Long RunningInstanceCount) {
        this.RunningInstanceCount = RunningInstanceCount;
    }

    /**
     * Get 数据开发中的任务类型绑定的资源组数量等待运行的任务实例数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitingInstanceCount 数据开发中的任务类型绑定的资源组数量等待运行的任务实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWaitingInstanceCount() {
        return this.WaitingInstanceCount;
    }

    /**
     * Set 数据开发中的任务类型绑定的资源组数量等待运行的任务实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitingInstanceCount 数据开发中的任务类型绑定的资源组数量等待运行的任务实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitingInstanceCount(Long WaitingInstanceCount) {
        this.WaitingInstanceCount = WaitingInstanceCount;
    }

    /**
     * Get 非离线开发调度中任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OthersTaskTypeSchedulingTaskCount 非离线开发调度中任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOthersTaskTypeSchedulingTaskCount() {
        return this.OthersTaskTypeSchedulingTaskCount;
    }

    /**
     * Set 非离线开发调度中任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OthersTaskTypeSchedulingTaskCount 非离线开发调度中任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOthersTaskTypeSchedulingTaskCount(Long OthersTaskTypeSchedulingTaskCount) {
        this.OthersTaskTypeSchedulingTaskCount = OthersTaskTypeSchedulingTaskCount;
    }

    /**
     * Get 非离线开发运行中实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OthersTaskTypeRunningInstanceCount 非离线开发运行中实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOthersTaskTypeRunningInstanceCount() {
        return this.OthersTaskTypeRunningInstanceCount;
    }

    /**
     * Set 非离线开发运行中实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OthersTaskTypeRunningInstanceCount 非离线开发运行中实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOthersTaskTypeRunningInstanceCount(Long OthersTaskTypeRunningInstanceCount) {
        this.OthersTaskTypeRunningInstanceCount = OthersTaskTypeRunningInstanceCount;
    }

    /**
     * Get 非离线开发等待运行实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OthersTaskTypeWaitingInstanceCount 非离线开发等待运行实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOthersTaskTypeWaitingInstanceCount() {
        return this.OthersTaskTypeWaitingInstanceCount;
    }

    /**
     * Set 非离线开发等待运行实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OthersTaskTypeWaitingInstanceCount 非离线开发等待运行实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOthersTaskTypeWaitingInstanceCount(String OthersTaskTypeWaitingInstanceCount) {
        this.OthersTaskTypeWaitingInstanceCount = OthersTaskTypeWaitingInstanceCount;
    }

    public ExecutorTaskInstanceCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutorTaskInstanceCount(ExecutorTaskInstanceCount source) {
        if (source.ExecutorGroupId != null) {
            this.ExecutorGroupId = new String(source.ExecutorGroupId);
        }
        if (source.SchedulingTaskCount != null) {
            this.SchedulingTaskCount = new Long(source.SchedulingTaskCount);
        }
        if (source.RunningInstanceCount != null) {
            this.RunningInstanceCount = new Long(source.RunningInstanceCount);
        }
        if (source.WaitingInstanceCount != null) {
            this.WaitingInstanceCount = new Long(source.WaitingInstanceCount);
        }
        if (source.OthersTaskTypeSchedulingTaskCount != null) {
            this.OthersTaskTypeSchedulingTaskCount = new Long(source.OthersTaskTypeSchedulingTaskCount);
        }
        if (source.OthersTaskTypeRunningInstanceCount != null) {
            this.OthersTaskTypeRunningInstanceCount = new Long(source.OthersTaskTypeRunningInstanceCount);
        }
        if (source.OthersTaskTypeWaitingInstanceCount != null) {
            this.OthersTaskTypeWaitingInstanceCount = new String(source.OthersTaskTypeWaitingInstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutorGroupId", this.ExecutorGroupId);
        this.setParamSimple(map, prefix + "SchedulingTaskCount", this.SchedulingTaskCount);
        this.setParamSimple(map, prefix + "RunningInstanceCount", this.RunningInstanceCount);
        this.setParamSimple(map, prefix + "WaitingInstanceCount", this.WaitingInstanceCount);
        this.setParamSimple(map, prefix + "OthersTaskTypeSchedulingTaskCount", this.OthersTaskTypeSchedulingTaskCount);
        this.setParamSimple(map, prefix + "OthersTaskTypeRunningInstanceCount", this.OthersTaskTypeRunningInstanceCount);
        this.setParamSimple(map, prefix + "OthersTaskTypeWaitingInstanceCount", this.OthersTaskTypeWaitingInstanceCount);

    }
}

