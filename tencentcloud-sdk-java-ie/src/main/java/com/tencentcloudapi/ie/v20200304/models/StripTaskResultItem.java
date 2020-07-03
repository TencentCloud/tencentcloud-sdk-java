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

public class StripTaskResultItem extends AbstractModel{

    /**
    * 视频拆条片段地址。
    */
    @SerializedName("SegmentUrl")
    @Expose
    private String SegmentUrl;

    /**
    * 拆条封面图片地址。
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
    * 拆条片段起始的偏移时间，单位：秒。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 拆条片段终止的偏移时间，单位：秒。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get 视频拆条片段地址。 
     * @return SegmentUrl 视频拆条片段地址。
     */
    public String getSegmentUrl() {
        return this.SegmentUrl;
    }

    /**
     * Set 视频拆条片段地址。
     * @param SegmentUrl 视频拆条片段地址。
     */
    public void setSegmentUrl(String SegmentUrl) {
        this.SegmentUrl = SegmentUrl;
    }

    /**
     * Get 拆条封面图片地址。 
     * @return CovImgUrl 拆条封面图片地址。
     */
    public String getCovImgUrl() {
        return this.CovImgUrl;
    }

    /**
     * Set 拆条封面图片地址。
     * @param CovImgUrl 拆条封面图片地址。
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
     * Get 拆条片段起始的偏移时间，单位：秒。 
     * @return StartTimeOffset 拆条片段起始的偏移时间，单位：秒。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 拆条片段起始的偏移时间，单位：秒。
     * @param StartTimeOffset 拆条片段起始的偏移时间，单位：秒。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 拆条片段终止的偏移时间，单位：秒。 
     * @return EndTimeOffset 拆条片段终止的偏移时间，单位：秒。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 拆条片段终止的偏移时间，单位：秒。
     * @param EndTimeOffset 拆条片段终止的偏移时间，单位：秒。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SegmentUrl", this.SegmentUrl);
        this.setParamSimple(map, prefix + "CovImgUrl", this.CovImgUrl);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

