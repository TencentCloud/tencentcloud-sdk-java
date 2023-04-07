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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAiAnalysisHighlightItem extends AbstractModel{

    /**
    * 智能精彩集锦地址。
    */
    @SerializedName("HighlightPath")
    @Expose
    private String HighlightPath;

    /**
    * 智能精彩集锦封面地址。
    */
    @SerializedName("CovImgPath")
    @Expose
    private String CovImgPath;

    /**
    * 智能精彩集锦的可信度，取值范围是 0 到 100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 智能精彩集锦持续时间。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 智能精彩集锦子片段列表。
    */
    @SerializedName("SegmentSet")
    @Expose
    private HighlightSegmentItem [] SegmentSet;

    /**
     * Get 智能精彩集锦地址。 
     * @return HighlightPath 智能精彩集锦地址。
     */
    public String getHighlightPath() {
        return this.HighlightPath;
    }

    /**
     * Set 智能精彩集锦地址。
     * @param HighlightPath 智能精彩集锦地址。
     */
    public void setHighlightPath(String HighlightPath) {
        this.HighlightPath = HighlightPath;
    }

    /**
     * Get 智能精彩集锦封面地址。 
     * @return CovImgPath 智能精彩集锦封面地址。
     */
    public String getCovImgPath() {
        return this.CovImgPath;
    }

    /**
     * Set 智能精彩集锦封面地址。
     * @param CovImgPath 智能精彩集锦封面地址。
     */
    public void setCovImgPath(String CovImgPath) {
        this.CovImgPath = CovImgPath;
    }

    /**
     * Get 智能精彩集锦的可信度，取值范围是 0 到 100。 
     * @return Confidence 智能精彩集锦的可信度，取值范围是 0 到 100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 智能精彩集锦的可信度，取值范围是 0 到 100。
     * @param Confidence 智能精彩集锦的可信度，取值范围是 0 到 100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 智能精彩集锦持续时间。 
     * @return Duration 智能精彩集锦持续时间。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 智能精彩集锦持续时间。
     * @param Duration 智能精彩集锦持续时间。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 智能精彩集锦子片段列表。 
     * @return SegmentSet 智能精彩集锦子片段列表。
     */
    public HighlightSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 智能精彩集锦子片段列表。
     * @param SegmentSet 智能精彩集锦子片段列表。
     */
    public void setSegmentSet(HighlightSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    public MediaAiAnalysisHighlightItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAiAnalysisHighlightItem(MediaAiAnalysisHighlightItem source) {
        if (source.HighlightPath != null) {
            this.HighlightPath = new String(source.HighlightPath);
        }
        if (source.CovImgPath != null) {
            this.CovImgPath = new String(source.CovImgPath);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new HighlightSegmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new HighlightSegmentItem(source.SegmentSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighlightPath", this.HighlightPath);
        this.setParamSimple(map, prefix + "CovImgPath", this.CovImgPath);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

