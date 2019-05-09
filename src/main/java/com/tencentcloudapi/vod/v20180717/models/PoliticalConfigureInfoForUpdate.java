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

public class PoliticalConfigureInfoForUpdate  extends AbstractModel{

    /**
    * 画面鉴政控制参数。
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private PoliticalImgReviewTemplateInfoForUpdate ImgReviewInfo;

    /**
    * 语音鉴政控制参数。
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private PoliticalAsrReviewTemplateInfoForUpdate AsrReviewInfo;

    /**
    * 文本鉴政控制参数。
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private PoliticalOcrReviewTemplateInfoForUpdate OcrReviewInfo;

    /**
     * 获取画面鉴政控制参数。
     * @return ImgReviewInfo 画面鉴政控制参数。
     */
    public PoliticalImgReviewTemplateInfoForUpdate getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * 设置画面鉴政控制参数。
     * @param ImgReviewInfo 画面鉴政控制参数。
     */
    public void setImgReviewInfo(PoliticalImgReviewTemplateInfoForUpdate ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * 获取语音鉴政控制参数。
     * @return AsrReviewInfo 语音鉴政控制参数。
     */
    public PoliticalAsrReviewTemplateInfoForUpdate getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * 设置语音鉴政控制参数。
     * @param AsrReviewInfo 语音鉴政控制参数。
     */
    public void setAsrReviewInfo(PoliticalAsrReviewTemplateInfoForUpdate AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * 获取文本鉴政控制参数。
     * @return OcrReviewInfo 文本鉴政控制参数。
     */
    public PoliticalOcrReviewTemplateInfoForUpdate getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * 设置文本鉴政控制参数。
     * @param OcrReviewInfo 文本鉴政控制参数。
     */
    public void setOcrReviewInfo(PoliticalOcrReviewTemplateInfoForUpdate OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImgReviewInfo.", this.ImgReviewInfo);
        this.setParamObj(map, prefix + "AsrReviewInfo.", this.AsrReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

