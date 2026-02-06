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

public class SubmitQuestionMarkAgentJobRequest extends AbstractModel {

    /**
    * 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * 表示整张试卷批改需要先切题，默认为false
    */
    @SerializedName("BoolSingleQuestion")
    @Expose
    private Boolean BoolSingleQuestion;

    /**
    * 默认false 表示关闭深度思考  true 表示打开深度思考，更深层次推理分析，速度更慢
    */
    @SerializedName("EnableDeepThink")
    @Expose
    private Boolean EnableDeepThink;

    /**
    * 题目信息输出配置，当key对应为true表示开启配置开关。     当key为KnowledgePoints value为true 表示输出每道题结构信息中输出知识点内容；当key为TrueAnswer  value为true 表示输出每道题的正确答案 ；当key为ReturnAnswerPosition  value为false表示不输出手写答案坐标（降低处理耗时，按需输出）； 设置方式参考  {"KnowledgePoints":true,"TrueAnswer":true}
    */
    @SerializedName("QuestionConfigMap")
    @Expose
    private String QuestionConfigMap;

    /**
    * 仅有单题有效，如果切题有多题则不生效，单题批改的时候作为参考答案输入到批改模型中
    */
    @SerializedName("ReferenceAnswer")
    @Expose
    private String ReferenceAnswer;

    /**
     * Get 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q== 
     * @return ImageBase64 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==
     * @param ImageBase64 图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg 
     * @return ImageUrl 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg
     * @param ImageUrl 图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 
     * @return PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。
     * @param PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get 表示整张试卷批改需要先切题，默认为false 
     * @return BoolSingleQuestion 表示整张试卷批改需要先切题，默认为false
     * @deprecated
     */
    @Deprecated
    public Boolean getBoolSingleQuestion() {
        return this.BoolSingleQuestion;
    }

    /**
     * Set 表示整张试卷批改需要先切题，默认为false
     * @param BoolSingleQuestion 表示整张试卷批改需要先切题，默认为false
     * @deprecated
     */
    @Deprecated
    public void setBoolSingleQuestion(Boolean BoolSingleQuestion) {
        this.BoolSingleQuestion = BoolSingleQuestion;
    }

    /**
     * Get 默认false 表示关闭深度思考  true 表示打开深度思考，更深层次推理分析，速度更慢 
     * @return EnableDeepThink 默认false 表示关闭深度思考  true 表示打开深度思考，更深层次推理分析，速度更慢
     * @deprecated
     */
    @Deprecated
    public Boolean getEnableDeepThink() {
        return this.EnableDeepThink;
    }

    /**
     * Set 默认false 表示关闭深度思考  true 表示打开深度思考，更深层次推理分析，速度更慢
     * @param EnableDeepThink 默认false 表示关闭深度思考  true 表示打开深度思考，更深层次推理分析，速度更慢
     * @deprecated
     */
    @Deprecated
    public void setEnableDeepThink(Boolean EnableDeepThink) {
        this.EnableDeepThink = EnableDeepThink;
    }

    /**
     * Get 题目信息输出配置，当key对应为true表示开启配置开关。     当key为KnowledgePoints value为true 表示输出每道题结构信息中输出知识点内容；当key为TrueAnswer  value为true 表示输出每道题的正确答案 ；当key为ReturnAnswerPosition  value为false表示不输出手写答案坐标（降低处理耗时，按需输出）； 设置方式参考  {"KnowledgePoints":true,"TrueAnswer":true} 
     * @return QuestionConfigMap 题目信息输出配置，当key对应为true表示开启配置开关。     当key为KnowledgePoints value为true 表示输出每道题结构信息中输出知识点内容；当key为TrueAnswer  value为true 表示输出每道题的正确答案 ；当key为ReturnAnswerPosition  value为false表示不输出手写答案坐标（降低处理耗时，按需输出）； 设置方式参考  {"KnowledgePoints":true,"TrueAnswer":true}
     */
    public String getQuestionConfigMap() {
        return this.QuestionConfigMap;
    }

    /**
     * Set 题目信息输出配置，当key对应为true表示开启配置开关。     当key为KnowledgePoints value为true 表示输出每道题结构信息中输出知识点内容；当key为TrueAnswer  value为true 表示输出每道题的正确答案 ；当key为ReturnAnswerPosition  value为false表示不输出手写答案坐标（降低处理耗时，按需输出）； 设置方式参考  {"KnowledgePoints":true,"TrueAnswer":true}
     * @param QuestionConfigMap 题目信息输出配置，当key对应为true表示开启配置开关。     当key为KnowledgePoints value为true 表示输出每道题结构信息中输出知识点内容；当key为TrueAnswer  value为true 表示输出每道题的正确答案 ；当key为ReturnAnswerPosition  value为false表示不输出手写答案坐标（降低处理耗时，按需输出）； 设置方式参考  {"KnowledgePoints":true,"TrueAnswer":true}
     */
    public void setQuestionConfigMap(String QuestionConfigMap) {
        this.QuestionConfigMap = QuestionConfigMap;
    }

    /**
     * Get 仅有单题有效，如果切题有多题则不生效，单题批改的时候作为参考答案输入到批改模型中 
     * @return ReferenceAnswer 仅有单题有效，如果切题有多题则不生效，单题批改的时候作为参考答案输入到批改模型中
     */
    public String getReferenceAnswer() {
        return this.ReferenceAnswer;
    }

    /**
     * Set 仅有单题有效，如果切题有多题则不生效，单题批改的时候作为参考答案输入到批改模型中
     * @param ReferenceAnswer 仅有单题有效，如果切题有多题则不生效，单题批改的时候作为参考答案输入到批改模型中
     */
    public void setReferenceAnswer(String ReferenceAnswer) {
        this.ReferenceAnswer = ReferenceAnswer;
    }

    public SubmitQuestionMarkAgentJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitQuestionMarkAgentJobRequest(SubmitQuestionMarkAgentJobRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.BoolSingleQuestion != null) {
            this.BoolSingleQuestion = new Boolean(source.BoolSingleQuestion);
        }
        if (source.EnableDeepThink != null) {
            this.EnableDeepThink = new Boolean(source.EnableDeepThink);
        }
        if (source.QuestionConfigMap != null) {
            this.QuestionConfigMap = new String(source.QuestionConfigMap);
        }
        if (source.ReferenceAnswer != null) {
            this.ReferenceAnswer = new String(source.ReferenceAnswer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamSimple(map, prefix + "BoolSingleQuestion", this.BoolSingleQuestion);
        this.setParamSimple(map, prefix + "EnableDeepThink", this.EnableDeepThink);
        this.setParamSimple(map, prefix + "QuestionConfigMap", this.QuestionConfigMap);
        this.setParamSimple(map, prefix + "ReferenceAnswer", this.ReferenceAnswer);

    }
}

