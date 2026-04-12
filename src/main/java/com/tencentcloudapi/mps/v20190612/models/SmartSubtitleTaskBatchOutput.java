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

public class SmartSubtitleTaskBatchOutput extends AbstractModel {

    /**
    * <p>任务进度。</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>任务状态，有 PROCESSING，SUCCESS，WAITING 和 FAIL 四种。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
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
    * <p>翻译任务输出信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransTextTask")
    @Expose
    private SmartSubtitleTaskTransTextResultOutput TransTextTask;

    /**
    * <p>语音全文识别任务输出信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrFullTextTask")
    @Expose
    private SmartSubtitleTaskAsrFullTextResultOutput AsrFullTextTask;

    /**
     * Get <p>任务进度。</p> 
     * @return Progress <p>任务进度。</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>任务进度。</p>
     * @param Progress <p>任务进度。</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>任务状态，有 PROCESSING，SUCCESS，WAITING 和 FAIL 四种。</p> 
     * @return Status <p>任务状态，有 PROCESSING，SUCCESS，WAITING 和 FAIL 四种。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，有 PROCESSING，SUCCESS，WAITING 和 FAIL 四种。</p>
     * @param Status <p>任务状态，有 PROCESSING，SUCCESS，WAITING 和 FAIL 四种。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p> 
     * @return ErrCodeExt <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
     */
    public String getErrCodeExt() {
        return this.ErrCodeExt;
    }

    /**
     * Set <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
     * @param ErrCodeExt <p>错误码，空字符串表示成功，其他值表示失败，取值请参考 <a href="https://cloud.tencent.com/document/product/862/50369#.E8.A7.86.E9.A2.91.E5.A4.84.E7.90.86.E7.B1.BB.E9.94.99.E8.AF.AF.E7.A0.81">媒体处理类错误码</a> 列表。</p>
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
     * Get <p>翻译任务输出信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransTextTask <p>翻译任务输出信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartSubtitleTaskTransTextResultOutput getTransTextTask() {
        return this.TransTextTask;
    }

    /**
     * Set <p>翻译任务输出信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransTextTask <p>翻译任务输出信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransTextTask(SmartSubtitleTaskTransTextResultOutput TransTextTask) {
        this.TransTextTask = TransTextTask;
    }

    /**
     * Get <p>语音全文识别任务输出信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrFullTextTask <p>语音全文识别任务输出信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartSubtitleTaskAsrFullTextResultOutput getAsrFullTextTask() {
        return this.AsrFullTextTask;
    }

    /**
     * Set <p>语音全文识别任务输出信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrFullTextTask <p>语音全文识别任务输出信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrFullTextTask(SmartSubtitleTaskAsrFullTextResultOutput AsrFullTextTask) {
        this.AsrFullTextTask = AsrFullTextTask;
    }

    public SmartSubtitleTaskBatchOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartSubtitleTaskBatchOutput(SmartSubtitleTaskBatchOutput source) {
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCodeExt != null) {
            this.ErrCodeExt = new String(source.ErrCodeExt);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.TransTextTask != null) {
            this.TransTextTask = new SmartSubtitleTaskTransTextResultOutput(source.TransTextTask);
        }
        if (source.AsrFullTextTask != null) {
            this.AsrFullTextTask = new SmartSubtitleTaskAsrFullTextResultOutput(source.AsrFullTextTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCodeExt", this.ErrCodeExt);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "TransTextTask.", this.TransTextTask);
        this.setParamObj(map, prefix + "AsrFullTextTask.", this.AsrFullTextTask);

    }
}

