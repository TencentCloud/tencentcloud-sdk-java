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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatus extends AbstractModel {

    /**
    * <p>任务标识。注意：TaskId数据类型为uint64。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。</p>
    */
    @SerializedName("StatusStr")
    @Expose
    private String StatusStr;

    /**
    * <p>识别结果。</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>失败原因说明。</p>
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * <p>识别结果详情，包含每个句子中的词时间偏移，一般用于生成字幕的场景。(录音识别请求中ResTextFormat=1时该字段不为空)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultDetail")
    @Expose
    private SentenceDetail [] ResultDetail;

    /**
    * <p>音频时长(秒)。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioDuration")
    @Expose
    private Float AudioDuration;

    /**
    * <p>大模型后处理结果</p>
    */
    @SerializedName("LlmResults")
    @Expose
    private LlmResult [] LlmResults;

    /**
    * <p>说话人上下文 ID</p>
    */
    @SerializedName("SpeakerContextId")
    @Expose
    private String SpeakerContextId;

    /**
     * Get <p>任务标识。注意：TaskId数据类型为uint64。</p> 
     * @return TaskId <p>任务标识。注意：TaskId数据类型为uint64。</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务标识。注意：TaskId数据类型为uint64。</p>
     * @param TaskId <p>任务标识。注意：TaskId数据类型为uint64。</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。</p> 
     * @return Status <p>任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。</p>
     * @param Status <p>任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。</p> 
     * @return StatusStr <p>任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。</p>
     */
    public String getStatusStr() {
        return this.StatusStr;
    }

    /**
     * Set <p>任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。</p>
     * @param StatusStr <p>任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。</p>
     */
    public void setStatusStr(String StatusStr) {
        this.StatusStr = StatusStr;
    }

    /**
     * Get <p>识别结果。</p> 
     * @return Result <p>识别结果。</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>识别结果。</p>
     * @param Result <p>识别结果。</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>失败原因说明。</p> 
     * @return ErrorMsg <p>失败原因说明。</p>
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set <p>失败原因说明。</p>
     * @param ErrorMsg <p>失败原因说明。</p>
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get <p>识别结果详情，包含每个句子中的词时间偏移，一般用于生成字幕的场景。(录音识别请求中ResTextFormat=1时该字段不为空)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultDetail <p>识别结果详情，包含每个句子中的词时间偏移，一般用于生成字幕的场景。(录音识别请求中ResTextFormat=1时该字段不为空)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SentenceDetail [] getResultDetail() {
        return this.ResultDetail;
    }

    /**
     * Set <p>识别结果详情，包含每个句子中的词时间偏移，一般用于生成字幕的场景。(录音识别请求中ResTextFormat=1时该字段不为空)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultDetail <p>识别结果详情，包含每个句子中的词时间偏移，一般用于生成字幕的场景。(录音识别请求中ResTextFormat=1时该字段不为空)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultDetail(SentenceDetail [] ResultDetail) {
        this.ResultDetail = ResultDetail;
    }

    /**
     * Get <p>音频时长(秒)。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioDuration <p>音频时长(秒)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAudioDuration() {
        return this.AudioDuration;
    }

    /**
     * Set <p>音频时长(秒)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioDuration <p>音频时长(秒)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioDuration(Float AudioDuration) {
        this.AudioDuration = AudioDuration;
    }

    /**
     * Get <p>大模型后处理结果</p> 
     * @return LlmResults <p>大模型后处理结果</p>
     */
    public LlmResult [] getLlmResults() {
        return this.LlmResults;
    }

    /**
     * Set <p>大模型后处理结果</p>
     * @param LlmResults <p>大模型后处理结果</p>
     */
    public void setLlmResults(LlmResult [] LlmResults) {
        this.LlmResults = LlmResults;
    }

    /**
     * Get <p>说话人上下文 ID</p> 
     * @return SpeakerContextId <p>说话人上下文 ID</p>
     */
    public String getSpeakerContextId() {
        return this.SpeakerContextId;
    }

    /**
     * Set <p>说话人上下文 ID</p>
     * @param SpeakerContextId <p>说话人上下文 ID</p>
     */
    public void setSpeakerContextId(String SpeakerContextId) {
        this.SpeakerContextId = SpeakerContextId;
    }

    public TaskStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatus(TaskStatus source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusStr != null) {
            this.StatusStr = new String(source.StatusStr);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.ResultDetail != null) {
            this.ResultDetail = new SentenceDetail[source.ResultDetail.length];
            for (int i = 0; i < source.ResultDetail.length; i++) {
                this.ResultDetail[i] = new SentenceDetail(source.ResultDetail[i]);
            }
        }
        if (source.AudioDuration != null) {
            this.AudioDuration = new Float(source.AudioDuration);
        }
        if (source.LlmResults != null) {
            this.LlmResults = new LlmResult[source.LlmResults.length];
            for (int i = 0; i < source.LlmResults.length; i++) {
                this.LlmResults[i] = new LlmResult(source.LlmResults[i]);
            }
        }
        if (source.SpeakerContextId != null) {
            this.SpeakerContextId = new String(source.SpeakerContextId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusStr", this.StatusStr);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamArrayObj(map, prefix + "ResultDetail.", this.ResultDetail);
        this.setParamSimple(map, prefix + "AudioDuration", this.AudioDuration);
        this.setParamArrayObj(map, prefix + "LlmResults.", this.LlmResults);
        this.setParamSimple(map, prefix + "SpeakerContextId", this.SpeakerContextId);

    }
}

