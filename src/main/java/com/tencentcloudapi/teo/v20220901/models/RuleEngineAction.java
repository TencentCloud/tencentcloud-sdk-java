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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleEngineAction extends AbstractModel {

    /**
    * 操作名称。名称需要与参数结构体对应，例如 Name=Cache，则 CacheParameters 必填。
<li>Cache：节点缓存 TTL；</li>
<li>CacheKey：自定义 Cache Key；</li>
<li>CachePrefresh：缓存预刷新；</li>
<li>AccessURLRedirect：访问 URL 重定向；</li>
<li>UpstreamURLRewrite：回源 URL 重写；</li>
<li>QUIC：QUIC；</li>
<li>WebSocket：WebSocket；</li>
<li>Authentication：Token 鉴权；</li>
<li>MaxAge：浏览器缓存 TTL；</li>
<li>StatusCodeCache：状态码缓存 TTL；</li>
<li>OfflineCache：离线缓存；</li>
<li>SmartRouting：智能加速；</li>
<li>RangeOriginPull：分片回源 ；</li>
<li>UpstreamHTTP2：HTTP2 回源；</li>
<li>HostHeader：Host Header 重写；</li>
<li>ForceRedirectHTTPS：访问协议强制 HTTPS 跳转配置；</li>
<li>OriginPullProtocol：回源 HTTPS；</li>
<li>Compression：智能压缩配置；</li>
<li>HSTS：HSTS；</li>
<li>ClientIPHeader：存储客户端请求 IP 的头部信息配置；</li>
<li>OCSPStapling：OCSP 装订；</li>
<li>HTTP2：HTTP2 接入；</li>
<li>PostMaxSize：POST 请求上传文件流式传输最大限制配置；</li>
<li>ClientIPCountry：回源时携带客户端 IP 所属地域信息；</li>
<li>UpstreamFollowRedirect：回源跟随重定向参数配置；</li>
<li>UpstreamRequest：回源请求参数；</li>
<li>TLSConfig：SSL/TLS 安全；</li>
<li>ModifyOrigin：修改源站；</li>
<li>HTTPUpstreamTimeout：七层回源超时配置；</li>
<li>HttpResponse：HTTP 应答；</li>
<li>ErrorPage：自定义错误页面；</li>
<li>ModifyResponseHeader：修改 HTTP 节点响应头；</li>
<li>ModifyRequestHeader：修改 HTTP 节点请求头；</li>
<li>ResponseSpeedLimit：单连接下载限速；</li>
<li>SetContentIdentifier：设置内容标识符；</li>
<li>Vary：Vary 特性配置。</li>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 节点缓存 TTL 配置参数，当 Name 取值为 Cache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheParameters")
    @Expose
    private CacheParameters CacheParameters;

    /**
    * 自定义 Cache Key 配置参数，当 Name 取值为 CacheKey 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheKeyParameters")
    @Expose
    private CacheKeyParameters CacheKeyParameters;

    /**
    * 缓存预刷新配置参数，当 Name 取值为 CachePrefresh 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CachePrefreshParameters")
    @Expose
    private CachePrefreshParameters CachePrefreshParameters;

    /**
    * 访问 URL 重定向配置参数，当 Name 取值为 AccessURLRedirect 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessURLRedirectParameters")
    @Expose
    private AccessURLRedirectParameters AccessURLRedirectParameters;

    /**
    * 回源 URL 重写配置参数，当 Name 取值为 UpstreamURLRewrite 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamURLRewriteParameters")
    @Expose
    private UpstreamURLRewriteParameters UpstreamURLRewriteParameters;

    /**
    * QUIC 配置参数，当 Name 取值为 QUIC 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QUICParameters")
    @Expose
    private QUICParameters QUICParameters;

    /**
    * WebSocket 配置参数，当 Name 取值为 WebSocket 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebSocketParameters")
    @Expose
    private WebSocketParameters WebSocketParameters;

    /**
    * Token 鉴权配置参数，当 Name 取值为 Authentication 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthenticationParameters")
    @Expose
    private AuthenticationParameters AuthenticationParameters;

    /**
    * 浏览器缓存 TTL 配置参数，当 Name 取值为 MaxAge 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxAgeParameters")
    @Expose
    private MaxAgeParameters MaxAgeParameters;

    /**
    * 状态码缓存 TTL 配置参数，当 Name 取值为 StatusCodeCache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusCodeCacheParameters")
    @Expose
    private StatusCodeCacheParameters StatusCodeCacheParameters;

    /**
    * 离线缓存配置参数，当 Name 取值为 OfflineCache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineCacheParameters")
    @Expose
    private OfflineCacheParameters OfflineCacheParameters;

    /**
    * 智能加速配置参数，当 Name 取值为 SmartRouting 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartRoutingParameters")
    @Expose
    private SmartRoutingParameters SmartRoutingParameters;

    /**
    * 分片回源配置参数，当 Name 取值为 RangeOriginPull 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RangeOriginPullParameters")
    @Expose
    private RangeOriginPullParameters RangeOriginPullParameters;

    /**
    * HTTP2 回源配置参数，当 Name 取值为 UpstreamHTTP2 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamHTTP2Parameters")
    @Expose
    private UpstreamHTTP2Parameters UpstreamHTTP2Parameters;

    /**
    * Host Header 重写配置参数，当 Name 取值为 HostHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostHeaderParameters")
    @Expose
    private HostHeaderParameters HostHeaderParameters;

    /**
    * 访问协议强制 HTTPS 跳转配置，当 Name 取值为 ForceRedirectHTTPS 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceRedirectHTTPSParameters")
    @Expose
    private ForceRedirectHTTPSParameters ForceRedirectHTTPSParameters;

    /**
    * 智能压缩配置，当 Name 取值为 Compression 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompressionParameters")
    @Expose
    private CompressionParameters CompressionParameters;

    /**
    * HSTS 配置参数，当 Name 取值为 HSTS 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HSTSParameters")
    @Expose
    private HSTSParameters HSTSParameters;

    /**
    * 存储客户端请求 IP 的头部信息配置，当 Name 取值为 ClientIPHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIPHeaderParameters")
    @Expose
    private ClientIPHeaderParameters ClientIPHeaderParameters;

    /**
    * OCSP 装订配置参数，当 Name 取值为 OCSPStapling 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OCSPStaplingParameters")
    @Expose
    private OCSPStaplingParameters OCSPStaplingParameters;

    /**
    * HTTP2 接入配置参数，当 Name 取值为 HTTP2 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HTTP2Parameters")
    @Expose
    private HTTP2Parameters HTTP2Parameters;

    /**
    * POST 请求上传文件流式传输最大限制配置，当 Name 取值为 PostMaxSize 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostMaxSizeParameters")
    @Expose
    private PostMaxSizeParameters PostMaxSizeParameters;

    /**
    * 回源时携带客户端 IP 所属地域信息配置参数，当 Name 取值为 ClientIPCountry 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIPCountryParameters")
    @Expose
    private ClientIPCountryParameters ClientIPCountryParameters;

    /**
    * 回源跟随重定向参数配置，当 Name 取值为 UpstreamFollowRedirect 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamFollowRedirectParameters")
    @Expose
    private UpstreamFollowRedirectParameters UpstreamFollowRedirectParameters;

    /**
    * 回源请求参数配置参数，当 Name 取值为 UpstreamRequest 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamRequestParameters")
    @Expose
    private UpstreamRequestParameters UpstreamRequestParameters;

    /**
    * SSL/TLS 安全配置参数，当 Name 取值为 TLSConfig 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TLSConfigParameters")
    @Expose
    private TLSConfigParameters TLSConfigParameters;

    /**
    * 修改源站配置参数，当 Name 取值为 ModifyOrigin 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyOriginParameters")
    @Expose
    private ModifyOriginParameters ModifyOriginParameters;

    /**
    * 七层回源超时配置，当 Name 取值为 HTTPUpstreamTimeout 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HTTPUpstreamTimeoutParameters")
    @Expose
    private HTTPUpstreamTimeoutParameters HTTPUpstreamTimeoutParameters;

    /**
    * HTTP 应答配置参数，当 Name 取值为 HttpResponse 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpResponseParameters")
    @Expose
    private HTTPResponseParameters HttpResponseParameters;

    /**
    * 自定义错误页面配置参数，当 Name 取值为 ErrorPage 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorPageParameters")
    @Expose
    private ErrorPageParameters ErrorPageParameters;

    /**
    * 修改 HTTP 节点响应头配置参数，当 Name 取值为 ModifyResponseHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyResponseHeaderParameters")
    @Expose
    private ModifyResponseHeaderParameters ModifyResponseHeaderParameters;

    /**
    * 修改 HTTP 节点请求头配置参数，当 Name 取值为 ModifyRequestHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyRequestHeaderParameters")
    @Expose
    private ModifyRequestHeaderParameters ModifyRequestHeaderParameters;

    /**
    * 单连接下载限速配置参数，当 Name 取值为 ResponseSpeedLimit 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseSpeedLimitParameters")
    @Expose
    private ResponseSpeedLimitParameters ResponseSpeedLimitParameters;

    /**
    * 内容标识配置参数，当 Name 取值为 SetContentIdentifier 时，该参数必填。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetContentIdentifierParameters")
    @Expose
    private SetContentIdentifierParameters SetContentIdentifierParameters;

    /**
    * Vary 特性配置参数，当 Name 取值为 Vary 时，该参数必填。
    */
    @SerializedName("VaryParameters")
    @Expose
    private VaryParameters VaryParameters;

    /**
     * Get 操作名称。名称需要与参数结构体对应，例如 Name=Cache，则 CacheParameters 必填。
<li>Cache：节点缓存 TTL；</li>
<li>CacheKey：自定义 Cache Key；</li>
<li>CachePrefresh：缓存预刷新；</li>
<li>AccessURLRedirect：访问 URL 重定向；</li>
<li>UpstreamURLRewrite：回源 URL 重写；</li>
<li>QUIC：QUIC；</li>
<li>WebSocket：WebSocket；</li>
<li>Authentication：Token 鉴权；</li>
<li>MaxAge：浏览器缓存 TTL；</li>
<li>StatusCodeCache：状态码缓存 TTL；</li>
<li>OfflineCache：离线缓存；</li>
<li>SmartRouting：智能加速；</li>
<li>RangeOriginPull：分片回源 ；</li>
<li>UpstreamHTTP2：HTTP2 回源；</li>
<li>HostHeader：Host Header 重写；</li>
<li>ForceRedirectHTTPS：访问协议强制 HTTPS 跳转配置；</li>
<li>OriginPullProtocol：回源 HTTPS；</li>
<li>Compression：智能压缩配置；</li>
<li>HSTS：HSTS；</li>
<li>ClientIPHeader：存储客户端请求 IP 的头部信息配置；</li>
<li>OCSPStapling：OCSP 装订；</li>
<li>HTTP2：HTTP2 接入；</li>
<li>PostMaxSize：POST 请求上传文件流式传输最大限制配置；</li>
<li>ClientIPCountry：回源时携带客户端 IP 所属地域信息；</li>
<li>UpstreamFollowRedirect：回源跟随重定向参数配置；</li>
<li>UpstreamRequest：回源请求参数；</li>
<li>TLSConfig：SSL/TLS 安全；</li>
<li>ModifyOrigin：修改源站；</li>
<li>HTTPUpstreamTimeout：七层回源超时配置；</li>
<li>HttpResponse：HTTP 应答；</li>
<li>ErrorPage：自定义错误页面；</li>
<li>ModifyResponseHeader：修改 HTTP 节点响应头；</li>
<li>ModifyRequestHeader：修改 HTTP 节点请求头；</li>
<li>ResponseSpeedLimit：单连接下载限速；</li>
<li>SetContentIdentifier：设置内容标识符；</li>
<li>Vary：Vary 特性配置。</li> 
     * @return Name 操作名称。名称需要与参数结构体对应，例如 Name=Cache，则 CacheParameters 必填。
<li>Cache：节点缓存 TTL；</li>
<li>CacheKey：自定义 Cache Key；</li>
<li>CachePrefresh：缓存预刷新；</li>
<li>AccessURLRedirect：访问 URL 重定向；</li>
<li>UpstreamURLRewrite：回源 URL 重写；</li>
<li>QUIC：QUIC；</li>
<li>WebSocket：WebSocket；</li>
<li>Authentication：Token 鉴权；</li>
<li>MaxAge：浏览器缓存 TTL；</li>
<li>StatusCodeCache：状态码缓存 TTL；</li>
<li>OfflineCache：离线缓存；</li>
<li>SmartRouting：智能加速；</li>
<li>RangeOriginPull：分片回源 ；</li>
<li>UpstreamHTTP2：HTTP2 回源；</li>
<li>HostHeader：Host Header 重写；</li>
<li>ForceRedirectHTTPS：访问协议强制 HTTPS 跳转配置；</li>
<li>OriginPullProtocol：回源 HTTPS；</li>
<li>Compression：智能压缩配置；</li>
<li>HSTS：HSTS；</li>
<li>ClientIPHeader：存储客户端请求 IP 的头部信息配置；</li>
<li>OCSPStapling：OCSP 装订；</li>
<li>HTTP2：HTTP2 接入；</li>
<li>PostMaxSize：POST 请求上传文件流式传输最大限制配置；</li>
<li>ClientIPCountry：回源时携带客户端 IP 所属地域信息；</li>
<li>UpstreamFollowRedirect：回源跟随重定向参数配置；</li>
<li>UpstreamRequest：回源请求参数；</li>
<li>TLSConfig：SSL/TLS 安全；</li>
<li>ModifyOrigin：修改源站；</li>
<li>HTTPUpstreamTimeout：七层回源超时配置；</li>
<li>HttpResponse：HTTP 应答；</li>
<li>ErrorPage：自定义错误页面；</li>
<li>ModifyResponseHeader：修改 HTTP 节点响应头；</li>
<li>ModifyRequestHeader：修改 HTTP 节点请求头；</li>
<li>ResponseSpeedLimit：单连接下载限速；</li>
<li>SetContentIdentifier：设置内容标识符；</li>
<li>Vary：Vary 特性配置。</li>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 操作名称。名称需要与参数结构体对应，例如 Name=Cache，则 CacheParameters 必填。
<li>Cache：节点缓存 TTL；</li>
<li>CacheKey：自定义 Cache Key；</li>
<li>CachePrefresh：缓存预刷新；</li>
<li>AccessURLRedirect：访问 URL 重定向；</li>
<li>UpstreamURLRewrite：回源 URL 重写；</li>
<li>QUIC：QUIC；</li>
<li>WebSocket：WebSocket；</li>
<li>Authentication：Token 鉴权；</li>
<li>MaxAge：浏览器缓存 TTL；</li>
<li>StatusCodeCache：状态码缓存 TTL；</li>
<li>OfflineCache：离线缓存；</li>
<li>SmartRouting：智能加速；</li>
<li>RangeOriginPull：分片回源 ；</li>
<li>UpstreamHTTP2：HTTP2 回源；</li>
<li>HostHeader：Host Header 重写；</li>
<li>ForceRedirectHTTPS：访问协议强制 HTTPS 跳转配置；</li>
<li>OriginPullProtocol：回源 HTTPS；</li>
<li>Compression：智能压缩配置；</li>
<li>HSTS：HSTS；</li>
<li>ClientIPHeader：存储客户端请求 IP 的头部信息配置；</li>
<li>OCSPStapling：OCSP 装订；</li>
<li>HTTP2：HTTP2 接入；</li>
<li>PostMaxSize：POST 请求上传文件流式传输最大限制配置；</li>
<li>ClientIPCountry：回源时携带客户端 IP 所属地域信息；</li>
<li>UpstreamFollowRedirect：回源跟随重定向参数配置；</li>
<li>UpstreamRequest：回源请求参数；</li>
<li>TLSConfig：SSL/TLS 安全；</li>
<li>ModifyOrigin：修改源站；</li>
<li>HTTPUpstreamTimeout：七层回源超时配置；</li>
<li>HttpResponse：HTTP 应答；</li>
<li>ErrorPage：自定义错误页面；</li>
<li>ModifyResponseHeader：修改 HTTP 节点响应头；</li>
<li>ModifyRequestHeader：修改 HTTP 节点请求头；</li>
<li>ResponseSpeedLimit：单连接下载限速；</li>
<li>SetContentIdentifier：设置内容标识符；</li>
<li>Vary：Vary 特性配置。</li>
     * @param Name 操作名称。名称需要与参数结构体对应，例如 Name=Cache，则 CacheParameters 必填。
<li>Cache：节点缓存 TTL；</li>
<li>CacheKey：自定义 Cache Key；</li>
<li>CachePrefresh：缓存预刷新；</li>
<li>AccessURLRedirect：访问 URL 重定向；</li>
<li>UpstreamURLRewrite：回源 URL 重写；</li>
<li>QUIC：QUIC；</li>
<li>WebSocket：WebSocket；</li>
<li>Authentication：Token 鉴权；</li>
<li>MaxAge：浏览器缓存 TTL；</li>
<li>StatusCodeCache：状态码缓存 TTL；</li>
<li>OfflineCache：离线缓存；</li>
<li>SmartRouting：智能加速；</li>
<li>RangeOriginPull：分片回源 ；</li>
<li>UpstreamHTTP2：HTTP2 回源；</li>
<li>HostHeader：Host Header 重写；</li>
<li>ForceRedirectHTTPS：访问协议强制 HTTPS 跳转配置；</li>
<li>OriginPullProtocol：回源 HTTPS；</li>
<li>Compression：智能压缩配置；</li>
<li>HSTS：HSTS；</li>
<li>ClientIPHeader：存储客户端请求 IP 的头部信息配置；</li>
<li>OCSPStapling：OCSP 装订；</li>
<li>HTTP2：HTTP2 接入；</li>
<li>PostMaxSize：POST 请求上传文件流式传输最大限制配置；</li>
<li>ClientIPCountry：回源时携带客户端 IP 所属地域信息；</li>
<li>UpstreamFollowRedirect：回源跟随重定向参数配置；</li>
<li>UpstreamRequest：回源请求参数；</li>
<li>TLSConfig：SSL/TLS 安全；</li>
<li>ModifyOrigin：修改源站；</li>
<li>HTTPUpstreamTimeout：七层回源超时配置；</li>
<li>HttpResponse：HTTP 应答；</li>
<li>ErrorPage：自定义错误页面；</li>
<li>ModifyResponseHeader：修改 HTTP 节点响应头；</li>
<li>ModifyRequestHeader：修改 HTTP 节点请求头；</li>
<li>ResponseSpeedLimit：单连接下载限速；</li>
<li>SetContentIdentifier：设置内容标识符；</li>
<li>Vary：Vary 特性配置。</li>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 节点缓存 TTL 配置参数，当 Name 取值为 Cache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheParameters 节点缓存 TTL 配置参数，当 Name 取值为 Cache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheParameters getCacheParameters() {
        return this.CacheParameters;
    }

    /**
     * Set 节点缓存 TTL 配置参数，当 Name 取值为 Cache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheParameters 节点缓存 TTL 配置参数，当 Name 取值为 Cache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheParameters(CacheParameters CacheParameters) {
        this.CacheParameters = CacheParameters;
    }

    /**
     * Get 自定义 Cache Key 配置参数，当 Name 取值为 CacheKey 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheKeyParameters 自定义 Cache Key 配置参数，当 Name 取值为 CacheKey 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKeyParameters getCacheKeyParameters() {
        return this.CacheKeyParameters;
    }

    /**
     * Set 自定义 Cache Key 配置参数，当 Name 取值为 CacheKey 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheKeyParameters 自定义 Cache Key 配置参数，当 Name 取值为 CacheKey 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheKeyParameters(CacheKeyParameters CacheKeyParameters) {
        this.CacheKeyParameters = CacheKeyParameters;
    }

    /**
     * Get 缓存预刷新配置参数，当 Name 取值为 CachePrefresh 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CachePrefreshParameters 缓存预刷新配置参数，当 Name 取值为 CachePrefresh 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CachePrefreshParameters getCachePrefreshParameters() {
        return this.CachePrefreshParameters;
    }

    /**
     * Set 缓存预刷新配置参数，当 Name 取值为 CachePrefresh 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CachePrefreshParameters 缓存预刷新配置参数，当 Name 取值为 CachePrefresh 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCachePrefreshParameters(CachePrefreshParameters CachePrefreshParameters) {
        this.CachePrefreshParameters = CachePrefreshParameters;
    }

    /**
     * Get 访问 URL 重定向配置参数，当 Name 取值为 AccessURLRedirect 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessURLRedirectParameters 访问 URL 重定向配置参数，当 Name 取值为 AccessURLRedirect 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessURLRedirectParameters getAccessURLRedirectParameters() {
        return this.AccessURLRedirectParameters;
    }

    /**
     * Set 访问 URL 重定向配置参数，当 Name 取值为 AccessURLRedirect 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessURLRedirectParameters 访问 URL 重定向配置参数，当 Name 取值为 AccessURLRedirect 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessURLRedirectParameters(AccessURLRedirectParameters AccessURLRedirectParameters) {
        this.AccessURLRedirectParameters = AccessURLRedirectParameters;
    }

    /**
     * Get 回源 URL 重写配置参数，当 Name 取值为 UpstreamURLRewrite 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamURLRewriteParameters 回源 URL 重写配置参数，当 Name 取值为 UpstreamURLRewrite 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpstreamURLRewriteParameters getUpstreamURLRewriteParameters() {
        return this.UpstreamURLRewriteParameters;
    }

    /**
     * Set 回源 URL 重写配置参数，当 Name 取值为 UpstreamURLRewrite 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamURLRewriteParameters 回源 URL 重写配置参数，当 Name 取值为 UpstreamURLRewrite 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamURLRewriteParameters(UpstreamURLRewriteParameters UpstreamURLRewriteParameters) {
        this.UpstreamURLRewriteParameters = UpstreamURLRewriteParameters;
    }

    /**
     * Get QUIC 配置参数，当 Name 取值为 QUIC 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QUICParameters QUIC 配置参数，当 Name 取值为 QUIC 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QUICParameters getQUICParameters() {
        return this.QUICParameters;
    }

    /**
     * Set QUIC 配置参数，当 Name 取值为 QUIC 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QUICParameters QUIC 配置参数，当 Name 取值为 QUIC 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQUICParameters(QUICParameters QUICParameters) {
        this.QUICParameters = QUICParameters;
    }

    /**
     * Get WebSocket 配置参数，当 Name 取值为 WebSocket 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebSocketParameters WebSocket 配置参数，当 Name 取值为 WebSocket 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebSocketParameters getWebSocketParameters() {
        return this.WebSocketParameters;
    }

    /**
     * Set WebSocket 配置参数，当 Name 取值为 WebSocket 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebSocketParameters WebSocket 配置参数，当 Name 取值为 WebSocket 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebSocketParameters(WebSocketParameters WebSocketParameters) {
        this.WebSocketParameters = WebSocketParameters;
    }

    /**
     * Get Token 鉴权配置参数，当 Name 取值为 Authentication 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthenticationParameters Token 鉴权配置参数，当 Name 取值为 Authentication 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AuthenticationParameters getAuthenticationParameters() {
        return this.AuthenticationParameters;
    }

    /**
     * Set Token 鉴权配置参数，当 Name 取值为 Authentication 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthenticationParameters Token 鉴权配置参数，当 Name 取值为 Authentication 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthenticationParameters(AuthenticationParameters AuthenticationParameters) {
        this.AuthenticationParameters = AuthenticationParameters;
    }

    /**
     * Get 浏览器缓存 TTL 配置参数，当 Name 取值为 MaxAge 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxAgeParameters 浏览器缓存 TTL 配置参数，当 Name 取值为 MaxAge 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaxAgeParameters getMaxAgeParameters() {
        return this.MaxAgeParameters;
    }

    /**
     * Set 浏览器缓存 TTL 配置参数，当 Name 取值为 MaxAge 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxAgeParameters 浏览器缓存 TTL 配置参数，当 Name 取值为 MaxAge 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxAgeParameters(MaxAgeParameters MaxAgeParameters) {
        this.MaxAgeParameters = MaxAgeParameters;
    }

    /**
     * Get 状态码缓存 TTL 配置参数，当 Name 取值为 StatusCodeCache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusCodeCacheParameters 状态码缓存 TTL 配置参数，当 Name 取值为 StatusCodeCache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusCodeCacheParameters getStatusCodeCacheParameters() {
        return this.StatusCodeCacheParameters;
    }

    /**
     * Set 状态码缓存 TTL 配置参数，当 Name 取值为 StatusCodeCache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusCodeCacheParameters 状态码缓存 TTL 配置参数，当 Name 取值为 StatusCodeCache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusCodeCacheParameters(StatusCodeCacheParameters StatusCodeCacheParameters) {
        this.StatusCodeCacheParameters = StatusCodeCacheParameters;
    }

    /**
     * Get 离线缓存配置参数，当 Name 取值为 OfflineCache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineCacheParameters 离线缓存配置参数，当 Name 取值为 OfflineCache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OfflineCacheParameters getOfflineCacheParameters() {
        return this.OfflineCacheParameters;
    }

    /**
     * Set 离线缓存配置参数，当 Name 取值为 OfflineCache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineCacheParameters 离线缓存配置参数，当 Name 取值为 OfflineCache 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineCacheParameters(OfflineCacheParameters OfflineCacheParameters) {
        this.OfflineCacheParameters = OfflineCacheParameters;
    }

    /**
     * Get 智能加速配置参数，当 Name 取值为 SmartRouting 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartRoutingParameters 智能加速配置参数，当 Name 取值为 SmartRouting 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartRoutingParameters getSmartRoutingParameters() {
        return this.SmartRoutingParameters;
    }

    /**
     * Set 智能加速配置参数，当 Name 取值为 SmartRouting 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartRoutingParameters 智能加速配置参数，当 Name 取值为 SmartRouting 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartRoutingParameters(SmartRoutingParameters SmartRoutingParameters) {
        this.SmartRoutingParameters = SmartRoutingParameters;
    }

    /**
     * Get 分片回源配置参数，当 Name 取值为 RangeOriginPull 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RangeOriginPullParameters 分片回源配置参数，当 Name 取值为 RangeOriginPull 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RangeOriginPullParameters getRangeOriginPullParameters() {
        return this.RangeOriginPullParameters;
    }

    /**
     * Set 分片回源配置参数，当 Name 取值为 RangeOriginPull 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RangeOriginPullParameters 分片回源配置参数，当 Name 取值为 RangeOriginPull 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRangeOriginPullParameters(RangeOriginPullParameters RangeOriginPullParameters) {
        this.RangeOriginPullParameters = RangeOriginPullParameters;
    }

    /**
     * Get HTTP2 回源配置参数，当 Name 取值为 UpstreamHTTP2 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamHTTP2Parameters HTTP2 回源配置参数，当 Name 取值为 UpstreamHTTP2 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpstreamHTTP2Parameters getUpstreamHTTP2Parameters() {
        return this.UpstreamHTTP2Parameters;
    }

    /**
     * Set HTTP2 回源配置参数，当 Name 取值为 UpstreamHTTP2 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamHTTP2Parameters HTTP2 回源配置参数，当 Name 取值为 UpstreamHTTP2 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamHTTP2Parameters(UpstreamHTTP2Parameters UpstreamHTTP2Parameters) {
        this.UpstreamHTTP2Parameters = UpstreamHTTP2Parameters;
    }

    /**
     * Get Host Header 重写配置参数，当 Name 取值为 HostHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostHeaderParameters Host Header 重写配置参数，当 Name 取值为 HostHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HostHeaderParameters getHostHeaderParameters() {
        return this.HostHeaderParameters;
    }

    /**
     * Set Host Header 重写配置参数，当 Name 取值为 HostHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostHeaderParameters Host Header 重写配置参数，当 Name 取值为 HostHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostHeaderParameters(HostHeaderParameters HostHeaderParameters) {
        this.HostHeaderParameters = HostHeaderParameters;
    }

    /**
     * Get 访问协议强制 HTTPS 跳转配置，当 Name 取值为 ForceRedirectHTTPS 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceRedirectHTTPSParameters 访问协议强制 HTTPS 跳转配置，当 Name 取值为 ForceRedirectHTTPS 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ForceRedirectHTTPSParameters getForceRedirectHTTPSParameters() {
        return this.ForceRedirectHTTPSParameters;
    }

    /**
     * Set 访问协议强制 HTTPS 跳转配置，当 Name 取值为 ForceRedirectHTTPS 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceRedirectHTTPSParameters 访问协议强制 HTTPS 跳转配置，当 Name 取值为 ForceRedirectHTTPS 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForceRedirectHTTPSParameters(ForceRedirectHTTPSParameters ForceRedirectHTTPSParameters) {
        this.ForceRedirectHTTPSParameters = ForceRedirectHTTPSParameters;
    }

    /**
     * Get 智能压缩配置，当 Name 取值为 Compression 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompressionParameters 智能压缩配置，当 Name 取值为 Compression 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompressionParameters getCompressionParameters() {
        return this.CompressionParameters;
    }

    /**
     * Set 智能压缩配置，当 Name 取值为 Compression 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompressionParameters 智能压缩配置，当 Name 取值为 Compression 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompressionParameters(CompressionParameters CompressionParameters) {
        this.CompressionParameters = CompressionParameters;
    }

    /**
     * Get HSTS 配置参数，当 Name 取值为 HSTS 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HSTSParameters HSTS 配置参数，当 Name 取值为 HSTS 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HSTSParameters getHSTSParameters() {
        return this.HSTSParameters;
    }

    /**
     * Set HSTS 配置参数，当 Name 取值为 HSTS 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HSTSParameters HSTS 配置参数，当 Name 取值为 HSTS 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHSTSParameters(HSTSParameters HSTSParameters) {
        this.HSTSParameters = HSTSParameters;
    }

    /**
     * Get 存储客户端请求 IP 的头部信息配置，当 Name 取值为 ClientIPHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIPHeaderParameters 存储客户端请求 IP 的头部信息配置，当 Name 取值为 ClientIPHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientIPHeaderParameters getClientIPHeaderParameters() {
        return this.ClientIPHeaderParameters;
    }

    /**
     * Set 存储客户端请求 IP 的头部信息配置，当 Name 取值为 ClientIPHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIPHeaderParameters 存储客户端请求 IP 的头部信息配置，当 Name 取值为 ClientIPHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIPHeaderParameters(ClientIPHeaderParameters ClientIPHeaderParameters) {
        this.ClientIPHeaderParameters = ClientIPHeaderParameters;
    }

    /**
     * Get OCSP 装订配置参数，当 Name 取值为 OCSPStapling 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OCSPStaplingParameters OCSP 装订配置参数，当 Name 取值为 OCSPStapling 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OCSPStaplingParameters getOCSPStaplingParameters() {
        return this.OCSPStaplingParameters;
    }

    /**
     * Set OCSP 装订配置参数，当 Name 取值为 OCSPStapling 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OCSPStaplingParameters OCSP 装订配置参数，当 Name 取值为 OCSPStapling 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOCSPStaplingParameters(OCSPStaplingParameters OCSPStaplingParameters) {
        this.OCSPStaplingParameters = OCSPStaplingParameters;
    }

    /**
     * Get HTTP2 接入配置参数，当 Name 取值为 HTTP2 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HTTP2Parameters HTTP2 接入配置参数，当 Name 取值为 HTTP2 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HTTP2Parameters getHTTP2Parameters() {
        return this.HTTP2Parameters;
    }

    /**
     * Set HTTP2 接入配置参数，当 Name 取值为 HTTP2 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HTTP2Parameters HTTP2 接入配置参数，当 Name 取值为 HTTP2 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHTTP2Parameters(HTTP2Parameters HTTP2Parameters) {
        this.HTTP2Parameters = HTTP2Parameters;
    }

    /**
     * Get POST 请求上传文件流式传输最大限制配置，当 Name 取值为 PostMaxSize 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostMaxSizeParameters POST 请求上传文件流式传输最大限制配置，当 Name 取值为 PostMaxSize 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostMaxSizeParameters getPostMaxSizeParameters() {
        return this.PostMaxSizeParameters;
    }

    /**
     * Set POST 请求上传文件流式传输最大限制配置，当 Name 取值为 PostMaxSize 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostMaxSizeParameters POST 请求上传文件流式传输最大限制配置，当 Name 取值为 PostMaxSize 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostMaxSizeParameters(PostMaxSizeParameters PostMaxSizeParameters) {
        this.PostMaxSizeParameters = PostMaxSizeParameters;
    }

    /**
     * Get 回源时携带客户端 IP 所属地域信息配置参数，当 Name 取值为 ClientIPCountry 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIPCountryParameters 回源时携带客户端 IP 所属地域信息配置参数，当 Name 取值为 ClientIPCountry 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientIPCountryParameters getClientIPCountryParameters() {
        return this.ClientIPCountryParameters;
    }

    /**
     * Set 回源时携带客户端 IP 所属地域信息配置参数，当 Name 取值为 ClientIPCountry 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIPCountryParameters 回源时携带客户端 IP 所属地域信息配置参数，当 Name 取值为 ClientIPCountry 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIPCountryParameters(ClientIPCountryParameters ClientIPCountryParameters) {
        this.ClientIPCountryParameters = ClientIPCountryParameters;
    }

    /**
     * Get 回源跟随重定向参数配置，当 Name 取值为 UpstreamFollowRedirect 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamFollowRedirectParameters 回源跟随重定向参数配置，当 Name 取值为 UpstreamFollowRedirect 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpstreamFollowRedirectParameters getUpstreamFollowRedirectParameters() {
        return this.UpstreamFollowRedirectParameters;
    }

    /**
     * Set 回源跟随重定向参数配置，当 Name 取值为 UpstreamFollowRedirect 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamFollowRedirectParameters 回源跟随重定向参数配置，当 Name 取值为 UpstreamFollowRedirect 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamFollowRedirectParameters(UpstreamFollowRedirectParameters UpstreamFollowRedirectParameters) {
        this.UpstreamFollowRedirectParameters = UpstreamFollowRedirectParameters;
    }

    /**
     * Get 回源请求参数配置参数，当 Name 取值为 UpstreamRequest 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamRequestParameters 回源请求参数配置参数，当 Name 取值为 UpstreamRequest 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpstreamRequestParameters getUpstreamRequestParameters() {
        return this.UpstreamRequestParameters;
    }

    /**
     * Set 回源请求参数配置参数，当 Name 取值为 UpstreamRequest 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamRequestParameters 回源请求参数配置参数，当 Name 取值为 UpstreamRequest 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamRequestParameters(UpstreamRequestParameters UpstreamRequestParameters) {
        this.UpstreamRequestParameters = UpstreamRequestParameters;
    }

    /**
     * Get SSL/TLS 安全配置参数，当 Name 取值为 TLSConfig 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TLSConfigParameters SSL/TLS 安全配置参数，当 Name 取值为 TLSConfig 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TLSConfigParameters getTLSConfigParameters() {
        return this.TLSConfigParameters;
    }

    /**
     * Set SSL/TLS 安全配置参数，当 Name 取值为 TLSConfig 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TLSConfigParameters SSL/TLS 安全配置参数，当 Name 取值为 TLSConfig 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTLSConfigParameters(TLSConfigParameters TLSConfigParameters) {
        this.TLSConfigParameters = TLSConfigParameters;
    }

    /**
     * Get 修改源站配置参数，当 Name 取值为 ModifyOrigin 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyOriginParameters 修改源站配置参数，当 Name 取值为 ModifyOrigin 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModifyOriginParameters getModifyOriginParameters() {
        return this.ModifyOriginParameters;
    }

    /**
     * Set 修改源站配置参数，当 Name 取值为 ModifyOrigin 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyOriginParameters 修改源站配置参数，当 Name 取值为 ModifyOrigin 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyOriginParameters(ModifyOriginParameters ModifyOriginParameters) {
        this.ModifyOriginParameters = ModifyOriginParameters;
    }

    /**
     * Get 七层回源超时配置，当 Name 取值为 HTTPUpstreamTimeout 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HTTPUpstreamTimeoutParameters 七层回源超时配置，当 Name 取值为 HTTPUpstreamTimeout 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HTTPUpstreamTimeoutParameters getHTTPUpstreamTimeoutParameters() {
        return this.HTTPUpstreamTimeoutParameters;
    }

    /**
     * Set 七层回源超时配置，当 Name 取值为 HTTPUpstreamTimeout 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HTTPUpstreamTimeoutParameters 七层回源超时配置，当 Name 取值为 HTTPUpstreamTimeout 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHTTPUpstreamTimeoutParameters(HTTPUpstreamTimeoutParameters HTTPUpstreamTimeoutParameters) {
        this.HTTPUpstreamTimeoutParameters = HTTPUpstreamTimeoutParameters;
    }

    /**
     * Get HTTP 应答配置参数，当 Name 取值为 HttpResponse 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpResponseParameters HTTP 应答配置参数，当 Name 取值为 HttpResponse 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HTTPResponseParameters getHttpResponseParameters() {
        return this.HttpResponseParameters;
    }

    /**
     * Set HTTP 应答配置参数，当 Name 取值为 HttpResponse 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpResponseParameters HTTP 应答配置参数，当 Name 取值为 HttpResponse 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpResponseParameters(HTTPResponseParameters HttpResponseParameters) {
        this.HttpResponseParameters = HttpResponseParameters;
    }

    /**
     * Get 自定义错误页面配置参数，当 Name 取值为 ErrorPage 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorPageParameters 自定义错误页面配置参数，当 Name 取值为 ErrorPage 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorPageParameters getErrorPageParameters() {
        return this.ErrorPageParameters;
    }

    /**
     * Set 自定义错误页面配置参数，当 Name 取值为 ErrorPage 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorPageParameters 自定义错误页面配置参数，当 Name 取值为 ErrorPage 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorPageParameters(ErrorPageParameters ErrorPageParameters) {
        this.ErrorPageParameters = ErrorPageParameters;
    }

    /**
     * Get 修改 HTTP 节点响应头配置参数，当 Name 取值为 ModifyResponseHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyResponseHeaderParameters 修改 HTTP 节点响应头配置参数，当 Name 取值为 ModifyResponseHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModifyResponseHeaderParameters getModifyResponseHeaderParameters() {
        return this.ModifyResponseHeaderParameters;
    }

    /**
     * Set 修改 HTTP 节点响应头配置参数，当 Name 取值为 ModifyResponseHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyResponseHeaderParameters 修改 HTTP 节点响应头配置参数，当 Name 取值为 ModifyResponseHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyResponseHeaderParameters(ModifyResponseHeaderParameters ModifyResponseHeaderParameters) {
        this.ModifyResponseHeaderParameters = ModifyResponseHeaderParameters;
    }

    /**
     * Get 修改 HTTP 节点请求头配置参数，当 Name 取值为 ModifyRequestHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyRequestHeaderParameters 修改 HTTP 节点请求头配置参数，当 Name 取值为 ModifyRequestHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModifyRequestHeaderParameters getModifyRequestHeaderParameters() {
        return this.ModifyRequestHeaderParameters;
    }

    /**
     * Set 修改 HTTP 节点请求头配置参数，当 Name 取值为 ModifyRequestHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyRequestHeaderParameters 修改 HTTP 节点请求头配置参数，当 Name 取值为 ModifyRequestHeader 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyRequestHeaderParameters(ModifyRequestHeaderParameters ModifyRequestHeaderParameters) {
        this.ModifyRequestHeaderParameters = ModifyRequestHeaderParameters;
    }

    /**
     * Get 单连接下载限速配置参数，当 Name 取值为 ResponseSpeedLimit 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseSpeedLimitParameters 单连接下载限速配置参数，当 Name 取值为 ResponseSpeedLimit 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResponseSpeedLimitParameters getResponseSpeedLimitParameters() {
        return this.ResponseSpeedLimitParameters;
    }

    /**
     * Set 单连接下载限速配置参数，当 Name 取值为 ResponseSpeedLimit 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseSpeedLimitParameters 单连接下载限速配置参数，当 Name 取值为 ResponseSpeedLimit 时，该参数必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseSpeedLimitParameters(ResponseSpeedLimitParameters ResponseSpeedLimitParameters) {
        this.ResponseSpeedLimitParameters = ResponseSpeedLimitParameters;
    }

    /**
     * Get 内容标识配置参数，当 Name 取值为 SetContentIdentifier 时，该参数必填。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetContentIdentifierParameters 内容标识配置参数，当 Name 取值为 SetContentIdentifier 时，该参数必填。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public SetContentIdentifierParameters getSetContentIdentifierParameters() {
        return this.SetContentIdentifierParameters;
    }

    /**
     * Set 内容标识配置参数，当 Name 取值为 SetContentIdentifier 时，该参数必填。

注意：此字段可能返回 null，表示取不到有效值。
     * @param SetContentIdentifierParameters 内容标识配置参数，当 Name 取值为 SetContentIdentifier 时，该参数必填。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetContentIdentifierParameters(SetContentIdentifierParameters SetContentIdentifierParameters) {
        this.SetContentIdentifierParameters = SetContentIdentifierParameters;
    }

    /**
     * Get Vary 特性配置参数，当 Name 取值为 Vary 时，该参数必填。 
     * @return VaryParameters Vary 特性配置参数，当 Name 取值为 Vary 时，该参数必填。
     */
    public VaryParameters getVaryParameters() {
        return this.VaryParameters;
    }

    /**
     * Set Vary 特性配置参数，当 Name 取值为 Vary 时，该参数必填。
     * @param VaryParameters Vary 特性配置参数，当 Name 取值为 Vary 时，该参数必填。
     */
    public void setVaryParameters(VaryParameters VaryParameters) {
        this.VaryParameters = VaryParameters;
    }

    public RuleEngineAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleEngineAction(RuleEngineAction source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CacheParameters != null) {
            this.CacheParameters = new CacheParameters(source.CacheParameters);
        }
        if (source.CacheKeyParameters != null) {
            this.CacheKeyParameters = new CacheKeyParameters(source.CacheKeyParameters);
        }
        if (source.CachePrefreshParameters != null) {
            this.CachePrefreshParameters = new CachePrefreshParameters(source.CachePrefreshParameters);
        }
        if (source.AccessURLRedirectParameters != null) {
            this.AccessURLRedirectParameters = new AccessURLRedirectParameters(source.AccessURLRedirectParameters);
        }
        if (source.UpstreamURLRewriteParameters != null) {
            this.UpstreamURLRewriteParameters = new UpstreamURLRewriteParameters(source.UpstreamURLRewriteParameters);
        }
        if (source.QUICParameters != null) {
            this.QUICParameters = new QUICParameters(source.QUICParameters);
        }
        if (source.WebSocketParameters != null) {
            this.WebSocketParameters = new WebSocketParameters(source.WebSocketParameters);
        }
        if (source.AuthenticationParameters != null) {
            this.AuthenticationParameters = new AuthenticationParameters(source.AuthenticationParameters);
        }
        if (source.MaxAgeParameters != null) {
            this.MaxAgeParameters = new MaxAgeParameters(source.MaxAgeParameters);
        }
        if (source.StatusCodeCacheParameters != null) {
            this.StatusCodeCacheParameters = new StatusCodeCacheParameters(source.StatusCodeCacheParameters);
        }
        if (source.OfflineCacheParameters != null) {
            this.OfflineCacheParameters = new OfflineCacheParameters(source.OfflineCacheParameters);
        }
        if (source.SmartRoutingParameters != null) {
            this.SmartRoutingParameters = new SmartRoutingParameters(source.SmartRoutingParameters);
        }
        if (source.RangeOriginPullParameters != null) {
            this.RangeOriginPullParameters = new RangeOriginPullParameters(source.RangeOriginPullParameters);
        }
        if (source.UpstreamHTTP2Parameters != null) {
            this.UpstreamHTTP2Parameters = new UpstreamHTTP2Parameters(source.UpstreamHTTP2Parameters);
        }
        if (source.HostHeaderParameters != null) {
            this.HostHeaderParameters = new HostHeaderParameters(source.HostHeaderParameters);
        }
        if (source.ForceRedirectHTTPSParameters != null) {
            this.ForceRedirectHTTPSParameters = new ForceRedirectHTTPSParameters(source.ForceRedirectHTTPSParameters);
        }
        if (source.CompressionParameters != null) {
            this.CompressionParameters = new CompressionParameters(source.CompressionParameters);
        }
        if (source.HSTSParameters != null) {
            this.HSTSParameters = new HSTSParameters(source.HSTSParameters);
        }
        if (source.ClientIPHeaderParameters != null) {
            this.ClientIPHeaderParameters = new ClientIPHeaderParameters(source.ClientIPHeaderParameters);
        }
        if (source.OCSPStaplingParameters != null) {
            this.OCSPStaplingParameters = new OCSPStaplingParameters(source.OCSPStaplingParameters);
        }
        if (source.HTTP2Parameters != null) {
            this.HTTP2Parameters = new HTTP2Parameters(source.HTTP2Parameters);
        }
        if (source.PostMaxSizeParameters != null) {
            this.PostMaxSizeParameters = new PostMaxSizeParameters(source.PostMaxSizeParameters);
        }
        if (source.ClientIPCountryParameters != null) {
            this.ClientIPCountryParameters = new ClientIPCountryParameters(source.ClientIPCountryParameters);
        }
        if (source.UpstreamFollowRedirectParameters != null) {
            this.UpstreamFollowRedirectParameters = new UpstreamFollowRedirectParameters(source.UpstreamFollowRedirectParameters);
        }
        if (source.UpstreamRequestParameters != null) {
            this.UpstreamRequestParameters = new UpstreamRequestParameters(source.UpstreamRequestParameters);
        }
        if (source.TLSConfigParameters != null) {
            this.TLSConfigParameters = new TLSConfigParameters(source.TLSConfigParameters);
        }
        if (source.ModifyOriginParameters != null) {
            this.ModifyOriginParameters = new ModifyOriginParameters(source.ModifyOriginParameters);
        }
        if (source.HTTPUpstreamTimeoutParameters != null) {
            this.HTTPUpstreamTimeoutParameters = new HTTPUpstreamTimeoutParameters(source.HTTPUpstreamTimeoutParameters);
        }
        if (source.HttpResponseParameters != null) {
            this.HttpResponseParameters = new HTTPResponseParameters(source.HttpResponseParameters);
        }
        if (source.ErrorPageParameters != null) {
            this.ErrorPageParameters = new ErrorPageParameters(source.ErrorPageParameters);
        }
        if (source.ModifyResponseHeaderParameters != null) {
            this.ModifyResponseHeaderParameters = new ModifyResponseHeaderParameters(source.ModifyResponseHeaderParameters);
        }
        if (source.ModifyRequestHeaderParameters != null) {
            this.ModifyRequestHeaderParameters = new ModifyRequestHeaderParameters(source.ModifyRequestHeaderParameters);
        }
        if (source.ResponseSpeedLimitParameters != null) {
            this.ResponseSpeedLimitParameters = new ResponseSpeedLimitParameters(source.ResponseSpeedLimitParameters);
        }
        if (source.SetContentIdentifierParameters != null) {
            this.SetContentIdentifierParameters = new SetContentIdentifierParameters(source.SetContentIdentifierParameters);
        }
        if (source.VaryParameters != null) {
            this.VaryParameters = new VaryParameters(source.VaryParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "CacheParameters.", this.CacheParameters);
        this.setParamObj(map, prefix + "CacheKeyParameters.", this.CacheKeyParameters);
        this.setParamObj(map, prefix + "CachePrefreshParameters.", this.CachePrefreshParameters);
        this.setParamObj(map, prefix + "AccessURLRedirectParameters.", this.AccessURLRedirectParameters);
        this.setParamObj(map, prefix + "UpstreamURLRewriteParameters.", this.UpstreamURLRewriteParameters);
        this.setParamObj(map, prefix + "QUICParameters.", this.QUICParameters);
        this.setParamObj(map, prefix + "WebSocketParameters.", this.WebSocketParameters);
        this.setParamObj(map, prefix + "AuthenticationParameters.", this.AuthenticationParameters);
        this.setParamObj(map, prefix + "MaxAgeParameters.", this.MaxAgeParameters);
        this.setParamObj(map, prefix + "StatusCodeCacheParameters.", this.StatusCodeCacheParameters);
        this.setParamObj(map, prefix + "OfflineCacheParameters.", this.OfflineCacheParameters);
        this.setParamObj(map, prefix + "SmartRoutingParameters.", this.SmartRoutingParameters);
        this.setParamObj(map, prefix + "RangeOriginPullParameters.", this.RangeOriginPullParameters);
        this.setParamObj(map, prefix + "UpstreamHTTP2Parameters.", this.UpstreamHTTP2Parameters);
        this.setParamObj(map, prefix + "HostHeaderParameters.", this.HostHeaderParameters);
        this.setParamObj(map, prefix + "ForceRedirectHTTPSParameters.", this.ForceRedirectHTTPSParameters);
        this.setParamObj(map, prefix + "CompressionParameters.", this.CompressionParameters);
        this.setParamObj(map, prefix + "HSTSParameters.", this.HSTSParameters);
        this.setParamObj(map, prefix + "ClientIPHeaderParameters.", this.ClientIPHeaderParameters);
        this.setParamObj(map, prefix + "OCSPStaplingParameters.", this.OCSPStaplingParameters);
        this.setParamObj(map, prefix + "HTTP2Parameters.", this.HTTP2Parameters);
        this.setParamObj(map, prefix + "PostMaxSizeParameters.", this.PostMaxSizeParameters);
        this.setParamObj(map, prefix + "ClientIPCountryParameters.", this.ClientIPCountryParameters);
        this.setParamObj(map, prefix + "UpstreamFollowRedirectParameters.", this.UpstreamFollowRedirectParameters);
        this.setParamObj(map, prefix + "UpstreamRequestParameters.", this.UpstreamRequestParameters);
        this.setParamObj(map, prefix + "TLSConfigParameters.", this.TLSConfigParameters);
        this.setParamObj(map, prefix + "ModifyOriginParameters.", this.ModifyOriginParameters);
        this.setParamObj(map, prefix + "HTTPUpstreamTimeoutParameters.", this.HTTPUpstreamTimeoutParameters);
        this.setParamObj(map, prefix + "HttpResponseParameters.", this.HttpResponseParameters);
        this.setParamObj(map, prefix + "ErrorPageParameters.", this.ErrorPageParameters);
        this.setParamObj(map, prefix + "ModifyResponseHeaderParameters.", this.ModifyResponseHeaderParameters);
        this.setParamObj(map, prefix + "ModifyRequestHeaderParameters.", this.ModifyRequestHeaderParameters);
        this.setParamObj(map, prefix + "ResponseSpeedLimitParameters.", this.ResponseSpeedLimitParameters);
        this.setParamObj(map, prefix + "SetContentIdentifierParameters.", this.SetContentIdentifierParameters);
        this.setParamObj(map, prefix + "VaryParameters.", this.VaryParameters);

    }
}

