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

public class MultimodalDocParseRequest extends AbstractModel {

    /**
    * <p>文件的 Url 地址，支持FileType参数对应的文件格式及大小。文件下载时间不超过3秒。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>支持解析的文件类型。</p><p>1：PDF 文档；</p><p>2：Word 文档（.doc / .docx）；</p><p>3：PPT 演示文稿（.ppt / .pptx）；</p><p>4：Excel 表格（.xls / .xlsx）；</p><p>5：Markdown 文档（.md）；</p><p>6：纯文本文件（.txt）；</p><p>7：图片文件（.png / .jpg / .jpeg 等）；</p><p>8：WPS 文档；</p><p>0：未知文件类型。</p><p></p><p>支持的文件大小：</p><p>PDF/WORD/PPT支持150M且300页以内、EXCEL支持10M以内、TXT支持10M以内、图片文件支持70M以内。</p><p></p><p>默认值：1</p>
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
    * <p>输出格式。</p><p>1：json格式</p><p>2：markdown格式</p><p>3：xml格式</p><p>9：json+markdown+xml格式</p><p></p><p>默认值：9</p>
    */
    @SerializedName("ResultType")
    @Expose
    private Long ResultType;

    /**
    * <p>是否支持子图解析。</p><p></p><p>默认值：false</p>
    */
    @SerializedName("EnableSubImg")
    @Expose
    private Boolean EnableSubImg;

    /**
    * <p>需要识别的页码范围，单次调用最多支持300页。</p><p>参数格式：1-10</p>
    */
    @SerializedName("PageRange")
    @Expose
    private String PageRange;

    /**
     * Get <p>文件的 Url 地址，支持FileType参数对应的文件格式及大小。文件下载时间不超过3秒。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p> 
     * @return FileUrl <p>文件的 Url 地址，支持FileType参数对应的文件格式及大小。文件下载时间不超过3秒。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>文件的 Url 地址，支持FileType参数对应的文件格式及大小。文件下载时间不超过3秒。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     * @param FileUrl <p>文件的 Url 地址，支持FileType参数对应的文件格式及大小。文件下载时间不超过3秒。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>支持解析的文件类型。</p><p>1：PDF 文档；</p><p>2：Word 文档（.doc / .docx）；</p><p>3：PPT 演示文稿（.ppt / .pptx）；</p><p>4：Excel 表格（.xls / .xlsx）；</p><p>5：Markdown 文档（.md）；</p><p>6：纯文本文件（.txt）；</p><p>7：图片文件（.png / .jpg / .jpeg 等）；</p><p>8：WPS 文档；</p><p>0：未知文件类型。</p><p></p><p>支持的文件大小：</p><p>PDF/WORD/PPT支持150M且300页以内、EXCEL支持10M以内、TXT支持10M以内、图片文件支持70M以内。</p><p></p><p>默认值：1</p> 
     * @return FileType <p>支持解析的文件类型。</p><p>1：PDF 文档；</p><p>2：Word 文档（.doc / .docx）；</p><p>3：PPT 演示文稿（.ppt / .pptx）；</p><p>4：Excel 表格（.xls / .xlsx）；</p><p>5：Markdown 文档（.md）；</p><p>6：纯文本文件（.txt）；</p><p>7：图片文件（.png / .jpg / .jpeg 等）；</p><p>8：WPS 文档；</p><p>0：未知文件类型。</p><p></p><p>支持的文件大小：</p><p>PDF/WORD/PPT支持150M且300页以内、EXCEL支持10M以内、TXT支持10M以内、图片文件支持70M以内。</p><p></p><p>默认值：1</p>
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>支持解析的文件类型。</p><p>1：PDF 文档；</p><p>2：Word 文档（.doc / .docx）；</p><p>3：PPT 演示文稿（.ppt / .pptx）；</p><p>4：Excel 表格（.xls / .xlsx）；</p><p>5：Markdown 文档（.md）；</p><p>6：纯文本文件（.txt）；</p><p>7：图片文件（.png / .jpg / .jpeg 等）；</p><p>8：WPS 文档；</p><p>0：未知文件类型。</p><p></p><p>支持的文件大小：</p><p>PDF/WORD/PPT支持150M且300页以内、EXCEL支持10M以内、TXT支持10M以内、图片文件支持70M以内。</p><p></p><p>默认值：1</p>
     * @param FileType <p>支持解析的文件类型。</p><p>1：PDF 文档；</p><p>2：Word 文档（.doc / .docx）；</p><p>3：PPT 演示文稿（.ppt / .pptx）；</p><p>4：Excel 表格（.xls / .xlsx）；</p><p>5：Markdown 文档（.md）；</p><p>6：纯文本文件（.txt）；</p><p>7：图片文件（.png / .jpg / .jpeg 等）；</p><p>8：WPS 文档；</p><p>0：未知文件类型。</p><p></p><p>支持的文件大小：</p><p>PDF/WORD/PPT支持150M且300页以内、EXCEL支持10M以内、TXT支持10M以内、图片文件支持70M以内。</p><p></p><p>默认值：1</p>
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>输出格式。</p><p>1：json格式</p><p>2：markdown格式</p><p>3：xml格式</p><p>9：json+markdown+xml格式</p><p></p><p>默认值：9</p> 
     * @return ResultType <p>输出格式。</p><p>1：json格式</p><p>2：markdown格式</p><p>3：xml格式</p><p>9：json+markdown+xml格式</p><p></p><p>默认值：9</p>
     */
    public Long getResultType() {
        return this.ResultType;
    }

