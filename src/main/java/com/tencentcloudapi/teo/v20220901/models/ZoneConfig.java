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

public class ZoneConfig extends AbstractModel {

    /**
    * 智能加速配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRoutingParameters SmartRouting;

    /**
    * 缓存过期时间配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cache")
    @Expose
    private CacheConfigParameters Cache;

    /**
    * 浏览器缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAgeParameters MaxAge;

    /**
    * 节点缓存键配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKeyConfigParameters CacheKey;

    /**
    * 缓存预刷新配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CachePrefresh")
    @Expose
    private CachePrefreshParameters CachePrefresh;

    /**
    * 离线缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCacheParameters OfflineCache;

    /**
    * 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compression")
    @Expose
    private CompressionParameters Compression;

    /**
    * 访问协议强制 HTTPS 跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceRedirectHTTPS")
    @Expose
    private ForceRedirectHTTPSParameters ForceRedirectHTTPS;

    /**
    * HSTS 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HSTS")
    @Expose
    private HSTSParameters HSTS;

    /**
    * TLS 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TLSConfig")
    @Expose
    private TLSConfigParameters TLSConfig;

    /**
    * OCSP 装订配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OCSPStapling")
    @Expose
    private OCSPStaplingParameters OCSPStapling;

    /**
    * HTTP2 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HTTP2")
    @Expose
    private HTTP2Parameters HTTP2;

    /**
    * QUIC 访问配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QUIC")
    @Expose
    private QUICParameters QUIC;

    /**
    * HTTP2 回源配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamHTTP2")
    @Expose
    private UpstreamHTTP2Parameters UpstreamHTTP2;

    /**
    * IPv6 访问配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv6")
    @Expose
    private IPv6Parameters IPv6;

    /**
    * WebSocket 配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocketParameters WebSocket;

    /**
    * POST 请求传输配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSizeParameters PostMaxSize;

    /**
    * 客户端 IP 回源请求头配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIPHeader")
    @Expose
    private ClientIPHeaderParameters ClientIPHeader;

    /**
    * 回源时是否携带客户端 IP 所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIPCountry")
    @Expose
    private ClientIPCountryParameters ClientIPCountry;

    /**
    * gRPC 协议支持配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grpc")
    @Expose
    private GrpcParameters Grpc;

    /**
    * 网络错误日志记录配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkErrorLogging")
    @Expose
    private NetworkErrorLoggingParameters NetworkErrorLogging;

    /**
    * 中国大陆加速优化配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private AccelerateMainlandParameters AccelerateMainland;

    /**
    * 标准 Debug 配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandardDebug")
    @Expose
    private StandardDebugParameters StandardDebug;

    /**
     * Get 智能加速配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartRouting 智能加速配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartRoutingParameters getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set 智能加速配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartRouting 智能加速配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartRouting(SmartRoutingParameters SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get 缓存过期时间配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cache 缓存过期时间配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheConfigParameters getCache() {
        return this.Cache;
    }

    /**
     * Set 缓存过期时间配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cache 缓存过期时间配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCache(CacheConfigParameters Cache) {
        this.Cache = Cache;
    }

    /**
     * Get 浏览器缓存配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxAge 浏览器缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaxAgeParameters getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set 浏览器缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxAge 浏览器缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxAge(MaxAgeParameters MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get 节点缓存键配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheKey 节点缓存键配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKeyConfigParameters getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set 节点缓存键配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheKey 节点缓存键配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheKey(CacheKeyConfigParameters CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get 缓存预刷新配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CachePrefresh 缓存预刷新配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CachePrefreshParameters getCachePrefresh() {
        return this.CachePrefresh;
    }

    /**
     * Set 缓存预刷新配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CachePrefresh 缓存预刷新配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCachePrefresh(CachePrefreshParameters CachePrefresh) {
        this.CachePrefresh = CachePrefresh;
    }

    /**
     * Get 离线缓存配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineCache 离线缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OfflineCacheParameters getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set 离线缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineCache 离线缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineCache(OfflineCacheParameters OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compression 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompressionParameters getCompression() {
        return this.Compression;
    }

    /**
     * Set 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compression 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompression(CompressionParameters Compression) {
        this.Compression = Compression;
    }

    /**
     * Get 访问协议强制 HTTPS 跳转配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceRedirectHTTPS 访问协议强制 HTTPS 跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ForceRedirectHTTPSParameters getForceRedirectHTTPS() {
        return this.ForceRedirectHTTPS;
    }

    /**
     * Set 访问协议强制 HTTPS 跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceRedirectHTTPS 访问协议强制 HTTPS 跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForceRedirectHTTPS(ForceRedirectHTTPSParameters ForceRedirectHTTPS) {
        this.ForceRedirectHTTPS = ForceRedirectHTTPS;
    }

    /**
     * Get HSTS 相关配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HSTS HSTS 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HSTSParameters getHSTS() {
        return this.HSTS;
    }

    /**
     * Set HSTS 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HSTS HSTS 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHSTS(HSTSParameters HSTS) {
        this.HSTS = HSTS;
    }

    /**
     * Get TLS 相关配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TLSConfig TLS 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TLSConfigParameters getTLSConfig() {
        return this.TLSConfig;
    }

    /**
     * Set TLS 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TLSConfig TLS 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTLSConfig(TLSConfigParameters TLSConfig) {
        this.TLSConfig = TLSConfig;
    }

    /**
     * Get OCSP 装订配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OCSPStapling OCSP 装订配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OCSPStaplingParameters getOCSPStapling() {
        return this.OCSPStapling;
    }

    /**
     * Set OCSP 装订配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OCSPStapling OCSP 装订配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOCSPStapling(OCSPStaplingParameters OCSPStapling) {
        this.OCSPStapling = OCSPStapling;
    }

    /**
     * Get HTTP2 相关配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HTTP2 HTTP2 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HTTP2Parameters getHTTP2() {
        return this.HTTP2;
    }

    /**
     * Set HTTP2 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HTTP2 HTTP2 相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHTTP2(HTTP2Parameters HTTP2) {
        this.HTTP2 = HTTP2;
    }

    /**
     * Get QUIC 访问配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QUIC QUIC 访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QUICParameters getQUIC() {
        return this.QUIC;
    }

    /**
     * Set QUIC 访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QUIC QUIC 访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQUIC(QUICParameters QUIC) {
        this.QUIC = QUIC;
    }

    /**
     * Get HTTP2 回源配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamHTTP2 HTTP2 回源配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpstreamHTTP2Parameters getUpstreamHTTP2() {
        return this.UpstreamHTTP2;
    }

    /**
     * Set HTTP2 回源配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamHTTP2 HTTP2 回源配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamHTTP2(UpstreamHTTP2Parameters UpstreamHTTP2) {
        this.UpstreamHTTP2 = UpstreamHTTP2;
    }

    /**
     * Get IPv6 访问配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv6 IPv6 访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IPv6Parameters getIPv6() {
        return this.IPv6;
    }

    /**
     * Set IPv6 访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv6 IPv6 访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv6(IPv6Parameters IPv6) {
        this.IPv6 = IPv6;
    }

    /**
     * Get WebSocket 配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebSocket WebSocket 配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebSocketParameters getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket 配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebSocket WebSocket 配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebSocket(WebSocketParameters WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get POST 请求传输配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostMaxSize POST 请求传输配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostMaxSizeParameters getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set POST 请求传输配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostMaxSize POST 请求传输配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostMaxSize(PostMaxSizeParameters PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get 客户端 IP 回源请求头配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIPHeader 客户端 IP 回源请求头配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientIPHeaderParameters getClientIPHeader() {
        return this.ClientIPHeader;
    }

    /**
     * Set 客户端 IP 回源请求头配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIPHeader 客户端 IP 回源请求头配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIPHeader(ClientIPHeaderParameters ClientIPHeader) {
        this.ClientIPHeader = ClientIPHeader;
    }

    /**
     * Get 回源时是否携带客户端 IP 所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIPCountry 回源时是否携带客户端 IP 所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientIPCountryParameters getClientIPCountry() {
        return this.ClientIPCountry;
    }

    /**
     * Set 回源时是否携带客户端 IP 所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIPCountry 回源时是否携带客户端 IP 所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIPCountry(ClientIPCountryParameters ClientIPCountry) {
        this.ClientIPCountry = ClientIPCountry;
    }

    /**
     * Get gRPC 协议支持配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grpc gRPC 协议支持配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GrpcParameters getGrpc() {
        return this.Grpc;
    }

    /**
     * Set gRPC 协议支持配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grpc gRPC 协议支持配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrpc(GrpcParameters Grpc) {
        this.Grpc = Grpc;
    }

    /**
     * Get 网络错误日志记录配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkErrorLogging 网络错误日志记录配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkErrorLoggingParameters getNetworkErrorLogging() {
        return this.NetworkErrorLogging;
    }

    /**
     * Set 网络错误日志记录配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkErrorLogging 网络错误日志记录配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkErrorLogging(NetworkErrorLoggingParameters NetworkErrorLogging) {
        this.NetworkErrorLogging = NetworkErrorLogging;
    }

    /**
     * Get 中国大陆加速优化配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccelerateMainland 中国大陆加速优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccelerateMainlandParameters getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set 中国大陆加速优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccelerateMainland 中国大陆加速优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccelerateMainland(AccelerateMainlandParameters AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    /**
     * Get 标准 Debug 配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandardDebug 标准 Debug 配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StandardDebugParameters getStandardDebug() {
        return this.StandardDebug;
    }

    /**
     * Set 标准 Debug 配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandardDebug 标准 Debug 配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandardDebug(StandardDebugParameters StandardDebug) {
        this.StandardDebug = StandardDebug;
    }

    public ZoneConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneConfig(ZoneConfig source) {
        if (source.SmartRouting != null) {
            this.SmartRouting = new SmartRoutingParameters(source.SmartRouting);
        }
        if (source.Cache != null) {
            this.Cache = new CacheConfigParameters(source.Cache);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new MaxAgeParameters(source.MaxAge);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKeyConfigParameters(source.CacheKey);
        }
        if (source.CachePrefresh != null) {
            this.CachePrefresh = new CachePrefreshParameters(source.CachePrefresh);
        }
        if (source.OfflineCache != null) {
            this.OfflineCache = new OfflineCacheParameters(source.OfflineCache);
        }
        if (source.Compression != null) {
            this.Compression = new CompressionParameters(source.Compression);
        }
        if (source.ForceRedirectHTTPS != null) {
            this.ForceRedirectHTTPS = new ForceRedirectHTTPSParameters(source.ForceRedirectHTTPS);
        }
        if (source.HSTS != null) {
            this.HSTS = new HSTSParameters(source.HSTS);
        }
        if (source.TLSConfig != null) {
            this.TLSConfig = new TLSConfigParameters(source.TLSConfig);
        }
        if (source.OCSPStapling != null) {
            this.OCSPStapling = new OCSPStaplingParameters(source.OCSPStapling);
        }
        if (source.HTTP2 != null) {
            this.HTTP2 = new HTTP2Parameters(source.HTTP2);
        }
        if (source.QUIC != null) {
            this.QUIC = new QUICParameters(source.QUIC);
        }
        if (source.UpstreamHTTP2 != null) {
            this.UpstreamHTTP2 = new UpstreamHTTP2Parameters(source.UpstreamHTTP2);
        }
        if (source.IPv6 != null) {
            this.IPv6 = new IPv6Parameters(source.IPv6);
        }
        if (source.WebSocket != null) {
            this.WebSocket = new WebSocketParameters(source.WebSocket);
        }
        if (source.PostMaxSize != null) {
            this.PostMaxSize = new PostMaxSizeParameters(source.PostMaxSize);
        }
        if (source.ClientIPHeader != null) {
            this.ClientIPHeader = new ClientIPHeaderParameters(source.ClientIPHeader);
        }
        if (source.ClientIPCountry != null) {
            this.ClientIPCountry = new ClientIPCountryParameters(source.ClientIPCountry);
        }
        if (source.Grpc != null) {
            this.Grpc = new GrpcParameters(source.Grpc);
        }
        if (source.NetworkErrorLogging != null) {
            this.NetworkErrorLogging = new NetworkErrorLoggingParameters(source.NetworkErrorLogging);
        }
        if (source.AccelerateMainland != null) {
            this.AccelerateMainland = new AccelerateMainlandParameters(source.AccelerateMainland);
        }
        if (source.StandardDebug != null) {
            this.StandardDebug = new StandardDebugParameters(source.StandardDebug);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SmartRouting.", this.SmartRouting);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "CachePrefresh.", this.CachePrefresh);
        this.setParamObj(map, prefix + "OfflineCache.", this.OfflineCache);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "ForceRedirectHTTPS.", this.ForceRedirectHTTPS);
        this.setParamObj(map, prefix + "HSTS.", this.HSTS);
        this.setParamObj(map, prefix + "TLSConfig.", this.TLSConfig);
        this.setParamObj(map, prefix + "OCSPStapling.", this.OCSPStapling);
        this.setParamObj(map, prefix + "HTTP2.", this.HTTP2);
        this.setParamObj(map, prefix + "QUIC.", this.QUIC);
        this.setParamObj(map, prefix + "UpstreamHTTP2.", this.UpstreamHTTP2);
        this.setParamObj(map, prefix + "IPv6.", this.IPv6);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "PostMaxSize.", this.PostMaxSize);
        this.setParamObj(map, prefix + "ClientIPHeader.", this.ClientIPHeader);
        this.setParamObj(map, prefix + "ClientIPCountry.", this.ClientIPCountry);
        this.setParamObj(map, prefix + "Grpc.", this.Grpc);
        this.setParamObj(map, prefix + "NetworkErrorLogging.", this.NetworkErrorLogging);
        this.setParamObj(map, prefix + "AccelerateMainland.", this.AccelerateMainland);
        this.setParamObj(map, prefix + "StandardDebug.", this.StandardDebug);

    }
}

