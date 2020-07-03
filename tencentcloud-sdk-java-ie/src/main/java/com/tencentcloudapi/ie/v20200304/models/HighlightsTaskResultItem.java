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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HighlightsTaskResultItem extends AbstractModel{

    /**
    * 智能集锦地址。
    */
    @SerializedName("HighlightUrl")
    @Expose
    private String HighlightUrl;

    /**
    * 智能集锦封面地址。
    */
    @SerializedName("CovImgUrl")
    @Expose
    private String CovImgUrl;

    /**
    * 置信度，取值范围是 0 到 100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 智能集锦持续时间，单位：秒。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 智能集锦子片段结果集，集锦片段由这些子片段拼接生成。
    */
    @SerializedName("SegmentSet")
    @Expose
    private HighlightsTaskResultItemSegment [] SegmentSet;

    /**
     * Get 智能集锦地址。 
     * @return HighlightUrl 智能集锦地址。
     */
    public String getHighlightUrl() {
        return this.HighlightUrl;
    }

    /**
     * Set 智能集锦地址。
     * @param HighlightUrl 智能集锦地址。
     */
    public void setHighlightUrl(String HighlightUrl) {
        this.HighlightUrl = HighlightUrl;
    }

    /**
     * Get 智能集锦封面地址。 
     * @return CovImgUrl 智能集锦封面地址。
     */
    public String getCovImgUrl() {
        return this.CovImgUrl;
    }

    /**
     * Set 智能集锦封面地址。
     * @param CovImgUrl 智能集锦封面地址。
     */
    public void setCovImgUrl(String CovImgUrl) {
        this.CovImgUrl = CovImgUrl;
    }

    /**
     * Get 置信度，取值范围是 0 到 100。 
     * @return Confidence 置信度，取值范围是 0 到 100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度，取值范围是 0 到 100。
     * @param Confidence 置信度，取值范围是 0 到 100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 智能集锦持续时间，单位：秒。 
     * @return Duration 智能集锦持续时间，单位：秒。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 智能集锦持续时间，单位：秒。
     * @param Duration 智能集锦持续时间，单位：秒。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 智能集锦子片段结果集，集锦片段由这些子片段拼接生成。 
     * @return SegmentSet 智能集锦子片段结果集，集锦片段由这些子片段拼接生成。
     */
    public HighlightsTaskResultItemSegment [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set 智能集锦子片段结果集，集锦片段由这些子片段拼接生成。
     * @param SegmentSet 智能集锦子片段结果集，集锦片段由这些子片段拼接生成。
     */
    public void setSegmentSet(HighlightsTaskResultItemSegment [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighlightUrl", this.HighlightUrl);
        this.setParamSimple(map, prefix + "CovImgUrl", this.CovImgUrl);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

