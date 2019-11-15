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

public class ParseNotificationResponse  extends AbstractModel{

    /**
    * 支持事件类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowTaskEvent")
    @Expose
    private WorkflowTask WorkflowTaskEvent;

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
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取支持事件类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
     * @return EventType 支持事件类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * 设置支持事件类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
     * @param EventType 支持事件类型，目前取值有：
<li>WorkflowTask：视频工作流处理任务。</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * 获取视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @return WorkflowTaskEvent 视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTask getWorkflowTaskEvent() {
        return this.WorkflowTaskEvent;
    }

    /**
     * 设置视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowTaskEvent 视频处理任务信息，仅当 TaskType 为 WorkflowTask，该字段有值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowTaskEvent(WorkflowTask WorkflowTaskEvent) {
        this.WorkflowTaskEvent = WorkflowTaskEvent;
    }

    /**
     * 获取用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
     * @return SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长50个字符，不带或者带空字符串表示不做去重。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 获取来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
     * @return SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * 设置来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
     * @param SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长1000个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamObj(map, prefix + "WorkflowTaskEvent.", this.WorkflowTaskEvent);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

