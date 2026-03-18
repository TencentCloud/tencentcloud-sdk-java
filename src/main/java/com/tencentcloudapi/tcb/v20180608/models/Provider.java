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

public class Provider extends AbstractModel {

    /**
    * 身份源的唯一标识符，用于在系统内区分不同的身份源。格式要求：2~32 位，仅支持小写英文字母和数字，不可包含空格或特殊字符。创建后不可修改
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 身份源的安全认证配置，包含与第三方平台对接所需的核心参数，如 ClientId、ClientSecret、授权端点、Token 端点、回调地址、Scope 等。不同 ProviderType 对应不同的配置项。CUSTOM 类型无需手动配置（系统自动填充），OIDC 类型会根据 Issuer 自动补全端点信息，SAML 类型需提供 SamlMetadata（最大 10KB）
    */
    @SerializedName("Config")
    @Expose
    private ProviderConfig Config;

    /**
    * 身份源的显示名称，支持国际化多语言配置。用户在登录页面看到的身份源名称将使用该字段，建议根据实际业务场景填写易于识别的名称。未传入时默认使用 Id 值作为显示名称
    */
    @SerializedName("Name")
    @Expose
    private LocalizedMessage Name;

    /**
    * 身份源图标的访问地址，将展示在登录页的身份源按钮上。建议使用 64×64 像素的 SVG 格式图片以保证清晰度，支持 HTTP/HTTPS 公网可访问的图片链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Picture")
    @Expose
    private String Picture;

    /**
    * 身份源对应的官方主页地址。该信息将在用户查看自己的第三方账号绑定列表时展示，帮助用户识别已绑定的身份源来源。例如 GitHub 身份源可填写：https://github.com
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Homepage")
    @Expose
    private String Homepage;

    /**
    * 身份源协议类型，决定该身份源使用何种认证协议与第三方平台对接。可选值：OAUTH（标准 OAuth 2.0 协议）、OIDC（OpenID Connect 协议）、SAML（SAML 2.0 协议）、CUSTOM（自定义登录，使用 RSA 密钥对签名验证）、EMAIL（邮箱登录，需配合 EmailConfig 使用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProviderType")
    @Expose
    private String ProviderType;

    /**
    * 控制第三方身份源登录时是否自动注册系统用户。可选值：TRUE（始终自动注册，无论第三方返回的用户信息是否包含手机号或邮箱）、FALSE（不自动注册，需用户手动绑定）、UNSPECIFIED（默认行为：仅当第三方身份源返回的用户信息中包含手机号或邮箱时才自动注册，否则登录完成后要求用户绑定手机号方可继续使用）。注意：企业微信类型（WX_WORK_AGENT/WX_WORK_INTERNAL/WX_WORK_THIRD_PARTY/WX_WORK_THIRD_PARTY_ASSOCIATION）和微信小程序类型（WX_MICRO_APP/WX_QRCODE_MICRO_APP/WX_OPEN）在 UNSPECIFIED 时会自动设为 TRUE。当 TransparentMode 为 TRUE 时，该字段将被强制设为 FALSE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoSignUpWithProviderUser")
    @Expose
    private String AutoSignUpWithProviderUser;

    /**
    * 身份源的启用状态。可选值：TRUE（启用，用户可通过该身份源登录）、FALSE（禁用，已有绑定关系不受影响）。未传入时默认为 TRUE（启用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("On")
    @Expose
    private String On;

    /**
    * 身份源的详细描述信息，支持国际化多语言配置。可用于向用户说明该身份源的用途或使用场景。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private LocalizedMessage Description;

    /**
    * 是否开启信息透传模式。可选值：TRUE（仅登录模式：平台不持久化存储用户数据，仅将第三方身份源返回的用户信息透传给业务方，适用于不希望平台留存用户数据的场景）、FALSE（登录且注册模式：平台正常注册并存储用户信息，默认值）。注意：开启透传模式时，AutoSignUpWithProviderUser 将被强制设为 FALSE；若 ReuseUserId 为 UNSPECIFIED，将被自动设为 TRUE。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransparentMode")
    @Expose
    private String TransparentMode;

    /**
    * 是否直接复用第三方身份源返回的用户标识（如 OpenID、UnionID 等）作为平台用户 ID。可选值：TRUE（开启，平台用户 ID 将直接使用第三方身份源返回的用户标识，适用于已有用户体系迁移场景）、FALSE（关闭，由平台生成独立用户 ID）。注意：开启后需确保第三方用户标识的全局唯一性，避免 ID 冲突。当 TransparentMode 为 TRUE 且该字段为 UNSPECIFIED 时，将被自动设为 TRUE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReuseUserId")
    @Expose
    private String ReuseUserId;

    /**
    * 邮箱身份源的专项配置，仅当 ProviderType 为 EMAIL 时有效且必填。包含邮件服务商、发件人地址、SMTP 配置等参数，用于支持通过邮箱验证码方式进行身份认证。支持两种模式：自有 SMTP 服务器（需填写完整的 SMTP 配置）和平台代发（EmailConfig.On 设为 TRUE 时由平台随机分配 SMTP 服务器）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmailConfig")
    @Expose
    private EmailProviderConfig EmailConfig;

    /**
    * 是否开启邮箱自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE）。开启后，若第三方身份源返回的邮箱与系统中已有用户的邮箱一致，则自动将该第三方账号与已有用户关联绑定并完成登录，无需用户手动绑定
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoSignInWhenEmailMatch")
    @Expose
    private String AutoSignInWhenEmailMatch;

    /**
    * 是否开启手机号自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认行为等同于 TRUE，即默认开启）。开启后，若第三方身份源返回的手机号与系统中已有用户的手机号一致，则自动将该第三方账号与已有用户关联绑定并完成登录，无需用户手动绑定
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoSignInWhenPhoneNumberMatch")
    @Expose
    private String AutoSignInWhenPhoneNumberMatch;

    /**
     * Get 身份源的唯一标识符，用于在系统内区分不同的身份源。格式要求：2~32 位，仅支持小写英文字母和数字，不可包含空格或特殊字符。创建后不可修改 
     * @return Id 身份源的唯一标识符，用于在系统内区分不同的身份源。格式要求：2~32 位，仅支持小写英文字母和数字，不可包含空格或特殊字符。创建后不可修改
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 身份源的唯一标识符，用于在系统内区分不同的身份源。格式要求：2~32 位，仅支持小写英文字母和数字，不可包含空格或特殊字符。创建后不可修改
     * @param Id 身份源的唯一标识符，用于在系统内区分不同的身份源。格式要求：2~32 位，仅支持小写英文字母和数字，不可包含空格或特殊字符。创建后不可修改
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 身份源的安全认证配置，包含与第三方平台对接所需的核心参数，如 ClientId、ClientSecret、授权端点、Token 端点、回调地址、Scope 等。不同 ProviderType 对应不同的配置项。CUSTOM 类型无需手动配置（系统自动填充），OIDC 类型会根据 Issuer 自动补全端点信息，SAML 类型需提供 SamlMetadata（最大 10KB） 
     * @return Config 身份源的安全认证配置，包含与第三方平台对接所需的核心参数，如 ClientId、ClientSecret、授权端点、Token 端点、回调地址、Scope 等。不同 ProviderType 对应不同的配置项。CUSTOM 类型无需手动配置（系统自动填充），OIDC 类型会根据 Issuer 自动补全端点信息，SAML 类型需提供 SamlMetadata（最大 10KB）
     */
    public ProviderConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 身份源的安全认证配置，包含与第三方平台对接所需的核心参数，如 ClientId、ClientSecret、授权端点、Token 端点、回调地址、Scope 等。不同 ProviderType 对应不同的配置项。CUSTOM 类型无需手动配置（系统自动填充），OIDC 类型会根据 Issuer 自动补全端点信息，SAML 类型需提供 SamlMetadata（最大 10KB）
     * @param Config 身份源的安全认证配置，包含与第三方平台对接所需的核心参数，如 ClientId、ClientSecret、授权端点、Token 端点、回调地址、Scope 等。不同 ProviderType 对应不同的配置项。CUSTOM 类型无需手动配置（系统自动填充），OIDC 类型会根据 Issuer 自动补全端点信息，SAML 类型需提供 SamlMetadata（最大 10KB）
     */
    public void setConfig(ProviderConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 身份源的显示名称，支持国际化多语言配置。用户在登录页面看到的身份源名称将使用该字段，建议根据实际业务场景填写易于识别的名称。未传入时默认使用 Id 值作为显示名称 
     * @return Name 身份源的显示名称，支持国际化多语言配置。用户在登录页面看到的身份源名称将使用该字段，建议根据实际业务场景填写易于识别的名称。未传入时默认使用 Id 值作为显示名称
     */
    public LocalizedMessage getName() {
        return this.Name;
    }

    /**
     * Set 身份源的显示名称，支持国际化多语言配置。用户在登录页面看到的身份源名称将使用该字段，建议根据实际业务场景填写易于识别的名称。未传入时默认使用 Id 值作为显示名称
     * @param Name 身份源的显示名称，支持国际化多语言配置。用户在登录页面看到的身份源名称将使用该字段，建议根据实际业务场景填写易于识别的名称。未传入时默认使用 Id 值作为显示名称
     */
    public void setName(LocalizedMessage Name) {
        this.Name = Name;
    }

    /**
     * Get 身份源图标的访问地址，将展示在登录页的身份源按钮上。建议使用 64×64 像素的 SVG 格式图片以保证清晰度，支持 HTTP/HTTPS 公网可访问的图片链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Picture 身份源图标的访问地址，将展示在登录页的身份源按钮上。建议使用 64×64 像素的 SVG 格式图片以保证清晰度，支持 HTTP/HTTPS 公网可访问的图片链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPicture() {
        return this.Picture;
    }

    /**
     * Set 身份源图标的访问地址，将展示在登录页的身份源按钮上。建议使用 64×64 像素的 SVG 格式图片以保证清晰度，支持 HTTP/HTTPS 公网可访问的图片链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param Picture 身份源图标的访问地址，将展示在登录页的身份源按钮上。建议使用 64×64 像素的 SVG 格式图片以保证清晰度，支持 HTTP/HTTPS 公网可访问的图片链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    /**
     * Get 身份源对应的官方主页地址。该信息将在用户查看自己的第三方账号绑定列表时展示，帮助用户识别已绑定的身份源来源。例如 GitHub 身份源可填写：https://github.com
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Homepage 身份源对应的官方主页地址。该信息将在用户查看自己的第三方账号绑定列表时展示，帮助用户识别已绑定的身份源来源。例如 GitHub 身份源可填写：https://github.com
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHomepage() {
        return this.Homepage;
    }

    /**
     * Set 身份源对应的官方主页地址。该信息将在用户查看自己的第三方账号绑定列表时展示，帮助用户识别已绑定的身份源来源。例如 GitHub 身份源可填写：https://github.com
注意：此字段可能返回 null，表示取不到有效值。
     * @param Homepage 身份源对应的官方主页地址。该信息将在用户查看自己的第三方账号绑定列表时展示，帮助用户识别已绑定的身份源来源。例如 GitHub 身份源可填写：https://github.com
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHomepage(String Homepage) {
        this.Homepage = Homepage;
    }

    /**
     * Get 身份源协议类型，决定该身份源使用何种认证协议与第三方平台对接。可选值：OAUTH（标准 OAuth 2.0 协议）、OIDC（OpenID Connect 协议）、SAML（SAML 2.0 协议）、CUSTOM（自定义登录，使用 RSA 密钥对签名验证）、EMAIL（邮箱登录，需配合 EmailConfig 使用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProviderType 身份源协议类型，决定该身份源使用何种认证协议与第三方平台对接。可选值：OAUTH（标准 OAuth 2.0 协议）、OIDC（OpenID Connect 协议）、SAML（SAML 2.0 协议）、CUSTOM（自定义登录，使用 RSA 密钥对签名验证）、EMAIL（邮箱登录，需配合 EmailConfig 使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set 身份源协议类型，决定该身份源使用何种认证协议与第三方平台对接。可选值：OAUTH（标准 OAuth 2.0 协议）、OIDC（OpenID Connect 协议）、SAML（SAML 2.0 协议）、CUSTOM（自定义登录，使用 RSA 密钥对签名验证）、EMAIL（邮箱登录，需配合 EmailConfig 使用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProviderType 身份源协议类型，决定该身份源使用何种认证协议与第三方平台对接。可选值：OAUTH（标准 OAuth 2.0 协议）、OIDC（OpenID Connect 协议）、SAML（SAML 2.0 协议）、CUSTOM（自定义登录，使用 RSA 密钥对签名验证）、EMAIL（邮箱登录，需配合 EmailConfig 使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProviderType(String ProviderType) {
        this.ProviderType = ProviderType;
    }

    /**
     * Get 控制第三方身份源登录时是否自动注册系统用户。可选值：TRUE（始终自动注册，无论第三方返回的用户信息是否包含手机号或邮箱）、FALSE（不自动注册，需用户手动绑定）、UNSPECIFIED（默认行为：仅当第三方身份源返回的用户信息中包含手机号或邮箱时才自动注册，否则登录完成后要求用户绑定手机号方可继续使用）。注意：企业微信类型（WX_WORK_AGENT/WX_WORK_INTERNAL/WX_WORK_THIRD_PARTY/WX_WORK_THIRD_PARTY_ASSOCIATION）和微信小程序类型（WX_MICRO_APP/WX_QRCODE_MICRO_APP/WX_OPEN）在 UNSPECIFIED 时会自动设为 TRUE。当 TransparentMode 为 TRUE 时，该字段将被强制设为 FALSE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoSignUpWithProviderUser 控制第三方身份源登录时是否自动注册系统用户。可选值：TRUE（始终自动注册，无论第三方返回的用户信息是否包含手机号或邮箱）、FALSE（不自动注册，需用户手动绑定）、UNSPECIFIED（默认行为：仅当第三方身份源返回的用户信息中包含手机号或邮箱时才自动注册，否则登录完成后要求用户绑定手机号方可继续使用）。注意：企业微信类型（WX_WORK_AGENT/WX_WORK_INTERNAL/WX_WORK_THIRD_PARTY/WX_WORK_THIRD_PARTY_ASSOCIATION）和微信小程序类型（WX_MICRO_APP/WX_QRCODE_MICRO_APP/WX_OPEN）在 UNSPECIFIED 时会自动设为 TRUE。当 TransparentMode 为 TRUE 时，该字段将被强制设为 FALSE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoSignUpWithProviderUser() {
        return this.AutoSignUpWithProviderUser;
    }

    /**
     * Set 控制第三方身份源登录时是否自动注册系统用户。可选值：TRUE（始终自动注册，无论第三方返回的用户信息是否包含手机号或邮箱）、FALSE（不自动注册，需用户手动绑定）、UNSPECIFIED（默认行为：仅当第三方身份源返回的用户信息中包含手机号或邮箱时才自动注册，否则登录完成后要求用户绑定手机号方可继续使用）。注意：企业微信类型（WX_WORK_AGENT/WX_WORK_INTERNAL/WX_WORK_THIRD_PARTY/WX_WORK_THIRD_PARTY_ASSOCIATION）和微信小程序类型（WX_MICRO_APP/WX_QRCODE_MICRO_APP/WX_OPEN）在 UNSPECIFIED 时会自动设为 TRUE。当 TransparentMode 为 TRUE 时，该字段将被强制设为 FALSE
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoSignUpWithProviderUser 控制第三方身份源登录时是否自动注册系统用户。可选值：TRUE（始终自动注册，无论第三方返回的用户信息是否包含手机号或邮箱）、FALSE（不自动注册，需用户手动绑定）、UNSPECIFIED（默认行为：仅当第三方身份源返回的用户信息中包含手机号或邮箱时才自动注册，否则登录完成后要求用户绑定手机号方可继续使用）。注意：企业微信类型（WX_WORK_AGENT/WX_WORK_INTERNAL/WX_WORK_THIRD_PARTY/WX_WORK_THIRD_PARTY_ASSOCIATION）和微信小程序类型（WX_MICRO_APP/WX_QRCODE_MICRO_APP/WX_OPEN）在 UNSPECIFIED 时会自动设为 TRUE。当 TransparentMode 为 TRUE 时，该字段将被强制设为 FALSE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoSignUpWithProviderUser(String AutoSignUpWithProviderUser) {
        this.AutoSignUpWithProviderUser = AutoSignUpWithProviderUser;
    }

    /**
     * Get 身份源的启用状态。可选值：TRUE（启用，用户可通过该身份源登录）、FALSE（禁用，已有绑定关系不受影响）。未传入时默认为 TRUE（启用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return On 身份源的启用状态。可选值：TRUE（启用，用户可通过该身份源登录）、FALSE（禁用，已有绑定关系不受影响）。未传入时默认为 TRUE（启用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOn() {
        return this.On;
    }

    /**
     * Set 身份源的启用状态。可选值：TRUE（启用，用户可通过该身份源登录）、FALSE（禁用，已有绑定关系不受影响）。未传入时默认为 TRUE（启用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param On 身份源的启用状态。可选值：TRUE（启用，用户可通过该身份源登录）、FALSE（禁用，已有绑定关系不受影响）。未传入时默认为 TRUE（启用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOn(String On) {
        this.On = On;
    }

    /**
     * Get 身份源的详细描述信息，支持国际化多语言配置。可用于向用户说明该身份源的用途或使用场景。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 身份源的详细描述信息，支持国际化多语言配置。可用于向用户说明该身份源的用途或使用场景。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LocalizedMessage getDescription() {
        return this.Description;
    }

    /**
     * Set 身份源的详细描述信息，支持国际化多语言配置。可用于向用户说明该身份源的用途或使用场景。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 身份源的详细描述信息，支持国际化多语言配置。可用于向用户说明该身份源的用途或使用场景。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(LocalizedMessage Description) {
        this.Description = Description;
    }

    /**
     * Get 是否开启信息透传模式。可选值：TRUE（仅登录模式：平台不持久化存储用户数据，仅将第三方身份源返回的用户信息透传给业务方，适用于不希望平台留存用户数据的场景）、FALSE（登录且注册模式：平台正常注册并存储用户信息，默认值）。注意：开启透传模式时，AutoSignUpWithProviderUser 将被强制设为 FALSE；若 ReuseUserId 为 UNSPECIFIED，将被自动设为 TRUE。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransparentMode 是否开启信息透传模式。可选值：TRUE（仅登录模式：平台不持久化存储用户数据，仅将第三方身份源返回的用户信息透传给业务方，适用于不希望平台留存用户数据的场景）、FALSE（登录且注册模式：平台正常注册并存储用户信息，默认值）。注意：开启透传模式时，AutoSignUpWithProviderUser 将被强制设为 FALSE；若 ReuseUserId 为 UNSPECIFIED，将被自动设为 TRUE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransparentMode() {
        return this.TransparentMode;
    }

    /**
     * Set 是否开启信息透传模式。可选值：TRUE（仅登录模式：平台不持久化存储用户数据，仅将第三方身份源返回的用户信息透传给业务方，适用于不希望平台留存用户数据的场景）、FALSE（登录且注册模式：平台正常注册并存储用户信息，默认值）。注意：开启透传模式时，AutoSignUpWithProviderUser 将被强制设为 FALSE；若 ReuseUserId 为 UNSPECIFIED，将被自动设为 TRUE。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransparentMode 是否开启信息透传模式。可选值：TRUE（仅登录模式：平台不持久化存储用户数据，仅将第三方身份源返回的用户信息透传给业务方，适用于不希望平台留存用户数据的场景）、FALSE（登录且注册模式：平台正常注册并存储用户信息，默认值）。注意：开启透传模式时，AutoSignUpWithProviderUser 将被强制设为 FALSE；若 ReuseUserId 为 UNSPECIFIED，将被自动设为 TRUE。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransparentMode(String TransparentMode) {
        this.TransparentMode = TransparentMode;
    }

    /**
     * Get 是否直接复用第三方身份源返回的用户标识（如 OpenID、UnionID 等）作为平台用户 ID。可选值：TRUE（开启，平台用户 ID 将直接使用第三方身份源返回的用户标识，适用于已有用户体系迁移场景）、FALSE（关闭，由平台生成独立用户 ID）。注意：开启后需确保第三方用户标识的全局唯一性，避免 ID 冲突。当 TransparentMode 为 TRUE 且该字段为 UNSPECIFIED 时，将被自动设为 TRUE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReuseUserId 是否直接复用第三方身份源返回的用户标识（如 OpenID、UnionID 等）作为平台用户 ID。可选值：TRUE（开启，平台用户 ID 将直接使用第三方身份源返回的用户标识，适用于已有用户体系迁移场景）、FALSE（关闭，由平台生成独立用户 ID）。注意：开启后需确保第三方用户标识的全局唯一性，避免 ID 冲突。当 TransparentMode 为 TRUE 且该字段为 UNSPECIFIED 时，将被自动设为 TRUE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReuseUserId() {
        return this.ReuseUserId;
    }

    /**
     * Set 是否直接复用第三方身份源返回的用户标识（如 OpenID、UnionID 等）作为平台用户 ID。可选值：TRUE（开启，平台用户 ID 将直接使用第三方身份源返回的用户标识，适用于已有用户体系迁移场景）、FALSE（关闭，由平台生成独立用户 ID）。注意：开启后需确保第三方用户标识的全局唯一性，避免 ID 冲突。当 TransparentMode 为 TRUE 且该字段为 UNSPECIFIED 时，将被自动设为 TRUE
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReuseUserId 是否直接复用第三方身份源返回的用户标识（如 OpenID、UnionID 等）作为平台用户 ID。可选值：TRUE（开启，平台用户 ID 将直接使用第三方身份源返回的用户标识，适用于已有用户体系迁移场景）、FALSE（关闭，由平台生成独立用户 ID）。注意：开启后需确保第三方用户标识的全局唯一性，避免 ID 冲突。当 TransparentMode 为 TRUE 且该字段为 UNSPECIFIED 时，将被自动设为 TRUE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReuseUserId(String ReuseUserId) {
        this.ReuseUserId = ReuseUserId;
    }

    /**
     * Get 邮箱身份源的专项配置，仅当 ProviderType 为 EMAIL 时有效且必填。包含邮件服务商、发件人地址、SMTP 配置等参数，用于支持通过邮箱验证码方式进行身份认证。支持两种模式：自有 SMTP 服务器（需填写完整的 SMTP 配置）和平台代发（EmailConfig.On 设为 TRUE 时由平台随机分配 SMTP 服务器）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmailConfig 邮箱身份源的专项配置，仅当 ProviderType 为 EMAIL 时有效且必填。包含邮件服务商、发件人地址、SMTP 配置等参数，用于支持通过邮箱验证码方式进行身份认证。支持两种模式：自有 SMTP 服务器（需填写完整的 SMTP 配置）和平台代发（EmailConfig.On 设为 TRUE 时由平台随机分配 SMTP 服务器）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmailProviderConfig getEmailConfig() {
        return this.EmailConfig;
    }

    /**
     * Set 邮箱身份源的专项配置，仅当 ProviderType 为 EMAIL 时有效且必填。包含邮件服务商、发件人地址、SMTP 配置等参数，用于支持通过邮箱验证码方式进行身份认证。支持两种模式：自有 SMTP 服务器（需填写完整的 SMTP 配置）和平台代发（EmailConfig.On 设为 TRUE 时由平台随机分配 SMTP 服务器）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmailConfig 邮箱身份源的专项配置，仅当 ProviderType 为 EMAIL 时有效且必填。包含邮件服务商、发件人地址、SMTP 配置等参数，用于支持通过邮箱验证码方式进行身份认证。支持两种模式：自有 SMTP 服务器（需填写完整的 SMTP 配置）和平台代发（EmailConfig.On 设为 TRUE 时由平台随机分配 SMTP 服务器）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmailConfig(EmailProviderConfig EmailConfig) {
        this.EmailConfig = EmailConfig;
    }

    /**
     * Get 是否开启邮箱自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE）。开启后，若第三方身份源返回的邮箱与系统中已有用户的邮箱一致，则自动将该第三方账号与已有用户关联绑定并完成登录，无需用户手动绑定
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoSignInWhenEmailMatch 是否开启邮箱自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE）。开启后，若第三方身份源返回的邮箱与系统中已有用户的邮箱一致，则自动将该第三方账号与已有用户关联绑定并完成登录，无需用户手动绑定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoSignInWhenEmailMatch() {
        return this.AutoSignInWhenEmailMatch;
    }

    /**
     * Set 是否开启邮箱自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE）。开启后，若第三方身份源返回的邮箱与系统中已有用户的邮箱一致，则自动将该第三方账号与已有用户关联绑定并完成登录，无需用户手动绑定
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoSignInWhenEmailMatch 是否开启邮箱自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE）。开启后，若第三方身份源返回的邮箱与系统中已有用户的邮箱一致，则自动将该第三方账号与已有用户关联绑定并完成登录，无需用户手动绑定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoSignInWhenEmailMatch(String AutoSignInWhenEmailMatch) {
        this.AutoSignInWhenEmailMatch = AutoSignInWhenEmailMatch;
    }

    /**
     * Get 是否开启手机号自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认行为等同于 TRUE，即默认开启）。开启后，若第三方身份源返回的手机号与系统中已有用户的手机号一致，则自动将该第三方账号与已有用户关联绑定并完成登录，无需用户手动绑定
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoSignInWhenPhoneNumberMatch 是否开启手机号自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认行为等同于 TRUE，即默认开启）。开启后，若第三方身份源返回的手机号与系统中已有用户的手机号一致，则自动将该第三方账号与已有用户关联绑定并完成登录，无需用户手动绑定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoSignInWhenPhoneNumberMatch() {
        return this.AutoSignInWhenPhoneNumberMatch;
    }

    /**
     * Set 是否开启手机号自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认行为等同于 TRUE，即默认开启）。开启后，若第三方身份源返回的手机号与系统中已有用户的手机号一致，则自动将该第三方账号与已有用户关联绑定并完成登录，无需用户手动绑定
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoSignInWhenPhoneNumberMatch 是否开启手机号自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认行为等同于 TRUE，即默认开启）。开启后，若第三方身份源返回的手机号与系统中已有用户的手机号一致，则自动将该第三方账号与已有用户关联绑定并完成登录，无需用户手动绑定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoSignInWhenPhoneNumberMatch(String AutoSignInWhenPhoneNumberMatch) {
        this.AutoSignInWhenPhoneNumberMatch = AutoSignInWhenPhoneNumberMatch;
    }

    public Provider() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Provider(Provider source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Config != null) {
            this.Config = new ProviderConfig(source.Config);
        }
        if (source.Name != null) {
            this.Name = new LocalizedMessage(source.Name);
        }
        if (source.Picture != null) {
            this.Picture = new String(source.Picture);
        }
        if (source.Homepage != null) {
            this.Homepage = new String(source.Homepage);
        }
        if (source.ProviderType != null) {
            this.ProviderType = new String(source.ProviderType);
        }
        if (source.AutoSignUpWithProviderUser != null) {
            this.AutoSignUpWithProviderUser = new String(source.AutoSignUpWithProviderUser);
        }
        if (source.On != null) {
            this.On = new String(source.On);
        }
        if (source.Description != null) {
            this.Description = new LocalizedMessage(source.Description);
        }
        if (source.TransparentMode != null) {
            this.TransparentMode = new String(source.TransparentMode);
        }
        if (source.ReuseUserId != null) {
            this.ReuseUserId = new String(source.ReuseUserId);
        }
        if (source.EmailConfig != null) {
            this.EmailConfig = new EmailProviderConfig(source.EmailConfig);
        }
        if (source.AutoSignInWhenEmailMatch != null) {
            this.AutoSignInWhenEmailMatch = new String(source.AutoSignInWhenEmailMatch);
        }
        if (source.AutoSignInWhenPhoneNumberMatch != null) {
            this.AutoSignInWhenPhoneNumberMatch = new String(source.AutoSignInWhenPhoneNumberMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamObj(map, prefix + "Name.", this.Name);
        this.setParamSimple(map, prefix + "Picture", this.Picture);
        this.setParamSimple(map, prefix + "Homepage", this.Homepage);
        this.setParamSimple(map, prefix + "ProviderType", this.ProviderType);
        this.setParamSimple(map, prefix + "AutoSignUpWithProviderUser", this.AutoSignUpWithProviderUser);
        this.setParamSimple(map, prefix + "On", this.On);
        this.setParamObj(map, prefix + "Description.", this.Description);
        this.setParamSimple(map, prefix + "TransparentMode", this.TransparentMode);
        this.setParamSimple(map, prefix + "ReuseUserId", this.ReuseUserId);
        this.setParamObj(map, prefix + "EmailConfig.", this.EmailConfig);
        this.setParamSimple(map, prefix + "AutoSignInWhenEmailMatch", this.AutoSignInWhenEmailMatch);
        this.setParamSimple(map, prefix + "AutoSignInWhenPhoneNumberMatch", this.AutoSignInWhenPhoneNumberMatch);

    }
}

