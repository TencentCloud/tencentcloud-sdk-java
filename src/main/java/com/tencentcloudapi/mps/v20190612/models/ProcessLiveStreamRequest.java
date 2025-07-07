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

public class ProcessLiveStreamRequest extends AbstractModel {

    /**
    * 直播流 URL（必须是直播文件地址，支持 rtmp，hls 和 flv, trtc 等）。
trtc地址如下：
 trtc: //trtc.rtc.qq.com/mps/`<roomid>`?sdkappid=`<sdkappid>`&userid=`<userid>`&usersig=<`usersig>`
`<roomid>` 为trtc的房间号id, 为数字
`<sdkappid>` 为trtc的sdk app id
`<userid>` 为服务进入房间的用户id,可以区分谁是机器人
<`usersig>` 为trtc 用户的签名
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
    * 视频内容识别类型任务参数。
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * 视频内容分析类型任务参数。
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * 媒体质检类型任务参数。
    */
    @SerializedName("AiQualityControlTask")
    @Expose
    private AiQualityControlTaskInput AiQualityControlTask;

    /**
    * 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
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
    * 直播编排ID。
注意1：对于OutputStorage、OutputDir参数：
<li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li>
<li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若对直播流发起处理（ProcessLiveStream）有输出，将覆盖原有编排的默认输出。</li>
注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessLiveStream）有设置，将覆盖原有编排的默认回调。
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
     * Get 直播流 URL（必须是直播文件地址，支持 rtmp，hls 和 flv, trtc 等）。
trtc地址如下：
 trtc: //trtc.rtc.qq.com/mps/`<roomid>`?sdkappid=`<sdkappid>`&userid=`<userid>`&usersig=<`usersig>`
`<roomid>` 为trtc的房间号id, 为数字
`<sdkappid>` 为trtc的sdk app id
`<userid>` 为服务进入房间的用户id,可以区分谁是机器人
<`usersig>` 为trtc 用户的签名 
     * @return Url 直播流 URL（必须是直播文件地址，支持 rtmp，hls 和 flv, trtc 等）。
trtc地址如下：
 trtc: //trtc.rtc.qq.com/mps/`<roomid>`?sdkappid=`<sdkappid>`&userid=`<userid>`&usersig=<`usersig>`
`<roomid>` 为trtc的房间号id, 为数字
`<sdkappid>` 为trtc的sdk app id
`<userid>` 为服务进入房间的用户id,可以区分谁是机器人
<`usersig>` 为trtc 用户的签名
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 直播流 URL（必须是直播文件地址，支持 rtmp，hls 和 flv, trtc 等）。
trtc地址如下：
 trtc: //trtc.rtc.qq.com/mps/`<roomid>`?sdkappid=`<sdkappid>`&userid=`<userid>`&usersig=<`usersig>`
`<roomid>` 为trtc的房间号id, 为数字
`<sdkappid>` 为trtc的sdk app id
`<userid>` 为服务进入房间的用户id,可以区分谁是机器人
<`usersig>` 为trtc 用户的签名
     * @param Url 直播流 URL（必须是直播文件地址，支持 rtmp，hls 和 flv, trtc 等）。
trtc地址如下：
 trtc: //trtc.rtc.qq.com/mps/`<roomid>`?sdkappid=`<sdkappid>`&userid=`<userid>`&usersig=<`usersig>`
`<roomid>` 为trtc的房间号id, 为数字
`<sdkappid>` 为trtc的sdk app id
`<userid>` 为服务进入房间的用户id,可以区分谁是机器人
<`usersig>` 为trtc 用户的签名
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 任务的事件通知信息，用于指定直播流处理的结果。 
     * @return TaskNotifyConfig 任务的事件通知信息，用于指定直播流处理的结果。
     */
    public LiveStreamTaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 任务的事件通知信息，用于指定直播流处理的结果。
     * @param TaskNotifyConfig 任务的事件通知信息，用于指定直播流处理的结果。
     */
    public void setTaskNotifyConfig(LiveStreamTaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get 直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。 
     * @return OutputStorage 直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。
     * @param OutputStorage 直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 直播流处理生成的文件输出的目标目录，如`/movie/201909/`，如果不填为 `/` 目录。 
     * @return OutputDir 直播流处理生成的文件输出的目标目录，如`/movie/201909/`，如果不填为 `/` 目录。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set 直播流处理生成的文件输出的目标目录，如`/movie/201909/`，如果不填为 `/` 目录。
     * @param OutputDir 直播流处理生成的文件输出的目标目录，如`/movie/201909/`，如果不填为 `/` 目录。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
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
     * Get 媒体质检类型任务参数。 
     * @return AiQualityControlTask 媒体质检类型任务参数。
     */
    public AiQualityControlTaskInput getAiQualityControlTask() {
        return this.AiQualityControlTask;
    }

    /**
     * Set 媒体质检类型任务参数。
     * @param AiQualityControlTask 媒体质检类型任务参数。
     */
    public void setAiQualityControlTask(AiQualityControlTaskInput AiQualityControlTask) {
        this.AiQualityControlTask = AiQualityControlTask;
    }

    /**
     * Get 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。 
     * @return SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
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

    /**
     * Get 直播编排ID。
注意1：对于OutputStorage、OutputDir参数：
<li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li>
<li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若对直播流发起处理（ProcessLiveStream）有输出，将覆盖原有编排的默认输出。</li>
注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessLiveStream）有设置，将覆盖原有编排的默认回调。 
     * @return ScheduleId 直播编排ID。
注意1：对于OutputStorage、OutputDir参数：
<li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li>
<li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若对直播流发起处理（ProcessLiveStream）有输出，将覆盖原有编排的默认输出。</li>
注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessLiveStream）有设置，将覆盖原有编排的默认回调。
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set 直播编排ID。
注意1：对于OutputStorage、OutputDir参数：
<li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li>
<li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若对直播流发起处理（ProcessLiveStream）有输出，将覆盖原有编排的默认输出。</li>
注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessLiveStream）有设置，将覆盖原有编排的默认回调。
     * @param ScheduleId 直播编排ID。
注意1：对于OutputStorage、OutputDir参数：
<li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li>
<li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若对直播流发起处理（ProcessLiveStream）有输出，将覆盖原有编排的默认输出。</li>
注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessLiveStream）有设置，将覆盖原有编排的默认回调。
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    public ProcessLiveStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessLiveStreamRequest(ProcessLiveStreamRequest source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new LiveStreamTaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.AiContentReviewTask != null) {
            this.AiContentReviewTask = new AiContentReviewTaskInput(source.AiContentReviewTask);
        }
        if (source.AiRecognitionTask != null) {
            this.AiRecognitionTask = new AiRecognitionTaskInput(source.AiRecognitionTask);
        }
        if (source.AiAnalysisTask != null) {
            this.AiAnalysisTask = new AiAnalysisTaskInput(source.AiAnalysisTask);
        }
        if (source.AiQualityControlTask != null) {
            this.AiQualityControlTask = new AiQualityControlTaskInput(source.AiQualityControlTask);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiQualityControlTask.", this.AiQualityControlTask);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);

    }
}

