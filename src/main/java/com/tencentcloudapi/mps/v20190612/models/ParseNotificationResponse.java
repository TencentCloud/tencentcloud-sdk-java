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

public class ParseNotificationResponse extends AbstractModel {

    /**
    * 支持事件类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
<li>EditMediaTask：视频编辑任务。</li>
<li>ScheduleTask：编排任务。</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 视频处理任务信息，仅当 EventType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowTaskEvent")
    @Expose
    private WorkflowTask WorkflowTaskEvent;

    /**
    * 视频编辑任务信息，仅当 EventType 为 EditMediaTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EditMediaTaskEvent")
    @Expose
    private EditMediaTask EditMediaTaskEvent;

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
    * 编排任务信息，仅当 EventType 为 ScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTaskEvent")
    @Expose
    private ScheduleTask ScheduleTaskEvent;

    /**
    * - 过期时间，事件通知签名过期 UNIX 时间戳。
- 来自媒体处理的消息通知默认过期时间是10分钟，如果一条消息通知中的 Timestamp 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。
- Timestamp 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。

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
     * Get 支持事件类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
<li>EditMediaTask：视频编辑任务。</li>
<li>ScheduleTask：编排任务。</li> 
     * @return EventType 支持事件类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
<li>EditMediaTask：视频编辑任务。</li>
<li>ScheduleTask：编排任务。</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 支持事件类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
<li>EditMediaTask：视频编辑任务。</li>
<li>ScheduleTask：编排任务。</li>
     * @param EventType 支持事件类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
<li>EditMediaTask：视频编辑任务。</li>
<li>ScheduleTask：编排任务。</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 视频处理任务信息，仅当 EventType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowTaskEvent 视频处理任务信息，仅当 EventType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTask getWorkflowTaskEvent() {
        return this.WorkflowTaskEvent;
    }

    /**
     * Set 视频处理任务信息，仅当 EventType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowTaskEvent 视频处理任务信息，仅当 EventType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowTaskEvent(WorkflowTask WorkflowTaskEvent) {
        this.WorkflowTaskEvent = WorkflowTaskEvent;
    }

    /**
     * Get 视频编辑任务信息，仅当 EventType 为 EditMediaTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EditMediaTaskEvent 视频编辑任务信息，仅当 EventType 为 EditMediaTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EditMediaTask getEditMediaTaskEvent() {
        return this.EditMediaTaskEvent;
    }

    /**
     * Set 视频编辑任务信息，仅当 EventType 为 EditMediaTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EditMediaTaskEvent 视频编辑任务信息，仅当 EventType 为 EditMediaTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditMediaTaskEvent(EditMediaTask EditMediaTaskEvent) {
        this.EditMediaTaskEvent = EditMediaTaskEvent;
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
     * Get 编排任务信息，仅当 EventType 为 ScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTaskEvent 编排任务信息，仅当 EventType 为 ScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduleTask getScheduleTaskEvent() {
        return this.ScheduleTaskEvent;
    }

    /**
     * Set 编排任务信息，仅当 EventType 为 ScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTaskEvent 编排任务信息，仅当 EventType 为 ScheduleTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTaskEvent(ScheduleTask ScheduleTaskEvent) {
        this.ScheduleTaskEvent = ScheduleTaskEvent;
    }

    /**
     * Get - 过期时间，事件通知签名过期 UNIX 时间戳。
- 来自媒体处理的消息通知默认过期时间是10分钟，如果一条消息通知中的 Timestamp 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。
- Timestamp 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。
 
     * @return Timestamp - 过期时间，事件通知签名过期 UNIX 时间戳。
- 来自媒体处理的消息通知默认过期时间是10分钟，如果一条消息通知中的 Timestamp 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。
- Timestamp 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。

     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set - 过期时间，事件通知签名过期 UNIX 时间戳。
- 来自媒体处理的消息通知默认过期时间是10分钟，如果一条消息通知中的 Timestamp 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。
- Timestamp 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。

     * @param Timestamp - 过期时间，事件通知签名过期 UNIX 时间戳。
- 来自媒体处理的消息通知默认过期时间是10分钟，如果一条消息通知中的 Timestamp 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。
- Timestamp 的格式为十进制 UNIX 时间戳，即从1970年01月01日（UTC/GMT 的午夜）开始所经过的秒数。

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

    public ParseNotificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseNotificationResponse(ParseNotificationResponse source) {
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.WorkflowTaskEvent != null) {
            this.WorkflowTaskEvent = new WorkflowTask(source.WorkflowTaskEvent);
        }
        if (source.EditMediaTaskEvent != null) {
            this.EditMediaTaskEvent = new EditMediaTask(source.EditMediaTaskEvent);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.ScheduleTaskEvent != null) {
            this.ScheduleTaskEvent = new ScheduleTask(source.ScheduleTaskEvent);
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
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamObj(map, prefix + "WorkflowTaskEvent.", this.WorkflowTaskEvent);
        this.setParamObj(map, prefix + "EditMediaTaskEvent.", this.EditMediaTaskEvent);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamObj(map, prefix + "ScheduleTaskEvent.", this.ScheduleTaskEvent);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

