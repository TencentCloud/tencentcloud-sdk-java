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

public class AddProviderRequest extends AbstractModel {

    /**
    * 云开发环境 ID，用于唯一标识当前操作所属的云开发环境。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 身份源的显示名称，支持国际化多语言配置。用户在登录页面看到的身份源名称将使用该字段，建议根据实际业务场景填写易于识别的名称，例如：企业微信、GitHub 等。
    */
    @SerializedName("Name")
    @Expose
    private LocalizedMessage Name;

    /**
    * 身份源协议类型，决定该身份源使用何种认证协议与第三方平台对接。可选值：
OAUTH：标准 OAuth 2.0 协议
OIDC：OpenID Connect 协议
SAML：SAML 2.0 协议
WX_MICRO_APP：微信小程序登录
WX_QRCODE_MICRO_APP：微信小程序扫码登录
WX_CLOUDBASE_MICRO_APP：云开发托管小程序登录
WX_MP：微信公众号网页授权登录
WX_OPEN：微信开放平台扫码登录
WX_WORK_INTERNAL：企业微信自建应用登录
WX_WORK_AGENT：企业微信代开发应用登录
WX_WORK_THIRD_PARTY：企业微信第三方应用登录
WX_WORK_THIRD_PARTY_ASSOCIATION：企业微信第三方应用关联登录
CUSTOM：自定义登录
EMAIL：邮箱登录
    */
    @SerializedName("ProviderType")
    @Expose
    private String ProviderType;

    /**
    * 身份源的唯一标识符，用于在系统内区分不同的身份源。格式要求：2~32 位，仅支持小写英文字母和数字，不可包含空格或特殊字符。若不填写，系统将自动生成。例如：github、google。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 身份源图标的访问地址，将展示在登录页的身份源按钮上。建议使用 64×64 像素的 SVG 格式图片以保证清晰度，支持 HTTP/HTTPS 公网可访问的图片链接。
    */
    @SerializedName("Picture")
    @Expose
    private String Picture;

    /**
    * 身份源对应的官方主页地址。该信息将在用户查看自己的第三方账号绑定列表时展示，帮助用户识别已绑定的身份源来源。例如 GitHub 身份源可填写：https://github.com。
    */
    @SerializedName("Homepage")
    @Expose
    private String Homepage;

    /**
    * 身份认证源协议连接配置，包含与第三方平台对接所需的核心参数，如 ClientId、ClientSecret、授权端点、Token 端点、回调地址、Scope、SAML Metadata、请求和响应参数映射等。不同 ProviderType 对应不同的配置项要求。
    */
    @SerializedName("Config")
    @Expose
    private ProviderConfig Config;

    /**
    * 是否开启透传登录模式。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE，企业微信代开发应用 WX_WORK_AGENT 类型默认为 TRUE）。开启后，平台不会持久化存储用户数据，仅将第三方身份源返回的用户信息透传给业务方，适用于不希望平台留存用户数据的场景。注意：开启透传模式时，ReuseUserId 将自动设为 TRUE，AutoSignUpWithProviderUser 将自动设为 FALSE。
    */
    @SerializedName("TransparentMode")
    @Expose
    private String TransparentMode;

    /**
    * 身份源的详细描述信息，支持国际化多语言配置。可用于向用户说明该身份源的用途或使用场景，例如：谷歌授权登录。
    */
    @SerializedName("Description")
    @Expose
    private LocalizedMessage Description;

    /**
    * 是否直接复用第三方身份源的用户 ID 作为平台的用户 ID。可选值：TRUE（直接复用，适用于已有用户体系迁移场景）、FALSE（不复用，由平台生成独立用户 ID）、UNSPECIFIED（默认为 FALSE，但当 TransparentMode 为 TRUE 时自动设为 TRUE）。注意：开启后需确保第三方用户 ID 的唯一性，避免 ID 冲突。
    */
    @SerializedName("ReuseUserId")
    @Expose
    private String ReuseUserId;

    /**
    * 身份源的启用状态。可选值：TRUE（启用，用户可通过该身份源登录）、FALSE（禁用，登录入口将被隐藏，已有绑定关系不受影响）、UNSPECIFIED（默认为 TRUE）。
    */
    @SerializedName("On")
    @Expose
    private String On;

