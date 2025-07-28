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

public class MediaAiAnalysisTagItem extends AbstractModel {

    /**
    * 标签名称。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 标签的可信度，取值范围是 0 到 100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 根据不同类型决定
    */
    @SerializedName("SpecialInfo")
    @Expose
    private String SpecialInfo;

    /**
     * Get 标签名称。 
     * @return Tag 标签名称。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 标签名称。
     * @param Tag 标签名称。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 标签的可信度，取值范围是 0 到 100。 
     * @return Confidence 标签的可信度，取值范围是 0 到 100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 标签的可信度，取值范围是 0 到 100。
     * @param Confidence 标签的可信度，取值范围是 0 到 100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 根据不同类型决定 
     * @return SpecialInfo 根据不同类型决定
     */
    public String getSpecialInfo() {
        return this.SpecialInfo;
    }

    /**
     * Set 根据不同类型决定
     * @param SpecialInfo 根据不同类型决定
     */
    public void setSpecialInfo(String SpecialInfo) {
        this.SpecialInfo = SpecialInfo;
    }

    public MediaAiAnalysisTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAiAnalysisTagItem(MediaAiAnalysisTagItem source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.SpecialInfo != null) {
            this.SpecialInfo = new String(source.SpecialInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "SpecialInfo", this.SpecialInfo);

    }
}

