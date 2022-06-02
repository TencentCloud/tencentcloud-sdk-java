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

public class DescribeZoneSettingResponse extends AbstractModel{

    /**
    * 缓存过期时间配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cache")
    @Expose
    private CacheConfig Cache;

    /**
    * 节点缓存键配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheKey")
    @Expose
    private CacheKey CacheKey;

    /**
    * 浏览器缓存配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxAge")
    @Expose
    private MaxAge MaxAge;

    /**
    * 离线缓存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OfflineCache")
    @Expose
    private OfflineCache OfflineCache;

    /**
    * Quic访问
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quic")
    @Expose
    private Quic Quic;

    /**
    * POST请求传输配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostMaxSize")
    @Expose
    private PostMaxSize PostMaxSize;

    /**
    * 智能压缩配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compression")
    @Expose
    private Compression Compression;

    /**
    * http2回源配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamHttp2")
    @Expose
    private UpstreamHttp2 UpstreamHttp2;

    /**
    * 访问协议强制https跳转配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForceRedirect")
    @Expose
    private ForceRedirect ForceRedirect;

    /**
    * Https 加速配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Https")
    @Expose
    private Https Https;

    /**
    * 源站配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Origin")
    @Expose
    private Origin Origin;

    /**
    * 动态加速配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SmartRouting")
    @Expose
    private SmartRouting SmartRouting;

    /**
    * 站点ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点域名
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * WebSocket配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebSocket")
    @Expose
    private WebSocket WebSocket;

    /**
    * 客户端IP回源请求头配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIpHeader")
    @Expose
    private ClientIp ClientIpHeader;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 缓存过期时间配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cache 缓存过期时间配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheConfig getCache() {
        return this.Cache;
    }

    /**
     * Set 缓存过期时间配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cache 缓存过期时间配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCache(CacheConfig Cache) {
        this.Cache = Cache;
    }

    /**
     * Get 节点缓存键配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheKey 节点缓存键配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CacheKey getCacheKey() {
        return this.CacheKey;
    }

    /**
     * Set 节点缓存键配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheKey 节点缓存键配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheKey(CacheKey CacheKey) {
        this.CacheKey = CacheKey;
    }

    /**
     * Get 浏览器缓存配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxAge 浏览器缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaxAge getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set 浏览器缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxAge 浏览器缓存配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxAge(MaxAge MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get 离线缓存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OfflineCache 离线缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OfflineCache getOfflineCache() {
        return this.OfflineCache;
    }

    /**
     * Set 离线缓存
注意：此字段可能返回 null，表示取不到有效值。
     * @param OfflineCache 离线缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOfflineCache(OfflineCache OfflineCache) {
        this.OfflineCache = OfflineCache;
    }

    /**
     * Get Quic访问
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quic Quic访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Quic getQuic() {
        return this.Quic;
    }

    /**
     * Set Quic访问
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quic Quic访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuic(Quic Quic) {
        this.Quic = Quic;
    }

    /**
     * Get POST请求传输配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostMaxSize POST请求传输配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PostMaxSize getPostMaxSize() {
        return this.PostMaxSize;
    }

    /**
     * Set POST请求传输配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostMaxSize POST请求传输配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostMaxSize(PostMaxSize PostMaxSize) {
        this.PostMaxSize = PostMaxSize;
    }

    /**
     * Get 智能压缩配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compression 智能压缩配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Compression getCompression() {
        return this.Compression;
    }

    /**
     * Set 智能压缩配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compression 智能压缩配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompression(Compression Compression) {
        this.Compression = Compression;
    }

    /**
     * Get http2回源配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamHttp2 http2回源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpstreamHttp2 getUpstreamHttp2() {
        return this.UpstreamHttp2;
    }

    /**
     * Set http2回源配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamHttp2 http2回源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamHttp2(UpstreamHttp2 UpstreamHttp2) {
        this.UpstreamHttp2 = UpstreamHttp2;
    }

    /**
     * Get 访问协议强制https跳转配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForceRedirect 访问协议强制https跳转配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ForceRedirect getForceRedirect() {
        return this.ForceRedirect;
    }

    /**
     * Set 访问协议强制https跳转配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForceRedirect 访问协议强制https跳转配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForceRedirect(ForceRedirect ForceRedirect) {
        this.ForceRedirect = ForceRedirect;
    }

    /**
     * Get Https 加速配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Https Https 加速配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Https getHttps() {
        return this.Https;
    }

    /**
     * Set Https 加速配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Https Https 加速配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttps(Https Https) {
        this.Https = Https;
    }

    /**
     * Get 源站配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Origin 源站配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Origin getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Origin 源站配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrigin(Origin Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 动态加速配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SmartRouting 动态加速配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartRouting getSmartRouting() {
        return this.SmartRouting;
    }

    /**
     * Set 动态加速配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param SmartRouting 动态加速配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSmartRouting(SmartRouting SmartRouting) {
        this.SmartRouting = SmartRouting;
    }

    /**
     * Get 站点ID 
     * @return ZoneId 站点ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID
     * @param ZoneId 站点ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点域名 
     * @return Zone 站点域名
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 站点域名
     * @param Zone 站点域名
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get WebSocket配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebSocket WebSocket配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebSocket getWebSocket() {
        return this.WebSocket;
    }

    /**
     * Set WebSocket配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebSocket WebSocket配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebSocket(WebSocket WebSocket) {
        this.WebSocket = WebSocket;
    }

    /**
     * Get 客户端IP回源请求头配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIpHeader 客户端IP回源请求头配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientIp getClientIpHeader() {
        return this.ClientIpHeader;
    }

    /**
     * Set 客户端IP回源请求头配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIpHeader 客户端IP回源请求头配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIpHeader(ClientIp ClientIpHeader) {
        this.ClientIpHeader = ClientIpHeader;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeZoneSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZoneSettingResponse(DescribeZoneSettingResponse source) {
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
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.WebSocket != null) {
            this.WebSocket = new WebSocket(source.WebSocket);
        }
        if (source.ClientIpHeader != null) {
            this.ClientIpHeader = new ClientIp(source.ClientIpHeader);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "WebSocket.", this.WebSocket);
        this.setParamObj(map, prefix + "ClientIpHeader.", this.ClientIpHeader);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

