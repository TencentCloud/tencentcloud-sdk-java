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

public class DubbingEmbedSubtitleConfig extends AbstractModel {

    /**
    * <p>压制字幕id。</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

    /**
    * <p>沿用原字幕位置。</p><p>默认值：1</p>
    */
    @SerializedName("UseOriginalPos")
    @Expose
    private Long UseOriginalPos;

    /**
    * <p>沿用原字幕字号。</p><p>默认值：1</p>
    */
    @SerializedName("UseOriginalSize")
    @Expose
    private Long UseOriginalSize;

    /**
     * Get <p>压制字幕id。</p> 
     * @return SubtitleEmbedId <p>压制字幕id。</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>压制字幕id。</p>
     * @param SubtitleEmbedId <p>压制字幕id。</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    /**
     * Get <p>沿用原字幕位置。</p><p>默认值：1</p> 
     * @return UseOriginalPos <p>沿用原字幕位置。</p><p>默认值：1</p>
     */
    public Long getUseOriginalPos() {
        return this.UseOriginalPos;
    }

    /**
     * Set <p>沿用原字幕位置。</p><p>默认值：1</p>
     * @param UseOriginalPos <p>沿用原字幕位置。</p><p>默认值：1</p>
     */
    public void setUseOriginalPos(Long UseOriginalPos) {
        this.UseOriginalPos = UseOriginalPos;
    }

    /**
     * Get <p>沿用原字幕字号。</p><p>默认值：1</p> 
     * @return UseOriginalSize <p>沿用原字幕字号。</p><p>默认值：1</p>
     */
    public Long getUseOriginalSize() {
        return this.UseOriginalSize;
    }

    /**
     * Set <p>沿用原字幕字号。</p><p>默认值：1</p>
     * @param UseOriginalSize <p>沿用原字幕字号。</p><p>默认值：1</p>
     */
    public void setUseOriginalSize(Long UseOriginalSize) {
        this.UseOriginalSize = UseOriginalSize;
    }

    public DubbingEmbedSubtitleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DubbingEmbedSubtitleConfig(DubbingEmbedSubtitleConfig source) {
        if (source.SubtitleEmbedId != null) {
            this.SubtitleEmbedId = new Long(source.SubtitleEmbedId);
        }
        if (source.UseOriginalPos != null) {
            this.UseOriginalPos = new Long(source.UseOriginalPos);
        }
        if (source.UseOriginalSize != null) {
            this.UseOriginalSize = new Long(source.UseOriginalSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);
        this.setParamSimple(map, prefix + "UseOriginalPos", this.UseOriginalPos);
        this.setParamSimple(map, prefix + "UseOriginalSize", this.UseOriginalSize);

    }
}

