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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ArithmeticOCRRequest extends AbstractModel{

    /**
    * 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 用于选择是否支持横屏拍摄。打开则支持横屏拍摄图片角度判断，角度信息在返回参数的angle中，默认值为true
    */
    @SerializedName("SupportHorizontalImage")
    @Expose
    private Boolean SupportHorizontalImage;

    /**
    * 是否拒绝非速算图，打开则拒绝非速算图(注：非速算图是指风景人物等明显不是速算图片的图片)，默认值为false
    */
    @SerializedName("RejectNonArithmeticPic")
    @Expose
    private Boolean RejectNonArithmeticPic;

    /**
    * 是否展开耦合算式中的竖式计算，默认值为false
    */
    @SerializedName("EnableDispRelatedVertical")
    @Expose
    private Boolean EnableDispRelatedVertical;

    /**
    * 是否展示竖式算式的中间结果和格式控制字符，默认值为false
    */
    @SerializedName("EnableDispMidResult")
    @Expose
    private Boolean EnableDispMidResult;

    /**
    * 是否开启pdf识别，默认值为true
    */
    @SerializedName("EnablePdfRecognize")
    @Expose
    private Boolean EnablePdfRecognize;

    /**
    * pdf页码，从0开始，默认为0
    */
    @SerializedName("PdfPageIndex")
    @Expose
    private Long PdfPageIndex;

    /**
     * Get 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。 
     * @return ImageBase64 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     * @param ImageBase64 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 7M。图片下载时间不超过 3 秒。
图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。 
     * @return ImageUrl 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     * @param ImageUrl 图片的 Url 地址。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经 Base64 编码后不超过 7M。图片下载时间不超过 3 秒。
图片存储于腾讯云的 Url 可保障更高的下载速度和稳定性，建议图片存储于腾讯云。
非腾讯云存储的 Url 速度和稳定性可能受一定影响。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 用于选择是否支持横屏拍摄。打开则支持横屏拍摄图片角度判断，角度信息在返回参数的angle中，默认值为true 
     * @return SupportHorizontalImage 用于选择是否支持横屏拍摄。打开则支持横屏拍摄图片角度判断，角度信息在返回参数的angle中，默认值为true
     */
    public Boolean getSupportHorizontalImage() {
        return this.SupportHorizontalImage;
    }

    /**
     * Set 用于选择是否支持横屏拍摄。打开则支持横屏拍摄图片角度判断，角度信息在返回参数的angle中，默认值为true
     * @param SupportHorizontalImage 用于选择是否支持横屏拍摄。打开则支持横屏拍摄图片角度判断，角度信息在返回参数的angle中，默认值为true
     */
    public void setSupportHorizontalImage(Boolean SupportHorizontalImage) {
        this.SupportHorizontalImage = SupportHorizontalImage;
    }

    /**
     * Get 是否拒绝非速算图，打开则拒绝非速算图(注：非速算图是指风景人物等明显不是速算图片的图片)，默认值为false 
     * @return RejectNonArithmeticPic 是否拒绝非速算图，打开则拒绝非速算图(注：非速算图是指风景人物等明显不是速算图片的图片)，默认值为false
     */
    public Boolean getRejectNonArithmeticPic() {
        return this.RejectNonArithmeticPic;
    }

    /**
     * Set 是否拒绝非速算图，打开则拒绝非速算图(注：非速算图是指风景人物等明显不是速算图片的图片)，默认值为false
     * @param RejectNonArithmeticPic 是否拒绝非速算图，打开则拒绝非速算图(注：非速算图是指风景人物等明显不是速算图片的图片)，默认值为false
     */
    public void setRejectNonArithmeticPic(Boolean RejectNonArithmeticPic) {
        this.RejectNonArithmeticPic = RejectNonArithmeticPic;
    }

    /**
     * Get 是否展开耦合算式中的竖式计算，默认值为false 
     * @return EnableDispRelatedVertical 是否展开耦合算式中的竖式计算，默认值为false
     */
    public Boolean getEnableDispRelatedVertical() {
        return this.EnableDispRelatedVertical;
    }

    /**
     * Set 是否展开耦合算式中的竖式计算，默认值为false
     * @param EnableDispRelatedVertical 是否展开耦合算式中的竖式计算，默认值为false
     */
    public void setEnableDispRelatedVertical(Boolean EnableDispRelatedVertical) {
        this.EnableDispRelatedVertical = EnableDispRelatedVertical;
    }

    /**
     * Get 是否展示竖式算式的中间结果和格式控制字符，默认值为false 
     * @return EnableDispMidResult 是否展示竖式算式的中间结果和格式控制字符，默认值为false
     */
    public Boolean getEnableDispMidResult() {
        return this.EnableDispMidResult;
    }

    /**
     * Set 是否展示竖式算式的中间结果和格式控制字符，默认值为false
     * @param EnableDispMidResult 是否展示竖式算式的中间结果和格式控制字符，默认值为false
     */
    public void setEnableDispMidResult(Boolean EnableDispMidResult) {
        this.EnableDispMidResult = EnableDispMidResult;
    }

    /**
     * Get 是否开启pdf识别，默认值为true 
     * @return EnablePdfRecognize 是否开启pdf识别，默认值为true
     */
    public Boolean getEnablePdfRecognize() {
        return this.EnablePdfRecognize;
    }

    /**
     * Set 是否开启pdf识别，默认值为true
     * @param EnablePdfRecognize 是否开启pdf识别，默认值为true
     */
    public void setEnablePdfRecognize(Boolean EnablePdfRecognize) {
        this.EnablePdfRecognize = EnablePdfRecognize;
    }

    /**
     * Get pdf页码，从0开始，默认为0 
     * @return PdfPageIndex pdf页码，从0开始，默认为0
     */
    public Long getPdfPageIndex() {
        return this.PdfPageIndex;
    }

    /**
     * Set pdf页码，从0开始，默认为0
     * @param PdfPageIndex pdf页码，从0开始，默认为0
     */
    public void setPdfPageIndex(Long PdfPageIndex) {
        this.PdfPageIndex = PdfPageIndex;
    }

    public ArithmeticOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ArithmeticOCRRequest(ArithmeticOCRRequest source) {
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.SupportHorizontalImage != null) {
            this.SupportHorizontalImage = new Boolean(source.SupportHorizontalImage);
        }
        if (source.RejectNonArithmeticPic != null) {
            this.RejectNonArithmeticPic = new Boolean(source.RejectNonArithmeticPic);
        }
        if (source.EnableDispRelatedVertical != null) {
            this.EnableDispRelatedVertical = new Boolean(source.EnableDispRelatedVertical);
        }
        if (source.EnableDispMidResult != null) {
            this.EnableDispMidResult = new Boolean(source.EnableDispMidResult);
        }
        if (source.EnablePdfRecognize != null) {
            this.EnablePdfRecognize = new Boolean(source.EnablePdfRecognize);
        }
        if (source.PdfPageIndex != null) {
            this.PdfPageIndex = new Long(source.PdfPageIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "SupportHorizontalImage", this.SupportHorizontalImage);
        this.setParamSimple(map, prefix + "RejectNonArithmeticPic", this.RejectNonArithmeticPic);
        this.setParamSimple(map, prefix + "EnableDispRelatedVertical", this.EnableDispRelatedVertical);
        this.setParamSimple(map, prefix + "EnableDispMidResult", this.EnableDispMidResult);
        this.setParamSimple(map, prefix + "EnablePdfRecognize", this.EnablePdfRecognize);
        this.setParamSimple(map, prefix + "PdfPageIndex", this.PdfPageIndex);

    }
}

