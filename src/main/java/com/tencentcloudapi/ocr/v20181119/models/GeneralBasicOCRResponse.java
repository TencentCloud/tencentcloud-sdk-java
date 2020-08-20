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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralBasicOCRResponse extends AbstractModel{

    /**
    * 检测到的文本信息，包括文本行内容、置信度、文本行坐标以及文本行旋转纠正后的坐标，具体内容请点击左侧链接。
    */
    @SerializedName("TextDetections")
    @Expose
    private TextDetection [] TextDetections;

    /**
    * 检测到的语言类型，目前支持的语言类型参考入参LanguageType说明。
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
    */
    @SerializedName("Angel")
    @Expose
    private Float Angel;

    /**
    * 图片为PDF时，返回PDF的总页数，默认为0
    */
    @SerializedName("PdfPageSize")
    @Expose
    private Long PdfPageSize;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检测到的文本信息，包括文本行内容、置信度、文本行坐标以及文本行旋转纠正后的坐标，具体内容请点击左侧链接。 
     * @return TextDetections 检测到的文本信息，包括文本行内容、置信度、文本行坐标以及文本行旋转纠正后的坐标，具体内容请点击左侧链接。
     */
    public TextDetection [] getTextDetections() {
        return this.TextDetections;
    }

    /**
     * Set 检测到的文本信息，包括文本行内容、置信度、文本行坐标以及文本行旋转纠正后的坐标，具体内容请点击左侧链接。
     * @param TextDetections 检测到的文本信息，包括文本行内容、置信度、文本行坐标以及文本行旋转纠正后的坐标，具体内容请点击左侧链接。
     */
    public void setTextDetections(TextDetection [] TextDetections) {
        this.TextDetections = TextDetections;
    }

    /**
     * Get 检测到的语言类型，目前支持的语言类型参考入参LanguageType说明。 
     * @return Language 检测到的语言类型，目前支持的语言类型参考入参LanguageType说明。
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 检测到的语言类型，目前支持的语言类型参考入参LanguageType说明。
     * @param Language 检测到的语言类型，目前支持的语言类型参考入参LanguageType说明。
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a> 
     * @return Angel 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
     */
    public Float getAngel() {
        return this.Angel;
    }

    /**
     * Set 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
     * @param Angel 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负。点击查看<a href="https://cloud.tencent.com/document/product/866/45139">如何纠正倾斜文本</a>
     */
    public void setAngel(Float Angel) {
        this.Angel = Angel;
    }

    /**
     * Get 图片为PDF时，返回PDF的总页数，默认为0 
     * @return PdfPageSize 图片为PDF时，返回PDF的总页数，默认为0
     */
    public Long getPdfPageSize() {
        return this.PdfPageSize;
    }

    /**
     * Set 图片为PDF时，返回PDF的总页数，默认为0
     * @param PdfPageSize 图片为PDF时，返回PDF的总页数，默认为0
     */
    public void setPdfPageSize(Long PdfPageSize) {
        this.PdfPageSize = PdfPageSize;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TextDetections.", this.TextDetections);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Angel", this.Angel);
        this.setParamSimple(map, prefix + "PdfPageSize", this.PdfPageSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

