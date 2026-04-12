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
    * <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。</p>
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * <p>表示整张试卷批改需要先切题，默认为false</p>
    */
    @SerializedName("BoolSingleQuestion")
    @Expose
    private Boolean BoolSingleQuestion;

    /**
    * <p>默认false 表示关闭深度思考  true 表示打开深度思考，更深层次推理分析，速度更慢</p>
    */
    @SerializedName("EnableDeepThink")
    @Expose
    private Boolean EnableDeepThink;

    /**
    * <p>题目信息输出配置，当key对应为true表示开启配置开关。</p><p>当key为KnowledgePoints value为true 表示输出每道题结构信息中输出知识点内容；<br>当key为TrueAnswer  value为true 表示输出每道题的正确答案 ；<br>当key为StepCorrection  value为true表示启用步骤级批改；</p><p> 设置方式参考  {&quot;KnowledgePoints&quot;:true,&quot;TrueAnswer&quot;:true}</p><p>参数格式：{&quot;KnowledgePoints&quot;:true,&quot;TrueAnswer&quot;:true}</p>
    */
    @SerializedName("QuestionConfigMap")
    @Expose
    private String QuestionConfigMap;

    /**
    * <p>仅有单题有效，如果切题有多题则不生效，单题批改的时候作为参考答案输入到批改模型中</p>
    */
    @SerializedName("ReferenceAnswer")
    @Expose
    private String ReferenceAnswer;

    /**
    * <p>图片/PDF的 Base64 列表值，最多三张。每张图片要求参考ImageBase64  1. 如果ImageBase64List或者ImageUrlList 都没值则取ImageBase64 或者ImageUrl  2.如果ImageBase64List或者ImageUrlList 有一个值，则不取ImageBase64 或者ImageUrl值，优先去list  3.如果ImageBase64List或者ImageUrlList 都有值，则取ImageUrlList</p>
    */
    @SerializedName("ImageBase64List")
    @Expose
    private String [] ImageBase64List;

    /**
    * <p>图片/PDF的 Url 地址Base64 列表值，最多三张。每张图片要求参考ImageUrl。  图片生效规则同ImageBase64List</p>
    */
    @SerializedName("ImageUrlList")
    @Expose
    private String [] ImageUrlList;

    /**
     * Get <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==</p> 
     * @return ImageBase64 <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==</p>
     * @param ImageBase64 <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg</p> 
     * @return ImageUrl <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg</p>
     * @param ImageUrl <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。</p> 
     * @return PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。</p>
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。</p>
     * @param PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。</p>
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get <p>表示整张试卷批改需要先切题，默认为false</p> 
     * @return BoolSingleQuestion <p>表示整张试卷批改需要先切题，默认为false</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getBoolSingleQuestion() {
        return this.BoolSingleQuestion;
    }

    /**
     * Set <p>表示整张试卷批改需要先切题，默认为false</p>
     * @param BoolSingleQuestion <p>表示整张试卷批改需要先切题，默认为false</p>
     * @deprecated
     */
    @Deprecated
    public void setBoolSingleQuestion(Boolean BoolSingleQuestion) {
        this.BoolSingleQuestion = BoolSingleQuestion;
    }

    /**
     * Get <p>默认false 表示关闭深度思考  true 表示打开深度思考，更深层次推理分析，速度更慢</p> 
     * @return EnableDeepThink <p>默认false 表示关闭深度思考  true 表示打开深度思考，更深层次推理分析，速度更慢</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getEnableDeepThink() {
        return this.EnableDeepThink;
    }

    /**
     * Set <p>默认false 表示关闭深度思考  true 表示打开深度思考，更深层次推理分析，速度更慢</p>
     * @param EnableDeepThink <p>默认false 表示关闭深度思考  true 表示打开深度思考，更深层次推理分析，速度更慢</p>
     * @deprecated
     */
    @Deprecated
    public void setEnableDeepThink(Boolean EnableDeepThink) {
        this.EnableDeepThink = EnableDeepThink;
    }

    /**
     * Get <p>题目信息输出配置，当key对应为true表示开启配置开关。</p><p>当key为KnowledgePoints value为true 表示输出每道题结构信息中输出知识点内容；<br>当key为TrueAnswer  value为true 表示输出每道题的正确答案 ；<br>当key为StepCorrection  value为true表示启用步骤级批改；</p><p> 设置方式参考  {&quot;KnowledgePoints&quot;:true,&quot;TrueAnswer&quot;:true}</p><p>参数格式：{&quot;KnowledgePoints&quot;:true,&quot;TrueAnswer&quot;:true}</p> 
     * @return QuestionConfigMap <p>题目信息输出配置，当key对应为true表示开启配置开关。</p><p>当key为KnowledgePoints value为true 表示输出每道题结构信息中输出知识点内容；<br>当key为TrueAnswer  value为true 表示输出每道题的正确答案 ；<br>当key为StepCorrection  value为true表示启用步骤级批改；</p><p> 设置方式参考  {&quot;KnowledgePoints&quot;:true,&quot;TrueAnswer&quot;:true}</p><p>参数格式：{&quot;KnowledgePoints&quot;:true,&quot;TrueAnswer&quot;:true}</p>
     */
    public String getQuestionConfigMap() {
        return this.QuestionConfigMap;
    }

    /**
     * Set <p>题目信息输出配置，当key对应为true表示开启配置开关。</p><p>当key为KnowledgePoints value为true 表示输出每道题结构信息中输出知识点内容；<br>当key为TrueAnswer  value为true 表示输出每道题的正确答案 ；<br>当key为StepCorrection  value为true表示启用步骤级批改；</p><p> 设置方式参考  {&quot;KnowledgePoints&quot;:true,&quot;TrueAnswer&quot;:true}</p><p>参数格式：{&quot;KnowledgePoints&quot;:true,&quot;TrueAnswer&quot;:true}</p>
     * @param QuestionConfigMap <p>题目信息输出配置，当key对应为true表示开启配置开关。</p><p>当key为KnowledgePoints value为true 表示输出每道题结构信息中输出知识点内容；<br>当key为TrueAnswer  value为true 表示输出每道题的正确答案 ；<br>当key为StepCorrection  value为true表示启用步骤级批改；</p><p> 设置方式参考  {&quot;KnowledgePoints&quot;:true,&quot;TrueAnswer&quot;:true}</p><p>参数格式：{&quot;KnowledgePoints&quot;:true,&quot;TrueAnswer&quot;:true}</p>
     */
    public void setQuestionConfigMap(String QuestionConfigMap) {
        this.QuestionConfigMap = QuestionConfigMap;
    }

    /**
     * Get <p>仅有单题有效，如果切题有多题则不生效，单题批改的时候作为参考答案输入到批改模型中</p> 
     * @return ReferenceAnswer <p>仅有单题有效，如果切题有多题则不生效，单题批改的时候作为参考答案输入到批改模型中</p>
     */
    public String getReferenceAnswer() {
        return this.ReferenceAnswer;
    }

    /**
     * Set <p>仅有单题有效，如果切题有多题则不生效，单题批改的时候作为参考答案输入到批改模型中</p>
     * @param ReferenceAnswer <p>仅有单题有效，如果切题有多题则不生效，单题批改的时候作为参考答案输入到批改模型中</p>
     */
    public void setReferenceAnswer(String ReferenceAnswer) {
        this.ReferenceAnswer = ReferenceAnswer;
    }

    /**
     * Get <p>图片/PDF的 Base64 列表值，最多三张。每张图片要求参考ImageBase64  1. 如果ImageBase64List或者ImageUrlList 都没值则取ImageBase64 或者ImageUrl  2.如果ImageBase64List或者ImageUrlList 有一个值，则不取ImageBase64 或者ImageUrl值，优先去list  3.如果ImageBase64List或者ImageUrlList 都有值，则取ImageUrlList</p> 
     * @return ImageBase64List <p>图片/PDF的 Base64 列表值，最多三张。每张图片要求参考ImageBase64  1. 如果ImageBase64List或者ImageUrlList 都没值则取ImageBase64 或者ImageUrl  2.如果ImageBase64List或者ImageUrlList 有一个值，则不取ImageBase64 或者ImageUrl值，优先去list  3.如果ImageBase64List或者ImageUrlList 都有值，则取ImageUrlList</p>
     */
    public String [] getImageBase64List() {
        return this.ImageBase64List;
    }

    /**
     * Set <p>图片/PDF的 Base64 列表值，最多三张。每张图片要求参考ImageBase64  1. 如果ImageBase64List或者ImageUrlList 都没值则取ImageBase64 或者ImageUrl  2.如果ImageBase64List或者ImageUrlList 有一个值，则不取ImageBase64 或者ImageUrl值，优先去list  3.如果ImageBase64List或者ImageUrlList 都有值，则取ImageUrlList</p>
     * @param ImageBase64List <p>图片/PDF的 Base64 列表值，最多三张。每张图片要求参考ImageBase64  1. 如果ImageBase64List或者ImageUrlList 都没值则取ImageBase64 或者ImageUrl  2.如果ImageBase64List或者ImageUrlList 有一个值，则不取ImageBase64 或者ImageUrl值，优先去list  3.如果ImageBase64List或者ImageUrlList 都有值，则取ImageUrlList</p>
     */
    public void setImageBase64List(String [] ImageBase64List) {
        this.ImageBase64List = ImageBase64List;
    }

    /**
     * Get <p>图片/PDF的 Url 地址Base64 列表值，最多三张。每张图片要求参考ImageUrl。  图片生效规则同ImageBase64List</p> 
     * @return ImageUrlList <p>图片/PDF的 Url 地址Base64 列表值，最多三张。每张图片要求参考ImageUrl。  图片生效规则同ImageBase64List</p>
     */
    public String [] getImageUrlList() {
        return this.ImageUrlList;
    }

    /**
     * Set <p>图片/PDF的 Url 地址Base64 列表值，最多三张。每张图片要求参考ImageUrl。  图片生效规则同ImageBase64List</p>
     * @param ImageUrlList <p>图片/PDF的 Url 地址Base64 列表值，最多三张。每张图片要求参考ImageUrl。  图片生效规则同ImageBase64List</p>
     */
    public void setImageUrlList(String [] ImageUrlList) {
        this.ImageUrlList = ImageUrlList;
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
        this.setParamArraySimple(map, prefix + "ImageBase64List.", this.ImageBase64List);
        this.setParamArraySimple(map, prefix + "ImageUrlList.", this.ImageUrlList);

    }
}

