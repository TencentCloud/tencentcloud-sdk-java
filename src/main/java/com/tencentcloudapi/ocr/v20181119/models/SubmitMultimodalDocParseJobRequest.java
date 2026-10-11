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

public class SubmitMultimodalDocParseJobRequest extends AbstractModel {

    /**
    * <p>支持解析的文件类型。取值：</p><ul><li>1：PDF 文档</li><li>2：Word 文档（.doc/.docx）</li><li>3：PPT 演示文稿（.ppt/.pptx）</li><li>4：Excel 表格（.xls/.xlsx）</li><li>5：Markdown 文档（.md）</li><li>6：纯文本文件（.txt）</li><li>7：图片文件（.png/.jpg/.jpeg 等）</li><li>8：WPS 文档<br>支持的文件大小：PDF/WORD/PPT 支持 150M 且 300 页。</li></ul>
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
    * <p>文件的 Url 地址，支持 FileType 参数对应的文件格式及大小。文件下载时间不超过 3 秒。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>文件的 Base64 值。支持 FileType 参数对应的文件格式，支持的文件大小不超过 8M。文件下载时间不超过 3 秒。<br>文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。</p>
    */
    @SerializedName("FileBase64")
    @Expose
    private String FileBase64;

    /**
    * <p>输出格式。<br>1：json格式<br>2：markdown格式<br>3：xml格式<br>9：json+markdown+xml格式</p>
    */
    @SerializedName("ResultType")
    @Expose
    private Long ResultType;

    /**
    * <p>是否开启子图提取，默认为 false。</p>
    */
    @SerializedName("EnableSubImg")
    @Expose
    private Boolean EnableSubImg;

    /**
    * <p>文档的起始页码。用来指定识别的起始页码，识别的页码包含当前值，不填时默认从文档第一页开始解析。本参数与 FileEndPageNumber 可分开填写，也可只填其中一个。</p>
    */
    @SerializedName("FileStartPageNumber")
    @Expose
    private Long FileStartPageNumber;

    /**
    * <p>文档的结束页码。用来指定识别的结束页码，识别的页码包含当前值，不填时默认解析到文档最后一页。本参数与 FileStartPageNumber 可分开填写，也可只填其中一个。</p>
    */
    @SerializedName("FileEndPageNumber")
    @Expose
    private Long FileEndPageNumber;

