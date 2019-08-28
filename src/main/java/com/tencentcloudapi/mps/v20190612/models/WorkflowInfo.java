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

public class WorkflowInfo  extends AbstractModel{

    /**
    * 工作流 ID。
    */
    @SerializedName("WorkflowId")
    @Expose
    private Long WorkflowId;

    /**
    * 工作流名称。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 工作流状态，取值范围：
<li>Enabled：已启用，</li>
<li>Disabled：已禁用。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 工作流绑定的输入规则，当上传视频命中该规则到该对象时即触发工作流。
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTrigger Trigger;

    /**
    * 视频处理的文件输出存储位置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * 视频内容审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * 视频内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * 视频内容识别类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * 任务的事件通知信息，不填代表不获取事件通知。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * 任务流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
    */
    @SerializedName("TaskPriority")
    @Expose
    private Long TaskPriority;

    /**
    * 视频处理生成的文件输出的目标目录，如`/movie/201907/`。
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * 工作流创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 工作流最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * 获取工作流 ID。
     * @return WorkflowId 工作流 ID。
     */
    public Long getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * 设置工作流 ID。
     * @param WorkflowId 工作流 ID。
     */
    public void setWorkflowId(Long WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * 获取工作流名称。
     * @return WorkflowName 工作流名称。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * 设置工作流名称。
     * @param WorkflowName 工作流名称。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * 获取工作流状态，取值范围：
<li>Enabled：已启用，</li>
<li>Disabled：已禁用。</li>
     * @return Status 工作流状态，取值范围：
<li>Enabled：已启用，</li>
<li>Disabled：已禁用。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置工作流状态，取值范围：
<li>Enabled：已启用，</li>
<li>Disabled：已禁用。</li>
     * @param Status 工作流状态，取值范围：
<li>Enabled：已启用，</li>
<li>Disabled：已禁用。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取工作流绑定的输入规则，当上传视频命中该规则到该对象时即触发工作流。
     * @return Trigger 工作流绑定的输入规则，当上传视频命中该规则到该对象时即触发工作流。
     */
    public WorkflowTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * 设置工作流绑定的输入规则，当上传视频命中该规则到该对象时即触发工作流。
     * @param Trigger 工作流绑定的输入规则，当上传视频命中该规则到该对象时即触发工作流。
     */
    public void setTrigger(WorkflowTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * 获取视频处理的文件输出存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @return OutputStorage 视频处理的文件输出存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * 设置视频处理的文件输出存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage 视频处理的文件输出存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * 获取视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return MediaProcessTask 视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * 设置视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaProcessTask 视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * 获取视频内容审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AiContentReviewTask 视频内容审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * 设置视频内容审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiContentReviewTask 视频内容审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * 获取视频内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AiAnalysisTask 视频内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * 设置视频内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiAnalysisTask 视频内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * 获取视频内容识别类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AiRecognitionTask 视频内容识别类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * 设置视频内容识别类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiRecognitionTask 视频内容识别类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * 获取任务的事件通知信息，不填代表不获取事件通知。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TaskNotifyConfig 任务的事件通知信息，不填代表不获取事件通知。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * 设置任务的事件通知信息，不填代表不获取事件通知。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskNotifyConfig 任务的事件通知信息，不填代表不获取事件通知。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * 获取任务流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     * @return TaskPriority 任务流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public Long getTaskPriority() {
        return this.TaskPriority;
    }

    /**
     * 设置任务流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     * @param TaskPriority 任务流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public void setTaskPriority(Long TaskPriority) {
        this.TaskPriority = TaskPriority;
    }

    /**
     * 获取视频处理生成的文件输出的目标目录，如`/movie/201907/`。
     * @return OutputDir 视频处理生成的文件输出的目标目录，如`/movie/201907/`。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * 设置视频处理生成的文件输出的目标目录，如`/movie/201907/`。
     * @param OutputDir 视频处理生成的文件输出的目标目录，如`/movie/201907/`。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * 获取工作流创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return CreateTime 工作流创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置工作流创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param CreateTime 工作流创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取工作流最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return UpdateTime 工作流最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置工作流最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param UpdateTime 工作流最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TaskPriority", this.TaskPriority);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

