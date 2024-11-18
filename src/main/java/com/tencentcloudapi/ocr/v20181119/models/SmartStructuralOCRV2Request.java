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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartStructuralOCRV2Request extends AbstractModel {

    /**
    * 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。
    */
    @SerializedName("IsPdf")
    @Expose
    private Boolean IsPdf;

    /**
    * 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
    * 自定义结构化功能需返回的字段名称，例：
若客户只想返回姓名、性别两个字段的识别结果，则输入
ItemNames=["姓名","性别"]
    */
    @SerializedName("ItemNames")
    @Expose
    private String [] ItemNames;

    /**
    * 是否开启全文字段识别
    */
    @SerializedName("ReturnFullText")
    @Expose
    private Boolean ReturnFullText;

    /**
    * 配置id支持：
General -- 通用场景
OnlineTaxiItinerary -- 网约车行程单
RideHailingDriverLicense -- 网约车驾驶证
RideHailingTransportLicense -- 网约车运输证
WayBill -- 快递运单
AccountOpeningPermit -- 银行开户许可证
InvoiceEng -- 海外发票模版
Coin --钱币识别模板
OnboardingDocuments -- 入职材料识别
PropertyOwnershipCertificate -- 房产证识别
RealEstateCertificate --不动产权证识别
HouseEncumbranceCertificate -- 他权证识别
CarInsurance -- 车险保单
MultiRealEstateCertificate -- 房产证、不动产证、产权证等材料合一模板
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 是否打开印章识别
    */
    @SerializedName("EnableSealRecognize")
    @Expose
    private Boolean EnableSealRecognize;

    /**
     * Get 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return ImageUrl 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param ImageUrl 图片的 Url 地址。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经 Base64 编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageBase64 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageBase64 图片的 Base64 值。支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。支持的图片大小：所下载图片经Base64编码后不超过 10M。图片下载时间不超过 3 秒。支持的图片像素：需介于20-10000px之间。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。 
     * @return IsPdf 是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。
     */
    public Boolean getIsPdf() {
        return this.IsPdf;
    }

    /**
     * Set 是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。
     * @param IsPdf 是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。
     */
    public void setIsPdf(Boolean IsPdf) {
        this.IsPdf = IsPdf;
    }

    /**
     * Get 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。 
     * @return PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。
     * @param PdfPageNumber 需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    /**
     * Get 自定义结构化功能需返回的字段名称，例：
若客户只想返回姓名、性别两个字段的识别结果，则输入
ItemNames=["姓名","性别"] 
     * @return ItemNames 自定义结构化功能需返回的字段名称，例：
若客户只想返回姓名、性别两个字段的识别结果，则输入
ItemNames=["姓名","性别"]
     */
    public String [] getItemNames() {
        return this.ItemNames;
    }

    /**
     * Set 自定义结构化功能需返回的字段名称，例：
若客户只想返回姓名、性别两个字段的识别结果，则输入
ItemNames=["姓名","性别"]
     * @param ItemNames 自定义结构化功能需返回的字段名称，例：
若客户只想返回姓名、性别两个字段的识别结果，则输入
ItemNames=["姓名","性别"]
     */
    public void setItemNames(String [] ItemNames) {
        this.ItemNames = ItemNames;
    }

    /**
     * Get 是否开启全文字段识别 
     * @return ReturnFullText 是否开启全文字段识别
     */
    public Boolean getReturnFullText() {
        return this.ReturnFullText;
    }

    /**
     * Set 是否开启全文字段识别
     * @param ReturnFullText 是否开启全文字段识别
     */
    public void setReturnFullText(Boolean ReturnFullText) {
        this.ReturnFullText = ReturnFullText;
    }

    /**
     * Get 配置id支持：
General -- 通用场景
OnlineTaxiItinerary -- 网约车行程单
RideHailingDriverLicense -- 网约车驾驶证
RideHailingTransportLicense -- 网约车运输证
WayBill -- 快递运单
AccountOpeningPermit -- 银行开户许可证
InvoiceEng -- 海外发票模版
Coin --钱币识别模板
OnboardingDocuments -- 入职材料识别
PropertyOwnershipCertificate -- 房产证识别
RealEstateCertificate --不动产权证识别
HouseEncumbranceCertificate -- 他权证识别
CarInsurance -- 车险保单
MultiRealEstateCertificate -- 房产证、不动产证、产权证等材料合一模板 
     * @return ConfigId 配置id支持：
General -- 通用场景
OnlineTaxiItinerary -- 网约车行程单
RideHailingDriverLicense -- 网约车驾驶证
RideHailingTransportLicense -- 网约车运输证
WayBill -- 快递运单
AccountOpeningPermit -- 银行开户许可证
InvoiceEng -- 海外发票模版
Coin --钱币识别模板
OnboardingDocuments -- 入职材料识别
PropertyOwnershipCertificate -- 房产证识别
RealEstateCertificate --不动产权证识别
HouseEncumbranceCertificate -- 他权证识别
CarInsurance -- 车险保单
MultiRealEstateCertificate -- 房产证、不动产证、产权证等材料合一模板
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置id支持：
General -- 通用场景
OnlineTaxiItinerary -- 网约车行程单
RideHailingDriverLicense -- 网约车驾驶证
RideHailingTransportLicense -- 网约车运输证
WayBill -- 快递运单
AccountOpeningPermit -- 银行开户许可证
InvoiceEng -- 海外发票模版
Coin --钱币识别模板
OnboardingDocuments -- 入职材料识别
PropertyOwnershipCertificate -- 房产证识别
RealEstateCertificate --不动产权证识别
HouseEncumbranceCertificate -- 他权证识别
CarInsurance -- 车险保单
MultiRealEstateCertificate -- 房产证、不动产证、产权证等材料合一模板
     * @param ConfigId 配置id支持：
General -- 通用场景
OnlineTaxiItinerary -- 网约车行程单
RideHailingDriverLicense -- 网约车驾驶证
RideHailingTransportLicense -- 网约车运输证
WayBill -- 快递运单
AccountOpeningPermit -- 银行开户许可证
InvoiceEng -- 海外发票模版
Coin --钱币识别模板
OnboardingDocuments -- 入职材料识别
PropertyOwnershipCertificate -- 房产证识别
RealEstateCertificate --不动产权证识别
HouseEncumbranceCertificate -- 他权证识别
CarInsurance -- 车险保单
MultiRealEstateCertificate -- 房产证、不动产证、产权证等材料合一模板
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 是否打开印章识别 
     * @return EnableSealRecognize 是否打开印章识别
     */
    public Boolean getEnableSealRecognize() {
        return this.EnableSealRecognize;
    }

    /**
     * Set 是否打开印章识别
     * @param EnableSealRecognize 是否打开印章识别
     */
    public void setEnableSealRecognize(Boolean EnableSealRecognize) {
        this.EnableSealRecognize = EnableSealRecognize;
    }

    public SmartStructuralOCRV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartStructuralOCRV2Request(SmartStructuralOCRV2Request source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.IsPdf != null) {
            this.IsPdf = new Boolean(source.IsPdf);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
        if (source.ItemNames != null) {
            this.ItemNames = new String[source.ItemNames.length];
            for (int i = 0; i < source.ItemNames.length; i++) {
                this.ItemNames[i] = new String(source.ItemNames[i]);
            }
        }
        if (source.ReturnFullText != null) {
            this.ReturnFullText = new Boolean(source.ReturnFullText);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.EnableSealRecognize != null) {
            this.EnableSealRecognize = new Boolean(source.EnableSealRecognize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "IsPdf", this.IsPdf);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);
        this.setParamArraySimple(map, prefix + "ItemNames.", this.ItemNames);
        this.setParamSimple(map, prefix + "ReturnFullText", this.ReturnFullText);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "EnableSealRecognize", this.EnableSealRecognize);

    }
}

