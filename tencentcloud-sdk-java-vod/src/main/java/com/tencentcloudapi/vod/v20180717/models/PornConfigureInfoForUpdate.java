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

public class PornConfigureInfoForUpdate extends AbstractModel{

    /**
    * 画面鉴黄控制参数。
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private PornImgReviewTemplateInfoForUpdate ImgReviewInfo;

    /**
    * 语音鉴黄控制参数。
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private PornAsrReviewTemplateInfoForUpdate AsrReviewInfo;

    /**
    * 文本鉴黄控制参数。
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private PornOcrReviewTemplateInfoForUpdate OcrReviewInfo;

    /**
     * Get 画面鉴黄控制参数。 
     * @return ImgReviewInfo 画面鉴黄控制参数。
     */
    public PornImgReviewTemplateInfoForUpdate getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set 画面鉴黄控制参数。
     * @param ImgReviewInfo 画面鉴黄控制参数。
     */
    public void setImgReviewInfo(PornImgReviewTemplateInfoForUpdate ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get 语音鉴黄控制参数。 
     * @return AsrReviewInfo 语音鉴黄控制参数。
     */
    public PornAsrReviewTemplateInfoForUpdate getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * Set 语音鉴黄控制参数。
     * @param AsrReviewInfo 语音鉴黄控制参数。
     */
    public void setAsrReviewInfo(PornAsrReviewTemplateInfoForUpdate AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * Get 文本鉴黄控制参数。 
     * @return OcrReviewInfo 文本鉴黄控制参数。
     */
    public PornOcrReviewTemplateInfoForUpdate getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set 文本鉴黄控制参数。
     * @param OcrReviewInfo 文本鉴黄控制参数。
     */
    public void setOcrReviewInfo(PornOcrReviewTemplateInfoForUpdate OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
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

