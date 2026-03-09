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

public class RecognizeEncryptedIDCardOCRRequest extends AbstractModel {

    /**
    * <p>请求体被加密后的密文（Base64编码），本接口只支持加密传输</p>
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
    * <p>敏感数据加密信息。对传入信息有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>图片的 Base64 值。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片的 ImageUrl、ImageBase64 必须提供一个，如果都提供，只使用 ImageUrl。</p>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片下载时间不超过 3 秒。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>FRONT：身份证有照片的一面（人像面），<br>BACK：身份证有国徽的一面（国徽面），<br>该参数如果不填，将为您自动判断身份证正反面。</p>
    */
    @SerializedName("CardSide")
    @Expose
    private String CardSide;

    /**
    * <p>以下可选字段均为bool 类型，默认false：<br>CropIdCard，身份证照片裁剪（去掉证件外多余的边缘、自动矫正拍摄角度）<br>CropPortrait，人像照片裁剪（自动抠取身份证头像区域）<br>CopyWarn，复印件告警<br>BorderCheckWarn，边框不完整和框内遮挡告警<br>ReshootWarn，屏幕翻拍告警<br>DetectPsWarn，疑似存在PS痕迹告警（CardWarnType参数为 Advanced时同时开启电子身份证、水印告警）<br>TempIdWarn，临时身份证告警<br>InvalidDateWarn，身份证有效日期不合法告警<br>Quality，图片质量分数（评价图片的模糊程度）<br>MultiCardDetect，是否开启正反面同框识别（仅支持二代身份证正反页同框识别或临时身份证正反页同框识别）<br>ReflectWarn，是否开启反光检测<br>SDK 设置方式参考：Config = Json.stringify({&quot;CropIdCard&quot;:true,&quot;CropPortrait&quot;:true})<br>API 3.0 Explorer 设置方式参考：Config = {&quot;CropIdCard&quot;:true,&quot;CropPortrait&quot;:true}</p>
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * <p>默认值为true，打开识别结果纠正开关。开关开启后，身份证号、出生日期、性别，三个字段会进行矫正补齐，统一结果输出；若关闭此开关，以上三个字段不会进行矫正补齐，保持原始识别结果输出，若原图出现篡改情况，这三个字段的识别结果可能会不统一。</p>
    */
    @SerializedName("EnableRecognitionRectify")
    @Expose
    private Boolean EnableRecognitionRectify;

    /**
    * <p>默认值为false。</p><p>此开关需要在反光检测开关开启下才会生效（即此开关生效的前提是config入参里的&quot;ReflectWarn&quot;:true），若EnableReflectDetail设置为true，则会返回反光点覆盖区域详情。反光点覆盖区域详情分为四部分：人像照片位置、国徽位置、识别字段位置、其他位置。一个反光点允许覆盖多个区域，且一张图片可能存在多个反光点。</p>
    */
    @SerializedName("EnableReflectDetail")
    @Expose
    private Boolean EnableReflectDetail;

    /**
    * <p>Basic：使用基础卡证告警能力（含基础PS告警）； Advanced：开启进阶PS告警能力，PS告警效果更佳但需要更长耗时；建议测试对比后选用，默认值为 Basic</p>
    */
    @SerializedName("CardWarnType")
    @Expose
    private String CardWarnType;

    /**
     * Get <p>请求体被加密后的密文（Base64编码），本接口只支持加密传输</p> 
     * @return EncryptedBody <p>请求体被加密后的密文（Base64编码），本接口只支持加密传输</p>
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set <p>请求体被加密后的密文（Base64编码），本接口只支持加密传输</p>
     * @param EncryptedBody <p>请求体被加密后的密文（Base64编码），本接口只支持加密传输</p>
     */
    public void setEncryptedBody(String EncryptedBody) {
        this.EncryptedBody = EncryptedBody;
    }

