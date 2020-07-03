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

public class VodOcrTextSegmentItem extends AbstractModel{

    /**
    * 嫌疑片段起始的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 嫌疑片段结束的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 嫌疑片段置信度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 嫌疑片段审核结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 嫌疑关键词列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeywordSet")
    @Expose
    private String [] KeywordSet;

    /**
    * 嫌疑文字出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
     * Get 嫌疑片段起始的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTimeOffset 嫌疑片段起始的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 嫌疑片段起始的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTimeOffset 嫌疑片段起始的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 嫌疑片段结束的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTimeOffset 嫌疑片段结束的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 嫌疑片段结束的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTimeOffset 嫌疑片段结束的偏移时间，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 嫌疑片段置信度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Confidence 嫌疑片段置信度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 嫌疑片段置信度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Confidence 嫌疑片段置信度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 嫌疑片段审核结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suggestion 嫌疑片段审核结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 嫌疑片段审核结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 嫌疑片段审核结果建议，取值范围：
pass。
review。
block。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 嫌疑关键词列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeywordSet 嫌疑关键词列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set 嫌疑关键词列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeywordSet 嫌疑关键词列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeywordSet(String [] KeywordSet) {
        this.KeywordSet = KeywordSet;
    }

    /**
     * Get 嫌疑文字出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaCoordSet 嫌疑文字出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set 嫌疑文字出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaCoordSet 嫌疑文字出现的区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "KeywordSet.", this.KeywordSet);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);

    }
}

