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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAiAnalysisHighlightItem  extends AbstractModel{

    /**
    * 智能精彩片段地址。
    */
    @SerializedName("HighlightUrl")
    @Expose
    private String HighlightUrl;

    /**
    * 智能精彩片段封面地址。
    */
    @SerializedName("CovImgUrl")
    @Expose
    private String CovImgUrl;

    /**
    * 智能精彩片段的可信度，取值范围是 0 到 100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 智能精彩片段持续时间。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
     * 获取智能精彩片段地址。
     * @return HighlightUrl 智能精彩片段地址。
     */
    public String getHighlightUrl() {
        return this.HighlightUrl;
    }

    /**
     * 设置智能精彩片段地址。
     * @param HighlightUrl 智能精彩片段地址。
     */
    public void setHighlightUrl(String HighlightUrl) {
        this.HighlightUrl = HighlightUrl;
    }

    /**
     * 获取智能精彩片段封面地址。
     * @return CovImgUrl 智能精彩片段封面地址。
     */
    public String getCovImgUrl() {
        return this.CovImgUrl;
    }

    /**
     * 设置智能精彩片段封面地址。
     * @param CovImgUrl 智能精彩片段封面地址。
     */
    public void setCovImgUrl(String CovImgUrl) {
        this.CovImgUrl = CovImgUrl;
    }

    /**
     * 获取智能精彩片段的可信度，取值范围是 0 到 100。
     * @return Confidence 智能精彩片段的可信度，取值范围是 0 到 100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置智能精彩片段的可信度，取值范围是 0 到 100。
     * @param Confidence 智能精彩片段的可信度，取值范围是 0 到 100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取智能精彩片段持续时间。
     * @return Duration 智能精彩片段持续时间。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * 设置智能精彩片段持续时间。
     * @param Duration 智能精彩片段持续时间。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HighlightUrl", this.HighlightUrl);
        this.setParamSimple(map, prefix + "CovImgUrl", this.CovImgUrl);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

