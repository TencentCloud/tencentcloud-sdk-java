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

public class ParseLiveStreamProcessNotificationResponse extends AbstractModel {

    /**
    * 直播流处理结果类型，包含：
<li>AiReviewResult：内容审核结果；</li>
<li>AiRecognitionResult：内容识别结果；</li>
<li>LiveRecordResult：直播录制结果；</li>
<li>AiQualityControlResult：媒体质检结果；</li>
<li>ProcessEof：直播流处理结束。</li>
    */
    @SerializedName("NotificationType")
    @Expose
    private String NotificationType;

    /**
    * 视频处理任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 直播流处理错误信息，当 NotificationType 为 ProcessEof 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessEofInfo")
    @Expose
    private LiveStreamProcessErrorInfo ProcessEofInfo;

    /**
    * 内容审核结果，当 NotificationType 为 AiReviewResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiReviewResultInfo")
    @Expose
    private LiveStreamAiReviewResultInfo AiReviewResultInfo;

    /**
    * 内容识别结果，当 NotificationType 为 AiRecognitionResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiRecognitionResultInfo")
    @Expose
    private LiveStreamAiRecognitionResultInfo AiRecognitionResultInfo;

    /**
    * 内容分析结果，当 NotificationType 为 AiAnalysisResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiAnalysisResultInfo")
    @Expose
    private LiveStreamAiAnalysisResultInfo AiAnalysisResultInfo;

    /**
    * 媒体质检结果，当 NotificationType 为 AiQualityControlResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiQualityControlResultInfo")
    @Expose
    private LiveStreamAiQualityControlResultInfo AiQualityControlResultInfo;

    /**
    * 直播录制结果，当 NotificationType 为 LiveRecordResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveRecordResultInfo")
    @Expose
    private LiveStreamRecordResultInfo LiveRecordResultInfo;

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
    * - 过期时间，事件通知签名过期 UNIX 时间戳。 - 来自媒体处理的消息通知默认过期时间是10分钟，如果一条消息通知中的 Timestamp 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。 - Timestamp 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 事件通知安全签名 Sign = MD5（Timestamp + NotifyKey）。说明：媒体处理把Timestamp 和 TaskNotifyConfig 里面的NotifyKey 进行字符串拼接后通过 MD5 计算得出 Sign 值，并将其放在通知消息里，您的后台服务器在收到通知消息后可以根据同样的算法确认 Sign 是否正确，进而确认消息是否确实来自媒体处理后台。
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 直播流处理结果类型，包含：
<li>AiReviewResult：内容审核结果；</li>
<li>AiRecognitionResult：内容识别结果；</li>
<li>LiveRecordResult：直播录制结果；</li>
<li>AiQualityControlResult：媒体质检结果；</li>
<li>ProcessEof：直播流处理结束。</li> 
     * @return NotificationType 直播流处理结果类型，包含：
<li>AiReviewResult：内容审核结果；</li>
<li>AiRecognitionResult：内容识别结果；</li>
<li>LiveRecordResult：直播录制结果；</li>
<li>AiQualityControlResult：媒体质检结果；</li>
<li>ProcessEof：直播流处理结束。</li>
     */
    public String getNotificationType() {
        return this.NotificationType;
    }

    /**
     * Set 直播流处理结果类型，包含：
<li>AiReviewResult：内容审核结果；</li>
<li>AiRecognitionResult：内容识别结果；</li>
<li>LiveRecordResult：直播录制结果；</li>
<li>AiQualityControlResult：媒体质检结果；</li>
<li>ProcessEof：直播流处理结束。</li>
     * @param NotificationType 直播流处理结果类型，包含：
<li>AiReviewResult：内容审核结果；</li>
<li>AiRecognitionResult：内容识别结果；</li>
<li>LiveRecordResult：直播录制结果；</li>
<li>AiQualityControlResult：媒体质检结果；</li>
<li>ProcessEof：直播流处理结束。</li>
     */
    public void setNotificationType(String NotificationType) {
        this.NotificationType = NotificationType;
    }

