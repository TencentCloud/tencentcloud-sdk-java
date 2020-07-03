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
package com.tencentcloudapi.ticm.v20181127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VodPornReviewResult extends AbstractModel{

    /**
    * 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误码，0：成功，其他值：失败。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 视频鉴黄评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 鉴黄结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 视频鉴黄结果标签，取值范围：
porn：色情。
sexy：性感。
vulgar：低俗。
intimacy：亲密行为。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 有涉黄嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentSet")
    @Expose
    private VodPornReviewSegmentItem [] SegmentSet;

    /**
     * Get 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。 
     * @return Status 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
     * @param Status 任务状态，有 PROCESSING，SUCCESS 和 FAIL 三种。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误码，0：成功，其他值：失败。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 错误码，0：成功，其他值：失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 错误码，0：成功，其他值：失败。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 错误码，0：成功，其他值：失败。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 错误信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msg 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msg 错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 视频鉴黄评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Confidence 视频鉴黄评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 视频鉴黄评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Confidence 视频鉴黄评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 鉴黄结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suggestion 鉴黄结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 鉴黄结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 鉴黄结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 视频鉴黄结果标签，取值范围：
porn：色情。
sexy：性感。
vulgar：低俗。
intimacy：亲密行为。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Label 视频鉴黄结果标签，取值范围：
porn：色情。
sexy：性感。
vulgar：低俗。
intimacy：亲密行为。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 视频鉴黄结果标签，取值范围：
porn：色情。
sexy：性感。
vulgar：低俗。
intimacy：亲密行为。

注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 视频鉴黄结果标签，取值范围：
porn：色情。
sexy：性感。
vulgar：低俗。
intimacy：亲密行为。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 有涉黄嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentSet 有涉黄嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VodPornReviewSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 有涉黄嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentSet 有涉黄嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentSet(VodPornReviewSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

