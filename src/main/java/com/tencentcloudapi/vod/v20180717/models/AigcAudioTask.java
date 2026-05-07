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

public class AigcAudioTask extends AbstractModel {

    /**
    * <p>任务ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li></p>
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
    * <p>AIGC 音频任务的输入信息。</p>
    */
    @SerializedName("Input")
    @Expose
    private AigcAudioTaskInput Input;

    /**
    * <p>AIGC 音频任务的输出信息。</p>
    */
    @SerializedName("Output")
    @Expose
    private AigcAudioTaskOutput Output;

    /**
     * Get <p>任务ID。</p> 
     * @return TaskId <p>任务ID。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID。</p>
     * @param TaskId <p>任务ID。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li></p> 
     * @return Status <p>任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li></p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li></p>
     * @param Status <p>任务状态，取值：<li>PROCESSING：处理中；</li><li>FINISH：已完成。</li></p>
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
     * Get <p>AIGC 音频任务的输入信息。</p> 
     * @return Input <p>AIGC 音频任务的输入信息。</p>
     */
    public AigcAudioTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set <p>AIGC 音频任务的输入信息。</p>
     * @param Input <p>AIGC 音频任务的输入信息。</p>
     */
    public void setInput(AigcAudioTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get <p>AIGC 音频任务的输出信息。</p> 
     * @return Output <p>AIGC 音频任务的输出信息。</p>
     */
    public AigcAudioTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set <p>AIGC 音频任务的输出信息。</p>
     * @param Output <p>AIGC 音频任务的输出信息。</p>
     */
    public void setOutput(AigcAudioTaskOutput Output) {
        this.Output = Output;
    }

    public AigcAudioTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcAudioTask(AigcAudioTask source) {
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
            this.Input = new AigcAudioTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AigcAudioTaskOutput(source.Output);
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

    }
}