    /**
    * 是否开启邮箱自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE）。开启后，若第三方身份源返回的邮箱与系统中已有用户的邮箱一致，则自动将该第三方账号与已有用户关联并完成登录，无需用户手动绑定。
    */
    @SerializedName("AutoSignInWhenEmailMatch")
    @Expose
    private String AutoSignInWhenEmailMatch;

    /**
    * 是否开启手机号自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认行为等同 TRUE）。开启后，若第三方身份源返回的手机号与系统中已有用户的手机号一致，则自动将该第三方账号与已有用户关联并完成登录，无需用户手动绑定。注意：该字段默认行为（UNSPECIFIED）与 AutoSignInWhenEmailMatch 不同，手机号匹配在未显式关闭时默认生效。
    */
    @SerializedName("AutoSignInWhenPhoneNumberMatch")
    @Expose
    private String AutoSignInWhenPhoneNumberMatch;

    /**
     * Get 云开发环境 ID，用于唯一标识当前操作所属的云开发环境。 
     * @return EnvId 云开发环境 ID，用于唯一标识当前操作所属的云开发环境。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 云开发环境 ID，用于唯一标识当前操作所属的云开发环境。
     * @param EnvId 云开发环境 ID，用于唯一标识当前操作所属的云开发环境。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 身份源的显示名称，支持国际化多语言配置。用户在登录页面看到的身份源名称将使用该字段，建议根据实际业务场景填写易于识别的名称，例如：企业微信、GitHub 等。 
     * @return Name 身份源的显示名称，支持国际化多语言配置。用户在登录页面看到的身份源名称将使用该字段，建议根据实际业务场景填写易于识别的名称，例如：企业微信、GitHub 等。
     */
    public LocalizedMessage getName() {
        return this.Name;
    }

    /**
     * Set 身份源的显示名称，支持国际化多语言配置。用户在登录页面看到的身份源名称将使用该字段，建议根据实际业务场景填写易于识别的名称，例如：企业微信、GitHub 等。
     * @param Name 身份源的显示名称，支持国际化多语言配置。用户在登录页面看到的身份源名称将使用该字段，建议根据实际业务场景填写易于识别的名称，例如：企业微信、GitHub 等。
     */
    public void setName(LocalizedMessage Name) {
        this.Name = Name;
    }

    /**
     * Get 身份源协议类型，决定该身份源使用何种认证协议与第三方平台对接。可选值：
OAUTH：标准 OAuth 2.0 协议
OIDC：OpenID Connect 协议
SAML：SAML 2.0 协议
WX_MICRO_APP：微信小程序登录
WX_QRCODE_MICRO_APP：微信小程序扫码登录
WX_CLOUDBASE_MICRO_APP：云开发托管小程序登录
WX_MP：微信公众号网页授权登录
WX_OPEN：微信开放平台扫码登录
WX_WORK_INTERNAL：企业微信自建应用登录
WX_WORK_AGENT：企业微信代开发应用登录
WX_WORK_THIRD_PARTY：企业微信第三方应用登录
WX_WORK_THIRD_PARTY_ASSOCIATION：企业微信第三方应用关联登录
CUSTOM：自定义登录
EMAIL：邮箱登录 
     * @return ProviderType 身份源协议类型，决定该身份源使用何种认证协议与第三方平台对接。可选值：
OAUTH：标准 OAuth 2.0 协议
OIDC：OpenID Connect 协议
SAML：SAML 2.0 协议
WX_MICRO_APP：微信小程序登录
WX_QRCODE_MICRO_APP：微信小程序扫码登录
WX_CLOUDBASE_MICRO_APP：云开发托管小程序登录
WX_MP：微信公众号网页授权登录
WX_OPEN：微信开放平台扫码登录
WX_WORK_INTERNAL：企业微信自建应用登录
WX_WORK_AGENT：企业微信代开发应用登录
WX_WORK_THIRD_PARTY：企业微信第三方应用登录
WX_WORK_THIRD_PARTY_ASSOCIATION：企业微信第三方应用关联登录
CUSTOM：自定义登录
EMAIL：邮箱登录
     */
    public String getProviderType() {
        return this.ProviderType;
    }

