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

public class ResetWorkflowRequest  extends AbstractModel{

    /**
    * 工作流 ID。
    */
    @SerializedName("WorkflowId")
    @Expose
    private Long WorkflowId;

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
    * 视频处理的文件输出配置。不填则继承 Trigger 中的存储位置。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 视频处理生成的文件输出的目标目录，如`/movie/201907/`。如果不填，表示与触发文件所在的目录一致，即`{inputDir}`。
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
    * 工作流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
    */
    @SerializedName("TaskPriority")
    @Expose
    private Long TaskPriority;

    /**
    * 任务的事件通知信息，不填代表不获取事件通知。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

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
     * 获取工作流名称，最多128字符。同一个用户该名称唯一。
     * @return WorkflowName 工作流名称，最多128字符。同一个用户该名称唯一。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * 设置工作流名称，最多128字符。同一个用户该名称唯一。
     * @param WorkflowName 工作流名称，最多128字符。同一个用户该名称唯一。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * 获取工作流绑定的触发规则，当上传视频命中该规则到该对象时即触发工作流。
     * @return Trigger 工作流绑定的触发规则，当上传视频命中该规则到该对象时即触发工作流。
     */
    public WorkflowTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * 设置工作流绑定的触发规则，当上传视频命中该规则到该对象时即触发工作流。
     * @param Trigger 工作流绑定的触发规则，当上传视频命中该规则到该对象时即触发工作流。
     */
    public void setTrigger(WorkflowTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * 获取视频处理的文件输出配置。不填则继承 Trigger 中的存储位置。
     * @return OutputStorage 视频处理的文件输出配置。不填则继承 Trigger 中的存储位置。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * 设置视频处理的文件输出配置。不填则继承 Trigger 中的存储位置。
     * @param OutputStorage 视频处理的文件输出配置。不填则继承 Trigger 中的存储位置。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * 获取视频处理生成的文件输出的目标目录，如`/movie/201907/`。如果不填，表示与触发文件所在的目录一致，即`{inputDir}`。
     * @return OutputDir 视频处理生成的文件输出的目标目录，如`/movie/201907/`。如果不填，表示与触发文件所在的目录一致，即`{inputDir}`。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * 设置视频处理生成的文件输出的目标目录，如`/movie/201907/`。如果不填，表示与触发文件所在的目录一致，即`{inputDir}`。
     * @param OutputDir 视频处理生成的文件输出的目标目录，如`/movie/201907/`。如果不填，表示与触发文件所在的目录一致，即`{inputDir}`。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * 获取视频处理类型任务参数。
     * @return MediaProcessTask 视频处理类型任务参数。
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * 设置视频处理类型任务参数。
     * @param MediaProcessTask 视频处理类型任务参数。
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * 获取工作流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     * @return TaskPriority 工作流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public Long getTaskPriority() {
        return this.TaskPriority;
    }

    /**
     * 设置工作流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     * @param TaskPriority 工作流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public void setTaskPriority(Long TaskPriority) {
        this.TaskPriority = TaskPriority;
    }

    /**
     * 获取任务的事件通知信息，不填代表不获取事件通知。
     * @return TaskNotifyConfig 任务的事件通知信息，不填代表不获取事件通知。
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * 设置任务的事件通知信息，不填代表不获取事件通知。
     * @param TaskNotifyConfig 任务的事件通知信息，不填代表不获取事件通知。
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamSimple(map, prefix + "TaskPriority", this.TaskPriority);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);

    }
}

