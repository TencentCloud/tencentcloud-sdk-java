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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailResponse  extends AbstractModel{

    /**
    * 任务类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
<li>LiveStreamProcessTask：直播流处理任务。</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowTask")
    @Expose
    private WorkflowTask WorkflowTask;

    /**
    * 直播流处理任务信息，仅当 TaskType 为 LiveStreamProcessTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveStreamProcessTask")
    @Expose
    private LiveStreamProcessTask LiveStreamProcessTask;

    /**
    * 任务的事件通知信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * 任务流的优先级，取值范围为 [-10, 10]。
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取任务类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
<li>LiveStreamProcessTask：直播流处理任务。</li>
     * @return TaskType 任务类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
<li>LiveStreamProcessTask：直播流处理任务。</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * 设置任务类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
<li>LiveStreamProcessTask：直播流处理任务。</li>
     * @param TaskType 任务类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
<li>LiveStreamProcessTask：直播流处理任务。</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * 获取任务状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     * @return Status 任务状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置任务状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     * @param Status 任务状态，取值：
<li>WAITING：等待中；</li>
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return CreateTime 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param CreateTime 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return BeginProcessTime 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * 设置任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param BeginProcessTime 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * 获取任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return FinishTime 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * 设置任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param FinishTime 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * 获取视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @return WorkflowTask 视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTask getWorkflowTask() {
        return this.WorkflowTask;
    }

    /**
     * 设置视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowTask 视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowTask(WorkflowTask WorkflowTask) {
        this.WorkflowTask = WorkflowTask;
    }

    /**
     * 获取直播流处理任务信息，仅当 TaskType 为 LiveStreamProcessTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @return LiveStreamProcessTask 直播流处理任务信息，仅当 TaskType 为 LiveStreamProcessTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamProcessTask getLiveStreamProcessTask() {
        return this.LiveStreamProcessTask;
    }

    /**
     * 设置直播流处理任务信息，仅当 TaskType 为 LiveStreamProcessTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveStreamProcessTask 直播流处理任务信息，仅当 TaskType 为 LiveStreamProcessTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveStreamProcessTask(LiveStreamProcessTask LiveStreamProcessTask) {
        this.LiveStreamProcessTask = LiveStreamProcessTask;
    }

    /**
     * 获取任务的事件通知信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TaskNotifyConfig 任务的事件通知信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * 设置任务的事件通知信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskNotifyConfig 任务的事件通知信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * 获取任务流的优先级，取值范围为 [-10, 10]。
     * @return TasksPriority 任务流的优先级，取值范围为 [-10, 10]。
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * 设置任务流的优先级，取值范围为 [-10, 10]。
     * @param TasksPriority 任务流的优先级，取值范围为 [-10, 10]。
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * 获取用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
     * @return SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 获取来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
     * @return SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * 设置来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
     * @param SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamObj(map, prefix + "WorkflowTask.", this.WorkflowTask);
        this.setParamObj(map, prefix + "LiveStreamProcessTask.", this.LiveStreamProcessTask);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

