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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectAuthRequest extends AbstractModel {

    /**
    * 业务流程ID。
- 用于细分客户使用场景, 可为业务配置不同的业务流程。
- 申请开通服务后，登录腾讯云[慧眼人脸核身控制](https://console.cloud.tencent.com/faceid)进行创建，审核通过后即可调用。
- 如有疑问，请添加[腾讯云人脸核身小助手](https://cloud.tencent.com/document/product/1007/56130)进行咨询。
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
    * 验证人的身份证号码。
- 是否必传基于[控制台](https://console.cloud.tencent.com/faceid/access)申请业务流程时配置的提示。

    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 验证人的姓名。
- 是否必传基于[控制台](https://console.cloud.tencent.com/faceid/access)申请业务流程时配置的提示。
- 最长长度32位。中文请使用UTF-8编码。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 认证结束后重定向的回调链接地址。
- 最长长度1024位。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * 透传字段，在获取验证结果时返回。
- 最长长度1024位。
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * 用于人脸比对的图像数据，使用base64编码。
- Base64编码后的图片数据大小不超过3M。
- 仅支持jpg、png格式。
- 请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
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
    * 意愿核身（朗读模式）使用的文案。
- 若未使用意愿核身（朗读模式），则该字段无需传入。
- 最长可接受120的字符串长度。
    */
    @SerializedName("IntentionVerifyText")
    @Expose
    private String IntentionVerifyText;

    /**
    * 意愿核身（语音播报+语音回答模式）使用的文案。
- 包括：系统语音播报的文本、需要核验的标准文本。
- 问答模式支持1-10轮（不超过10轮）的意愿确认。
    */
    @SerializedName("IntentionQuestions")
    @Expose
    private IntentionQuestion [] IntentionQuestions;

    /**
    * 意愿核身（点头确认模式）使用的文案。
- 若未使用意愿核身（点头确认模式），则该字段无需传入。
- 点头确认模式支持1-10轮（不超过10轮）的意愿确认。
    */
    @SerializedName("IntentionActions")
    @Expose
    private IntentionActionConfig [] IntentionActions;

    /**
    * 意愿核身流程配置。
    */
    @SerializedName("Config")
    @Expose
    private RuleIdConfig Config;

    /**
     * Get 业务流程ID。
- 用于细分客户使用场景, 可为业务配置不同的业务流程。
- 申请开通服务后，登录腾讯云[慧眼人脸核身控制](https://console.cloud.tencent.com/faceid)进行创建，审核通过后即可调用。
- 如有疑问，请添加[腾讯云人脸核身小助手](https://cloud.tencent.com/document/product/1007/56130)进行咨询。 
     * @return RuleId 业务流程ID。
- 用于细分客户使用场景, 可为业务配置不同的业务流程。
- 申请开通服务后，登录腾讯云[慧眼人脸核身控制](https://console.cloud.tencent.com/faceid)进行创建，审核通过后即可调用。
- 如有疑问，请添加[腾讯云人脸核身小助手](https://cloud.tencent.com/document/product/1007/56130)进行咨询。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 业务流程ID。
- 用于细分客户使用场景, 可为业务配置不同的业务流程。
- 申请开通服务后，登录腾讯云[慧眼人脸核身控制](https://console.cloud.tencent.com/faceid)进行创建，审核通过后即可调用。
- 如有疑问，请添加[腾讯云人脸核身小助手](https://cloud.tencent.com/document/product/1007/56130)进行咨询。
     * @param RuleId 业务流程ID。
- 用于细分客户使用场景, 可为业务配置不同的业务流程。
- 申请开通服务后，登录腾讯云[慧眼人脸核身控制](https://console.cloud.tencent.com/faceid)进行创建，审核通过后即可调用。
- 如有疑问，请添加[腾讯云人脸核身小助手](https://cloud.tencent.com/document/product/1007/56130)进行咨询。
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
     * Get 验证人的身份证号码。
- 是否必传基于[控制台](https://console.cloud.tencent.com/faceid/access)申请业务流程时配置的提示。
 
     * @return IdCard 验证人的身份证号码。
- 是否必传基于[控制台](https://console.cloud.tencent.com/faceid/access)申请业务流程时配置的提示。

     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 验证人的身份证号码。
- 是否必传基于[控制台](https://console.cloud.tencent.com/faceid/access)申请业务流程时配置的提示。

     * @param IdCard 验证人的身份证号码。
- 是否必传基于[控制台](https://console.cloud.tencent.com/faceid/access)申请业务流程时配置的提示。

     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 验证人的姓名。
- 是否必传基于[控制台](https://console.cloud.tencent.com/faceid/access)申请业务流程时配置的提示。
- 最长长度32位。中文请使用UTF-8编码。 
     * @return Name 验证人的姓名。
- 是否必传基于[控制台](https://console.cloud.tencent.com/faceid/access)申请业务流程时配置的提示。
- 最长长度32位。中文请使用UTF-8编码。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 验证人的姓名。
- 是否必传基于[控制台](https://console.cloud.tencent.com/faceid/access)申请业务流程时配置的提示。
- 最长长度32位。中文请使用UTF-8编码。
     * @param Name 验证人的姓名。
- 是否必传基于[控制台](https://console.cloud.tencent.com/faceid/access)申请业务流程时配置的提示。
- 最长长度32位。中文请使用UTF-8编码。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 认证结束后重定向的回调链接地址。
- 最长长度1024位。 
     * @return RedirectUrl 认证结束后重定向的回调链接地址。
- 最长长度1024位。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 认证结束后重定向的回调链接地址。
- 最长长度1024位。
     * @param RedirectUrl 认证结束后重定向的回调链接地址。
- 最长长度1024位。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get 透传字段，在获取验证结果时返回。
- 最长长度1024位。 
     * @return Extra 透传字段，在获取验证结果时返回。
- 最长长度1024位。
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set 透传字段，在获取验证结果时返回。
- 最长长度1024位。
     * @param Extra 透传字段，在获取验证结果时返回。
- 最长长度1024位。
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 用于人脸比对的图像数据，使用base64编码。
- Base64编码后的图片数据大小不超过3M。
- 仅支持jpg、png格式。
- 请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。 
     * @return ImageBase64 用于人脸比对的图像数据，使用base64编码。
- Base64编码后的图片数据大小不超过3M。
- 仅支持jpg、png格式。
- 请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set 用于人脸比对的图像数据，使用base64编码。
- Base64编码后的图片数据大小不超过3M。
- 仅支持jpg、png格式。
- 请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
     * @param ImageBase64 用于人脸比对的图像数据，使用base64编码。
- Base64编码后的图片数据大小不超过3M。
- 仅支持jpg、png格式。
- 请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
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
     * Get 意愿核身（朗读模式）使用的文案。
- 若未使用意愿核身（朗读模式），则该字段无需传入。
- 最长可接受120的字符串长度。 
     * @return IntentionVerifyText 意愿核身（朗读模式）使用的文案。
- 若未使用意愿核身（朗读模式），则该字段无需传入。
- 最长可接受120的字符串长度。
     */
    public String getIntentionVerifyText() {
        return this.IntentionVerifyText;
    }

    /**
     * Set 意愿核身（朗读模式）使用的文案。
- 若未使用意愿核身（朗读模式），则该字段无需传入。
- 最长可接受120的字符串长度。
     * @param IntentionVerifyText 意愿核身（朗读模式）使用的文案。
- 若未使用意愿核身（朗读模式），则该字段无需传入。
- 最长可接受120的字符串长度。
     */
    public void setIntentionVerifyText(String IntentionVerifyText) {
        this.IntentionVerifyText = IntentionVerifyText;
    }

    /**
     * Get 意愿核身（语音播报+语音回答模式）使用的文案。
- 包括：系统语音播报的文本、需要核验的标准文本。
- 问答模式支持1-10轮（不超过10轮）的意愿确认。 
     * @return IntentionQuestions 意愿核身（语音播报+语音回答模式）使用的文案。
- 包括：系统语音播报的文本、需要核验的标准文本。
- 问答模式支持1-10轮（不超过10轮）的意愿确认。
     */
    public IntentionQuestion [] getIntentionQuestions() {
        return this.IntentionQuestions;
    }

    /**
     * Set 意愿核身（语音播报+语音回答模式）使用的文案。
- 包括：系统语音播报的文本、需要核验的标准文本。
- 问答模式支持1-10轮（不超过10轮）的意愿确认。
     * @param IntentionQuestions 意愿核身（语音播报+语音回答模式）使用的文案。
- 包括：系统语音播报的文本、需要核验的标准文本。
- 问答模式支持1-10轮（不超过10轮）的意愿确认。
     */
    public void setIntentionQuestions(IntentionQuestion [] IntentionQuestions) {
        this.IntentionQuestions = IntentionQuestions;
    }

    /**
     * Get 意愿核身（点头确认模式）使用的文案。
- 若未使用意愿核身（点头确认模式），则该字段无需传入。
- 点头确认模式支持1-10轮（不超过10轮）的意愿确认。 
     * @return IntentionActions 意愿核身（点头确认模式）使用的文案。
- 若未使用意愿核身（点头确认模式），则该字段无需传入。
- 点头确认模式支持1-10轮（不超过10轮）的意愿确认。
     */
    public IntentionActionConfig [] getIntentionActions() {
        return this.IntentionActions;
    }

    /**
     * Set 意愿核身（点头确认模式）使用的文案。
- 若未使用意愿核身（点头确认模式），则该字段无需传入。
- 点头确认模式支持1-10轮（不超过10轮）的意愿确认。
     * @param IntentionActions 意愿核身（点头确认模式）使用的文案。
- 若未使用意愿核身（点头确认模式），则该字段无需传入。
- 点头确认模式支持1-10轮（不超过10轮）的意愿确认。
     */
    public void setIntentionActions(IntentionActionConfig [] IntentionActions) {
        this.IntentionActions = IntentionActions;
    }

    /**
     * Get 意愿核身流程配置。 
     * @return Config 意愿核身流程配置。
     */
    public RuleIdConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 意愿核身流程配置。
     * @param Config 意愿核身流程配置。
     */
    public void setConfig(RuleIdConfig Config) {
        this.Config = Config;
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
        if (source.IntentionQuestions != null) {
            this.IntentionQuestions = new IntentionQuestion[source.IntentionQuestions.length];
            for (int i = 0; i < source.IntentionQuestions.length; i++) {
                this.IntentionQuestions[i] = new IntentionQuestion(source.IntentionQuestions[i]);
            }
        }
        if (source.IntentionActions != null) {
            this.IntentionActions = new IntentionActionConfig[source.IntentionActions.length];
            for (int i = 0; i < source.IntentionActions.length; i++) {
                this.IntentionActions[i] = new IntentionActionConfig(source.IntentionActions[i]);
            }
        }
        if (source.Config != null) {
            this.Config = new RuleIdConfig(source.Config);
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
        this.setParamArrayObj(map, prefix + "IntentionQuestions.", this.IntentionQuestions);
        this.setParamArrayObj(map, prefix + "IntentionActions.", this.IntentionActions);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

