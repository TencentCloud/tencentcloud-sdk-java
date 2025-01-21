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

public class RecognizeGeneralCardWarnRequest extends AbstractModel {

    /**
    * 图片链接
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 图片base64
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 卡证类型参数，包含以下范围：  
default：通用卡证  
idcard：身份证  
passport：护照  
bizlicense：营业执照  
regcertificate：登记证书  
residpermit：居住证  
transpermit：通行证  
signboard：门头照  
bankcard：银行卡  
drivinglicense：驾驶证、行驶证
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

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
     * Get 图片链接 
     * @return ImageUrl 图片链接
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片链接
     * @param ImageUrl 图片链接
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 图片base64 
     * @return ImageBase64 图片base64
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片base64
     * @param ImageBase64 图片base64
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 卡证类型参数，包含以下范围：  
default：通用卡证  
idcard：身份证  
passport：护照  
bizlicense：营业执照  
regcertificate：登记证书  
residpermit：居住证  
transpermit：通行证  
signboard：门头照  
bankcard：银行卡  
drivinglicense：驾驶证、行驶证 
     * @return CardType 卡证类型参数，包含以下范围：  
default：通用卡证  
idcard：身份证  
passport：护照  
bizlicense：营业执照  
regcertificate：登记证书  
residpermit：居住证  
transpermit：通行证  
signboard：门头照  
bankcard：银行卡  
drivinglicense：驾驶证、行驶证
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set 卡证类型参数，包含以下范围：  
default：通用卡证  
idcard：身份证  
passport：护照  
bizlicense：营业执照  
regcertificate：登记证书  
residpermit：居住证  
transpermit：通行证  
signboard：门头照  
bankcard：银行卡  
drivinglicense：驾驶证、行驶证
     * @param CardType 卡证类型参数，包含以下范围：  
default：通用卡证  
idcard：身份证  
passport：护照  
bizlicense：营业执照  
regcertificate：登记证书  
residpermit：居住证  
transpermit：通行证  
signboard：门头照  
bankcard：银行卡  
drivinglicense：驾驶证、行驶证
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
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

