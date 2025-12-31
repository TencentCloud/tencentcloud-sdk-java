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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SceneAigcImageTask extends AbstractModel {

    /**
    * 任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 任务进度，取值范围 [0-100] 。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * AIGC 生图任务的输入信息。
    */
    @SerializedName("Input")
    @Expose
    private SceneAigcImageTaskInput Input;

    /**
    * AIGC 生图任务的输出信息。
    */
    @SerializedName("Output")
    @Expose
    private SceneAigcImageTaskOutput Output;

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
     * Get 任务 ID。 
     * @return TaskId 任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID。
     * @param TaskId 任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li> 
     * @return Status 任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     * @param Status 任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。 
     * @return ErrCode 错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。
     * @param ErrCode 错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 错误信息。 
     * @return Message 错误信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息。
     * @param Message 错误信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 任务进度，取值范围 [0-100] 。 
     * @return Progress 任务进度，取值范围 [0-100] 。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度，取值范围 [0-100] 。
     * @param Progress 任务进度，取值范围 [0-100] 。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get AIGC 生图任务的输入信息。 
     * @return Input AIGC 生图任务的输入信息。
     */
    public SceneAigcImageTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set AIGC 生图任务的输入信息。
     * @param Input AIGC 生图任务的输入信息。
     */
    public void setInput(SceneAigcImageTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get AIGC 生图任务的输出信息。 
     * @return Output AIGC 生图任务的输出信息。
     */
    public SceneAigcImageTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set AIGC 生图任务的输出信息。
     * @param Output AIGC 生图任务的输出信息。
     */
    public void setOutput(SceneAigcImageTaskOutput Output) {
        this.Output = Output;
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

    public SceneAigcImageTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneAigcImageTask(SceneAigcImageTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Input != null) {
            this.Input = new SceneAigcImageTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new SceneAigcImageTaskOutput(source.Output);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

