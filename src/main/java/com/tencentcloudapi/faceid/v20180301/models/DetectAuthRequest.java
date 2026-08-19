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
    * <p>业务流程ID。</p><ul><li>用于细分客户使用场景, 可为业务配置不同的业务流程。</li><li>申请开通服务后，登录腾讯云<a href="https://console.cloud.tencent.com/faceid">慧眼人脸核身控制</a>进行创建，审核通过后即可调用。</li><li>如有疑问，请添加<a href="https://cloud.tencent.com/document/product/1007/56130">腾讯云人脸核身小助手</a>进行咨询。</li></ul>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>本接口不需要传递此参数。</p>
    */
    @SerializedName("TerminalType")
    @Expose
    private String TerminalType;

    /**
    * <p>验证人的身份证号码。</p><ul><li>调用 detectAuth 时，该字段是否必传，以在<a href="https://console.cloud.tencent.com/faceid/access">控制台</a>申请 ruleId 时的配置提示为准，具体必填字段请参阅控制台界面。</li><li>若身份证号包含字母，该字母必须为大写 X，小写 x 将无法通过校验。</li></ul>
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * <p>验证人的姓名。</p><ul><li>调用 detectAuth 时，该字段是否必传，以在<a href="https://console.cloud.tencent.com/faceid/access">控制台</a>申请 ruleId 时的配置提示为准，具体必填字段请参阅控制台界面。</li><li>最长长度32位。中文请使用UTF-8编码。</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>认证结束后重定向的回调链接地址，仅微信H5场景使用。</p><ul><li>最长长度1024位。</li><li>默认值：[腾讯云人脸核身产品介绍页](URL Here)https://cloud.tencent.com/product/faceid?Is=sdk-topnav</li></ul>
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * <p>透传字段，在获取验证结果时返回。</p><ul><li>最长长度1024位。</li></ul>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>用于人脸比对的图像数据，使用base64编码。</p><ul><li>Base64编码后的图片数据大小不超过3M。</li><li>仅支持jpg、png格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * <p>敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>意愿核身（朗读模式）使用的文案。</p><ul><li>若未使用意愿核身（朗读模式），则该字段无需传入。</li><li>最长可接受120的字符串长度。</li></ul>
    */
    @SerializedName("IntentionVerifyText")
    @Expose
    private String IntentionVerifyText;

    /**
    * <p>意愿核身（语音播报+语音回答模式）使用的文案。</p><ul><li>包括：系统语音播报的文本、需要核验的标准文本。</li><li>问答模式支持1-10轮（不超过10轮）的意愿确认。</li></ul>
    */
    @SerializedName("IntentionQuestions")
    @Expose
    private IntentionQuestion [] IntentionQuestions;

    /**
    * <p>意愿核身（点头确认模式）使用的文案。</p><ul><li>若未使用意愿核身（点头确认模式），则该字段无需传入。</li><li>点头确认模式支持1-10轮（不超过10轮）的意愿确认。</li></ul>
    */
    @SerializedName("IntentionActions")
    @Expose
    private IntentionActionConfig [] IntentionActions;

    /**
    * <p>意愿核身流程配置。</p>
    */
    @SerializedName("Config")
    @Expose
    private RuleIdConfig Config;

    /**
     * Get <p>业务流程ID。</p><ul><li>用于细分客户使用场景, 可为业务配置不同的业务流程。</li><li>申请开通服务后，登录腾讯云<a href="https://console.cloud.tencent.com/faceid">慧眼人脸核身控制</a>进行创建，审核通过后即可调用。</li><li>如有疑问，请添加<a href="https://cloud.tencent.com/document/product/1007/56130">腾讯云人脸核身小助手</a>进行咨询。</li></ul> 
     * @return RuleId <p>业务流程ID。</p><ul><li>用于细分客户使用场景, 可为业务配置不同的业务流程。</li><li>申请开通服务后，登录腾讯云<a href="https://console.cloud.tencent.com/faceid">慧眼人脸核身控制</a>进行创建，审核通过后即可调用。</li><li>如有疑问，请添加<a href="https://cloud.tencent.com/document/product/1007/56130">腾讯云人脸核身小助手</a>进行咨询。</li></ul>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>业务流程ID。</p><ul><li>用于细分客户使用场景, 可为业务配置不同的业务流程。</li><li>申请开通服务后，登录腾讯云<a href="https://console.cloud.tencent.com/faceid">慧眼人脸核身控制</a>进行创建，审核通过后即可调用。</li><li>如有疑问，请添加<a href="https://cloud.tencent.com/document/product/1007/56130">腾讯云人脸核身小助手</a>进行咨询。</li></ul>
     * @param RuleId <p>业务流程ID。</p><ul><li>用于细分客户使用场景, 可为业务配置不同的业务流程。</li><li>申请开通服务后，登录腾讯云<a href="https://console.cloud.tencent.com/faceid">慧眼人脸核身控制</a>进行创建，审核通过后即可调用。</li><li>如有疑问，请添加<a href="https://cloud.tencent.com/document/product/1007/56130">腾讯云人脸核身小助手</a>进行咨询。</li></ul>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>本接口不需要传递此参数。</p> 
     * @return TerminalType <p>本接口不需要传递此参数。</p>
     */
    public String getTerminalType() {
        return this.TerminalType;
    }

    /**
     * Set <p>本接口不需要传递此参数。</p>
     * @param TerminalType <p>本接口不需要传递此参数。</p>
     */
    public void setTerminalType(String TerminalType) {
        this.TerminalType = TerminalType;
    }

    /**
     * Get <p>验证人的身份证号码。</p><ul><li>调用 detectAuth 时，该字段是否必传，以在<a href="https://console.cloud.tencent.com/faceid/access">控制台</a>申请 ruleId 时的配置提示为准，具体必填字段请参阅控制台界面。</li><li>若身份证号包含字母，该字母必须为大写 X，小写 x 将无法通过校验。</li></ul> 
     * @return IdCard <p>验证人的身份证号码。</p><ul><li>调用 detectAuth 时，该字段是否必传，以在<a href="https://console.cloud.tencent.com/faceid/access">控制台</a>申请 ruleId 时的配置提示为准，具体必填字段请参阅控制台界面。</li><li>若身份证号包含字母，该字母必须为大写 X，小写 x 将无法通过校验。</li></ul>
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set <p>验证人的身份证号码。</p><ul><li>调用 detectAuth 时，该字段是否必传，以在<a href="https://console.cloud.tencent.com/faceid/access">控制台</a>申请 ruleId 时的配置提示为准，具体必填字段请参阅控制台界面。</li><li>若身份证号包含字母，该字母必须为大写 X，小写 x 将无法通过校验。</li></ul>
     * @param IdCard <p>验证人的身份证号码。</p><ul><li>调用 detectAuth 时，该字段是否必传，以在<a href="https://console.cloud.tencent.com/faceid/access">控制台</a>申请 ruleId 时的配置提示为准，具体必填字段请参阅控制台界面。</li><li>若身份证号包含字母，该字母必须为大写 X，小写 x 将无法通过校验。</li></ul>
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get <p>验证人的姓名。</p><ul><li>调用 detectAuth 时，该字段是否必传，以在<a href="https://console.cloud.tencent.com/faceid/access">控制台</a>申请 ruleId 时的配置提示为准，具体必填字段请参阅控制台界面。</li><li>最长长度32位。中文请使用UTF-8编码。</li></ul> 
     * @return Name <p>验证人的姓名。</p><ul><li>调用 detectAuth 时，该字段是否必传，以在<a href="https://console.cloud.tencent.com/faceid/access">控制台</a>申请 ruleId 时的配置提示为准，具体必填字段请参阅控制台界面。</li><li>最长长度32位。中文请使用UTF-8编码。</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>验证人的姓名。</p><ul><li>调用 detectAuth 时，该字段是否必传，以在<a href="https://console.cloud.tencent.com/faceid/access">控制台</a>申请 ruleId 时的配置提示为准，具体必填字段请参阅控制台界面。</li><li>最长长度32位。中文请使用UTF-8编码。</li></ul>
     * @param Name <p>验证人的姓名。</p><ul><li>调用 detectAuth 时，该字段是否必传，以在<a href="https://console.cloud.tencent.com/faceid/access">控制台</a>申请 ruleId 时的配置提示为准，具体必填字段请参阅控制台界面。</li><li>最长长度32位。中文请使用UTF-8编码。</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>认证结束后重定向的回调链接地址，仅微信H5场景使用。</p><ul><li>最长长度1024位。</li><li>默认值：[腾讯云人脸核身产品介绍页](URL Here)https://cloud.tencent.com/product/faceid?Is=sdk-topnav</li></ul> 
     * @return RedirectUrl <p>认证结束后重定向的回调链接地址，仅微信H5场景使用。</p><ul><li>最长长度1024位。</li><li>默认值：[腾讯云人脸核身产品介绍页](URL Here)https://cloud.tencent.com/product/faceid?Is=sdk-topnav</li></ul>
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set <p>认证结束后重定向的回调链接地址，仅微信H5场景使用。</p><ul><li>最长长度1024位。</li><li>默认值：[腾讯云人脸核身产品介绍页](URL Here)https://cloud.tencent.com/product/faceid?Is=sdk-topnav</li></ul>
     * @param RedirectUrl <p>认证结束后重定向的回调链接地址，仅微信H5场景使用。</p><ul><li>最长长度1024位。</li><li>默认值：[腾讯云人脸核身产品介绍页](URL Here)https://cloud.tencent.com/product/faceid?Is=sdk-topnav</li></ul>
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get <p>透传字段，在获取验证结果时返回。</p><ul><li>最长长度1024位。</li></ul> 
     * @return Extra <p>透传字段，在获取验证结果时返回。</p><ul><li>最长长度1024位。</li></ul>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>透传字段，在获取验证结果时返回。</p><ul><li>最长长度1024位。</li></ul>
     * @param Extra <p>透传字段，在获取验证结果时返回。</p><ul><li>最长长度1024位。</li></ul>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>用于人脸比对的图像数据，使用base64编码。</p><ul><li>Base64编码后的图片数据大小不超过3M。</li><li>仅支持jpg、png格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul> 
     * @return ImageBase64 <p>用于人脸比对的图像数据，使用base64编码。</p><ul><li>Base64编码后的图片数据大小不超过3M。</li><li>仅支持jpg、png格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * Set <p>用于人脸比对的图像数据，使用base64编码。</p><ul><li>Base64编码后的图片数据大小不超过3M。</li><li>仅支持jpg、png格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
     * @param ImageBase64 <p>用于人脸比对的图像数据，使用base64编码。</p><ul><li>Base64编码后的图片数据大小不超过3M。</li><li>仅支持jpg、png格式。</li><li>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</li></ul>
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * Get <p>敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</p> 
     * @return Encryption <p>敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
     * @param Encryption <p>敏感数据加密信息。对传入信息（姓名、身份证号）有加密需求的用户可使用此参数，详情请点击左侧链接。</p>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>意愿核身（朗读模式）使用的文案。</p><ul><li>若未使用意愿核身（朗读模式），则该字段无需传入。</li><li>最长可接受120的字符串长度。</li></ul> 
     * @return IntentionVerifyText <p>意愿核身（朗读模式）使用的文案。</p><ul><li>若未使用意愿核身（朗读模式），则该字段无需传入。</li><li>最长可接受120的字符串长度。</li></ul>
     */
    public String getIntentionVerifyText() {
        return this.IntentionVerifyText;
    }

    /**
     * Set <p>意愿核身（朗读模式）使用的文案。</p><ul><li>若未使用意愿核身（朗读模式），则该字段无需传入。</li><li>最长可接受120的字符串长度。</li></ul>
     * @param IntentionVerifyText <p>意愿核身（朗读模式）使用的文案。</p><ul><li>若未使用意愿核身（朗读模式），则该字段无需传入。</li><li>最长可接受120的字符串长度。</li></ul>
     */
    public void setIntentionVerifyText(String IntentionVerifyText) {
        this.IntentionVerifyText = IntentionVerifyText;
    }

    /**
     * Get <p>意愿核身（语音播报+语音回答模式）使用的文案。</p><ul><li>包括：系统语音播报的文本、需要核验的标准文本。</li><li>问答模式支持1-10轮（不超过10轮）的意愿确认。</li></ul> 
     * @return IntentionQuestions <p>意愿核身（语音播报+语音回答模式）使用的文案。</p><ul><li>包括：系统语音播报的文本、需要核验的标准文本。</li><li>问答模式支持1-10轮（不超过10轮）的意愿确认。</li></ul>
     */
    public IntentionQuestion [] getIntentionQuestions() {
        return this.IntentionQuestions;
    }

    /**
     * Set <p>意愿核身（语音播报+语音回答模式）使用的文案。</p><ul><li>包括：系统语音播报的文本、需要核验的标准文本。</li><li>问答模式支持1-10轮（不超过10轮）的意愿确认。</li></ul>
     * @param IntentionQuestions <p>意愿核身（语音播报+语音回答模式）使用的文案。</p><ul><li>包括：系统语音播报的文本、需要核验的标准文本。</li><li>问答模式支持1-10轮（不超过10轮）的意愿确认。</li></ul>
     */
    public void setIntentionQuestions(IntentionQuestion [] IntentionQuestions) {
        this.IntentionQuestions = IntentionQuestions;
    }

    /**
     * Get <p>意愿核身（点头确认模式）使用的文案。</p><ul><li>若未使用意愿核身（点头确认模式），则该字段无需传入。</li><li>点头确认模式支持1-10轮（不超过10轮）的意愿确认。</li></ul> 
     * @return IntentionActions <p>意愿核身（点头确认模式）使用的文案。</p><ul><li>若未使用意愿核身（点头确认模式），则该字段无需传入。</li><li>点头确认模式支持1-10轮（不超过10轮）的意愿确认。</li></ul>
     */
    public IntentionActionConfig [] getIntentionActions() {
        return this.IntentionActions;
    }

    /**
     * Set <p>意愿核身（点头确认模式）使用的文案。</p><ul><li>若未使用意愿核身（点头确认模式），则该字段无需传入。</li><li>点头确认模式支持1-10轮（不超过10轮）的意愿确认。</li></ul>
     * @param IntentionActions <p>意愿核身（点头确认模式）使用的文案。</p><ul><li>若未使用意愿核身（点头确认模式），则该字段无需传入。</li><li>点头确认模式支持1-10轮（不超过10轮）的意愿确认。</li></ul>
     */
    public void setIntentionActions(IntentionActionConfig [] IntentionActions) {
        this.IntentionActions = IntentionActions;
    }

    /**
     * Get <p>意愿核身流程配置。</p> 
     * @return Config <p>意愿核身流程配置。</p>
     */
    public RuleIdConfig getConfig() {
        return this.Config;
    }

    /**
     * Set <p>意愿核身流程配置。</p>
     * @param Config <p>意愿核身流程配置。</p>
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

