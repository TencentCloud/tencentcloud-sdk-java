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

public class ComplexAdaptiveDynamicStreamingTaskResult extends AbstractModel {

    /**
    * 任务状态，取值：
<li>PROCESSING：处理中；</li>
<li>SUCCESS：已完成；</li>
<li>FAIL：失败。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码，空字符串表示成功，其他值表示失败，取值请参考 [视频处理类错误码](https://cloud.tencent.com/document/product/266/50368#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) 列表。
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * 错误信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 转码进度，取值范围 [0-100] 。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 自适应码流任务的输入。
    */
    @SerializedName("Input")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskInput Input;

    /**
    * 自适应码流任务的输出。
    */
    @SerializedName("Output")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskOutput Output;

    /**
     * Get 任务状态，取值：
<li>PROCESSING：处理中；</li>
<li>SUCCESS：已完成；</li>
<li>FAIL：失败。</li> 
     * @return Status 任务状态，取值：
<li>PROCESSING：处理中；</li>
<li>SUCCESS：已完成；</li>
<li>FAIL：失败。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，取值：
<li>PROCESSING：处理中；</li>
<li>SUCCESS：已完成；</li>
<li>FAIL：失败。</li>
     * @param Status 任务状态，取值：
<li>PROCESSING：处理中；</li>
<li>SUCCESS：已完成；</li>
<li>FAIL：失败。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误码，空字符串表示成功，其他值表示失败，取值请参考 [视频处理类错误码](https://cloud.tencent.com/document/product/266/50368#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) 列表。 
     * @return ErrCodeExt 错误码，空字符串表示成功，其他值表示失败，取值请参考 [视频处理类错误码](https://cloud.tencent.com/document/product/266/50368#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) 列表。
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set 错误码，空字符串表示成功，其他值表示失败，取值请参考 [视频处理类错误码](https://cloud.tencent.com/document/product/266/50368#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) 列表。
     * @param ErrCodeExt 错误码，空字符串表示成功，其他值表示失败，取值请参考 [视频处理类错误码](https://cloud.tencent.com/document/product/266/50368#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) 列表。
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
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
     * Get 转码进度，取值范围 [0-100] 。 
     * @return Progress 转码进度，取值范围 [0-100] 。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 转码进度，取值范围 [0-100] 。
     * @param Progress 转码进度，取值范围 [0-100] 。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 自适应码流任务的输入。 
     * @return Input 自适应码流任务的输入。
     */
    public ComplexAdaptiveDynamicStreamingTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set 自适应码流任务的输入。
     * @param Input 自适应码流任务的输入。
     */
    public void setInput(ComplexAdaptiveDynamicStreamingTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get 自适应码流任务的输出。 
     * @return Output 自适应码流任务的输出。
     */
    public ComplexAdaptiveDynamicStreamingTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set 自适应码流任务的输出。
     * @param Output 自适应码流任务的输出。
     */
    public void setOutput(ComplexAdaptiveDynamicStreamingTaskOutput Output) {
        this.Output = Output;
    }

    public ComplexAdaptiveDynamicStreamingTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexAdaptiveDynamicStreamingTaskResult(ComplexAdaptiveDynamicStreamingTaskResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
            this.Input = new ComplexAdaptiveDynamicStreamingTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new ComplexAdaptiveDynamicStreamingTaskOutput(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);

    }
}