    /**
     * Get <p>敏感数据加密信息。对传入信息有加密需求的用户可使用此参数，详情请点击左侧链接。</p> 
     * @return Encryption <p>敏感数据加密信息。对传入信息有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>敏感数据加密信息。对传入信息有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
     * @param Encryption <p>敏感数据加密信息。对传入信息有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

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
     * Get <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片下载时间不超过 3 秒。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p> 
     * @return ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片下载时间不超过 3 秒。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片下载时间不超过 3 秒。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
     * @param ImageUrl <p>图片的 Url 地址。要求图片经Base64编码后不超过 10M，分辨率建议500*800以上，支持PNG、JPG、JPEG、BMP格式。建议卡片部分占据图片2/3以上。图片下载时间不超过 3 秒。建议图片存储于腾讯云，可保障更高的下载速度和稳定性。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>FRONT：身份证有照片的一面（人像面），<br>BACK：身份证有国徽的一面（国徽面），<br>该参数如果不填，将为您自动判断身份证正反面。</p> 
     * @return CardSide <p>FRONT：身份证有照片的一面（人像面），<br>BACK：身份证有国徽的一面（国徽面），<br>该参数如果不填，将为您自动判断身份证正反面。</p>
     */
    public String getCardSide() {
        return this.CardSide;
    }

    /**
     * Set <p>FRONT：身份证有照片的一面（人像面），<br>BACK：身份证有国徽的一面（国徽面），<br>该参数如果不填，将为您自动判断身份证正反面。</p>
     * @param CardSide <p>FRONT：身份证有照片的一面（人像面），<br>BACK：身份证有国徽的一面（国徽面），<br>该参数如果不填，将为您自动判断身份证正反面。</p>
     */
    public void setCardSide(String CardSide) {
        this.CardSide = CardSide;
    }

