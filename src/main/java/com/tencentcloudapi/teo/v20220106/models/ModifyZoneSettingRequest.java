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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyZoneSettingRequest extends AbstractModel{

    /**
    * 待变更的站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 缓存过期时间配置。
不填写表示保持原有配置。
    */
    @SerializedName("Cache")
    @Expose
    private CacheConfig Cache;

    /**
    * 节点缓存键配置。
不填写表示保持原有配置。
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * 浏览器缓存配置。
不填写表示保持原有配置。
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * 离线缓存配置。
不填写表示保持原有配置。
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * Quic访问配置。
不填写表示保持原有配置。
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * Post请求传输配置。
不填写表示保持原有配置。
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSize PostMaxSize;

    /**
    * 智能压缩配置。
不填写表示保持原有配置。
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * Http2回源配置。
不填写表示保持原有配置。
    */
    @SerializedName("UpstreamHttp2")
    @Expose
    private UpstreamHttp2 UpstreamHttp2;

    /**
    * 访问协议强制Https跳转配置。
不填写表示保持原有配置。
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Https加速配置。
不填写表示保持原有配置。
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * 源站配置。
不填写表示保持原有配置。
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * 智能加速配置。
不填写表示保持原有配置。
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * WebSocket配置。
不填写表示保持原有配置。
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * 客户端IP回源请求头配置。
不填写表示保持原有配置。
    */
    @SerializedName("ClientIpHeader")
    @Expose
    private ClientIp ClientIpHeader;

    /**
    * 缓存预刷新配置。
不填写表示保持原有配置。
    */
    @SerializedName("CachePrefresh")
    @Expose
    private CachePrefresh CachePrefresh;

    /**
    * Ipv6访问配置。
不填写表示保持原有配置。
    */
    @SerializedName("Ipv6")
    @Expose
    private Ipv6Access Ipv6;

    /**
     * Get 待变更的站点ID。 
     * @return ZoneId 待变更的站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 待变更的站点ID。
     * @param ZoneId 待变更的站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 缓存过期时间配置。
不填写表示保持原有配置。 
     * @return Cache 缓存过期时间配置。
不填写表示保持原有配置。
     */
    public CacheConfig getCache() {
        return this.Cache;
    }

    /**
     * Set 缓存过期时间配置。
不填写表示保持原有配置。
     * @param Cache 缓存过期时间配置。
不填写表示保持原有配置。
     */
    public void setCache(CacheConfig Cache) {
        this.Cache = Cache;
    }

    /**
     * Get 节点缓存键配置。
不填写表示保持原有配置。 
     * @return CacheKey 节点缓存键配置。
不填写表示保持原有配置。
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set 节点缓存键配置。
不填写表示保持原有配置。
     * @param CacheKey 节点缓存键配置。
不填写表示保持原有配置。
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get 浏览器缓存配置。
不填写表示保持原有配置。 
     * @return MaxAge 浏览器缓存配置。
不填写表示保持原有配置。
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set 浏览器缓存配置。
不填写表示保持原有配置。
     * @param MaxAge 浏览器缓存配置。
不填写表示保持原有配置。
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get 离线缓存配置。
不填写表示保持原有配置。 
     * @return OfflineCache 离线缓存配置。
不填写表示保持原有配置。
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set 离线缓存配置。
不填写表示保持原有配置。
     * @param OfflineCache 离线缓存配置。
不填写表示保持原有配置。
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get Quic访问配置。
不填写表示保持原有配置。 
     * @return Quic Quic访问配置。
不填写表示保持原有配置。
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set Quic访问配置。
不填写表示保持原有配置。
     * @param Quic Quic访问配置。
不填写表示保持原有配置。
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get Post请求传输配置。
不填写表示保持原有配置。 
     * @return PostMaxSize Post请求传输配置。
不填写表示保持原有配置。
     */
    public PostMaxSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set Post请求传输配置。
不填写表示保持原有配置。
     * @param PostMaxSize Post请求传输配置。
不填写表示保持原有配置。
     */
    public void setPostMaxSize(PostMaxSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get 智能压缩配置。
不填写表示保持原有配置。 
     * @return Compression 智能压缩配置。
不填写表示保持原有配置。
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set 智能压缩配置。
不填写表示保持原有配置。
     * @param Compression 智能压缩配置。
不填写表示保持原有配置。
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get Http2回源配置。
不填写表示保持原有配置。 
     * @return UpstreamHttp2 Http2回源配置。
不填写表示保持原有配置。
     */
    public UpstreamHttp2 getUpstreamHttp2() {
        return this.UpstreamHttp2;
    }

    /**
     * Set Http2回源配置。
不填写表示保持原有配置。
     * @param UpstreamHttp2 Http2回源配置。
不填写表示保持原有配置。
     */
    public void setUpstreamHttp2(UpstreamHttp2 UpstreamHttp2) {
        this.UpstreamHttp2 = UpstreamHttp2;
    }

    /**
     * Get 访问协议强制Https跳转配置。
不填写表示保持原有配置。 
     * @return ForceRedirect 访问协议强制Https跳转配置。
不填写表示保持原有配置。
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set 访问协议强制Https跳转配置。
不填写表示保持原有配置。
     * @param ForceRedirect 访问协议强制Https跳转配置。
不填写表示保持原有配置。
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Https加速配置。
不填写表示保持原有配置。 
     * @return Https Https加速配置。
不填写表示保持原有配置。
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https加速配置。
不填写表示保持原有配置。
     * @param Https Https加速配置。
不填写表示保持原有配置。
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get 源站配置。
不填写表示保持原有配置。 
     * @return Origin 源站配置。
不填写表示保持原有配置。
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站配置。
不填写表示保持原有配置。
     * @param Origin 源站配置。
不填写表示保持原有配置。
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 智能加速配置。
不填写表示保持原有配置。 
     * @return SmartRouting 智能加速配置。
不填写表示保持原有配置。
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set 智能加速配置。
不填写表示保持原有配置。
     * @param SmartRouting 智能加速配置。
不填写表示保持原有配置。
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get WebSocket配置。
不填写表示保持原有配置。 
     * @return WebSocket WebSocket配置。
不填写表示保持原有配置。
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket配置。
不填写表示保持原有配置。
     * @param WebSocket WebSocket配置。
不填写表示保持原有配置。
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get 客户端IP回源请求头配置。
不填写表示保持原有配置。 
     * @return ClientIpHeader 客户端IP回源请求头配置。
不填写表示保持原有配置。
     */
    public ClientIp getClientIpHeader() {
        return this.ClientIpHeader;
    }

    /**
     * Set 客户端IP回源请求头配置。
不填写表示保持原有配置。
     * @param ClientIpHeader 客户端IP回源请求头配置。
不填写表示保持原有配置。
     */
    public void setClientIpHeader(ClientIp ClientIpHeader) {
        this.ClientIpHeader = ClientIpHeader;
    }

    /**
     * Get 缓存预刷新配置。
不填写表示保持原有配置。 
     * @return CachePrefresh 缓存预刷新配置。
不填写表示保持原有配置。
     */
    public CachePrefresh getCachePrefresh() {
        return this.CachePrefresh;
    }

    /**
     * Set 缓存预刷新配置。
不填写表示保持原有配置。
     * @param CachePrefresh 缓存预刷新配置。
不填写表示保持原有配置。
     */
    public void setCachePrefresh(CachePrefresh CachePrefresh) {
        this.CachePrefresh = CachePrefresh;
    }

    /**
     * Get Ipv6访问配置。
不填写表示保持原有配置。 
     * @return Ipv6 Ipv6访问配置。
不填写表示保持原有配置。
     */
    public Ipv6Access getIpv6() {
        return this.Ipv6;
    }

    /**
     * Set Ipv6访问配置。
不填写表示保持原有配置。
     * @param Ipv6 Ipv6访问配置。
不填写表示保持原有配置。
     */
    public void setIpv6(Ipv6Access Ipv6) {
        this.Ipv6 = Ipv6;
    }

    public ModifyZoneSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneSettingRequest(ModifyZoneSettingRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Cache != null) {
            this.Cache = new CacheConfig(source.Cache);
        }
        if (source.CacheKey != null) {
            this.CacheKey = new CacheKey(source.CacheKey);
        }
        if (source.MaxAge != null) {
            this.MaxAge = new MaxAge(source.MaxAge);
        }
        if (source.OfflineCache != null) {
            this.OfflineCache = new OfflineCache(source.OfflineCache);
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
        if (source.Https != null) {
            this.Https = new Https(source.Https);
        }
        if (source.Origin != null) {
            this.Origin = new Origin(source.Origin);
        }
        if (source.SmartRouting != null) {
            this.SmartRouting = new SmartRouting(source.SmartRouting);
        }
        if (source.WebSocket != null) {
            this.WebSocket = new WebSocket(source.WebSocket);
        }
        if (source.ClientIpHeader != null) {
            this.ClientIpHeader = new ClientIp(source.ClientIpHeader);
        }
        if (source.CachePrefresh != null) {
            this.CachePrefresh = new CachePrefresh(source.CachePrefresh);
        }
        if (source.Ipv6 != null) {
            this.Ipv6 = new Ipv6Access(source.Ipv6);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "Cache.", this.Cache);
        this.setParamObj(map, prefix + "CacheKey.", this.CacheKey);
        this.setParamObj(map, prefix + "MaxAge.", this.MaxAge);
        this.setParamObj(map, prefix + "OfflineCache.", this.OfflineCache);
        this.setParamObj(map, prefix + "Quic.", this.Quic);
        this.setParamObj(map, prefix + "PostMaxSize.", this.PostMaxSize);
        this.setParamObj(map, prefix + "Compression.", this.Compression);
        this.setParamObj(map, prefix + "UpstreamHttp2.", this.UpstreamHttp2);
        this.setParamObj(map, prefix + "ForceRedirect.", this.ForceRedirect);
        this.setParamObj(map, prefix + "Https.", this.Https);
        this.setParamObj(map, prefix + "Origin.", this.Origin);
        this.setParamObj(map, prefix + "SmartRouting.", this.SmartRouting);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "ClientIpHeader.", this.ClientIpHeader);
        this.setParamObj(map, prefix + "CachePrefresh.", this.CachePrefresh);
        this.setParamObj(map, prefix + "Ipv6.", this.Ipv6);

    }
}

