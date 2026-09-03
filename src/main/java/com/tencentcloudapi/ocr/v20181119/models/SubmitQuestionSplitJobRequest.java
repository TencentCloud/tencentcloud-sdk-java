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

public class SubmitQuestionSplitJobRequest extends AbstractModel {

    /**
    * <p>批量ImageUrl图片入口。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p><p>入参限制：要求pdf只能有一个url或base64</p>
    */
    @SerializedName("ImageUrlList")
    @Expose
    private String [] ImageUrlList;

    /**
    * <p>批量base64图片入口。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p><p>入参限制：要求pdf只能有一个url或base64</p>
    */
    @SerializedName("ImageBase64List")
    @Expose
    private String [] ImageBase64List;

    /**
    * <p>选择切题模型</p><p>枚举值：</p><ul><li>youtu_crop： 轻量化切题模型，运算速度更快，适合常规切题</li><li>youtu_crop_pro： 属于切题精调大模型，针对双栏、跨栏等复杂版式识别精度大幅提升，但推理耗时更长</li></ul><p>默认值：youtu_crop</p>
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
     * Get <p>批量ImageUrl图片入口。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p><p>入参限制：要求pdf只能有一个url或base64</p> 
     * @return ImageUrlList <p>批量ImageUrl图片入口。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p><p>入参限制：要求pdf只能有一个url或base64</p>
     */
    public String [] getImageUrlList() {
        return this.ImageUrlList;
    }

    /**
     * Set <p>批量ImageUrl图片入口。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p><p>入参限制：要求pdf只能有一个url或base64</p>
     * @param ImageUrlList <p>批量ImageUrl图片入口。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p><p>入参限制：要求pdf只能有一个url或base64</p>
     */
    public void setImageUrlList(String [] ImageUrlList) {
        this.ImageUrlList = ImageUrlList;
    }

    /**
     * Get <p>批量base64图片入口。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p><p>入参限制：要求pdf只能有一个url或base64</p> 
     * @return ImageBase64List <p>批量base64图片入口。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p><p>入参限制：要求pdf只能有一个url或base64</p>
     */
    public String [] getImageBase64List() {
        return this.ImageBase64List;
    }

    /**
     * Set <p>批量base64图片入口。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p><p>入参限制：要求pdf只能有一个url或base64</p>
     * @param ImageBase64List <p>批量base64图片入口。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p><p>入参限制：要求pdf只能有一个url或base64</p>
     */
    public void setImageBase64List(String [] ImageBase64List) {
        this.ImageBase64List = ImageBase64List;
    }

    /**
     * Get <p>选择切题模型</p><p>枚举值：</p><ul><li>youtu_crop： 轻量化切题模型，运算速度更快，适合常规切题</li><li>youtu_crop_pro： 属于切题精调大模型，针对双栏、跨栏等复杂版式识别精度大幅提升，但推理耗时更长</li></ul><p>默认值：youtu_crop</p> 
     * @return ModelType <p>选择切题模型</p><p>枚举值：</p><ul><li>youtu_crop： 轻量化切题模型，运算速度更快，适合常规切题</li><li>youtu_crop_pro： 属于切题精调大模型，针对双栏、跨栏等复杂版式识别精度大幅提升，但推理耗时更长</li></ul><p>默认值：youtu_crop</p>
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>选择切题模型</p><p>枚举值：</p><ul><li>youtu_crop： 轻量化切题模型，运算速度更快，适合常规切题</li><li>youtu_crop_pro： 属于切题精调大模型，针对双栏、跨栏等复杂版式识别精度大幅提升，但推理耗时更长</li></ul><p>默认值：youtu_crop</p>
     * @param ModelType <p>选择切题模型</p><p>枚举值：</p><ul><li>youtu_crop： 轻量化切题模型，运算速度更快，适合常规切题</li><li>youtu_crop_pro： 属于切题精调大模型，针对双栏、跨栏等复杂版式识别精度大幅提升，但推理耗时更长</li></ul><p>默认值：youtu_crop</p>
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    public SubmitQuestionSplitJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitQuestionSplitJobRequest(SubmitQuestionSplitJobRequest source) {
        if (source.ImageUrlList != null) {
            this.ImageUrlList = new String[source.ImageUrlList.length];
            for (int i = 0; i < source.ImageUrlList.length; i++) {
                this.ImageUrlList[i] = new String(source.ImageUrlList[i]);
            }
        }
        if (source.ImageBase64List != null) {
            this.ImageBase64List = new String[source.ImageBase64List.length];
            for (int i = 0; i < source.ImageBase64List.length; i++) {
                this.ImageBase64List[i] = new String(source.ImageBase64List[i]);
            }
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageUrlList.", this.ImageUrlList);
        this.setParamArraySimple(map, prefix + "ImageBase64List.", this.ImageBase64List);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);

    }
}

