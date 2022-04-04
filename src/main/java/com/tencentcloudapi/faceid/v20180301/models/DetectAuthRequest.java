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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectAuthRequest extends AbstractModel{

    /**
    * 用于细分客户使用场景，申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。如有疑问，请添加[腾讯云人脸核身小助手](https://cloud.tencent.com/document/product/1007/56130)进行咨询。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 本接口不需要传递此参数。
    */
    @SerializedName("TerminalType")
    @Expose
    private String TerminalType;

    /**
    * 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 认证结束后重定向的回调链接地址。最长长度1024位。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * 透传字段，在获取验证结果时返回。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 用于人脸比对的照片，图片的Base64值；
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * 意愿核身使用的文案，若未使用意愿核身功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
    */
    @SerializedName("IntentionVerifyText")
    @Expose
    private String IntentionVerifyText;

    /**
     * Get 用于细分客户使用场景，申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。如有疑问，请添加[腾讯云人脸核身小助手](https://cloud.tencent.com/document/product/1007/56130)进行咨询。 
     * @return RuleId 用于细分客户使用场景，申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。如有疑问，请添加[腾讯云人脸核身小助手](https://cloud.tencent.com/document/product/1007/56130)进行咨询。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 用于细分客户使用场景，申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。如有疑问，请添加[腾讯云人脸核身小助手](https://cloud.tencent.com/document/product/1007/56130)进行咨询。
     * @param RuleId 用于细分客户使用场景，申请开通服务后，可以在腾讯云慧眼人脸核身控制台（https://console.cloud.tencent.com/faceid） 自助接入里面创建，审核通过后即可调用。如有疑问，请添加[腾讯云人脸核身小助手](https://cloud.tencent.com/document/product/1007/56130)进行咨询。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 本接口不需要传递此参数。 
     * @return TerminalType 本接口不需要传递此参数。
     */
    public String getTerminalType() {
        return this.TerminalType;
    }

    /**
     * Set 本接口不需要传递此参数。
     * @param TerminalType 本接口不需要传递此参数。
     */
    public void setTerminalType(String TerminalType) {
        this.TerminalType = TerminalType;
    }

    /**
     * Get 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。 
     * @return IdCard 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
     * @param IdCard 身份标识（未使用OCR服务时，必须传入）。
规则：a-zA-Z0-9组合。最长长度32位。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。 
     * @return Name 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
     * @param Name 姓名。（未使用OCR服务时，必须传入）最长长度32位。中文请使用UTF-8编码。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 认证结束后重定向的回调链接地址。最长长度1024位。 
     * @return RedirectUrl 认证结束后重定向的回调链接地址。最长长度1024位。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 认证结束后重定向的回调链接地址。最长长度1024位。
     * @param RedirectUrl 认证结束后重定向的回调链接地址。最长长度1024位。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get 透传字段，在获取验证结果时返回。 
     * @return Extra 透传字段，在获取验证结果时返回。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 透传字段，在获取验证结果时返回。
     * @param Extra 透传字段，在获取验证结果时返回。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 用于人脸比对的照片，图片的Base64值；
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。 
     * @return ImageBase64 用于人脸比对的照片，图片的Base64值；
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 用于人脸比对的照片，图片的Base64值；
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     * @param ImageBase64 用于人脸比对的照片，图片的Base64值；
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。 
     * @return Encryption 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     * @param Encryption 敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get 意愿核身使用的文案，若未使用意愿核身功能，该字段无需传入。默认为空，最长可接受120的字符串长度。 
     * @return IntentionVerifyText 意愿核身使用的文案，若未使用意愿核身功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
     */
    public String getIntentionVerifyText() {
        return this.IntentionVerifyText;
    }

    /**
     * Set 意愿核身使用的文案，若未使用意愿核身功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
     * @param IntentionVerifyText 意愿核身使用的文案，若未使用意愿核身功能，该字段无需传入。默认为空，最长可接受120的字符串长度。
     */
    public void setIntentionVerifyText(String IntentionVerifyText) {
        this.IntentionVerifyText = IntentionVerifyText;
    }

    public DetectAuthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectAuthRequest(DetectAuthRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.TerminalType != null) {
            this.TerminalType = new String(source.TerminalType);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.ImageBase64 != null) {
            this.ImageBase64 = new String(source.ImageBase64);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.IntentionVerifyText != null) {
            this.IntentionVerifyText = new String(source.IntentionVerifyText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "TerminalType", this.TerminalType);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "IntentionVerifyText", this.IntentionVerifyText);

    }
}