    /**
     * Get 视频处理任务 ID。 
     * @return TaskId 视频处理任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 视频处理任务 ID。
     * @param TaskId 视频处理任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 直播流处理错误信息，当 NotificationType 为 ProcessEof 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessEofInfo 直播流处理错误信息，当 NotificationType 为 ProcessEof 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamProcessErrorInfo getProcessEofInfo() {
        return this.ProcessEofInfo;
    }

    /**
     * Set 直播流处理错误信息，当 NotificationType 为 ProcessEof 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessEofInfo 直播流处理错误信息，当 NotificationType 为 ProcessEof 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessEofInfo(LiveStreamProcessErrorInfo ProcessEofInfo) {
        this.ProcessEofInfo = ProcessEofInfo;
    }

    /**
     * Get 内容审核结果，当 NotificationType 为 AiReviewResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiReviewResultInfo 内容审核结果，当 NotificationType 为 AiReviewResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamAiReviewResultInfo getAiReviewResultInfo() {
        return this.AiReviewResultInfo;
    }

    /**
     * Set 内容审核结果，当 NotificationType 为 AiReviewResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiReviewResultInfo 内容审核结果，当 NotificationType 为 AiReviewResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiReviewResultInfo(LiveStreamAiReviewResultInfo AiReviewResultInfo) {
        this.AiReviewResultInfo = AiReviewResultInfo;
    }

    /**
     * Get 内容识别结果，当 NotificationType 为 AiRecognitionResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiRecognitionResultInfo 内容识别结果，当 NotificationType 为 AiRecognitionResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamAiRecognitionResultInfo getAiRecognitionResultInfo() {
        return this.AiRecognitionResultInfo;
    }

    /**
     * Set 内容识别结果，当 NotificationType 为 AiRecognitionResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiRecognitionResultInfo 内容识别结果，当 NotificationType 为 AiRecognitionResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiRecognitionResultInfo(LiveStreamAiRecognitionResultInfo AiRecognitionResultInfo) {
        this.AiRecognitionResultInfo = AiRecognitionResultInfo;
    }

    /**
     * Get 内容分析结果，当 NotificationType 为 AiAnalysisResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiAnalysisResultInfo 内容分析结果，当 NotificationType 为 AiAnalysisResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamAiAnalysisResultInfo getAiAnalysisResultInfo() {
        return this.AiAnalysisResultInfo;
    }

    /**
     * Set 内容分析结果，当 NotificationType 为 AiAnalysisResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiAnalysisResultInfo 内容分析结果，当 NotificationType 为 AiAnalysisResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiAnalysisResultInfo(LiveStreamAiAnalysisResultInfo AiAnalysisResultInfo) {
        this.AiAnalysisResultInfo = AiAnalysisResultInfo;
    }

    /**
     * Get 媒体质检结果，当 NotificationType 为 AiQualityControlResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiQualityControlResultInfo 媒体质检结果，当 NotificationType 为 AiQualityControlResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamAiQualityControlResultInfo getAiQualityControlResultInfo() {
        return this.AiQualityControlResultInfo;
    }

    /**
     * Set 媒体质检结果，当 NotificationType 为 AiQualityControlResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiQualityControlResultInfo 媒体质检结果，当 NotificationType 为 AiQualityControlResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiQualityControlResultInfo(LiveStreamAiQualityControlResultInfo AiQualityControlResultInfo) {
        this.AiQualityControlResultInfo = AiQualityControlResultInfo;
    }

    /**
     * Get 直播录制结果，当 NotificationType 为 LiveRecordResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveRecordResultInfo 直播录制结果，当 NotificationType 为 LiveRecordResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LiveStreamRecordResultInfo getLiveRecordResultInfo() {
        return this.LiveRecordResultInfo;
    }

    /**
     * Set 直播录制结果，当 NotificationType 为 LiveRecordResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveRecordResultInfo 直播录制结果，当 NotificationType 为 LiveRecordResult 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveRecordResultInfo(LiveStreamRecordResultInfo LiveRecordResultInfo) {
        this.LiveRecordResultInfo = LiveRecordResultInfo;
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
     * Get - 过期时间，事件通知签名过期 UNIX 时间戳。 - 来自媒体处理的消息通知默认过期时间是10分钟，如果一条消息通知中的 Timestamp 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。 - Timestamp 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。 
     * @return Timestamp - 过期时间，事件通知签名过期 UNIX 时间戳。 - 来自媒体处理的消息通知默认过期时间是10分钟，如果一条消息通知中的 Timestamp 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。 - Timestamp 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set - 过期时间，事件通知签名过期 UNIX 时间戳。 - 来自媒体处理的消息通知默认过期时间是10分钟，如果一条消息通知中的 Timestamp 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。 - Timestamp 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。
     * @param Timestamp - 过期时间，事件通知签名过期 UNIX 时间戳。 - 来自媒体处理的消息通知默认过期时间是10分钟，如果一条消息通知中的 Timestamp 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。 - Timestamp 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 事件通知安全签名 Sign = MD5（Timestamp + NotifyKey）。说明：媒体处理把Timestamp 和 TaskNotifyConfig 里面的NotifyKey 进行字符串拼接后通过 MD5 计算得出 Sign 值，并将其放在通知消息里，您的后台服务器在收到通知消息后可以根据同样的算法确认 Sign 是否正确，进而确认消息是否确实来自媒体处理后台。 
     * @return Sign 事件通知安全签名 Sign = MD5（Timestamp + NotifyKey）。说明：媒体处理把Timestamp 和 TaskNotifyConfig 里面的NotifyKey 进行字符串拼接后通过 MD5 计算得出 Sign 值，并将其放在通知消息里，您的后台服务器在收到通知消息后可以根据同样的算法确认 Sign 是否正确，进而确认消息是否确实来自媒体处理后台。
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set 事件通知安全签名 Sign = MD5（Timestamp + NotifyKey）。说明：媒体处理把Timestamp 和 TaskNotifyConfig 里面的NotifyKey 进行字符串拼接后通过 MD5 计算得出 Sign 值，并将其放在通知消息里，您的后台服务器在收到通知消息后可以根据同样的算法确认 Sign 是否正确，进而确认消息是否确实来自媒体处理后台。
     * @param Sign 事件通知安全签名 Sign = MD5（Timestamp + NotifyKey）。说明：媒体处理把Timestamp 和 TaskNotifyConfig 里面的NotifyKey 进行字符串拼接后通过 MD5 计算得出 Sign 值，并将其放在通知消息里，您的后台服务器在收到通知消息后可以根据同样的算法确认 Sign 是否正确，进而确认消息是否确实来自媒体处理后台。
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
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

    public ParseLiveStreamProcessNotificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseLiveStreamProcessNotificationResponse(ParseLiveStreamProcessNotificationResponse source) {
        if (source.NotificationType != null) {
            this.NotificationType = new String(source.NotificationType);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ProcessEofInfo != null) {
            this.ProcessEofInfo = new LiveStreamProcessErrorInfo(source.ProcessEofInfo);
        }
        if (source.AiReviewResultInfo != null) {
            this.AiReviewResultInfo = new LiveStreamAiReviewResultInfo(source.AiReviewResultInfo);
        }
        if (source.AiRecognitionResultInfo != null) {
            this.AiRecognitionResultInfo = new LiveStreamAiRecognitionResultInfo(source.AiRecognitionResultInfo);
        }
        if (source.AiAnalysisResultInfo != null) {
            this.AiAnalysisResultInfo = new LiveStreamAiAnalysisResultInfo(source.AiAnalysisResultInfo);
        }
        if (source.AiQualityControlResultInfo != null) {
            this.AiQualityControlResultInfo = new LiveStreamAiQualityControlResultInfo(source.AiQualityControlResultInfo);
        }
        if (source.LiveRecordResultInfo != null) {
            this.LiveRecordResultInfo = new LiveStreamRecordResultInfo(source.LiveRecordResultInfo);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Sign != null) {
            this.Sign = new String(source.Sign);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotificationType", this.NotificationType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamObj(map, prefix + "ProcessEofInfo.", this.ProcessEofInfo);
        this.setParamObj(map, prefix + "AiReviewResultInfo.", this.AiReviewResultInfo);
        this.setParamObj(map, prefix + "AiRecognitionResultInfo.", this.AiRecognitionResultInfo);
        this.setParamObj(map, prefix + "AiAnalysisResultInfo.", this.AiAnalysisResultInfo);
        this.setParamObj(map, prefix + "AiQualityControlResultInfo.", this.AiQualityControlResultInfo);
        this.setParamObj(map, prefix + "LiveRecordResultInfo.", this.LiveRecordResultInfo);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

