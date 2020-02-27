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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatus extends AbstractModel{

    /**
    * 任务标识。
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
     * Get 任务标识。 
     * @return TaskId 任务标识。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务标识。
     * @param TaskId 任务标识。
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusStr", this.StatusStr);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamArrayObj(map, prefix + "ResultDetail.", this.ResultDetail);

    }
}

