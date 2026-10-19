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

public class RecognizeGeneralCardWarnRequest extends AbstractModel {

    /**
    * <p>图片链接</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>图片base64</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>卡证类型参数，选填，不填则默认为General，枚举值：<br>（如输入图片的卡证类型明确，建议填入，可降低请求耗时）</p><p>General：系统自动分类/其他类型<br>IDCard：身份证<br>Passport：护照<br>BankCard：银行卡<br>VehicleLicense：行驶证<br>DriverLicense：驾驶证<br>BizLicense：营业执照<br>HmtResidentPermit：港澳台居住证<br>ForeignPermanentResident：外国人永居证<br>MainlandPermit：港澳台来往内地通行证<br>SocialSecurityCard：社保卡</p>
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * <p>是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。</p>
    */
    @SerializedName("IsPdf")
    @Expose
    private Boolean IsPdf;

    /**
    * <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。</p>
    */
    @SerializedName("PdfPageNumber")
    @Expose
    private Long PdfPageNumber;

    /**
     * Get <p>图片链接</p> 
     * @return ImageUrl <p>图片链接</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片链接</p>
     * @param ImageUrl <p>图片链接</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>图片base64</p> 
     * @return ImageBase64 <p>图片base64</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片base64</p>
     * @param ImageBase64 <p>图片base64</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>卡证类型参数，选填，不填则默认为General，枚举值：<br>（如输入图片的卡证类型明确，建议填入，可降低请求耗时）</p><p>General：系统自动分类/其他类型<br>IDCard：身份证<br>Passport：护照<br>BankCard：银行卡<br>VehicleLicense：行驶证<br>DriverLicense：驾驶证<br>BizLicense：营业执照<br>HmtResidentPermit：港澳台居住证<br>ForeignPermanentResident：外国人永居证<br>MainlandPermit：港澳台来往内地通行证<br>SocialSecurityCard：社保卡</p> 
     * @return CardType <p>卡证类型参数，选填，不填则默认为General，枚举值：<br>（如输入图片的卡证类型明确，建议填入，可降低请求耗时）</p><p>General：系统自动分类/其他类型<br>IDCard：身份证<br>Passport：护照<br>BankCard：银行卡<br>VehicleLicense：行驶证<br>DriverLicense：驾驶证<br>BizLicense：营业执照<br>HmtResidentPermit：港澳台居住证<br>ForeignPermanentResident：外国人永居证<br>MainlandPermit：港澳台来往内地通行证<br>SocialSecurityCard：社保卡</p>
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set <p>卡证类型参数，选填，不填则默认为General，枚举值：<br>（如输入图片的卡证类型明确，建议填入，可降低请求耗时）</p><p>General：系统自动分类/其他类型<br>IDCard：身份证<br>Passport：护照<br>BankCard：银行卡<br>VehicleLicense：行驶证<br>DriverLicense：驾驶证<br>BizLicense：营业执照<br>HmtResidentPermit：港澳台居住证<br>ForeignPermanentResident：外国人永居证<br>MainlandPermit：港澳台来往内地通行证<br>SocialSecurityCard：社保卡</p>
     * @param CardType <p>卡证类型参数，选填，不填则默认为General，枚举值：<br>（如输入图片的卡证类型明确，建议填入，可降低请求耗时）</p><p>General：系统自动分类/其他类型<br>IDCard：身份证<br>Passport：护照<br>BankCard：银行卡<br>VehicleLicense：行驶证<br>DriverLicense：驾驶证<br>BizLicense：营业执照<br>HmtResidentPermit：港澳台居住证<br>ForeignPermanentResident：外国人永居证<br>MainlandPermit：港澳台来往内地通行证<br>SocialSecurityCard：社保卡</p>
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get <p>是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。</p> 
     * @return IsPdf <p>是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。</p>
     */
    public Boolean getIsPdf() {
        return this.IsPdf;
    }

    /**
     * Set <p>是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。</p>
     * @param IsPdf <p>是否开启PDF识别，默认值为false，开启后可同时支持图片和PDF的识别。</p>
     */
    public void setIsPdf(Boolean IsPdf) {
        this.IsPdf = IsPdf;
    }

    /**
     * Get <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。</p> 
     * @return PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。</p>
     */
    public Long getPdfPageNumber() {
        return this.PdfPageNumber;
    }

    /**
     * Set <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。</p>
     * @param PdfPageNumber <p>需要识别的PDF页面的对应页码，仅支持PDF单页识别，当上传文件为PDF且IsPdf参数值为true时有效，默认值为1。</p>
     */
    public void setPdfPageNumber(Long PdfPageNumber) {
        this.PdfPageNumber = PdfPageNumber;
    }

    public RecognizeGeneralCardWarnRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeGeneralCardWarnRequest(RecognizeGeneralCardWarnRequest source) {
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.CardType != null) {
            this.CardType = new String(source.CardType);
        }
        if (source.IsPdf != null) {
            this.IsPdf = new Boolean(source.IsPdf);
        }
        if (source.PdfPageNumber != null) {
            this.PdfPageNumber = new Long(source.PdfPageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "IsPdf", this.IsPdf);
        this.setParamSimple(map, prefix + "PdfPageNumber", this.PdfPageNumber);

    }
}