    /**
     * Get <p>以下可选字段均为bool 类型，默认false：<br>CropIdCard，身份证照片裁剪（去掉证件外多余的边缘、自动矫正拍摄角度）<br>CropPortrait，人像照片裁剪（自动抠取身份证头像区域）<br>CopyWarn，复印件告警<br>BorderCheckWarn，边框不完整和框内遮挡告警<br>ReshootWarn，屏幕翻拍告警<br>DetectPsWarn，疑似存在PS痕迹告警（CardWarnType参数为 Advanced时同时开启电子身份证、水印告警）<br>TempIdWarn，临时身份证告警<br>InvalidDateWarn，身份证有效日期不合法告警<br>Quality，图片质量分数（评价图片的模糊程度）<br>MultiCardDetect，是否开启正反面同框识别（仅支持二代身份证正反页同框识别或临时身份证正反页同框识别）<br>ReflectWarn，是否开启反光检测<br>SDK 设置方式参考：Config = Json.stringify({&quot;CropIdCard&quot;:true,&quot;CropPortrait&quot;:true})<br>API 3.0 Explorer 设置方式参考：Config = {&quot;CropIdCard&quot;:true,&quot;CropPortrait&quot;:true}</p> 
     * @return Config <p>以下可选字段均为bool 类型，默认false：<br>CropIdCard，身份证照片裁剪（去掉证件外多余的边缘、自动矫正拍摄角度）<br>CropPortrait，人像照片裁剪（自动抠取身份证头像区域）<br>CopyWarn，复印件告警<br>BorderCheckWarn，边框不完整和框内遮挡告警<br>ReshootWarn，屏幕翻拍告警<br>DetectPsWarn，疑似存在PS痕迹告警（CardWarnType参数为 Advanced时同时开启电子身份证、水印告警）<br>TempIdWarn，临时身份证告警<br>InvalidDateWarn，身份证有效日期不合法告警<br>Quality，图片质量分数（评价图片的模糊程度）<br>MultiCardDetect，是否开启正反面同框识别（仅支持二代身份证正反页同框识别或临时身份证正反页同框识别）<br>ReflectWarn，是否开启反光检测<br>SDK 设置方式参考：Config = Json.stringify({&quot;CropIdCard&quot;:true,&quot;CropPortrait&quot;:true})<br>API 3.0 Explorer 设置方式参考：Config = {&quot;CropIdCard&quot;:true,&quot;CropPortrait&quot;:true}</p>
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set <p>以下可选字段均为bool 类型，默认false：<br>CropIdCard，身份证照片裁剪（去掉证件外多余的边缘、自动矫正拍摄角度）<br>CropPortrait，人像照片裁剪（自动抠取身份证头像区域）<br>CopyWarn，复印件告警<br>BorderCheckWarn，边框不完整和框内遮挡告警<br>ReshootWarn，屏幕翻拍告警<br>DetectPsWarn，疑似存在PS痕迹告警（CardWarnType参数为 Advanced时同时开启电子身份证、水印告警）<br>TempIdWarn，临时身份证告警<br>InvalidDateWarn，身份证有效日期不合法告警<br>Quality，图片质量分数（评价图片的模糊程度）<br>MultiCardDetect，是否开启正反面同框识别（仅支持二代身份证正反页同框识别或临时身份证正反页同框识别）<br>ReflectWarn，是否开启反光检测<br>SDK 设置方式参考：Config = Json.stringify({&quot;CropIdCard&quot;:true,&quot;CropPortrait&quot;:true})<br>API 3.0 Explorer 设置方式参考：Config = {&quot;CropIdCard&quot;:true,&quot;CropPortrait&quot;:true}</p>
     * @param Config <p>以下可选字段均为bool 类型，默认false：<br>CropIdCard，身份证照片裁剪（去掉证件外多余的边缘、自动矫正拍摄角度）<br>CropPortrait，人像照片裁剪（自动抠取身份证头像区域）<br>CopyWarn，复印件告警<br>BorderCheckWarn，边框不完整和框内遮挡告警<br>ReshootWarn，屏幕翻拍告警<br>DetectPsWarn，疑似存在PS痕迹告警（CardWarnType参数为 Advanced时同时开启电子身份证、水印告警）<br>TempIdWarn，临时身份证告警<br>InvalidDateWarn，身份证有效日期不合法告警<br>Quality，图片质量分数（评价图片的模糊程度）<br>MultiCardDetect，是否开启正反面同框识别（仅支持二代身份证正反页同框识别或临时身份证正反页同框识别）<br>ReflectWarn，是否开启反光检测<br>SDK 设置方式参考：Config = Json.stringify({&quot;CropIdCard&quot;:true,&quot;CropPortrait&quot;:true})<br>API 3.0 Explorer 设置方式参考：Config = {&quot;CropIdCard&quot;:true,&quot;CropPortrait&quot;:true}</p>
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get <p>默认值为true，打开识别结果纠正开关。开关开启后，身份证号、出生日期、性别，三个字段会进行矫正补齐，统一结果输出；若关闭此开关，以上三个字段不会进行矫正补齐，保持原始识别结果输出，若原图出现篡改情况，这三个字段的识别结果可能会不统一。</p> 
     * @return EnableRecognitionRectify <p>默认值为true，打开识别结果纠正开关。开关开启后，身份证号、出生日期、性别，三个字段会进行矫正补齐，统一结果输出；若关闭此开关，以上三个字段不会进行矫正补齐，保持原始识别结果输出，若原图出现篡改情况，这三个字段的识别结果可能会不统一。</p>
     */
    public Boolean getEnableRecognitionRectify() {
        return this.EnableRecognitionRectify;
    }

    /**
     * Set <p>默认值为true，打开识别结果纠正开关。开关开启后，身份证号、出生日期、性别，三个字段会进行矫正补齐，统一结果输出；若关闭此开关，以上三个字段不会进行矫正补齐，保持原始识别结果输出，若原图出现篡改情况，这三个字段的识别结果可能会不统一。</p>
     * @param EnableRecognitionRectify <p>默认值为true，打开识别结果纠正开关。开关开启后，身份证号、出生日期、性别，三个字段会进行矫正补齐，统一结果输出；若关闭此开关，以上三个字段不会进行矫正补齐，保持原始识别结果输出，若原图出现篡改情况，这三个字段的识别结果可能会不统一。</p>
     */
    public void setEnableRecognitionRectify(Boolean EnableRecognitionRectify) {
        this.EnableRecognitionRectify = EnableRecognitionRectify;
    }

