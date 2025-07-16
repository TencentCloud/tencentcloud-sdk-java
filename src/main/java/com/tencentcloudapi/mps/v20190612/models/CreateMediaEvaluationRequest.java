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

public class CreateMediaEvaluationRequest extends AbstractModel {

    /**
    * 评测的原文件输入信息。目前输入对象的类型有 COS 和 URL。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 评测任务参数。
    */
    @SerializedName("EvaluationTask")
    @Expose
    private EvaluationTaskInput EvaluationTask;

    /**
    * 评测的输出文件的目标存储。不填则继承 InputInfo 中的存储位置。目前输出对象存储位置的类型有COS。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 评测生成文件的输出目录，必选以 / 开头和结尾，如/movie/201907/。 如果不填，表示与 InputInfo 中文件所在的目录一致。
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * 任务的事件通知信息，不填代表不获取事件通知。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * 任务优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get 评测的原文件输入信息。目前输入对象的类型有 COS 和 URL。 
     * @return InputInfo 评测的原文件输入信息。目前输入对象的类型有 COS 和 URL。
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 评测的原文件输入信息。目前输入对象的类型有 COS 和 URL。
     * @param InputInfo 评测的原文件输入信息。目前输入对象的类型有 COS 和 URL。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 评测任务参数。 
     * @return EvaluationTask 评测任务参数。
     */
    public EvaluationTaskInput getEvaluationTask() {
        return this.EvaluationTask;
    }

    /**
     * Set 评测任务参数。
     * @param EvaluationTask 评测任务参数。
     */
    public void setEvaluationTask(EvaluationTaskInput EvaluationTask) {
        this.EvaluationTask = EvaluationTask;
    }

    /**
     * Get 评测的输出文件的目标存储。不填则继承 InputInfo 中的存储位置。目前输出对象存储位置的类型有COS。 
     * @return OutputStorage 评测的输出文件的目标存储。不填则继承 InputInfo 中的存储位置。目前输出对象存储位置的类型有COS。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 评测的输出文件的目标存储。不填则继承 InputInfo 中的存储位置。目前输出对象存储位置的类型有COS。
     * @param OutputStorage 评测的输出文件的目标存储。不填则继承 InputInfo 中的存储位置。目前输出对象存储位置的类型有COS。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 评测生成文件的输出目录，必选以 / 开头和结尾，如/movie/201907/。 如果不填，表示与 InputInfo 中文件所在的目录一致。 
     * @return OutputDir 评测生成文件的输出目录，必选以 / 开头和结尾，如/movie/201907/。 如果不填，表示与 InputInfo 中文件所在的目录一致。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set 评测生成文件的输出目录，必选以 / 开头和结尾，如/movie/201907/。 如果不填，表示与 InputInfo 中文件所在的目录一致。
     * @param OutputDir 评测生成文件的输出目录，必选以 / 开头和结尾，如/movie/201907/。 如果不填，表示与 InputInfo 中文件所在的目录一致。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get 任务的事件通知信息，不填代表不获取事件通知。 
     * @return TaskNotifyConfig 任务的事件通知信息，不填代表不获取事件通知。
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 任务的事件通知信息，不填代表不获取事件通知。
     * @param TaskNotifyConfig 任务的事件通知信息，不填代表不获取事件通知。
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get 任务优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。 
     * @return TasksPriority 任务优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 任务优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。
     * @param TasksPriority 任务优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。 
     * @return SessionId 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。 
     * @return SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     * @param SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public CreateMediaEvaluationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMediaEvaluationRequest(CreateMediaEvaluationRequest source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.EvaluationTask != null) {
            this.EvaluationTask = new EvaluationTaskInput(source.EvaluationTask);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "EvaluationTask.", this.EvaluationTask);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

