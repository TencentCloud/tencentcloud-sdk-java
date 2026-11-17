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
    * <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==</p>
    */
    @SerializedName("ImageBase64List")
    @Expose
    private String [] ImageBase64List;

    /**
    * <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg</p>
    */
    @SerializedName("ImageUrlList")
    @Expose
    private String [] ImageUrlList;

    /**
    * <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 示例值：1</p>
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * <p>批改信息输出配置，当key对应为1表示开启配置开关。  当key为StructureAndContent  value为1 表示SentenceSuggest返回篇章结构和内容信息，默认只返回词汇、语句</p>
    */
    @SerializedName("QuestionConfigMap")
    @Expose
    private String QuestionConfigMap;

    /**
    * <p>agent支持的类型枚举,不同类型输出结果不一样，默认为0</p><p>0:表示中英文作文批改Agent</p><p>1:表示教辅试卷题库拆录Agent(支持拆录含解析与答案的教辅（解析、答案可与正文分置首尾，或与试题混排）、多页成套标准答案试卷及带有手写批注痕迹的试题)</p>
    */
    @SerializedName("AgentType")
    @Expose
    private Long AgentType;

    /**
    * <p>需要识别的页码范围（目前只有AgentType=1支持），单次调用最多支持100页。  参数格式：1-10   示例值：1-2</p>
    */
    @SerializedName("PageRange")
    @Expose
    private String PageRange;

    /**
     * Get <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==</p> 
     * @return ImageBase64List <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==</p>
     */
    public String [] getImageBase64List() {
        return this.ImageBase64List;
    }

    /**
     * Set <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==</p>
     * @param ImageBase64List <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。  示例值：/9j/4AAQSkZJRg.....s97n//2Q==</p>
     */
    public void setImageBase64List(String [] ImageBase64List) {
        this.ImageBase64List = ImageBase64List;
    }

    /**
     * Get <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg</p> 
     * @return ImageUrlList <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg</p>
     */
    public String [] getImageUrlList() {
        return this.ImageUrlList;
    }

    /**
     * Set <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg</p>
     * @param ImageUrlList <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。  示例值：https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.jpg</p>
     */
    public void setImageUrlList(String [] ImageUrlList) {
        this.ImageUrlList = ImageUrlList;
    }

    /**
     * Get <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 示例值：1</p> 
     * @return PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 示例值：1</p>
     * @deprecated
     */
    @Deprecated
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 示例值：1</p>
     * @param PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，默认值为1。 示例值：1</p>
     * @deprecated
     */
    @Deprecated
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get <p>批改信息输出配置，当key对应为1表示开启配置开关。  当key为StructureAndContent  value为1 表示SentenceSuggest返回篇章结构和内容信息，默认只返回词汇、语句</p> 
     * @return QuestionConfigMap <p>批改信息输出配置，当key对应为1表示开启配置开关。  当key为StructureAndContent  value为1 表示SentenceSuggest返回篇章结构和内容信息，默认只返回词汇、语句</p>
     */
    public String getQuestionConfigMap() {
        return this.QuestionConfigMap;
    }

    /**
     * Set <p>批改信息输出配置，当key对应为1表示开启配置开关。  当key为StructureAndContent  value为1 表示SentenceSuggest返回篇章结构和内容信息，默认只返回词汇、语句</p>
     * @param QuestionConfigMap <p>批改信息输出配置，当key对应为1表示开启配置开关。  当key为StructureAndContent  value为1 表示SentenceSuggest返回篇章结构和内容信息，默认只返回词汇、语句</p>
     */
    public void setQuestionConfigMap(String QuestionConfigMap) {
        this.QuestionConfigMap = QuestionConfigMap;
    }

    /**
     * Get <p>agent支持的类型枚举,不同类型输出结果不一样，默认为0</p><p>0:表示中英文作文批改Agent</p><p>1:表示教辅试卷题库拆录Agent(支持拆录含解析与答案的教辅（解析、答案可与正文分置首尾，或与试题混排）、多页成套标准答案试卷及带有手写批注痕迹的试题)</p> 
     * @return AgentType <p>agent支持的类型枚举,不同类型输出结果不一样，默认为0</p><p>0:表示中英文作文批改Agent</p><p>1:表示教辅试卷题库拆录Agent(支持拆录含解析与答案的教辅（解析、答案可与正文分置首尾，或与试题混排）、多页成套标准答案试卷及带有手写批注痕迹的试题)</p>
     */
    public Long getAgentType() {
        return this.AgentType;
    }

    /**
     * Set <p>agent支持的类型枚举,不同类型输出结果不一样，默认为0</p><p>0:表示中英文作文批改Agent</p><p>1:表示教辅试卷题库拆录Agent(支持拆录含解析与答案的教辅（解析、答案可与正文分置首尾，或与试题混排）、多页成套标准答案试卷及带有手写批注痕迹的试题)</p>
     * @param AgentType <p>agent支持的类型枚举,不同类型输出结果不一样，默认为0</p><p>0:表示中英文作文批改Agent</p><p>1:表示教辅试卷题库拆录Agent(支持拆录含解析与答案的教辅（解析、答案可与正文分置首尾，或与试题混排）、多页成套标准答案试卷及带有手写批注痕迹的试题)</p>
     */
    public void setAgentType(Long AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get <p>需要识别的页码范围（目前只有AgentType=1支持），单次调用最多支持100页。  参数格式：1-10   示例值：1-2</p> 
     * @return PageRange <p>需要识别的页码范围（目前只有AgentType=1支持），单次调用最多支持100页。  参数格式：1-10   示例值：1-2</p>
     */
    public String getPageRange() {
        return this.PageRange;
    }

    /**
     * Set <p>需要识别的页码范围（目前只有AgentType=1支持），单次调用最多支持100页。  参数格式：1-10   示例值：1-2</p>
     * @param PageRange <p>需要识别的页码范围（目前只有AgentType=1支持），单次调用最多支持100页。  参数格式：1-10   示例值：1-2</p>
     */
    public void setPageRange(String PageRange) {
        this.PageRange = PageRange;
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
        if (source.AgentType != null) {
            this.AgentType = new Long(source.AgentType);
        }
        if (source.PageRange != null) {
            this.PageRange = new String(source.PageRange);
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
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "PageRange", this.PageRange);

    }
}

