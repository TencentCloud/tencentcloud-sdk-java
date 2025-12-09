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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFinancialLLMTaskRequest extends AbstractModel {

    /**
    * 接口使用的识别策略 ID，请参考 [快速指引](https://cloud.tencent.com/document/product/1124/124604) 获取该值。  
示例值：TencentCloudFinancialLLMDefault
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 送审内容的格式，有两个可选值：
- 1：代表送审内容为**文档**，如DOC文档
- 2：代表送审内容为**纯文本**

示例值：1
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * 若送审内容为文档（ContentType=1），需要传入具体格式，当前支持：DOC、DOCX、PDF。  
说明：若送审内容为纯文本（ContentType=2），则本字段传空（FileType=""）。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 送审内容的传入方式如下：
- 若为文档类，需传入文档的URL（原文档文字数不超过10,000字），例如：http://xxxxxxxxxxxx/financial_test.doc
- 若为纯文本类，请以UTF-8格式进行Base64编码后传入（编码后字符数不超过10,000字），例如：5piO5aSpNjAz5LiA5a6a5rao

示例值：5piO5aSpNjAz5LiA5a6a5rao
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 接口使用的识别策略 ID，请参考 [快速指引](https://cloud.tencent.com/document/product/1124/124604) 获取该值。  
示例值：TencentCloudFinancialLLMDefault 
     * @return BizType 接口使用的识别策略 ID，请参考 [快速指引](https://cloud.tencent.com/document/product/1124/124604) 获取该值。  
示例值：TencentCloudFinancialLLMDefault
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 接口使用的识别策略 ID，请参考 [快速指引](https://cloud.tencent.com/document/product/1124/124604) 获取该值。  
示例值：TencentCloudFinancialLLMDefault
     * @param BizType 接口使用的识别策略 ID，请参考 [快速指引](https://cloud.tencent.com/document/product/1124/124604) 获取该值。  
示例值：TencentCloudFinancialLLMDefault
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 送审内容的格式，有两个可选值：
- 1：代表送审内容为**文档**，如DOC文档
- 2：代表送审内容为**纯文本**

示例值：1 
     * @return ContentType 送审内容的格式，有两个可选值：
- 1：代表送审内容为**文档**，如DOC文档
- 2：代表送审内容为**纯文本**

示例值：1
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set 送审内容的格式，有两个可选值：
- 1：代表送审内容为**文档**，如DOC文档
- 2：代表送审内容为**纯文本**

示例值：1
     * @param ContentType 送审内容的格式，有两个可选值：
- 1：代表送审内容为**文档**，如DOC文档
- 2：代表送审内容为**纯文本**

示例值：1
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 若送审内容为文档（ContentType=1），需要传入具体格式，当前支持：DOC、DOCX、PDF。  
说明：若送审内容为纯文本（ContentType=2），则本字段传空（FileType=""）。 
     * @return FileType 若送审内容为文档（ContentType=1），需要传入具体格式，当前支持：DOC、DOCX、PDF。  
说明：若送审内容为纯文本（ContentType=2），则本字段传空（FileType=""）。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 若送审内容为文档（ContentType=1），需要传入具体格式，当前支持：DOC、DOCX、PDF。  
说明：若送审内容为纯文本（ContentType=2），则本字段传空（FileType=""）。
     * @param FileType 若送审内容为文档（ContentType=1），需要传入具体格式，当前支持：DOC、DOCX、PDF。  
说明：若送审内容为纯文本（ContentType=2），则本字段传空（FileType=""）。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 送审内容的传入方式如下：
- 若为文档类，需传入文档的URL（原文档文字数不超过10,000字），例如：http://xxxxxxxxxxxx/financial_test.doc
- 若为纯文本类，请以UTF-8格式进行Base64编码后传入（编码后字符数不超过10,000字），例如：5piO5aSpNjAz5LiA5a6a5rao

示例值：5piO5aSpNjAz5LiA5a6a5rao 
     * @return Content 送审内容的传入方式如下：
- 若为文档类，需传入文档的URL（原文档文字数不超过10,000字），例如：http://xxxxxxxxxxxx/financial_test.doc
- 若为纯文本类，请以UTF-8格式进行Base64编码后传入（编码后字符数不超过10,000字），例如：5piO5aSpNjAz5LiA5a6a5rao

示例值：5piO5aSpNjAz5LiA5a6a5rao
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 送审内容的传入方式如下：
- 若为文档类，需传入文档的URL（原文档文字数不超过10,000字），例如：http://xxxxxxxxxxxx/financial_test.doc
- 若为纯文本类，请以UTF-8格式进行Base64编码后传入（编码后字符数不超过10,000字），例如：5piO5aSpNjAz5LiA5a6a5rao

示例值：5piO5aSpNjAz5LiA5a6a5rao
     * @param Content 送审内容的传入方式如下：
- 若为文档类，需传入文档的URL（原文档文字数不超过10,000字），例如：http://xxxxxxxxxxxx/financial_test.doc
- 若为纯文本类，请以UTF-8格式进行Base64编码后传入（编码后字符数不超过10,000字），例如：5piO5aSpNjAz5LiA5a6a5rao

示例值：5piO5aSpNjAz5LiA5a6a5rao
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public CreateFinancialLLMTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFinancialLLMTaskRequest(CreateFinancialLLMTaskRequest source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

