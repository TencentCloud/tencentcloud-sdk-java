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

public class PureSubtitleTransResult extends AbstractModel {

    /**
    * 任务状态（有以下三种）： 
- PROCESSING
- SUCCESS 
- FAIL
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码，空字符串表示成功，其他值表示失败，取值请参考 媒体处理类错误码 列表。
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
    * 错误信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 翻译任务输入信息。
    */
    @SerializedName("Input")
    @Expose
    private SmartSubtitleTaskResultInput Input;

    /**
    * 纯字幕翻译输出结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private PureSubtitleTransResultOutput Output;

    /**
    * 任务进度。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get 任务状态（有以下三种）： 
- PROCESSING
- SUCCESS 
- FAIL 
     * @return Status 任务状态（有以下三种）： 
- PROCESSING
- SUCCESS 
- FAIL
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态（有以下三种）： 
- PROCESSING
- SUCCESS 
- FAIL
     * @param Status 任务状态（有以下三种）： 
- PROCESSING
- SUCCESS 
- FAIL
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误码，空字符串表示成功，其他值表示失败，取值请参考 媒体处理类错误码 列表。 
     * @return ErrCodeExt 错误码，空字符串表示成功，其他值表示失败，取值请参考 媒体处理类错误码 列表。
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set 错误码，空字符串表示成功，其他值表示失败，取值请参考 媒体处理类错误码 列表。
     * @param ErrCodeExt 错误码，空字符串表示成功，其他值表示失败，取值请参考 媒体处理类错误码 列表。
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
     * Get 翻译任务输入信息。 
     * @return Input 翻译任务输入信息。
     */
    public SmartSubtitleTaskResultInput getInput() {
        return this.Input;
    }

    /**
     * Set 翻译任务输入信息。
     * @param Input 翻译任务输入信息。
     */
    public void setInput(SmartSubtitleTaskResultInput Input) {
        this.Input = Input;
    }

    /**
     * Get 纯字幕翻译输出结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 纯字幕翻译输出结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PureSubtitleTransResultOutput getOutput() {
        return this.Output;
    }

    /**
     * Set 纯字幕翻译输出结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 纯字幕翻译输出结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(PureSubtitleTransResultOutput Output) {
        this.Output = Output;
    }

    /**
     * Get 任务进度。 
     * @return Progress 任务进度。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度。
     * @param Progress 任务进度。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public PureSubtitleTransResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PureSubtitleTransResult(PureSubtitleTransResult source) {
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
            this.Input = new SmartSubtitleTaskResultInput(source.Input);
        }
        if (source.Output != null) {
            this.Output = new PureSubtitleTransResultOutput(source.Output);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
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

    }
}

