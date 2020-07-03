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

public class CreateWorkflowRequest extends AbstractModel{

    /**
    * 工作流名称，最多128字符。同一个用户该名称唯一。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 工作流绑定的触发规则，当上传视频命中该规则到该对象时即触发工作流。
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTrigger Trigger;

    /**
    * 视频处理的文件输出存储位置。不填则继承 Trigger 中的存储位置。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 视频处理生成的文件输出的目标目录，如`/movie/201907/`。如果不填，表示与触发文件所在的目录一致。
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * 视频处理类型任务参数。
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * 视频内容审核类型任务参数。
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * 视频内容分析类型任务参数。
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * 视频内容识别类型任务参数。
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * 任务的事件通知配置，不填代表不获取事件通知。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * 工作流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
    */
    @SerializedName("TaskPriority")
    @Expose
    private Long TaskPriority;

    /**
     * Get 工作流名称，最多128字符。同一个用户该名称唯一。 
     * @return WorkflowName 工作流名称，最多128字符。同一个用户该名称唯一。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称，最多128字符。同一个用户该名称唯一。
     * @param WorkflowName 工作流名称，最多128字符。同一个用户该名称唯一。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 工作流绑定的触发规则，当上传视频命中该规则到该对象时即触发工作流。 
     * @return Trigger 工作流绑定的触发规则，当上传视频命中该规则到该对象时即触发工作流。
     */
    public WorkflowTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * Set 工作流绑定的触发规则，当上传视频命中该规则到该对象时即触发工作流。
     * @param Trigger 工作流绑定的触发规则，当上传视频命中该规则到该对象时即触发工作流。
     */
    public void setTrigger(WorkflowTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get 视频处理的文件输出存储位置。不填则继承 Trigger 中的存储位置。 
     * @return OutputStorage 视频处理的文件输出存储位置。不填则继承 Trigger 中的存储位置。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 视频处理的文件输出存储位置。不填则继承 Trigger 中的存储位置。
     * @param OutputStorage 视频处理的文件输出存储位置。不填则继承 Trigger 中的存储位置。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 视频处理生成的文件输出的目标目录，如`/movie/201907/`。如果不填，表示与触发文件所在的目录一致。 
     * @return OutputDir 视频处理生成的文件输出的目标目录，如`/movie/201907/`。如果不填，表示与触发文件所在的目录一致。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set 视频处理生成的文件输出的目标目录，如`/movie/201907/`。如果不填，表示与触发文件所在的目录一致。
     * @param OutputDir 视频处理生成的文件输出的目标目录，如`/movie/201907/`。如果不填，表示与触发文件所在的目录一致。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get 视频处理类型任务参数。 
     * @return MediaProcessTask 视频处理类型任务参数。
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set 视频处理类型任务参数。
     * @param MediaProcessTask 视频处理类型任务参数。
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get 视频内容审核类型任务参数。 
     * @return AiContentReviewTask 视频内容审核类型任务参数。
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set 视频内容审核类型任务参数。
     * @param AiContentReviewTask 视频内容审核类型任务参数。
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get 视频内容分析类型任务参数。 
     * @return AiAnalysisTask 视频内容分析类型任务参数。
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set 视频内容分析类型任务参数。
     * @param AiAnalysisTask 视频内容分析类型任务参数。
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get 视频内容识别类型任务参数。 
     * @return AiRecognitionTask 视频内容识别类型任务参数。
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set 视频内容识别类型任务参数。
     * @param AiRecognitionTask 视频内容识别类型任务参数。
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get 任务的事件通知配置，不填代表不获取事件通知。 
     * @return TaskNotifyConfig 任务的事件通知配置，不填代表不获取事件通知。
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 任务的事件通知配置，不填代表不获取事件通知。
     * @param TaskNotifyConfig 任务的事件通知配置，不填代表不获取事件通知。
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get 工作流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。 
     * @return TaskPriority 工作流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public Long getTaskPriority() {
        return this.TaskPriority;
    }

    /**
     * Set 工作流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     * @param TaskPriority 工作流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public void setTaskPriority(Long TaskPriority) {
        this.TaskPriority = TaskPriority;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TaskPriority", this.TaskPriority);

    }
}

