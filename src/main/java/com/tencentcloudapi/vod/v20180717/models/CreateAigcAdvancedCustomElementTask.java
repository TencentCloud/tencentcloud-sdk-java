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

public class CreateAigcAdvancedCustomElementTask extends AbstractModel {

    /**
    * <p>任务 ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务状态。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>FINISH： 已完成</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。</p>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>扩展错误码。空字符串表示成功，其它值表示失败。</p>
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * <p>错误信息。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>任务进度，取值范围 [0-100] 。</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>创建 AIGC 自定义主体任务的输入信息。</p>
    */
    @SerializedName("Input")
    @Expose
    private CreateAigcAdvancedCustomElementInput Input;

    /**
    * <p>创建 AIGC 自定义主体任务输出信息。</p>
    */
    @SerializedName("Output")
    @Expose
    private CreateAigcAdvancedCustomElementOutput Output;

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
     * Get <p>任务 ID。</p> 
     * @return TaskId <p>任务 ID。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID。</p>
     * @param TaskId <p>任务 ID。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务状态。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>FINISH： 已完成</li></ul> 
     * @return Status <p>任务状态。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>FINISH： 已完成</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>FINISH： 已完成</li></ul>
     * @param Status <p>任务状态。</p><p>枚举值：</p><ul><li>PROCESSING： 处理中</li><li>FINISH： 已完成</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。</p> 
     * @return ErrCode <p>错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。</p>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。</p>
     * @param ErrCode <p>错误码。源异常时返回非0错误码，返回0时请使用各个具体任务的 ErrCode。</p>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>扩展错误码。空字符串表示成功，其它值表示失败。</p> 
     * @return ErrCodeExt <p>扩展错误码。空字符串表示成功，其它值表示失败。</p>
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set <p>扩展错误码。空字符串表示成功，其它值表示失败。</p>
     * @param ErrCodeExt <p>扩展错误码。空字符串表示成功，其它值表示失败。</p>
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get <p>错误信息。</p> 
     * @return Message <p>错误信息。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>错误信息。</p>
     * @param Message <p>错误信息。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>任务进度，取值范围 [0-100] 。</p> 
     * @return Progress <p>任务进度，取值范围 [0-100] 。</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>任务进度，取值范围 [0-100] 。</p>
     * @param Progress <p>任务进度，取值范围 [0-100] 。</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>创建 AIGC 自定义主体任务的输入信息。</p> 
     * @return Input <p>创建 AIGC 自定义主体任务的输入信息。</p>
     */
    public CreateAigcAdvancedCustomElementInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>创建 AIGC 自定义主体任务的输入信息。</p>
     * @param Input <p>创建 AIGC 自定义主体任务的输入信息。</p>
     */
    public void setInput(CreateAigcAdvancedCustomElementInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>创建 AIGC 自定义主体任务输出信息。</p> 
     * @return Output <p>创建 AIGC 自定义主体任务输出信息。</p>
     */
    public CreateAigcAdvancedCustomElementOutput getOutput() {
        return this.Output;
    }

    /**
     * Set <p>创建 AIGC 自定义主体任务输出信息。</p>
     * @param Output <p>创建 AIGC 自定义主体任务输出信息。</p>
     */
    public void setOutput(CreateAigcAdvancedCustomElementOutput Output) {
        this.Output = Output;
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

    public CreateAigcAdvancedCustomElementTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAdvancedCustomElementTask(CreateAigcAdvancedCustomElementTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Input != null) {
            this.Input = new CreateAigcAdvancedCustomElementInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new CreateAigcAdvancedCustomElementOutput(source.Output);
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
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

