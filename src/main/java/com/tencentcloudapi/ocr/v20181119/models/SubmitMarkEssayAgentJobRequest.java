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

public class SubmitMarkEssayAgentJobRequest extends AbstractModel {

    /**
    * 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==
    */
    @SerializedName("ImageBase64List")
    @Expose
    private String [] ImageBase64List;

    /**
    * 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg
    */
    @SerializedName("ImageUrlList")
    @Expose
    private String [] ImageUrlList;

    /**
    * 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 示例值：1
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * 批改信息输出配置，当key对应为1表示开启配置开关。  当key为StructureAndContent  value为1 表示SentenceSuggest返回篇章结构和内容信息，默认只返回词汇、语句
    */
    @SerializedName("QuestionConfigMap")
    @Expose
    private String QuestionConfigMap;

    /**
     * Get 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q== 
     * @return ImageBase64List 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==
     */
    public String [] getImageBase64List() {
        return this.ImageBase64List;
    }

    /**
     * Set 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==
     * @param ImageBase64List 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==
     */
    public void setImageBase64List(String [] ImageBase64List) {
        this.ImageBase64List = ImageBase64List;
    }

    /**
     * Get 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg 
     * @return ImageUrlList 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg
     */
    public String [] getImageUrlList() {
        return this.ImageUrlList;
    }

    /**
     * Set 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg
     * @param ImageUrlList 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg
     */
    public void setImageUrlList(String [] ImageUrlList) {
        this.ImageUrlList = ImageUrlList;
    }

    /**
     * Get 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 示例值：1 
     * @return PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 示例值：1
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 示例值：1
     * @param PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 示例值：1
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get 批改信息输出配置，当key对应为1表示开启配置开关。  当key为StructureAndContent  value为1 表示SentenceSuggest返回篇章结构和内容信息，默认只返回词汇、语句 
     * @return QuestionConfigMap 批改信息输出配置，当key对应为1表示开启配置开关。  当key为StructureAndContent  value为1 表示SentenceSuggest返回篇章结构和内容信息，默认只返回词汇、语句
     */
    public String getQuestionConfigMap() {
        return this.QuestionConfigMap;
    }

    /**
     * Set 批改信息输出配置，当key对应为1表示开启配置开关。  当key为StructureAndContent  value为1 表示SentenceSuggest返回篇章结构和内容信息，默认只返回词汇、语句
     * @param QuestionConfigMap 批改信息输出配置，当key对应为1表示开启配置开关。  当key为StructureAndContent  value为1 表示SentenceSuggest返回篇章结构和内容信息，默认只返回词汇、语句
     */
    public void setQuestionConfigMap(String QuestionConfigMap) {
        this.QuestionConfigMap = QuestionConfigMap;
    }

    public SubmitMarkEssayAgentJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitMarkEssayAgentJobRequest(SubmitMarkEssayAgentJobRequest source) {
        if (source.ImageBase64List != null) {
            this.ImageBase64List = new String[source.ImageBase64List.length];
            for (int i = 0; i < source.ImageBase64List.length; i++) {
                this.ImageBase64List[i] = new String(source.ImageBase64List[i]);
            }
        }
        if (source.ImageUrlList != null) {
            this.ImageUrlList = new String[source.ImageUrlList.length];
            for (int i = 0; i < source.ImageUrlList.length; i++) {
                this.ImageUrlList[i] = new String(source.ImageUrlList[i]);
            }
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.QuestionConfigMap != null) {
            this.QuestionConfigMap = new String(source.QuestionConfigMap);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageBase64List.", this.ImageBase64List);
        this.setParamArraySimple(map, prefix + "ImageUrlList.", this.ImageUrlList);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamSimple(map, prefix + "QuestionConfigMap", this.QuestionConfigMap);

    }
}

