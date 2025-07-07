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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReconstructDocumentRequest extends AbstractModel {

    /**
    * 文件的 Base64 值。 支持的文件格式：PNG、JPG、JPEG、PDF。 支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。 支持的图片像素：单边介于20-10000px之间。 文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
    */
    @SerializedName("FileBase64")
    @Expose
    private String FileBase64;

    /**
    * 文件的 Url 地址。 支持的文件格式：PNG、JPG、JPEG、PDF。 支持的文件大小：所下载文件经 Base64 编码后不超过 8M。文件下载时间不超过 3 秒。 支持的图片像素：单边介于20-10000px之间。 文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 当传入文件是PDF类型时，用来指定pdf识别的起始页码，识别的页码包含当前值。默认为1，表示从pdf文件的第1页开始识别。
    */
    @SerializedName("FileStartPageNumber")
    @Expose
    private Long FileStartPageNumber;

    /**
    * 当传入文件是PDF类型时，用来指定pdf识别的结束页码，识别的页码包含当前值。默认为10，表示识别到pdf文件的第10页。单次调用最多支持识别10页内容，即FileEndPageNumber-FileStartPageNumber需要不大于10。
    */
    @SerializedName("FileEndPageNumber")
    @Expose
    private Long FileEndPageNumber;

    /**
    * 配置选项，支持配置是否在生成的Markdown中是否嵌入图片
    */
    @SerializedName("Config")
    @Expose
    private ReconstructDocumentConfig Config;

    /**
     * Get 文件的 Base64 值。 支持的文件格式：PNG、JPG、JPEG、PDF。 支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。 支持的图片像素：单边介于20-10000px之间。 文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。 
     * @return FileBase64 文件的 Base64 值。 支持的文件格式：PNG、JPG、JPEG、PDF。 支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。 支持的图片像素：单边介于20-10000px之间。 文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
     */
    public String getFileBase64() {
        return this.FileBase64;
    }

    /**
     * Set 文件的 Base64 值。 支持的文件格式：PNG、JPG、JPEG、PDF。 支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。 支持的图片像素：单边介于20-10000px之间。 文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
     * @param FileBase64 文件的 Base64 值。 支持的文件格式：PNG、JPG、JPEG、PDF。 支持的文件大小：所下载文件经Base64编码后不超过 8M。文件下载时间不超过 3 秒。 支持的图片像素：单边介于20-10000px之间。 文件的 FileUrl、FileBase64 必须提供一个，如果都提供，只使用 FileUrl。
     */
    public void setFileBase64(String FileBase64) {
        this.FileBase64 = FileBase64;
    }

    /**
     * Get 文件的 Url 地址。 支持的文件格式：PNG、JPG、JPEG、PDF。 支持的文件大小：所下载文件经 Base64 编码后不超过 8M。文件下载时间不超过 3 秒。 支持的图片像素：单边介于20-10000px之间。 文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return FileUrl 文件的 Url 地址。 支持的文件格式：PNG、JPG、JPEG、PDF。 支持的文件大小：所下载文件经 Base64 编码后不超过 8M。文件下载时间不超过 3 秒。 支持的图片像素：单边介于20-10000px之间。 文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件的 Url 地址。 支持的文件格式：PNG、JPG、JPEG、PDF。 支持的文件大小：所下载文件经 Base64 编码后不超过 8M。文件下载时间不超过 3 秒。 支持的图片像素：单边介于20-10000px之间。 文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param FileUrl 文件的 Url 地址。 支持的文件格式：PNG、JPG、JPEG、PDF。 支持的文件大小：所下载文件经 Base64 编码后不超过 8M。文件下载时间不超过 3 秒。 支持的图片像素：单边介于20-10000px之间。 文件存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议文件存储于腾讯云。 非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 当传入文件是PDF类型时，用来指定pdf识别的起始页码，识别的页码包含当前值。默认为1，表示从pdf文件的第1页开始识别。 
     * @return FileStartPageNumber 当传入文件是PDF类型时，用来指定pdf识别的起始页码，识别的页码包含当前值。默认为1，表示从pdf文件的第1页开始识别。
     */
    public Long getFileStartPageNumber() {
        return this.FileStartPageNumber;
    }

    /**
     * Set 当传入文件是PDF类型时，用来指定pdf识别的起始页码，识别的页码包含当前值。默认为1，表示从pdf文件的第1页开始识别。
     * @param FileStartPageNumber 当传入文件是PDF类型时，用来指定pdf识别的起始页码，识别的页码包含当前值。默认为1，表示从pdf文件的第1页开始识别。
     */
    public void setFileStartPageNumber(Long FileStartPageNumber) {
        this.FileStartPageNumber = FileStartPageNumber;
    }

    /**
     * Get 当传入文件是PDF类型时，用来指定pdf识别的结束页码，识别的页码包含当前值。默认为10，表示识别到pdf文件的第10页。单次调用最多支持识别10页内容，即FileEndPageNumber-FileStartPageNumber需要不大于10。 
     * @return FileEndPageNumber 当传入文件是PDF类型时，用来指定pdf识别的结束页码，识别的页码包含当前值。默认为10，表示识别到pdf文件的第10页。单次调用最多支持识别10页内容，即FileEndPageNumber-FileStartPageNumber需要不大于10。
     */
    public Long getFileEndPageNumber() {
        return this.FileEndPageNumber;
    }

    /**
     * Set 当传入文件是PDF类型时，用来指定pdf识别的结束页码，识别的页码包含当前值。默认为10，表示识别到pdf文件的第10页。单次调用最多支持识别10页内容，即FileEndPageNumber-FileStartPageNumber需要不大于10。
     * @param FileEndPageNumber 当传入文件是PDF类型时，用来指定pdf识别的结束页码，识别的页码包含当前值。默认为10，表示识别到pdf文件的第10页。单次调用最多支持识别10页内容，即FileEndPageNumber-FileStartPageNumber需要不大于10。
     */
    public void setFileEndPageNumber(Long FileEndPageNumber) {
        this.FileEndPageNumber = FileEndPageNumber;
    }

    /**
     * Get 配置选项，支持配置是否在生成的Markdown中是否嵌入图片 
     * @return Config 配置选项，支持配置是否在生成的Markdown中是否嵌入图片
     */
    public ReconstructDocumentConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 配置选项，支持配置是否在生成的Markdown中是否嵌入图片
     * @param Config 配置选项，支持配置是否在生成的Markdown中是否嵌入图片
     */
    public void setConfig(ReconstructDocumentConfig Config) {
        this.Config = Config;
    }

    public ReconstructDocumentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconstructDocumentRequest(ReconstructDocumentRequest source) {
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
            this.Config = new ReconstructDocumentConfig(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileBase64", this.FileBase64);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileStartPageNumber", this.FileStartPageNumber);
        this.setParamSimple(map, prefix + "FileEndPageNumber", this.FileEndPageNumber);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

