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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SiteFailover extends AbstractModel {

    /**
    * 源站故障转移类型。取值有：
<li>FailoverToHost:回源到指定 IP/域名；</li>
<li> FailoverToCOS:回源到腾讯云 COS；</li>
<li>FailoverToS3CompatibleObjectStorage:回源到 S3 兼容；</li>
<li> FailoverRedirectToURL :重定向至指定 URL；</li>
<li> FailoverCustomResponsePage:使用自定义响应页面。</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 源站地址，根据 Mode 的取值分为以下情况：
<li>当 Mode = FailoverToHost 时，该参数请填写 IPV4、IPV6 地址或域名；</li>
<li>当 Mode = FailoverToCOS 时，该参数请填写 COS 桶的访问域名；</li>
<li>当 Mode = FailoverToS3CompatibleObjectStorage，该参数请填写 S3 桶的访问域名。</li>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 回源协议配置。当 Mode 取值为 FailoverToHost 时该参数必填。取值有：
<li>http：使用 HTTP 协议；</li>
<li>https：使用 HTTPS 协议；</li>
<li>follow：协议跟随。</li>
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * HTTP 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 http 或者 follow 时该参数必填。
    */
    @SerializedName("HTTPOriginPort")
    @Expose
    private Long HTTPOriginPort;

    /**
    * HTTPS 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 https 或者 follow 时该参数必填。
    */
    @SerializedName("HTTPSOriginPort")
    @Expose
    private Long HTTPSOriginPort;

    /**
    * 回源Host Header 重写配置，
    */
    @SerializedName("UpstreamHostHeader")
    @Expose
    private HostHeaderParameters UpstreamHostHeader;

    /**
    * 回源 URL 重写配置。
    */
    @SerializedName("UpstreamURLRewrite")
    @Expose
    private UpstreamURLRewriteParameters UpstreamURLRewrite;

    /**
    * 回源请求参数配置。
    */
    @SerializedName("UpstreamRequestParameters")
    @Expose
    private UpstreamRequestParameters UpstreamRequestParameters;

    /**
    * HTTP2 回源配置参数。
    */
    @SerializedName("UpstreamHTTP2Parameters")
    @Expose
    private UpstreamHTTP2Parameters UpstreamHTTP2Parameters;

    /**
    * 指定是否允许访问私有对象存储源站，当源站类型 Mode = FailoverToCOS 或 FailoverToS3CompatibleObjectStorage 时该参数必填，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * 私有鉴权使用参数，该参数仅当 Mode = FailoverToS3CompatibleObjectStorage 且 PrivateAccess = on 时会生效。
    */
    @SerializedName("PrivateParameters")
    @Expose
    private OriginPrivateParameters PrivateParameters;

    /**
    * 重定向目标 URL。当 Mode 取值为 FailoverRedirectToURL 时该参数必填。
    */
    @SerializedName("RedirectURL")
    @Expose
    private String RedirectURL;

    /**
    * 响应页面 ID。当 Mode 取值为 FailoverCustomResponsePage 时该参数必填。
    */
    @SerializedName("ResponsePageId")
    @Expose
    private String ResponsePageId;

    /**
    * 响应状态码。当 Mode 取值为 FailoverRedirectToURL 或 FailoverCustomResponsePage 时该参数必填。取值有：
<li>当 Mode = FailoverRedirectToURL 时，该参数取值为 301、302、303、307、308 之一；</li>
<li>当 Mode = FailoverCustomResponsePage 时，该参数取值为 400、403、404、405、414、416、451、500、501、502、503、504 之一。</li>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
     * Get 源站故障转移类型。取值有：
<li>FailoverToHost:回源到指定 IP/域名；</li>
<li> FailoverToCOS:回源到腾讯云 COS；</li>
<li>FailoverToS3CompatibleObjectStorage:回源到 S3 兼容；</li>
<li> FailoverRedirectToURL :重定向至指定 URL；</li>
<li> FailoverCustomResponsePage:使用自定义响应页面。</li> 
     * @return Mode 源站故障转移类型。取值有：
<li>FailoverToHost:回源到指定 IP/域名；</li>
<li> FailoverToCOS:回源到腾讯云 COS；</li>
<li>FailoverToS3CompatibleObjectStorage:回源到 S3 兼容；</li>
<li> FailoverRedirectToURL :重定向至指定 URL；</li>
<li> FailoverCustomResponsePage:使用自定义响应页面。</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 源站故障转移类型。取值有：
<li>FailoverToHost:回源到指定 IP/域名；</li>
<li> FailoverToCOS:回源到腾讯云 COS；</li>
<li>FailoverToS3CompatibleObjectStorage:回源到 S3 兼容；</li>
<li> FailoverRedirectToURL :重定向至指定 URL；</li>
<li> FailoverCustomResponsePage:使用自定义响应页面。</li>
     * @param Mode 源站故障转移类型。取值有：
<li>FailoverToHost:回源到指定 IP/域名；</li>
<li> FailoverToCOS:回源到腾讯云 COS；</li>
<li>FailoverToS3CompatibleObjectStorage:回源到 S3 兼容；</li>
<li> FailoverRedirectToURL :重定向至指定 URL；</li>
<li> FailoverCustomResponsePage:使用自定义响应页面。</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 源站地址，根据 Mode 的取值分为以下情况：
<li>当 Mode = FailoverToHost 时，该参数请填写 IPV4、IPV6 地址或域名；</li>
<li>当 Mode = FailoverToCOS 时，该参数请填写 COS 桶的访问域名；</li>
<li>当 Mode = FailoverToS3CompatibleObjectStorage，该参数请填写 S3 桶的访问域名。</li> 
     * @return Origin 源站地址，根据 Mode 的取值分为以下情况：
<li>当 Mode = FailoverToHost 时，该参数请填写 IPV4、IPV6 地址或域名；</li>
<li>当 Mode = FailoverToCOS 时，该参数请填写 COS 桶的访问域名；</li>
<li>当 Mode = FailoverToS3CompatibleObjectStorage，该参数请填写 S3 桶的访问域名。</li>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站地址，根据 Mode 的取值分为以下情况：
<li>当 Mode = FailoverToHost 时，该参数请填写 IPV4、IPV6 地址或域名；</li>
<li>当 Mode = FailoverToCOS 时，该参数请填写 COS 桶的访问域名；</li>
<li>当 Mode = FailoverToS3CompatibleObjectStorage，该参数请填写 S3 桶的访问域名。</li>
     * @param Origin 源站地址，根据 Mode 的取值分为以下情况：
<li>当 Mode = FailoverToHost 时，该参数请填写 IPV4、IPV6 地址或域名；</li>
<li>当 Mode = FailoverToCOS 时，该参数请填写 COS 桶的访问域名；</li>
<li>当 Mode = FailoverToS3CompatibleObjectStorage，该参数请填写 S3 桶的访问域名。</li>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 回源协议配置。当 Mode 取值为 FailoverToHost 时该参数必填。取值有：
<li>http：使用 HTTP 协议；</li>
<li>https：使用 HTTPS 协议；</li>
<li>follow：协议跟随。</li> 
     * @return OriginProtocol 回源协议配置。当 Mode 取值为 FailoverToHost 时该参数必填。取值有：
<li>http：使用 HTTP 协议；</li>
<li>https：使用 HTTPS 协议；</li>
<li>follow：协议跟随。</li>
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set 回源协议配置。当 Mode 取值为 FailoverToHost 时该参数必填。取值有：
<li>http：使用 HTTP 协议；</li>
<li>https：使用 HTTPS 协议；</li>
<li>follow：协议跟随。</li>
     * @param OriginProtocol 回源协议配置。当 Mode 取值为 FailoverToHost 时该参数必填。取值有：
<li>http：使用 HTTP 协议；</li>
<li>https：使用 HTTPS 协议；</li>
<li>follow：协议跟随。</li>
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get HTTP 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 http 或者 follow 时该参数必填。 
     * @return HTTPOriginPort HTTP 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 http 或者 follow 时该参数必填。
     */
    public Long getHTTPOriginPort() {
        return this.HTTPOriginPort;
    }

    /**
     * Set HTTP 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 http 或者 follow 时该参数必填。
     * @param HTTPOriginPort HTTP 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 http 或者 follow 时该参数必填。
     */
    public void setHTTPOriginPort(Long HTTPOriginPort) {
        this.HTTPOriginPort = HTTPOriginPort;
    }

    /**
     * Get HTTPS 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 https 或者 follow 时该参数必填。 
     * @return HTTPSOriginPort HTTPS 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 https 或者 follow 时该参数必填。
     */
    public Long getHTTPSOriginPort() {
        return this.HTTPSOriginPort;
    }

    /**
     * Set HTTPS 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 https 或者 follow 时该参数必填。
     * @param HTTPSOriginPort HTTPS 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 https 或者 follow 时该参数必填。
     */
    public void setHTTPSOriginPort(Long HTTPSOriginPort) {
        this.HTTPSOriginPort = HTTPSOriginPort;
    }

    /**
     * Get 回源Host Header 重写配置， 
     * @return UpstreamHostHeader 回源Host Header 重写配置，
     */
    public HostHeaderParameters getUpstreamHostHeader() {
        return this.UpstreamHostHeader;
    }

    /**
     * Set 回源Host Header 重写配置，
     * @param UpstreamHostHeader 回源Host Header 重写配置，
     */
    public void setUpstreamHostHeader(HostHeaderParameters UpstreamHostHeader) {
        this.UpstreamHostHeader = UpstreamHostHeader;
    }

    /**
     * Get 回源 URL 重写配置。 
     * @return UpstreamURLRewrite 回源 URL 重写配置。
     */
    public UpstreamURLRewriteParameters getUpstreamURLRewrite() {
        return this.UpstreamURLRewrite;
    }

    /**
     * Set 回源 URL 重写配置。
     * @param UpstreamURLRewrite 回源 URL 重写配置。
     */
    public void setUpstreamURLRewrite(UpstreamURLRewriteParameters UpstreamURLRewrite) {
        this.UpstreamURLRewrite = UpstreamURLRewrite;
    }

    /**
     * Get 回源请求参数配置。 
     * @return UpstreamRequestParameters 回源请求参数配置。
     */
    public UpstreamRequestParameters getUpstreamRequestParameters() {
        return this.UpstreamRequestParameters;
    }

    /**
     * Set 回源请求参数配置。
     * @param UpstreamRequestParameters 回源请求参数配置。
     */
    public void setUpstreamRequestParameters(UpstreamRequestParameters UpstreamRequestParameters) {
        this.UpstreamRequestParameters = UpstreamRequestParameters;
    }

    /**
     * Get HTTP2 回源配置参数。 
     * @return UpstreamHTTP2Parameters HTTP2 回源配置参数。
     */
    public UpstreamHTTP2Parameters getUpstreamHTTP2Parameters() {
        return this.UpstreamHTTP2Parameters;
    }

    /**
     * Set HTTP2 回源配置参数。
     * @param UpstreamHTTP2Parameters HTTP2 回源配置参数。
     */
    public void setUpstreamHTTP2Parameters(UpstreamHTTP2Parameters UpstreamHTTP2Parameters) {
        this.UpstreamHTTP2Parameters = UpstreamHTTP2Parameters;
    }

    /**
     * Get 指定是否允许访问私有对象存储源站，当源站类型 Mode = FailoverToCOS 或 FailoverToS3CompatibleObjectStorage 时该参数必填，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li> 
     * @return PrivateAccess 指定是否允许访问私有对象存储源站，当源站类型 Mode = FailoverToCOS 或 FailoverToS3CompatibleObjectStorage 时该参数必填，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set 指定是否允许访问私有对象存储源站，当源站类型 Mode = FailoverToCOS 或 FailoverToS3CompatibleObjectStorage 时该参数必填，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
     * @param PrivateAccess 指定是否允许访问私有对象存储源站，当源站类型 Mode = FailoverToCOS 或 FailoverToS3CompatibleObjectStorage 时该参数必填，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get 私有鉴权使用参数，该参数仅当 Mode = FailoverToS3CompatibleObjectStorage 且 PrivateAccess = on 时会生效。 
     * @return PrivateParameters 私有鉴权使用参数，该参数仅当 Mode = FailoverToS3CompatibleObjectStorage 且 PrivateAccess = on 时会生效。
     */
    public OriginPrivateParameters getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set 私有鉴权使用参数，该参数仅当 Mode = FailoverToS3CompatibleObjectStorage 且 PrivateAccess = on 时会生效。
     * @param PrivateParameters 私有鉴权使用参数，该参数仅当 Mode = FailoverToS3CompatibleObjectStorage 且 PrivateAccess = on 时会生效。
     */
    public void setPrivateParameters(OriginPrivateParameters PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    /**
     * Get 重定向目标 URL。当 Mode 取值为 FailoverRedirectToURL 时该参数必填。 
     * @return RedirectURL 重定向目标 URL。当 Mode 取值为 FailoverRedirectToURL 时该参数必填。
     */
    public String getRedirectURL() {
        return this.RedirectURL;
    }

    /**
     * Set 重定向目标 URL。当 Mode 取值为 FailoverRedirectToURL 时该参数必填。
     * @param RedirectURL 重定向目标 URL。当 Mode 取值为 FailoverRedirectToURL 时该参数必填。
     */
    public void setRedirectURL(String RedirectURL) {
        this.RedirectURL = RedirectURL;
    }

    /**
     * Get 响应页面 ID。当 Mode 取值为 FailoverCustomResponsePage 时该参数必填。 
     * @return ResponsePageId 响应页面 ID。当 Mode 取值为 FailoverCustomResponsePage 时该参数必填。
     */
    public String getResponsePageId() {
        return this.ResponsePageId;
    }

    /**
     * Set 响应页面 ID。当 Mode 取值为 FailoverCustomResponsePage 时该参数必填。
     * @param ResponsePageId 响应页面 ID。当 Mode 取值为 FailoverCustomResponsePage 时该参数必填。
     */
    public void setResponsePageId(String ResponsePageId) {
        this.ResponsePageId = ResponsePageId;
    }

    /**
     * Get 响应状态码。当 Mode 取值为 FailoverRedirectToURL 或 FailoverCustomResponsePage 时该参数必填。取值有：
<li>当 Mode = FailoverRedirectToURL 时，该参数取值为 301、302、303、307、308 之一；</li>
<li>当 Mode = FailoverCustomResponsePage 时，该参数取值为 400、403、404、405、414、416、451、500、501、502、503、504 之一。</li> 
     * @return StatusCode 响应状态码。当 Mode 取值为 FailoverRedirectToURL 或 FailoverCustomResponsePage 时该参数必填。取值有：
<li>当 Mode = FailoverRedirectToURL 时，该参数取值为 301、302、303、307、308 之一；</li>
<li>当 Mode = FailoverCustomResponsePage 时，该参数取值为 400、403、404、405、414、416、451、500、501、502、503、504 之一。</li>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 响应状态码。当 Mode 取值为 FailoverRedirectToURL 或 FailoverCustomResponsePage 时该参数必填。取值有：
<li>当 Mode = FailoverRedirectToURL 时，该参数取值为 301、302、303、307、308 之一；</li>
<li>当 Mode = FailoverCustomResponsePage 时，该参数取值为 400、403、404、405、414、416、451、500、501、502、503、504 之一。</li>
     * @param StatusCode 响应状态码。当 Mode 取值为 FailoverRedirectToURL 或 FailoverCustomResponsePage 时该参数必填。取值有：
<li>当 Mode = FailoverRedirectToURL 时，该参数取值为 301、302、303、307、308 之一；</li>
<li>当 Mode = FailoverCustomResponsePage 时，该参数取值为 400、403、404、405、414、416、451、500、501、502、503、504 之一。</li>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    public SiteFailover() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SiteFailover(SiteFailover source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.OriginProtocol != null) {
            this.OriginProtocol = new String(source.OriginProtocol);
        }
        if (source.HTTPOriginPort != null) {
            this.HTTPOriginPort = new Long(source.HTTPOriginPort);
        }
        if (source.HTTPSOriginPort != null) {
            this.HTTPSOriginPort = new Long(source.HTTPSOriginPort);
        }
        if (source.UpstreamHostHeader != null) {
            this.UpstreamHostHeader = new HostHeaderParameters(source.UpstreamHostHeader);
        }
        if (source.UpstreamURLRewrite != null) {
            this.UpstreamURLRewrite = new UpstreamURLRewriteParameters(source.UpstreamURLRewrite);
        }
        if (source.UpstreamRequestParameters != null) {
            this.UpstreamRequestParameters = new UpstreamRequestParameters(source.UpstreamRequestParameters);
        }
        if (source.UpstreamHTTP2Parameters != null) {
            this.UpstreamHTTP2Parameters = new UpstreamHTTP2Parameters(source.UpstreamHTTP2Parameters);
        }
        if (source.PrivateAccess != null) {
            this.PrivateAccess = new String(source.PrivateAccess);
        }
        if (source.PrivateParameters != null) {
            this.PrivateParameters = new OriginPrivateParameters(source.PrivateParameters);
        }
        if (source.RedirectURL != null) {
            this.RedirectURL = new String(source.RedirectURL);
        }
        if (source.ResponsePageId != null) {
            this.ResponsePageId = new String(source.ResponsePageId);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "OriginProtocol", this.OriginProtocol);
        this.setParamSimple(map, prefix + "HTTPOriginPort", this.HTTPOriginPort);
        this.setParamSimple(map, prefix + "HTTPSOriginPort", this.HTTPSOriginPort);
        this.setParamObj(map, prefix + "UpstreamHostHeader.", this.UpstreamHostHeader);
        this.setParamObj(map, prefix + "UpstreamURLRewrite.", this.UpstreamURLRewrite);
        this.setParamObj(map, prefix + "UpstreamRequestParameters.", this.UpstreamRequestParameters);
        this.setParamObj(map, prefix + "UpstreamHTTP2Parameters.", this.UpstreamHTTP2Parameters);
        this.setParamSimple(map, prefix + "PrivateAccess", this.PrivateAccess);
        this.setParamObj(map, prefix + "PrivateParameters.", this.PrivateParameters);
        this.setParamSimple(map, prefix + "RedirectURL", this.RedirectURL);
        this.setParamSimple(map, prefix + "ResponsePageId", this.ResponsePageId);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);

    }
}

