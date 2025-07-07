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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralFastOCRResponse extends AbstractModel {

    /**
    * 检测到的文本信息，具体内容请点击左侧链接。
    */
    @SerializedName("TextDetections")
    @Expose
    private TextDetection [] TextDetections;

    /**
    * 检测到的语言，目前支持的语种范围为：简体中文、繁体中文、英文、日文、韩文。未来将陆续新增对更多语种的支持。
返回结果含义为：zh - 中英混合，jap - 日文，kor - 韩文。
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负
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
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 检测到的文本信息，具体内容请点击左侧链接。 
     * @return TextDetections 检测到的文本信息，具体内容请点击左侧链接。
     */
    public TextDetection [] getTextDetections() {
        return this.TextDetections;
    }

    /**
     * Set 检测到的文本信息，具体内容请点击左侧链接。
     * @param TextDetections 检测到的文本信息，具体内容请点击左侧链接。
     */
    public void setTextDetections(TextDetection [] TextDetections) {
        this.TextDetections = TextDetections;
    }

    /**
     * Get 检测到的语言，目前支持的语种范围为：简体中文、繁体中文、英文、日文、韩文。未来将陆续新增对更多语种的支持。
返回结果含义为：zh - 中英混合，jap - 日文，kor - 韩文。 
     * @return Language 检测到的语言，目前支持的语种范围为：简体中文、繁体中文、英文、日文、韩文。未来将陆续新增对更多语种的支持。
返回结果含义为：zh - 中英混合，jap - 日文，kor - 韩文。
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 检测到的语言，目前支持的语种范围为：简体中文、繁体中文、英文、日文、韩文。未来将陆续新增对更多语种的支持。
返回结果含义为：zh - 中英混合，jap - 日文，kor - 韩文。
     * @param Language 检测到的语言，目前支持的语种范围为：简体中文、繁体中文、英文、日文、韩文。未来将陆续新增对更多语种的支持。
返回结果含义为：zh - 中英混合，jap - 日文，kor - 韩文。
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负 
     * @return Angel 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负
     */
    public Float getAngel() {
        return this.Angel;
    }

    /**
     * Set 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负
     * @param Angel 图片旋转角度（角度制），文本的水平方向为0°；顺时针为正，逆时针为负
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
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GeneralFastOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralFastOCRResponse(GeneralFastOCRResponse source) {
        if (source.TextDetections != null) {
            this.TextDetections = new TextDetection[source.TextDetections.length];
            for (int i = 0; i < source.TextDetections.length; i++) {
                this.TextDetections[i] = new TextDetection(source.TextDetections[i]);
            }
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Angel != null) {
            this.Angel = new Float(source.Angel);
        }
        if (source.PdfPageSize != null) {
            this.PdfPageSize = new Long(source.PdfPageSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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

