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

public class DubbingTranslateConfig extends AbstractModel {

    /**
    * <p>源语言。</p>
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * <p>翻译目标语言。</p>
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * <p>智能简化译文。</p><p>枚举值：</p><ul><li>ON： 开启智能简化译文。</li><li>OFF： 关闭智能简化译文。</li></ul><p>默认值：OFF</p>
    */
    @SerializedName("SimplifyTranslation")
    @Expose
    private String SimplifyTranslation;

    /**
     * Get <p>源语言。</p> 
     * @return VideoSrcLanguage <p>源语言。</p>
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set <p>源语言。</p>
     * @param VideoSrcLanguage <p>源语言。</p>
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get <p>翻译目标语言。</p> 
     * @return TranslateDstLanguage <p>翻译目标语言。</p>
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set <p>翻译目标语言。</p>
     * @param TranslateDstLanguage <p>翻译目标语言。</p>
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get <p>智能简化译文。</p><p>枚举值：</p><ul><li>ON： 开启智能简化译文。</li><li>OFF： 关闭智能简化译文。</li></ul><p>默认值：OFF</p> 
     * @return SimplifyTranslation <p>智能简化译文。</p><p>枚举值：</p><ul><li>ON： 开启智能简化译文。</li><li>OFF： 关闭智能简化译文。</li></ul><p>默认值：OFF</p>
     */
    public String getSimplifyTranslation() {
        return this.SimplifyTranslation;
    }

    /**
     * Set <p>智能简化译文。</p><p>枚举值：</p><ul><li>ON： 开启智能简化译文。</li><li>OFF： 关闭智能简化译文。</li></ul><p>默认值：OFF</p>
     * @param SimplifyTranslation <p>智能简化译文。</p><p>枚举值：</p><ul><li>ON： 开启智能简化译文。</li><li>OFF： 关闭智能简化译文。</li></ul><p>默认值：OFF</p>
     */
    public void setSimplifyTranslation(String SimplifyTranslation) {
        this.SimplifyTranslation = SimplifyTranslation;
    }

    public DubbingTranslateConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DubbingTranslateConfig(DubbingTranslateConfig source) {
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
        }
        if (source.SimplifyTranslation != null) {
            this.SimplifyTranslation = new String(source.SimplifyTranslation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamSimple(map, prefix + "SimplifyTranslation", this.SimplifyTranslation);

    }
}

