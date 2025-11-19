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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamAiAnalysisResultItem extends AbstractModel {

    /**
    * 结果的类型，取值范围：
<li>SegmentRecognition：拆条。</li>
<li>Highlight ：集锦。</li>
<li> Description：摘要。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 拆条结果，当 Type 为
SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentResultSet")
    @Expose
    private SegmentRecognitionItem [] SegmentResultSet;

    /**
    * 集锦结果，当Type 为 Highlight 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighlightResultSet")
    @Expose
    private MediaAiAnalysisHighlightItem [] HighlightResultSet;

    /**
    * 摘要结果，当Type 为 Description 时有效。
    */
    @SerializedName("DescriptionResult")
    @Expose
    private LiveAiAnalysisDescriptionItem DescriptionResult;

    /**
     * Get 结果的类型，取值范围：
<li>SegmentRecognition：拆条。</li>
<li>Highlight ：集锦。</li>
<li> Description：摘要。</li> 
     * @return Type 结果的类型，取值范围：
<li>SegmentRecognition：拆条。</li>
<li>Highlight ：集锦。</li>
<li> Description：摘要。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 结果的类型，取值范围：
<li>SegmentRecognition：拆条。</li>
<li>Highlight ：集锦。</li>
<li> Description：摘要。</li>
     * @param Type 结果的类型，取值范围：
<li>SegmentRecognition：拆条。</li>
<li>Highlight ：集锦。</li>
<li> Description：摘要。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 拆条结果，当 Type 为
SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentResultSet 拆条结果，当 Type 为
SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SegmentRecognitionItem [] getSegmentResultSet() {
        return this.SegmentResultSet;
    }

    /**
     * Set 拆条结果，当 Type 为
SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentResultSet 拆条结果，当 Type 为
SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentResultSet(SegmentRecognitionItem [] SegmentResultSet) {
        this.SegmentResultSet = SegmentResultSet;
    }

    /**
     * Get 集锦结果，当Type 为 Highlight 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighlightResultSet 集锦结果，当Type 为 Highlight 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaAiAnalysisHighlightItem [] getHighlightResultSet() {
        return this.HighlightResultSet;
    }

    /**
     * Set 集锦结果，当Type 为 Highlight 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighlightResultSet 集锦结果，当Type 为 Highlight 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighlightResultSet(MediaAiAnalysisHighlightItem [] HighlightResultSet) {
        this.HighlightResultSet = HighlightResultSet;
    }

    /**
     * Get 摘要结果，当Type 为 Description 时有效。 
     * @return DescriptionResult 摘要结果，当Type 为 Description 时有效。
     */
    public LiveAiAnalysisDescriptionItem getDescriptionResult() {
        return this.DescriptionResult;
    }

    /**
     * Set 摘要结果，当Type 为 Description 时有效。
     * @param DescriptionResult 摘要结果，当Type 为 Description 时有效。
     */
    public void setDescriptionResult(LiveAiAnalysisDescriptionItem DescriptionResult) {
        this.DescriptionResult = DescriptionResult;
    }

    public LiveStreamAiAnalysisResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamAiAnalysisResultItem(LiveStreamAiAnalysisResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SegmentResultSet != null) {
            this.SegmentResultSet = new SegmentRecognitionItem[source.SegmentResultSet.length];
            for (int i = 0; i < source.SegmentResultSet.length; i++) {
                this.SegmentResultSet[i] = new SegmentRecognitionItem(source.SegmentResultSet[i]);
            }
        }
        if (source.HighlightResultSet != null) {
            this.HighlightResultSet = new MediaAiAnalysisHighlightItem[source.HighlightResultSet.length];
            for (int i = 0; i < source.HighlightResultSet.length; i++) {
                this.HighlightResultSet[i] = new MediaAiAnalysisHighlightItem(source.HighlightResultSet[i]);
            }
        }
        if (source.DescriptionResult != null) {
            this.DescriptionResult = new LiveAiAnalysisDescriptionItem(source.DescriptionResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SegmentResultSet.", this.SegmentResultSet);
        this.setParamArrayObj(map, prefix + "HighlightResultSet.", this.HighlightResultSet);
        this.setParamObj(map, prefix + "DescriptionResult.", this.DescriptionResult);

    }
}

