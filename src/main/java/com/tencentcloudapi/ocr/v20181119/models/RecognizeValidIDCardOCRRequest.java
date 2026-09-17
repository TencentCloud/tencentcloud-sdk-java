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

public class RecognizeValidIDCardOCRRequest extends AbstractModel {

    /**
    * <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>0 自动，自动判断输入证件的类型<br>1 身份证人像面，指定输入证件类型为二代身份证人像面<br>2 身份证国徽面，指定输入证件类型为二代身份证国徽面<br>3 身份证人像国徽面，指定输入证件类型为二代身份证人像面或者国徽面<br>4 临时身份证人像面，指定输入证件类型为临时身份证人像面<br>5 临时身份证国徽面，指定输入证件类型为临时身份证国徽面<br>6 临时身份证人像国徽面，指定输入证件类型为临时身份证人像面或者国徽面<br>7 港澳台居住证人像面，指定输入证件类型为港澳台居住证人像面<br>8 港澳台居住证国徽面，指定输入证件类型为港澳台居住证国徽面<br>9 港澳台居住证人像国徽面，指定输入证件类型为港澳台居住证人像面或者国徽面<br>10 外国人永久居留身份证人像面，指定输入证件类型为外国人永久居留证人像面<br>11 外国人永久居留身份证国徽面，指定输入证件类型为外国人永久居留证国徽面<br>12 外国人永久居留身份证人像国徽面，指定输入证件类型为外国人永久居留证人像或者国徽面<br>该参数如果不填，将为您自动判断卡证类型。</p>
    */
    @SerializedName("CardType")
    @Expose
    private Long CardType;

    /**
    * <p>默认值为false，打开返回证件头像切图。</p>
    */
    @SerializedName("EnablePortrait")
    @Expose
    private Boolean EnablePortrait;

    /**
    * <p>默认值为false，打开返回证件主体切图。</p>
    */
    @SerializedName("EnableCropImage")
    @Expose
    private Boolean EnableCropImage;

    /**
    * <p>默认值为false，打开返回边缘完整性判断。</p>
    */
    @SerializedName("EnableBorderCheck")
    @Expose
    private Boolean EnableBorderCheck;

    /**
    * <p>默认值为false，打开返回证件是否被遮挡。</p>
    */
    @SerializedName("EnableOcclusionCheck")
    @Expose
    private Boolean EnableOcclusionCheck;

    /**
    * <p>默认值为false，打开返回证件是否存在复印。</p>
    */
    @SerializedName("EnableCopyCheck")
    @Expose
    private Boolean EnableCopyCheck;

    /**
    * <p>默认值为false，打开返回证件是否存在屏幕翻拍。</p>
    */
    @SerializedName("EnableReshootCheck")
    @Expose
    private Boolean EnableReshootCheck;

    /**
    * <p>默认值为false，打开返回是否存在反光。</p>
    */
    @SerializedName("EnableReflectCheck")
    @Expose
    private Boolean EnableReflectCheck;

    /**
    * <p>默认值为false，打开返回证件是否存在PS。类型为：临时、港澳台居住证、外国人居住证失效</p>
    */
    @SerializedName("EnablePSCheck")
    @Expose
    private Boolean EnablePSCheck;

    /**
    * <p>默认值为false，打开返回字段级反光和字段级完整性告警。类型为：临时、港澳台居住证、外国人居住证失效</p>
    */
    @SerializedName("EnableWordCheck")
    @Expose
    private Boolean EnableWordCheck;

    /**
    * <p>默认值为false，打开返回证件是否模糊。</p>
    */
    @SerializedName("EnableQualityCheck")
    @Expose
    private Boolean EnableQualityCheck;

    /**
    * <p>默认值为false，打开返回是否存在电子身份证判断。</p>
    */
    @SerializedName("EnableElectronCheck")
    @Expose
    private Boolean EnableElectronCheck;

