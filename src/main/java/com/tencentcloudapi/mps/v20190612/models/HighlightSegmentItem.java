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

public class HighlightSegmentItem extends AbstractModel {

    /**
    * 置信度。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 片段起始时间偏移。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 片段结束时间偏移。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 片段标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentTags")
    @Expose
    private String [] SegmentTags;

    /**
    * 直播切片对应直播起始时间点，采用 ISO 日期格式。	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 直播切片对应直播结束时间点，采用 ISO 日期格式。	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 置信度。 
     * @return Confidence 置信度。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度。
     * @param Confidence 置信度。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 片段起始时间偏移。 
     * @return StartTimeOffset 片段起始时间偏移。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 片段起始时间偏移。
     * @param StartTimeOffset 片段起始时间偏移。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 片段结束时间偏移。 
     * @return EndTimeOffset 片段结束时间偏移。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 片段结束时间偏移。
     * @param EndTimeOffset 片段结束时间偏移。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 片段标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentTags 片段标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSegmentTags() {
        return this.SegmentTags;
    }

    /**
     * Set 片段标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentTags 片段标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentTags(String [] SegmentTags) {
        this.SegmentTags = SegmentTags;
    }

    /**
     * Get 直播切片对应直播起始时间点，采用 ISO 日期格式。	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 直播切片对应直播起始时间点，采用 ISO 日期格式。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 直播切片对应直播起始时间点，采用 ISO 日期格式。	
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 直播切片对应直播起始时间点，采用 ISO 日期格式。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 直播切片对应直播结束时间点，采用 ISO 日期格式。	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 直播切片对应直播结束时间点，采用 ISO 日期格式。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 直播切片对应直播结束时间点，采用 ISO 日期格式。	
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 直播切片对应直播结束时间点，采用 ISO 日期格式。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public HighlightSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighlightSegmentItem(HighlightSegmentItem source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.SegmentTags != null) {
            this.SegmentTags = new String[source.SegmentTags.length];
            for (int i = 0; i < source.SegmentTags.length; i++) {
                this.SegmentTags[i] = new String(source.SegmentTags[i]);
            }
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamArraySimple(map, prefix + "SegmentTags.", this.SegmentTags);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

