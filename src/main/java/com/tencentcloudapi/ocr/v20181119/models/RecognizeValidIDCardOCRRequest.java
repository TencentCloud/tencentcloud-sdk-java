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
    * 图片的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 0 自动，自动判断输入证件的类型
1 身份证人像面，指定输入证件类型为二代身份证人像面
2 身份证国徽面，指定输入证件类型为二代身份证国徽面
3 身份证人像国徽面，指定输入证件类型为二代身份证人像面或者国徽面
4 临时身份证人像面，指定输入证件类型为临时身份证人像面
5 临时身份证国徽面，指定输入证件类型为临时身份证国徽面
6 临时身份证人像国徽面，指定输入证件类型为临时身份证人像面或者国徽面
7 港澳台居住证人像面，指定输入证件类型为港澳台居住证人像面
8 港澳台居住证国徽面，指定输入证件类型为港澳台居住证国徽面
9 港澳台居住证人像国徽面，指定输入证件类型为港澳台居住证人像面或者国徽面
10 外国人永久居留身份证人像面，指定输入证件类型为外国人永久居留证人像面
11 外国人永久居留身份证国徽面，指定输入证件类型为外国人永久居留证国徽面
12 外国人永久居留身份证人像国徽面，指定输入证件类型为外国人永久居留证人像或者国徽面
该参数如果不填，将为您自动判断卡证类型。
    */
    @SerializedName("CardType")
    @Expose
    private Long CardType;

    /**
    * 默认值为false，打开返回证件头像切图。
    */
    @SerializedName("EnablePortrait")
    @Expose
    private Boolean EnablePortrait;

    /**
    * 默认值为false，打开返回证件主体切图。
    */
    @SerializedName("EnableCropImage")
    @Expose
    private Boolean EnableCropImage;

    /**
    * 默认值为false，打开返回边缘完整性判断。
    */
    @SerializedName("EnableBorderCheck")
    @Expose
    private Boolean EnableBorderCheck;

    /**
    * 默认值为false，打开返回证件是否被遮挡。
    */
    @SerializedName("EnableOcclusionCheck")
    @Expose
    private Boolean EnableOcclusionCheck;

    /**
    * 默认值为false，打开返回证件是否存在复印。
    */
    @SerializedName("EnableCopyCheck")
    @Expose
    private Boolean EnableCopyCheck;

    /**
    * 默认值为false，打开返回证件是否存在屏幕翻拍。
    */
    @SerializedName("EnableReshootCheck")
    @Expose
    private Boolean EnableReshootCheck;

    /**
    * 默认值为false，打开返回证件是否存在PS。类型为：临时、港澳台居住证、外国人居住证失效
    */
    @SerializedName("EnablePSCheck")
    @Expose
    private Boolean EnablePSCheck;

    /**
    * 默认值为false，打开返回字段级反光和字段级完整性告警。类型为：临时、港澳台居住证、外国人居住证失效
    */
    @SerializedName("EnableWordCheck")
    @Expose
    private Boolean EnableWordCheck;

    /**
     * Get 图片的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageBase64 图片的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageBase64 图片的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。 
     * @return ImageUrl 图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。
     * @param ImageUrl 图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 0 自动，自动判断输入证件的类型
1 身份证人像面，指定输入证件类型为二代身份证人像面
2 身份证国徽面，指定输入证件类型为二代身份证国徽面
3 身份证人像国徽面，指定输入证件类型为二代身份证人像面或者国徽面
4 临时身份证人像面，指定输入证件类型为临时身份证人像面
5 临时身份证国徽面，指定输入证件类型为临时身份证国徽面
6 临时身份证人像国徽面，指定输入证件类型为临时身份证人像面或者国徽面
7 港澳台居住证人像面，指定输入证件类型为港澳台居住证人像面
8 港澳台居住证国徽面，指定输入证件类型为港澳台居住证国徽面
9 港澳台居住证人像国徽面，指定输入证件类型为港澳台居住证人像面或者国徽面
10 外国人永久居留身份证人像面，指定输入证件类型为外国人永久居留证人像面
11 外国人永久居留身份证国徽面，指定输入证件类型为外国人永久居留证国徽面
12 外国人永久居留身份证人像国徽面，指定输入证件类型为外国人永久居留证人像或者国徽面
该参数如果不填，将为您自动判断卡证类型。 
     * @return CardType 0 自动，自动判断输入证件的类型
1 身份证人像面，指定输入证件类型为二代身份证人像面
2 身份证国徽面，指定输入证件类型为二代身份证国徽面
3 身份证人像国徽面，指定输入证件类型为二代身份证人像面或者国徽面
4 临时身份证人像面，指定输入证件类型为临时身份证人像面
5 临时身份证国徽面，指定输入证件类型为临时身份证国徽面
6 临时身份证人像国徽面，指定输入证件类型为临时身份证人像面或者国徽面
7 港澳台居住证人像面，指定输入证件类型为港澳台居住证人像面
8 港澳台居住证国徽面，指定输入证件类型为港澳台居住证国徽面
9 港澳台居住证人像国徽面，指定输入证件类型为港澳台居住证人像面或者国徽面
10 外国人永久居留身份证人像面，指定输入证件类型为外国人永久居留证人像面
11 外国人永久居留身份证国徽面，指定输入证件类型为外国人永久居留证国徽面
12 外国人永久居留身份证人像国徽面，指定输入证件类型为外国人永久居留证人像或者国徽面
该参数如果不填，将为您自动判断卡证类型。
     */
    public Long getCardType() {
        return this.CardType;
    }

    /**
     * Set 0 自动，自动判断输入证件的类型
1 身份证人像面，指定输入证件类型为二代身份证人像面
2 身份证国徽面，指定输入证件类型为二代身份证国徽面
3 身份证人像国徽面，指定输入证件类型为二代身份证人像面或者国徽面
4 临时身份证人像面，指定输入证件类型为临时身份证人像面
5 临时身份证国徽面，指定输入证件类型为临时身份证国徽面
6 临时身份证人像国徽面，指定输入证件类型为临时身份证人像面或者国徽面
7 港澳台居住证人像面，指定输入证件类型为港澳台居住证人像面
8 港澳台居住证国徽面，指定输入证件类型为港澳台居住证国徽面
9 港澳台居住证人像国徽面，指定输入证件类型为港澳台居住证人像面或者国徽面
10 外国人永久居留身份证人像面，指定输入证件类型为外国人永久居留证人像面
11 外国人永久居留身份证国徽面，指定输入证件类型为外国人永久居留证国徽面
12 外国人永久居留身份证人像国徽面，指定输入证件类型为外国人永久居留证人像或者国徽面
该参数如果不填，将为您自动判断卡证类型。
     * @param CardType 0 自动，自动判断输入证件的类型
1 身份证人像面，指定输入证件类型为二代身份证人像面
2 身份证国徽面，指定输入证件类型为二代身份证国徽面
3 身份证人像国徽面，指定输入证件类型为二代身份证人像面或者国徽面
4 临时身份证人像面，指定输入证件类型为临时身份证人像面
5 临时身份证国徽面，指定输入证件类型为临时身份证国徽面
6 临时身份证人像国徽面，指定输入证件类型为临时身份证人像面或者国徽面
7 港澳台居住证人像面，指定输入证件类型为港澳台居住证人像面
8 港澳台居住证国徽面，指定输入证件类型为港澳台居住证国徽面
9 港澳台居住证人像国徽面，指定输入证件类型为港澳台居住证人像面或者国徽面
10 外国人永久居留身份证人像面，指定输入证件类型为外国人永久居留证人像面
11 外国人永久居留身份证国徽面，指定输入证件类型为外国人永久居留证国徽面
12 外国人永久居留身份证人像国徽面，指定输入证件类型为外国人永久居留证人像或者国徽面
该参数如果不填，将为您自动判断卡证类型。
     */
    public void setCardType(Long CardType) {
        this.CardType = CardType;
    }

    /**
     * Get 默认值为false，打开返回证件头像切图。 
     * @return EnablePortrait 默认值为false，打开返回证件头像切图。
     */
    public Boolean getEnablePortrait() {
        return this.EnablePortrait;
    }

    /**
     * Set 默认值为false，打开返回证件头像切图。
     * @param EnablePortrait 默认值为false，打开返回证件头像切图。
     */
    public void setEnablePortrait(Boolean EnablePortrait) {
        this.EnablePortrait = EnablePortrait;
    }

    /**
     * Get 默认值为false，打开返回证件主体切图。 
     * @return EnableCropImage 默认值为false，打开返回证件主体切图。
     */
    public Boolean getEnableCropImage() {
        return this.EnableCropImage;
    }

    /**
     * Set 默认值为false，打开返回证件主体切图。
     * @param EnableCropImage 默认值为false，打开返回证件主体切图。
     */
    public void setEnableCropImage(Boolean EnableCropImage) {
        this.EnableCropImage = EnableCropImage;
    }

    /**
     * Get 默认值为false，打开返回边缘完整性判断。 
     * @return EnableBorderCheck 默认值为false，打开返回边缘完整性判断。
     */
    public Boolean getEnableBorderCheck() {
        return this.EnableBorderCheck;
    }

    /**
     * Set 默认值为false，打开返回边缘完整性判断。
     * @param EnableBorderCheck 默认值为false，打开返回边缘完整性判断。
     */
    public void setEnableBorderCheck(Boolean EnableBorderCheck) {
        this.EnableBorderCheck = EnableBorderCheck;
    }

    /**
     * Get 默认值为false，打开返回证件是否被遮挡。 
     * @return EnableOcclusionCheck 默认值为false，打开返回证件是否被遮挡。
     */
    public Boolean getEnableOcclusionCheck() {
        return this.EnableOcclusionCheck;
    }

    /**
     * Set 默认值为false，打开返回证件是否被遮挡。
     * @param EnableOcclusionCheck 默认值为false，打开返回证件是否被遮挡。
     */
    public void setEnableOcclusionCheck(Boolean EnableOcclusionCheck) {
        this.EnableOcclusionCheck = EnableOcclusionCheck;
    }

    /**
     * Get 默认值为false，打开返回证件是否存在复印。 
     * @return EnableCopyCheck 默认值为false，打开返回证件是否存在复印。
     */
    public Boolean getEnableCopyCheck() {
        return this.EnableCopyCheck;
    }

    /**
     * Set 默认值为false，打开返回证件是否存在复印。
     * @param EnableCopyCheck 默认值为false，打开返回证件是否存在复印。
     */
    public void setEnableCopyCheck(Boolean EnableCopyCheck) {
        this.EnableCopyCheck = EnableCopyCheck;
    }

    /**
     * Get 默认值为false，打开返回证件是否存在屏幕翻拍。 
     * @return EnableReshootCheck 默认值为false，打开返回证件是否存在屏幕翻拍。
     */
    public Boolean getEnableReshootCheck() {
        return this.EnableReshootCheck;
    }

    /**
     * Set 默认值为false，打开返回证件是否存在屏幕翻拍。
     * @param EnableReshootCheck 默认值为false，打开返回证件是否存在屏幕翻拍。
     */
    public void setEnableReshootCheck(Boolean EnableReshootCheck) {
        this.EnableReshootCheck = EnableReshootCheck;
    }

    /**
     * Get 默认值为false，打开返回证件是否存在PS。类型为：临时、港澳台居住证、外国人居住证失效 
     * @return EnablePSCheck 默认值为false，打开返回证件是否存在PS。类型为：临时、港澳台居住证、外国人居住证失效
     */
    public Boolean getEnablePSCheck() {
        return this.EnablePSCheck;
    }

    /**
     * Set 默认值为false，打开返回证件是否存在PS。类型为：临时、港澳台居住证、外国人居住证失效
     * @param EnablePSCheck 默认值为false，打开返回证件是否存在PS。类型为：临时、港澳台居住证、外国人居住证失效
     */
    public void setEnablePSCheck(Boolean EnablePSCheck) {
        this.EnablePSCheck = EnablePSCheck;
    }

    /**
     * Get 默认值为false，打开返回字段级反光和字段级完整性告警。类型为：临时、港澳台居住证、外国人居住证失效 
     * @return EnableWordCheck 默认值为false，打开返回字段级反光和字段级完整性告警。类型为：临时、港澳台居住证、外国人居住证失效
     */
    public Boolean getEnableWordCheck() {
        return this.EnableWordCheck;
    }

    /**
     * Set 默认值为false，打开返回字段级反光和字段级完整性告警。类型为：临时、港澳台居住证、外国人居住证失效
     * @param EnableWordCheck 默认值为false，打开返回字段级反光和字段级完整性告警。类型为：临时、港澳台居住证、外国人居住证失效
     */
    public void setEnableWordCheck(Boolean EnableWordCheck) {
        this.EnableWordCheck = EnableWordCheck;
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
        if (source.EnablePSCheck != null) {
            this.EnablePSCheck = new Boolean(source.EnablePSCheck);
        }
        if (source.EnableWordCheck != null) {
            this.EnableWordCheck = new Boolean(source.EnableWordCheck);
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
        this.setParamSimple(map, prefix + "EnablePSCheck", this.EnablePSCheck);
        this.setParamSimple(map, prefix + "EnableWordCheck", this.EnableWordCheck);

    }
}