    /**
     * Get <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p> 
     * @return ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     * @param ImageBase64 <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p> 
     * @return ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
     * @param ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>0 自动，自动判断输入证件的类型<br>1 身份证人像面，指定输入证件类型为二代身份证人像面<br>2 身份证国徽面，指定输入证件类型为二代身份证国徽面<br>3 身份证人像国徽面，指定输入证件类型为二代身份证人像面或者国徽面<br>4 临时身份证人像面，指定输入证件类型为临时身份证人像面<br>5 临时身份证国徽面，指定输入证件类型为临时身份证国徽面<br>6 临时身份证人像国徽面，指定输入证件类型为临时身份证人像面或者国徽面<br>7 港澳台居住证人像面，指定输入证件类型为港澳台居住证人像面<br>8 港澳台居住证国徽面，指定输入证件类型为港澳台居住证国徽面<br>9 港澳台居住证人像国徽面，指定输入证件类型为港澳台居住证人像面或者国徽面<br>10 外国人永久居留身份证人像面，指定输入证件类型为外国人永久居留证人像面<br>11 外国人永久居留身份证国徽面，指定输入证件类型为外国人永久居留证国徽面<br>12 外国人永久居留身份证人像国徽面，指定输入证件类型为外国人永久居留证人像或者国徽面<br>该参数如果不填，将为您自动判断卡证类型。</p> 
     * @return CardType <p>0 自动，自动判断输入证件的类型<br>1 身份证人像面，指定输入证件类型为二代身份证人像面<br>2 身份证国徽面，指定输入证件类型为二代身份证国徽面<br>3 身份证人像国徽面，指定输入证件类型为二代身份证人像面或者国徽面<br>4 临时身份证人像面，指定输入证件类型为临时身份证人像面<br>5 临时身份证国徽面，指定输入证件类型为临时身份证国徽面<br>6 临时身份证人像国徽面，指定输入证件类型为临时身份证人像面或者国徽面<br>7 港澳台居住证人像面，指定输入证件类型为港澳台居住证人像面<br>8 港澳台居住证国徽面，指定输入证件类型为港澳台居住证国徽面<br>9 港澳台居住证人像国徽面，指定输入证件类型为港澳台居住证人像面或者国徽面<br>10 外国人永久居留身份证人像面，指定输入证件类型为外国人永久居留证人像面<br>11 外国人永久居留身份证国徽面，指定输入证件类型为外国人永久居留证国徽面<br>12 外国人永久居留身份证人像国徽面，指定输入证件类型为外国人永久居留证人像或者国徽面<br>该参数如果不填，将为您自动判断卡证类型。</p>
     */
    public Long getCardType() {
        return this.CardType;
    }

    /**
     * Set <p>0 自动，自动判断输入证件的类型<br>1 身份证人像面，指定输入证件类型为二代身份证人像面<br>2 身份证国徽面，指定输入证件类型为二代身份证国徽面<br>3 身份证人像国徽面，指定输入证件类型为二代身份证人像面或者国徽面<br>4 临时身份证人像面，指定输入证件类型为临时身份证人像面<br>5 临时身份证国徽面，指定输入证件类型为临时身份证国徽面<br>6 临时身份证人像国徽面，指定输入证件类型为临时身份证人像面或者国徽面<br>7 港澳台居住证人像面，指定输入证件类型为港澳台居住证人像面<br>8 港澳台居住证国徽面，指定输入证件类型为港澳台居住证国徽面<br>9 港澳台居住证人像国徽面，指定输入证件类型为港澳台居住证人像面或者国徽面<br>10 外国人永久居留身份证人像面，指定输入证件类型为外国人永久居留证人像面<br>11 外国人永久居留身份证国徽面，指定输入证件类型为外国人永久居留证国徽面<br>12 外国人永久居留身份证人像国徽面，指定输入证件类型为外国人永久居留证人像或者国徽面<br>该参数如果不填，将为您自动判断卡证类型。</p>
     * @param CardType <p>0 自动，自动判断输入证件的类型<br>1 身份证人像面，指定输入证件类型为二代身份证人像面<br>2 身份证国徽面，指定输入证件类型为二代身份证国徽面<br>3 身份证人像国徽面，指定输入证件类型为二代身份证人像面或者国徽面<br>4 临时身份证人像面，指定输入证件类型为临时身份证人像面<br>5 临时身份证国徽面，指定输入证件类型为临时身份证国徽面<br>6 临时身份证人像国徽面，指定输入证件类型为临时身份证人像面或者国徽面<br>7 港澳台居住证人像面，指定输入证件类型为港澳台居住证人像面<br>8 港澳台居住证国徽面，指定输入证件类型为港澳台居住证国徽面<br>9 港澳台居住证人像国徽面，指定输入证件类型为港澳台居住证人像面或者国徽面<br>10 外国人永久居留身份证人像面，指定输入证件类型为外国人永久居留证人像面<br>11 外国人永久居留身份证国徽面，指定输入证件类型为外国人永久居留证国徽面<br>12 外国人永久居留身份证人像国徽面，指定输入证件类型为外国人永久居留证人像或者国徽面<br>该参数如果不填，将为您自动判断卡证类型。</p>
     */
    public void setCardType(Long CardType) {
        this.CardType = CardType;
    }

    /**
     * Get <p>默认值为false，打开返回证件头像切图。</p> 
     * @return EnablePortrait <p>默认值为false，打开返回证件头像切图。</p>
     */
    public Boolean getEnablePortrait() {
        return this.EnablePortrait;
    }

    /**
     * Set <p>默认值为false，打开返回证件头像切图。</p>
     * @param EnablePortrait <p>默认值为false，打开返回证件头像切图。</p>
     */
    public void setEnablePortrait(Boolean EnablePortrait) {
        this.EnablePortrait = EnablePortrait;
    }

