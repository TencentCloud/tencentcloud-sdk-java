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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Document extends AbstractModel {

    /**
    * 支持的文件类型：PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、
XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、
IM、PCX、PPM、TIFF、XBM、HEIF、JP2

文档解析支持的文件大小：
-PDF、DOC、DOCX、PPT、PPTX支持100M
-MD、TXT、XLS、XLSX、CSV支特10M
-其他支持20M

文本切片支持的文件大小：
-PDF最大300M
-D0CX、D0C、PPT、PPTX最大200M
-TXT、MD最大10M
-其他最大20M
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，使用腾讯云COS 文件地址。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 文件的 base64 值，携带 MineType前缀信息。编码后的后的文件不超过 10M。
支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过3秒。
支持的图片像素：单边介于20-10000px之间。
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 文件名称，当使用 base64上传的时候使用。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文档的起始页码
    */
    @SerializedName("FileStartPageNumber")
    @Expose
    private Long FileStartPageNumber;

    /**
    * 文档的结束页码
    */
    @SerializedName("FileEndPageNumber")
    @Expose
    private Long FileEndPageNumber;

    /**
     * Get 支持的文件类型：PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、
XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、
IM、PCX、PPM、TIFF、XBM、HEIF、JP2

文档解析支持的文件大小：
-PDF、DOC、DOCX、PPT、PPTX支持100M
-MD、TXT、XLS、XLSX、CSV支特10M
-其他支持20M

文本切片支持的文件大小：
-PDF最大300M
-D0CX、D0C、PPT、PPTX最大200M
-TXT、MD最大10M
-其他最大20M 
     * @return FileType 支持的文件类型：PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、
XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、
IM、PCX、PPM、TIFF、XBM、HEIF、JP2

文档解析支持的文件大小：
-PDF、DOC、DOCX、PPT、PPTX支持100M
-MD、TXT、XLS、XLSX、CSV支特10M
-其他支持20M

文本切片支持的文件大小：
-PDF最大300M
-D0CX、D0C、PPT、PPTX最大200M
-TXT、MD最大10M
-其他最大20M
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 支持的文件类型：PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、
XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、
IM、PCX、PPM、TIFF、XBM、HEIF、JP2

文档解析支持的文件大小：
-PDF、DOC、DOCX、PPT、PPTX支持100M
-MD、TXT、XLS、XLSX、CSV支特10M
-其他支持20M

文本切片支持的文件大小：
-PDF最大300M
-D0CX、D0C、PPT、PPTX最大200M
-TXT、MD最大10M
-其他最大20M
     * @param FileType 支持的文件类型：PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、
XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、
IM、PCX、PPM、TIFF、XBM、HEIF、JP2

文档解析支持的文件大小：
-PDF、DOC、DOCX、PPT、PPTX支持100M
-MD、TXT、XLS、XLSX、CSV支特10M
-其他支持20M

文本切片支持的文件大小：
-PDF最大300M
-D0CX、D0C、PPT、PPTX最大200M
-TXT、MD最大10M
-其他最大20M
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，使用腾讯云COS 文件地址。 
     * @return FileUrl 文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，使用腾讯云COS 文件地址。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，使用腾讯云COS 文件地址。
     * @param FileUrl 文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，使用腾讯云COS 文件地址。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 文件的 base64 值，携带 MineType前缀信息。编码后的后的文件不超过 10M。
支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过3秒。
支持的图片像素：单边介于20-10000px之间。 
     * @return FileContent 文件的 base64 值，携带 MineType前缀信息。编码后的后的文件不超过 10M。
支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过3秒。
支持的图片像素：单边介于20-10000px之间。
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 文件的 base64 值，携带 MineType前缀信息。编码后的后的文件不超过 10M。
支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过3秒。
支持的图片像素：单边介于20-10000px之间。
     * @param FileContent 文件的 base64 值，携带 MineType前缀信息。编码后的后的文件不超过 10M。
支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过3秒。
支持的图片像素：单边介于20-10000px之间。
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 文件名称，当使用 base64上传的时候使用。 
     * @return FileName 文件名称，当使用 base64上传的时候使用。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称，当使用 base64上传的时候使用。
     * @param FileName 文件名称，当使用 base64上传的时候使用。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文档的起始页码 
     * @return FileStartPageNumber 文档的起始页码
     */
    public Long getFileStartPageNumber() {
        return this.FileStartPageNumber;
    }

    /**
     * Set 文档的起始页码
     * @param FileStartPageNumber 文档的起始页码
     */
    public void setFileStartPageNumber(Long FileStartPageNumber) {
        this.FileStartPageNumber = FileStartPageNumber;
    }

    /**
     * Get 文档的结束页码 
     * @return FileEndPageNumber 文档的结束页码
     */
    public Long getFileEndPageNumber() {
        return this.FileEndPageNumber;
    }

    /**
     * Set 文档的结束页码
     * @param FileEndPageNumber 文档的结束页码
     */
    public void setFileEndPageNumber(Long FileEndPageNumber) {
        this.FileEndPageNumber = FileEndPageNumber;
    }

    public Document() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Document(Document source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileStartPageNumber != null) {
            this.FileStartPageNumber = new Long(source.FileStartPageNumber);
        }
        if (source.FileEndPageNumber != null) {
            this.FileEndPageNumber = new Long(source.FileEndPageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileStartPageNumber", this.FileStartPageNumber);
        this.setParamSimple(map, prefix + "FileEndPageNumber", this.FileEndPageNumber);

    }
}

