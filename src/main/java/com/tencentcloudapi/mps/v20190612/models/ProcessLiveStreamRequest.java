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

public class ProcessLiveStreamRequest  extends AbstractModel{

    /**
    * 直播流 URL（必须是直播文件地址，支持 rtmp，hls 和 flv 等）。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 任务的事件通知信息，用于指定直播流处理的结果。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private LiveStreamTaskNotifyConfig TaskNotifyConfig;

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
    * 视频内容审核类型任务参数。
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

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
     * 获取直播流 URL（必须是直播文件地址，支持 rtmp，hls 和 flv 等）。
     * @return Url 直播流 URL（必须是直播文件地址，支持 rtmp，hls 和 flv 等）。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置直播流 URL（必须是直播文件地址，支持 rtmp，hls 和 flv 等）。
     * @param Url 直播流 URL（必须是直播文件地址，支持 rtmp，hls 和 flv 等）。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取任务的事件通知信息，用于指定直播流处理的结果。
     * @return TaskNotifyConfig 任务的事件通知信息，用于指定直播流处理的结果。
     */
    public LiveStreamTaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * 设置任务的事件通知信息，用于指定直播流处理的结果。
     * @param TaskNotifyConfig 任务的事件通知信息，用于指定直播流处理的结果。
     */
    public void setTaskNotifyConfig(LiveStreamTaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
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
     * 获取视频内容审核类型任务参数。
     * @return AiContentReviewTask 视频内容审核类型任务参数。
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * 设置视频内容审核类型任务参数。
     * @param AiContentReviewTask 视频内容审核类型任务参数。
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
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
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