    /**
     * Get <p>默认值为false，打开返回证件主体切图。</p> 
     * @return EnableCropImage <p>默认值为false，打开返回证件主体切图。</p>
     */
    public Boolean getEnableCropImage() {
        return this.EnableCropImage;
    }

    /**
     * Set <p>默认值为false，打开返回证件主体切图。</p>
     * @param EnableCropImage <p>默认值为false，打开返回证件主体切图。</p>
     */
    public void setEnableCropImage(Boolean EnableCropImage) {
        this.EnableCropImage = EnableCropImage;
    }

    /**
     * Get <p>默认值为false，打开返回边缘完整性判断。</p> 
     * @return EnableBorderCheck <p>默认值为false，打开返回边缘完整性判断。</p>
     */
    public Boolean getEnableBorderCheck() {
        return this.EnableBorderCheck;
    }

    /**
     * Set <p>默认值为false，打开返回边缘完整性判断。</p>
     * @param EnableBorderCheck <p>默认值为false，打开返回边缘完整性判断。</p>
     */
    public void setEnableBorderCheck(Boolean EnableBorderCheck) {
        this.EnableBorderCheck = EnableBorderCheck;
    }

    /**
     * Get <p>默认值为false，打开返回证件是否被遮挡。</p> 
     * @return EnableOcclusionCheck <p>默认值为false，打开返回证件是否被遮挡。</p>
     */
    public Boolean getEnableOcclusionCheck() {
        return this.EnableOcclusionCheck;
    }

    /**
     * Set <p>默认值为false，打开返回证件是否被遮挡。</p>
     * @param EnableOcclusionCheck <p>默认值为false，打开返回证件是否被遮挡。</p>
     */
    public void setEnableOcclusionCheck(Boolean EnableOcclusionCheck) {
        this.EnableOcclusionCheck = EnableOcclusionCheck;
    }

    /**
     * Get <p>默认值为false，打开返回证件是否存在复印。</p> 
     * @return EnableCopyCheck <p>默认值为false，打开返回证件是否存在复印。</p>
     */
    public Boolean getEnableCopyCheck() {
        return this.EnableCopyCheck;
    }

    /**
     * Set <p>默认值为false，打开返回证件是否存在复印。</p>
     * @param EnableCopyCheck <p>默认值为false，打开返回证件是否存在复印。</p>
     */
    public void setEnableCopyCheck(Boolean EnableCopyCheck) {
        this.EnableCopyCheck = EnableCopyCheck;
    }

    /**
     * Get <p>默认值为false，打开返回证件是否存在屏幕翻拍。</p> 
     * @return EnableReshootCheck <p>默认值为false，打开返回证件是否存在屏幕翻拍。</p>
     */
    public Boolean getEnableReshootCheck() {
        return this.EnableReshootCheck;
    }

    /**
     * Set <p>默认值为false，打开返回证件是否存在屏幕翻拍。</p>
     * @param EnableReshootCheck <p>默认值为false，打开返回证件是否存在屏幕翻拍。</p>
     */
    public void setEnableReshootCheck(Boolean EnableReshootCheck) {
        this.EnableReshootCheck = EnableReshootCheck;
    }

    /**
     * Get <p>默认值为false，打开返回是否存在反光。</p> 
     * @return EnableReflectCheck <p>默认值为false，打开返回是否存在反光。</p>
     */
    public Boolean getEnableReflectCheck() {
        return this.EnableReflectCheck;
    }

    /**
     * Set <p>默认值为false，打开返回是否存在反光。</p>
     * @param EnableReflectCheck <p>默认值为false，打开返回是否存在反光。</p>
     */
    public void setEnableReflectCheck(Boolean EnableReflectCheck) {
        this.EnableReflectCheck = EnableReflectCheck;
    }

    /**
     * Get <p>默认值为false，打开返回证件是否存在PS。类型为：临时、港澳台居住证、外国人居住证失效</p> 
     * @return EnablePSCheck <p>默认值为false，打开返回证件是否存在PS。类型为：临时、港澳台居住证、外国人居住证失效</p>
     */
    public Boolean getEnablePSCheck() {
        return this.EnablePSCheck;
    }

    /**
     * Set <p>默认值为false，打开返回证件是否存在PS。类型为：临时、港澳台居住证、外国人居住证失效</p>
     * @param EnablePSCheck <p>默认值为false，打开返回证件是否存在PS。类型为：临时、港澳台居住证、外国人居住证失效</p>
     */
    public void setEnablePSCheck(Boolean EnablePSCheck) {
        this.EnablePSCheck = EnablePSCheck;
    }

