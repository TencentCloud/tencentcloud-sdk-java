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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SMSProviderTemplateConfig extends AbstractModel {

    /**
    * <p>短信服务商类型</p><p>枚举值：</p><ul><li>TENCENT_CN： 腾讯云国内短信</li><li>TENCENT_INTL： 腾讯云国际短信</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * <p>短信服务商侧申请并审核通过的模板ID。</p><ul><li>腾讯云短信模板ID可前往 <a href="https://console.cloud.tencent.com/smsv2/csms-template">腾讯云国内短信</a> 或 <a href="https://console.cloud.tencent.com/smsv2/isms-template">国际/港澳台短信</a> 的正文模板管理查看，若向境外手机号发送短信，仅支持使用国际/港澳台短信模板。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>短信服务商侧为应用分配的ID，按照服务商文档和要求需要此参数的，填写该参数。</p><ul><li>腾讯云国内短信和国际短信此参数必填，可以在<a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>的应用列表中查看对应的应用id。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * <p>短信服务商侧申请并审核通过的签名，按照服务商的文档和要求填写。</p><ul><li>腾讯云短信服务商，签名信息可前往 <a href="https://console.cloud.tencent.com/smsv2/csms-sign">国内短信</a> 或 <a href="https://console.cloud.tencent.com/smsv2/isms-sign">国际/港澳台短信</a> 的签名管理查看。<br> 注意：<ol><li>发送国内短信该参数必填，且需填写签名内容而非签名ID。</li><li>发送国际/港澳台短信该参数非必填。</li></ol></li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * <p>凭证获取方式，不传默认为 SMS_AUTH_SECRET_KEY。</p><p>枚举值：</p><ul><li>SMS_AUTH_SECRET_KEY： 密钥授权，适用于跨账号腾讯云短信 / 其它厂商短信，AK/SK 加密托管至云开发平台控制台—扩展功能—授权管理</li><li>SMS_AUTH_ASSUME_ROLE： 策略授权（角色扮演），适用于同账号腾讯云短信，需预先将短信预设策略 QcloudSMSFullAccess 授权给云开发服务角色，平台以临时凭证代发，不保存任何长期密钥。选择该方式时 SecretId / SecretKey / CredentialAuthKeyId 必须为空</li></ul><p>枚举值：</p><ul><li>SMS_AUTH_SECRET_KEY： 密钥授权，适用于跨账号腾讯云短信 / 其它厂商短信，AK/SK 加密托管至云开发平台控制台—扩展功能—授权管理</li><li>SMS_AUTH_ASSUME_ROLE： 策略授权（角色扮演），适用于同账号腾讯云短信，需预先将短信预设策略 QcloudSMSFullAccess 授权给云开发服务角色，平台以临时凭证代发，不保存任何长期密钥。选择该方式时 SecretId / SecretKey / CredentialAuthKeyId 必须为空</li></ul><p>默认值：SMS_AUTH_SECRET_KEY</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthType")
    @Expose
    private String AuthType;

    /**
    * <p>调用短信服务商发送短信接口的调用秘钥对应的ID。</p><ul><li>调用api秘钥会保存在云开发平台控制台—扩展功能—授权管理中，如果对于短信调用的api秘钥有删除需求，可在此处进行删除，删除后，短信将无法正常发送。</li><li>腾讯云的调用api秘钥在腾讯云控制台获取，建议使用子账号的秘钥ID，并且按照最小权限配置。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>调用短信服务商发送短信接口的调用api秘钥对应的秘钥Key。</p><ul><li>腾讯云的调用api秘钥在腾讯云控制台获取，建议使用子账号的秘钥ID, 并且按照最小权限配置。平台对于调用api秘钥key是加密存储的，不会明文存储。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>短信服务商侧自定义短信发送的senderID，按照服务商文档和要求传参。</p><ul><li>仅国际化场景使用。部分国家/运营商支持自定义 Sender ID替代默认主叫号码。国内站点忽略此字段。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SenderId")
    @Expose
    private String SenderId;

    /**
    * <p>当短信自定义模板含多个占位符时，平台只负责生成验证码值，其余占位符由调用方在此提供。</p><ul><li>无需提供验证码对应的占位的值，验证码由云开发平台侧生成。</li><li>如果是命名占位的服务商的短信模板，这里的参数按照需要对应的占位的key和value，会按照对应的key和value在发送短信时，填充到模板中。</li><li>如果是序号占位的服务商的短信模板，这里的参数不需要key, 只需要填写对应的value, 会按照填写的顺序依次填充到模板中。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateExtendParam")
    @Expose
    private SMSTemplateParams [] TemplateExtendParam;

    /**
    * <p>授权管理中密钥的自定义标识（创建 / 引用二合一），与 SecretId / SecretKey 组合决定行为：</p><ul><li>非空 + 带 SecretId/SecretKey → 以该标识创建新密钥；标识已存在时报错（keyID already exists）</li><li>非空 + 不带 SecretId/SecretKey → 引用授权管理中已存在的密钥（需归属当前环境）</li><li>空 + 带 SecretId/SecretKey → 使用平台按服务商生成的固定标识，覆盖更新（存量兼容）</li><li>空 + 不带 SecretId/SecretKey → 不修改密钥，沿用既有配置</li></ul><p>AuthType 为 SMS_AUTH_ASSUME_ROLE 时此参数必须为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CredentialAuthKeyId")
    @Expose
    private String CredentialAuthKeyId;

    /**
     * Get <p>短信服务商类型</p><p>枚举值：</p><ul><li>TENCENT_CN： 腾讯云国内短信</li><li>TENCENT_INTL： 腾讯云国际短信</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vendor <p>短信服务商类型</p><p>枚举值：</p><ul><li>TENCENT_CN： 腾讯云国内短信</li><li>TENCENT_INTL： 腾讯云国际短信</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>短信服务商类型</p><p>枚举值：</p><ul><li>TENCENT_CN： 腾讯云国内短信</li><li>TENCENT_INTL： 腾讯云国际短信</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vendor <p>短信服务商类型</p><p>枚举值：</p><ul><li>TENCENT_CN： 腾讯云国内短信</li><li>TENCENT_INTL： 腾讯云国际短信</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get <p>短信服务商侧申请并审核通过的模板ID。</p><ul><li>腾讯云短信模板ID可前往 <a href="https://console.cloud.tencent.com/smsv2/csms-template">腾讯云国内短信</a> 或 <a href="https://console.cloud.tencent.com/smsv2/isms-template">国际/港澳台短信</a> 的正文模板管理查看，若向境外手机号发送短信，仅支持使用国际/港澳台短信模板。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId <p>短信服务商侧申请并审核通过的模板ID。</p><ul><li>腾讯云短信模板ID可前往 <a href="https://console.cloud.tencent.com/smsv2/csms-template">腾讯云国内短信</a> 或 <a href="https://console.cloud.tencent.com/smsv2/isms-template">国际/港澳台短信</a> 的正文模板管理查看，若向境外手机号发送短信，仅支持使用国际/港澳台短信模板。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>短信服务商侧申请并审核通过的模板ID。</p><ul><li>腾讯云短信模板ID可前往 <a href="https://console.cloud.tencent.com/smsv2/csms-template">腾讯云国内短信</a> 或 <a href="https://console.cloud.tencent.com/smsv2/isms-template">国际/港澳台短信</a> 的正文模板管理查看，若向境外手机号发送短信，仅支持使用国际/港澳台短信模板。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId <p>短信服务商侧申请并审核通过的模板ID。</p><ul><li>腾讯云短信模板ID可前往 <a href="https://console.cloud.tencent.com/smsv2/csms-template">腾讯云国内短信</a> 或 <a href="https://console.cloud.tencent.com/smsv2/isms-template">国际/港澳台短信</a> 的正文模板管理查看，若向境外手机号发送短信，仅支持使用国际/港澳台短信模板。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>短信服务商侧为应用分配的ID，按照服务商文档和要求需要此参数的，填写该参数。</p><ul><li>腾讯云国内短信和国际短信此参数必填，可以在<a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>的应用列表中查看对应的应用id。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SdkAppId <p>短信服务商侧为应用分配的ID，按照服务商文档和要求需要此参数的，填写该参数。</p><ul><li>腾讯云国内短信和国际短信此参数必填，可以在<a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>的应用列表中查看对应的应用id。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>短信服务商侧为应用分配的ID，按照服务商文档和要求需要此参数的，填写该参数。</p><ul><li>腾讯云国内短信和国际短信此参数必填，可以在<a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>的应用列表中查看对应的应用id。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SdkAppId <p>短信服务商侧为应用分配的ID，按照服务商文档和要求需要此参数的，填写该参数。</p><ul><li>腾讯云国内短信和国际短信此参数必填，可以在<a href="https://console.cloud.tencent.com/smsv2/app-manage">短信控制台</a>的应用列表中查看对应的应用id。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>短信服务商侧申请并审核通过的签名，按照服务商的文档和要求填写。</p><ul><li>腾讯云短信服务商，签名信息可前往 <a href="https://console.cloud.tencent.com/smsv2/csms-sign">国内短信</a> 或 <a href="https://console.cloud.tencent.com/smsv2/isms-sign">国际/港澳台短信</a> 的签名管理查看。<br> 注意：<ol><li>发送国内短信该参数必填，且需填写签名内容而非签名ID。</li><li>发送国际/港澳台短信该参数非必填。</li></ol></li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignName <p>短信服务商侧申请并审核通过的签名，按照服务商的文档和要求填写。</p><ul><li>腾讯云短信服务商，签名信息可前往 <a href="https://console.cloud.tencent.com/smsv2/csms-sign">国内短信</a> 或 <a href="https://console.cloud.tencent.com/smsv2/isms-sign">国际/港澳台短信</a> 的签名管理查看。<br> 注意：<ol><li>发送国内短信该参数必填，且需填写签名内容而非签名ID。</li><li>发送国际/港澳台短信该参数非必填。</li></ol></li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set <p>短信服务商侧申请并审核通过的签名，按照服务商的文档和要求填写。</p><ul><li>腾讯云短信服务商，签名信息可前往 <a href="https://console.cloud.tencent.com/smsv2/csms-sign">国内短信</a> 或 <a href="https://console.cloud.tencent.com/smsv2/isms-sign">国际/港澳台短信</a> 的签名管理查看。<br> 注意：<ol><li>发送国内短信该参数必填，且需填写签名内容而非签名ID。</li><li>发送国际/港澳台短信该参数非必填。</li></ol></li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignName <p>短信服务商侧申请并审核通过的签名，按照服务商的文档和要求填写。</p><ul><li>腾讯云短信服务商，签名信息可前往 <a href="https://console.cloud.tencent.com/smsv2/csms-sign">国内短信</a> 或 <a href="https://console.cloud.tencent.com/smsv2/isms-sign">国际/港澳台短信</a> 的签名管理查看。<br> 注意：<ol><li>发送国内短信该参数必填，且需填写签名内容而非签名ID。</li><li>发送国际/港澳台短信该参数非必填。</li></ol></li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    /**
     * Get <p>凭证获取方式，不传默认为 SMS_AUTH_SECRET_KEY。</p><p>枚举值：</p><ul><li>SMS_AUTH_SECRET_KEY： 密钥授权，适用于跨账号腾讯云短信 / 其它厂商短信，AK/SK 加密托管至云开发平台控制台—扩展功能—授权管理</li><li>SMS_AUTH_ASSUME_ROLE： 策略授权（角色扮演），适用于同账号腾讯云短信，需预先将短信预设策略 QcloudSMSFullAccess 授权给云开发服务角色，平台以临时凭证代发，不保存任何长期密钥。选择该方式时 SecretId / SecretKey / CredentialAuthKeyId 必须为空</li></ul><p>枚举值：</p><ul><li>SMS_AUTH_SECRET_KEY： 密钥授权，适用于跨账号腾讯云短信 / 其它厂商短信，AK/SK 加密托管至云开发平台控制台—扩展功能—授权管理</li><li>SMS_AUTH_ASSUME_ROLE： 策略授权（角色扮演），适用于同账号腾讯云短信，需预先将短信预设策略 QcloudSMSFullAccess 授权给云开发服务角色，平台以临时凭证代发，不保存任何长期密钥。选择该方式时 SecretId / SecretKey / CredentialAuthKeyId 必须为空</li></ul><p>默认值：SMS_AUTH_SECRET_KEY</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthType <p>凭证获取方式，不传默认为 SMS_AUTH_SECRET_KEY。</p><p>枚举值：</p><ul><li>SMS_AUTH_SECRET_KEY： 密钥授权，适用于跨账号腾讯云短信 / 其它厂商短信，AK/SK 加密托管至云开发平台控制台—扩展功能—授权管理</li><li>SMS_AUTH_ASSUME_ROLE： 策略授权（角色扮演），适用于同账号腾讯云短信，需预先将短信预设策略 QcloudSMSFullAccess 授权给云开发服务角色，平台以临时凭证代发，不保存任何长期密钥。选择该方式时 SecretId / SecretKey / CredentialAuthKeyId 必须为空</li></ul><p>枚举值：</p><ul><li>SMS_AUTH_SECRET_KEY： 密钥授权，适用于跨账号腾讯云短信 / 其它厂商短信，AK/SK 加密托管至云开发平台控制台—扩展功能—授权管理</li><li>SMS_AUTH_ASSUME_ROLE： 策略授权（角色扮演），适用于同账号腾讯云短信，需预先将短信预设策略 QcloudSMSFullAccess 授权给云开发服务角色，平台以临时凭证代发，不保存任何长期密钥。选择该方式时 SecretId / SecretKey / CredentialAuthKeyId 必须为空</li></ul><p>默认值：SMS_AUTH_SECRET_KEY</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>凭证获取方式，不传默认为 SMS_AUTH_SECRET_KEY。</p><p>枚举值：</p><ul><li>SMS_AUTH_SECRET_KEY： 密钥授权，适用于跨账号腾讯云短信 / 其它厂商短信，AK/SK 加密托管至云开发平台控制台—扩展功能—授权管理</li><li>SMS_AUTH_ASSUME_ROLE： 策略授权（角色扮演），适用于同账号腾讯云短信，需预先将短信预设策略 QcloudSMSFullAccess 授权给云开发服务角色，平台以临时凭证代发，不保存任何长期密钥。选择该方式时 SecretId / SecretKey / CredentialAuthKeyId 必须为空</li></ul><p>枚举值：</p><ul><li>SMS_AUTH_SECRET_KEY： 密钥授权，适用于跨账号腾讯云短信 / 其它厂商短信，AK/SK 加密托管至云开发平台控制台—扩展功能—授权管理</li><li>SMS_AUTH_ASSUME_ROLE： 策略授权（角色扮演），适用于同账号腾讯云短信，需预先将短信预设策略 QcloudSMSFullAccess 授权给云开发服务角色，平台以临时凭证代发，不保存任何长期密钥。选择该方式时 SecretId / SecretKey / CredentialAuthKeyId 必须为空</li></ul><p>默认值：SMS_AUTH_SECRET_KEY</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthType <p>凭证获取方式，不传默认为 SMS_AUTH_SECRET_KEY。</p><p>枚举值：</p><ul><li>SMS_AUTH_SECRET_KEY： 密钥授权，适用于跨账号腾讯云短信 / 其它厂商短信，AK/SK 加密托管至云开发平台控制台—扩展功能—授权管理</li><li>SMS_AUTH_ASSUME_ROLE： 策略授权（角色扮演），适用于同账号腾讯云短信，需预先将短信预设策略 QcloudSMSFullAccess 授权给云开发服务角色，平台以临时凭证代发，不保存任何长期密钥。选择该方式时 SecretId / SecretKey / CredentialAuthKeyId 必须为空</li></ul><p>枚举值：</p><ul><li>SMS_AUTH_SECRET_KEY： 密钥授权，适用于跨账号腾讯云短信 / 其它厂商短信，AK/SK 加密托管至云开发平台控制台—扩展功能—授权管理</li><li>SMS_AUTH_ASSUME_ROLE： 策略授权（角色扮演），适用于同账号腾讯云短信，需预先将短信预设策略 QcloudSMSFullAccess 授权给云开发服务角色，平台以临时凭证代发，不保存任何长期密钥。选择该方式时 SecretId / SecretKey / CredentialAuthKeyId 必须为空</li></ul><p>默认值：SMS_AUTH_SECRET_KEY</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthType(String AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>调用短信服务商发送短信接口的调用秘钥对应的ID。</p><ul><li>调用api秘钥会保存在云开发平台控制台—扩展功能—授权管理中，如果对于短信调用的api秘钥有删除需求，可在此处进行删除，删除后，短信将无法正常发送。</li><li>腾讯云的调用api秘钥在腾讯云控制台获取，建议使用子账号的秘钥ID，并且按照最小权限配置。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretId <p>调用短信服务商发送短信接口的调用秘钥对应的ID。</p><ul><li>调用api秘钥会保存在云开发平台控制台—扩展功能—授权管理中，如果对于短信调用的api秘钥有删除需求，可在此处进行删除，删除后，短信将无法正常发送。</li><li>腾讯云的调用api秘钥在腾讯云控制台获取，建议使用子账号的秘钥ID，并且按照最小权限配置。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>调用短信服务商发送短信接口的调用秘钥对应的ID。</p><ul><li>调用api秘钥会保存在云开发平台控制台—扩展功能—授权管理中，如果对于短信调用的api秘钥有删除需求，可在此处进行删除，删除后，短信将无法正常发送。</li><li>腾讯云的调用api秘钥在腾讯云控制台获取，建议使用子账号的秘钥ID，并且按照最小权限配置。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretId <p>调用短信服务商发送短信接口的调用秘钥对应的ID。</p><ul><li>调用api秘钥会保存在云开发平台控制台—扩展功能—授权管理中，如果对于短信调用的api秘钥有删除需求，可在此处进行删除，删除后，短信将无法正常发送。</li><li>腾讯云的调用api秘钥在腾讯云控制台获取，建议使用子账号的秘钥ID，并且按照最小权限配置。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>调用短信服务商发送短信接口的调用api秘钥对应的秘钥Key。</p><ul><li>腾讯云的调用api秘钥在腾讯云控制台获取，建议使用子账号的秘钥ID, 并且按照最小权限配置。平台对于调用api秘钥key是加密存储的，不会明文存储。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey <p>调用短信服务商发送短信接口的调用api秘钥对应的秘钥Key。</p><ul><li>腾讯云的调用api秘钥在腾讯云控制台获取，建议使用子账号的秘钥ID, 并且按照最小权限配置。平台对于调用api秘钥key是加密存储的，不会明文存储。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>调用短信服务商发送短信接口的调用api秘钥对应的秘钥Key。</p><ul><li>腾讯云的调用api秘钥在腾讯云控制台获取，建议使用子账号的秘钥ID, 并且按照最小权限配置。平台对于调用api秘钥key是加密存储的，不会明文存储。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey <p>调用短信服务商发送短信接口的调用api秘钥对应的秘钥Key。</p><ul><li>腾讯云的调用api秘钥在腾讯云控制台获取，建议使用子账号的秘钥ID, 并且按照最小权限配置。平台对于调用api秘钥key是加密存储的，不会明文存储。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>短信服务商侧自定义短信发送的senderID，按照服务商文档和要求传参。</p><ul><li>仅国际化场景使用。部分国家/运营商支持自定义 Sender ID替代默认主叫号码。国内站点忽略此字段。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SenderId <p>短信服务商侧自定义短信发送的senderID，按照服务商文档和要求传参。</p><ul><li>仅国际化场景使用。部分国家/运营商支持自定义 Sender ID替代默认主叫号码。国内站点忽略此字段。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSenderId() {
        return this.SenderId;
    }

    /**
     * Set <p>短信服务商侧自定义短信发送的senderID，按照服务商文档和要求传参。</p><ul><li>仅国际化场景使用。部分国家/运营商支持自定义 Sender ID替代默认主叫号码。国内站点忽略此字段。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SenderId <p>短信服务商侧自定义短信发送的senderID，按照服务商文档和要求传参。</p><ul><li>仅国际化场景使用。部分国家/运营商支持自定义 Sender ID替代默认主叫号码。国内站点忽略此字段。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSenderId(String SenderId) {
        this.SenderId = SenderId;
    }

    /**
     * Get <p>当短信自定义模板含多个占位符时，平台只负责生成验证码值，其余占位符由调用方在此提供。</p><ul><li>无需提供验证码对应的占位的值，验证码由云开发平台侧生成。</li><li>如果是命名占位的服务商的短信模板，这里的参数按照需要对应的占位的key和value，会按照对应的key和value在发送短信时，填充到模板中。</li><li>如果是序号占位的服务商的短信模板，这里的参数不需要key, 只需要填写对应的value, 会按照填写的顺序依次填充到模板中。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateExtendParam <p>当短信自定义模板含多个占位符时，平台只负责生成验证码值，其余占位符由调用方在此提供。</p><ul><li>无需提供验证码对应的占位的值，验证码由云开发平台侧生成。</li><li>如果是命名占位的服务商的短信模板，这里的参数按照需要对应的占位的key和value，会按照对应的key和value在发送短信时，填充到模板中。</li><li>如果是序号占位的服务商的短信模板，这里的参数不需要key, 只需要填写对应的value, 会按照填写的顺序依次填充到模板中。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SMSTemplateParams [] getTemplateExtendParam() {
        return this.TemplateExtendParam;
    }

    /**
     * Set <p>当短信自定义模板含多个占位符时，平台只负责生成验证码值，其余占位符由调用方在此提供。</p><ul><li>无需提供验证码对应的占位的值，验证码由云开发平台侧生成。</li><li>如果是命名占位的服务商的短信模板，这里的参数按照需要对应的占位的key和value，会按照对应的key和value在发送短信时，填充到模板中。</li><li>如果是序号占位的服务商的短信模板，这里的参数不需要key, 只需要填写对应的value, 会按照填写的顺序依次填充到模板中。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateExtendParam <p>当短信自定义模板含多个占位符时，平台只负责生成验证码值，其余占位符由调用方在此提供。</p><ul><li>无需提供验证码对应的占位的值，验证码由云开发平台侧生成。</li><li>如果是命名占位的服务商的短信模板，这里的参数按照需要对应的占位的key和value，会按照对应的key和value在发送短信时，填充到模板中。</li><li>如果是序号占位的服务商的短信模板，这里的参数不需要key, 只需要填写对应的value, 会按照填写的顺序依次填充到模板中。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateExtendParam(SMSTemplateParams [] TemplateExtendParam) {
        this.TemplateExtendParam = TemplateExtendParam;
    }

    /**
     * Get <p>授权管理中密钥的自定义标识（创建 / 引用二合一），与 SecretId / SecretKey 组合决定行为：</p><ul><li>非空 + 带 SecretId/SecretKey → 以该标识创建新密钥；标识已存在时报错（keyID already exists）</li><li>非空 + 不带 SecretId/SecretKey → 引用授权管理中已存在的密钥（需归属当前环境）</li><li>空 + 带 SecretId/SecretKey → 使用平台按服务商生成的固定标识，覆盖更新（存量兼容）</li><li>空 + 不带 SecretId/SecretKey → 不修改密钥，沿用既有配置</li></ul><p>AuthType 为 SMS_AUTH_ASSUME_ROLE 时此参数必须为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CredentialAuthKeyId <p>授权管理中密钥的自定义标识（创建 / 引用二合一），与 SecretId / SecretKey 组合决定行为：</p><ul><li>非空 + 带 SecretId/SecretKey → 以该标识创建新密钥；标识已存在时报错（keyID already exists）</li><li>非空 + 不带 SecretId/SecretKey → 引用授权管理中已存在的密钥（需归属当前环境）</li><li>空 + 带 SecretId/SecretKey → 使用平台按服务商生成的固定标识，覆盖更新（存量兼容）</li><li>空 + 不带 SecretId/SecretKey → 不修改密钥，沿用既有配置</li></ul><p>AuthType 为 SMS_AUTH_ASSUME_ROLE 时此参数必须为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCredentialAuthKeyId() {
        return this.CredentialAuthKeyId;
    }

    /**
     * Set <p>授权管理中密钥的自定义标识（创建 / 引用二合一），与 SecretId / SecretKey 组合决定行为：</p><ul><li>非空 + 带 SecretId/SecretKey → 以该标识创建新密钥；标识已存在时报错（keyID already exists）</li><li>非空 + 不带 SecretId/SecretKey → 引用授权管理中已存在的密钥（需归属当前环境）</li><li>空 + 带 SecretId/SecretKey → 使用平台按服务商生成的固定标识，覆盖更新（存量兼容）</li><li>空 + 不带 SecretId/SecretKey → 不修改密钥，沿用既有配置</li></ul><p>AuthType 为 SMS_AUTH_ASSUME_ROLE 时此参数必须为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CredentialAuthKeyId <p>授权管理中密钥的自定义标识（创建 / 引用二合一），与 SecretId / SecretKey 组合决定行为：</p><ul><li>非空 + 带 SecretId/SecretKey → 以该标识创建新密钥；标识已存在时报错（keyID already exists）</li><li>非空 + 不带 SecretId/SecretKey → 引用授权管理中已存在的密钥（需归属当前环境）</li><li>空 + 带 SecretId/SecretKey → 使用平台按服务商生成的固定标识，覆盖更新（存量兼容）</li><li>空 + 不带 SecretId/SecretKey → 不修改密钥，沿用既有配置</li></ul><p>AuthType 为 SMS_AUTH_ASSUME_ROLE 时此参数必须为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCredentialAuthKeyId(String CredentialAuthKeyId) {
        this.CredentialAuthKeyId = CredentialAuthKeyId;
    }

    public SMSProviderTemplateConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SMSProviderTemplateConfig(SMSProviderTemplateConfig source) {
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
        if (source.AuthType != null) {
            this.AuthType = new String(source.AuthType);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.SenderId != null) {
            this.SenderId = new String(source.SenderId);
        }
        if (source.TemplateExtendParam != null) {
            this.TemplateExtendParam = new SMSTemplateParams[source.TemplateExtendParam.length];
            for (int i = 0; i < source.TemplateExtendParam.length; i++) {
                this.TemplateExtendParam[i] = new SMSTemplateParams(source.TemplateExtendParam[i]);
            }
        }
        if (source.CredentialAuthKeyId != null) {
            this.CredentialAuthKeyId = new String(source.CredentialAuthKeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "SenderId", this.SenderId);
        this.setParamArrayObj(map, prefix + "TemplateExtendParam.", this.TemplateExtendParam);
        this.setParamSimple(map, prefix + "CredentialAuthKeyId", this.CredentialAuthKeyId);

    }
}

