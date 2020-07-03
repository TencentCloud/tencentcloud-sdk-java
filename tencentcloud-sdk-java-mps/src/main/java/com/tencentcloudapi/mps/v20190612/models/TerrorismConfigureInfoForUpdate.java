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

public class TerrorismConfigureInfoForUpdate extends AbstractModel{

    /**
    * 画面鉴恐任务控制参数。
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private TerrorismImgReviewTemplateInfoForUpdate ImgReviewInfo;

    /**
    * 文本鉴恐任务控制参数。
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private TerrorismOcrReviewTemplateInfoForUpdate OcrReviewInfo;

    /**
     * Get 画面鉴恐任务控制参数。 
     * @return ImgReviewInfo 画面鉴恐任务控制参数。
     */
    public TerrorismImgReviewTemplateInfoForUpdate getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set 画面鉴恐任务控制参数。
     * @param ImgReviewInfo 画面鉴恐任务控制参数。
     */
    public void setImgReviewInfo(TerrorismImgReviewTemplateInfoForUpdate ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get 文本鉴恐任务控制参数。 
     * @return OcrReviewInfo 文本鉴恐任务控制参数。
     */
    public TerrorismOcrReviewTemplateInfoForUpdate getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set 文本鉴恐任务控制参数。
     * @param OcrReviewInfo 文本鉴恐任务控制参数。
     */
    public void setOcrReviewInfo(TerrorismOcrReviewTemplateInfoForUpdate OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImgReviewInfo.", this.ImgReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