    /**
     * Set <p>输出格式。</p><p>1：json格式</p><p>2：markdown格式</p><p>3：xml格式</p><p>9：json+markdown+xml格式</p><p></p><p>默认值：9</p>
     * @param ResultType <p>输出格式。</p><p>1：json格式</p><p>2：markdown格式</p><p>3：xml格式</p><p>9：json+markdown+xml格式</p><p></p><p>默认值：9</p>
     */
    public void setResultType(Long ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get <p>是否支持子图解析。</p><p></p><p>默认值：false</p> 
     * @return EnableSubImg <p>是否支持子图解析。</p><p></p><p>默认值：false</p>
     */
    public Boolean getEnableSubImg() {
        return this.EnableSubImg;
    }

    /**
     * Set <p>是否支持子图解析。</p><p></p><p>默认值：false</p>
     * @param EnableSubImg <p>是否支持子图解析。</p><p></p><p>默认值：false</p>
     */
    public void setEnableSubImg(Boolean EnableSubImg) {
        this.EnableSubImg = EnableSubImg;
    }

    /**
     * Get <p>需要识别的页码范围，单次调用最多支持300页。</p><p>参数格式：1-10</p> 
     * @return PageRange <p>需要识别的页码范围，单次调用最多支持300页。</p><p>参数格式：1-10</p>
     */
    public String getPageRange() {
        return this.PageRange;
    }

    /**
     * Set <p>需要识别的页码范围，单次调用最多支持300页。</p><p>参数格式：1-10</p>
     * @param PageRange <p>需要识别的页码范围，单次调用最多支持300页。</p><p>参数格式：1-10</p>
     */
    public void setPageRange(String PageRange) {
        this.PageRange = PageRange;
    }

    public MultimodalDocParseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultimodalDocParseRequest(MultimodalDocParseRequest source) {
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
        if (source.ResultType != null) {
            this.ResultType = new Long(source.ResultType);
        }
        if (source.EnableSubImg != null) {
            this.EnableSubImg = new Boolean(source.EnableSubImg);
        }
        if (source.PageRange != null) {
            this.PageRange = new String(source.PageRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "EnableSubImg", this.EnableSubImg);
        this.setParamSimple(map, prefix + "PageRange", this.PageRange);

    }
}

