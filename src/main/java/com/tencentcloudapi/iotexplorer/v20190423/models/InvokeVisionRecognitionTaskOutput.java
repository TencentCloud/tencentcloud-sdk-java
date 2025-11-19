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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeVisionRecognitionTaskOutput extends AbstractModel {

    /**
    * 任务是否已完成
    */
    @SerializedName("Completed")
    @Expose
    private Boolean Completed;

    /**
    * 任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 错误码
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 错误消息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 任务结果
    */
    @SerializedName("Result")
    @Expose
    private VisionRecognitionResult Result;

    /**
     * Get 任务是否已完成 
     * @return Completed 任务是否已完成
     */
    public Boolean getCompleted() {
        return this.Completed;
    }

    /**
     * Set 任务是否已完成
     * @param Completed 任务是否已完成
     */
    public void setCompleted(Boolean Completed) {
        this.Completed = Completed;
    }

    /**
     * Get 任务 ID 
     * @return TaskId 任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID
     * @param TaskId 任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 错误码 
     * @return ErrorCode 错误码
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 错误码
     * @param ErrorCode 错误码
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 错误消息 
     * @return ErrorMessage 错误消息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误消息
     * @param ErrorMessage 错误消息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 任务结果 
     * @return Result 任务结果
     */
    public VisionRecognitionResult getResult() {
        return this.Result;
    }

    /**
     * Set 任务结果
     * @param Result 任务结果
     */
    public void setResult(VisionRecognitionResult Result) {
        this.Result = Result;
    }

    public InvokeVisionRecognitionTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeVisionRecognitionTaskOutput(InvokeVisionRecognitionTaskOutput source) {
        if (source.Completed != null) {
            this.Completed = new Boolean(source.Completed);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.Result != null) {
            this.Result = new VisionRecognitionResult(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Completed", this.Completed);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamObj(map, prefix + "Result.", this.Result);

    }
}

