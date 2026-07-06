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
    * <p>内部定义的事件类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>事件类型的说明文字</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>事件发生的 Unix 时间戳（秒）</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>事件发生时的运行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningOrderId")
    @Expose
    private Long RunningOrderId;

    /**
    * <p>事件的一些可选说明</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>异常事件的排查手册链接</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SolutionLink")
    @Expose
    private String SolutionLink;

    /**
    * <p>异常事件原因分析</p>
    */
    @SerializedName("CauseAnalysis")
    @Expose
    private String CauseAnalysis;

    /**
    * <p>异常事件处理的参考方案</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
     * Get <p>内部定义的事件类型</p> 
     * @return Type <p>内部定义的事件类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>内部定义的事件类型</p>
     * @param Type <p>内部定义的事件类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>事件类型的说明文字</p> 
     * @return Description <p>事件类型的说明文字</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>事件类型的说明文字</p>
     * @param Description <p>事件类型的说明文字</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>事件发生的 Unix 时间戳（秒）</p> 
     * @return Timestamp <p>事件发生的 Unix 时间戳（秒）</p>
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>事件发生的 Unix 时间戳（秒）</p>
     * @param Timestamp <p>事件发生的 Unix 时间戳（秒）</p>
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>事件发生时的运行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningOrderId <p>事件发生时的运行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunningOrderId() {
        return this.RunningOrderId;
    }

    /**
     * Set <p>事件发生时的运行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningOrderId <p>事件发生时的运行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningOrderId(Long RunningOrderId) {
        this.RunningOrderId = RunningOrderId;
    }

    /**
     * Get <p>事件的一些可选说明</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message <p>事件的一些可选说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>事件的一些可选说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message <p>事件的一些可选说明</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>异常事件的排查手册链接</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SolutionLink <p>异常事件的排查手册链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSolutionLink() {
        return this.SolutionLink;
    }

    /**
     * Set <p>异常事件的排查手册链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SolutionLink <p>异常事件的排查手册链接</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSolutionLink(String SolutionLink) {
        this.SolutionLink = SolutionLink;
    }

    /**
     * Get <p>异常事件原因分析</p> 
     * @return CauseAnalysis <p>异常事件原因分析</p>
     */
    public String getCauseAnalysis() {
        return this.CauseAnalysis;
    }

    /**
     * Set <p>异常事件原因分析</p>
     * @param CauseAnalysis <p>异常事件原因分析</p>
     */
    public void setCauseAnalysis(String CauseAnalysis) {
        this.CauseAnalysis = CauseAnalysis;
    }

    /**
     * Get <p>异常事件处理的参考方案</p> 
     * @return Solution <p>异常事件处理的参考方案</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>异常事件处理的参考方案</p>
     * @param Solution <p>异常事件处理的参考方案</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
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
        if (source.CauseAnalysis != null) {
            this.CauseAnalysis = new String(source.CauseAnalysis);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
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
        this.setParamSimple(map, prefix + "CauseAnalysis", this.CauseAnalysis);
        this.setParamSimple(map, prefix + "Solution", this.Solution);

    }
}

