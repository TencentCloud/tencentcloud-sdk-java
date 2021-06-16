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
package com.tencentcloudapi.tts.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTtsTaskStatusRespData extends AbstractModel{

    /**
    * 任务标识。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

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
    * 合成音频COS地址（链接有效期1天）。
    */
    @SerializedName("ResultUrl")
    @Expose
    private String ResultUrl;

    /**
    * 失败原因说明。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * Get 任务标识。 
     * @return TaskId 任务标识。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务标识。
     * @param TaskId 任务标识。
     */
    public void setTaskId(String TaskId) {
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
     * Get 合成音频COS地址（链接有效期1天）。 
     * @return ResultUrl 合成音频COS地址（链接有效期1天）。
     */
    public String getResultUrl() {
        return this.ResultUrl;
    }

    /**
     * Set 合成音频COS地址（链接有效期1天）。
     * @param ResultUrl 合成音频COS地址（链接有效期1天）。
     */
    public void setResultUrl(String ResultUrl) {
        this.ResultUrl = ResultUrl;
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

    public DescribeTtsTaskStatusRespData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTtsTaskStatusRespData(DescribeTtsTaskStatusRespData source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusStr != null) {
            this.StatusStr = new String(source.StatusStr);
        }
        if (source.ResultUrl != null) {
            this.ResultUrl = new String(source.ResultUrl);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusStr", this.StatusStr);
        this.setParamSimple(map, prefix + "ResultUrl", this.ResultUrl);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

