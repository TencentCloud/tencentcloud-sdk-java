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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReconstructDocumentSSERequest extends AbstractModel {

    /**
    * 支持解析的文件类型。**支持的文件类型**：WPS、PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、IM、PCX、PPM、TIFF、XBM、HEIF、JP2**支持的文件大小**：- WPS、PDF、DOC、DOCX、PPT、PPTX 支持100M- MD、TXT、XLS、XLSX、CSV 支持10M- 其他支持20M
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件的 URL 地址。文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 URL 速度和稳定性可能受一定影响。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
参考：[腾讯云COS文档](https://cloud.tencent.com/document/product/436/7749)

默认值：无
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 说明：文件的 Base64 值。
备注：支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。
支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。

默认值：无
    */
    @SerializedName("FileBase64")
    @Expose
    private String FileBase64;

    /**
    * 说明：文档的起始页码。
备注：当传入文件是PDF、PDF、PPT、PPTX、DOC类型时，用来指定识别的起始页码，识别的页码包含当前值。
默认值：无
    */
    @SerializedName("FileStartPageNumber")
    @Expose
    private Long FileStartPageNumber;

    /**
    * 说明：文档的结束页码。
备注：当传入文件是PDF、PDF、PPT、PPTX、DOC类型时，用来指定识别的结束页码，识别的页码包含当前值。
默认值：无
    */
    @SerializedName("FileEndPageNumber")
    @Expose
    private Long FileEndPageNumber;

    /**
    * 说明：文档解析配置信息	
备注：可设置返回markdown结果的格式
默认值：无

    */
    @SerializedName("Config")
    @Expose
    private ReconstructDocumentSSEConfig Config;

    /**
     * Get 支持解析的文件类型。**支持的文件类型**：WPS、PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、IM、PCX、PPM、TIFF、XBM、HEIF、JP2**支持的文件大小**：- WPS、PDF、DOC、DOCX、PPT、PPTX 支持100M- MD、TXT、XLS、XLSX、CSV 支持10M- 其他支持20M 
     * @return FileType 支持解析的文件类型。**支持的文件类型**：WPS、PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、IM、PCX、PPM、TIFF、XBM、HEIF、JP2**支持的文件大小**：- WPS、PDF、DOC、DOCX、PPT、PPTX 支持100M- MD、TXT、XLS、XLSX、CSV 支持10M- 其他支持20M
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 支持解析的文件类型。**支持的文件类型**：WPS、PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、IM、PCX、PPM、TIFF、XBM、HEIF、JP2**支持的文件大小**：- WPS、PDF、DOC、DOCX、PPT、PPTX 支持100M- MD、TXT、XLS、XLSX、CSV 支持10M- 其他支持20M
     * @param FileType 支持解析的文件类型。**支持的文件类型**：WPS、PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、IM、PCX、PPM、TIFF、XBM、HEIF、JP2**支持的文件大小**：- WPS、PDF、DOC、DOCX、PPT、PPTX 支持100M- MD、TXT、XLS、XLSX、CSV 支持10M- 其他支持20M
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件的 URL 地址。文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 URL 速度和稳定性可能受一定影响。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
参考：[腾讯云COS文档](https://cloud.tencent.com/document/product/436/7749)

默认值：无 
     * @return FileUrl 文件的 URL 地址。文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 URL 速度和稳定性可能受一定影响。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
参考：[腾讯云COS文档](https://cloud.tencent.com/document/product/436/7749)

默认值：无
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件的 URL 地址。文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 URL 速度和稳定性可能受一定影响。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
参考：[腾讯云COS文档](https://cloud.tencent.com/document/product/436/7749)

默认值：无
     * @param FileUrl 文件的 URL 地址。文件存储于腾讯云的 URL 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 URL 速度和稳定性可能受一定影响。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
参考：[腾讯云COS文档](https://cloud.tencent.com/document/product/436/7749)

默认值：无
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 说明：文件的 Base64 值。
备注：支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。
支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。

默认值：无 
     * @return FileBase64 说明：文件的 Base64 值。
备注：支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。
支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。

默认值：无
     */
    public String getFileBase64() {
        return this.FileBase64;
    }

    /**
     * Set 说明：文件的 Base64 值。
备注：支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。
支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。

默认值：无
     * @param FileBase64 说明：文件的 Base64 值。
备注：支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。
支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。

默认值：无
     */
    public void setFileBase64(String FileBase64) {
        this.FileBase64 = FileBase64;
    }

    /**
     * Get 说明：文档的起始页码。
备注：当传入文件是PDF、PDF、PPT、PPTX、DOC类型时，用来指定识别的起始页码，识别的页码包含当前值。
默认值：无 
     * @return FileStartPageNumber 说明：文档的起始页码。
备注：当传入文件是PDF、PDF、PPT、PPTX、DOC类型时，用来指定识别的起始页码，识别的页码包含当前值。
默认值：无
     */
    public Long getFileStartPageNumber() {
        return this.FileStartPageNumber;
    }

    /**
     * Set 说明：文档的起始页码。
备注：当传入文件是PDF、PDF、PPT、PPTX、DOC类型时，用来指定识别的起始页码，识别的页码包含当前值。
默认值：无
     * @param FileStartPageNumber 说明：文档的起始页码。
备注：当传入文件是PDF、PDF、PPT、PPTX、DOC类型时，用来指定识别的起始页码，识别的页码包含当前值。
默认值：无
     */
    public void setFileStartPageNumber(Long FileStartPageNumber) {
        this.FileStartPageNumber = FileStartPageNumber;
    }

    /**
     * Get 说明：文档的结束页码。
备注：当传入文件是PDF、PDF、PPT、PPTX、DOC类型时，用来指定识别的结束页码，识别的页码包含当前值。
默认值：无 
     * @return FileEndPageNumber 说明：文档的结束页码。
备注：当传入文件是PDF、PDF、PPT、PPTX、DOC类型时，用来指定识别的结束页码，识别的页码包含当前值。
默认值：无
     */
    public Long getFileEndPageNumber() {
        return this.FileEndPageNumber;
    }

    /**
     * Set 说明：文档的结束页码。
备注：当传入文件是PDF、PDF、PPT、PPTX、DOC类型时，用来指定识别的结束页码，识别的页码包含当前值。
默认值：无
     * @param FileEndPageNumber 说明：文档的结束页码。
备注：当传入文件是PDF、PDF、PPT、PPTX、DOC类型时，用来指定识别的结束页码，识别的页码包含当前值。
默认值：无
     */
    public void setFileEndPageNumber(Long FileEndPageNumber) {
        this.FileEndPageNumber = FileEndPageNumber;
    }

    /**
     * Get 说明：文档解析配置信息	
备注：可设置返回markdown结果的格式
默认值：无
 
     * @return Config 说明：文档解析配置信息	
备注：可设置返回markdown结果的格式
默认值：无

     */
    public ReconstructDocumentSSEConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 说明：文档解析配置信息	
备注：可设置返回markdown结果的格式
默认值：无

     * @param Config 说明：文档解析配置信息	
备注：可设置返回markdown结果的格式
默认值：无

     */
    public void setConfig(ReconstructDocumentSSEConfig Config) {
        this.Config = Config;
    }

    public ReconstructDocumentSSERequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconstructDocumentSSERequest(ReconstructDocumentSSERequest source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileBase64 != null) {
            this.FileBase64 = new String(source.FileBase64);
        }
        if (source.FileStartPageNumber != null) {
            this.FileStartPageNumber = new Long(source.FileStartPageNumber);
        }
        if (source.FileEndPageNumber != null) {
            this.FileEndPageNumber = new Long(source.FileEndPageNumber);
        }
        if (source.Config != null) {
            this.Config = new ReconstructDocumentSSEConfig(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileBase64", this.FileBase64);
        this.setParamSimple(map, prefix + "FileStartPageNumber", this.FileStartPageNumber);
        this.setParamSimple(map, prefix + "FileEndPageNumber", this.FileEndPageNumber);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

