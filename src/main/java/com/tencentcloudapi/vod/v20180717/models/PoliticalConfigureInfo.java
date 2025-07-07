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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PoliticalConfigureInfo extends AbstractModel {

    /**
    * 画面鉴别涉及令人不适宜的信息的控制参数。
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private PoliticalImgReviewTemplateInfo ImgReviewInfo;

    /**
    * 语音鉴别涉及令人不适宜的信息的控制参数。
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private PoliticalAsrReviewTemplateInfo AsrReviewInfo;

    /**
    * 文本鉴别涉及令人不适宜的信息的控制参数。
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private PoliticalOcrReviewTemplateInfo OcrReviewInfo;

    /**
     * Get 画面鉴别涉及令人不适宜的信息的控制参数。 
     * @return ImgReviewInfo 画面鉴别涉及令人不适宜的信息的控制参数。
     */
    public PoliticalImgReviewTemplateInfo getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set 画面鉴别涉及令人不适宜的信息的控制参数。
     * @param ImgReviewInfo 画面鉴别涉及令人不适宜的信息的控制参数。
     */
    public void setImgReviewInfo(PoliticalImgReviewTemplateInfo ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get 语音鉴别涉及令人不适宜的信息的控制参数。 
     * @return AsrReviewInfo 语音鉴别涉及令人不适宜的信息的控制参数。
     */
    public PoliticalAsrReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set 语音鉴别涉及令人不适宜的信息的控制参数。
     * @param AsrReviewInfo 语音鉴别涉及令人不适宜的信息的控制参数。
     */
    public void setAsrReviewInfo(PoliticalAsrReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get 文本鉴别涉及令人不适宜的信息的控制参数。 
     * @return OcrReviewInfo 文本鉴别涉及令人不适宜的信息的控制参数。
     */
    public PoliticalOcrReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set 文本鉴别涉及令人不适宜的信息的控制参数。
     * @param OcrReviewInfo 文本鉴别涉及令人不适宜的信息的控制参数。
     */
    public void setOcrReviewInfo(PoliticalOcrReviewTemplateInfo OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    public PoliticalConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PoliticalConfigureInfo(PoliticalConfigureInfo source) {
        if (source.ImgReviewInfo != null) {
            this.ImgReviewInfo = new PoliticalImgReviewTemplateInfo(source.ImgReviewInfo);
        }
        if (source.AsrReviewInfo != null) {
            this.AsrReviewInfo = new PoliticalAsrReviewTemplateInfo(source.AsrReviewInfo);
        }
        if (source.OcrReviewInfo != null) {
            this.OcrReviewInfo = new PoliticalOcrReviewTemplateInfo(source.OcrReviewInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImgReviewInfo.", this.ImgReviewInfo);
        this.setParamObj(map, prefix + "AsrReviewInfo.", this.AsrReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

