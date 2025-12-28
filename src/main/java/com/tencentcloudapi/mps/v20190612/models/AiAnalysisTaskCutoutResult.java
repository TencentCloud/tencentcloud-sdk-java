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

public class AiAnalysisTaskCutoutResult extends AbstractModel {

    /**
    * 任务状态，有 `PROCESSING`，`SUCCESS` 和 `FAIL` 三种
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码，空字符串表示成功，其他值表示失败，取值请参考 [媒体处理类错误码](https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) 列表。
    */
    @SerializedName("ErrCodeExt")
    @Expose
    private String ErrCodeExt;

    /**
    * 错误信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 抠图任务输入
    */
    @SerializedName("Input")
    @Expose
    private AiAnalysisTaskCutoutInput Input;

    /**
    * 抠图任务输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private AiAnalysisTaskCutoutOutput Output;

    /**
    * 任务进度
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 任务开始执行的时间，采用 ISO 日期格式。
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * 任务结束执行的时间，采用 ISO 日期格式。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get 任务状态，有 `PROCESSING`，`SUCCESS` 和 `FAIL` 三种 
     * @return Status 任务状态，有 `PROCESSING`，`SUCCESS` 和 `FAIL` 三种
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，有 `PROCESSING`，`SUCCESS` 和 `FAIL` 三种
     * @param Status 任务状态，有 `PROCESSING`，`SUCCESS` 和 `FAIL` 三种
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误码，空字符串表示成功，其他值表示失败，取值请参考 [媒体处理类错误码](https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) 列表。 
     * @return ErrCodeExt 错误码，空字符串表示成功，其他值表示失败，取值请参考 [媒体处理类错误码](https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) 列表。
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set 错误码，空字符串表示成功，其他值表示失败，取值请参考 [媒体处理类错误码](https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) 列表。
     * @param ErrCodeExt 错误码，空字符串表示成功，其他值表示失败，取值请参考 [媒体处理类错误码](https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81) 列表。
     */
    public void setErrCodeExt(String ErrCodeExt) {
        this.ErrCodeExt = ErrCodeExt;
    }

    /**
     * Get 错误信息 
     * @return Message 错误信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息
     * @param Message 错误信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 抠图任务输入 
     * @return Input 抠图任务输入
     */
    public AiAnalysisTaskCutoutInput getInput() {
        return this.Input;
    }

    /**
     * Set 抠图任务输入
     * @param Input 抠图任务输入
     */
    public void setInput(AiAnalysisTaskCutoutInput Input) {
        this.Input = Input;
    }

    /**
     * Get 抠图任务输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 抠图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskCutoutOutput getOutput() {
        return this.Output;
    }

    /**
     * Set 抠图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 抠图任务输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(AiAnalysisTaskCutoutOutput Output) {
        this.Output = Output;
    }

    /**
     * Get 任务进度 
     * @return Progress 任务进度
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度
     * @param Progress 任务进度
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 任务开始执行的时间，采用 ISO 日期格式。 
     * @return BeginProcessTime 任务开始执行的时间，采用 ISO 日期格式。
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set 任务开始执行的时间，采用 ISO 日期格式。
     * @param BeginProcessTime 任务开始执行的时间，采用 ISO 日期格式。
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get 任务结束执行的时间，采用 ISO 日期格式。 
     * @return FinishTime 任务结束执行的时间，采用 ISO 日期格式。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 任务结束执行的时间，采用 ISO 日期格式。
     * @param FinishTime 任务结束执行的时间，采用 ISO 日期格式。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public AiAnalysisTaskCutoutResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskCutoutResult(AiAnalysisTaskCutoutResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Input != null) {
            this.Input = new AiAnalysisTaskCutoutInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new AiAnalysisTaskCutoutOutput(source.Output);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.BeginProcessTime != null) {
            this.BeginProcessTime = new String(source.BeginProcessTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