    /**
    * <p>任务类型，默认为 0。取值：</p><ul><li>0：默认</li><li>1：Free OCR</li><li>2：OCR</li><li>3：表格识别</li><li>4：代码识别</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get <p>支持解析的文件类型。取值：</p><ul><li>1：PDF 文档</li><li>2：Word 文档（.doc/.docx）</li><li>3：PPT 演示文稿（.ppt/.pptx）</li><li>4：Excel 表格（.xls/.xlsx）</li><li>5：Markdown 文档（.md）</li><li>6：纯文本文件（.txt）</li><li>7：图片文件（.png/.jpg/.jpeg 等）</li><li>8：WPS 文档<br>支持的文件大小：PDF/WORD/PPT 支持 150M 且 300 页。</li></ul> 
     * @return FileType <p>支持解析的文件类型。取值：</p><ul><li>1：PDF 文档</li><li>2：Word 文档（.doc/.docx）</li><li>3：PPT 演示文稿（.ppt/.pptx）</li><li>4：Excel 表格（.xls/.xlsx）</li><li>5：Markdown 文档（.md）</li><li>6：纯文本文件（.txt）</li><li>7：图片文件（.png/.jpg/.jpeg 等）</li><li>8：WPS 文档<br>支持的文件大小：PDF/WORD/PPT 支持 150M 且 300 页。</li></ul>
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>支持解析的文件类型。取值：</p><ul><li>1：PDF 文档</li><li>2：Word 文档（.doc/.docx）</li><li>3：PPT 演示文稿（.ppt/.pptx）</li><li>4：Excel 表格（.xls/.xlsx）</li><li>5：Markdown 文档（.md）</li><li>6：纯文本文件（.txt）</li><li>7：图片文件（.png/.jpg/.jpeg 等）</li><li>8：WPS 文档<br>支持的文件大小：PDF/WORD/PPT 支持 150M 且 300 页。</li></ul>
     * @param FileType <p>支持解析的文件类型。取值：</p><ul><li>1：PDF 文档</li><li>2：Word 文档（.doc/.docx）</li><li>3：PPT 演示文稿（.ppt/.pptx）</li><li>4：Excel 表格（.xls/.xlsx）</li><li>5：Markdown 文档（.md）</li><li>6：纯文本文件（.txt）</li><li>7：图片文件（.png/.jpg/.jpeg 等）</li><li>8：WPS 文档<br>支持的文件大小：PDF/WORD/PPT 支持 150M 且 300 页。</li></ul>
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>文件的 Url 地址，支持 FileType 参数对应的文件格式及大小。文件下载时间不超过 3 秒。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p> 
     * @return FileUrl <p>文件的 Url 地址，支持 FileType 参数对应的文件格式及大小。文件下载时间不超过 3 秒。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>文件的 Url 地址，支持 FileType 参数对应的文件格式及大小。文件下载时间不超过 3 秒。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     * @param FileUrl <p>文件的 Url 地址，支持 FileType 参数对应的文件格式及大小。文件下载时间不超过 3 秒。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>文件的 Base64 值。支持 FileType 参数对应的文件格式，支持的文件大小不超过 8M。文件下载时间不超过 3 秒。<br>文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。</p> 
     * @return FileBase64 <p>文件的 Base64 值。支持 FileType 参数对应的文件格式，支持的文件大小不超过 8M。文件下载时间不超过 3 秒。<br>文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。</p>
     */
    public String getFileBase64() {
        return this.FileBase64;
    }

    /**
     * Set <p>文件的 Base64 值。支持 FileType 参数对应的文件格式，支持的文件大小不超过 8M。文件下载时间不超过 3 秒。<br>文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。</p>
     * @param FileBase64 <p>文件的 Base64 值。支持 FileType 参数对应的文件格式，支持的文件大小不超过 8M。文件下载时间不超过 3 秒。<br>文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。</p>
     */
    public void setFileBase64(String FileBase64) {
        this.FileBase64 = FileBase64;
    }

    /**
     * Get <p>输出格式。<br>1：json格式<br>2：markdown格式<br>3：xml格式<br>9：json+markdown+xml格式</p> 
     * @return ResultType <p>输出格式。<br>1：json格式<br>2：markdown格式<br>3：xml格式<br>9：json+markdown+xml格式</p>
     */
    public Long getResultType() {
        return this.ResultType;
    }

