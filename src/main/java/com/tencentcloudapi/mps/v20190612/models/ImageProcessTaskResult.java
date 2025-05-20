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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageProcessTaskResult extends AbstractModel {

    /**
    * 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 转码任务的输出。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private ImageProcessTaskOutput Output;

    /**
    * 转码进度，取值范围 [0-100]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 转码任务的输出。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 转码任务的输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageProcessTaskOutput getOutput() {
        return this.Output;
    }

    /**
     * Set 转码任务的输出。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 转码任务的输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(ImageProcessTaskOutput Output) {
        this.Output = Output;
    }

    /**
     * Get 转码进度，取值范围 [0-100]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 转码进度，取值范围 [0-100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 转码进度，取值范围 [0-100]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 转码进度，取值范围 [0-100]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public ImageProcessTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageProcessTaskResult(ImageProcessTaskResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Output != null) {
            this.Output = new ImageProcessTaskOutput(source.Output);
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
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

