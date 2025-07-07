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
    * 任务标识。注意：TaskId数据类型为uint64。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。
    */
    @SerializedName("StatusStr")
    @Expose
    private String StatusStr;

    /**
    * 识别结果。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 失败原因说明。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 识别结果详情，包含每个句子中的词时间偏移，一般用于生成字幕的场景。(录音识别请求中ResTextFormat=1时该字段不为空)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultDetail")
    @Expose
    private SentenceDetail [] ResultDetail;

    /**
    * 音频时长(秒)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioDuration")
    @Expose
    private Float AudioDuration;

    /**
     * Get 任务标识。注意：TaskId数据类型为uint64。 
     * @return TaskId 任务标识。注意：TaskId数据类型为uint64。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务标识。注意：TaskId数据类型为uint64。
     * @param TaskId 任务标识。注意：TaskId数据类型为uint64。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。 
     * @return Status 任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。
     * @param Status 任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。 
     * @return StatusStr 任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。
     */
    public String getStatusStr() {
        return this.StatusStr;
    }

    /**
     * Set 任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。
     * @param StatusStr 任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。
     */
    public void setStatusStr(String StatusStr) {
        this.StatusStr = StatusStr;
    }

    /**
     * Get 识别结果。 
     * @return Result 识别结果。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 识别结果。
     * @param Result 识别结果。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 失败原因说明。 
     * @return ErrorMsg 失败原因说明。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 失败原因说明。
     * @param ErrorMsg 失败原因说明。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 识别结果详情，包含每个句子中的词时间偏移，一般用于生成字幕的场景。(录音识别请求中ResTextFormat=1时该字段不为空)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultDetail 识别结果详情，包含每个句子中的词时间偏移，一般用于生成字幕的场景。(录音识别请求中ResTextFormat=1时该字段不为空)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SentenceDetail [] getResultDetail() {
        return this.ResultDetail;
    }

    /**
     * Set 识别结果详情，包含每个句子中的词时间偏移，一般用于生成字幕的场景。(录音识别请求中ResTextFormat=1时该字段不为空)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultDetail 识别结果详情，包含每个句子中的词时间偏移，一般用于生成字幕的场景。(录音识别请求中ResTextFormat=1时该字段不为空)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultDetail(SentenceDetail [] ResultDetail) {
        this.ResultDetail = ResultDetail;
    }

    /**
     * Get 音频时长(秒)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioDuration 音频时长(秒)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAudioDuration() {
        return this.AudioDuration;
    }

    /**
     * Set 音频时长(秒)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioDuration 音频时长(秒)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioDuration(Float AudioDuration) {
        this.AudioDuration = AudioDuration;
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

    }
}

