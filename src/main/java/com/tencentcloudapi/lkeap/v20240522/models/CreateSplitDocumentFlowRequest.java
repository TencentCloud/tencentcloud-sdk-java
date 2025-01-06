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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSplitDocumentFlowRequest extends AbstractModel {

    /**
    * 文件类型。支持的文件类型：PDF、DOC、DOCX、XLS、XLSX、PPT、PPTX、MD、TXT、PNG、JPG、JPEG、CSV
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件的 Url 地址。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 文件名，可选，当文件名无法从传入的FileUrl获取时需要通过该字段来明确
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件的 Base64 值。支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
    */
    @SerializedName("FileBase64")
    @Expose
    private String FileBase64;

    /**
    * 当传入文件是PDF类型时，用来指定pdf识别的起始页码，识别的页码包含当前值
    */
    @SerializedName("FileStartPageNumber")
    @Expose
    private Long FileStartPageNumber;

    /**
    * 当传入文件是PDF类型时，用来指定pdf识别的结束页码，识别的页码包含当前值。
    */
    @SerializedName("FileEndPageNumber")
    @Expose
    private Long FileEndPageNumber;

    /**
    * 创建文档拆分任务配置信息创建文档解析任务配置信息		
    */
    @SerializedName("Config")
    @Expose
    private CreateSplitDocumentFlowConfig Config;

    /**
     * Get 文件类型。支持的文件类型：PDF、DOC、DOCX、XLS、XLSX、PPT、PPTX、MD、TXT、PNG、JPG、JPEG、CSV 
     * @return FileType 文件类型。支持的文件类型：PDF、DOC、DOCX、XLS、XLSX、PPT、PPTX、MD、TXT、PNG、JPG、JPEG、CSV
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型。支持的文件类型：PDF、DOC、DOCX、XLS、XLSX、PPT、PPTX、MD、TXT、PNG、JPG、JPEG、CSV
     * @param FileType 文件类型。支持的文件类型：PDF、DOC、DOCX、XLS、XLSX、PPT、PPTX、MD、TXT、PNG、JPG、JPEG、CSV
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件的 Url 地址。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return FileUrl 文件的 Url 地址。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件的 Url 地址。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param FileUrl 文件的 Url 地址。文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 文件名，可选，当文件名无法从传入的FileUrl获取时需要通过该字段来明确 
     * @return FileName 文件名，可选，当文件名无法从传入的FileUrl获取时需要通过该字段来明确
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名，可选，当文件名无法从传入的FileUrl获取时需要通过该字段来明确
     * @param FileName 文件名，可选，当文件名无法从传入的FileUrl获取时需要通过该字段来明确
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件的 Base64 值。支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。 
     * @return FileBase64 文件的 Base64 值。支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
     * @deprecated
     */
    @Deprecated
    public String getFileBase64() {
        return this.FileBase64;
    }

    /**
     * Set 文件的 Base64 值。支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
     * @param FileBase64 文件的 Base64 值。支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。支持的图片像素：单边介于20-10000px之间。文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
     * @deprecated
     */
    @Deprecated
    public void setFileBase64(String FileBase64) {
        this.FileBase64 = FileBase64;
    }

    /**
     * Get 当传入文件是PDF类型时，用来指定pdf识别的起始页码，识别的页码包含当前值 
     * @return FileStartPageNumber 当传入文件是PDF类型时，用来指定pdf识别的起始页码，识别的页码包含当前值
     */
    public Long getFileStartPageNumber() {
        return this.FileStartPageNumber;
    }

    /**
     * Set 当传入文件是PDF类型时，用来指定pdf识别的起始页码，识别的页码包含当前值
     * @param FileStartPageNumber 当传入文件是PDF类型时，用来指定pdf识别的起始页码，识别的页码包含当前值
     */
    public void setFileStartPageNumber(Long FileStartPageNumber) {
        this.FileStartPageNumber = FileStartPageNumber;
    }

    /**
     * Get 当传入文件是PDF类型时，用来指定pdf识别的结束页码，识别的页码包含当前值。 
     * @return FileEndPageNumber 当传入文件是PDF类型时，用来指定pdf识别的结束页码，识别的页码包含当前值。
     */
    public Long getFileEndPageNumber() {
        return this.FileEndPageNumber;
    }

    /**
     * Set 当传入文件是PDF类型时，用来指定pdf识别的结束页码，识别的页码包含当前值。
     * @param FileEndPageNumber 当传入文件是PDF类型时，用来指定pdf识别的结束页码，识别的页码包含当前值。
     */
    public void setFileEndPageNumber(Long FileEndPageNumber) {
        this.FileEndPageNumber = FileEndPageNumber;
    }

    /**
     * Get 创建文档拆分任务配置信息创建文档解析任务配置信息		 
     * @return Config 创建文档拆分任务配置信息创建文档解析任务配置信息		
     */
    public CreateSplitDocumentFlowConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 创建文档拆分任务配置信息创建文档解析任务配置信息		
     * @param Config 创建文档拆分任务配置信息创建文档解析任务配置信息		
     */
    public void setConfig(CreateSplitDocumentFlowConfig Config) {
        this.Config = Config;
    }

    public CreateSplitDocumentFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSplitDocumentFlowRequest(CreateSplitDocumentFlowRequest source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
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
            this.Config = new CreateSplitDocumentFlowConfig(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileBase64", this.FileBase64);
        this.setParamSimple(map, prefix + "FileStartPageNumber", this.FileStartPageNumber);
        this.setParamSimple(map, prefix + "FileEndPageNumber", this.FileEndPageNumber);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