    /**
     * Set 身份源协议类型，决定该身份源使用何种认证协议与第三方平台对接。可选值：
OAUTH：标准 OAuth 2.0 协议
OIDC：OpenID Connect 协议
SAML：SAML 2.0 协议
WX_MICRO_APP：微信小程序登录
WX_QRCODE_MICRO_APP：微信小程序扫码登录
WX_CLOUDBASE_MICRO_APP：云开发托管小程序登录
WX_MP：微信公众号网页授权登录
WX_OPEN：微信开放平台扫码登录
WX_WORK_INTERNAL：企业微信自建应用登录
WX_WORK_AGENT：企业微信代开发应用登录
WX_WORK_THIRD_PARTY：企业微信第三方应用登录
WX_WORK_THIRD_PARTY_ASSOCIATION：企业微信第三方应用关联登录
CUSTOM：自定义登录
EMAIL：邮箱登录
     * @param ProviderType 身份源协议类型，决定该身份源使用何种认证协议与第三方平台对接。可选值：
OAUTH：标准 OAuth 2.0 协议
OIDC：OpenID Connect 协议
SAML：SAML 2.0 协议
WX_MICRO_APP：微信小程序登录
WX_QRCODE_MICRO_APP：微信小程序扫码登录
WX_CLOUDBASE_MICRO_APP：云开发托管小程序登录
WX_MP：微信公众号网页授权登录
WX_OPEN：微信开放平台扫码登录
WX_WORK_INTERNAL：企业微信自建应用登录
WX_WORK_AGENT：企业微信代开发应用登录
WX_WORK_THIRD_PARTY：企业微信第三方应用登录
WX_WORK_THIRD_PARTY_ASSOCIATION：企业微信第三方应用关联登录
CUSTOM：自定义登录
EMAIL：邮箱登录
     */
    public void setProviderType(String ProviderType) {
        this.ProviderType = ProviderType;
    }

    /**
     * Get 身份源的唯一标识符，用于在系统内区分不同的身份源。格式要求：2~32 位，仅支持小写英文字母和数字，不可包含空格或特殊字符。若不填写，系统将自动生成。例如：github、google。 
     * @return Id 身份源的唯一标识符，用于在系统内区分不同的身份源。格式要求：2~32 位，仅支持小写英文字母和数字，不可包含空格或特殊字符。若不填写，系统将自动生成。例如：github、google。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 身份源的唯一标识符，用于在系统内区分不同的身份源。格式要求：2~32 位，仅支持小写英文字母和数字，不可包含空格或特殊字符。若不填写，系统将自动生成。例如：github、google。
     * @param Id 身份源的唯一标识符，用于在系统内区分不同的身份源。格式要求：2~32 位，仅支持小写英文字母和数字，不可包含空格或特殊字符。若不填写，系统将自动生成。例如：github、google。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 身份源图标的访问地址，将展示在登录页的身份源按钮上。建议使用 64×64 像素的 SVG 格式图片以保证清晰度，支持 HTTP/HTTPS 公网可访问的图片链接。 
     * @return Picture 身份源图标的访问地址，将展示在登录页的身份源按钮上。建议使用 64×64 像素的 SVG 格式图片以保证清晰度，支持 HTTP/HTTPS 公网可访问的图片链接。
     */
    public String getPicture() {
        return this.Picture;
    }

    /**
     * Set 身份源图标的访问地址，将展示在登录页的身份源按钮上。建议使用 64×64 像素的 SVG 格式图片以保证清晰度，支持 HTTP/HTTPS 公网可访问的图片链接。
     * @param Picture 身份源图标的访问地址，将展示在登录页的身份源按钮上。建议使用 64×64 像素的 SVG 格式图片以保证清晰度，支持 HTTP/HTTPS 公网可访问的图片链接。
     */
    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    /**
     * Get 身份源对应的官方主页地址。该信息将在用户查看自己的第三方账号绑定列表时展示，帮助用户识别已绑定的身份源来源。例如 GitHub 身份源可填写：https://github.com。 
     * @return Homepage 身份源对应的官方主页地址。该信息将在用户查看自己的第三方账号绑定列表时展示，帮助用户识别已绑定的身份源来源。例如 GitHub 身份源可填写：https://github.com。
     */
    public String getHomepage() {
        return this.Homepage;
    }

