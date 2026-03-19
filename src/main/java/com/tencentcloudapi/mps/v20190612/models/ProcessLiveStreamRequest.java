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
    * <p>直播流 URL（必须是直播流地址，支持 rtmp，hls 和 flv, trtc,webrtc,srt等）。<br>trtc地址如下：<br> trtc://trtc.rtc.qq.com/mps/<code>&lt;roomid&gt;</code>?sdkappid=<code>&lt;sdkappid&gt;</code>&amp;userid=<code>&lt;userid&gt;</code>&amp;usersig=<code>&lt;usersig&gt;</code><br><code>&lt;roomid&gt;</code> 为trtc的房间号id, 为数字<br><code>&lt;sdkappid&gt;</code> 为trtc的sdk app id<br><code>&lt;userid&gt;</code> 为服务进入房间的用户id,可以区分谁是机器人<br><code>&lt;usersig&gt;</code> 为trtc 用户的签名</p><p>webrtc 支持<a href="https://cloud.tencent.com/product/leb">LEB</a>的直播流，地址获取请<a href="https://cloud.tencent.com/document/product/267/32720">参考</a></p><p>srt支持地址请<a href="https://ffmpeg.org/ffmpeg-protocols.html#srt">参考</a></p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>任务的事件通知信息，用于指定直播流处理的结果。</p>
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private LiveStreamTaskNotifyConfig TaskNotifyConfig;

    /**
    * <p>直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>直播流处理生成的文件输出的目标目录，如<code>/movie/201909/</code>，如果不填为 <code>/</code> 目录。</p>
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * <p>视频内容审核类型任务参数。</p>
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * <p>视频内容识别类型任务参数。</p>
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * <p>视频内容分析类型任务参数。</p>
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * <p>媒体质检类型任务参数。</p>
    */
    @SerializedName("AiQualityControlTask")
    @Expose
    private AiQualityControlTaskInput AiQualityControlTask;

    /**
    * <p>智能字幕任务参数。</p>
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private LiveSmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * <p>用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>直播编排ID。<br>注意1：对于OutputStorage、OutputDir参数：</p><li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li><li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若对直播流发起处理（ProcessLiveStream）有输出，将覆盖原有编排的默认输出。</li>注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessLiveStream）有设置，将覆盖原有编排的默认回调。
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * <p>资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get <p>直播流 URL（必须是直播流地址，支持 rtmp，hls 和 flv, trtc,webrtc,srt等）。<br>trtc地址如下：<br> trtc://trtc.rtc.qq.com/mps/<code>&lt;roomid&gt;</code>?sdkappid=<code>&lt;sdkappid&gt;</code>&amp;userid=<code>&lt;userid&gt;</code>&amp;usersig=<code>&lt;usersig&gt;</code><br><code>&lt;roomid&gt;</code> 为trtc的房间号id, 为数字<br><code>&lt;sdkappid&gt;</code> 为trtc的sdk app id<br><code>&lt;userid&gt;</code> 为服务进入房间的用户id,可以区分谁是机器人<br><code>&lt;usersig&gt;</code> 为trtc 用户的签名</p><p>webrtc 支持<a href="https://cloud.tencent.com/product/leb">LEB</a>的直播流，地址获取请<a href="https://cloud.tencent.com/document/product/267/32720">参考</a></p><p>srt支持地址请<a href="https://ffmpeg.org/ffmpeg-protocols.html#srt">参考</a></p> 
     * @return Url <p>直播流 URL（必须是直播流地址，支持 rtmp，hls 和 flv, trtc,webrtc,srt等）。<br>trtc地址如下：<br> trtc://trtc.rtc.qq.com/mps/<code>&lt;roomid&gt;</code>?sdkappid=<code>&lt;sdkappid&gt;</code>&amp;userid=<code>&lt;userid&gt;</code>&amp;usersig=<code>&lt;usersig&gt;</code><br><code>&lt;roomid&gt;</code> 为trtc的房间号id, 为数字<br><code>&lt;sdkappid&gt;</code> 为trtc的sdk app id<br><code>&lt;userid&gt;</code> 为服务进入房间的用户id,可以区分谁是机器人<br><code>&lt;usersig&gt;</code> 为trtc 用户的签名</p><p>webrtc 支持<a href="https://cloud.tencent.com/product/leb">LEB</a>的直播流，地址获取请<a href="https://cloud.tencent.com/document/product/267/32720">参考</a></p><p>srt支持地址请<a href="https://ffmpeg.org/ffmpeg-protocols.html#srt">参考</a></p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>直播流 URL（必须是直播流地址，支持 rtmp，hls 和 flv, trtc,webrtc,srt等）。<br>trtc地址如下：<br> trtc://trtc.rtc.qq.com/mps/<code>&lt;roomid&gt;</code>?sdkappid=<code>&lt;sdkappid&gt;</code>&amp;userid=<code>&lt;userid&gt;</code>&amp;usersig=<code>&lt;usersig&gt;</code><br><code>&lt;roomid&gt;</code> 为trtc的房间号id, 为数字<br><code>&lt;sdkappid&gt;</code> 为trtc的sdk app id<br><code>&lt;userid&gt;</code> 为服务进入房间的用户id,可以区分谁是机器人<br><code>&lt;usersig&gt;</code> 为trtc 用户的签名</p><p>webrtc 支持<a href="https://cloud.tencent.com/product/leb">LEB</a>的直播流，地址获取请<a href="https://cloud.tencent.com/document/product/267/32720">参考</a></p><p>srt支持地址请<a href="https://ffmpeg.org/ffmpeg-protocols.html#srt">参考</a></p>
     * @param Url <p>直播流 URL（必须是直播流地址，支持 rtmp，hls 和 flv, trtc,webrtc,srt等）。<br>trtc地址如下：<br> trtc://trtc.rtc.qq.com/mps/<code>&lt;roomid&gt;</code>?sdkappid=<code>&lt;sdkappid&gt;</code>&amp;userid=<code>&lt;userid&gt;</code>&amp;usersig=<code>&lt;usersig&gt;</code><br><code>&lt;roomid&gt;</code> 为trtc的房间号id, 为数字<br><code>&lt;sdkappid&gt;</code> 为trtc的sdk app id<br><code>&lt;userid&gt;</code> 为服务进入房间的用户id,可以区分谁是机器人<br><code>&lt;usersig&gt;</code> 为trtc 用户的签名</p><p>webrtc 支持<a href="https://cloud.tencent.com/product/leb">LEB</a>的直播流，地址获取请<a href="https://cloud.tencent.com/document/product/267/32720">参考</a></p><p>srt支持地址请<a href="https://ffmpeg.org/ffmpeg-protocols.html#srt">参考</a></p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>任务的事件通知信息，用于指定直播流处理的结果。</p> 
     * @return TaskNotifyConfig <p>任务的事件通知信息，用于指定直播流处理的结果。</p>
     */
    public LiveStreamTaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set <p>任务的事件通知信息，用于指定直播流处理的结果。</p>
     * @param TaskNotifyConfig <p>任务的事件通知信息，用于指定直播流处理的结果。</p>
     */
    public void setTaskNotifyConfig(LiveStreamTaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get <p>直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。</p> 
     * @return OutputStorage <p>直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。</p>
     * @param OutputStorage <p>直播流处理输出文件的目标存储。如处理有文件输出，该参数为必填项。</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>直播流处理生成的文件输出的目标目录，如<code>/movie/201909/</code>，如果不填为 <code>/</code> 目录。</p> 
     * @return OutputDir <p>直播流处理生成的文件输出的目标目录，如<code>/movie/201909/</code>，如果不填为 <code>/</code> 目录。</p>
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set <p>直播流处理生成的文件输出的目标目录，如<code>/movie/201909/</code>，如果不填为 <code>/</code> 目录。</p>
     * @param OutputDir <p>直播流处理生成的文件输出的目标目录，如<code>/movie/201909/</code>，如果不填为 <code>/</code> 目录。</p>
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get <p>视频内容审核类型任务参数。</p> 
     * @return AiContentReviewTask <p>视频内容审核类型任务参数。</p>
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set <p>视频内容审核类型任务参数。</p>
     * @param AiContentReviewTask <p>视频内容审核类型任务参数。</p>
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get <p>视频内容识别类型任务参数。</p> 
     * @return AiRecognitionTask <p>视频内容识别类型任务参数。</p>
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set <p>视频内容识别类型任务参数。</p>
     * @param AiRecognitionTask <p>视频内容识别类型任务参数。</p>
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get <p>视频内容分析类型任务参数。</p> 
     * @return AiAnalysisTask <p>视频内容分析类型任务参数。</p>
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set <p>视频内容分析类型任务参数。</p>
     * @param AiAnalysisTask <p>视频内容分析类型任务参数。</p>
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get <p>媒体质检类型任务参数。</p> 
     * @return AiQualityControlTask <p>媒体质检类型任务参数。</p>
     */
    public AiQualityControlTaskInput getAiQualityControlTask() {
        return this.AiQualityControlTask;
    }

    /**
     * Set <p>媒体质检类型任务参数。</p>
     * @param AiQualityControlTask <p>媒体质检类型任务参数。</p>
     */
    public void setAiQualityControlTask(AiQualityControlTaskInput AiQualityControlTask) {
        this.AiQualityControlTask = AiQualityControlTask;
    }

    /**
     * Get <p>智能字幕任务参数。</p> 
     * @return SmartSubtitlesTask <p>智能字幕任务参数。</p>
     */
    public LiveSmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set <p>智能字幕任务参数。</p>
     * @param SmartSubtitlesTask <p>智能字幕任务参数。</p>
     */
    public void setSmartSubtitlesTask(LiveSmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get <p>用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p> 
     * @return SessionId <p>用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     * @param SessionId <p>用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>直播编排ID。<br>注意1：对于OutputStorage、OutputDir参数：</p><li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li><li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若对直播流发起处理（ProcessLiveStream）有输出，将覆盖原有编排的默认输出。</li>注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessLiveStream）有设置，将覆盖原有编排的默认回调。 
     * @return ScheduleId <p>直播编排ID。<br>注意1：对于OutputStorage、OutputDir参数：</p><li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li><li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若对直播流发起处理（ProcessLiveStream）有输出，将覆盖原有编排的默认输出。</li>注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessLiveStream）有设置，将覆盖原有编排的默认回调。
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set <p>直播编排ID。<br>注意1：对于OutputStorage、OutputDir参数：</p><li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li><li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若对直播流发起处理（ProcessLiveStream）有输出，将覆盖原有编排的默认输出。</li>注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessLiveStream）有设置，将覆盖原有编排的默认回调。
     * @param ScheduleId <p>直播编排ID。<br>注意1：对于OutputStorage、OutputDir参数：</p><li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li><li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若对直播流发起处理（ProcessLiveStream）有输出，将覆盖原有编排的默认输出。</li>注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessLiveStream）有设置，将覆盖原有编排的默认回调。
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get <p>资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。</p> 
     * @return ResourceId <p>资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。</p>
     * @param ResourceId <p>资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
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
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new LiveSmartSubtitlesTaskInput(source.SmartSubtitlesTask);
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
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
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
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

