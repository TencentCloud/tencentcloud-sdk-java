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
package com.tencentcloudapi.vrs.v20200824.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVRSTaskStatusRespData extends AbstractModel {

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusStr")
    @Expose
    private String StatusStr;

    /**
    * 音色id。（若为一句话复刻时，该值为固定值“200000000”）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * 失败原因说明。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 任务过期时间。（当复刻类型为一句话复刻时展示）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 快速复刻音色ID。（当复刻类型为一句话复刻时展示）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FastVoiceType")
    @Expose
    private String FastVoiceType;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态码，0：任务等待，1：任务执行中，2：任务成功，3：任务失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusStr 任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusStr() {
        return this.StatusStr;
    }

    /**
     * Set 任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusStr 任务状态，waiting：任务等待，doing：任务执行中，success：任务成功，failed：任务失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusStr(String StatusStr) {
        this.StatusStr = StatusStr;
    }

    /**
     * Get 音色id。（若为一句话复刻时，该值为固定值“200000000”）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceType 音色id。（若为一句话复刻时，该值为固定值“200000000”）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 音色id。（若为一句话复刻时，该值为固定值“200000000”）
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceType 音色id。（若为一句话复刻时，该值为固定值“200000000”）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get 失败原因说明。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 失败原因说明。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 失败原因说明。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 失败原因说明。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 任务过期时间。（当复刻类型为一句话复刻时展示）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 任务过期时间。（当复刻类型为一句话复刻时展示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 任务过期时间。（当复刻类型为一句话复刻时展示）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 任务过期时间。（当复刻类型为一句话复刻时展示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 快速复刻音色ID。（当复刻类型为一句话复刻时展示）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FastVoiceType 快速复刻音色ID。（当复刻类型为一句话复刻时展示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFastVoiceType() {
        return this.FastVoiceType;
    }

    /**
     * Set 快速复刻音色ID。（当复刻类型为一句话复刻时展示）
注意：此字段可能返回 null，表示取不到有效值。
     * @param FastVoiceType 快速复刻音色ID。（当复刻类型为一句话复刻时展示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFastVoiceType(String FastVoiceType) {
        this.FastVoiceType = FastVoiceType;
    }

    public DescribeVRSTaskStatusRespData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVRSTaskStatusRespData(DescribeVRSTaskStatusRespData source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusStr != null) {
            this.StatusStr = new String(source.StatusStr);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new Long(source.VoiceType);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.FastVoiceType != null) {
            this.FastVoiceType = new String(source.FastVoiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusStr", this.StatusStr);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "FastVoiceType", this.FastVoiceType);

    }
}