    /**
     * Set 身份源对应的官方主页地址。该信息将在用户查看自己的第三方账号绑定列表时展示，帮助用户识别已绑定的身份源来源。例如 GitHub 身份源可填写：https://github.com。
     * @param Homepage 身份源对应的官方主页地址。该信息将在用户查看自己的第三方账号绑定列表时展示，帮助用户识别已绑定的身份源来源。例如 GitHub 身份源可填写：https://github.com。
     */
    public void setHomepage(String Homepage) {
        this.Homepage = Homepage;
    }

    /**
     * Get 身份认证源协议连接配置，包含与第三方平台对接所需的核心参数，如 ClientId、ClientSecret、授权端点、Token 端点、回调地址、Scope、SAML Metadata、请求和响应参数映射等。不同 ProviderType 对应不同的配置项要求。 
     * @return Config 身份认证源协议连接配置，包含与第三方平台对接所需的核心参数，如 ClientId、ClientSecret、授权端点、Token 端点、回调地址、Scope、SAML Metadata、请求和响应参数映射等。不同 ProviderType 对应不同的配置项要求。
     */
    public ProviderConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 身份认证源协议连接配置，包含与第三方平台对接所需的核心参数，如 ClientId、ClientSecret、授权端点、Token 端点、回调地址、Scope、SAML Metadata、请求和响应参数映射等。不同 ProviderType 对应不同的配置项要求。
     * @param Config 身份认证源协议连接配置，包含与第三方平台对接所需的核心参数，如 ClientId、ClientSecret、授权端点、Token 端点、回调地址、Scope、SAML Metadata、请求和响应参数映射等。不同 ProviderType 对应不同的配置项要求。
     */
    public void setConfig(ProviderConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 是否开启透传登录模式。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE，企业微信代开发应用 WX_WORK_AGENT 类型默认为 TRUE）。开启后，平台不会持久化存储用户数据，仅将第三方身份源返回的用户信息透传给业务方，适用于不希望平台留存用户数据的场景。注意：开启透传模式时，ReuseUserId 将自动设为 TRUE，AutoSignUpWithProviderUser 将自动设为 FALSE。 
     * @return TransparentMode 是否开启透传登录模式。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE，企业微信代开发应用 WX_WORK_AGENT 类型默认为 TRUE）。开启后，平台不会持久化存储用户数据，仅将第三方身份源返回的用户信息透传给业务方，适用于不希望平台留存用户数据的场景。注意：开启透传模式时，ReuseUserId 将自动设为 TRUE，AutoSignUpWithProviderUser 将自动设为 FALSE。
     */
    public String getTransparentMode() {
        return this.TransparentMode;
    }

    /**
     * Set 是否开启透传登录模式。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE，企业微信代开发应用 WX_WORK_AGENT 类型默认为 TRUE）。开启后，平台不会持久化存储用户数据，仅将第三方身份源返回的用户信息透传给业务方，适用于不希望平台留存用户数据的场景。注意：开启透传模式时，ReuseUserId 将自动设为 TRUE，AutoSignUpWithProviderUser 将自动设为 FALSE。
     * @param TransparentMode 是否开启透传登录模式。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE，企业微信代开发应用 WX_WORK_AGENT 类型默认为 TRUE）。开启后，平台不会持久化存储用户数据，仅将第三方身份源返回的用户信息透传给业务方，适用于不希望平台留存用户数据的场景。注意：开启透传模式时，ReuseUserId 将自动设为 TRUE，AutoSignUpWithProviderUser 将自动设为 FALSE。
     */
    public void setTransparentMode(String TransparentMode) {
        this.TransparentMode = TransparentMode;
    }

    /**
     * Get 身份源的详细描述信息，支持国际化多语言配置。可用于向用户说明该身份源的用途或使用场景，例如：谷歌授权登录。 
     * @return Description 身份源的详细描述信息，支持国际化多语言配置。可用于向用户说明该身份源的用途或使用场景，例如：谷歌授权登录。
     */
    public LocalizedMessage getDescription() {
        return this.Description;
    }

    /**
     * Set 身份源的详细描述信息，支持国际化多语言配置。可用于向用户说明该身份源的用途或使用场景，例如：谷歌授权登录。
     * @param Description 身份源的详细描述信息，支持国际化多语言配置。可用于向用户说明该身份源的用途或使用场景，例如：谷歌授权登录。
     */
    public void setDescription(LocalizedMessage Description) {
        this.Description = Description;
    }

    /**
     * Get 是否直接复用第三方身份源的用户 ID 作为平台的用户 ID。可选值：TRUE（直接复用，适用于已有用户体系迁移场景）、FALSE（不复用，由平台生成独立用户 ID）、UNSPECIFIED（默认为 FALSE，但当 TransparentMode 为 TRUE 时自动设为 TRUE）。注意：开启后需确保第三方用户 ID 的唯一性，避免 ID 冲突。 
     * @return ReuseUserId 是否直接复用第三方身份源的用户 ID 作为平台的用户 ID。可选值：TRUE（直接复用，适用于已有用户体系迁移场景）、FALSE（不复用，由平台生成独立用户 ID）、UNSPECIFIED（默认为 FALSE，但当 TransparentMode 为 TRUE 时自动设为 TRUE）。注意：开启后需确保第三方用户 ID 的唯一性，避免 ID 冲突。
     */
    public String getReuseUserId() {
        return this.ReuseUserId;
    }

    /**
     * Set 是否直接复用第三方身份源的用户 ID 作为平台的用户 ID。可选值：TRUE（直接复用，适用于已有用户体系迁移场景）、FALSE（不复用，由平台生成独立用户 ID）、UNSPECIFIED（默认为 FALSE，但当 TransparentMode 为 TRUE 时自动设为 TRUE）。注意：开启后需确保第三方用户 ID 的唯一性，避免 ID 冲突。
     * @param ReuseUserId 是否直接复用第三方身份源的用户 ID 作为平台的用户 ID。可选值：TRUE（直接复用，适用于已有用户体系迁移场景）、FALSE（不复用，由平台生成独立用户 ID）、UNSPECIFIED（默认为 FALSE，但当 TransparentMode 为 TRUE 时自动设为 TRUE）。注意：开启后需确保第三方用户 ID 的唯一性，避免 ID 冲突。
     */
    public void setReuseUserId(String ReuseUserId) {
        this.ReuseUserId = ReuseUserId;
    }

    /**
     * Get 身份源的启用状态。可选值：TRUE（启用，用户可通过该身份源登录）、FALSE（禁用，登录入口将被隐藏，已有绑定关系不受影响）、UNSPECIFIED（默认为 TRUE）。 
     * @return On 身份源的启用状态。可选值：TRUE（启用，用户可通过该身份源登录）、FALSE（禁用，登录入口将被隐藏，已有绑定关系不受影响）、UNSPECIFIED（默认为 TRUE）。
     */
    public String getOn() {
        return this.On;
    }

    /**
     * Set 身份源的启用状态。可选值：TRUE（启用，用户可通过该身份源登录）、FALSE（禁用，登录入口将被隐藏，已有绑定关系不受影响）、UNSPECIFIED（默认为 TRUE）。
     * @param On 身份源的启用状态。可选值：TRUE（启用，用户可通过该身份源登录）、FALSE（禁用，登录入口将被隐藏，已有绑定关系不受影响）、UNSPECIFIED（默认为 TRUE）。
     */
    public void setOn(String On) {
        this.On = On;
    }

    /**
     * Get 是否开启邮箱自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE）。开启后，若第三方身份源返回的邮箱与系统中已有用户的邮箱一致，则自动将该第三方账号与已有用户关联并完成登录，无需用户手动绑定。 
     * @return AutoSignInWhenEmailMatch 是否开启邮箱自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE）。开启后，若第三方身份源返回的邮箱与系统中已有用户的邮箱一致，则自动将该第三方账号与已有用户关联并完成登录，无需用户手动绑定。
     */
    public String getAutoSignInWhenEmailMatch() {
        return this.AutoSignInWhenEmailMatch;
    }

    /**
     * Set 是否开启邮箱自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE）。开启后，若第三方身份源返回的邮箱与系统中已有用户的邮箱一致，则自动将该第三方账号与已有用户关联并完成登录，无需用户手动绑定。
     * @param AutoSignInWhenEmailMatch 是否开启邮箱自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认为 FALSE）。开启后，若第三方身份源返回的邮箱与系统中已有用户的邮箱一致，则自动将该第三方账号与已有用户关联并完成登录，无需用户手动绑定。
     */
    public void setAutoSignInWhenEmailMatch(String AutoSignInWhenEmailMatch) {
        this.AutoSignInWhenEmailMatch = AutoSignInWhenEmailMatch;
    }

    /**
     * Get 是否开启手机号自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认行为等同 TRUE）。开启后，若第三方身份源返回的手机号与系统中已有用户的手机号一致，则自动将该第三方账号与已有用户关联并完成登录，无需用户手动绑定。注意：该字段默认行为（UNSPECIFIED）与 AutoSignInWhenEmailMatch 不同，手机号匹配在未显式关闭时默认生效。 
     * @return AutoSignInWhenPhoneNumberMatch 是否开启手机号自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认行为等同 TRUE）。开启后，若第三方身份源返回的手机号与系统中已有用户的手机号一致，则自动将该第三方账号与已有用户关联并完成登录，无需用户手动绑定。注意：该字段默认行为（UNSPECIFIED）与 AutoSignInWhenEmailMatch 不同，手机号匹配在未显式关闭时默认生效。
     */
    public String getAutoSignInWhenPhoneNumberMatch() {
        return this.AutoSignInWhenPhoneNumberMatch;
    }

    /**
     * Set 是否开启手机号自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认行为等同 TRUE）。开启后，若第三方身份源返回的手机号与系统中已有用户的手机号一致，则自动将该第三方账号与已有用户关联并完成登录，无需用户手动绑定。注意：该字段默认行为（UNSPECIFIED）与 AutoSignInWhenEmailMatch 不同，手机号匹配在未显式关闭时默认生效。
     * @param AutoSignInWhenPhoneNumberMatch 是否开启手机号自动关联登录。可选值：TRUE（开启）、FALSE（关闭）、UNSPECIFIED（默认行为等同 TRUE）。开启后，若第三方身份源返回的手机号与系统中已有用户的手机号一致，则自动将该第三方账号与已有用户关联并完成登录，无需用户手动绑定。注意：该字段默认行为（UNSPECIFIED）与 AutoSignInWhenEmailMatch 不同，手机号匹配在未显式关闭时默认生效。
     */
    public void setAutoSignInWhenPhoneNumberMatch(String AutoSignInWhenPhoneNumberMatch) {
        this.AutoSignInWhenPhoneNumberMatch = AutoSignInWhenPhoneNumberMatch;
    }

    public AddProviderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddProviderRequest(AddProviderRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Name != null) {
            this.Name = new LocalizedMessage(source.Name);
        }
        if (source.ProviderType != null) {
            this.ProviderType = new String(source.ProviderType);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Picture != null) {
            this.Picture = new String(source.Picture);
        }
        if (source.Homepage != null) {
            this.Homepage = new String(source.Homepage);
        }
        if (source.Config != null) {
            this.Config = new ProviderConfig(source.Config);
        }
        if (source.TransparentMode != null) {
            this.TransparentMode = new String(source.TransparentMode);
        }
        if (source.Description != null) {
            this.Description = new LocalizedMessage(source.Description);
        }
        if (source.ReuseUserId != null) {
            this.ReuseUserId = new String(source.ReuseUserId);
        }
        if (source.On != null) {
            this.On = new String(source.On);
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
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamObj(map, prefix + "Name.", this.Name);
        this.setParamSimple(map, prefix + "ProviderType", this.ProviderType);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Picture", this.Picture);
        this.setParamSimple(map, prefix + "Homepage", this.Homepage);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "TransparentMode", this.TransparentMode);
        this.setParamObj(map, prefix + "Description.", this.Description);
        this.setParamSimple(map, prefix + "ReuseUserId", this.ReuseUserId);
        this.setParamSimple(map, prefix + "On", this.On);
        this.setParamSimple(map, prefix + "AutoSignInWhenEmailMatch", this.AutoSignInWhenEmailMatch);
        this.setParamSimple(map, prefix + "AutoSignInWhenPhoneNumberMatch", this.AutoSignInWhenPhoneNumberMatch);

    }
}

