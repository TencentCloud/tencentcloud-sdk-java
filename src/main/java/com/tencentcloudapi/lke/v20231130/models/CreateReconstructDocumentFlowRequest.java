/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReconstructDocumentFlowRequest extends AbstractModel {

    /**
    * 文件类型。支持的文件类型：PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、IM、PCX、PPM、TIFF、XBM、HEIF、JP2。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件的 Base64 值。支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
    */
    @SerializedName("FileBase64")
    @Expose
    private String FileBase64;

    /**
    * <p>文件的Url地址。文件下载时间不超过15秒。支持的图片像素：单边介于20-10000px之间。文件存储于腾讯云的Url可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。所下载文件经 Base64 编码后不超过支持的文件大小：</p><table>  <tbody>    <tr>      <td>文件类型</td>      <td>支持的文件大小</td>    </tr>    <tr>      <td>PDF</td>      <td>200M</td>    </tr>    <tr>      <td>DOC</td>      <td>200M</td>    </tr>    <tr>      <td>DOCX</td>      <td>200M</td>    </tr>    <tr>      <td>PPT</td>      <td>200M</td>    </tr>    <tr>      <td>PPTX</td>      <td>200M</td>    </tr>    <tr>      <td>MD</td>      <td>10M</td>    </tr>    <tr>      <td>TXT</td>      <td>10M</td>    </tr>    <tr>      <td>XLS</td>      <td>20M</td>    </tr>    <tr>      <td>XLSX</td>      <td>20M</td>    </tr>    <tr>      <td>CSV</td>      <td>20M</td>    </tr>    <tr>      <td>PNG</td>      <td>20M</td>    </tr>    <tr>      <td>JPG</td>      <td>20M</td>    </tr>    <tr>      <td>JPEG</td>      <td>20M</td>    </tr>    <tr>      <td>BMP</td>      <td>20M</td>    </tr>    <tr>      <td>GIF</td>      <td>20M</td>    </tr>    <tr>      <td>WEBP</td>      <td>20M</td>    </tr>    <tr>      <td>HEIC</td>      <td>20M</td>    </tr>    <tr>      <td>EPS</td>      <td>20M</td>    </tr>    <tr>      <td>ICNS</td>      <td>20M</td>    </tr>    <tr>      <td>IM</td>      <td>20M</td>    </tr>    <tr>      <td>PCX</td>      <td>20M</td>    </tr>    <tr>      <td>PPM</td>      <td>20M</td>    </tr>    <tr>      <td>TIFF</td>      <td>20M</td>    </tr>    <tr>      <td>XBM</td>      <td>20M</td>    </tr>    <tr>      <td>HEIF</td>      <td>20M</td>    </tr>    <tr>      <td>JP2</td>      <td>20M</td>    </tr>  </tbody>  <colgroup>    <col>    <col>  </colgroup></table>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 当传入文件类型为PDF、DOC、DOCX、PPT、PPTX，用来指定文件识别的起始页码，识别的页码包含当前值。默认为1，表示从文件的第1页开始识别。
    */
    @SerializedName("FileStartPageNumber")
    @Expose
    private Long FileStartPageNumber;

    /**
    * 当传入文件类型为PDF、DOC、DOCX、PPT、PPTX，用来指定文件识别的结束页码，识别的页码包含当前值。默认为100，表示识别到文件的第100页。单次调用最多支持识别1000页内容，即FileEndPageNumber-FileStartPageNumber需要不大于1000。
    */
    @SerializedName("FileEndPageNumber")
    @Expose
    private Long FileEndPageNumber;

    /**
    * 创建文档解析任务配置信息。
    */
    @SerializedName("Config")
    @Expose
    private CreateReconstructDocumentFlowConfig Config;

    /**
     * Get 文件类型。支持的文件类型：PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、IM、PCX、PPM、TIFF、XBM、HEIF、JP2。 
     * @return FileType 文件类型。支持的文件类型：PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、IM、PCX、PPM、TIFF、XBM、HEIF、JP2。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型。支持的文件类型：PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、IM、PCX、PPM、TIFF、XBM、HEIF、JP2。
     * @param FileType 文件类型。支持的文件类型：PDF、DOC、DOCX、PPT、PPTX、MD、TXT、XLS、XLSX、CSV、PNG、JPG、JPEG、BMP、GIF、WEBP、HEIC、EPS、ICNS、IM、PCX、PPM、TIFF、XBM、HEIF、JP2。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件的 Base64 值。支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。 
     * @return FileBase64 文件的 Base64 值。支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
     */
    public String getFileBase64() {
        return this.FileBase64;
    }

    /**
     * Set 文件的 Base64 值。支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
     * @param FileBase64 文件的 Base64 值。支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
     */
    public void setFileBase64(String FileBase64) {
        this.FileBase64 = FileBase64;
    }

    /**
     * Get <p>文件的Url地址。文件下载时间不超过15秒。支持的图片像素：单边介于20-10000px之间。文件存储于腾讯云的Url可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。所下载文件经 Base64 编码后不超过支持的文件大小：</p><table>  <tbody>    <tr>      <td>文件类型</td>      <td>支持的文件大小</td>    </tr>    <tr>      <td>PDF</td>      <td>200M</td>    </tr>    <tr>      <td>DOC</td>      <td>200M</td>    </tr>    <tr>      <td>DOCX</td>      <td>200M</td>    </tr>    <tr>      <td>PPT</td>      <td>200M</td>    </tr>    <tr>      <td>PPTX</td>      <td>200M</td>    </tr>    <tr>      <td>MD</td>      <td>10M</td>    </tr>    <tr>      <td>TXT</td>      <td>10M</td>    </tr>    <tr>      <td>XLS</td>      <td>20M</td>    </tr>    <tr>      <td>XLSX</td>      <td>20M</td>    </tr>    <tr>      <td>CSV</td>      <td>20M</td>    </tr>    <tr>      <td>PNG</td>      <td>20M</td>    </tr>    <tr>      <td>JPG</td>      <td>20M</td>    </tr>    <tr>      <td>JPEG</td>      <td>20M</td>    </tr>    <tr>      <td>BMP</td>      <td>20M</td>    </tr>    <tr>      <td>GIF</td>      <td>20M</td>    </tr>    <tr>      <td>WEBP</td>      <td>20M</td>    </tr>    <tr>      <td>HEIC</td>      <td>20M</td>    </tr>    <tr>      <td>EPS</td>      <td>20M</td>    </tr>    <tr>      <td>ICNS</td>      <td>20M</td>    </tr>    <tr>      <td>IM</td>      <td>20M</td>    </tr>    <tr>      <td>PCX</td>      <td>20M</td>    </tr>    <tr>      <td>PPM</td>      <td>20M</td>    </tr>    <tr>      <td>TIFF</td>      <td>20M</td>    </tr>    <tr>      <td>XBM</td>      <td>20M</td>    </tr>    <tr>      <td>HEIF</td>      <td>20M</td>    </tr>    <tr>      <td>JP2</td>      <td>20M</td>    </tr>  </tbody>  <colgroup>    <col>    <col>  </colgroup></table> 
     * @return FileUrl <p>文件的Url地址。文件下载时间不超过15秒。支持的图片像素：单边介于20-10000px之间。文件存储于腾讯云的Url可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。所下载文件经 Base64 编码后不超过支持的文件大小：</p><table>  <tbody>    <tr>      <td>文件类型</td>      <td>支持的文件大小</td>    </tr>    <tr>      <td>PDF</td>      <td>200M</td>    </tr>    <tr>      <td>DOC</td>      <td>200M</td>    </tr>    <tr>      <td>DOCX</td>      <td>200M</td>    </tr>    <tr>      <td>PPT</td>      <td>200M</td>    </tr>    <tr>      <td>PPTX</td>      <td>200M</td>    </tr>    <tr>      <td>MD</td>      <td>10M</td>    </tr>    <tr>      <td>TXT</td>      <td>10M</td>    </tr>    <tr>      <td>XLS</td>      <td>20M</td>    </tr>    <tr>      <td>XLSX</td>      <td>20M</td>    </tr>    <tr>      <td>CSV</td>      <td>20M</td>    </tr>    <tr>      <td>PNG</td>      <td>20M</td>    </tr>    <tr>      <td>JPG</td>      <td>20M</td>    </tr>    <tr>      <td>JPEG</td>      <td>20M</td>    </tr>    <tr>      <td>BMP</td>      <td>20M</td>    </tr>    <tr>      <td>GIF</td>      <td>20M</td>    </tr>    <tr>      <td>WEBP</td>      <td>20M</td>    </tr>    <tr>      <td>HEIC</td>      <td>20M</td>    </tr>    <tr>      <td>EPS</td>      <td>20M</td>    </tr>    <tr>      <td>ICNS</td>      <td>20M</td>    </tr>    <tr>      <td>IM</td>      <td>20M</td>    </tr>    <tr>      <td>PCX</td>      <td>20M</td>    </tr>    <tr>      <td>PPM</td>      <td>20M</td>    </tr>    <tr>      <td>TIFF</td>      <td>20M</td>    </tr>    <tr>      <td>XBM</td>      <td>20M</td>    </tr>    <tr>      <td>HEIF</td>      <td>20M</td>    </tr>    <tr>      <td>JP2</td>      <td>20M</td>    </tr>  </tbody>  <colgroup>    <col>    <col>  </colgroup></table>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>文件的Url地址。文件下载时间不超过15秒。支持的图片像素：单边介于20-10000px之间。文件存储于腾讯云的Url可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。所下载文件经 Base64 编码后不超过支持的文件大小：</p><table>  <tbody>    <tr>      <td>文件类型</td>      <td>支持的文件大小</td>    </tr>    <tr>      <td>PDF</td>      <td>200M</td>    </tr>    <tr>      <td>DOC</td>      <td>200M</td>    </tr>    <tr>      <td>DOCX</td>      <td>200M</td>    </tr>    <tr>      <td>PPT</td>      <td>200M</td>    </tr>    <tr>      <td>PPTX</td>      <td>200M</td>    </tr>    <tr>      <td>MD</td>      <td>10M</td>    </tr>    <tr>      <td>TXT</td>      <td>10M</td>    </tr>    <tr>      <td>XLS</td>      <td>20M</td>    </tr>    <tr>      <td>XLSX</td>      <td>20M</td>    </tr>    <tr>      <td>CSV</td>      <td>20M</td>    </tr>    <tr>      <td>PNG</td>      <td>20M</td>    </tr>    <tr>      <td>JPG</td>      <td>20M</td>    </tr>    <tr>      <td>JPEG</td>      <td>20M</td>    </tr>    <tr>      <td>BMP</td>      <td>20M</td>    </tr>    <tr>      <td>GIF</td>      <td>20M</td>    </tr>    <tr>      <td>WEBP</td>      <td>20M</td>    </tr>    <tr>      <td>HEIC</td>      <td>20M</td>    </tr>    <tr>      <td>EPS</td>      <td>20M</td>    </tr>    <tr>      <td>ICNS</td>      <td>20M</td>    </tr>    <tr>      <td>IM</td>      <td>20M</td>    </tr>    <tr>      <td>PCX</td>      <td>20M</td>    </tr>    <tr>      <td>PPM</td>      <td>20M</td>    </tr>    <tr>      <td>TIFF</td>      <td>20M</td>    </tr>    <tr>      <td>XBM</td>      <td>20M</td>    </tr>    <tr>      <td>HEIF</td>      <td>20M</td>    </tr>    <tr>      <td>JP2</td>      <td>20M</td>    </tr>  </tbody>  <colgroup>    <col>    <col>  </colgroup></table>
     * @param FileUrl <p>文件的Url地址。文件下载时间不超过15秒。支持的图片像素：单边介于20-10000px之间。文件存储于腾讯云的Url可保障更高的下载速度和稳定性，建议文件存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。所下载文件经 Base64 编码后不超过支持的文件大小：</p><table>  <tbody>    <tr>      <td>文件类型</td>      <td>支持的文件大小</td>    </tr>    <tr>      <td>PDF</td>      <td>200M</td>    </tr>    <tr>      <td>DOC</td>      <td>200M</td>    </tr>    <tr>      <td>DOCX</td>      <td>200M</td>    </tr>    <tr>      <td>PPT</td>      <td>200M</td>    </tr>    <tr>      <td>PPTX</td>      <td>200M</td>    </tr>    <tr>      <td>MD</td>      <td>10M</td>    </tr>    <tr>      <td>TXT</td>      <td>10M</td>    </tr>    <tr>      <td>XLS</td>      <td>20M</td>    </tr>    <tr>      <td>XLSX</td>      <td>20M</td>    </tr>    <tr>      <td>CSV</td>      <td>20M</td>    </tr>    <tr>      <td>PNG</td>      <td>20M</td>    </tr>    <tr>      <td>JPG</td>      <td>20M</td>    </tr>    <tr>      <td>JPEG</td>      <td>20M</td>    </tr>    <tr>      <td>BMP</td>      <td>20M</td>    </tr>    <tr>      <td>GIF</td>      <td>20M</td>    </tr>    <tr>      <td>WEBP</td>      <td>20M</td>    </tr>    <tr>      <td>HEIC</td>      <td>20M</td>    </tr>    <tr>      <td>EPS</td>      <td>20M</td>    </tr>    <tr>      <td>ICNS</td>      <td>20M</td>    </tr>    <tr>      <td>IM</td>      <td>20M</td>    </tr>    <tr>      <td>PCX</td>      <td>20M</td>    </tr>    <tr>      <td>PPM</td>      <td>20M</td>    </tr>    <tr>      <td>TIFF</td>      <td>20M</td>    </tr>    <tr>      <td>XBM</td>      <td>20M</td>    </tr>    <tr>      <td>HEIF</td>      <td>20M</td>    </tr>    <tr>      <td>JP2</td>      <td>20M</td>    </tr>  </tbody>  <colgroup>    <col>    <col>  </colgroup></table>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 当传入文件类型为PDF、DOC、DOCX、PPT、PPTX，用来指定文件识别的起始页码，识别的页码包含当前值。默认为1，表示从文件的第1页开始识别。 
     * @return FileStartPageNumber 当传入文件类型为PDF、DOC、DOCX、PPT、PPTX，用来指定文件识别的起始页码，识别的页码包含当前值。默认为1，表示从文件的第1页开始识别。
     */
    public Long getFileStartPageNumber() {
        return this.FileStartPageNumber;
    }

    /**
     * Set 当传入文件类型为PDF、DOC、DOCX、PPT、PPTX，用来指定文件识别的起始页码，识别的页码包含当前值。默认为1，表示从文件的第1页开始识别。
     * @param FileStartPageNumber 当传入文件类型为PDF、DOC、DOCX、PPT、PPTX，用来指定文件识别的起始页码，识别的页码包含当前值。默认为1，表示从文件的第1页开始识别。
     */
    public void setFileStartPageNumber(Long FileStartPageNumber) {
        this.FileStartPageNumber = FileStartPageNumber;
    }

    /**
     * Get 当传入文件类型为PDF、DOC、DOCX、PPT、PPTX，用来指定文件识别的结束页码，识别的页码包含当前值。默认为100，表示识别到文件的第100页。单次调用最多支持识别1000页内容，即FileEndPageNumber-FileStartPageNumber需要不大于1000。 
     * @return FileEndPageNumber 当传入文件类型为PDF、DOC、DOCX、PPT、PPTX，用来指定文件识别的结束页码，识别的页码包含当前值。默认为100，表示识别到文件的第100页。单次调用最多支持识别1000页内容，即FileEndPageNumber-FileStartPageNumber需要不大于1000。
     */
    public Long getFileEndPageNumber() {
        return this.FileEndPageNumber;
    }

    /**
     * Set 当传入文件类型为PDF、DOC、DOCX、PPT、PPTX，用来指定文件识别的结束页码，识别的页码包含当前值。默认为100，表示识别到文件的第100页。单次调用最多支持识别1000页内容，即FileEndPageNumber-FileStartPageNumber需要不大于1000。
     * @param FileEndPageNumber 当传入文件类型为PDF、DOC、DOCX、PPT、PPTX，用来指定文件识别的结束页码，识别的页码包含当前值。默认为100，表示识别到文件的第100页。单次调用最多支持识别1000页内容，即FileEndPageNumber-FileStartPageNumber需要不大于1000。
     */
    public void setFileEndPageNumber(Long FileEndPageNumber) {
        this.FileEndPageNumber = FileEndPageNumber;
    }

    /**
     * Get 创建文档解析任务配置信息。 
     * @return Config 创建文档解析任务配置信息。
     */
    public CreateReconstructDocumentFlowConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 创建文档解析任务配置信息。
     * @param Config 创建文档解析任务配置信息。
     */
    public void setConfig(CreateReconstructDocumentFlowConfig Config) {
        this.Config = Config;
    }

    public CreateReconstructDocumentFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReconstructDocumentFlowRequest(CreateReconstructDocumentFlowRequest source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileBase64 != null) {
            this.FileBase64 = new String(source.FileBase64);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileStartPageNumber != null) {
            this.FileStartPageNumber = new Long(source.FileStartPageNumber);
        }
        if (source.FileEndPageNumber != null) {
            this.FileEndPageNumber = new Long(source.FileEndPageNumber);
        }
        if (source.Config != null) {
            this.Config = new CreateReconstructDocumentFlowConfig(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileBase64", this.FileBase64);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileStartPageNumber", this.FileStartPageNumber);
        this.setParamSimple(map, prefix + "FileEndPageNumber", this.FileEndPageNumber);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

