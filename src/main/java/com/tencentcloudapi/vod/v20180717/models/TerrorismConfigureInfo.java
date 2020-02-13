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

public class TerrorismConfigureInfo extends AbstractModel{

    /**
    * 画面鉴恐任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private TerrorismImgReviewTemplateInfo ImgReviewInfo;

    /**
    * 文字鉴恐任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private TerrorismOcrReviewTemplateInfo OcrReviewInfo;

    /**
     * Get 画面鉴恐任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImgReviewInfo 画面鉴恐任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TerrorismImgReviewTemplateInfo getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * Set 画面鉴恐任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImgReviewInfo 画面鉴恐任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImgReviewInfo(TerrorismImgReviewTemplateInfo ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * Get 文字鉴恐任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrReviewInfo 文字鉴恐任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TerrorismOcrReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * Set 文字鉴恐任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrReviewInfo 文字鉴恐任务控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrReviewInfo(TerrorismOcrReviewTemplateInfo OcrReviewInfo) {
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

