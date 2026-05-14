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

public class SubmitExtractDocAgentJobRequest extends AbstractModel {

    /**
    * <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为前5页。</p>
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * <p>自定义抽取需要的字段名称、字段类型、字段提示词。</p>
    */
    @SerializedName("ItemNames")
    @Expose
    private ItemNames [] ItemNames;

    /**
    * <p>是否需要返回坐标，默认false。</p>
    */
    @SerializedName("EnableCoord")
    @Expose
    private Boolean EnableCoord;

    /**
    * <p>起始页</p>
    */
    @SerializedName("FileStartPageNumber")
    @Expose
    private Long FileStartPageNumber;

    /**
    * <p>结束页</p>
    */
    @SerializedName("FileEndPageNumber")
    @Expose
    private Long FileEndPageNumber;

    /**
    * <p>model_hunyuan:选择混元底座视觉大模型精调抽取任务  model_youtu：选择优图底座多模态大模型精调抽取任务</p>
    */
    @SerializedName("ModelConfig")
    @Expose
    private String ModelConfig;

    /**
     * Get <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p> 
     * @return ImageBase64 <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     * @param ImageBase64 <p>图片/PDF的 Base64 值。要求Base64不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p> 
     * @return ImageUrl <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     * @param ImageUrl <p>图片/PDF的 Url 地址。要求图片经Base64编码后不超过10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。图片下载时间不超过 3 秒。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为前5页。</p> 
     * @return PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为前5页。</p>
     * @deprecated
     */
    @Deprecated
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为前5页。</p>
     * @param PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为前5页。</p>
     * @deprecated
     */
    @Deprecated
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get <p>自定义抽取需要的字段名称、字段类型、字段提示词。</p> 
     * @return ItemNames <p>自定义抽取需要的字段名称、字段类型、字段提示词。</p>
     */
    public ItemNames [] getItemNames() {
        return this.ItemNames;
    }

    /**
     * Set <p>自定义抽取需要的字段名称、字段类型、字段提示词。</p>
     * @param ItemNames <p>自定义抽取需要的字段名称、字段类型、字段提示词。</p>
     */
    public void setItemNames(ItemNames [] ItemNames) {
        this.ItemNames = ItemNames;
    }

    /**
     * Get <p>是否需要返回坐标，默认false。</p> 
     * @return EnableCoord <p>是否需要返回坐标，默认false。</p>
     */
    public Boolean getEnableCoord() {
        return this.EnableCoord;
    }

    /**
     * Set <p>是否需要返回坐标，默认false。</p>
     * @param EnableCoord <p>是否需要返回坐标，默认false。</p>
     */
    public void setEnableCoord(Boolean EnableCoord) {
        this.EnableCoord = EnableCoord;
    }

    /**
     * Get <p>起始页</p> 
     * @return FileStartPageNumber <p>起始页</p>
     */
    public Long getFileStartPageNumber() {
        return this.FileStartPageNumber;
    }

    /**
     * Set <p>起始页</p>
     * @param FileStartPageNumber <p>起始页</p>
     */
    public void setFileStartPageNumber(Long FileStartPageNumber) {
        this.FileStartPageNumber = FileStartPageNumber;
    }

    /**
     * Get <p>结束页</p> 
     * @return FileEndPageNumber <p>结束页</p>
     */
    public Long getFileEndPageNumber() {
        return this.FileEndPageNumber;
    }

    /**
     * Set <p>结束页</p>
     * @param FileEndPageNumber <p>结束页</p>
     */
    public void setFileEndPageNumber(Long FileEndPageNumber) {
        this.FileEndPageNumber = FileEndPageNumber;
    }

    /**
     * Get <p>model_hunyuan:选择混元底座视觉大模型精调抽取任务  model_youtu：选择优图底座多模态大模型精调抽取任务</p> 
     * @return ModelConfig <p>model_hunyuan:选择混元底座视觉大模型精调抽取任务  model_youtu：选择优图底座多模态大模型精调抽取任务</p>
     */
    public String getModelConfig() {
        return this.ModelConfig;
    }

    /**
     * Set <p>model_hunyuan:选择混元底座视觉大模型精调抽取任务  model_youtu：选择优图底座多模态大模型精调抽取任务</p>
     * @param ModelConfig <p>model_hunyuan:选择混元底座视觉大模型精调抽取任务  model_youtu：选择优图底座多模态大模型精调抽取任务</p>
     */
    public void setModelConfig(String ModelConfig) {
        this.ModelConfig = ModelConfig;
    }

    public SubmitExtractDocAgentJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitExtractDocAgentJobRequest(SubmitExtractDocAgentJobRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.ItemNames != null) {
            this.ItemNames = new ItemNames[source.ItemNames.length];
            for (int i = 0; i < source.ItemNames.length; i++) {
                this.ItemNames[i] = new ItemNames(source.ItemNames[i]);
            }
        }
        if (source.EnableCoord != null) {
            this.EnableCoord = new Boolean(source.EnableCoord);
        }
        if (source.FileStartPageNumber != null) {
            this.FileStartPageNumber = new Long(source.FileStartPageNumber);
        }
        if (source.FileEndPageNumber != null) {
            this.FileEndPageNumber = new Long(source.FileEndPageNumber);
        }
        if (source.ModelConfig != null) {
            this.ModelConfig = new String(source.ModelConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamArrayObj(map, prefix + "ItemNames.", this.ItemNames);
        this.setParamSimple(map, prefix + "EnableCoord", this.EnableCoord);
        this.setParamSimple(map, prefix + "FileStartPageNumber", this.FileStartPageNumber);
        this.setParamSimple(map, prefix + "FileEndPageNumber", this.FileEndPageNumber);
        this.setParamSimple(map, prefix + "ModelConfig", this.ModelConfig);

    }
}

