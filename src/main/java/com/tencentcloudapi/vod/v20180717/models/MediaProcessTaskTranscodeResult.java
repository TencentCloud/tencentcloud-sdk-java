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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaProcessTaskTranscodeResult extends AbstractModel{

    /**
    * 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
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
    * 错误码，0 表示成功，其他值表示失败（该字段已不推荐使用，建议使用新的错误码字段 ErrCodeExt）。
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
    * 转码任务的输入。
    */
    @SerializedName("Input")
    @Expose
    private TranscodeTaskInput Input;

    /**
    * 转码任务的输出。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private MediaTranscodeItem Output;

    /**
    * 转码进度，取值范围 [0-100] 。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 转码任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * 转码任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。 
     * @return Status 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
     * @param Status 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
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
     * Get 错误码，0 表示成功，其他值表示失败（该字段已不推荐使用，建议使用新的错误码字段 ErrCodeExt）。 
     * @return ErrCode 错误码，0 表示成功，其他值表示失败（该字段已不推荐使用，建议使用新的错误码字段 ErrCodeExt）。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 错误码，0 表示成功，其他值表示失败（该字段已不推荐使用，建议使用新的错误码字段 ErrCodeExt）。
     * @param ErrCode 错误码，0 表示成功，其他值表示失败（该字段已不推荐使用，建议使用新的错误码字段 ErrCodeExt）。
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
     * Get 转码任务的输入。 
     * @return Input 转码任务的输入。
     */
    public TranscodeTaskInput getInput() {
        return this.Input;
    }

    /**
     * Set 转码任务的输入。
     * @param Input 转码任务的输入。
     */
    public void setInput(TranscodeTaskInput Input) {
        this.Input = Input;
    }

    /**
     * Get 转码任务的输出。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 转码任务的输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaTranscodeItem getOutput() {
        return this.Output;
    }

    /**
     * Set 转码任务的输出。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 转码任务的输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(MediaTranscodeItem Output) {
        this.Output = Output;
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
     * Get 转码任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return BeginProcessTime 转码任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set 转码任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param BeginProcessTime 转码任务开始执行的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get 转码任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return FinishTime 转码任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 转码任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param FinishTime 转码任务执行完毕的时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public MediaProcessTaskTranscodeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaProcessTaskTranscodeResult(MediaProcessTaskTranscodeResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Input != null) {
            this.Input = new TranscodeTaskInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new MediaTranscodeItem(source.Output);
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
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

