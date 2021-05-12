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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobResponse extends AbstractModel{

    /**
    * 作业ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 作业名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 可用区信息
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 作业优先级
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 作业状态
    */
    @SerializedName("JobState")
    @Expose
    private String JobState;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务视图信息
    */
    @SerializedName("TaskSet")
    @Expose
    private TaskView [] TaskSet;

    /**
    * 任务间依赖信息
    */
    @SerializedName("DependenceSet")
    @Expose
    private Dependence [] DependenceSet;

    /**
    * 任务统计指标
    */
    @SerializedName("TaskMetrics")
    @Expose
    private TaskMetrics TaskMetrics;

    /**
    * 任务实例统计指标
    */
    @SerializedName("TaskInstanceMetrics")
    @Expose
    private TaskInstanceMetrics TaskInstanceMetrics;

    /**
    * 作业失败原因
    */
    @SerializedName("StateReason")
    @Expose
    private String StateReason;

    /**
    * 作业绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 下一步动作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextAction")
    @Expose
    private String NextAction;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 作业ID 
     * @return JobId 作业ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID
     * @param JobId 作业ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 作业名称 
     * @return JobName 作业名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 作业名称
     * @param JobName 作业名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 可用区信息 
     * @return Zone 可用区信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息
     * @param Zone 可用区信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 作业优先级 
     * @return Priority 作业优先级
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 作业优先级
     * @param Priority 作业优先级
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 作业状态 
     * @return JobState 作业状态
     */
    public String getJobState() {
        return this.JobState;
    }

    /**
     * Set 作业状态
     * @param JobState 作业状态
     */
    public void setJobState(String JobState) {
        this.JobState = JobState;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务视图信息 
     * @return TaskSet 任务视图信息
     */
    public TaskView [] getTaskSet() {
        return this.TaskSet;
    }

    /**
     * Set 任务视图信息
     * @param TaskSet 任务视图信息
     */
    public void setTaskSet(TaskView [] TaskSet) {
        this.TaskSet = TaskSet;
    }

    /**
     * Get 任务间依赖信息 
     * @return DependenceSet 任务间依赖信息
     */
    public Dependence [] getDependenceSet() {
        return this.DependenceSet;
    }

    /**
     * Set 任务间依赖信息
     * @param DependenceSet 任务间依赖信息
     */
    public void setDependenceSet(Dependence [] DependenceSet) {
        this.DependenceSet = DependenceSet;
    }

    /**
     * Get 任务统计指标 
     * @return TaskMetrics 任务统计指标
     */
    public TaskMetrics getTaskMetrics() {
        return this.TaskMetrics;
    }

    /**
     * Set 任务统计指标
     * @param TaskMetrics 任务统计指标
     */
    public void setTaskMetrics(TaskMetrics TaskMetrics) {
        this.TaskMetrics = TaskMetrics;
    }

    /**
     * Get 任务实例统计指标 
     * @return TaskInstanceMetrics 任务实例统计指标
     */
    public TaskInstanceMetrics getTaskInstanceMetrics() {
        return this.TaskInstanceMetrics;
    }

    /**
     * Set 任务实例统计指标
     * @param TaskInstanceMetrics 任务实例统计指标
     */
    public void setTaskInstanceMetrics(TaskInstanceMetrics TaskInstanceMetrics) {
        this.TaskInstanceMetrics = TaskInstanceMetrics;
    }

    /**
     * Get 作业失败原因 
     * @return StateReason 作业失败原因
     */
    public String getStateReason() {
        return this.StateReason;
    }

    /**
     * Set 作业失败原因
     * @param StateReason 作业失败原因
     */
    public void setStateReason(String StateReason) {
        this.StateReason = StateReason;
    }

    /**
     * Get 作业绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 作业绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 作业绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 作业绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 下一步动作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextAction 下一步动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextAction() {
        return this.NextAction;
    }

    /**
     * Set 下一步动作
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextAction 下一步动作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextAction(String NextAction) {
        this.NextAction = NextAction;
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

    public DescribeJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobResponse(DescribeJobResponse source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.JobState != null) {
            this.JobState = new String(source.JobState);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskSet != null) {
            this.TaskSet = new TaskView[source.TaskSet.length];
            for (int i = 0; i < source.TaskSet.length; i++) {
                this.TaskSet[i] = new TaskView(source.TaskSet[i]);
            }
        }
        if (source.DependenceSet != null) {
            this.DependenceSet = new Dependence[source.DependenceSet.length];
            for (int i = 0; i < source.DependenceSet.length; i++) {
                this.DependenceSet[i] = new Dependence(source.DependenceSet[i]);
            }
        }
        if (source.TaskMetrics != null) {
            this.TaskMetrics = new TaskMetrics(source.TaskMetrics);
        }
        if (source.TaskInstanceMetrics != null) {
            this.TaskInstanceMetrics = new TaskInstanceMetrics(source.TaskInstanceMetrics);
        }
        if (source.StateReason != null) {
            this.StateReason = new String(source.StateReason);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.NextAction != null) {
            this.NextAction = new String(source.NextAction);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "JobState", this.JobState);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "TaskSet.", this.TaskSet);
        this.setParamArrayObj(map, prefix + "DependenceSet.", this.DependenceSet);
        this.setParamObj(map, prefix + "TaskMetrics.", this.TaskMetrics);
        this.setParamObj(map, prefix + "TaskInstanceMetrics.", this.TaskInstanceMetrics);
        this.setParamSimple(map, prefix + "StateReason", this.StateReason);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "NextAction", this.NextAction);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

