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

public class MPSSubTaskResult extends AbstractModel {

    /**
    * 任务类型。MPS 的 WorkflowTask 结构中的具体子任务类型。取值：<li>AiAnalysis.DeLogo：智能擦除任务。</li><li>MediaProcess.Transcode：音视频增强任务。</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务状态。有 PROCESSING，SUCCESS 和 FAIL 三种。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码。返回0时成功，其他值为失败。
    */
    @SerializedName("ErrCode")
    @Expose
    private String ErrCode;

    /**
    * 错误信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * MPS 视频处理任务输入。该字段对应 MPS 任务返回中的 Input 结果，以 JSON 格式返回。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * MPS 视频处理任务输出。
    */
    @SerializedName("Output")
    @Expose
    private MPSTaskOutput Output;

    /**
     * Get 任务类型。MPS 的 WorkflowTask 结构中的具体子任务类型。取值：<li>AiAnalysis.DeLogo：智能擦除任务。</li><li>MediaProcess.Transcode：音视频增强任务。</li> 
     * @return TaskType 任务类型。MPS 的 WorkflowTask 结构中的具体子任务类型。取值：<li>AiAnalysis.DeLogo：智能擦除任务。</li><li>MediaProcess.Transcode：音视频增强任务。</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型。MPS 的 WorkflowTask 结构中的具体子任务类型。取值：<li>AiAnalysis.DeLogo：智能擦除任务。</li><li>MediaProcess.Transcode：音视频增强任务。</li>
     * @param TaskType 任务类型。MPS 的 WorkflowTask 结构中的具体子任务类型。取值：<li>AiAnalysis.DeLogo：智能擦除任务。</li><li>MediaProcess.Transcode：音视频增强任务。</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务状态。有 PROCESSING，SUCCESS 和 FAIL 三种。 
     * @return Status 任务状态。有 PROCESSING，SUCCESS 和 FAIL 三种。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。有 PROCESSING，SUCCESS 和 FAIL 三种。
     * @param Status 任务状态。有 PROCESSING，SUCCESS 和 FAIL 三种。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误码。返回0时成功，其他值为失败。 
     * @return ErrCode 错误码。返回0时成功，其他值为失败。
     */
    public String getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码。返回0时成功，其他值为失败。
     * @param ErrCode 错误码。返回0时成功，其他值为失败。
     */
    public void setErrCode(String ErrCode) {
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
     * Get MPS 视频处理任务输入。该字段对应 MPS 任务返回中的 Input 结果，以 JSON 格式返回。 
     * @return Input MPS 视频处理任务输入。该字段对应 MPS 任务返回中的 Input 结果，以 JSON 格式返回。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set MPS 视频处理任务输入。该字段对应 MPS 任务返回中的 Input 结果，以 JSON 格式返回。
     * @param Input MPS 视频处理任务输入。该字段对应 MPS 任务返回中的 Input 结果，以 JSON 格式返回。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get MPS 视频处理任务输出。 
     * @return Output MPS 视频处理任务输出。
     */
    public MPSTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set MPS 视频处理任务输出。
     * @param Output MPS 视频处理任务输出。
     */
    public void setOutput(MPSTaskOutput Output) {
        this.Output = Output;
    }

    public MPSSubTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSubTaskResult(MPSSubTaskResult source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new String(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new MPSTaskOutput(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