    /**
     * Get <p>默认值为false。</p><p>此开关需要在反光检测开关开启下才会生效（即此开关生效的前提是config入参里的&quot;ReflectWarn&quot;:true），若EnableReflectDetail设置为true，则会返回反光点覆盖区域详情。反光点覆盖区域详情分为四部分：人像照片位置、国徽位置、识别字段位置、其他位置。一个反光点允许覆盖多个区域，且一张图片可能存在多个反光点。</p> 
     * @return EnableReflectDetail <p>默认值为false。</p><p>此开关需要在反光检测开关开启下才会生效（即此开关生效的前提是config入参里的&quot;ReflectWarn&quot;:true），若EnableReflectDetail设置为true，则会返回反光点覆盖区域详情。反光点覆盖区域详情分为四部分：人像照片位置、国徽位置、识别字段位置、其他位置。一个反光点允许覆盖多个区域，且一张图片可能存在多个反光点。</p>
     */
    public Boolean getEnableReflectDetail() {
        return this.EnableReflectDetail;
    }

    /**
     * Set <p>默认值为false。</p><p>此开关需要在反光检测开关开启下才会生效（即此开关生效的前提是config入参里的&quot;ReflectWarn&quot;:true），若EnableReflectDetail设置为true，则会返回反光点覆盖区域详情。反光点覆盖区域详情分为四部分：人像照片位置、国徽位置、识别字段位置、其他位置。一个反光点允许覆盖多个区域，且一张图片可能存在多个反光点。</p>
     * @param EnableReflectDetail <p>默认值为false。</p><p>此开关需要在反光检测开关开启下才会生效（即此开关生效的前提是config入参里的&quot;ReflectWarn&quot;:true），若EnableReflectDetail设置为true，则会返回反光点覆盖区域详情。反光点覆盖区域详情分为四部分：人像照片位置、国徽位置、识别字段位置、其他位置。一个反光点允许覆盖多个区域，且一张图片可能存在多个反光点。</p>
     */
    public void setEnableReflectDetail(Boolean EnableReflectDetail) {
        this.EnableReflectDetail = EnableReflectDetail;
    }

    /**
     * Get <p>Basic：使用基础卡证告警能力（含基础PS告警）； Advanced：开启进阶PS告警能力，PS告警效果更佳但需要更长耗时；建议测试对比后选用，默认值为 Basic</p> 
     * @return CardWarnType <p>Basic：使用基础卡证告警能力（含基础PS告警）； Advanced：开启进阶PS告警能力，PS告警效果更佳但需要更长耗时；建议测试对比后选用，默认值为 Basic</p>
     */
    public String getCardWarnType() {
        return this.CardWarnType;
    }

    /**
     * Set <p>Basic：使用基础卡证告警能力（含基础PS告警）； Advanced：开启进阶PS告警能力，PS告警效果更佳但需要更长耗时；建议测试对比后选用，默认值为 Basic</p>
     * @param CardWarnType <p>Basic：使用基础卡证告警能力（含基础PS告警）； Advanced：开启进阶PS告警能力，PS告警效果更佳但需要更长耗时；建议测试对比后选用，默认值为 Basic</p>
     */
    public void setCardWarnType(String CardWarnType) {
        this.CardWarnType = CardWarnType;
    }

    public RecognizeEncryptedIDCardOCRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeEncryptedIDCardOCRRequest(RecognizeEncryptedIDCardOCRRequest source) {
        if (source.EncryptedBody != null) {
            this.EncryptedBody = new String(source.EncryptedBody);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.CardSide != null) {
            this.CardSide = new String(source.CardSide);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.EnableRecognitionRectify != null) {
            this.EnableRecognitionRectify = new Boolean(source.EnableRecognitionRectify);
        }
        if (source.EnableReflectDetail != null) {
            this.EnableReflectDetail = new Boolean(source.EnableReflectDetail);
        }
        if (source.CardWarnType != null) {
            this.CardWarnType = new String(source.CardWarnType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "CardSide", this.CardSide);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "EnableRecognitionRectify", this.EnableRecognitionRectify);
        this.setParamSimple(map, prefix + "EnableReflectDetail", this.EnableReflectDetail);
        this.setParamSimple(map, prefix + "CardWarnType", this.CardWarnType);

    }
}

