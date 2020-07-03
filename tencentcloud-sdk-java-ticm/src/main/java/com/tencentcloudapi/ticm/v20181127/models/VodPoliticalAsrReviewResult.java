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

public class VodPoliticalAsrReviewResult extends AbstractModel{

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
    * 嫌疑片段审核结果建议，取值范围：
pass。
review。
block。

Asr 文字涉政、敏感评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Asr 文字涉政、敏感结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Asr 文字有涉政、敏感嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentSet")
    @Expose
    private VodAsrTextSegmentItem [] SegmentSet;

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
     * Get 嫌疑片段审核结果建议，取值范围：
pass。
review。
block。

Asr 文字涉政、敏感评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Confidence 嫌疑片段审核结果建议，取值范围：
pass。
review。
block。

Asr 文字涉政、敏感评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 嫌疑片段审核结果建议，取值范围：
pass。
review。
block。

Asr 文字涉政、敏感评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Confidence 嫌疑片段审核结果建议，取值范围：
pass。
review。
block。

Asr 文字涉政、敏感评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Asr 文字涉政、敏感结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suggestion Asr 文字涉政、敏感结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Asr 文字涉政、敏感结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion Asr 文字涉政、敏感结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Asr 文字有涉政、敏感嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentSet Asr 文字有涉政、敏感嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VodAsrTextSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set Asr 文字有涉政、敏感嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentSet Asr 文字有涉政、敏感嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentSet(VodAsrTextSegmentItem [] SegmentSet) {
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
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

