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
    * 审核策略BizType
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 待审文件类型，目前支持：PDF, DOC, DOCX
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 送审内容类型：1-文档，2-文本
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * 送审内容，根据ContentType字段的取值，传入送审文档的Url链接，或送审文本的Base64编码

文档限制：

- 文件下载时间不超过15秒（文件存储于腾讯云的Url可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。）
- 所下载文件经 Base64 编码后不超过支持的文件大小：PDF/DOC/DOCX - 200M
- 文档解析后的纯文本长度不超过 10000字

文本限制：Base64解码后的文本长度不超过10000字

    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 审核策略BizType 
     * @return BizType 审核策略BizType
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 审核策略BizType
     * @param BizType 审核策略BizType
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 待审文件类型，目前支持：PDF, DOC, DOCX 
     * @return FileType 待审文件类型，目前支持：PDF, DOC, DOCX
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 待审文件类型，目前支持：PDF, DOC, DOCX
     * @param FileType 待审文件类型，目前支持：PDF, DOC, DOCX
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 送审内容类型：1-文档，2-文本 
     * @return ContentType 送审内容类型：1-文档，2-文本
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set 送审内容类型：1-文档，2-文本
     * @param ContentType 送审内容类型：1-文档，2-文本
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 送审内容，根据ContentType字段的取值，传入送审文档的Url链接，或送审文本的Base64编码

文档限制：

- 文件下载时间不超过15秒（文件存储于腾讯云的Url可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。）
- 所下载文件经 Base64 编码后不超过支持的文件大小：PDF/DOC/DOCX - 200M
- 文档解析后的纯文本长度不超过 10000字

文本限制：Base64解码后的文本长度不超过10000字
 
     * @return Content 送审内容，根据ContentType字段的取值，传入送审文档的Url链接，或送审文本的Base64编码

文档限制：

- 文件下载时间不超过15秒（文件存储于腾讯云的Url可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。）
- 所下载文件经 Base64 编码后不超过支持的文件大小：PDF/DOC/DOCX - 200M
- 文档解析后的纯文本长度不超过 10000字

文本限制：Base64解码后的文本长度不超过10000字

     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 送审内容，根据ContentType字段的取值，传入送审文档的Url链接，或送审文本的Base64编码

文档限制：

- 文件下载时间不超过15秒（文件存储于腾讯云的Url可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。）
- 所下载文件经 Base64 编码后不超过支持的文件大小：PDF/DOC/DOCX - 200M
- 文档解析后的纯文本长度不超过 10000字

文本限制：Base64解码后的文本长度不超过10000字

     * @param Content 送审内容，根据ContentType字段的取值，传入送审文档的Url链接，或送审文本的Base64编码

文档限制：

- 文件下载时间不超过15秒（文件存储于腾讯云的Url可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。）
- 所下载文件经 Base64 编码后不超过支持的文件大小：PDF/DOC/DOCX - 200M
- 文档解析后的纯文本长度不超过 10000字

文本限制：Base64解码后的文本长度不超过10000字

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
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
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
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

