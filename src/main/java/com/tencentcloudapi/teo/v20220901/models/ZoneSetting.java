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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneSetting extends AbstractModel{

    /**
    * 站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 站点加速区域信息，取值有：
<li> mainland：中国境内加速；</li>
<li> overseas：中国境外加速。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 节点缓存键配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * Quic访问配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * POST请求传输配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSize PostMaxSize;

    /**
    * 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * Http2回源配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamHttp2")
    @Expose
    private UpstreamHttp2 UpstreamHttp2;

    /**
    * 访问协议强制Https跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * 缓存过期时间配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheConfig")
    @Expose
    private CacheConfig CacheConfig;

    /**
    * 源站配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * 智能加速配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * 浏览器缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * 离线缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * WebSocket配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * 客户端IP回源请求头配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIpHeader")
    @Expose
    private ClientIpHeader ClientIpHeader;

    /**
    * 缓存预刷新配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CachePrefresh")
    @Expose
    private CachePrefresh CachePrefresh;

    /**
    * Ipv6访问配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6 Ipv6;

    /**
    * Https 加速配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * 回源时是否携带客户端IP所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIpCountry")
    @Expose
    private ClientIpCountry ClientIpCountry;

    /**
    * Grpc协议支持配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grpc")
    @Expose
    private Grpc Grpc;

    /**
    * 图片优化相关配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageOptimize")
    @Expose
    private ImageOptimize ImageOptimize;

    /**
    * 中国大陆加速优化配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccelerateMainland")
    @Expose
    private AccelerateMainland AccelerateMainland;

    /**
    * 标准 Debug 配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandardDebug")
    @Expose
    private StandardDebug StandardDebug;

    /**
     * Get 站点名称。 
     * @return ZoneName 站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。
     * @param ZoneName 站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 站点加速区域信息，取值有：
<li> mainland：中国境内加速；</li>
<li> overseas：中国境外加速。</li> 
     * @return Area 站点加速区域信息，取值有：
<li> mainland：中国境内加速；</li>
<li> overseas：中国境外加速。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 站点加速区域信息，取值有：
<li> mainland：中国境内加速；</li>
<li> overseas：中国境外加速。</li>
     * @param Area 站点加速区域信息，取值有：
<li> mainland：中国境内加速；</li>
<li> overseas：中国境外加速。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 节点缓存键配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheKey 节点缓存键配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set 节点缓存键配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheKey 节点缓存键配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get Quic访问配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quic Quic访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set Quic访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quic Quic访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get POST请求传输配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostMaxSize POST请求传输配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostMaxSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set POST请求传输配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostMaxSize POST请求传输配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostMaxSize(PostMaxSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compression 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compression 智能压缩配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get Http2回源配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamHttp2 Http2回源配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpstreamHttp2 getUpstreamHttp2() {
        return this.UpstreamHttp2;
    }

    /**
     * Set Http2回源配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamHttp2 Http2回源配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamHttp2(UpstreamHttp2 UpstreamHttp2) {
        this.UpstreamHttp2 = UpstreamHttp2;
    }

    /**
     * Get 访问协议强制Https跳转配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceRedirect 访问协议强制Https跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set 访问协议强制Https跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceRedirect 访问协议强制Https跳转配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get 缓存过期时间配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheConfig 缓存过期时间配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheConfig getCacheConfig() {
        return this.CacheConfig;
    }

    /**
     * Set 缓存过期时间配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheConfig 缓存过期时间配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheConfig(CacheConfig CacheConfig) {
        this.CacheConfig = CacheConfig;
    }

    /**
     * Get 源站配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Origin 源站配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Origin 源站配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 智能加速配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartRouting 智能加速配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set 智能加速配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartRouting 智能加速配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get 浏览器缓存配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxAge 浏览器缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set 浏览器缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxAge 浏览器缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get 离线缓存配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineCache 离线缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set 离线缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineCache 离线缓存配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get WebSocket配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebSocket WebSocket配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebSocket WebSocket配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get 客户端IP回源请求头配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIpHeader 客户端IP回源请求头配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientIpHeader getClientIpHeader() {
        return this.ClientIpHeader;
    }

    /**
     * Set 客户端IP回源请求头配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIpHeader 客户端IP回源请求头配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIpHeader(ClientIpHeader ClientIpHeader) {
        this.ClientIpHeader = ClientIpHeader;
    }

    /**
     * Get 缓存预刷新配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CachePrefresh 缓存预刷新配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CachePrefresh getCachePrefresh() {
        return this.CachePrefresh;
    }

    /**
     * Set 缓存预刷新配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CachePrefresh 缓存预刷新配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCachePrefresh(CachePrefresh CachePrefresh) {
        this.CachePrefresh = CachePrefresh;
    }

    /**
     * Get Ipv6访问配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6 Ipv6访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Ipv6 getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6 Ipv6访问配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6(Ipv6 Ipv6) {
        this.Ipv6 = Ipv6;
    }

    /**
     * Get Https 加速配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Https Https 加速配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https 加速配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Https Https 加速配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get 回源时是否携带客户端IP所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIpCountry 回源时是否携带客户端IP所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientIpCountry getClientIpCountry() {
        return this.ClientIpCountry;
    }

    /**
     * Set 回源时是否携带客户端IP所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIpCountry 回源时是否携带客户端IP所属地域信息的配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIpCountry(ClientIpCountry ClientIpCountry) {
        this.ClientIpCountry = ClientIpCountry;
    }

    /**
     * Get Grpc协议支持配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grpc Grpc协议支持配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Grpc getGrpc() {
        return this.Grpc;
    }

    /**
     * Set Grpc协议支持配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grpc Grpc协议支持配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrpc(Grpc Grpc) {
        this.Grpc = Grpc;
    }

    /**
     * Get 图片优化相关配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageOptimize 图片优化相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageOptimize getImageOptimize() {
        return this.ImageOptimize;
    }

    /**
     * Set 图片优化相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageOptimize 图片优化相关配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageOptimize(ImageOptimize ImageOptimize) {
        this.ImageOptimize = ImageOptimize;
    }

    /**
     * Get 中国大陆加速优化配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccelerateMainland 中国大陆加速优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccelerateMainland getAccelerateMainland() {
        return this.AccelerateMainland;
    }

    /**
     * Set 中国大陆加速优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccelerateMainland 中国大陆加速优化配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccelerateMainland(AccelerateMainland AccelerateMainland) {
        this.AccelerateMainland = AccelerateMainland;
    }

    /**
     * Get 标准 Debug 配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandardDebug 标准 Debug 配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StandardDebug getStandardDebug() {
        return this.StandardDebug;
    }

    /**
     * Set 标准 Debug 配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandardDebug 标准 Debug 配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandardDebug(StandardDebug StandardDebug) {
        this.StandardDebug = StandardDebug;
    }

    public ZoneSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneSetting(ZoneSetting source) {
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKey(source.CacheKey);
        }
        if (source.Quic != null) {
            this.Quic = new Quic(source.Quic);
        }
        if (source.PostMaxSize != null) {
            this.PostMaxSize = new PostMaxSize(source.PostMaxSize);
        }
        if (source.Compression != null) {
            this.Compression = new Compression(source.Compression);
        }
        if (source.UpstreamHttp2 != null) {
            this.UpstreamHttp2 = new UpstreamHttp2(source.UpstreamHttp2);
        }
        if (source.ForceRedirect != null) {
            this.ForceRedirect = new ForceRedirect(source.ForceRedirect);
        }
        if (source.CacheConfig != null) {
            this.CacheConfig = new CacheConfig(source.CacheConfig);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.SmartRouting != null) {
            this.SmartRouting = new SmartRouting(source.SmartRouting);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new MaxAge(source.MaxAge);
        }
        if (source.OfflineCache != null) {
            this.OfflineCache = new OfflineCache(source.OfflineCache);
        }
        if (source.WebSocket != null) {
            this.WebSocket = new WebSocket(source.WebSocket);
        }
        if (source.ClientIpHeader != null) {
            this.ClientIpHeader = new ClientIpHeader(source.ClientIpHeader);
        }
        if (source.CachePrefresh != null) {
            this.CachePrefresh = new CachePrefresh(source.CachePrefresh);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6(source.Ipv6);
        }
        if (source.Https != null) {
            this.Https = new Https(source.Https);
        }
        if (source.ClientIpCountry != null) {
            this.ClientIpCountry = new ClientIpCountry(source.ClientIpCountry);
        }
        if (source.Grpc != null) {
            this.Grpc = new Grpc(source.Grpc);
        }
        if (source.ImageOptimize != null) {
            this.ImageOptimize = new ImageOptimize(source.ImageOptimize);
        }
        if (source.AccelerateMainland != null) {
            this.AccelerateMainland = new AccelerateMainland(source.AccelerateMainland);
        }
        if (source.StandardDebug != null) {
            this.StandardDebug = new StandardDebug(source.StandardDebug);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "Quic.", this.Quic);
        this.setParamObj(map, prefix + "PostMaxSize.", this.PostMaxSize);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "UpstreamHttp2.", this.UpstreamHttp2);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "CacheConfig.", this.CacheConfig);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "SmartRouting.", this.SmartRouting);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "OfflineCache.", this.OfflineCache);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "ClientIpHeader.", this.ClientIpHeader);
        this.setParamObj(map, prefix + "CachePrefresh.", this.CachePrefresh);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "ClientIpCountry.", this.ClientIpCountry);
        this.setParamObj(map, prefix + "Grpc.", this.Grpc);
        this.setParamObj(map, prefix + "ImageOptimize.", this.ImageOptimize);
        this.setParamObj(map, prefix + "AccelerateMainland.", this.AccelerateMainland);
        this.setParamObj(map, prefix + "StandardDebug.", this.StandardDebug);

    }
}

