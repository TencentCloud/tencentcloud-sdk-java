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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailResponse extends AbstractModel {

    /**
    * 任务类型，目前取值有：<li>WorkflowTask：视频工作流处理任务。</li><li>EditMediaTask：视频编辑任务。</li><li>LiveStreamProcessTask：直播流处理任务。</li><li>ScheduleTask：编排处理任务。</li><li>EvaluationTask：评测任务。</li>
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
    * 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 视频编辑任务信息，仅当 TaskType 为 EditMediaTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EditMediaTask")
    @Expose
    private EditMediaTask EditMediaTask;

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
    * 提取数字水印任务信息，仅当 TaskType 为 ExtractBlindWatermark，该字段有值。
    */
    @SerializedName("ExtractBlindWatermarkTask")
    @Expose
    private ExtractBlindWatermarkTask ExtractBlindWatermarkTask;

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
    * 扩展信息字段，仅用于特定场景。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * 编排处理任务信息，仅当 TaskType 为 ScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTask")
    @Expose
    private ScheduleTask ScheduleTask;

    /**
    * 直播编排处理任务信息，仅当 TaskType 为 LiveScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveScheduleTask")
    @Expose
    private LiveScheduleTask LiveScheduleTask;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务类型，目前取值有：<li>WorkflowTask：视频工作流处理任务。</li><li>EditMediaTask：视频编辑任务。</li><li>LiveStreamProcessTask：直播流处理任务。</li><li>ScheduleTask：编排处理任务。</li><li>EvaluationTask：评测任务。</li> 
     * @return TaskType 任务类型，目前取值有：<li>WorkflowTask：视频工作流处理任务。</li><li>EditMediaTask：视频编辑任务。</li><li>LiveStreamProcessTask：直播流处理任务。</li><li>ScheduleTask：编排处理任务。</li><li>EvaluationTask：评测任务。</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，目前取值有：<li>WorkflowTask：视频工作流处理任务。</li><li>EditMediaTask：视频编辑任务。</li><li>LiveStreamProcessTask：直播流处理任务。</li><li>ScheduleTask：编排处理任务。</li><li>EvaluationTask：评测任务。</li>
     * @param TaskType 任务类型，目前取值有：<li>WorkflowTask：视频工作流处理任务。</li><li>EditMediaTask：视频编辑任务。</li><li>LiveStreamProcessTask：直播流处理任务。</li><li>ScheduleTask：编排处理任务。</li><li>EvaluationTask：评测任务。</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务状态，取值：
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
     * Set 任务状态，取值：
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
     * Get 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return CreateTime 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param CreateTime 任务的创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return BeginProcessTime 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param BeginProcessTime 任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return FinishTime 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param FinishTime 任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 视频编辑任务信息，仅当 TaskType 为 EditMediaTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EditMediaTask 视频编辑任务信息，仅当 TaskType 为 EditMediaTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EditMediaTask getEditMediaTask() {
        return this.EditMediaTask;
    }

    /**
     * Set 视频编辑任务信息，仅当 TaskType 为 EditMediaTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EditMediaTask 视频编辑任务信息，仅当 TaskType 为 EditMediaTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditMediaTask(EditMediaTask EditMediaTask) {
        this.EditMediaTask = EditMediaTask;
    }

    /**
     * Get 视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowTask 视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTask getWorkflowTask() {
        return this.WorkflowTask;
    }

    /**
     * Set 视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowTask 视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowTask(WorkflowTask WorkflowTask) {
        this.WorkflowTask = WorkflowTask;
    }

    /**
     * Get 直播流处理任务信息，仅当 TaskType 为 LiveStreamProcessTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveStreamProcessTask 直播流处理任务信息，仅当 TaskType 为 LiveStreamProcessTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamProcessTask getLiveStreamProcessTask() {
        return this.LiveStreamProcessTask;
    }

    /**
     * Set 直播流处理任务信息，仅当 TaskType 为 LiveStreamProcessTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveStreamProcessTask 直播流处理任务信息，仅当 TaskType 为 LiveStreamProcessTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveStreamProcessTask(LiveStreamProcessTask LiveStreamProcessTask) {
        this.LiveStreamProcessTask = LiveStreamProcessTask;
    }

    /**
     * Get 提取数字水印任务信息，仅当 TaskType 为 ExtractBlindWatermark，该字段有值。 
     * @return ExtractBlindWatermarkTask 提取数字水印任务信息，仅当 TaskType 为 ExtractBlindWatermark，该字段有值。
     */
    public ExtractBlindWatermarkTask getExtractBlindWatermarkTask() {
        return this.ExtractBlindWatermarkTask;
    }

    /**
     * Set 提取数字水印任务信息，仅当 TaskType 为 ExtractBlindWatermark，该字段有值。
     * @param ExtractBlindWatermarkTask 提取数字水印任务信息，仅当 TaskType 为 ExtractBlindWatermark，该字段有值。
     */
    public void setExtractBlindWatermarkTask(ExtractBlindWatermarkTask ExtractBlindWatermarkTask) {
        this.ExtractBlindWatermarkTask = ExtractBlindWatermarkTask;
    }

    /**
     * Get 任务的事件通知信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskNotifyConfig 任务的事件通知信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 任务的事件通知信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskNotifyConfig 任务的事件通知信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get 任务流的优先级，取值范围为 [-10, 10]。 
     * @return TasksPriority 任务流的优先级，取值范围为 [-10, 10]。
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 任务流的优先级，取值范围为 [-10, 10]。
     * @param TasksPriority 任务流的优先级，取值范围为 [-10, 10]。
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。 
     * @return SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。 
     * @return SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
     * @param SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get 扩展信息字段，仅用于特定场景。 
     * @return ExtInfo 扩展信息字段，仅用于特定场景。
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 扩展信息字段，仅用于特定场景。
     * @param ExtInfo 扩展信息字段，仅用于特定场景。
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get 编排处理任务信息，仅当 TaskType 为 ScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTask 编排处理任务信息，仅当 TaskType 为 ScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleTask getScheduleTask() {
        return this.ScheduleTask;
    }

    /**
     * Set 编排处理任务信息，仅当 TaskType 为 ScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTask 编排处理任务信息，仅当 TaskType 为 ScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTask(ScheduleTask ScheduleTask) {
        this.ScheduleTask = ScheduleTask;
    }

    /**
     * Get 直播编排处理任务信息，仅当 TaskType 为 LiveScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveScheduleTask 直播编排处理任务信息，仅当 TaskType 为 LiveScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveScheduleTask getLiveScheduleTask() {
        return this.LiveScheduleTask;
    }

    /**
     * Set 直播编排处理任务信息，仅当 TaskType 为 LiveScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveScheduleTask 直播编排处理任务信息，仅当 TaskType 为 LiveScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveScheduleTask(LiveScheduleTask LiveScheduleTask) {
        this.LiveScheduleTask = LiveScheduleTask;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskDetailResponse(DescribeTaskDetailResponse source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BeginProcessTime != null) {
            this.BeginProcessTime = new String(source.BeginProcessTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.EditMediaTask != null) {
            this.EditMediaTask = new EditMediaTask(source.EditMediaTask);
        }
        if (source.WorkflowTask != null) {
            this.WorkflowTask = new WorkflowTask(source.WorkflowTask);
        }
        if (source.LiveStreamProcessTask != null) {
            this.LiveStreamProcessTask = new LiveStreamProcessTask(source.LiveStreamProcessTask);
        }
        if (source.ExtractBlindWatermarkTask != null) {
            this.ExtractBlindWatermarkTask = new ExtractBlindWatermarkTask(source.ExtractBlindWatermarkTask);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.ScheduleTask != null) {
            this.ScheduleTask = new ScheduleTask(source.ScheduleTask);
        }
        if (source.LiveScheduleTask != null) {
            this.LiveScheduleTask = new LiveScheduleTask(source.LiveScheduleTask);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamObj(map, prefix + "EditMediaTask.", this.EditMediaTask);
        this.setParamObj(map, prefix + "WorkflowTask.", this.WorkflowTask);
        this.setParamObj(map, prefix + "LiveStreamProcessTask.", this.LiveStreamProcessTask);
        this.setParamObj(map, prefix + "ExtractBlindWatermarkTask.", this.ExtractBlindWatermarkTask);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamObj(map, prefix + "ScheduleTask.", this.ScheduleTask);
        this.setParamObj(map, prefix + "LiveScheduleTask.", this.LiveScheduleTask);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