    /**
     * Set <p>输出格式。<br>1：json格式<br>2：markdown格式<br>3：xml格式<br>9：json+markdown+xml格式</p>
     * @param ResultType <p>输出格式。<br>1：json格式<br>2：markdown格式<br>3：xml格式<br>9：json+markdown+xml格式</p>
     */
    public void setResultType(Long ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get <p>是否开启子图提取，默认为 false。</p> 
     * @return EnableSubImg <p>是否开启子图提取，默认为 false。</p>
     */
    public Boolean getEnableSubImg() {
        return this.EnableSubImg;
    }

    /**
     * Set <p>是否开启子图提取，默认为 false。</p>
     * @param EnableSubImg <p>是否开启子图提取，默认为 false。</p>
     */
    public void setEnableSubImg(Boolean EnableSubImg) {
        this.EnableSubImg = EnableSubImg;
    }

    /**
     * Get <p>文档的起始页码。用来指定识别的起始页码，识别的页码包含当前值，不填时默认从文档第一页开始解析。本参数与 FileEndPageNumber 可分开填写，也可只填其中一个。</p> 
     * @return FileStartPageNumber <p>文档的起始页码。用来指定识别的起始页码，识别的页码包含当前值，不填时默认从文档第一页开始解析。本参数与 FileEndPageNumber 可分开填写，也可只填其中一个。</p>
     */
    public Long getFileStartPageNumber() {
        return this.FileStartPageNumber;
    }

    /**
     * Set <p>文档的起始页码。用来指定识别的起始页码，识别的页码包含当前值，不填时默认从文档第一页开始解析。本参数与 FileEndPageNumber 可分开填写，也可只填其中一个。</p>
     * @param FileStartPageNumber <p>文档的起始页码。用来指定识别的起始页码，识别的页码包含当前值，不填时默认从文档第一页开始解析。本参数与 FileEndPageNumber 可分开填写，也可只填其中一个。</p>
     */
    public void setFileStartPageNumber(Long FileStartPageNumber) {
        this.FileStartPageNumber = FileStartPageNumber;
    }

    /**
     * Get <p>文档的结束页码。用来指定识别的结束页码，识别的页码包含当前值，不填时默认解析到文档最后一页。本参数与 FileStartPageNumber 可分开填写，也可只填其中一个。</p> 
     * @return FileEndPageNumber <p>文档的结束页码。用来指定识别的结束页码，识别的页码包含当前值，不填时默认解析到文档最后一页。本参数与 FileStartPageNumber 可分开填写，也可只填其中一个。</p>
     */
    public Long getFileEndPageNumber() {
        return this.FileEndPageNumber;
    }

    /**
     * Set <p>文档的结束页码。用来指定识别的结束页码，识别的页码包含当前值，不填时默认解析到文档最后一页。本参数与 FileStartPageNumber 可分开填写，也可只填其中一个。</p>
     * @param FileEndPageNumber <p>文档的结束页码。用来指定识别的结束页码，识别的页码包含当前值，不填时默认解析到文档最后一页。本参数与 FileStartPageNumber 可分开填写，也可只填其中一个。</p>
     */
    public void setFileEndPageNumber(Long FileEndPageNumber) {
        this.FileEndPageNumber = FileEndPageNumber;
    }

    /**
     * Get <p>任务类型，默认为 0。取值：</p><ul><li>0：默认</li><li>1：Free OCR</li><li>2：OCR</li><li>3：表格识别</li><li>4：代码识别</li></ul> 
     * @return TaskType <p>任务类型，默认为 0。取值：</p><ul><li>0：默认</li><li>1：Free OCR</li><li>2：OCR</li><li>3：表格识别</li><li>4：代码识别</li></ul>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型，默认为 0。取值：</p><ul><li>0：默认</li><li>1：Free OCR</li><li>2：OCR</li><li>3：表格识别</li><li>4：代码识别</li></ul>
     * @param TaskType <p>任务类型，默认为 0。取值：</p><ul><li>0：默认</li><li>1：Free OCR</li><li>2：OCR</li><li>3：表格识别</li><li>4：代码识别</li></ul>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public SubmitMultimodalDocParseJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitMultimodalDocParseJobRequest(SubmitMultimodalDocParseJobRequest source) {
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileBase64 != null) {
            this.FileBase64 = new String(source.FileBase64);
        }
        if (source.ResultType != null) {
            this.ResultType = new Long(source.ResultType);
        }
        if (source.EnableSubImg != null) {
            this.EnableSubImg = new Boolean(source.EnableSubImg);
        }
        if (source.FileStartPageNumber != null) {
            this.FileStartPageNumber = new Long(source.FileStartPageNumber);
        }
        if (source.FileEndPageNumber != null) {
            this.FileEndPageNumber = new Long(source.FileEndPageNumber);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileBase64", this.FileBase64);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "EnableSubImg", this.EnableSubImg);
        this.setParamSimple(map, prefix + "FileStartPageNumber", this.FileStartPageNumber);
        this.setParamSimple(map, prefix + "FileEndPageNumber", this.FileEndPageNumber);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

