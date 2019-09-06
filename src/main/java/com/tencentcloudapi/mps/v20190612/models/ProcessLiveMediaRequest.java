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

public class ProcessLiveMediaRequest  extends AbstractModel{

    /**
    * 直播流 URL。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 直播流处理生成的文件输出的目标目录，如`/movie/201909/`，如果不填为 `/` 目录。
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * 直播流内容识别类型任务参数。
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * 直播流内容分析类型任务参数。
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * 任务的事件通知信息，不填代表不获取事件通知。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 直播开始时间戳（UTC 时间 单位为秒，该参数仅对于直播流分析有效）。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
     * 获取直播流 URL。
     * @return Url 直播流 URL。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置直播流 URL。
     * @param Url 直播流 URL。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。
     * @return OutputStorage 直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * 设置直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。
     * @param OutputStorage 直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * 获取直播流处理生成的文件输出的目标目录，如`/movie/201909/`，如果不填为 `/` 目录。
     * @return OutputDir 直播流处理生成的文件输出的目标目录，如`/movie/201909/`，如果不填为 `/` 目录。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * 设置直播流处理生成的文件输出的目标目录，如`/movie/201909/`，如果不填为 `/` 目录。
     * @param OutputDir 直播流处理生成的文件输出的目标目录，如`/movie/201909/`，如果不填为 `/` 目录。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * 获取直播流内容识别类型任务参数。
     * @return AiRecognitionTask 直播流内容识别类型任务参数。
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * 设置直播流内容识别类型任务参数。
     * @param AiRecognitionTask 直播流内容识别类型任务参数。
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * 获取直播流内容分析类型任务参数。
     * @return AiAnalysisTask 直播流内容分析类型任务参数。
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * 设置直播流内容分析类型任务参数。
     * @param AiAnalysisTask 直播流内容分析类型任务参数。
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
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
     * 获取来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     * @return SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * 设置来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     * @param SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * 获取用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     * @return SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 获取直播开始时间戳（UTC 时间 单位为秒，该参数仅对于直播流分析有效）。
     * @return StartTime 直播开始时间戳（UTC 时间 单位为秒，该参数仅对于直播流分析有效）。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置直播开始时间戳（UTC 时间 单位为秒，该参数仅对于直播流分析有效）。
     * @param StartTime 直播开始时间戳（UTC 时间 单位为秒，该参数仅对于直播流分析有效）。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