    /**
     * Get <p>默认值为false，打开返回字段级反光和字段级完整性告警。类型为：临时、港澳台居住证、外国人居住证失效</p> 
     * @return EnableWordCheck <p>默认值为false，打开返回字段级反光和字段级完整性告警。类型为：临时、港澳台居住证、外国人居住证失效</p>
     */
    public Boolean getEnableWordCheck() {
        return this.EnableWordCheck;
    }

    /**
     * Set <p>默认值为false，打开返回字段级反光和字段级完整性告警。类型为：临时、港澳台居住证、外国人居住证失效</p>
     * @param EnableWordCheck <p>默认值为false，打开返回字段级反光和字段级完整性告警。类型为：临时、港澳台居住证、外国人居住证失效</p>
     */
    public void setEnableWordCheck(Boolean EnableWordCheck) {
        this.EnableWordCheck = EnableWordCheck;
    }

    /**
     * Get <p>默认值为false，打开返回证件是否模糊。</p> 
     * @return EnableQualityCheck <p>默认值为false，打开返回证件是否模糊。</p>
     */
    public Boolean getEnableQualityCheck() {
        return this.EnableQualityCheck;
    }

    /**
     * Set <p>默认值为false，打开返回证件是否模糊。</p>
     * @param EnableQualityCheck <p>默认值为false，打开返回证件是否模糊。</p>
     */
    public void setEnableQualityCheck(Boolean EnableQualityCheck) {
        this.EnableQualityCheck = EnableQualityCheck;
    }

    /**
     * Get <p>默认值为false，打开返回是否存在电子身份证判断。</p> 
     * @return EnableElectronCheck <p>默认值为false，打开返回是否存在电子身份证判断。</p>
     */
    public Boolean getEnableElectronCheck() {
        return this.EnableElectronCheck;
    }

    /**
     * Set <p>默认值为false，打开返回是否存在电子身份证判断。</p>
     * @param EnableElectronCheck <p>默认值为false，打开返回是否存在电子身份证判断。</p>
     */
    public void setEnableElectronCheck(Boolean EnableElectronCheck) {
        this.EnableElectronCheck = EnableElectronCheck;
    }

    public RecognizeValidIDCardOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeValidIDCardOCRRequest(RecognizeValidIDCardOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.CardType != null) {
            this.CardType = new Long(source.CardType);
        }
        if (source.EnablePortrait != null) {
            this.EnablePortrait = new Boolean(source.EnablePortrait);
        }
        if (source.EnableCropImage != null) {
            this.EnableCropImage = new Boolean(source.EnableCropImage);
        }
        if (source.EnableBorderCheck != null) {
            this.EnableBorderCheck = new Boolean(source.EnableBorderCheck);
        }
        if (source.EnableOcclusionCheck != null) {
            this.EnableOcclusionCheck = new Boolean(source.EnableOcclusionCheck);
        }
        if (source.EnableCopyCheck != null) {
            this.EnableCopyCheck = new Boolean(source.EnableCopyCheck);
        }
        if (source.EnableReshootCheck != null) {
            this.EnableReshootCheck = new Boolean(source.EnableReshootCheck);
        }
        if (source.EnableReflectCheck != null) {
            this.EnableReflectCheck = new Boolean(source.EnableReflectCheck);
        }
        if (source.EnablePSCheck != null) {
            this.EnablePSCheck = new Boolean(source.EnablePSCheck);
        }
        if (source.EnableWordCheck != null) {
            this.EnableWordCheck = new Boolean(source.EnableWordCheck);
        }
        if (source.EnableQualityCheck != null) {
            this.EnableQualityCheck = new Boolean(source.EnableQualityCheck);
        }
        if (source.EnableElectronCheck != null) {
            this.EnableElectronCheck = new Boolean(source.EnableElectronCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "EnablePortrait", this.EnablePortrait);
        this.setParamSimple(map, prefix + "EnableCropImage", this.EnableCropImage);
        this.setParamSimple(map, prefix + "EnableBorderCheck", this.EnableBorderCheck);
        this.setParamSimple(map, prefix + "EnableOcclusionCheck", this.EnableOcclusionCheck);
        this.setParamSimple(map, prefix + "EnableCopyCheck", this.EnableCopyCheck);
        this.setParamSimple(map, prefix + "EnableReshootCheck", this.EnableReshootCheck);
        this.setParamSimple(map, prefix + "EnableReflectCheck", this.EnableReflectCheck);
        this.setParamSimple(map, prefix + "EnablePSCheck", this.EnablePSCheck);
        this.setParamSimple(map, prefix + "EnableWordCheck", this.EnableWordCheck);
        this.setParamSimple(map, prefix + "EnableQualityCheck", this.EnableQualityCheck);
        this.setParamSimple(map, prefix + "EnableElectronCheck", this.EnableElectronCheck);

    }
}

