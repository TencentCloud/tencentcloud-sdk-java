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

public class ExtractDocAgentRequest extends AbstractModel {

    /**
    * <p>图片/PDF的 Base64 值。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>图片/PDF的 Url 地址。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>自定义抽取需要的字段名称、字段类型、字段提示词。</p>
    */
    @SerializedName("ItemNames")
    @Expose
    private ItemNames [] ItemNames;

    /**
    * <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF时有效。</p>
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * <p>是否需要返回坐标</p><p>默认值：false</p>
    */
    @SerializedName("EnableCoord")
    @Expose
    private Boolean EnableCoord;

    /**
    * <p>是否需要开启审核逻辑(支持对字段配置比对内容和比对的语意规则)</p><p>默认值：false</p>
    */
    @SerializedName("EnableAudit")
    @Expose
    private Boolean EnableAudit;

    /**
     * Get <p>图片/PDF的 Base64 值。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p> 
     * @return ImageBase64 <p>图片/PDF的 Base64 值。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片/PDF的 Base64 值。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     * @param ImageBase64 <p>图片/PDF的 Base64 值。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>图片/PDF的 Url 地址。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p> 
     * @return ImageUrl <p>图片/PDF的 Url 地址。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片/PDF的 Url 地址。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     * @param ImageUrl <p>图片/PDF的 Url 地址。 要求图片/PDF经Base64编码后不超过 10M，分辨率建议600*800以上，支持PNG、JPG、JPEG、BMP、PDF格式。 图片支持的像素范围：需介于20-10000px之间。 图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
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
     * Get <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF时有效。</p> 
     * @return PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF时有效。</p>
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF时有效。</p>
     * @param PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF时有效。</p>
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get <p>是否需要返回坐标</p><p>默认值：false</p> 
     * @return EnableCoord <p>是否需要返回坐标</p><p>默认值：false</p>
     */
    public Boolean getEnableCoord() {
        return this.EnableCoord;
    }

    /**
     * Set <p>是否需要返回坐标</p><p>默认值：false</p>
     * @param EnableCoord <p>是否需要返回坐标</p><p>默认值：false</p>
     */
    public void setEnableCoord(Boolean EnableCoord) {
        this.EnableCoord = EnableCoord;
    }

    /**
     * Get <p>是否需要开启审核逻辑(支持对字段配置比对内容和比对的语意规则)</p><p>默认值：false</p> 
     * @return EnableAudit <p>是否需要开启审核逻辑(支持对字段配置比对内容和比对的语意规则)</p><p>默认值：false</p>
     */
    public Boolean getEnableAudit() {
        return this.EnableAudit;
    }

    /**
     * Set <p>是否需要开启审核逻辑(支持对字段配置比对内容和比对的语意规则)</p><p>默认值：false</p>
     * @param EnableAudit <p>是否需要开启审核逻辑(支持对字段配置比对内容和比对的语意规则)</p><p>默认值：false</p>
     */
    public void setEnableAudit(Boolean EnableAudit) {
        this.EnableAudit = EnableAudit;
    }

    public ExtractDocAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractDocAgentRequest(ExtractDocAgentRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ItemNames != null) {
            this.ItemNames = new ItemNames[source.ItemNames.length];
            for (int i = 0; i < source.ItemNames.length; i++) {
                this.ItemNames[i] = new ItemNames(source.ItemNames[i]);
            }
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.EnableCoord != null) {
            this.EnableCoord = new Boolean(source.EnableCoord);
        }
        if (source.EnableAudit != null) {
            this.EnableAudit = new Boolean(source.EnableAudit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamArrayObj(map, prefix + "ItemNames.", this.ItemNames);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamSimple(map, prefix + "EnableCoord", this.EnableCoord);
        this.setParamSimple(map, prefix + "EnableAudit", this.EnableAudit);

    }
}

