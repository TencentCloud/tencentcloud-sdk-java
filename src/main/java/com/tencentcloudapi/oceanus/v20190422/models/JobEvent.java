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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobEvent extends AbstractModel {

    /**
    * 内部定义的事件类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件类型的说明文字
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 事件发生的 Unix 时间戳（秒）
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 事件发生时的运行 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningOrderId")
    @Expose
    private Long RunningOrderId;

    /**
    * 事件的一些可选说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 异常事件的排查手册链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SolutionLink")
    @Expose
    private String SolutionLink;

    /**
     * Get 内部定义的事件类型 
     * @return Type 内部定义的事件类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 内部定义的事件类型
     * @param Type 内部定义的事件类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件类型的说明文字 
     * @return Description 事件类型的说明文字
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件类型的说明文字
     * @param Description 事件类型的说明文字
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 事件发生的 Unix 时间戳（秒） 
     * @return Timestamp 事件发生的 Unix 时间戳（秒）
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 事件发生的 Unix 时间戳（秒）
     * @param Timestamp 事件发生的 Unix 时间戳（秒）
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 事件发生时的运行 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningOrderId 事件发生时的运行 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunningOrderId() {
        return this.RunningOrderId;
    }

    /**
     * Set 事件发生时的运行 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningOrderId 事件发生时的运行 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningOrderId(Long RunningOrderId) {
        this.RunningOrderId = RunningOrderId;
    }

    /**
     * Get 事件的一些可选说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 事件的一些可选说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 事件的一些可选说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 事件的一些可选说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 异常事件的排查手册链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SolutionLink 异常事件的排查手册链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSolutionLink() {
        return this.SolutionLink;
    }

    /**
     * Set 异常事件的排查手册链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param SolutionLink 异常事件的排查手册链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSolutionLink(String SolutionLink) {
        this.SolutionLink = SolutionLink;
    }

    public JobEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobEvent(JobEvent source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.RunningOrderId != null) {
            this.RunningOrderId = new Long(source.RunningOrderId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.SolutionLink != null) {
            this.SolutionLink = new String(source.SolutionLink);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "RunningOrderId", this.RunningOrderId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "SolutionLink", this.SolutionLink);

    }
}

